import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilesProperties {
	public static BufferedReader getBufferedReader(String fileName) throws FileNotFoundException {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));

		return reader;

	}

	public static PrintWriter getPrintWriter(String fileName) throws IOException {
		PrintWriter printer = new PrintWriter(new FileWriter(fileName));

		return printer;

	}
}
