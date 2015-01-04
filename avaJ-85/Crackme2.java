/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Crackme2
/*    */ {
/*    */   public static void main(String[] paramArrayOfString)
/*    */   {
/*  5 */     System.out.println("Please enter the password:");
/*  6 */     Scanner localScanner = new Scanner(System.in);
/*  7 */     String str = localScanner.next();
/*  8 */     if (str.length() != 16) {
/*  9 */       System.out.println("Wrong");
/* 10 */       return;
/*    */     }
/* 12 */     char[] arrayOfChar = str.toCharArray();
/* 13 */     if (arrayOfChar[0] != 'i') {
/* 14 */       System.out.println("Wrong");
/* 15 */       return;
/* 16 */     }if (arrayOfChar[1] != 'T') {
/* 17 */       System.out.println("Wrong");
/* 18 */       return;
/* 19 */     }if (arrayOfChar[2] != '6') {
/* 20 */       System.out.println("Wrong");
/* 21 */       return;
/* 22 */     }if (arrayOfChar[3] != 'c') {
/* 23 */       System.out.println("Wrong");
/* 24 */       return;
/* 25 */     }if (arrayOfChar[4] != 'h') {
/* 26 */       System.out.println("Wrong");
/* 27 */       return;
/* 28 */     }if (arrayOfChar[5] != 'i') {
/* 29 */       System.out.println("Wrong");
/* 30 */       return;
/* 31 */     }if (arrayOfChar[6] != 'w') {
/* 32 */       System.out.println("Wrong");
/* 33 */       return;
/* 34 */     }if (arrayOfChar[7] != 'e') {
/* 35 */       System.out.println("Wrong");
/* 36 */       return;
/* 37 */     }if (arrayOfChar[8] != 'T') {
/* 38 */       System.out.println("Wrong");
/* 39 */       return;
/* 40 */     }if (arrayOfChar[9] != 'o') {
/* 41 */       System.out.println("Wrong");
/* 42 */       return;
/* 43 */     }if (arrayOfChar[10] != 'h') {
/* 44 */       System.out.println("Wrong");
/* 45 */       return;
/* 46 */     }if (arrayOfChar[11] != 'y') {
/* 47 */       System.out.println("Wrong");
/* 48 */       return;
/* 49 */     }if (arrayOfChar[12] != '4') {
/* 50 */       System.out.println("Wrong");
/* 51 */       return;
/* 52 */     }if (arrayOfChar[13] != 'o') {
/* 53 */       System.out.println("Wrong");
/* 54 */       return;
/* 55 */     }if (arrayOfChar[14] != 'o') {
/* 56 */       System.out.println("Wrong");
/* 57 */       return;
/* 58 */     }if (arrayOfChar[15] != 't') {
/* 59 */       System.out.println("Wrong");
/* 60 */       return;
/*    */     }
/* 62 */     System.out.print("Correct, your key is: ");
/* 63 */     System.out.println(str);
/*    */   }
/*    */ }

/* Location:           /Users/photoXin/Development/picoCTF/picoctf-stuyfyre-2013/avaJ-85/
 * Qualified Name:     Crackme2
 * JD-Core Version:    0.6.2
 */