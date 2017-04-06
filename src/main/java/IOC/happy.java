//package main.java.IOC;
//
///**
// * Created by HWOLF on 2017/3/23.
// */
//public class happy {
//        private String happyInfo;
//
//        public void happy(){
//            System.out.println(happyInfo);
//        }
//
//        public String getHappyInfo() {
//            return happyInfo;
//        }
//
//        public void setHappyInfo(String happyInfo) {
//            this.happyInfo = happyInfo;
//        }
//}
//class test{
//    public static void main(String[] args) {
//        //获取上下文对象
//        //ApplicationContext context2=new FileSystemXmlApplicationContext("applicationContext.xml");
//
//        //BeanFactory beanf=new FileSystemXmlApplicationContext("applicationContext.xml");
//
//        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        //    Object getBean(String name) throws BeansException;
//        Happy happy = (Happy) context.getBean("happy");
//
//        happy.happy();
//    }
//}
//}
