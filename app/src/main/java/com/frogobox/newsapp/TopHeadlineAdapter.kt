package com.frogobox.newsapp

import android.view.View
import android.view.ViewGroup
import com.frogobox.frogonewsapi.data.model.Article
import com.frogobox.recycler.adapter.FrogoRecyclerViewAdapter
import com.frogobox.recycler.adapter.FrogoRecyclerViewHolder
import kotlinx.android.synthetic.main.content_item_article.view.*

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * news-app
 * Copyright (C) 29/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.newsapp
 *
 */
class TopHeadlineAdapter : FrogoRecyclerViewAdapter<Article>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FrogoRecyclerViewHolder<Article> {
        return TopHeadlineViewHolder(viewLayout(parent))
    }

    inner class TopHeadlineViewHolder(view: View) : FrogoRecyclerViewHolder<Article>(view) {

        private val tvTitle = view.tv_title
        private val tvDescription = view.tv_description

        override fun initComponent(data: Article) {
            super.initComponent(data)

            tvTitle.text = data.title
            tvDescription.text = data.description

        }
    }


}