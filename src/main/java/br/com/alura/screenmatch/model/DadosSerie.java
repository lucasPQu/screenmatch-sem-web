package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//o @JsonIgnoreProperties ignora os outros valores do JSON que não estão mapeados no Record
@JsonIgnoreProperties(ignoreUnknown = true)
//O @JsonAlias consegue dar um apelido a um valor vindo de um Json.
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {


}
