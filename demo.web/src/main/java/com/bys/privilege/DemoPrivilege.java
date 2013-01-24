package com.bys.privilege;

import com.alibaba.imt.adapter.privileges.ImtPrivilege;

public class DemoPrivilege implements ImtPrivilege{

	public boolean authUser() {
		return true;
	}

}
