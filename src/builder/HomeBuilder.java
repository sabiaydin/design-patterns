package builder;

public class HomeBuilder {
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
    //not optional fields,mandatory
    public static HomeBuilder startBuild(String city,String district,String neighbourhood,int year,int numbOfRoom){
        HomeBuilder homeBuilder=new HomeBuilder();
        homeBuilder.city=city;
        homeBuilder.district=district;
        homeBuilder.neighbourhood=neighbourhood;
        homeBuilder.year=year;
        homeBuilder.numbOfRoom=numbOfRoom;
        return homeBuilder;
    }
    public Home build(){
       Home home=new Home();

       home.setCity(city);
       home.setDistrict(district);
       home.setNeighbourhood(neighbourhood);
       home.setYear(year);
       home.setNumbOfRoom(numbOfRoom);
       home.setNumbOfBath(numbOfBath);
       home.setNumbOfTerrace(numbOfTerrace);
       home.setStuffy(isStuffy);
       home.setHasCarParking(hasCarParking);
       home.setHasChildPark(hasChildPark);
       home.setHasPool(hasPool);

       return home;
    }



    public HomeBuilder setNumbOfBath(int numbOfBath) {
        this.numbOfBath = numbOfBath;
        return this;
    }
        public HomeBuilder setNumbOfTerrace(int numbOfTerrace) {
        this.numbOfTerrace = numbOfTerrace;
        return this;
    }

    public HomeBuilder setStuffy(boolean stuffy) {
        isStuffy = stuffy;
        return this;
    }

    public HomeBuilder setHasCarParking(boolean hasCarParking) {
        this.hasCarParking = hasCarParking;
        return this;
    }

    public HomeBuilder setHasChildPark(boolean hasChildPark) {
        this.hasChildPark = hasChildPark;
        return this;
    }

    public HomeBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }
}
