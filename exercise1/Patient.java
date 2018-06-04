public class Patient {
    private int patientId;
    private String fName;
    private String lName;
    private String address;
    private String city;
    private String province;
    private String pCode;
// end variables
    public int getPatientId() {
        return this.patientId;
    }

    public void setPatientId(int id) {
        this.patientId = id;
    }
    public String getFName() {
        return this.fName;
    }

    public void setfName(String fName) {
        this. fName= fName;
    }
    public String getLName() {
        return this.lName;
    }

    public void setLName(String lName) {
        this. lName= lName;
    }
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this. address= address;
    }
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this. city= city;
    }
    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this. province= province;
    }
    public String getpCode() {
        return this.pCode;
    }

    public void setpCode(String pCode) {
        this. pCode= pCode;
    }
// end property

public Patient (int id, String fName, String lName,String address,String city, String province, String pCode) {
    this.patientId = id;
    this.fName = fName;
    this.lName = lName;
    this.address = address;
    this.city = city;
    this.province = province;
    this.pCode = pCode;
}
    // end constructor

public Patient(){

    }

    // end default constructor

    public String getPatientInfo () {
        String patientData = "Patient ID: " + patientId + "\n"+"First Name: "+ fName + "\n" +"Last Name: " +lName +"\n"
                + "Address: " + address +"\n" + "City: "+ city+"\n" + "Province: "+ province +"\n"+ "Postal Code: "+ pCode;
        return  patientData;
    }
// end of method


}

