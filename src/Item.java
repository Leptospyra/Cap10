public class Item {
    private String itemNome;
    private double itemPreco;

    public Item(){
        setItem("", 0);
    }
    public Item(String itemNome, double itemPreco){
        setItem(itemNome, itemPreco);
    }

    public void setItem(String itemNome, double itemPreco) {
        this.setItemNome(itemNome);
        this.setitemPreco(itemPreco);
    }

    public String getItemNome() {
        return itemNome;
    }

    public double getitemPreco() {
        return itemPreco;
    }

    public void setItemNome(String itemNome) {
        this.itemNome = itemNome;
    }

    public void setitemPreco(double itemPreco) {
        this.itemPreco = itemPreco;
    }
}
