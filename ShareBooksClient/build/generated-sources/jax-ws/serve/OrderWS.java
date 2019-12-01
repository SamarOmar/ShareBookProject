
package serve;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OrderWS", targetNamespace = "http://serve/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OrderWS {


    /**
     * 
     * @param orderId
     * @param isbn
     * @param userName
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "UpdateOrderStatus")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpdateOrderStatus", targetNamespace = "http://serve/", className = "serve.UpdateOrderStatus")
    @ResponseWrapper(localName = "UpdateOrderStatusResponse", targetNamespace = "http://serve/", className = "serve.UpdateOrderStatusResponse")
    @Action(input = "http://serve/OrderWS/UpdateOrderStatusRequest", output = "http://serve/OrderWS/UpdateOrderStatusResponse")
    public boolean updateOrderStatus(
        @WebParam(name = "OrderId", targetNamespace = "")
        int orderId,
        @WebParam(name = "ISBN", targetNamespace = "")
        int isbn,
        @WebParam(name = "UserName", targetNamespace = "")
        String userName);

    /**
     * 
     * @param userName
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "viewOrders", targetNamespace = "http://serve/", className = "serve.ViewOrders")
    @ResponseWrapper(localName = "viewOrdersResponse", targetNamespace = "http://serve/", className = "serve.ViewOrdersResponse")
    @Action(input = "http://serve/OrderWS/viewOrdersRequest", output = "http://serve/OrderWS/viewOrdersResponse")
    public List<Object> viewOrders(
        @WebParam(name = "UserName", targetNamespace = "")
        String userName);

    /**
     * 
     * @param isbn
     * @param userName
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CreatNewOrder")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CreatNewOrder", targetNamespace = "http://serve/", className = "serve.CreatNewOrder")
    @ResponseWrapper(localName = "CreatNewOrderResponse", targetNamespace = "http://serve/", className = "serve.CreatNewOrderResponse")
    @Action(input = "http://serve/OrderWS/CreatNewOrderRequest", output = "http://serve/OrderWS/CreatNewOrderResponse")
    public boolean creatNewOrder(
        @WebParam(name = "ISBN", targetNamespace = "")
        int isbn,
        @WebParam(name = "UserName", targetNamespace = "")
        String userName);

}
