package Gift;

public class Jellybeans implements Sweets{
    String name;
    int weight;
    int price;
    String additionalInfo;

    public Jellybeans(String name, int weight, int price, String additionalInfo){
        this.name =name;
        this.weight = weight;
        this.price = price;
        this.additionalInfo = additionalInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAdditionalInfo(){
        return additionalInfo;
    }

    public void  setAdditionalInfo(String additionalInfo){
        this.additionalInfo = additionalInfo;
    }
}