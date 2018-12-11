/**********************************************************
 * File: sample.Item.java
 * Author: Reinier Escalona Diaz
 * Class: COP3003; 201809, 80602
 * Purpose: Used as the main interface for classes to
 *          implement its functions.
 * Source:  Code written to satisfy Oracle Academy's
 *          OraclProduction project. All rights to the
 *          document and project document belong to
 *          Oracle.
 *********************************************************/

package sample;

import java.util.Date;                      // used to make a Date datatype

/**
 * Main interface used to implement all items specified in it.
 *
 * @author Reinier Escalona Diaz
 */

public interface Item {

    public final String manufacturer = "OracleProduction";

    /**
     * Sets currentProductionNumber to the new
     * specified number.
     *
     * @param prodNum An production number
     */
    public void setProductionNumber(int prodNum);

    /**
     * returns the name of an item
     *
     * @return string name of an item
     */
    public void setName(String name);

    /**
     * returns the name of an item
     *
     * @return string name of an item
     */
    public String getName();

    /**
     * returns the Date that the item was made
     *
     * @return date item was made on as a Date
     *          data type
     */
    public Date getManufactureDate();

    /**
     * returns the current serial number of an item
     *
     * @return int serial number
     */
    public int getSerialNumber();

}


