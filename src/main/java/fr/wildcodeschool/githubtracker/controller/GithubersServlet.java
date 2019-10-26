package fr.wildcodeschool.githubtracker.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.wildcodeschool.githubtracker.TestGithuber;
import fr.wildcodeschool.githubtracker.model.Githubers;

@WebServlet("/githubers")
public class GithubersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory
			.getLogger(TestGithuber.class);

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		GithubersServlet.LOGGER
		.error("L'utilisateur à demandé la page Githubers.jsp");
		
		ArrayList<Githubers> listGithubers = new ArrayList<>();

		Githubers git1 = new Githubers("Franck", "tonton@gmail.com", "ttonton", 1,
				"https://www.adresse1.com");
		Githubers git2 = new Githubers("Nina", "tata@gmail.com", "ttata", 2,
				"https://www.adresse1.com");
		Githubers git3 = new Githubers("Fouzi", "tutu@gmail.com", "ttutu", 3,
				"https://www.adresse1.com");
		Githubers git4 = new Githubers("Momo", "riri@gmail.com", "rriri", 4,
				"https://www.adresse1.com");
		Githubers git5 = new Githubers("Abdel", "fifi@gmail.com", "ffifi", 5,
				"https://www.adresse1.com");
		Githubers git6 = new Githubers("Greg", "loulou@gmail.com", "lloulou", 6,
				"https://www.adresse1.com");

		listGithubers.add(git1);
		listGithubers.add(git2);
		listGithubers.add(git3);
		listGithubers.add(git4);
		listGithubers.add(git5);
		listGithubers.add(git6);
		
		req.setAttribute("listGithubers" , listGithubers);
		
		this.getServletContext()
				.getRequestDispatcher("/WEB-INF/githubers.jsp")
				.forward(req, resp);
	}

}
