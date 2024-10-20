package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @Provides
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }

}