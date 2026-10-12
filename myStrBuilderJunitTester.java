import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

import org.junit.function.ThrowingRunnable;
import org.junit.rules.ExpectedException;

public class myStrBuilderJunitTester {
    // Constructor tests
    @Test(timeout = 200)
    public void atestMyStringBuilder(){
        MyStrBuilder one = new MyStrBuilder();
        char[] r = new char[16];
        String res = Arrays.toString(r);
        String a = Arrays.toString(one.getData());
        assertEquals(res, a);
    }
    @Test(timeout=200)
    public void atestMyStringBuilderLengthCheck() {
        MyStrBuilder one = new MyStrBuilder();
        assertEquals(0, one.length());
    }
    @Test(timeout=200)
    public void atestMyStringBuilderCapacityCheck(){
        MyStrBuilder one = new MyStrBuilder();
        assertEquals(16, one.capacity());
    }
    @Test(timeout = 200)
    public void testMyStringBuilder2(){
        MyStrBuilder two = new MyStrBuilder(7);
        char[] r = new char[7];
        String re = Arrays.toString(r);
        String c = Arrays.toString(two.getData());
        assertEquals(re, c);
    }
    @Test(timeout = 200)
    public void testMyStringBuilderTwoLengthCheck(){
        MyStrBuilder two = new MyStrBuilder(7);
        assertEquals(0, two.length());
    }
    @Test(timeout = 200)
    public void testMyStringBuilderTwoCapacityCheck(){
        MyStrBuilder two = new MyStrBuilder(7);
        assertEquals(7, two.capacity());
    }

