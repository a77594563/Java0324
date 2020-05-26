package test;

import com.study.d18.CheckSex;
import org.junit.Test;

public class TestCheckSex {
   
    @Test
    public void test() {
        // Arrange
        CheckSex cs = new CheckSex();
        String id = "A1223344556";
        String excepted  = "男生"; //期望
        // Act
        String act = cs.getSexByID(id);
        // Assert
        assert (excepted.equals(act)) : excepted + " == " + act;
        System.out.println("Pass");
    }
}
