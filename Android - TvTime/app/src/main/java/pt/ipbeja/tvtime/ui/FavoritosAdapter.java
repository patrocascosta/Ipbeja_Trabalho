package pt.ipbeja.tvtime.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

import pt.ipbeja.tvtime.R;
import pt.ipbeja.tvtime.model.Favorito;

public class FavoritosAdapter extends BaseAdapter {

    private List<Favorito> favoritoList;
    private Context context;

    public FavoritosAdaptor(List<Favorito> favoritoList, Context context){
        this.favoritoList = favoritoList;
        this.context = context;
    }



    @Override
    public int getCount() {
        return this.favoritoList.size();
    }

    @Override
    public Favorito getItem(int position) {
        return this.favoritoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getIdFavoritos();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(this.context).inflate(R.layout.listavistos, parent, false);
        }

        Favorito favorito = this.getItem(position);

        ImageView imageView = convertView.findViewById(R.id.imageView6);
        ImageView imageView2 = convertView.findViewById(R.id.imageView4);


        Glide.with(this.context).load(favorito.getImagem()).into(imageView);
        Glide.with(this.context).load(favorito.getImagem()).into(imageView2);

        return convertView;
    }





}


