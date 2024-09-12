class a {
  public void display(){
    System.out.println("Hello From Base");
  }
}
class b extends a{
  
  public void print(){
     System.out.println("Hello From Derived");
  }
class jp3{
  public static void main(String [] args){
     b obj = new b();
        obj.display(); 
        obj.print();   
  }
}
