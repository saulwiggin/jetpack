package com.drsilaswiggin.jetpack.repository

import com.drsilaswiggin.jetpack.api.data.UnsplashPhoto
import com.drsilaswiggin.jetpack.api.service.UnsplashService
import javax.inject.Inject

import kotlinx.coroutines.flow.Flow


class UnsplashRepository @Inject constructor(private val service: UnsplashService) {
    // implements kotlin corountines

/*    fun getSearchResultsStream(query:String): Flow<PagingData<UnsplashPhoto>>{
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = NETWORK_PAGE_SIZE),
            pagingSourceFactory = { UnsplashPagingSource(service, query) }
        ).flow
    }*/

    companion object {
        private const val NETWORK_PAGE_SIZE = 25
    }
}