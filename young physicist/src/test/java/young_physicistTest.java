import org.junit.Test;

import static org.junit.Assert.*;

public class young_physicistTest {
    @Test
    public void test1(){
        var x=new young_physicist();
        assertEquals("YES",x.idle(0,0,0));
    }
    @Test
    public void test2(){
        var x=new young_physicist();
        assertEquals("NO",x.idle(2,5,-3));
    }

}