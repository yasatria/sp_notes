package com.example.spnotes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spnotes.R;
import com.example.spnotes.model.NotesModel;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    private Context context;
    private List<NotesModel> items;

    public NotesAdapter(Context context, List<NotesModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.notes, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NotesModel item = items.get(position);
        holder.judulText.setText(item.getJudul());

    }

    @Override
    public int getItemCount() { return (items != null ) ? items.size():0 ;}

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView judulText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            judulText = itemView.findViewById(R.id.et_title);
        }
    }
}
