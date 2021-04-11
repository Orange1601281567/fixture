import java.util.Scanner;

public class HelloWorld {
    public static void main(String []args) {
       Scanner scan = new Scanner(System.in); //声明一个Scanner对象，初始输入流为控制台
       int num= Integer.parseInt(scan.nextLine()); //读取键盘输入字符串（包括空格、Tab，不包括最后的Enter)
       if(num<5) {
    	   System.out.println("*");
    	   System.out.println("剩余:"+(num-1));
       }
       else {
    	   int use=0;
    	   int max=0;
    	   while(use*2-2*max-1<num) {
    		   use=use+2*max+1;
    		   max++;
    	   }
    	  
           System.out.println("剩余:"+(num-2*(use-3*max)-5));
       }
    }
}



//
//
//import java.util.Scanner;
//
//public class HelloWorld {
//    public static void main(String []args) {
//       Scanner scan = new Scanner(System.in); //声明一个Scanner对象，初始输入流为控制台
//       int num= Integer.parseInt(scan.nextLine()); //读取键盘输入字符串（包括空格、Tab，不包括最后的Enter)
//       if(num<5) {
//    	   System.out.println("*");
//    	   System.out.println("剩余:"+(num-1));
//       }
//       else {
//    	   int use=0;
//    	   int max=0;
//    	   while(use*2-2*max-1<num) {
//    		   use=use+2*max+1;
//    		   max++;
//    	   }
//    	   int row=max-1; 
////    	   int big=2*row+1;
////    	   System.out.println("剩余:"+(num-2*(use-row-big)-1));
//    	   // 上半部分
//           for (int i = 1; i <= row; i++) {
//               for (int j = 1; j <= row - i; j++) {
//                   System.out.print(" ");
//               }
//               for (int j = 1; j <= 2 * i - 1; j++) {
//                   System.out.print("*");
//               }
//               System.out.println();
//           }
//           // 下半部分
//           for (int i = 1; i <= row - 1; i++) {
//               for (int j = 1; j <= i; j++) {
//                   System.out.print(" ");
//               }
//               for (int j = 1; j <= 2 * (row - 1 - i) + 1; j++) {
//                   System.out.print("*");
//               }
//               System.out.println();
//           }
//           System.out.println("剩余:"+(num-2*(use-3*max)-5));
//       }
//    }
//}