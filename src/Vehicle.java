public class Vehicle {


    private String circele;
    private String color;
    private String type;


    public String getCircele() {
        return circele;
    }

    public void setCircele(String circele) {
        this.circele = circele;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void print (String str){
        System.out.println(str);
    }

    public static void main(String args[]){
        Vehicle obj =new Vehicle();
        obj.print("hello");
        Truck obj1 = new Truck();
        obj1.print("welcome ");//Overridding object
        obj1.methods();
        Vehicle obj2=new Car();
        TruckTrainer obj3=new TruckTrainer();
        obj3.train(obj2);
    }
}
