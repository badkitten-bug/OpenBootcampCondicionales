import java.rmi.StubNotFoundException;

public class caso4 {
    public static void main(String[] args) {
        var estacion = "ola";

        switch (estacion) {
            case "verano":
                System.out.println("hoy hace mucho calor");
                break;

            case "invierno":
                System.out.println("hoy hace mucho frio");
                break;
            case "otoño":
                System.out.println("hoy hace mucho viento");
                break;
            case "primavera":
                System.out.println("hoy hace mucho lluvia");
                break;
            default:
                System.out.println("no se que estacion es");
        }
    }
}