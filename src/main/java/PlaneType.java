public enum PlaneType {
    BOEING747("Boeing 747", 524, "183,500 kg"),
    BOEING767("Boeing 767", 216, "204,120 kg"),
    AIRBUSA330("Airbus A330", 260, "181,840 kg");

    private final String type;
    private final int capacity;
    private final String totalWeight;
    PlaneType(String type, int capacity, String totalWeight){
        this.type = type;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getTotalWeight() {
        return totalWeight;
    }
}
