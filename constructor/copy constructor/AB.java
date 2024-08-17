package copyconstructor;
public class AB {
    String name;
    int id;
    AB(String name,int id){
        this.name=name;
        this.id=id;
        }
    AB(AB ob2){
       this.name=ob2.name;
        this.id=ob2.id; 
    }
    
}

