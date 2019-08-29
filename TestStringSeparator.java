package tests;

import org.testng.annotations.Test;

public class TestStringSeparator extends StringSplitter {

    @Test(priority = 0)
    public void SingleSeparator() {
        String str = "foo.bar#baz";
        new StringSplitter(Separator.PERIOD.toString()).split(str);
    }


    @Test(priority=1)
    public void moreThanOneSeparator (){
        String str = "foo.bar#baz";
        new StringSplitter(Separator.PERIOD.toString(),
                            Separator.HASH.toString())
                            .split(str);
    }
}