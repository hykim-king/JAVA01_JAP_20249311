package com.pcwk.ehr04;

import java.util.ArrayList;

import com.pcwk.ehr.cmn.DTO;
import com.pcwk.ehr.cmn.PcwkLog;

public interface WorkDiv extends PcwkLog {

	public ArrayList doRetrieve(DTO search);
	
	public int doSave(DTO param);
	
	public int doUpdate(DTO param);
	
	public int doDelete(DTO param);
	
	public DTO doSelectOne(DTO param);
}
