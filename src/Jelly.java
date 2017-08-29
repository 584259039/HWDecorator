
public class Jelly extends CondimentDecorator {
	Beverage beverage;
	public  Jelly (Beverage beverage){
		this.beverage =  beverage;}
	
		// TODO Auto-generated constructor stub
	
	@Override
	public String getDescription1() {
		// TODO Auto-generated method stub
		return beverage.getDescription1()+",Jelly";
	}
	public  double cost(){
		return 0.5+beverage.cost();
}
}