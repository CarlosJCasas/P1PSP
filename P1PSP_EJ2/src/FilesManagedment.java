import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FilesManagedment {
	public static void main(String[] args) {
		counter(args[0], args[1], args[2]);
	}

	public static boolean counter(String fileName, String vowel, String fileResultName) {
		String linea;
		int i = 0;
		BufferedReader fr;
		int contador = 0;
		PrintWriter pw;
		File fl;
		try {
			fl = new File(fileResultName);
			fl.createNewFile();
			fr = FilesProperties.getBufferedReader(fileName);
			while ((linea = fr.readLine()) != null) {
				i = 0;
				while (i < linea.length()) {
					if ((linea.charAt(i) == vowel.charAt(0) || linea.charAt(i) == vowel.toUpperCase().charAt(0))) {
						contador = contador + 1;
					}
					i++;
				}
			}
			fr.close();
			pw = FilesProperties.getPrintWriter(fileResultName);
			pw.println(contador);
			pw.close();
			return true;
		} catch (IOException e) {
			System.out.println("El archivo no existe.");
			e.printStackTrace();
			return false;
		}
	}
}
