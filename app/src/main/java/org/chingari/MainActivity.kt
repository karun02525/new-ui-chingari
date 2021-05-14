package org.chingari

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.header_layout_task_center.rv_show_header
import kotlinx.android.synthetic.main.layout_daily_tasks.*
import kotlinx.android.synthetic.main.layout_game_tasks.*
import org.chingari.adapter.CoinsAdapter
import org.chingari.adapter.DailyTaskAdapter
import org.chingari.adapter.GameTaskAdapter
import org.chingari.model.CoinsModel
import org.chingari.model.DailyModel

class MainActivity : AppCompatActivity() {

    private val mAdapter by lazy { CoinsAdapter() }
    private val mDailyTaskAdapter by lazy { DailyTaskAdapter() }
    private val mGameTaskAdapter by lazy { GameTaskAdapter() }
    private val list = mutableListOf<CoinsModel>()
    private val list_daily = mutableListOf<DailyModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewMain()
    }

    private fun initViewMain() {
        list.run {
            add(CoinsModel("Day 1",R.drawable.ic_gift))
            add(CoinsModel("Day 2",R.drawable.ic_coin))
            add(CoinsModel("Day 3",R.drawable.ic_gift))
            add(CoinsModel("Day 4",R.drawable.ic_coin))
            add(CoinsModel("Day 5",R.drawable.ic_diamond))
            add(CoinsModel("Day 6",R.drawable.ic_coin))
            add(CoinsModel("Day 7",R.drawable.ic_coin))
        }
        mAdapter.list = list
        rv_show_header.adapter = mAdapter


        list_daily.run {
            add(DailyModel("Seated for 5 mins","24 Coins",R.drawable.ic_chair,R.drawable.ic_coin))
            add(DailyModel("Stay in a room for 5 mins","1 Gift",R.drawable.ic_ellipse_green,R.drawable.ic_gift))
            add(DailyModel("Share a chat room","24 Coins",R.drawable.ic_ellipse_green,R.drawable.ic_coin))
            add(DailyModel("Seated for 5 mins","24 Coins",R.drawable.ic_ellipse_green,R.drawable.ic_coin))
            add(DailyModel("Seated for 5 mins","24 Coins",R.drawable.ic_ellipse_green,R.drawable.ic_coin))
            add(DailyModel("Seated for 5 mins","24 Coins",R.drawable.ic_ellipse_green,R.drawable.ic_coin))
            add(DailyModel("Seated for 5 mins","24 Coins",R.drawable.ic_ellipse_green,R.drawable.ic_coin))
        }
        mDailyTaskAdapter.list = list_daily
        rv_daily_tasks.adapter = mDailyTaskAdapter

        
        mGameTaskAdapter.list = list_daily
        rv_game_tasks.adapter = mGameTaskAdapter

    }
}