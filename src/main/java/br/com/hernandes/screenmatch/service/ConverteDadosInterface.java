package br.com.hernandes.screenmatch.service;

public interface ConverteDadosInterface {

    <T> T obterDados(String json, Class<T> classe);

}
