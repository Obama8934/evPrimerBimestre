package evPrimerBIMESTRE;

public class veinticuatro {

	public static void main(String[] args) throws InterruptedException {

		int bateria = 100;

		System.out.println("100% de bateria  ");

		while (bateria >= 0) {

			System.out.println(bateria + " % ");

			bateria--;

			Thread.sleep(200);

			if (bateria == 20) {
				System.out.println("bateria baja ");
				Thread.sleep(1000);
			}

		}
		System.out.println(" bateria agotada ");

	}
}
