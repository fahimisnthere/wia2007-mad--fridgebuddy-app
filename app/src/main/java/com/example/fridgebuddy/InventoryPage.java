package com.example.fridgebuddy;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.example.fridgebuddy.R;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;

public class InventoryPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ❌ REMOVE EdgeToEdge
        setContentView(R.layout.activity_inventory_page);

        // ✅ CONNECT TOOLBAR
        MaterialToolbar toolbar = findViewById(R.id.inventoryToolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_add) {
            Toast.makeText(this, "Add clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.action_settings) {
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.action_help) {
            Toast.makeText(this, "Help clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
