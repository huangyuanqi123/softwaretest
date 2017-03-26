package junittest;

public class triangle {
	public  String triangles (int a, int b, int c){
        if(a+b > c && a+c > b && b+c > a){
        if (a == b && b == c)
            return "equilateral triangle";
        else if (a == b || b == c || c == a)
            return "isosceles triangle";
        else
            return "scalene triangle";
            
        }
        else
        return "not triangle";
	}
}
