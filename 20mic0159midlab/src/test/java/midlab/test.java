package midlab;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
    @Test
    public void logtest1() {
        app obj = new app();
        Assert.assertEquals(0, obj.log("krishna", 47));
    }

    @Test
    public void logtest2() {
        app obj = new app();
        Assert.assertEquals(1, obj.log("ram", 3025));
    }
}