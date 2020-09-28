package by.academy.classwork.lesson18;

import java.io.Serializable;

public class PrivilegedCustomer extends Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int privilegeAccountNo;

	public PrivilegedCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrivilegedCustomer(int privilegeAccountNo) {
		super();
		this.privilegeAccountNo = privilegeAccountNo;
	}

	public int getPrivilegeAccountNo() {
		return privilegeAccountNo;
	}

	public void setPrivilegeAccountNo(int privilegeAccountNo) {
		this.privilegeAccountNo = privilegeAccountNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + privilegeAccountNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrivilegedCustomer other = (PrivilegedCustomer) obj;
		if (privilegeAccountNo != other.privilegeAccountNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PrivilegedCustomer [privilegeAccountNo=" + privilegeAccountNo + "]";
	}

}
