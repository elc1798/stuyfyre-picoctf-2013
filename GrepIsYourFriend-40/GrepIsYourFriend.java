import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GrepIsYourFriend {

	public static Runtime cmd = Runtime.getRuntime();

	public static void main(String[] args) {

		Process p = null;
		String lsOUT = "";
		String stdout = "";

		try {

			p = cmd.exec("ls");
			BufferedReader stdin = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((stdout = stdin.readLine()) != null) {
				lsOUT += stdout + " ";
			}

			stdin.close();

		} catch(Exception e) {
			System.out.println("What just happened O.o");
			System.exit(0);
		}

		String[] files = lsOUT.split(" ");

		Scanner fileScanner = null;
		String fileContents = "";

		for (String fname : files) {
			try {
				fileScanner = new Scanner(new File(fname));
				while (fileScanner.hasNext()) {
					fileContents += fileScanner.next() + " ";
				}
				if (fileContents.contains("SECRET") && fname.contains("==")) {
					System.out.println(fname);
				}

				fileScanner = null;
				fileContents = "";
			} catch(Exception e) {}
		}

	}

}
