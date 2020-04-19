package czx.lab3.Run3;

public class Course {

    private String id;
    public void setId(String id) { this.id = id; }
    public String getId(){ return id; }

    private String name;
    public void setName(String name) { this.name = name; }
    public String getName(){return name;}

    private double score;
    public void setScore(double score) { this.score = score; }
    public double getScore(){return score;}

    public Course(){}
    public Course(String id,String name,double score){
        this.id=id;
        this.name=name;
        this.score=score;
    }
}
