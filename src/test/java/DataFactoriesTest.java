import com.mTrepka.dataGen.DataFactories;
import com.mTrepka.dataGen.DataFactory;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
class DataFactoriesTest {

    @Test
    void testNameWithoutSeed() {
        assertNotNull(DataFactories.getNameFactory().generateData(10));
    }


    private void defaultFactoriesTest(Method method)throws Exception{

        long rand = new Random().nextLong();
        Object obj1 = ((DataFactory)method.invoke(null)).withSeed(rand).generateData(10);
        Object obj2 = ((DataFactory)method.invoke(null)).withSeed(rand).generateData(10);
        Object obj3 = ((DataFactory)method.invoke(null)).withSeed(rand+1).generateData(10);
        Object obj4 = ((DataFactory)method.invoke(null)).withSeed(rand+1).generateData(10);
        Object obj5 = ((DataFactory)method.invoke(null)).generateData(10);
        Object obj6 = ((DataFactory)method.invoke(null)).generateData(10);
        assertEquals(obj1.toString(),obj2.toString());
        assertNotEquals(obj1.toString(),obj3.toString());
        assertEquals(obj3.toString(),obj4.toString());
        assertNotEquals(obj4.toString(),obj5.toString());
        assertNotEquals(obj5.toString(),obj6.toString());
        assertNotNull(((DataFactory) method.invoke(null)).getSingle());
    }
    @Test
    void automatedTest()throws Exception{
        defaultFactoriesTest(DataFactories.class.getMethod("getNameFactory"));
        defaultFactoriesTest(DataFactories.class.getMethod("getAdressFactory"));
    }

    @Test
    void simpleTest(){
        DataFactories.getAdressFactory();
    }

    @Test
    void testToNumber(){
        Random random = new Random();
        int l;
        l =random.nextInt(1000);
            while(l==0) l =random.nextInt(1000);
       assertEquals(DataFactories.to(l).size(),l+1);
       assertEquals(DataFactories.to(0,l).size(),l+1);
    }
}