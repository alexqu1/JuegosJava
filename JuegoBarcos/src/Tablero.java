import java.util.Scanner;

public class Tablero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada =new Scanner(System.in);
		
		String cordenadas = "";
		
		String cordenadasHundir = "";
		
		int barcosHundidos = 0;
		
		int comprobar = 0;
		
		String [][] matrix = new String[5][5];
		
		matrix[0][0]=" ";
		matrix[0][1]="1";
		matrix[0][2]="2";
		matrix[0][3]="3";
		matrix[0][4]="4";
		
		
		matrix[1][0]="A";
		matrix[1][1]="A";
		matrix[1][2]="A";
		matrix[1][3]="A";
		matrix[1][4]="A";
		
		matrix[2][0]="B";
		matrix[2][1]="A";
		matrix[2][2]="A";
		matrix[2][3]="A";
		matrix[2][4]="A";
		
		matrix[3][0]="C";
		matrix[3][1]="A";
		matrix[3][2]="A";
		matrix[3][3]="A";
		matrix[3][4]="A";
		
		
		matrix[4][0]="D";
		matrix[4][1]="A";
		matrix[4][2]="A";
		matrix[4][3]="A";
		matrix[4][4]="A";
		
	
//		pintar tablero
		
		for (int i = 0; i < 5; i++) {
			System.out.println("");
			
			for (int j = 0; j <5; j++) {
				System.out.print(	matrix[i][j]+ " ");
			
			}
		}
		
		
		//fin
		
		System.out.println(" ");
		System.out.println(" Inserte La cordenada para Poner tus Barcos ejem:A1 , b2 ,c3 ,d2 ");

		
		
		do {
		cordenadas =entrada.nextLine();

			if (cordenadas.equalsIgnoreCase("A1")) {
				matrix[1][1]="B";
				comprobar++;
			}else if (cordenadas.equalsIgnoreCase("A2")) {
				matrix[1][2]="B";
				comprobar++;
			}
			else if (cordenadas.equalsIgnoreCase("A3")) {
				matrix[1][3]="B";
				comprobar++;
			} 
			else if (cordenadas.equalsIgnoreCase("A4")) {
				matrix[1][4]="B";
				comprobar++;
			}
			
			else	if (cordenadas.equalsIgnoreCase("B1")) {
				matrix[2][1]="B";
				comprobar++;
			}else if (cordenadas.equalsIgnoreCase("B2")) {
				matrix[2][2]="B";
				comprobar++;
			}
			else if (cordenadas.equalsIgnoreCase("B3")) {
				matrix[2][3]="B";
				comprobar++;
			} 
			else if (cordenadas.equalsIgnoreCase("B4")) {
				matrix[2][4]="B";
				comprobar++;
			} 
			
			else if (cordenadas.equalsIgnoreCase("C1")) {
				matrix[3][1]="B";
				comprobar++;
			}else if (cordenadas.equalsIgnoreCase("C2")) {
				matrix[3][2]="B";
				comprobar++;
			}
			else if (cordenadas.equalsIgnoreCase("C3")) {
				matrix[3][3]="B";
				comprobar++;
			} 
			else if (cordenadas.equalsIgnoreCase("C4")) {
				matrix[3][4]="B";
				comprobar++;
			} 
			
			else if (cordenadas.equalsIgnoreCase("D1")) {
				matrix[4][1]="B";
				comprobar++;
			}else if (cordenadas.equalsIgnoreCase("D2")) {
				matrix[4][2]="B";
				comprobar++;
			}
			else if (cordenadas.equalsIgnoreCase("D3")) {
				matrix[4][3]="B";
				comprobar++;
			} 
			else if (cordenadas.equalsIgnoreCase("D4")) {
				matrix[4][4]="B";
				comprobar++;
			} else {
				System.out.println("Inserta cordenada correcta");
			}
			
	} while (comprobar == 0);

//		pintar tablero
		
		for (int i = 0; i < 5; i++) {
			System.out.println("");
			
			for (int j = 0; j <5; j++) {
				System.out.print(	matrix[i][j]+ " ");
			
			}
		}
			
		//Fin
			while (!cordenadasHundir.equalsIgnoreCase(cordenadas)) {

				System.out.println(" ");
				System.out.println(" Inserte La cordenada para Hundir el Barco ");
				cordenadasHundir =entrada.nextLine();
				
				if (cordenadasHundir.equalsIgnoreCase(cordenadas)) {
					
					System.out.println(" Has hundido el barco de la posicion "+cordenadasHundir);
					
				}else {
					System.out.println(" Prueba otra vez");
				
			}
			
			}
			
			
			
			
	}

}
