package pojos;

import java.util.List;

public class addFacultyMain {
	private addFaculty facultyDetails;
	private List<addAddress> facultyAddress;

	public addFaculty getFacultyDetails() {
		return facultyDetails;
	}

	public void setFacultyDetails(addFaculty facultyDetails) {
		this.facultyDetails = facultyDetails;
	}

	public List<addAddress> getFacultyAddress() {
		return facultyAddress;
	}

	public void setFacultyAddress(List<addAddress> facultyAddress) {
		this.facultyAddress = facultyAddress;
	}
}
