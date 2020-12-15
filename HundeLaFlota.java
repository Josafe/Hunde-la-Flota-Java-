package Funcions;
import java.util.Scanner;
public class HundeLaFlota {


/*public static int disparo (char tauler[][])
{
	Scanner llegir = new Scanner(System.in);

	//Simbols ocults

	char aigua = 'A';
	char tocat = 'X';

	int coordenadax = 0;
	int coordenaday = 0;

	System.out.println("Introdueix la fila on vols disparar");
	coordenadax = llegir.nextInt();
	System.out.println("Introdueix la columna on vols disparar");
	coordenaday = llegir.nextInt();

	int i = 0;
	int j = 0;

tauler[i][j] = tauler[coordenadax][coordenaday];

for (i = 0; i < tauler.length; i++)
{
	for (j = 0; j < tauler[i].length;j++)
	{
		if (coordenaday == '-')
		{
			coordenaday = aigua;
			System.out.println("Has tocat aigua");
		}
		System.out.println(tauler[i][j]);
	}
}
	return tauler;
}
*/
/*------------------------------------------Funcions dels barcos!-------------------------------------------------*/

	public static void portaaviones (char tauler[][],int contador, int x, int y) //Funcio del portaavions
	{
		char portaaviones = 'P'; //Declararem que el caracter dels portaavions es 'P'
		int i = 0;

		/*--------------------------------------Bucle per als portaavions-----------------------------------------*/

		int indexi = (int) (4 + Math.random()*((x-4)-0+1)); //Randomitzarem dues coordenades de la matriu
		int indexj = (int) (0 + Math.random()*(y-0+1));

		System.out.println("Portaavions: " + indexi + "|" + indexj);

		//int indexj = (int) (0 + Math.random()*tauler.length-0+1);

		for (i = 0; i < contador; i++)
		{
			if ((tauler[indexi][indexj] == '-') && (tauler[indexi-1][indexj] == '-') && (tauler[indexi-2][indexj] == '-') && (tauler[indexi-3][indexj] == '-') && (tauler[indexi-4][indexj] == '-'))
			{
				tauler[indexi][indexj] = portaaviones;
				tauler[indexi-1][indexj] = portaaviones; //Per a que no surtigue fora del rang del mapa si les coordenades son menors - iguals a 5 s'anira incrementant el valor de la i, per a incrementar-ho verticalment
				tauler[indexi-2][indexj] = portaaviones;
				tauler[indexi-3][indexj] = portaaviones;
				tauler[indexi-4][indexj] = portaaviones;
			}
			else
			{
				i--;
			}

		}
	}

	public static void acorazado (char tauler[][], int contador,int x, int y) //Funcio del acorazado
	{
		char acorazado = 'Z';
		int i = 0;

		/*-------------------------------------Bucle per als acorazados-----------------------------------------*/

		int indexi = (int) (0 + Math.random()*x-0+1);
		int indexj = (int) (3 + Math.random()*(y-3)-0+1); //Randomitzarem dues coordenades de la matriu
		//int indexj = (int) (3 + Math.random()*6-3+0);

		//System.out.println("Index acorazado: " + indexi + "|" + indexj);

		for (i = 0; i < contador; i++)
		{
			if (tauler[indexi][indexj] == '-' & tauler[indexi][indexj-1] == '-' & tauler[indexi][indexj-2] == '-' & tauler[indexi][indexj-3] == '-')
			{
					tauler[indexi][indexj] = acorazado;
					tauler[indexi][indexj-1] = acorazado;
					tauler[indexi][indexj-2] = acorazado;
					tauler[indexi][indexj-3] = acorazado;
			}
			else
			{
				i--;
			}
		}
	}

	public static void buque (char tauler[][], int contador, int x, int y) //Funcio del buques
	{
		char buque = 'B';
		int i = 0;
		int indexi = 0;
		int indexj = 0;


				/*--------------------------------------Bucle per als buques-----------------------------------------*/



	for (i = 0; i < contador; i++)
		{

		indexi = (int)(0 + Math.random()*(x-0+1));
		indexj = (int)(2 + Math.random()*((y-2)-0+1));//Randomitzarem dues coordenades de la matriu
		//int indexj = (int)(2 + Math.random()*7-2+1);

		System.out.println("Index buques: " + indexi + "|" + indexj);


	if (tauler[indexi][indexj] == '-' & tauler[indexi][indexj-1] == '-' & tauler[indexi][indexj-2] == '-')
	{
				tauler[indexi][indexj] = buque;
				tauler[indexi][indexj-1] = buque;
				tauler[indexi][indexj-2] = buque;
	}

		else
		{
		i--;
		}
		}
	}


