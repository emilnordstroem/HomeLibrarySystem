package application.model.utilities;

public class Address {
    private String streetName;
    private String buildingNo;
    private String postalCode;

    public Address(String streetName, String buildingNo, String postalCode){
        this.streetName = streetName;
        this.buildingNo = buildingNo;
        this.postalCode = postalCode;
    }
}
