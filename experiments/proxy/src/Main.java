/**
 * @author coder_tq
 * @Date 2021/5/4 11:46
 */
public class Main {
    public static void main(String[] args){
        //真实对象不通过房产中介买房子
        People people = new RealPerson();
        people.buyHouse();

        System.out.println("++++++++++++");
        //真实对象通过房产中介来买房子
        People proxy = new Proxy(people);
        proxy.buyHouse();
    }
}
