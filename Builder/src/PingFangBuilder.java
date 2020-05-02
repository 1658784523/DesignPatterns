public class PingFangBuilder implements HouseBuilder {
    House house=new House();
    public void makeFloor(){
        house.setFloor("平房-->地板");
    };
    public void makeWall(){
        house.setWall("平房-->墙");
    };
    public void makeHousetop(){
        house.setHousetop("平房-->房顶");
    };

    @Override
    public House getHouse() {
        return house;
    }
}
