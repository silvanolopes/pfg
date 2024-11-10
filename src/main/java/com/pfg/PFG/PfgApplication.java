package com.pfg.PFG;

import com.pfg.PFG.model.DadosSerie;
import com.pfg.PFG.service.ConsumoAPI;
import com.pfg.PFG.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PfgApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PfgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=miami+vice&type=Series&apikey=6a62f5e2");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
