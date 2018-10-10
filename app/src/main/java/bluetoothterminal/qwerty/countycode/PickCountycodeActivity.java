package bluetoothterminal.qwerty.countycode;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import bluetoothterminal.qwerty.countycode.countrypicker.Country;
import bluetoothterminal.qwerty.countycode.countrypicker.CountryPickerCallbacks;
import bluetoothterminal.qwerty.countycode.countrypicker.CountryPickerDialog;

public class PickCountycodeActivity extends Activity {
    TextView countrycode;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_countycode);
        countrycode = findViewById(R.id.tv_country_code);
        countrycode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "This is a message displayed in a Toast",
                        Toast.LENGTH_SHORT).show();

                CountryPickerDialog countryPicker =
                        new CountryPickerDialog(getBaseContext(), new CountryPickerCallbacks() {
                            @Override
                            public void onCountrySelected(Country country, int flagResId) {
                                // TODO handle callback
                            }
                        });
                countryPicker.show();


            }
        });

    }
}
