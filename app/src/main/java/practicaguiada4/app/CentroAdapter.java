package practicaguiada4.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class CentroAdapter extends ArrayAdapter<Centro> {
    public CentroAdapter(@NonNull Context context, int resource, @NonNull List<Centro> objects) {
        super(context, resource, objects);
    }
    
    public View getView(int position, View convertView, ViewGroup parent){
        Centro c = getItem(position);
        if(convertView == null)
            convertView= LayoutInflater.from(this.getContext()).inflate(R.layout.item, parent,false);
        ((ImageView) convertView.findViewById((R.id.imageView)).setImageResource(c.getImagen()));
        ((TextView) convertView.findViewById((R.id.nombre)).setText(c.getNombre()));
        ((TextView) convertView.findViewById((R.id.direccion)).setText(c.getDireccion()));
        return convertView;
    }
}
