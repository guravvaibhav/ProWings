package my_first_prg;


class Box{
int l,b,h,v;
Box(){
l=5;
b=3;
h=4;
}
Box(int l,int b,int h){
this.l=l;
this.b=b;
this.h=h;
}
void display(){
System.out.println("length is: "+l);
System.out.println("breadth is: "+b);
System.out.println("height is: "+h);
}

public void volume(){
v=l*b*h;
System.out.println("volume of box is : "+v);
}
}
public class ConstructorDemo1{
public static void main(String []args){
Box b1=new Box();
b1.display();
b1.volume();

Box b2=new Box(10,5,7);
b2.display();
b2.volume();

}
}