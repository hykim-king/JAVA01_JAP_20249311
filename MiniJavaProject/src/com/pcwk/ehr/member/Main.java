package com.pcwk.ehr.member;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pcwk.ehr.cmn.Box;
import com.pcwk.ehr.cmn.PLog;

import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

public class Main implements PLog {

	MemberDTO member01;
	MemberDTO member02;
	MemberDTO member03;
	
	Box<MemberDTO> box;
	
	public Main() {
		member01 = new MemberDTO("james01", "이상무01", "a4321", "james01@naver.com", "010-1234-5678", "2024-04-19", "admin");
		member02 = new MemberDTO("james02", "이상무02", "a4321", "james02@naver.com", "010-1234-5679", "2024-04-19", "admin");
		member03 = new MemberDTO("james03", "이상무03", "a4321", "james03@naver.com", "010-1234-5680", "2024-04-19", "admin");
		
		box = new Box<MemberDTO>();
		box.add(member01);
		box.add(member02);
		box.add(member03);
	}
	
	/**
	 * 객체 to JSON
	 * @param fileName
	 * @return
	 */
	public int saveToJson(String fileName) {
		int count = 0;
		
		//PrettyPrinting된 JSON생성
		Gson  gson =new GsonBuilder().setPrettyPrinting().create();
		
		try(FileWriter  writer=new FileWriter(fileName)){
			
			gson.toJson(box, writer);
			
			count = box.getListBox().size();
		}catch(IOException e) {
			LOG.debug("IOException:"+e.getMessage());
			count = 0;
		}
		LOG.debug(fileName +" 파일 생성!");	
		
		return count;
	}
	
	
	public Box<MemberDTO> jsonToObject(String fileName) {
		Box<MemberDTO> list = null;
		
		try(FileReader fr=new FileReader(fileName)){
			
			//Gson객체 생성
			Gson gson=new Gson();
			// JSON 데이터를 Box<MemberDTO> 클래스로 변환
	        Type type = new TypeToken<Box<MemberDTO>>() {}.getType();
			
			list = gson.fromJson(fr, type);
		}catch(IOException e) {
			LOG.debug("IOException:"+e.getMessage());
		}
		
		
		return list;
	}
	
	
	public static void main(String[] args) {
		//int count = new Main().saveToJson("member.json");
		//LOG.debug("저장 건수:"+count);

		
		Box<MemberDTO> boxList= new Main().jsonToObject("member.json");
		List<MemberDTO> list = boxList.getListBox();
		
		for(int i=0;i<list.size();i++) {
			MemberDTO member = list.get(i);
			LOG.debug(member.getName());
		}
		
	}

}
