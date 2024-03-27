package builder;

public class Home {
    private String city;
    private String district;
    private String neighbourhood;
    private int year;
    private int numbOfBath;
    private int numbOfRoom;
    private int numbOfTerrace;
    private boolean isStuffy;
    private boolean hasCarParking;
    private boolean hasChildPark;
    private boolean hasPool;
    public Home(){}

    public Home(String city, String district, String neighbourhood,int year, int numbOfBath, int numbOfRoom, int numbOfTerrace, boolean isStuffy, boolean hasCarParking, boolean hasChildPark, boolean hasPool) {
        this.city = city;
        this.district = district;
        this.neighbourhood = neighbourhood;
        this.numbOfBath = numbOfBath;
        this.numbOfRoom = numbOfRoom;
        this.numbOfTerrace = numbOfTerrace;
        this.isStuffy = isStuffy;
        this.hasCarParking = hasCarParking;
        this.hasChildPark = hasChildPark;
        this.hasPool = hasPool;
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public int getNumbOfBath() {
        return numbOfBath;
    }

    public void setNumbOfBath(int numbOfBath) {
        this.numbOfBath = numbOfBath;
    }

    public int getNumbOfRoom() {
        return numbOfRoom;
    }

    public void setNumbOfRoom(int numbOfRoom) {
        this.numbOfRoom = numbOfRoom;
    }

    public int getNumbOfTerrace() {
        return numbOfTerrace;
    }

    public void setNumbOfTerrace(int numbOfTerrace) {
        this.numbOfTerrace = numbOfTerrace;
    }

    public boolean isStuffy() {
        return isStuffy;
    }

    public void setStuffy(boolean stuffy) {
        isStuffy = stuffy;
    }

    public boolean isHasCarParking() {
        return hasCarParking;
    }

    public void setHasCarParking(boolean hasCarParking) {
        this.hasCarParking = hasCarParking;
    }

    public boolean isHasChildPark() {
        return hasChildPark;
    }

    public void setHasChildPark(boolean hasChildPark) {
        this.hasChildPark = hasChildPark;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return "Home{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", year=" + year +
                ", numbOfBath=" + numbOfBath +
                ", numbOfRoom=" + numbOfRoom +
                ", numbOfTerrace=" + numbOfTerrace +
                ", isStuffy=" + isStuffy +
                ", hasCarParking=" + hasCarParking +
                ", hasChildPark=" + hasChildPark +
                ", hasPool=" + hasPool +
                '}';
    }
}
