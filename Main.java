
class box{
  int height;
  int length;
  int width;
  
}
class Main {
  public static void main(String[] args) {
    box obj1= new box();
    box obj2= new box();
    obj1.height =1;
    obj1.width=2 ;
    obj2.length=1;
    obj2=obj1;
    
    System.out.println(obj2.height);
  }
}