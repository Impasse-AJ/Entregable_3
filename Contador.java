package mispaquetes;

public class Contador extends Thread {

//Gonzalo manco
	Boolean contadorMarcha = true;

	public Contador() {
	}

	public void contador() {
		try {
			int i = 0;
			while (contadorMarcha) {
				System.out.printf(i + " %n");
				Thread.sleep(1000);
				i++;
			}
		} catch (InterruptedException e) {
			return;
		}
	}

	@Override
	public void run() {
		this.contador();
	}
}
