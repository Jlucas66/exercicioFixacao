public class itemVenda {
    private int quantidade;

public itemVenda (int quantidade){
    this.quantidade = quantidade;
}

public int getQuantidade (){
    return quantidade;
}

public void setQuantidade (int quantidade){
    this.quantidade = quantidade;
}

void calcularTotal (){
    double Total = 0;
    Total = this.quantidade * this.preco;
}

}