	public static void lancha (char tauler[][], int contador, int x, int y) //funcio de les lanches
	{

		char lancha = 'L';
		int i = 0;
		int coordenadax = 0;
		int coordenaday = 0;


			/*-------------------------------------Bucle per a les llanxes-----------------------------------------*/



			for (i = 0; i < contador; i++) //Bucle per a introduir lanchas
			{
				coordenadax = (int) (0 + Math.random()*x-0+1);
				coordenaday = (int) (0 + Math.random()*y-0+1);

				System.out.println("Index lanches: " + coordenadax + "|" + coordenaday);

				tauler[coordenadax][coordenaday] = lancha;
			}

	}

			/*-----------------------------------------Tauler ocult!---------------------------------------------*/

	public static void taulerocult (char tauler[][],char taulerO[][]){ //Amb aquesta funcio crearem el tauler ocult

		char lletra = 'A';

		System.out.println("  1 2 3 4 5 6 7 8 9 10");

		for (int i = 0; i < tauler.length; i++)
		{
				System.out.print(lletra);
				System.out.print(" ");
				lletra++;

			 for (int j = 0; j < tauler[i].length; j++)
			{
				System.out.print(tauler[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
			/*---------------------------------Tauler amb posicions mostrades!--------------------------------------------*/
	public static void mostratauler (char tauler[][]){ //Amb aquesta funcio crearem el tauler que mostra les poscions

		char lletra = 'A';

		System.out.println("  0 1 2 3 4 5 6 7 8 9");

		for (int i = 0; i < tauler.length; i++)
		{
				System.out.print(lletra);
				System.out.print(" ");
				lletra++;

		   for (int j = 0; j < tauler[i].length; j++)
			{
				/*-----------------------------------------------------------------------------------------------*/
				System.out.print(tauler[i][j]);
				System.out.print(" ");
			}
				System.out.println("");
		}
	}



	public static void creartauler (char tauler[][])
	{
		//Tauler de joc ocult
			for (int i = 0; i < tauler.length; i++)
			{

			   for (int j = 0; j < tauler[i].length; j++)
				{
					tauler[i][j] = '-';
				}
			}
	}


	public static void main(String[]args) {

		Scanner llegir = new Scanner(System.in);

		int x = 10;
		int y = 10;
		int intents = 0;
		char tauler[][];
		tauler = new char[x][y];




		//Funcions taules
		creartauler(tauler);

	 	char taulerO[][];
		taulerO = new char[x][y];
		System.out.println("  Tauler ocult");
		taulerocult(tauler,taulerO);




		System.out.println("  Tauler visible");
		mostratauler(tauler);

		//Menu de nivells
		System.out.println("Introdueix el nivell de dificultat que vols jugar: \n1: Facil \n2: Mitja \n3: Dificil \n4: Personalitzat");
		int nivells = llegir.nextInt();


		switch (nivells) {

		case 1:

			x = 10;
			y = 10;

			portaaviones(tauler, 1, x-1, y-1);
			acorazado(tauler, 1, x-1, y-1);
			buque(tauler, 3, x-1, y-1);
			lancha(tauler, 5, x-1, y-1);
			mostratauler(tauler);

			if (intents == 50)
			{
				System.out.println("Has arribat al nº maxim d'intents, has perdut");
			break;
			}

		case 2:

			x = 10;
			y = 10;
			lancha(tauler, 2, x-1, y-1);
			buque(tauler, 1, x-1, y-1);
			acorazado(tauler, 1, x-1, y-1);
			portaaviones(tauler, 1, x-1, y-1);
			mostratauler(tauler);
			break;

		case 3:
			x = 10;
			y = 10;

			lancha(tauler, 1, x-1, y-1);
			buque(tauler, 1, x-1, y-1);
			mostratauler(tauler);
		//	disparo(tauler);
			break;

		case 4:

			System.out.println("Introdueix el nº de files");
			x = llegir.nextInt();

			System.out.println("Introdueix el nº de columnes");
			y = llegir.nextInt();

			tauler = new char [x][y];

			System.out.println("Introdueix el nº de lanches");
			lancha(tauler,llegir.nextInt(), x, y);

			System.out.println("Introdueix el nº de buques");
			buque(tauler,llegir.nextInt(), x, y);

			System.out.println("Introdueix el nº de acorazados");
			acorazado(tauler,llegir.nextInt(), x, y);

			System.out.println("Introdueix el nº de portaavions");
			portaaviones(tauler,llegir.nextInt(), x, y);

			mostratauler(tauler);
			break;
		}




	}
}
