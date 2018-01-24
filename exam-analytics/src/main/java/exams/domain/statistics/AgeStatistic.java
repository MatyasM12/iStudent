package exams.domain.statistics;
import exams.domain.ExamGrade;
import exams.domain.Student;
import exams.service.Service;

import java.util.*;

class AgeGroup {
    public int from;
    public int to;
    public AgeGroup(int from, int to){
        this.from=from;
        this.to=to;
    }
    @Override
    public String toString(){
        return from+" - "+to;
    }
}

public class AgeStatistic implements IStatistic {

    private Service service;
    private Map<String, Float> ageAverageGrades;
    private List<AgeGroup> ageGroups;

    public AgeStatistic(Service service) {
        this.service = service;
        ageAverageGrades=new HashMap<>();
        ageGroups=new ArrayList<>();
        ageGroups.addAll(Arrays.asList(new AgeGroup(10,18),new AgeGroup(19,21), new AgeGroup(22,24),new AgeGroup(25,27),
                new AgeGroup(28,31), new AgeGroup(31,80)));
        generateStatistic();
    }


    @Override
    public void generateStatistic() {
        for(AgeGroup group:ageGroups){
            float sum=0,nr=0;
            for(Student student: service.getStudentsBetweenAge(group.from,group.to)){
                for(ExamGrade grade:student.getGrades()){
                    sum+=grade.getGrade();
                }
                nr+=student.getGrades().size();
            }
            sum=sum/nr;
            ageAverageGrades.put(group.toString(),sum);
        }
    }

    @Override
    public Map<String, Float> getData() {
        return ageAverageGrades;
    }
}