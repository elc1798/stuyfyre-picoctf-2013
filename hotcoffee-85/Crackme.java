/*   */ import java.io.PrintStream;
/*   */ import java.util.Scanner;
/*   */ 
/*   */ public class Crackme
/*   */ {
/*   */   public static void main(String[] paramArrayOfString)
/*   */   {
/* 5 */     System.out.println("Please enter the password:");
/* 6 */     Scanner localScanner = new Scanner(System.in);
/* 7 */     String str = localScanner.next();
/* 8 */     if (str.equals("eupai1AhNu7aeTho")) {
/* 9 */       System.out.println("Correct");
/* 10 */       System.out.print("Your key is: ");
/* 11 */       System.out.print("n");
/* 12 */       System.out.print("0");
/* 13 */       System.out.print("t");
/* 14 */       System.out.print("h");
/* 15 */       System.out.print("1");
/* 16 */       System.out.print("n");
/* 17 */       System.out.print("g");
/* 18 */       System.out.print("_");
/* 19 */       System.out.print("1");
/* 20 */       System.out.print("s");
/* 21 */       System.out.print("_");
/* 22 */       System.out.print("s");
/* 23 */       System.out.print("a");
/* 24 */       System.out.print("f");
/* 25 */       System.out.print("3");
/* 26 */       System.out.print("\n");
/*   */     }
/*   */     else {
/* 29 */       System.out.println("Wrong");
/*   */     }
/*   */   }
/*   */ }

/* Location:           /Users/photoXin/Development/picoCTF/picoctf-stuyfyre-2013/hotcoffee-85/
 * Qualified Name:     Crackme
 * JD-Core Version:    0.6.2
 */