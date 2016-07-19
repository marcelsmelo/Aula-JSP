package br.marcel.melo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="FiltroBasico", urlPatterns={"/ServletFiltrado", "/ServletFiltrado2"})
public class FiltroAnotations implements Filter {
	
	public void destroy() {
		System.out.println("[INFO] Destruindo Filtro Anotations...");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("[INFO] Filtro Funcionando Anotations...");
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("[INFO] Inicializando Filtro Anotations...");
	}

}
