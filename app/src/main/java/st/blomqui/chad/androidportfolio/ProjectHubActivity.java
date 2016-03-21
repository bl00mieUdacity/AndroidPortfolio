package st.blomqui.chad.androidportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class ProjectHubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_hub);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setOnMenuItemClickListener(new OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    if (item == null) {
                        return false;
                    }
                    if (item.getItemId() == R.id.projecthubSettings) {
                        shortToast("clicked " + item.getTitle());
                    }
                    return true;
                }
            });
        }
    }

    public void launchToast(View v) {
        Button b = (Button)v;
        String msg = getString(R.string.launchToastTemplate);
        msg = msg.replace("#appName#", b.getText());
        shortToast(msg);
    }

    private void shortToast(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_project_hub, menu);
        return true;
    }
}