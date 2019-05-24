package com.artszu;

import java.io.*;

import javax.servlet.http.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

@ManagedBean
@SessionScoped

public class myservlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String Imie = req.getParameter("Imie");
        String Nazwisko = req.getParameter("Nazwisko");
        String Data_Urodzenia = req.getParameter("Data_Urodzenia");
        String Login = req.getParameter("Login");
        String Haslo = req.getParameter("Haslo");
        int ID_roli = Integer.parseInt(req.getParameter("ID_roli"));

        Members m = new Members(Imie, Nazwisko, Data_Urodzenia, Login, Haslo, ID_roli);

        HibernateUtil helper = null;
        Session session;

        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(m);
        session.getTransaction().commit();

        //res.sendRedirect("http://localhost:8084/WebApplicationCRM/");
        PrintWriter out = res.getWriter();

        int i = 1;

        while ((m = (Members) session.get(Members.class, i)) != null) {
            //m=(Members)session.get(Members.class, i);
            String name = m.getImie();
            String surname = m.getNazwisko();
            out.println(name + " " + surname);
            i++;
        }

        out.flush();
        out.close();
        session.close();

    }

}
