package br.com.alura.screenmatch.service;

public interface IConverteDados {
//    Criação de uma Interface usando boas práticas e Generics pra reaproveitar
//    o metodo de obtenção de dados, passando o Json no qual sera lido e a classe a ser retornada belo metodo
    <T>T obterDados(String json, Class<T> classe );
}
