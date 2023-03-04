import java.util.ArrayList;

public class Tuition {
    private String name;
    private Headmaster headmaster;
    Teacher team[] = new Teacher [5];
    private Batch batch;
    private int teamsz = 0;

    public void setName(String n){
        name = n;
    }
    public String getName() {
        return name;
    }

    public void addTeam(Teacher teacher ){
        this.team[teamsz] = teacher;
        teamsz ++;
    }

    public void setBatch(Batch batch){
        this.batch = batch;
    }

    public void setHeadmaster(Headmaster headmaster) {
        this.headmaster = headmaster;
    }

    public float getAvgPerformance(int index){
        return batch.getAvgPerformance(index);
    }

    public int getTeamsz(){
        return teamsz;
    }

    public int getBatchSize(){
        return batch.getBatchSz();
    }

    public String getHeadmaster() {
        return headmaster.getName();
    }

    public void getPerformance(){
        System.out.println(getName());
        System.out.println("Headmaster: " + getHeadmaster());
        System.out.println("Team size: " + getTeamsz());
        System.out.println("Batch size: " + getBatchSize());
        for (int i = 0 ; i < 5; i ++){
            System.out.println("Average score for subject " + i + ": " + getAvgPerformance(i));
        }
        for (int i = 0; i < 5; i++){
            System.out.println("The min score for subject " + i + ": " + batch.getMin(i));
        }
        for (int i = 0; i < 5; i++){
            System.out.println("The max score for subject " + i + ": " + batch.getMax(i));
        }

    }
}
