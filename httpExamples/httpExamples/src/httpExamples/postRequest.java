package httpExamples;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;

public class postRequest {
	
	public static final String URL_POST = "http://httpbin.org/forms/post";
	public static final String FILE_JSON = "caminho...do...arquivo";

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
				// .POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_JSON))) comentado porque o arquivo não existe. Se existisse ele rodaria e daria código 405, método não disponível (questão de segurança)
				.timeout(Duration.ofSeconds(10))
				.uri(URI.create(URL_POST))
				.build();
		
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
		    .thenApply(HttpResponse::body)
		    .thenAccept(System.out::println)
		    .join();

	}

}
