package com.example.pi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.pi.R;
import com.example.pi.model.Coletor;

import java.util.List;

public class ColetorAdapter extends ArrayAdapter<Coletor> {
    private int resId;

    public ColetorAdapter(@NonNull Context context, int resource, @NonNull List<Coletor> objects) {
        super(context, resource, objects);
        this.resId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View mView = convertView;

        if (mView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            mView = inflater.inflate(resId, null);
        }

        Coletor coletor = getItem(position);
        TextView textNome = mView.findViewById(R.id.textNome);
        TextView textQL = mView.findViewById(R.id.textQL);
        TextView textADB = mView.findViewById(R.id.textADB);
        TextView textIDB = mView.findViewById(R.id.textIDB);

        textNome.setText(coletor.getNome());
        textQL.setText(String.valueOf(coletor.getQL()));
        textADB.setText(coletor.getADB());
        textIDB.setText(coletor.getIDB());

        return mView;
    }
}
