public class Square {
  private double side;
  public final int MAX_SIDE_LENGTH=10;
  public Square(double theSide){
    side=theSide;
  }
  public void setSide(double theSide){
    if(theSide<=MAX_SIDE_LENGTH&&theSide>=0){
      side=theSide;
  }else{
    System.out.println("You cannot set the side length to this value.");
  }
  }
  public double getSide(){
    return side;
  }
  public String toString(){
    return "Square with side length = " + side;
  }
  public double area(){
    double area=side*side;
    return area;
  }
  public double diagonal(){
    double diagonal=Math.sqrt(2*area());
    return diagonal;
  }
}
