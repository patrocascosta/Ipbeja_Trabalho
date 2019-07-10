package pt.ipbeja.tvtime.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import pt.ipbeja.tvtime.model.Favorito;
import pt.ipbeja.tvtime.model.Serie;

public class FavoritosAdapter extends BaseAdapter {

    private List<Favorito> favoritoList;
    private Context context;

    public FavoritosAdapter (List<Favorito> favoritoList, Context context) {
        this.favoritoList = favoritoList;
        this.context = context;
    }



    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }





}


