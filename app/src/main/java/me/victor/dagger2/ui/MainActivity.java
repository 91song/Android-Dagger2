package me.victor.dagger2.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

import me.victor.dagger2.R;
import me.victor.dagger2.bean.User;
import me.victor.dagger2.component.DaggerMainComponent;
import me.victor.dagger2.module.TextViewModule;

public class MainActivity extends AppCompatActivity {
    @Inject
    User mUser;
    @Named("app")
    @Inject
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .textViewModule(new TextViewModule(this))
                .build()
                .inject(this);
        FrameLayout frameLayout = findViewById(R.id.frame);
        mTextView.setText(mUser.name);
        frameLayout.addView(mTextView);
    }
}
