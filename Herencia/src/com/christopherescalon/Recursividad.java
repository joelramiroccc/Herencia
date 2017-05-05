

public class Recursividad {

    public static void main(String[] args) {
     // String[5] frutas = { "Pera", "Manzana", "Uvas", "Naranjas", "Durazno" };
	  //buscar("Uvas");
	  
	  contara(5);
      //System.out.println(suma(2,3));
      //System.out.println(resta(5,3));
    }

    public static void contara(int aumento){
        if(aumento>0){
      // System.out.println(aumento);
        contara(--aumento);
		System.out.println(aumento+1);
        }


    }

    public static int suma(int value1,int value2){
        if(value2==0){
			return value1;
		}else{
			value1++;
			return suma(value1,--value2);

		}

    }

    public static int resta(int valor1,int valor2){
		if(valor2==0){
			return valor1;
		}else{
			valor2--;
			return resta(--valor1,valor2);

		}
    }
	
	//public static String buscar(){
		
		
	//}

}

