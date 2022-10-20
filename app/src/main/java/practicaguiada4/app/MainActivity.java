package practicaguiada4.app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends ListActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Centro> l = Arrays.asList(
                new Centro ("IES Doctor Fleming", "Doctor Fleming 7, Oviedo", R.mipmap.ic_launcher),
                new Centro ("IES Monte Naranco", "Calle de Oviedo", R.mipmap.ic_launcher),
                new Centro ("CIFP Avilés", "Calle en Avilés", R.mipmap.ic_launcher)
        );
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Centro centro= (Centro) adapterView.getItemAtPosition(i);
        Toast.makeText(this, centro.getNombre(),Toast.LENGTH_SHORT).show();
    }
}