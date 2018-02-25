package misao.edu.tablayout;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    SectionsPagerAdapter sectionsPagerAdapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        sectionsPagerAdapter = new SectionsPagerAdapter( getSupportFragmentManager() );

        viewPager = findViewById( R.id.container );
        setupViewPager( viewPager );


        TabLayout tabLayout = findViewById( R.id.tabs );
        tabLayout.setupWithViewPager( viewPager );
        viewPager.setCurrentItem( 1 );

        tabLayout.getTabAt( 0 ).setIcon( R.drawable.ic_time );
        tabLayout.getTabAt( 1 ).setIcon( R.drawable.ic_home );
        tabLayout.getTabAt( 2 ).setIcon( R.drawable.ic_menu );

        BottomNavigationView bottomNavigationView = findViewById( R.id.bottom_Nav_View_Bar );
        BottomNavigationViewHelper.disableShiftMode( bottomNavigationView );
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem( 0 );
        menuItem.setChecked( true );

        bottomNavigationView.setOnNavigationItemSelectedListener( new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.drawable.ic_back:
                        break;
                    case R.drawable.ic_menu:
                        Intent intent1 = new Intent( MainActivity.this,ActivityOne.class );
                        startActivity(intent1);
                        break;
                    case R.drawable.ic_time:
                        Intent intent2 = new Intent( MainActivity.this,ActivityTwo.class );
                        startActivity(intent2);
                        break;
                    case R.drawable.ic_home:
                        Intent intent3 = new Intent( MainActivity.this,ActivityThree.class );
                        startActivity(intent3);
                        break;
                    case R.drawable.ic_mail:
                        Intent intent4 = new Intent( MainActivity.this,ActivityFour.class );
                        startActivity(intent4);
                        break;
                }
                return false;
            }
        } );

    }


    private void setupViewPager(ViewPager viewPager)
    {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter( getSupportFragmentManager() );
        adapter.addFragment( new TAB1Fragment() );
        adapter.addFragment( new TAB2Fragment() );
        adapter.addFragment( new TAB3Fragment() );
        viewPager.setAdapter( adapter );
    }
}
