package dio.Façade;
import org.talesolutions.CEP;

public class Main {
  public String getCEP (String endereço, String numero, String estado) {
    CEP CEP = new cep(endereço, numero, estado);

    return CEP.toString();
  }
}
