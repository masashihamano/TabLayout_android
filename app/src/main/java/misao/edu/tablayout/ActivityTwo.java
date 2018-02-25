package misao.edu.tablayout;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_two );

        textView = findViewById( R.id.tv );
        textView.setText( "This is activity Two" );

        BottomNavigationView bottomNavigationView = findViewById( R.id.bottom_Nav_View_Bar );
        BottomNavigationViewHelper.disableShiftMode( bottomNavigationView );
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem( 2 );
        menuItem.setChecked( true );

        bottomNavigationView.setOnNavigationItemSelectedListener( new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.drawable.ic_back:
                        Intent intent = new Intent( ActivityTwo.this,MainActivity.class );
                        startActivity(intent);
                        break;

                    case R.drawable.ic_menu:
                        Intent intent1 = new Intent( ActivityTwo.this,ActivityOne.class );
                        startActivity(intent1);
                        break;
                    case R.drawable.ic_time:
                        break;
                    case R.drawable.ic_home:
                        Intent intent3 = new Intent( ActivityTwo.this,ActivityThree.class );
                        startActivity(intent3);
                        break;
                    case R.drawable.ic_mail:
                        Intent intent4 = new Intent( ActivityTwo.this,ActivityFour.class );
                        startActivity(intent4);
                        break;
                }
                return false;
            }
        } );


    }





}
