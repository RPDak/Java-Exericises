import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.FileReader;
import java.io.IOException;

public class Fetch {
	public static double average = 0;
	public static double above100 = 0;

	public static String getHTML(String urlToRead) throws Exception {
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlToRead);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		String line;
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		rd.close();
		return result.toString();
	}

	public static String getFileContents(String fileName) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			return sb.toString();
		} finally {
			br.close();
		}
	}

	public static void getAverageAndMax(String file) throws IOException {
		double numOfNumbers = 0;
		double sum = 0;
		int counter = 0;

		BufferedReader br = new BufferedReader(new FileReader(file));

		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		int num = 0;

		while (line != null) {
			sb.append(line);
			sb.append("\n");
			num = Integer.parseInt(line);
			sum = sum + num;
			numOfNumbers++;
			if (num > 100) {
				above100++;

			}

			System.out.println(line + " " + counter);
			counter++;
			line = br.readLine();
		}

		br.close();

		average = sum / numOfNumbers;

	}

}
