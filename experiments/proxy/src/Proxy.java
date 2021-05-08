/**
 * @author coder_tq
 * @Date 2021/5/4 11:44
 */
public class Proxy implements People {
    private People realPerson;

    //在构造房产中介时传入一个realPerson对象
    public Proxy(People realPerson) {
        this.realPerson = realPerson;
    }
    @Override
    public void buyHouse() {
        //真实对象买房之前的操作
        beforeBuyHouse();
        //调用真实对象的购买方法
        realPerson.buyHouse();
        //真实对象买房之后的操作
        afterBuyHouse();
    }
    private void beforeBuyHouse(){
        System.out.println("交中介费给房产中介");
        System.out.println("房产中介找到一个好房源");
    }
    private void afterBuyHouse(){
        System.out.println("买房之后的一些操作");
    }
}
