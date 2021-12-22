import org.junit.Test;

public class TestPhase extends TestMethods {

    @Test
    public void testEt() throws InterruptedException{
        checkTitle();
        closePopUp();
        loginKontrol("mertcanaydin007@gmail.com","mertcanaydin1");
        search();
        secondPage();
        randomProduct();
        //checkPrice(selectedProductString);
        productIncrease();
        deleteProduct();
    }
}
