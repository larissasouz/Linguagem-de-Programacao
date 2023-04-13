package edu.fatec.lp2.exercicio2;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Data
public class ListaCompra implements Calculavel {
    private List<ItemCompra> itensCompra = new LinkedList<ItemCompra>();

    private int quantidadeMax = 20;

    public ListaCompra(int quantidadeMax){
    	this.quantidadeMax = quantidadeMax;
    }

    public void incluir(ItemCompra item){
    	if(quantidadeMax <= itensCompra.size()) {
    		itensCompra.add(item);
    	}
    }
    
    @Override
    public double calcularPreco() {
        double precos = 0;
        for(ItemCompra item:itensCompra){
            double preco = item.getProduto().getPreco();
            precos+= preco;
        }
        return precos;
    }
}