package me.victor.dagger2.module;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class TextViewModule {
    private Context mContext;

    public TextViewModule(Context context) {
        this.mContext = context;
    }

    @Provides
    TextView providesDefaultTextView(Context context) {
        return new TextView(context);
    }

    @Provides
    @Named("app")
    TextView providesRedTextView(Context context) {
        TextView textView = new TextView(context);
        textView.setTextColor(Color.RED);
        return textView;
    }

    @Provides
    Context providesContext() {
        return  mContext;
    }
}
