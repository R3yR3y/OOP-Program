/**********************************************************
 * File: sample.Product.java
 * Author: Reinier Escalona Diaz
 * Class: COP3003; 201809, 80602
 * Purpose: Abstract class that implements the functionality
 *          described in Item.java along with adding a toString
 *          to print out a general outlook.
 * Source:  Code written to satisfy Oracle Academy's
 *          OraclProduction project. All rights to the
 *          document and project document belong to
 *          Oracle.
 *********************************************************/

package sample;

import java.util.Date;


/**
 * Abstract class that implements the functionality
 *  described in Item.java
 *
 * @author Reinier Escalona Diaz
 */

public abstract class Product implements Item {

    private int serialNumber;
    private String manufacturer = Item.manufacturer;
    private Date manufacturedOn;
    private String name;
    private static int currentProductionNumber = 1;

    /**
     * Constructor that takes in the the name of the product
     * and set this to the field variable name. It will also
     * assign a serial number from the currentProductionNumber.
     * The currentProductionNumber will be incremented in
     * readiness for the next instance and sets the current
     * date and time.
     *
     * @param prodName String used to assign a value to the
     *                 name variable.
     */
    public Product(String prodName) {
        name = prodName;
        serialNumber = currentProductionNumber;

        currentProductionNumber++;

        manufacturedOn = new Date();
    }

    /**
     * Sets currentProductionNumber to the new
     * specified number.
     *
     * @param prodNum An production number
     */
    public void setProductionNumber(int prodNum) {
        currentProductionNumber = prodNum;
    }

    /**
     * Sets name input to the item
     *
     * @param name A string name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns the name of an item
     *
     * @return string name of an item
     */
    public String getName() {
        return name;
    }

    /**
     * returns the Date that the item was made
     *
     * @return date item was made on as a Date
     *          data type
     */
    public Date getManufactureDate() {
        return manufacturedOn;
    }

    /**
     * returns the current serial number of an item
     *
     * @return int serial number
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * displays the manufacturer number, serial number,
     * date produced, and name of an item
     *
     * @return  String representation of elements listed
     */
    public String toString() {
        return "Manufacturer : " + manufacturer
                + "\nSerial Number : " + serialNumber
                + "\nDate : " + manufacturedOn
                + "\nName : " + name;
    }

}
