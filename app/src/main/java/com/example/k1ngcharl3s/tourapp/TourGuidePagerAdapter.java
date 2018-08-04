import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.k1ngcharl3s.tourapp.Card;
import com.example.k1ngcharl3s.tourapp.CustomCardAdapter;
import com.example.k1ngcharl3s.tourapp.R;
import com.example.k1ngcharl3s.tourapp.mallFragment;
import com.example.k1ngcharl3s.tourapp.museumFragment;
import com.example.k1ngcharl3s.tourapp.restaurantFragment;

import java.util.ArrayList;


public class TourGuidePagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    //Class constructor
    public TourGuidePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    //getItem returns Fragment based on position
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new restaurantFragment();
            case 1:
                return new mallFragment();
            case 2:
                return new museumFragment();
            case 3:
                return new gymFragment();
            default:
                return null;

        }
    }

    //getCount returns number of Fragments
    @Override
    public int getCount() {
        return 4;
    }

    //getPageTitle returns string resource associated with a fragment
    //according to position
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.restaurant_title);
            case 1:
                return mContext.getString(R.string.mall_title);
            case 2:
                return mContext.getString(R.string.museum_title);
            case 3:
                return mContext.getString(R.string.gym_title);
            default:
                return null;
        }
    }
}