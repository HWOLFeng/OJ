package Link;


import day07.Node;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by HWOLF on 2017/4/5.
 */
public class BinTreeNode implements Node {
    private Object data;
    private BinTreeNode parent;
    private BinTreeNode lChild;
    private BinTreeNode rChild;
    private int height;
    private int size;

    public BinTreeNode() {
        this(null);
    }

    public BinTreeNode(Object e) {
        data = e;
        height = 0;
        size = 1;
        parent = lChild = rChild = null;
    }

    /*Node接口方法*/
    @Override
    public Object getData() {
        return data;
    }

    @Override
    public void setData(Object obj) {
        this.data = obj;
    }

    /*judge whether has parent/leftChild/rightChild*/
    public boolean hasParent() {
        return parent != null;
    }

    public boolean hasLChild() {
        return lChild != null;
    }

    public boolean hasRChild() {
        return rChild != null;
    }

    /*judge whether is leaf/leftChild/rightChild*/
    public boolean isLeaf() {
        return !hasLChild() && !hasRChild();
    }

    public boolean isLChild() {
        return (hasParent() && this == parent.lChild);
    }

    public boolean isRChild() {
        return (hasParent() && this == parent.rChild);
    }
    public int getHeight(){return height;}

    public void updateHeight() {
        int newHeight = 0;//新高度初始化为0，高度等于左右子树高者+1
        if (hasRChild()) newHeight = Math.max(newHeight, 1 + getRChild().getHeight());
        if (hasLChild()) newHeight = Math.max(newHeight, 1 + getLChild().getHeight());
        if (newHeight == height) return;//the height not change
        height = newHeight;//else
        if (hasParent()) getParent().getHeight();//递归更新祖先高度
    }
    /*
    the method about size
     */
    public int getSize(){return size;}
    public void updateSize(){
        size = 1;
        if (hasLChild())size+=getLChild().getSize();
        if (hasRChild())size+=getRChild().getSize();
        if (hasParent())getParent().getSize();//递归 update the parent size
    }
    /*about parent*/
    public BinTreeNode getParent() {
        return parent;
    }
    /*cut the node relation with parent*/
    public void sever(){
        if (!hasParent())return;
        if (isLChild())parent.lChild = null;//parent's point equal null
        else parent.rChild = null;//the same
        parent.updateHeight();//update parent height
        parent.updateSize();//the Size
        parent = null;
    }
    /*about the right*/
    public BinTreeNode getRChild() {
        return rChild;
    }
    //set the right child and return it
    public BinTreeNode setRChild(BinTreeNode rChild){
        BinTreeNode oldRChild = this.rChild;//cut it's child right
        if (hasRChild())rChild.sever();//cut right child with this node
        if (rChild!=null){
            rChild.sever();//cut the relation with the parent
            this.rChild = rChild;//make sure the relation with parent
            rChild.parent = this;//回收了节点
            this.updateHeight();//update this node and it's parent
            this.updateSize();
        }
        return oldRChild;
    }
    /*about the left*/

    public BinTreeNode getLChild() {
        return lChild;
    }

    public BinTreeNode setLChild(BinTreeNode lChild){
        BinTreeNode oldLChild = this.lChild;//cut it's child right
        if (hasLChild())lChild.sever();//cut right child with this node
        if (lChild!=null){
            lChild.sever();//cut the relation with the parent
            this.lChild = lChild;//make sure the relation with parent
            lChild.parent = this;//回收了节点
            this.updateHeight();//update this node and it's parent
            this.updateSize();
        }
        return oldLChild;
    }

    //under is the calculation about recursion
    //the preOrder the tree
//    public Iterator preOrder(){
//        LinkedList list = new LinkedDLNode();
//    }
}
