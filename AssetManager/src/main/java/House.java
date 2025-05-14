public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() { return address; }
    public int getCondition() { return condition; }
    public int getSquareFoot() { return squareFoot; }
    public int getLotSize() { return lotSize; }

    public void setAddress(String address) { this.address = address; }
    public void setCondition(int condition) { this.condition = condition; }
    public void setSquareFoot(int squareFoot) { this.squareFoot = squareFoot; }
    public void setLotSize(int lotSize) { this.lotSize = lotSize; }

    @Override
    public double getValue() {
        double rate;
        switch (condition) {
            case 1: rate = 180.0; break;
            case 2: rate = 130.0; break;
            case 3: rate = 90.0; break;
            case 4: rate = 80.0; break;
            default: rate = 80.0; break;
        }
        return (squareFoot * rate) + (lotSize * 0.25);
    }
}