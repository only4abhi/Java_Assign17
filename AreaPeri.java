package AbstractPack;

abstract class AreaPerim{  
	
	  double dim1 = 3.14;
	  abstract void findArea();
	  abstract void findPerimeter();


}  

class Circle extends AreaPerim{
	
	int radious;double area,perimeter;
	
	double area(int r){	
		radious = r;
		area = dim1*(r*r);
		return area;
	}
	
	public void findArea(){
		System.out.println ("Circle Area= "+area);
	}
	
	double perimeter(int r){	
		radious = r;
		perimeter = 2*dim1*r;
		return perimeter;
	}
	
	
	public void findPerimeter(){
		System.out.println ("Circle Perimeter= "+perimeter);
	}
}

////////////////////////////////////////////////////////////////////////////////

class Rectangle extends AreaPerim{
	
	int length,width;double area,perimeter;
	
	double area(int l,int w){	
		length = l;width = w;
		area = (l*w);
		return area;
	}
	
	public void findArea(){
		System.out.println ("Rectangle Area= "+area);
	}
	
	double perimeter(int l,int w){	
		length = l;width = w;
		perimeter = 2*(l+w);
		return perimeter;
	}
	
	
	public void findPerimeter(){
		System.out.println ("Rectangle Perimeter= "+perimeter);
	}
}


/////////////////////////////////////////////////////////////////////////////////


class Triangle extends AreaPerim{
	
	int side,base,height;double area,perimeter;
	
	double area(int base,int height){	
		this.base = base;this.height=height;
		area = (base*height)/2;
		return area;
	}
	
	public void findArea(){
		System.out.println ("Triangle Area= "+area);
	}
	
	double perimeter(int side,int base,int height){	
		this.side = side;this.base = base;this.height=height;
		perimeter = (side+base+height);
		return perimeter;
	}
	
	
	public void findPerimeter(){
		System.out.println ("Triangle Perimeter= "+perimeter);
	}
}



public class AreaPeri {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		//AreaPerim c12 = new Circle();

		Rectangle r1 = new Rectangle();
		Triangle t1 = new Triangle();

		c1.area(10);c1.findArea();
		c1.perimeter(10);c1.findPerimeter();
		
		r1.area(40,10);r1.findArea();
		r1.perimeter(40,10);r1.findPerimeter();
		
		t1.area(10,30);t1.findArea();
		t1.perimeter(10,30,20);t1.findPerimeter();
		
		
	}

}



