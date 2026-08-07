package application;

import java.util.Date;

import modelo.dao.DaoFabrica;
import modelo.dao.VendedorDao;
import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		VendedorDao vendedorDao = DaoFabrica.criaVendedorDao();
		
		System.out.println("=== TESTE 1: Vendedor findById ====");
		Vendedor vendedor = vendedorDao.findById(3);
		System.out.println(vendedor);
		
			
			
			
		
		
		
		

	}

}
