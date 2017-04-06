package day07;

/**
 * Created by HWOLF on 2017/3/22.
 */
public class DLNode implements Node{
    private Object element;
    private DLNode pre;
    private DLNode next;
    public DLNode(){
        this(null,null,null);
    }
    public DLNode(Object ele,DLNode pre,DLNode next){
        this.element = ele;
        this.next = next;
        this.pre = pre;
    }
    public void setNext(DLNode next){
        this.next = next;
    }
    public DLNode getNext(){
        return next;
    }
    public void setPre(DLNode pre){
        this.pre = pre;
    }
    public DLNode getPre(){
        return pre;
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
