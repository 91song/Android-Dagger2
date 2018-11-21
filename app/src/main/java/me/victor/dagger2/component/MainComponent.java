package me.victor.dagger2.component;

import dagger.Component;
import me.victor.dagger2.module.TextViewModule;
import me.victor.dagger2.ui.MainActivity;

@Component(modules = TextViewModule.class)
public interface MainComponent {

    void inject(MainActivity activity);
}
