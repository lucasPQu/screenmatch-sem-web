package br.com.alura.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    //Recebe o endereço da API na entrada da Operação
    public String obterDados( String endereco) {
        // Criando o HttpClient
        HttpClient client = HttpClient.newHttpClient();
        //Criando o HttpRequest junto com a URL passada na variavel endereco
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        //Criando o HttpResponse e setando como o tipo String e null
        HttpResponse<String> response = null;

        //Recebe os dados e os converte para string e caso ocorra algum erro dos tipos citados no catch, ele exibe no console.
        try {
            response = client.send(request,HttpResponse.BodyHandlers.ofString());
        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }

        String json = response.body();
        return json;
    };
}
