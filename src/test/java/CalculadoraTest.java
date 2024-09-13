import org.example.Calculadora;
import org.junit.jupiter.api.*;

public class CalculadoraTest {
@BeforeAll
public static void BeforeAll(){
    System.out.println(" Me ejecuto antes de todos los test");
}


@AfterAll

public static void AfterAll(){
    System.out.println(" Me ejecuto cuando finalizan  todos los test");
}


    @BeforeEach
    public  void BeforeEach(){
        System.out.println(" ANTES DE CADA TEST los test");
    }

    @AfterEach

    public  void AfterEach(){
        System.out.println(" DESPUES  DE CADA TEST los test");
    }
    @Test
    public void testSumar(){

  int a = 4;
  int b = 5;
  int resultado = 0;

    Calculadora cal = new Calculadora();
       resultado = cal.sumar(a,b);

        System.out.println("El resultado es :" + resultado);

    }

    @Test
    public void testSumar1(){

        int a = 7;
        int b = 7;
        int resultado = 0;

        Calculadora cal = new Calculadora();
        resultado = cal.sumar(a,b);

        System.out.println("El resultado del segundo método es :" + resultado);

    }


}
