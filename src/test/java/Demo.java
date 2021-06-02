import org.assertj.core.api.AbstractCharSequenceAssert;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;

@DisplayName("Example")
class Demo {


    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }

    @Test
    @DisplayName("Email checking")
    void emailChecking(){
        String email1 = "abc@gmail.com";
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        assertThat(email1).matches(regex);
    }


    @Test
    @DisplayName("Weight checking")
    void weightChecking(){
        float w = 53.5f;
        assertThat(w).isBetween(0f, 200f);
    }


//    @Test
//    @DisplayName("Identify number checking")
//    void identifyNumberChecking(){
//        String [] identify = new String[]{"123456789", "876545267", "", "675237890d", "123456788"};
//        for(int i =0; i < identify.length; i++){
//            assertThat(identify).
//        }
//    }
}