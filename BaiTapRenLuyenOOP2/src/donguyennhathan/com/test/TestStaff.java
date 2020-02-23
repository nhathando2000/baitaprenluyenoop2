package donguyennhathan.com.test;

import donguyennhathan.com.model.Employee;
import donguyennhathan.com.model.Executive;
import donguyennhathan.com.model.Staff;

public class TestStaff {

	public static void main(String[] args) {
		Staff st= new Staff();
		Employee teo = new Employee();
		teo.setName("Nguyễn Văn Tèo");
		teo.setAdress("Quận 1");
		teo.setPhone("123");
		teo.setPayRate(0.12);
		teo.setSocialSecurityNumber("SEC123");		
		st.addStaffMember(teo);
		
		Employee ty = new Employee();
		ty.setName("Đỗ Nhật Tý");
		ty.setAdress("Quận 4");
		ty.setPhone("456");
		ty.setPayRate(0.15);
		ty.setSocialSecurityNumber("SEC456");
		st.addStaffMember(ty);
		
		Executive an = new Executive();
		an.setName("Hồ Văn An");
		an.setAdress("Quận 2");
		an.setPhone("789");
		an.setPayRate(0.17);
		an.setSocialSecurityNumber("SEC789");
		an.awardBonus(100);
		st.addStaffMember(an);
		
		st.payDay();
	}

}
