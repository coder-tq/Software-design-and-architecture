package interfaces;

/**
 * @author wtq
 */
public interface Subject {

    /**
     *
     * 注册观察者
     * @param o 新的观察者
     */
    void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o 要被移除的观察者
     */
    void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
