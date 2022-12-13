package POO.coleccciónDeZapato.zapatos;

public class Zapatos{
    private String reference;
    private Integer size;
    private String color;
    private String brand;

    public Zapatos(){

    }

    public Zapatos(String reference,Integer size, String color, String brand ){
        this.reference = reference;
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    public String getreference(){
        return reference;
    }
    public void setreference(String reference){
        this.reference = reference;
    }

    public Integer getsize(){
        return size;
    }
    public void setsize(Integer size){
        this.size = size;
    }

    public String getcolor(){
        return color;
    }
    public void setcolor(String color){
        this.color = color;
    }

    public String getbrand(){
        return brand;
    }
    public void setbrand(String brand){
        this.brand = brand;
    }
}
