package test;

public class Model {
	
	private String firstName;
	private String lastName;
	private String designation;
	private String salary;
	private String address;
	private String gender;
	private String age;
	private String maritalStatus;
	private String Stringerests;
	
	
	public Model(String firstName, String lastName, String designation, String salary, String address, String gender, String age, String maritalStatus, String Stringerests) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.maritalStatus = maritalStatus;
		this.Stringerests = Stringerests;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getStringerests() {
		return Stringerests;
	}
	public void setStringerests(String Stringerests) {
		this.Stringerests = Stringerests;
	}

	@Override
	public String toString() {
		return "Model [firstName=" + firstName + ", lastName=" + lastName + ", designation=" + designation + ", salary="
				+ salary + ", address=" + address + ", gender=" + gender + ", age=" + age + ", maritalStatus="
				+ maritalStatus + ", Stringerests=" + Stringerests + "]";
	}
	
}
