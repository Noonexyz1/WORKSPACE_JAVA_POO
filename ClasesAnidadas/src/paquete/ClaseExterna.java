package paquete;

public class ClaseExterna {
	int x = 30;
	
	//static
	public class ClaseInterna{
		//int y = 20;
		public int objInternoMetodo() {
			return x;
		}
	}
}