    @Test(timeout = 200)
    public void testMyStringBuilder(){
        MyStrBuilder twoB = new MyStrBuilder(17);
        char[] r = new char[17];
        String re = Arrays.toString(r);
        String c = Arrays.toString(twoB.getData());
        assertEquals(re,c);
    }
    @Test(timeout=200)
    public void testMyStringBuilderTwosLengthCheck(){
        MyStrBuilder twoB = new MyStrBuilder(17);
        assertEquals(0,twoB.length());
    }
    @Test(timeout=200)
    public void testMyStringBuilderTwosCapacityCheck(){
        MyStrBuilder twoB = new MyStrBuilder(17);
        assertEquals(17,twoB.capacity());
    }
    @Test(timeout = 200)
    public void testMyStringBuilder3(){
        char[] c = {'L','u','o'};
        MyStrBuilder three = new MyStrBuilder(c);
        char[] test = new char[c.length+16];
        System.arraycopy(c, 0, test, 0, c.length);
        assertEquals(Arrays.toString(test), Arrays.toString(three.getData()));
    }
    @Test(timeout = 200)
    public void testMyStringBuilderLength3(){
        char[] c = {'L','u','o'};
        MyStrBuilder three = new MyStrBuilder(c);
        assertEquals(3, three.length());
    }
    @Test(timeout = 200)
    public void testMyStringBuilderCapacity3(){
        char[] c = {'L','u','o'};
        MyStrBuilder three = new MyStrBuilder(c);
        assertEquals(19, three.capacity());
    }
    @Test(timeout = 200)
    public void testMyStringBuilder3b(){
        char[] d = {'a', 'z','b','c','d','e','f','g','h','i','j','k','a','a','b','g','.'};
        MyStrBuilder threeB = new MyStrBuilder(d);
        char[] testA = {'a', 'z','b','c','d','e','f','g','h','i','j','k','a','a','b','g','.','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0', '\0','\0'};
        assertEquals(Arrays.toString(testA),Arrays.toString(threeB.getData()));
    }
    @Test(timeout=200)
    public void testMyStringBuilder3Length(){
        char[] d = {'a', 'z','b','c','d','e','f','g','h','i','j','k','a','a','b','g','.'};
        MyStrBuilder threeB = new MyStrBuilder(d);
        assertEquals(17, threeB.length());
    }
    @Test(timeout=200)
    public void testMyStringBuilder3Capacity(){
        char[] d = {'a', 'z','b','c','d','e','f','g','h','i','j','k','a','a','b','g','.'};
        MyStrBuilder threeB = new MyStrBuilder(d);
        assertEquals(33, threeB.capacity());
    }
    // APPEND CHAR TESTS
    @Test(timeout = 200)
    public void testAppendChar(){
        MyStrBuilder four = new MyStrBuilder();
        four.append('c');
        char[] testAp = {'c','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(testAp), Arrays.toString(four.getData()));
    }
    @Test(timeout=200)
    public void testAppendCharLength(){
        MyStrBuilder four = new MyStrBuilder();
        four.append('c');
        assertEquals(1, four.length());
    }
    @Test(timeout=200)
    public void testAppendCharCapacity(){
        MyStrBuilder four = new MyStrBuilder();
        four.append('c');
        assertEquals(16, four.capacity());
    }
    @Test(timeout = 200)
    public void atestAppendChar(){
        char[] d = {'a', 'z','b','c','d','e','f','g','h','i','j','k','a','a','b','g'};
        MyStrBuilder five = new MyStrBuilder(d);
        five.append('y');
        char[] test = {'a', 'z','b','c','d','e','f','g','h','i','j','k','a','a','b','g','y','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0', '\0'};
        assertEquals(Arrays.toString(test), Arrays.toString(five.getData()));
    }
    @Test(timeout = 200)
    public void atestAppendCharC(){
        char[] d = {'a', 'z','b','c','d','e','f','g','h','i','j','k','a','a','b'};
        MyStrBuilder five = new MyStrBuilder();
        five.append('y');
        five.append(d);
        char[] test = {'y','a', 'z','b','c','d','e','f','g','h','i','j','k','a','a','b',};
        assertEquals(Arrays.toString(test), Arrays.toString(five.getData()));
    }

    //APPEND INT TESTS
    @Test(timeout = 200)
    public void testAppendIntA(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(1111111546);
        char[] test = {'1', '1','1','1','1','1','1','5','4','6','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(test), Arrays.toString(y.getData()));
    }
    @Test(timeout=200)
    public void testAppendIntB(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(1711611546);
        char[] test = {'1', '7','1','1','6','1','1','5','4','6','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(test), Arrays.toString(y.getData()));
    }

    @Test(timeout = 200)
    public void testAppendIntC(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(-5);
        char[] test = {'-', '5','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(test),Arrays.toString(y.getData()));
    }
    @Test(timeout = 200)
    public void testAppendIntCLengthCheck(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(-5);

        assertEquals(2,y.length());
    }
    @Test(timeout = 200)
    public void testAppendIntD(){
        MyStrBuilder y = new MyStrBuilder(2);
        y.append(-2345);
        char[] test = {'-','2', '3', '4', '5','\0'};
        assertEquals(Arrays.toString(test),Arrays.toString(y.getData()));
    }
    //To change the integer minimum value to a positive number
    // Add one to it
    @Test(timeout = 200)
    public void testAppendInt(){
        MyStrBuilder six = new MyStrBuilder(2);
        six.append(Integer.MIN_VALUE);
        char[] test= {'-','2','1','4','7','4','8','3','6','4','7','\0','\0','\0'};
        assertEquals(Arrays.toString(test),Arrays.toString(six.getData()));
    }
    @Test(timeout = 200)
    public void testAppendIntLengthCheck(){
        MyStrBuilder six = new MyStrBuilder(2);
        six.append(Integer.MIN_VALUE);
        assertEquals(11,six.length());
    }
    @Test(timeout = 200)
    public void testAppendIntCapacityCheck(){
        MyStrBuilder six = new MyStrBuilder(2);
        six.append(Integer.MIN_VALUE);
        assertEquals(14,six.capacity());
    }
    @Test(timeout = 200)
    public void testAppendIntAB(){
        MyStrBuilder six = new MyStrBuilder(2);
        six.append(Integer.MAX_VALUE);
        char[] test= {'2','1','4','7','4','8','3','6','4','7','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(test),Arrays.toString(six.getData()));
    }
    @Test(timeout = 200)
    public void testAppendIntCapacityCheckC(){
        MyStrBuilder six = new MyStrBuilder(2);
        six.append(Integer.MAX_VALUE);
        assertEquals(14,six.capacity());
    }
    @Test(timeout = 200)
    public void testAppendIntABLENGTH(){
        MyStrBuilder six = new MyStrBuilder(2);
        six.append(Integer.MAX_VALUE);
        assertEquals(10,six.length());
    }
    @Test(timeout = 200)
    public void testAppendIntABC(){
        MyStrBuilder six = new MyStrBuilder(2);
        six.append(4567895);
        char[] test= {'4','5','6','7','8','9','5','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(test),Arrays.toString(six.getData()));
    }
    @Test(timeout = 200)
    public void testAppendIntABCD(){
        MyStrBuilder six = new MyStrBuilder(2);
        six.append(4567895);
        assertEquals(7,six.length());
    }
    @Test(timeout=200)
    public void testAppendIntZ(){

    }
    @Test (timeout=200)
    public void testAppendCharArray(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'J','a','v','a'});
        char[] test = {'J','a','v','a','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(test),Arrays.toString(y.getData()));
    }
    @Test (timeout=200)
    public void testAppendCharArrayA(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'J','a','v','a'});
        y.append(' ');
        y.append('1');
        y.append('6');
        char[] ary={' ','i','s',' ','t','h','e',' ','l','a', 't', 'e', 's', 't', ' ', 'v', 'e', 'r', 's', 'i', 'o', 'n'};
        y.append(ary);
        char[] test = {'J','a','v','a',' ','1','6',' ','i','s',' ','t','h','e',' ','l','a','t','e','s','t',' ','v','e','r','s','i','o','n','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(test), Arrays.toString(y.getData()));
    }
    @Test (timeout=200)
    public void testAppendCharArrayALength(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'J','a','v','a'});
        y.append(' ');
        y.append('1');
        y.append('6');
        char[] ary={' ','i','s',' ','t','h','e',' ','l','a', 't', 'e', 's', 't', ' ', 'v', 'e', 'r', 's', 'i', 'o', 'n'};
        y.append(ary);
        assertEquals(29,y.length());
    }
    @Test (timeout=200)
    public void testAppendCharArrayALengthCapacity(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'J','a','v','a'});
        y.append(' ');
        y.append('1');
        y.append('6');
        char[] ary={' ','i','s',' ','t','h','e',' ','l','a', 't', 'e', 's', 't', ' ', 'v', 'e', 'r', 's', 'i', 'o', 'n'};
        y.append(ary);
        assertEquals(34,y.capacity());
    }
    @Test (timeout=200)
    public void testCharAt(){
        MyStrBuilder y = new MyStrBuilder();
        y.append('c');
        char a = y.charAt(0);
        assertEquals('c',a);
    }
    @Test (timeout = 200)
    public void twoParameterSubstringTest(){
        MyStrBuilder msb = new MyStrBuilder(4);
        msb.append(new char[]{'J','a','v','a'});
        MyStrBuilder newMSB = msb.substring(1,3);
        char[] res = new char[18];
        res[0]='a';
        res[1]='v';
        assertEquals(Arrays.toString(res), Arrays.toString(newMSB.getData()));
    }
    @Test (timeout = 200)
    public void oneParameterSubstringTest(){
        MyStrBuilder msb = new MyStrBuilder(4);
        msb.append(new char[]{'J','a','v','a'});
        MyStrBuilder newMSB = msb.substring(1);
        char[] res = new char[19];
        res[0]='a';
        res[1]='v';
        res[2]='a';
        assertEquals(Arrays.toString(res), Arrays.toString(newMSB.getData()));
    }
    @Test(timeout = 200)
    public void testCharAtB(){
        char[] d = {'a', 'z','b','c','d','e','f','g','h','i','j','k','a','a','b','g'};
        MyStrBuilder y = new MyStrBuilder(d);
        char a = y.charAt(11);
        assertEquals('k',a);
    }
    @Test (timeout=200)
    public void testCapacity(){
        MyStrBuilder y = new MyStrBuilder();
        int c = y.capacity();
        assertEquals(16,c);
    }
    @Test (timeout=200)
    public void testCapacityA(){
        MyStrBuilder y = new MyStrBuilder(6);
        int g = y.capacity();
        assertEquals(6,g);
    }
    // To lower case tests
    @Test (timeout=200)
    public void testToLowerCase(){
        char[] test = {'C','f','G','H'};
        MyStrBuilder j = new MyStrBuilder(test);
        j=j.toLowerCase();
        char[] testEnd = {'c','f','g','h','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(testEnd), Arrays.toString(j.getData()));
    }
    @Test (timeout=200)
    public void testToLowerCaseOne(){
        char[] test = {'A','M','E','L','I','O','R','A','T','E'};
        MyStrBuilder y = new MyStrBuilder(test);
        y=y.toLowerCase();
        char[] testEnd = {'a','m','e','l','i','o','r','a','t','e','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(testEnd), Arrays.toString(y.getData()));
    }
    @Test (timeout=200)
    public void testToLowerCaseOneLength(){
        char[] test = {'A','M','E','L','I','O','R','A','T','E'};
        MyStrBuilder y = new MyStrBuilder(test);
        y=y.toLowerCase();
        assertEquals(10, y.length());
    }
    @Test (timeout=200)
    public void testToLowerCaseOneCapacity(){
        char[] test = {'A','M','E','L','I','O','R','A','T','E'};
        MyStrBuilder y = new MyStrBuilder(test);
        y=y.toLowerCase();
        assertEquals(26, y.capacity());
    }
    //To upper case tests
    @Test (timeout = 200)
    public void testToUpperCase(){
        char[] ary={' ','I','s',' ','t','h','e',' ','l','a', 't', 'e', 's', 't', ' ', 'v', 'e', 'r', 's', 'i', 'o', 'n'};
        MyStrBuilder y = new MyStrBuilder(ary);
        y=y.toUpperCase();
        char[] test={' ','I','S',' ','T','H','E',' ','L','A', 'T', 'E', 'S', 'T', ' ', 'V', 'E', 'R', 'S', 'I', 'O', 'N','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(test),Arrays.toString(y.getData()));
    }
    @Test (timeout = 200)
    public void testToUpperCaseLength(){
        char[] ary={' ','I','s',' ','t','h','e',' ','l','a', 't', 'e', 's', 't', ' ', 'v', 'e', 'r', 's', 'i', 'o', 'n'};
        MyStrBuilder y = new MyStrBuilder(ary);
        y=y.toUpperCase();
        assertEquals(22, y.length());
    }
    @Test (timeout = 200)
    public void testToUpperCaseCapacity(){
        char[] ary={' ','I','s',' ','t','h','e',' ','l','a', 't', 'e', 's', 't', ' ', 'v', 'e', 'r', 's', 'i', 'o', 'n'};
        MyStrBuilder y = new MyStrBuilder(ary);
        y=y.toUpperCase();
        assertEquals(38, y.capacity());
    }
    // Equals tests
    @Test (timeout = 100)
    public void equalsTest(){
    MyStrBuilder msb = new MyStrBuilder();
    msb.append(new char[]{'J','a','v','a'});
    MyStrBuilder msbTwo = new MyStrBuilder();
    msbTwo.append(new char[]{'J','a','v','a'});
        assertEquals(msb, msbTwo);
    }
    @Test (timeout = 100)
    public void equalsTestOne(){
        MyStrBuilder msb = new MyStrBuilder();
        msb.append(new char[]{'J','a','v','a'});
        MyStrBuilder msbTwo = new MyStrBuilder();
        msbTwo.append(new char[]{'J','a','v','a','\0'});
        boolean c = msb.equals(msbTwo);
        assertTrue(c);
    }
    @Test (timeout = 100)
    public void equalsTestTwo(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'B','O','O','\0','\0'});
        MyStrBuilder z = new MyStrBuilder();
        z.append(new char[]{'H','E','A','\0'});
        boolean c = z.equals(y);
        assertFalse(c);
    }
    @Test (timeout = 100)
    public void equalsTestThree(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'B','A','O','E','A','\0','\0'});
        MyStrBuilder z = new MyStrBuilder();
        z.append(new char[]{'H','E','A', 'B','A','O','E','A','\0','\0'});
        boolean c = z.equals(y);
        assertFalse(c);
    }
    // Index Of Tests
    @Test(timeout=100)
    public void testIndexOf(){
        char[] ary={' ','I','s',' ','t','h','e',' ','l','a', 't', 'e', 's', 't', ' ', 'v', 'e', 'r', 's', 'i', 'o', 'n'};
        MyStrBuilder y = new MyStrBuilder(ary);
        int res=  y.indexOf('t');
        assertEquals(4,res);
    }
    @Test (timeout=100)
    public void testIndexOfA(){
        MyStrBuilder y = new MyStrBuilder();
        int res = y.indexOf('z');
        assertEquals(-1,res);
    }
    @Test(timeout = 100)
    public void testIndexOfAB(){
        char [] ary = {'-','v','b','h','s'};
        MyStrBuilder y = new MyStrBuilder(ary);
        int res = y.indexOf('-');
        assertEquals(0,res);
    }
    @Test(timeout = 100)
    public void testIndexOfABC(){
        char [] ary = {'/','v','b','h','s'};
        MyStrBuilder y = new MyStrBuilder(ary);
        int res = y.indexOf('/');
        assertEquals(0,res);
    }
    // Reverse Tests
    @Test(timeout = 100)
    public void testReverse(){
        MyStrBuilder msb = new MyStrBuilder();
        msb.append(new char[]{'J','a','v','a'});
        msb.reverse();
        char[] res = {'a','v','a','J','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(res), Arrays.toString(msb.getData()));
    }
    @Test(timeout = 100)
    public void testReverseOne(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'R','a','c','e','c','a','r'});
        y.reverse();
        char[] expected = {'r','a','c','e','c','a','R','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(expected),Arrays.toString(y.getData()));
    }
    // Insert Off set tests
    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertOffSetThrows(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'J','a','v','a'});
        y.insert(100, 'J');

    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertOffSetThrowsA(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'J','a','v','a'});
        y.insert(17, 'J');

    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertOffSetThrowsANegative(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'J','a','v','a'});
        y.insert(-17, 'J');

    }
    @Test(timeout = 100)
    public void testInsertOffSet(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'J','a','v','a'});
        y.insert(1, 'J');
        char[] expected = new char[]{'J','J','a','v','a','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(expected),Arrays.toString(y.getData()));
    }
    @Test(timeout = 100)
    public void testInsertOffSetA(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'R','a','c','e','c','a','r'});
        y.insert(2,'z');
        char[] expected = new char[]{'R','a','z','c','e','c','a','r','\0','\0','\0','\0','\0','\0','\0','\0'};
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertOffSetAException(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'R','a','c','e','c','a','r'});
        y.insert(64,'z');

    }
    @Test(timeout=200)
    public void testInsertOffSetSize(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'J','a','v','a'});
        y.insert(1, 'J');
        assertEquals(5, y.length());
    }
    @Test(timeout=100)
    public void testInsertOffSetArray(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'K','n','o','w',' ','p','o','w','e','r'});
        y.insert(4, new char[]{'l','e','d','g','e',' ','i','s'});
        char[] expected = new char[]{'K','n','o','w', 'l','e','d','g','e',' ','i','s',' ','p','o','w','e','r','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(expected), Arrays.toString(y.getData()));
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutCharArrayNegativeNumber() {
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'K','n','o','w',' ','p','o','w','e','r'});
        y.insert(-3, new char[]{'l','e','d','g','e',' ','i','s'});
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutCharArray() {
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'K','n','o','w',' ','p','o','w','e','r'});
        y.insert(11, new char[]{'l','e','d','g','e',' ','i','s'});
    }
    @Test(timeout=200)
    public void testInsertOffSetArraySize(){
        MyStrBuilder y = new MyStrBuilder();
        y.append(new char[]{'K','n','o','w',' ','p','o','w','e','r'});
        y.insert(4, new char[]{'l','e','d','g','e',' ','i','s'});
        assertEquals(18,y.length());
    }
    // Test deletes
    @Test(timeout = 100)
    public void testDeleteChar(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        y.delete(2);
        char[] expected = new char[]{'J','a','a','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(expected), Arrays.toString(y.getData()));
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDeleteCharException(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        y.delete(21);
        char[] expected = new char[]{'J','a','a','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};

    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDeleteCharExceptionNegative(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        y.delete(-1);
        char[] expected = new char[]{'J','a','a','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};

    }
    @Test(timeout=200)
    public void testDeleteCharSize(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        y.delete(2);
        assertEquals(3,y.length());
    }
    @Test(timeout=200)
    public void testDeleteRange(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        y.delete(1,4);
        char[] expected = new char[]{'J','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(expected),Arrays.toString(y.getData()));
    }
    @Test(timeout=200)
    public void testDeleteRangeCapacity(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        y.delete(1,4);
        char[] expected = new char[]{'J','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(20,y.capacity());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDeleteRangeException(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        y.delete(1,6);
    }
    // size+1??
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDeleteRangeB(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        y.delete(1,5);

    }
    @Test(timeout=200)
    public void testDeleteRangeSize(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        y.delete(1,4);
        assertEquals(1,y.length());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReplaceException(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        char[] chars = {'L','O','L'};
        y.replace(-1,chars);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReplaceExceptionOne(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        char[] chars = {'L','O','L'};
        y.replace(Integer.MAX_VALUE,chars);
    }
    @Test(timeout=100)
    public void testReplace(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        char[] chars = {'L','O','L'};
        y.replace(1,chars);
        char[] expected = new char[]{'J','L','O','L','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        assertEquals(Arrays.toString(expected), Arrays.toString(y.getData()));
    }
    @Test(timeout=200)
    public void testReplaceSize(){
        MyStrBuilder y = new MyStrBuilder(new char[]{'J','a','v','a'});
        char[] chars = {'L','O','L'};
        y.replace(1,chars);
        assertEquals(4, y.length());
    }

}
