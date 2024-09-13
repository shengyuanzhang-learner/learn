public class Car {
    String model;
    public int wheels;
    public Car(String m){//同样的名字就是构造函数
        this.model = m;
        this.wheels = 4;
    }
    public void drive(){
        if(this.wheels < 4){
            System.out.println(this.model + "no go vroom");
            return;
        }
            System.out.println(this.model + "go vroom");
    }
    public int getNumwheels(){
        return wheels;
    }
    public void driveIntoDitch(int wheelsLost){
        this.wheels = this.wheels - wheelsLost;
    }
    public static void main(String[] args){
        Car c1;
        Car c2;
        c1 = new Car("111");
        c2 = new Car("222");
        c1.drive();
        c1.driveIntoDitch(2);
        c1.drive();
    
    }
}
