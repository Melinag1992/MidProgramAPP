package com.cq4.midprogramapp.view;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.cq4.midprogramapp.MainFragment;
import com.cq4.midprogramapp.R;
import com.cq4.midprogramapp.model.Model;

/**
 * Created by melina.gonzalez on 12/6/17.
 */



public class ModelViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView number;


    public ModelViewHolder(View itemView) {
        super(itemView);
        number = itemView.findViewById(R.id.numbers_shown);

    }
    public void onBind(Model model){

        for (int i = 0; i <=10 ; i++) {
            number.setText(i*10);

        }

    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(itemView.getContext(), MainFragment.class);
        String sendNumber = number.getText().toString();
        i.putExtra("number" , sendNumber);
        itemView.getContext().startActivity(i);
    }
}
