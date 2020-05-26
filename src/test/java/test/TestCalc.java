package test;

import com.study.d18.Calc;
import org.junit.Test;

public class TestCalc {
    
    @Test
    public void test() {
        // 3A Arrange Act Assert
        // Arrange
        Calc calc = new Calc();
        int x = 5;
        int y = 10;
        int excepted = 15; //期望
        // Act
        int act = calc.add(x, y);
        // Assert
        assert(excepted == act): excepted +" == " + act;
        
        System.out.println("Pass");
    }
}
