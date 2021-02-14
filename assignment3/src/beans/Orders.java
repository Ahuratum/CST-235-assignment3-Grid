/**
 * 
 */
package beans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Nick
 *
 */

@ManagedBean(name="orders")
@ViewScoped
public class Orders {
	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public Orders() {
		orders.add(new Order("06782", "USB Drive - 1GB", (float) 2.99, 1));
		orders.add(new Order("29837", "USB Drive - 2GB", (float) 3.99, 1));
		orders.add(new Order("25673", "USB Drive - 4GB", (float) 4.99, 1));
		orders.add(new Order("34756", "USB Drive - 8GB", (float) 6.99, 1));
		orders.add(new Order("98197", "USB Drive - 16GB", (float) 8.99, 1));
		orders.add(new Order("22435", "USB Drive - 32GB", (float) 11.99, 1));
		orders.add(new Order("22435", "USB Drive - 64GB", (float) 18.99, 1));
		orders.add(new Order("22435", "USB Drive - 128GB", (float) 29.99, 1));
		orders.add(new Order("22435", "USB Drive - 256GB", (float) 44.99, 1));
		orders.add(new Order("22435", "USB Drive - 512GB", (float) 59.99, 1));
		orders.add(new Order("22435", "USB Drive - 1TB", (float) 69.99, 1));
	}

	/**
	 * @return the orders
	 */
	public ArrayList<Order> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
}
