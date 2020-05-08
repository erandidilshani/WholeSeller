/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.util.ArrayList;

/**
 *
 * @author Dilshi
 */
public class Orders {
    private String id;
    private String date;
    private String customerid;
    private ArrayList<ItemDetails> itemDetails;

    public Orders() {
    }

    public Orders(String id, String date, String customerid, ArrayList<ItemDetails> itemDetails) {
        this.id = id;
        this.date = date;
        this.customerid = customerid;
        this.itemDetails = itemDetails;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the customerid
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * @param customerid the customerid to set
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * @return the itemDetails
     */
    public ArrayList<ItemDetails> getItemDetails() {
        return itemDetails;
    }

    /**
     * @param itemDetails the itemDetails to set
     */
    public void setItemDetails(ArrayList<ItemDetails> itemDetails) {
        this.itemDetails = itemDetails;
    }
    
    
            
}
