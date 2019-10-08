// Andrew and Cory
//
public class client {
    public static void main(String[] args) {
        System.out.println("Creating Database");

        Database db = new Database();

        db.Store();
        System.out.println("Changing Strategy to NoSQL");
        db.setStoreStrategy(new NoSQL());
        db.Store();
        System.out.println();

        System.out.println("Changing Strategy to Relational");
        db.setStoreStrategy(new Relational());
        db.Store();
        System.out.println();

        System.out.println("Changing Strategy to Graph");
        db.setStoreStrategy(new Graph());
        db.Store();
        System.out.println();
    }
}

class Database{
    private Strategy storageStrat;

    public Database(){

    }

    public void setStoreStrategy(Strategy strat){
        storageStrat = strat;
    }

    public void Store(){
        if(storageStrat == null){
            System.out.println("No Strategy type set");
        }
        else{
            storageStrat.Store();
        }
    }

}

abstract class Strategy{
    abstract void Store();
}

class NoSQL extends Strategy{
    public void Store(){
        DocumentStore();
    }

    private void DocumentStore(){
        System.out.println("Document Store");
    }
}

class Relational extends Strategy{
    public void Store(){
        TableStore();
    }

    private void TableStore(){
        System.out.println("Table Store");
    }
}

class Graph extends Strategy{
    public void Store(){
        NodeStore();
    }

    public void NodeStore(){
        System.out.println("Node Store");
    }
}

