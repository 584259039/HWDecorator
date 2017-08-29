
public class Soy extends CondimentDecorator {
	Beverage beverage;
	public  Soy (Beverage beverage){
		this.beverage =  beverage;}
	
		// TODO Auto-generated constructor stub
	
	@Override
	public String getDescription1() {
		// TODO Auto-generated method stub
		return beverage.getDescription1()+",Soy";
	}
	public  double cost(){
		return 0.65+beverage.cost();
}
}