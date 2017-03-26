package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest {
	triangle temp1 = new triangle();
	triangle temp2 = new triangle();
	triangle temp3 = new triangle();
	triangle temp4 = new triangle();
	

    @Test
    public void testTriangle() {
        assertEquals("equilateral triangle",temp1.triangles(1,1,1));
        assertEquals("isosceles triangle",temp2.triangles(2,2,3));
        assertEquals("not triangle",temp3.triangles(1,2,3));
        assertEquals("scalene triangle",temp4.triangles(2,3,4));
    }

}