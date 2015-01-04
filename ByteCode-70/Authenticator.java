import java.io.Console;
import java.io.PrintStream;

class Authenticator
{
  public static char[] key;

  public static void main(String[] paramArrayOfString)
  {
    key = new char[10];
    key[0] = 'z';
    key[1] = 'L';
    key[2] = 'n';
    key[3] = 'y';
    key[4] = 'X';
    key[5] = 'm';
    key[6] = 'L';
    key[7] = 'z';
    key[8] = 'w';
    key[9] = 'W';
    Console localConsole = System.console();
    String str = "";
    while (!str.equals("ThisIsth3mag1calString5876"))
      str = localConsole.readLine("Enter password:", new Object[0]);
    for (int i = 0; i < key.length; i++)
      System.out.print(key[i]);
    System.out.println("");
  }
}
