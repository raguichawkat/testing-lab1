import org.junit.Test;
import static org.junit.Assert.*;


public class watermelonTest {
    @Test
    public void test1(){
        var x =new watermelon();
        assertEquals("YES",x.check_even(60));
    }
    @Test
    public void test2(){
        var x =new watermelon();
        assertEquals("NO",x.check_even(33));
    }
    @Test
    public void test3(){
        var x =new watermelon();
        assertEquals("NO",x.check_even(0));
    }
    @Test
    public void test4(){
        var x =new watermelon();
        assertEquals("NO",x.check_even(-7));
    }

}