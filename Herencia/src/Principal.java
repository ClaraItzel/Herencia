
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal= new Animal();
		animal.nombre= "Pollo";
		 System.out.println(animal.nombre+" esta "+ animal.comer());
		 Perro oso= new Perro();
		 oso.color= "amarillo";
		 System.out.println(oso.ladrar());
		System.out.println(oso.dormir());
		
		michi kirababy= new michi();
		 System.out.println(kirababy.comer());
		}

}
