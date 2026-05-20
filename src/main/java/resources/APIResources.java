package resources;

public enum APIResources 
{
	AddFacultyAPI("/api/manager/faculty-maintenance/facultyDetails"),
	deleteFacultyAPI("api/manager/faculty-maintenance/faculty/{facultyID}");

    private String resource;

    APIResources(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }
}
