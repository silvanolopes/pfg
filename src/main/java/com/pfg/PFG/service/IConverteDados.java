package com.pfg.PFG.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
