package constructor.newpackage;
public class Example {
    String name ;
    int id;
    Example(String name ,int id){
        this.name=name;
        this.id=id;
        
    }
    Example(Example ob2){
        this.name=ob2.name;
        this.id=ob2.id;
    }
}

