package sjzc.edu.cn.buding.modle;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import sjzc.edu.cn.buding.R;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Toolbar mToolbar;
    private NavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, mDrawer, mToolbar, 0, 0);
        drawerToggle.syncState();
        mDrawer.addDrawerListener(drawerToggle);
        navigation.setItemIconTintList(null);
        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getOrder()){
                    case 1:
                        Toast.makeText(MainActivity.this,"第一个",Toast.LENGTH_SHORT).show();
                      break;
                    case 2:
                      break;
                }
                return true;
            }
        });
    }

    private void initView() {
        mDrawer = findViewById(R.id.drawer);
        mToolbar = findViewById(R.id.toolbar);
        navigation = findViewById(R.id.navigation_view);
    }
}
