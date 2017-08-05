package com.example.andriod.yupdevtask2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<GameData> gameList = new ArrayList<GameData>();
    GameAdapter mAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerVeiwId);

        mAdapter = new GameAdapter(gameList);
        RecyclerView.LayoutManager mlayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mlayoutManager);
        recyclerView.setAdapter(mAdapter);

//        String [] game_names, game_genre, game_vendor;
//        ArrayList<MyData> arrayList = new ArrayList<MyData>();

//        game_names = getResources().getStringArray(R.array.game_names);
//        game_genre = getResources().getStringArray(R.array.game_genre);
//        game_vendor = getResources().getStringArray(R.array.game_vendor);
//        int i=0;
//        for (String name: )


        prepareGameData();

    }

    private void prepareGameData() {
        GameData game = new GameData("Real Football", "soccer", "Gameloft");
        gameList.add(game);

        GameData game1 = new GameData("Space Impact", "arcade", "Nokia");
        gameList.add(game1);

        game = new GameData("Snake","adventure","Nokia");
        gameList.add(game);

        game = new GameData("Need for Speed","arcade","EA Sports");
        gameList.add(game);

        game = new GameData("Pro Evolution Soccer","soccer","Konami");
        gameList.add(game);

        game = new GameData("Bounce","arcade","Nokia");
        gameList.add(game);

        game = new GameData("Cooking Fever","fantasy","Recipe");
        gameList.add(game);

        game = new GameData("Danger Dash","arcade","Fun Games");
        gameList.add(game);

        game = new GameData("Scrabble","Puzzle","EA Sports");
        gameList.add(game);

        game = new GameData("Candy Crush","fantasy","King");
        gameList.add(game);

        game = new GameData("Soda Crush","fantasy","King");
        gameList.add(game);

        game = new GameData("Bubble Witch","fantasy","Magic");
        gameList.add(game);

        game = new GameData("Dream League","Soccer","First Touch");
        gameList.add(game);

        mAdapter.notifyDataSetChanged();
    }

}
