package pt.ipbeja.tvtime.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
//import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import pt.ipbeja.tvtime.R;
import pt.ipbeja.tvtime.model.Serie;

public class VistosAdapter extends BaseAdapter {

    private List<Serie> serieList;
    private Context context;

    public VistosAdapter (List<Serie> serieList, Context context) {
        this.serieList = serieList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.serieList.size();
    }

    @Override
    public Serie getItem(int position) {
        return this.serieList.get(position);
    }


    @Override
    public long getItemId(int position) { return getItem(position).getIdSerie(); }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(this.context).inflate(R.layout.listavistos, parent, false);
        }

        Serie serie = this.getItem(position);

        ImageView imageView = convertView.findViewById(R.id.imageView);


        Glide.with(this.context).load(serie.getImagem()).into(imageView);

        return convertView;
    }
}


