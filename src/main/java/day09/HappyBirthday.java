package day09;

/**
 * Created by HWOLF on 2017/3/25.
 */
/*

��������

ĳ����ĳ�꿪ʼÿ�궼�ٰ�һ������party������ÿ�ζ�Ҫ��Ϩ��������ͬ����������

��������������һ����Ϩ��236������

���ʣ����Ӷ����꿪ʼ������party�ģ�

����д����ʼ������party����������
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�

26
 */
public class HappyBirthday {
    public static void main(String[] args) {
    years();
    }
    public static void years(){
        for (int x=10;x<=100;x++){
            for (int i = x; i > 0; i--) {
                if (x*i+i*(i-1)/2==236) System.out.println(x+i+" "+x+" "+i);
            }
        }
    }
}
