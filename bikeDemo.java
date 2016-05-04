
//playing with java classes

interface cool{
  public void isItCool();
  public void isItSafe();
}

class bike implements cool{
  int speed;
  int gear;

  void changeGear(int n){
    gear = n;
  }
  void changeSpeed(int p){
    speed =p;
  }
  void printState(){
    System.out.println("speed: "+speed+" gear: "+gear);
  }
  public void isItCool(){
    System.out.println("no");
  }
  public void isItSafe(){
    System.out.println("yes");
  }
}


class mtnBike extends bike {
  void shred(){
    System.out.println("You can shrd");
  }
  // public void isItCool(){
  //   System.out.println("yes");
  // }
  // public void isItSafe(){
  //   System.out.println("no");
  // }

}

public class bikeDemo{

  public static void main(String[] args){
    bike b1 = new bike();
    bike b2 = new bike();
    mtnBike gnar = new mtnBike();

    b1.changeSpeed(2);
    b1.changeGear(3);
    b1.printState();

    gnar.shred();
    gnar.isItCool();
  }
}
