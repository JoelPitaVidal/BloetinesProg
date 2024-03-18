
package exemplo.obxetos;





public class ExemploObxetos {


    public static void main(String[] args) {
        rectangulo obx= new rectangulo ();
        obx.darValorBase(5f);
        float ba = obx.devolverValorBase();
        System.out.println("bases es igual a "+ ba);
        obx.darValorAltura(10f);
        float alt = obx.devolverValorAltura();
        System.out.println("altura es igual a "+ alt);
        obx.calcularArea(5, 10);
        float per=obx.devolverValorAltura();
        System.out.println("perimetro es igual a "+ per);
        // instanciar un rectangulo con el constructor parametrizado
        rectangulo obxR= new rectangulo (12,6);
        System.out.println("base es igual a "+obx.devolverValorBase());
    }
    
}
