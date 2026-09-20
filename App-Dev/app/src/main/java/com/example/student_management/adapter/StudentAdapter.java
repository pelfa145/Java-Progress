

package com.example.student_management.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student_management.R;
import com.example.student_management.model.Student;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    private ArrayList<Student> students;



    public StudentAdapter(ArrayList<Student> students) {
        this.students = students;
    }


    @Override
    public StudentViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);

        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = students.get(position);

        holder.studentName.setText(
                student.getFirst()+ " " + student.getLast()
        );
        holder.studentDetails.setText(
                student.getCourse() + " • Year "+ student.getYearLevel()
        );
        holder.studentStatus.setText(
                student.getStatus() ? "Active" : "Inactive"
        );
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {
        public TextView studentName;
        public TextView studentDetails;
        public TextView studentStatus;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            studentName = itemView.findViewById(R.id.tvStudentName);
            studentDetails = itemView.findViewById(R.id.tvStudentDetails);
            studentStatus = itemView.findViewById(R.id.tvStudentStatus);
        }

    }
}


