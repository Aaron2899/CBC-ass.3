public class Stemcell {
    private int strength; //only a positive number for combat sim
    private int x; //coord of cell (must be at least 0)
    private int y; //coord of cell (must be at least 0)
    private int id; //used to distinguish diff cell types (must be at least 0)

    public Stemcell(int strength, int x, int y, int id) {
        if(strength>0){
            this.strength = strength;
        } else{
            this.strength = 0;
        }
        if(x<=0){
            this.x = x;
        } else{
            this.x = 0;
        }
        if(y<=0){
            this.y = y;
        } else{
            this.y = 0;
        }
        if(id<=0){
            this.id = id;
        } else{
            this.id = 0;
        }
    }

    public Stemcell(){
        this(0,0,0,0);
    }


    public void interactNeighbours(){
        //leave blank
    }

    public static void main(String[] args){
        Stemcell cell1 = new Stemcell(1,2,3,4);
        System.out.println(cell1.strength);
        System.out.println(cell1.x);
        System.out.println(cell1.y);
        System.out.println(cell1.id);
    }
}




