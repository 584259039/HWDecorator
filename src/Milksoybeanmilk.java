
public class Milksoybeanmilk {
	Beverage beverage;
	public static void main(String[] args) {

 
	
 Beverage s2 = new SoyBeanmilktea();
 s2 = new Jelly(s2);
 
 
 System.out.println(s2.getDescription1() +" $"+s2.cost());	

 Beverage s3 = new SoyBeanmilktea();
 s3 = new Jelly(s3);
 s3 = new Cerealgrain(s3);
 
 System.out.println(s3.getDescription1() +" $"+s3.cost()); 


 Beverage s4 = new SoymilkGreentea();
 s4 = new Jelly(s4);
 s4 = new Cerealgrain(s4);
 s4 = new Soy(s4);
 System.out.println(s4.getDescription1() +" $"+s4.cost()); 
 
}
}
