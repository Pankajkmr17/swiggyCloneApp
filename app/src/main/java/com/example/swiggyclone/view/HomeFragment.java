package com.example.swiggyclone.view;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;

import com.example.swiggyclone.ImageSlideAdapter;
import com.example.swiggyclone.R;
import com.example.swiggyclone.databinding.FragmentHomeBinding;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private ViewPager2 viewPager2;
    private Handler handler;
    private ArrayList<Integer> imageList;
    private ImageSlideAdapter slideAdapter;

    private TextSwitcher textSwitcher;
    private final String[] hintStrings = {"dishes & foods", "favourite restaurants", "home groceries"};
    private int currentHintIndex = 0;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }



    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_home, container, false);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewPager2 = binding.viewpager2;
        handler = new Handler(Looper.myLooper());
        imageList = new ArrayList<>();
        imageList.add(R.drawable.homeslide1);
        imageList.add(R.drawable.homeslide2);
        imageList.add(R.drawable.homeslide3);
        imageList.add(R.drawable.homeslide4);
        slideAdapter = new ImageSlideAdapter(imageList, viewPager2);
        viewPager2.setAdapter(slideAdapter);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        setUpTransformer();

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 2500);
            }
        });

        textSwitcher = binding.textSwitcher;
        textSwitcher.setFactory(() -> {
            TextView textView = new TextView(requireContext());
            textView.setTextSize(16);
            textView.setTypeface(ResourcesCompat.getFont(requireContext(), R.font.swiggy_font_regular));
            textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.grey));
            return textView;
        });

        switchText();




    }

    private final Runnable runnable = () -> viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);

    private void setUpTransformer() {
        CompositePageTransformer transformer = new CompositePageTransformer();
        transformer.addTransformer(new MarginPageTransformer(40));
        transformer.addTransformer((page, position) -> {
            float r = 1 - Math.abs(position);
            page.setScaleY(0.85f + r * 0.14f);
            page.setScaleX(0.85f + r * 0.3f);
        });
        viewPager2.setPageTransformer(transformer);
    }

    private void switchText() {
        textSwitcher.setText(hintStrings[currentHintIndex]);
        currentHintIndex = (currentHintIndex + 1) % hintStrings.length;

        textSwitcher.postDelayed(this::switchText, 1500); // Delay between text switches (2 seconds in this example)
    }

    @Override
    public void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
    }

    @Override
    public void onResume() {
        super.onResume();
        handler.postDelayed(runnable, 2500);
    }



}