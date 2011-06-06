/***
 * Examples of jquery and ajax
 * Copyright (C) 2011 Alexandro Blanco <ti3r.bubblenet@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 */
package org.blanco.jqueryajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6023399436265090814L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String nombre = req.getParameter("nombre");
		resp.setContentType("text/plain");
		resp.getWriter().print("Hola: "+nombre);
		resp.getWriter().print("\nTu numero de Identificacion es: ");
		resp.getWriter().print(Math.random());
	}

	
	
}
