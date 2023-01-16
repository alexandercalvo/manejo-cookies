package org.learning.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.learning.beans.Product;
import org.learning.services.ProductService;
import org.learning.services.ProductServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/producto-excel", "/producto.html"})
public class ProductoXls extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductService productoservice = new ProductServiceImpl();
		List<Product> products = productoservice.getProducts();
		String url = req.getServletPath();
		
		resp.setContentType("text/html");
		
		try (PrintWriter out = resp.getWriter()) {
			
			out.println("<DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<title>Listado de productos</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Listado de productos</h1>");
			
			
			out.print("<table>");
			out.print("<tr>");
			out.print("<th>ID</th>");
			out.print("<th>NOBRE DEL PRODUCTO</th>");
			out.print("<th>CATEGORIA PRODUCTO </th>");
			out.print("<th>PRECIO PRODUCTO</th>");
			out.print("</tr>");
			products.forEach((product)->{
				out.print("<tr>");
				out.print("<td>"+product.getIdProduct()+"</td>");
				out.print("<td>"+product.getNameProduct()+"</td>");
				out.print("<td>"+product.getType()+"</td>");
				out.print("<td>"+product.getPrice()+"</td>");
				out.print("</tr>");
			});
		
			out.print("</table>");
		
				out.println("</body>");
				out.println("<html>");
			

		}
	}
}
