/**
 * Package Name : com.pcwk.ehr.t01 <br>
 * Class Name   : ImageFileTypeDetector.java <br>
 * Description  : <br>
 * Modification information :
 *------------------------------------------------
 * 최초 생성일          : 2024-03-27<br>
 *
 *
 *------------------------------------------------
 * author : acorn
 * version: 0.5
 * see    : <br>
 * Copyright (C) by PCWK All right reserved.
 */
package com.pcwk.ehr.t01;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author acorn
 *
 */
public class ImageFileTypeDetector {

    public static void main(String[] args) {
        String filePath = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J13\\src\\com\\pcwk\\ehr\\t01\\jpgImage.jpg"; // 이미지 파일 경로 설정

        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            byte[] header = new byte[4];
            int bytesRead = inputStream.read(header);
            System.out.println("bytesRead:"+bytesRead);	
            if (bytesRead == 4) {
                if (isJPEG(header)) {
                    System.out.println("JPEG 이미지 파일입니다.");
                } else if (isPNG(header)) {
                    System.out.println("PNG 이미지 파일입니다.");
                } else if (isGIF(header)) {
                    System.out.println("GIF 이미지 파일입니다.");
                }else if (isBMP(header)) {
                    System.out.println("BMP 이미지 파일입니다.");
                } else {
                    System.out.println("이미지 파일이 아닙니다.");
                }
            } else {
                System.out.println("파일 크기가 너무 작습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    // BMP 헤더 확인
    private static boolean isBMP(byte[] header) {
    	
        return (header[0] == (byte) 0x42 && header[1] == (byte) 0x4D);
    }
    
    // GIF 헤더 확인
    private static boolean isGIF(byte[] header) {
        return (header[0] == (byte) 0x47 && header[1] == (byte) 0x49 && 
        		header[2] == (byte) 0x46 && (header[3] == (byte) 0x38 || header[3] == (byte) 0x39));
    }
    

    // JPEG 헤더 확인
    private static boolean isJPEG(byte[] header) {
    	System.out.println((byte)header[0]+","+(byte)header[1]);
        return (header[0] == (byte) 0xFF && header[1] == (byte) 0xD8 &&
                header[2] == (byte) 0xFF && header[3] == (byte) 0xE0);
    }
  
    // PNG 헤더 확인
    private static boolean isPNG(byte[] header) {
    	
        return (header[0] == (byte) 0x89 && header[1] == (byte) 0x50 &&
                header[2] == (byte) 0x4E && header[3] == (byte) 0x47);
    }
}
