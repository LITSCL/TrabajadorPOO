package cl.inacap.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.model.Trabajador;
import cl.inacap.model.TrabajadorDAO;

/**
 * Servlet implementation class TrabajadorControlador
 */
@WebServlet("/TrabajadorControlador")
public class TrabajadorControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrabajadorControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//1. Se traen los datos.
				String nombre = request.getParameter("nombre");
				String apellido = request.getParameter("apellido");
				String edad = request.getParameter("edad");
				String pais = request.getParameter("pais");
				String tecnologia = request.getParameter("tecnologia");
				String comentario = request.getParameter("comentario");
				String experiencia = request.getParameter("experiencia");
				
				//2. Se crea el objeto.
				Trabajador tr = new Trabajador();
				tr.setNombre(nombre);
				tr.setApellido(apellido);
				tr.setEdad(Integer.parseInt(edad));
				tr.setPais(pais);
				tr.setTecnologia(tecnologia);
				tr.setComentario(comentario);
				tr.setExperiencia(experiencia);
				
				//3. Se a�ade el objeto a la lista.			
				TrabajadorDAO daoTrabajadores = new TrabajadorDAO();
				daoTrabajadores.save(tr); //Se a�ade el objeto a su respectivo Modelo.
				List<Trabajador> listaTrabajadores = daoTrabajadores.getAll(); //Aca se trae la lista.
				
				request.setAttribute("listaTrabajadores", listaTrabajadores);
				request.getRequestDispatcher("vista_trabajador.jsp").forward(request, response); //Aca se utiliza la interfaz RequestDispatcher para indicar a donde enviar los datos y el m�todo forward para enviar los datos.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
