
public class Cerealgrain extends CondimentDecorator {
	Beverage beverage;
	public  Cerealgrain (Beverage beverage){
		this.beverage =  beverage;}
	
		// TODO Auto-generated constructor stub
	
	@Override
	public String getDescription1() {
		// TODO Auto-generated method stub
		return beverage.getDescription1()+",Cerealgrain";
	}
	public  double cost(){
		return 0.55+beverage.cost();
}
}