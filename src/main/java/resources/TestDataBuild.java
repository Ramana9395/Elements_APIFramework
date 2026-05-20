package resources;

import java.util.Arrays;

import pojos.addAddress;
import pojos.addFaculty;
import pojos.addFacultyMain;

public class TestDataBuild 
{
	
	public addFacultyMain addFacultyPayload(String fname,String lname,String mname)
	{
		addFaculty facultyadd = new addFaculty();
		facultyadd.setFacultyID(0);
		facultyadd.setFirstName(fname);
		facultyadd.setLastName(lname);
		facultyadd.setMiddleName(mname);
		facultyadd.setFacultySSN("123456");
		facultyadd.setDepartmentID(0);
		facultyadd.setCampusID(0);
		facultyadd.setSalutation("");
		facultyadd.setActive(true);
		facultyadd.setShowOnDirectory(false);
		facultyadd.setPercentTimeTeaching(0);
		facultyadd.setPersonalLink("");
		facultyadd.setNotes("");
		facultyadd.setFacultyTypeID(0);
		facultyadd.setCurrentLoad(0);
		facultyadd.setMaxLoad(99);
		facultyadd.setInitialApp(null);
		facultyadd.setInitialAppTo(null);
		facultyadd.setHireStatusID(0);
		facultyadd.setWorkStatusID(0);
		facultyadd.setTenureTypeID(0);
		facultyadd.setFacultyTitle("");
		facultyadd.setEmployeeID("");
		facultyadd.setFacultySuffix("");

		addAddress address = new addAddress();
		address.setAddressTypeId(286);
		address.setAddress1("Test Address");
		address.setAddress2("");
		address.setAddress3("");
		address.setCity("");
		address.setCounty("");
		address.setStateId(0);
		address.setZipCode("");
		address.setEmail1("");
		address.setPhone1("");
		address.setPhone2("");
		address.setActive(1);
		address.setAddressCategory(false);
		address.setWorkPhone1("");
		address.setMobilePhone("");
		address.setEmail2("");
		address.setEmail3("");
		address.setFax1("");
		address.setCountryId(0);
		address.setTown("");
		address.setInsertUserId("test t");
		address.setActiveFlag("Yes");
		address.setAddressTypeText("Father");

		addFacultyMain request = new addFacultyMain();
		request.setFacultyDetails(facultyadd);
		request.setFacultyAddress(Arrays.asList(address));
		
		return request;
	}
	
	
}
