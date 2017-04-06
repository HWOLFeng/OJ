//package day04;
//
//import java.util.*;
//
//
///**
// * Created by HWOLF on 2017/3/16.
// */
//class Backdate_maze {
//    public static void main(String[] args) {
//        Maze demo = new Maze();
//        demo.init();
//        demo.findPath();
//    }
//}
//
////记录位置函数
//class Position {
//    int row, col;
//
//    public Position() {
//    }
//
//    //参数初始化
//    public Position(int row, int col) {
//        this.row = row;
//        this.col = col;
//    }
//
//    //重写toString方法
//    public String toString() {
//        return "(" + row + "," + col + ")";
//    }
//}
//
////迷宫类
//class Maze {
//    int[][] maze;
//    Stack<Position> stack;
//    private int row = 9;
//    private int col = 8;
//    boolean[][] p = null;
//
//    //构造方法，初始化设置，栈，迷宫，标记数据大小
//    public Maze() {
//        maze = new int[15][15];
//        stack = new Stack();
//        p = new boolean[15][15];
//    }
//
//    public void init() {
//        //初始化迷宫
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入行数：");
//        row = sc.nextInt();
//        System.out.print("请输入列数：");
//        col = sc.nextInt();
//        System.out.println("请输入" + row + "行" + col + "列的迷宫");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                int temp = sc.nextInt();
//                maze[i][j] = temp;
//                p[i][j] = false;//标记为未查询过点。
//            }
//        }
//    }
//
//    //查找方法
//    public void findPath() {
//        //在迷宫边缘加上一层
//        int[][] temp = new int[row + 2][col + 2];
//        for (int i = 0; i < row + 2; i++) {
//            for (int j = 0; j < col + 2; j++) {
//                temp[i][j] = 1;
//            }
//        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                temp[i + 1][j + 1] = maze[i][j];
//            }
//        }
//
//        //顺时针查询
//        int i = 1;
//        int j = 1;
//        p[i][j] = true;
//        //切记首元素压入栈中
//        stack.push(new Position(i, j));
//        while (!stack.empty() && (!(i == (row) && (j == col)))) {
//            if ((temp[i + 1][j] == 0) && p[i + 1][j] == false) {
//                p[i + 1][j] = true;
//                stack.push(new Position(i + 1, j));
//                i++;
//            } else if ((temp[i - 1][j] == 0) && p[i - 1][j] == false) {
//                p[i - 1][j] = true;
//                stack.push(new Position(i - 1, j));
//                i--;
//            } else if ((temp[i][j + 1] == 0) && (p[i][j + 1] == false)) {
//                p[i][j + 1] = true;
//                stack.push(new Position(i, j + 1));
//                j++;
//            } else if ((temp[i][j - 1] == 0) && (p[i][j - 1] == false)) {
//                p[i][j - 1] = true;
//                stack.push(new Position(i, j - 1));
//                j--;
//            } else {//不满足条件，回溯
//                stack.pop();
//                if (stack.empty()) break;
//                i = stack.peek().row;
//                j = stack.peek().col;
//            }
//
//        }
//
//        //存储数据
//        Stack<Position> newPos = new Stack<Position>();
//        if (stack.empty()) {
//            System.out.println("不存在路径");
//        } else {
//            System.out.println("存在路径，路径如下");
//            while (!stack.empty()) {
//                Position pos;
//                pos = stack.pop();//存储弹出栈的数据
//                newPos.push(pos);//入栈
//            }
//        }
//        /*
//        图形化界面输出
//         */
//
//        String[][] result = new String[row + 1][col + 1];
//        for (int k = 0; k < row; k++) {
//            for (int t = 0; t < col; t++) {
//                result[k][t] = maze[k][t] + "";
//            }
//        }
//        while (!newPos.empty()) {
//            Position p1 = newPos.pop();
//            result[p1.row - 1][p1.col - 1] = "#";
//        }
//
//        for (int k = 0; k < row; k++) {
//            for (int t = 0; t < col; t++) {
//                System.out.print(result[k][t] + "\t");
//            }
//            System.out.println();
//        }
//
//    }
//}
