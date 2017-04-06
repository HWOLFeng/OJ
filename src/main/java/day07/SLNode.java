package day07;

/**
 * Created by HWOLF on 2017/3/22.
 */
public class SLNode implements Node{
    private Object element;
    private SLNode next;
    public SLNode(){
        this(null,null);
    }
    public SLNode(Object o, SLNode o1){
        this.element = o;
        this.next = o1;
    }
    public SLNode getNext(){
        return next;
    }
    public void setNext(SLNode next){
        this.next = next;
    }
    @Override
    public Object getData() {
        return element;
    }

    @Override
    public void setData(Object obj) {
        element = obj;
    }
}
