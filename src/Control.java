import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Control {
    private String name1;
    private String name2;
    private float n1;
    private float n2;
    private String timestamp;


    public Control(Monedas mon){
        this.name1 = mon.base_code();
        this.name2 = mon.target_code();
        this.n1 = mon.conversion_rate();
        this.n2 = mon.conversion_result();
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public float getN1() {
        return n1;
    }

    public float getN2() {
        return n2;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public  void resultado(){
        System.out.println("\nEl Precio de la Moneda ["+getName1()+"] es de: $"+getN1()+
                "\nCreando un total de: $"+getN2()+" ["+getName2()+"]");
    }
}
