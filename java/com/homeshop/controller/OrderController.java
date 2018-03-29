package com.homeshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.homeshop.dao.CartDao;
import com.homeshop.dao.CustomerOrderDao;
import com.homeshop.model.Cart;
import com.homeshop.model.CustomerOrder;
import com.homeshop.model.User;

@Controller
public class OrderController {

   @Autowired
    CartDao cartdao;
   

   CustomerOrderDao custo;

    @RequestMapping("/order/{cartId}")
    public String createOrder(@PathVariable("cartId") int cartId)
    {
        CustomerOrder customerOrder = new CustomerOrder();
        Cart cart = cartdao.getCartById(cartId);
        customerOrder.setCart(cart);

        User customer = cart.getUser();
        customerOrder.setUser(customer);
        customerOrder.setBillingAddress(customer.getBillingAddress());
        customer.setShippingAddress(customer.getShippingAddress());

        custo.addCustomerOrder(customerOrder);

        return "redirect:/checkout?cartId=" + cartId;

    }
@RequestMapping("/collectCustomer")
public ModelAndView ShowBilling()
{
	ModelAndView obj = new ModelAndView("collectCustomerInfo");
	return obj;
}
@RequestMapping("/collectShipping")
public ModelAndView ShowShipping()
{
	ModelAndView obj = new ModelAndView("collectShippingDetails");
	return obj;
}
@RequestMapping("/checkout")
public ModelAndView checkout()
{
	ModelAndView obj = new ModelAndView("checkOutCancelled");
	return obj;
}
@RequestMapping("/tHANKYOU")
public ModelAndView thankyou()
{
	ModelAndView obj = new ModelAndView("thankCustomer");
	return obj;
}
} // The End of Class;
