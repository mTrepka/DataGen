import com.mTrepka.dataGen.DataFactories;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
public class DataFactoriesTest {

    @Test
    void testNameWithoutSeed() {
        assertNotNull(DataFactories.getNameFactory().generateData(10));
    }
    @Test
    void testNameWithSeed() {
        long rand = new Random().nextLong();
        Object obj1 = DataFactories.getNameFactory().withSeed(rand).generateData(10);
        Object obj2 = DataFactories.getNameFactory().withSeed(rand).generateData(10);
        Object obj3 = DataFactories.getNameFactory().withSeed(rand+1).generateData(10);
        Object obj4 = DataFactories.getNameFactory().withSeed(rand+1).generateData(10);
        Object obj5 = DataFactories.getNameFactory().generateData(10);
        Object obj6 = DataFactories.getNameFactory().generateData(10);
        Arrays.asList(obj1,obj2,obj3,obj4,obj5,obj6).forEach(
                obj -> ((List) obj).stream().map(e -> new User((String)e)).forEach(
                        e -> assertNotEquals(((User) e).getName(),"")));

        assertFalse(new String().equals(""));//ex1
        assertTrue(new String().equals("")); //ex2 Above this these examples show us any object from these lists not null

        assertTrue(obj1.toString().equals(obj2.toString()));
        assertNotEquals(obj1.toString(),obj3.toString());
        assertEquals(obj3.toString(),obj4.toString());
        assertNotEquals(obj4.toString(),obj5.toString());
        assertNotEquals(obj5.toString(),obj6.toString());
    }
    class User{
        String name;

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}