package httpExamples;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class getRequest {

	public static final String URL_GET = "https://jsonplaceholder.typicode.com/posts";
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		// criação de um cliente http sem configuração. Com o método newHttpClient(), instância é imutável, não realizamos configurações.
		HttpClient client = HttpClient.newHttpClient();
		
		// criação da requisição que vai ser utilizada. Nesse caso utilizaremos o builder para configurar
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.timeout(Duration.ofSeconds(10))
				.uri(URI.create(URL_GET))
				.build();
		
		// enviando uma solicitação. Como se trata de uma solicitação síncrona, iremos utilizar o método .send()
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		// imprimir o conteúdo que foi recebido
		System.out.println("Status code: " + response.statusCode());
		System.out.println("Body: " + response.body());

	}

}
