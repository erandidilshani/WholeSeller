
package modal;

import javax.swing.JButton;

public class Item {
    private String id;
    private String desc;
    private double price;
    private int qty;
    
    public Item() {
    }

    public Item(String id, String desc, double price, int qty) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        this.qty = qty;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", desc=" + desc + ", price=" + price + ", qty=" + qty + '}';
    }

    
}

