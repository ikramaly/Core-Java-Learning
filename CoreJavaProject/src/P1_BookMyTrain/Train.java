package P1_BookMyTrain;

public class Train {
    // firstly we should be identified what functions should be
    //available in the train.

    private int trainid;
    private String name;
    private String source;
    private String destination;
    private int totalSeats;
    private int avaliableSeats;//

    public Train(int trainid, String name, String source, String destination, int totalSeats) {
        this.trainid = trainid;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.avaliableSeats = totalSeats;// there is no requirement in the const bcz
        // when we will create object every time new train app create, it means new train me
        // sabhi seats khaali hogi isi wajh se totalseats = avaliableseats.

    }

    public int getTrainid() {
        return trainid;
    }

    public void setTrainid(int trainid) {
        this.trainid = trainid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvaliableSeats() {
        return avaliableSeats;
    }

    public void setAvaliableSeats(int avaliableSeats) {
        this.avaliableSeats = avaliableSeats;
    }

    // user se puchege ke usko kitni seat book karni hai.
    public boolean bookSeats(int count){
        if (count<=avaliableSeats){
            avaliableSeats-=count;
            return true;
        }
        return false;
    }
    // agr booking cancel karni ho
    public void cancelSeats(int count){
        avaliableSeats+=count;
    }

    @Override
    public String toString() {
        return trainid+" | "+name+" | "+source+" --> "+" Seats Available : "+avaliableSeats;
    }

    public static void main(String[] args) {

    }
}
