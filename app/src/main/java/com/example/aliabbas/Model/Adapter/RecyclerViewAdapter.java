package com.example.aliabbas.Model.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aliabbas.Model.Student;
import com.example.aliabbas.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    List<Student> studentList;
    Context context;

    public RecyclerViewAdapter(List<Student> studentList, Context context) {
        this.studentList = studentList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Student student = studentList.get(position);
        holder.txtName.setText(student.getName());
        holder.txtRollNo.setText(student.getRollNo());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txtName, txtRollNo;
        ImageView delete;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.name);
            txtRollNo = itemView.findViewById(R.id.rollNo);
            itemView.setOnClickListener(this);
            delete = itemView.findViewById(R.id.delButton);
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String text = "Deleted";
                    studentList.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                    Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context,studentList.get(getAdapterPosition()).getName(),Toast.LENGTH_SHORT).show();
        }
    }
}
