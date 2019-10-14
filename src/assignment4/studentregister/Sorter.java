package assignment4.studentregister;

import java.util.List;

public class Sorter {


    public void InsertionSort(List<StudentInfo> studentList){
        /*Function to sort array using insertion sort*/
        StudentInfo temp;
        for(int i=0; i< studentList.size(); i++){
            for (int j=i+1; j<studentList.size(); j++){
                if(studentList.get(i).compareTo(studentList.get(j))>0){
                    temp = studentList.get(i);
                    studentList.set(i, studentList.get(j));
                    studentList.set(j, temp);
                }

            }
        }
    }

    public void BubbleSort(List<StudentInfo> studentList){
        StudentInfo temp;
        for (int j = 0; j < studentList.size(); j++) {
            for (int i = j + 1; i < studentList.size(); i++) {
                // comparing strings
                if (studentList.get(i).compareTo(studentList.get(j)) < 0) {
                    temp = studentList.get(j);
                    studentList.set(j, studentList.get(i));
                    studentList.set(i, temp);
                }
            }
        }
    }
}
