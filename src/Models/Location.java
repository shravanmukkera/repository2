package Models;

public class Location
{
    private String location;
    private String country;

    public Location(String location, String country) {
        this.location = location;
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
