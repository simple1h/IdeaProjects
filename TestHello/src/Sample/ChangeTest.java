package Sample;

/**
 * Created with IntelliJ IDEA.
 * User: Simple
 * Date: 03.02.14
 * Time: 23:46
 * To change this template use File | Settings | File Templates.
 */
public class ChangeTest {

    private int myValue = 0;

    public void showOne(int myValue){
        myValue = myValue;
    }

    public void showTwo(int myValue){
        this.myValue = myValue;
    }
    public static void main(String[] args) {
        ChangeTest ct = new ChangeTest();
        ct.showTwo(200);
        System.out.println(ct.myValue);
        ct.showOne(100);
        System.out.println(ct.myValue);
    }
}
