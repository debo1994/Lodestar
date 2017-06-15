package com.lodestar.demoexample;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        Menu menu = navigationView.getMenu();

        MenuItem general= menu.findItem(R.id.menu_title_general);
        MenuItem about= menu.findItem(R.id.menu_title_about);

        SpannableString string_general = new SpannableString(general.getTitle());
        string_general.setSpan(new TextAppearanceSpan(this, R.style.TextAppearanceMenu), 0, string_general.length(), 0);
        general.setTitle(string_general);

        SpannableString string_about = new SpannableString(about.getTitle());
        string_about.setSpan(new TextAppearanceSpan(this, R.style.TextAppearanceMenu), 0, string_about.length(), 0);
        about.setTitle(string_about);

        navigationView.setNavigationItemSelectedListener(this);

        toolbar.setTitle("Login / Sign up");
        FragmentTransaction fragmentTransactionLogin = getSupportFragmentManager().beginTransaction();
        fragmentTransactionLogin.add(R.id.placeholder, new LoginFragment());
        fragmentTransactionLogin.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.menu_login) {
            toolbar.setTitle("Login / Sign up");
            FragmentTransaction fragmentTransactionLogin = getSupportFragmentManager().beginTransaction();
            fragmentTransactionLogin.add(R.id.placeholder, new LoginFragment());
            fragmentTransactionLogin.commit();
        } else if (id == R.id.menu_what_we_do) {
            toolbar.setTitle("What We Do");
            FragmentTransaction fragmentTransactionWhatWeDo = getSupportFragmentManager().beginTransaction();
            fragmentTransactionWhatWeDo.add(R.id.placeholder, new WhatWeDoFragment());
            fragmentTransactionWhatWeDo.commit();
        } else if (id == R.id.menu_lodestar_way) {
            toolbar.setTitle("Lodestar Way");
            FragmentTransaction fragmentTransactionLodestarWay = getSupportFragmentManager().beginTransaction();
            fragmentTransactionLodestarWay.add(R.id.placeholder, new LodestarWayFragment());
            fragmentTransactionLodestarWay.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
