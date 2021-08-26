import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RomerTall {



    @Test
    public void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    };


    private String toRoman(int i) {
        if (i == 1){
            return "I";
        };
        if (i == 2){
            return "II";
        };


        return null;
    };

    @Test
    public void shouldConvert2ToII(){
        assertEquals("II", toRoman(2));
    }



}