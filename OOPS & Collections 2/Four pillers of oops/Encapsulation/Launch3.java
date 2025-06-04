package Encapsulation;
class force{
    private String type;
    private int rank;
    private String place;
    
    public void setforce(String type, int rank, String place) {
        this.type = type;
        this.rank = rank;
        if(rank > 5){
            this.place = place;
        }
        
    }

    public String getType(){
        return type;    
    }
    public int getRank(){
        if(rank > 5){
            rank = 5;
            System.out.println("The higher rank authority of AF");
        }
        return rank;    
    }
    public String getPlace(){
        if(place == null || place.isEmpty()){
            return "No place assigned";
        }
           return place;
    }
}
public class Launch3 {
    public static void main(String[] args) {
        force f = new force();
        f.setforce("Air Force", 4,  "South Western Air Command");
        System.out.println("Type: " + f.getType());
        System.out.println("Rank: " + f.getRank());
        System.out.println("Place: " + f.getPlace());

    }
}
