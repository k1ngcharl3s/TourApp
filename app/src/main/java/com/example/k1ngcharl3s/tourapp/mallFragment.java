package com.example.k1ngcharl3s.tourapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class mallFragment extends Fragment {
    //Fragments Context Variable
    private Context mContext;

    //Create the instance for Fragment
    public mallFragment() {
    }

    //The Fragments are created in the getContext method
    public Context getmContext() {
        mContext = this.getContext();
        return mContext;
    }

    //Create view and perform additional tasks
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        //Create RecyclerView, set FixedSize property, and LayoutManager
        RecyclerView recycle = (RecyclerView) view.findViewById(R.id.recycler_view);
        recycle.setHasFixedSize(true);
        recycle.setLayoutManager(new LinearLayoutManager(getActivity()));
        //Create ArrayList of cards, and cards for this Fragment's category
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(getString(R.string.mall_1_name), getString(R.string.mall_1_about), R.drawable.dubai_mall));
        cards.add(new Card(getString(R.string.mall_2_name), getString(R.string.mall_2_about), R.drawable.dubai_shopping_center));
        cards.add(new Card(getString(R.string.mall_3_name), getString(R.string.mall_3_about), R.drawable.mall_of_emirates));
        //Create RecyclerView adapter and set it to the RecyclerView
        CustomCardAdapter historicalAdapter = new CustomCardAdapter(getmContext(), cards);
        recycle.setAdapter(historicalAdapter);


        return view;
    }
}