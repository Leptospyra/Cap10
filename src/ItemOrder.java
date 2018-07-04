public class ItemOrder extends Item {
    private Item item;
    private int quantidade;

    public ItemOrder(Item item, int quantidade ){
        this.setItem(item.getItemNome(), item.getitemPreco());
        this.setQuantidade(quantidade);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getCustoUnitario(){
        return this.getitemPreco() * getQuantidade();
    }
}

