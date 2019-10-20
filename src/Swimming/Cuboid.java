package Swimming;

public class Cuboid extends RectAngle{
	double hight;

	public Cuboid(double width, double length, double hight) {
		super(width, length);
		this.hight = hight;
	}
	public void setHight(double hight) {
		if(hight<0) {
			this.hight=0.0;
		}else {
			this.hight=hight;
		}
	}
	public double getHight() {
		return hight;
	}
	public double getVolume() {
		double vol=getArea()*getHight();
		return vol;
	}

}
