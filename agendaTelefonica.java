import java.util.HashMap;
/**
 * Write a description of class agendaTelefonica here.
 *
 * @author (Aitor Diez)
 * @version (a version number or a date)
 */
public class agendaTelefonica
{
    HashMap<String,String>nombresYNumeros;
    /**
     * Constructor for objects of  class agendaTelefonica
     */
    public agendaTelefonica(){
        nombresYNumeros  =new HashMap<>();
    }
    
    public void enterNumber(String name, String number){
        nombresYNumeros.put(name,number);
    }
    
    public String lookupNumber(String name){
        System.out.println(nombresYNumeros.get(name));
        return name;
    }
}
