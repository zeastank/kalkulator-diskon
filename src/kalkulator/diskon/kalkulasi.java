package kalkulator.diskon;

import android.app.Activity;
 
import android.os.Bundle;
 
import android.widget.EditText;
 
import android.widget.TextView;
 
import android.widget.Button;
 
import android.view.View;
 
 
public class kalkulasi extends Activity
{
  EditText harga;
  EditText diskon;
  TextView hasil;
  Button hitung;
  double x=0;
  double y=0;
  double z=0;
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
      initmenghitung();
  }
  private void initmenghitung()
  {
      harga  =(EditText)findViewById(R.id.harga);
      diskon =(EditText)findViewById(R.id.diskon);
      hasil=(TextView)findViewById(R.id.hasil);
      hitung=(Button)findViewById(R.id.hitung);
      hitung.setOnClickListener(new Button.OnClickListener()
      {public void onClick
      (View  v) { mengkalkulasi();}});
  }
  private void mengkalkulasi()
  {
      x=Double.parseDouble(harga.getText().toString());
      y=Double.parseDouble(diskon.getText().toString());
      z=x-((x*y)/100);
      hasil.setText(Double.toString(z));
  }
}