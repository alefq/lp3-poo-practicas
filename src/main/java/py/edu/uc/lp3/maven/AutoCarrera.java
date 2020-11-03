package py.edu.uc.lp3.maven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by afeltes on 26/10/17.
 */

public class AutoCarrera extends Auto {
    //Una propiedad simple para el sponsor principal
    String principalSponsor;

    //Declaramos una lista de String para guardar los sponsors
    List<String> otroSponsors;

    public static void main(String[] args) {
        //Instanciamos un objeto de tipo AutoCarrera
        AutoCarrera autoCarrera = new AutoCarrera();
        //Inicializamos valores para poder tener datos que describan al auto
        autoCarrera.inicializar();
        //Imprimimos una descripción en la consola
        System.out.println(autoCarrera.describe());
    }

    public void inicializar() {
        //Este auto sólo existe en el scope del método inicializar
        Auto hyundai = new Auto();
        //Estos valores sólo afectan a la instancia hyundai
        hyundai.anho = 2014;
        hyundai.modelo = "i30";

        //Estos valores, afectan a la instancia que se construye desde el método main en este caso
        marca = "Toyota";
        anho = 2015;
        modelo = "corolla";
        principalSponsor = "Lubrax";

        //Inicializamos el array de otros Sponsors
        //creando una instancia a la vez
        otroSponsors = new ArrayList<>();
        otroSponsors.add("LG");
        otroSponsors.add("Toshiba");
        otroSponsors.add("Heineken");
    }

    public String describe() {
        //Inicializamos el array de otros Sponsors
        //haciendo uso de la utilidad de la clase Arruys
        otroSponsors = Arrays.asList("LG", "Toshiba", "Heineken");
        String description = "Marca: " + marca + ", Modelo: "
                + modelo + ", Año: "
                + anho + ", Sponsor Principal: " + principalSponsor + ", otros Sponsors: " + otroSponsors;
        return description;
    }
}
