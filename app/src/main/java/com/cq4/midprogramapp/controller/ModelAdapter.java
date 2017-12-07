package com.cq4.midprogramapp.controller;

/**
 * Created by melina.gonzalez on 12/6/17.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cq4.midprogramapp.R;
import com.cq4.midprogramapp.model.Model;
import com.cq4.midprogramapp.view.ModelViewHolder;

import java.util.List;

/**
 * Created by melina.gonzalez on 12/6/17.
 */

public class ModelAdapter extends RecyclerView.Adapter<ModelViewHolder> {

    List<Model> modelList;

    public ModelAdapter(List<Model> modelList) {
        this.modelList = modelList;
    }

    @Override
    public ModelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_itemview, parent, false);
        return new ModelViewHolder(childView);

    }

    @Override
    public void onBindViewHolder(ModelViewHolder holder, int position) {
        Model model = modelList.get(position);
        holder.onBind(model);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
