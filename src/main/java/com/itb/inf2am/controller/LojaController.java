package com.itb.inf2am.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2am.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		List<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		Produto p1 = new Produto();
		
		p1.setId(10l);
		p1.setNome("Máquina de lavar Brastemp 15l");
		p1.setDescricao("Máquina de Lavar Brastemp 15lcom painel digital");
		p1.setCodigoBarras("HDAGSJSBDYUDWAK289472");
		p1.setPreco(3515.64);
		p1.setCodStatus(false);
		
		Produto p2 = new Produto();
		
		p2.setId(11l);
		p2.setNome("Micro-ondas Eletrolux");
		p2.setDescricao("Micro-ondas Eletrolux 30l auto-limpante");
		p2.setCodigoBarras("JHAWDDUOAWHDI5835");
		p2.setPreco(2632.65);
		p2.setCodStatus(true);
		
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		return "produtos";
		
	}
	
	@GetMapping("/novo-produto")
	public String novoProduto() {
		
		return "novo-prod";
		
	}

}
