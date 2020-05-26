package maps.where_is_my_procedure.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void Siguiente(View view){
            Intent Siguiente = new Intent(this, Maps.class);
            startActivity(Siguiente);
        }
}
