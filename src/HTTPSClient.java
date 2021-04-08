import java.net.*;
import java.io.*;

public class HTTPSClient {
    public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: "+HTTPSClient.class.getName()+" <url> ");
			System.exit(1);
		}
		try {
			URL oracle = new URL(args[0]);
			BufferedReader in = new BufferedReader(
			new InputStreamReader(oracle.openStream()));
	
			String inputLine;
			while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			in.close();

		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}