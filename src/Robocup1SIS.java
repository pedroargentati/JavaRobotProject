import java.util.Scanner;

public class Robocup1SIS {

	public static final int FRENTE = 1;
	public static final int TRAS = 2;
	public static final int ESQUERDA = 3;
	public static final int DIREITA = 4;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int direcao, comando, distancia, Xrobo, Yrobo, Xtrofeu, Ytrofeu;

		direcao = 0;
		distancia = 0;
		comando = 0;

		// Coordenadas Robô e Troféu
		Xrobo = 1;
		Yrobo = 5;
		Xtrofeu = 15;
		Ytrofeu = 4;

		direcao = 0;
		while((direcao != FRENTE && direcao != TRAS && direcao != DIREITA && direcao != ESQUERDA) && (distancia <= 0 || distancia % 10 != 0)) 
		{
			System.out.println("| Informe o " + (comando + 1) + "° comando |");
			System.out.print("* Informe a direção: ");
			direcao = teclado.nextInt();
			System.out.print("* Informe a distância: ");
			distancia = teclado.nextInt();
			System.out.println("--------------------------------------------");
		}

		if(direcao == FRENTE && distancia == 60)
		{
			System.out.println("Os comandos estão corretos! Siga em frente.");
			comando++;
			Xrobo = Xrobo + (distancia / 10);

			direcao = 0;
			while((direcao != FRENTE && direcao != TRAS && direcao != DIREITA && direcao != ESQUERDA) || (distancia <= 0 || distancia % 10 != 0))
			{
				System.out.println("| Informe o " + (comando + 1) + "° comando |");
				System.out.print("* Informe a direção: ");
				direcao = teclado.nextInt();
				System.out.print("* Informe a distância: ");
				distancia = teclado.nextInt();
				System.out.println("--------------------------------------------");
			}

			if(direcao == ESQUERDA && distancia == 50) {
				System.out.print("Os comandos estão corretos! Siga em frente.");
				comando++;
				Xrobo = Xrobo + (distancia / 10);

				direcao = 0;
				while((direcao != FRENTE && direcao != TRAS && direcao != DIREITA && direcao != ESQUERDA) || (distancia <= 0 || distancia % 10 != 0)) 
				{
					System.out.println("\n| Informe o " + (comando + 1) + "° comando |");
					System.out.print("* Informe a direção: ");
					direcao = teclado.nextInt();
					System.out.print("* Informe a distância: ");
					distancia = teclado.nextInt();
					System.out.println("--------------------------------------------");
				}

				if(direcao == FRENTE && distancia == 80) {
					System.out.print("Os comandos estão corretos! Siga em frente.");
					comando++;
					Xrobo = Xrobo + (distancia / 10);

					direcao = 0;
					while((direcao != FRENTE && direcao != TRAS && direcao != DIREITA && direcao != ESQUERDA) || (distancia <= 0 || distancia % 10 != 0)) {
						System.out.println("\n| Informe o " + (comando + 1) + "° comando |");
						System.out.print("* Informe a direção: ");
						direcao = teclado.nextInt();
						System.out.print("* Informe a distância: ");
						distancia = teclado.nextInt();
						System.out.println("--------------------------------------------");
					}
				}
				else
					System.out.println("O comando está incorreto! A missão será abortada.");
				if(direcao == DIREITA && distancia == 60) {
					System.out.print("Os comandos estão corretos! Siga em frente.");
					comando++;
					Xrobo = Xrobo + (distancia / 10);

					if(Xrobo == Xtrofeu && Yrobo == Ytrofeu && comando == 4) 
						System.out.println("O objetivo foi alcançado com sucesso. Parabéns!");
					else
						System.out.println("O objetivo não foi alcançado! Tente novamente.");
				}
				else
					System.out.println("O comando está incorreto! A missão será abortada.");
			}
			else 
				System.out.println("O comando está incorreto! A missão será abortada.");
		} else 
			System.out.println("O comando está incorreto! A missão será abortada.");
		
			teclado.close();
	}
}
