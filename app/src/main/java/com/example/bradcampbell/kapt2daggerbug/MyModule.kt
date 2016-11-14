package com.example.bradcampbell.kapt2daggerbug

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyModule(private val context: Context) {

  @Provides @Singleton fun provideContext() = context

  /** Any override method will do. */
  override fun hashCode(): Int {
    return super.hashCode()
  }
}
