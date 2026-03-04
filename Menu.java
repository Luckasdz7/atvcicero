package atvcicero;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Cauluadora1 cal = new Cauluadora1();
		DadosEntrada de = new DadosEntrada();
		
		
		int m = 0;
		
		
			while(m != 1 && m != 2) {
				System.out.print("Escolha: Cauculador Padrao = 1, " + "\n" + "Cauculadora Eq Segundo Grau = 2 "+ "SAIR = 0");
				 m = sc.nextInt();
			}
			if(m == 1) {
				int n = -1;
				
				while(n != 0) {
				

				System.out.print("informe a operação");
				 n = sc.nextInt();	
				 while(n != 1 && n != 2 && n != 3 && n!= 4 && n != 0) {
					 System.out.print("informe a operação");
					 n = sc.nextInt();
				 }
				 if(n != 0) {
					 System.out.print("informe os numeros a serem operados");
						float a = sc.nextInt();
						float b = sc.nextInt();
						
						cal.setA(a);
						cal.setB(b);
						
						if(n == 1) System.out.println(cal.soma());
						if(n == 2 ) System.out.println(cal.subtrair());
						if(n == 3) System.out.println(cal.multilicar());
						if(n == 4) System.out.println(cal.dividir());
						}else {
							m = -1;
						}
				 }
				
			}else {
				int respor = 0;
				while(respor != 1) {
				System.out.print("informe os 3 valores(a, b , c)");
				 de.setA(sc.nextInt());
			        de.setB(sc.nextInt());
			        de.setC(sc.nextInt());
			   
			        System.out.println("Dados de Entrada");
			        System.out.println("A: "+de.getA());
			        System.out.println("B: "+de.getB());
			        System.out.println("C: "+de.getC());
			        CalcularEqSegGrau esg = new CalcularEqSegGrau();
			        DadosSaida ds = esg.delta(de);
			        esg.x1l(de);
			        esg.x12(de);
			        esg.xV(de);
			        esg.yV(de);
			        System.out.println("Delta: "+ds.getDelta());
			        System.out.println("X¹: "+ds.getX1l());
			        System.out.println("X²: "+ds.getX2l());
			        System.out.println("xV: "+ds.getxV());
			        System.out.println("yV: "+ds.getyV()); 
			        System.out.println("FAZER CAUCULO NOVAMENTE? SIM = 0, NAO = 1");
			        respor = sc.nextInt();
				}
				
			}
			
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
	}

}
