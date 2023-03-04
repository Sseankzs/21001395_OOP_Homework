public class Batch {

    private Student students[] = new Student[10];
    private int size = 0;
    private float total = 0;
    private float average = 0;
    private float min = 100;
    private float max = 0;

    public void add(Student student){
        students[size] = student;
        size ++;
    }

    public int getBatchSz(){
        return students.length;
    }

    public float getMax(int index){
        for(int i = 0; i < students.length; i++){
            if (students[i].getMarks(index) > max){
                max = students[i].getMarks(index);
            }
        }

        return max;
    }
    public float getMin(int index){
        for(int i = 0; i < students.length; i++){
            if (students[i].getMarks(index) < min){
                min = students[i].getMarks(index);
            }
        }

        return min;
    }
    public float getAvgPerformance(int index) {

        for(int i = 0; i < students.length;  i++){
            total += students[i].getMarks(index);
        }

        average = total / students.length;

        return average;
    }
}
