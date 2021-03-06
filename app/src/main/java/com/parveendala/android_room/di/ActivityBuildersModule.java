package com.parveendala.android_room.di;

import com.parveendala.android_room.di.add.AddNoteModule;
import com.parveendala.android_room.di.add.AddNoteViewModelModule;
import com.parveendala.android_room.di.add.AddScope;
import com.parveendala.android_room.di.list.ListModule;
import com.parveendala.android_room.di.list.ListScope;
import com.parveendala.android_room.di.list.ListViewModelModule;
import com.parveendala.android_room.ui.add.AddNoteActivity;
import com.parveendala.android_room.ui.list.ListActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/*****
 * Parveen Dala
 * Android-ROOM
 */
@Module
public abstract class ActivityBuildersModule {

    @ListScope
    @ContributesAndroidInjector(modules = {ListModule.class, ListViewModelModule.class})
    abstract ListActivity listActivity();

    @AddScope
    @ContributesAndroidInjector(modules = {AddNoteModule.class, AddNoteViewModelModule.class})
    abstract AddNoteActivity addNoteActivity();

}
