package Modelos;

public record Busqueda_Api( String base_code, String target_code, double conversion_rate, double conversion_result, double cantidad ) {

    @Override
    public String toString() {
        return "{" + base_code + '}' +
                "corresponde al valor final ===>" + conversion_result +
                "{" + target_code + "}, conversion_rate=" + conversion_rate;


    }
}

