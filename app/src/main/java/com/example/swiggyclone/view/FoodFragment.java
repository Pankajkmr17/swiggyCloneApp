package com.example.swiggyclone.view;

import static com.example.swiggyclone.utils.HomeSlideImages.exploreFoodsList;
import static com.example.swiggyclone.utils.HomeSlideImages.getQuicklyFoodsList;
import static com.example.swiggyclone.utils.HomeSlideImages.topRatedFoodsList;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.example.swiggyclone.ImageSlideAdapter;
import com.example.swiggyclone.databinding.FragmentFoodBinding;
import com.example.swiggyclone.utils.HomeSlideImages;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.swiggyclone.R;
import com.example.swiggyclone.adapters.HoriImageAdapter;
import com.example.swiggyclone.adapters.VertiImageAdapter;
import com.example.swiggyclone.adapters.VertiImageAdapter;
import com.example.swiggyclone.databinding.FragmentFoodBinding;

public class FoodFragment extends Fragment {

    private FragmentFoodBinding binding;
    private ViewPager2 viewPager2;
    private Handler handler;
    private ArrayList<Integer> imageList;
    private ImageSlideAdapter slideAdapter;
    private HoriImageAdapter topRatedAdapter;
    private HoriImageAdapter getQuicklyAdapter;

    private VertiImageAdapter exploreAdapter;

    private TextSwitcher textSwitcher;
    private final String[] hintStrings = {"Hyderabad Briyani", "A2B Full Meals", "KFC Party Chicken Bowl", "Grill Nights BBQ", "Domino's Cheese Pizza"};
    private int currentHintIndex = 0;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public FoodFragment() {
        // Required empty public constructor
    }

    public static FoodFragment newInstance(String param1, String param2) {
        FoodFragment fragment = new FoodFragment();
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
       // return inflater.inflate(R.layout.fragment_food, container, false);
       binding = FragmentFoodBinding.inflate(inflater, container, false);
//        return binding.getRoot();
    //    binding = FragmentFoodBinding.inflate(inflater);
        return binding.getRoot();


    }


    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewPager2 = binding.viewpager2;
        handler = new Handler(Looper.myLooper());
       // imageList = (ArrayList<Integer>) HomeSlideImages.homeSlideImages;
        imageList = new ArrayList<>(HomeSlideImages.homeSlideImages);
        slideAdapter = new ImageSlideAdapter(imageList, viewPager2);
        viewPager2.setAdapter(slideAdapter);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        ((RecyclerView) viewPager2.getChildAt(0)).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

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

        binding.rvToprated.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        topRatedAdapter = new HoriImageAdapter(topRatedFoodsList);
        binding.rvToprated.setAdapter(topRatedAdapter);

        binding.rvQuickly.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        getQuicklyAdapter = new HoriImageAdapter(getQuicklyFoodsList);
        binding.rvQuickly.setAdapter(getQuicklyAdapter);

        binding.rvExplore.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
        exploreAdapter = new VertiImageAdapter(exploreFoodsList);
        binding.rvExplore.setAdapter(exploreAdapter);

        binding.svFood.getViewTreeObserver().addOnScrollChangedListener(() -> {
            int linearLayoutHeight = binding.llBody.getHeight();
            int scrollY = binding.svFood.getScrollY();

            if (scrollY >= linearLayoutHeight) {
                new Handler().postDelayed(() -> binding.rlHeader.setVisibility(View.GONE), 200);
            } else {
                new Handler().postDelayed(() -> binding.rlHeader.setVisibility(View.VISIBLE), 200);
            }
        });


//        topRatedAdapter.setOnItemClickListener(new HoriImageAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(int position) {
//                Toast.makeText(getContext(), "is click",Toast.LENGTH_LONG).show();
//            }
//        });

        ImageView img2 = view.findViewById(R.id.prod2);
        ImageView img1 = view.findViewById(R.id.prod1);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment_container, new CartFragment())
                        .addToBackStack(null) // Optional: Adds the transaction to the back stack
                        .commit();
            }

        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Toast.makeText(requireContext(), "ImageView Clicked!", Toast.LENGTH_SHORT).show();
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment_container, new CartFragment())
                        .addToBackStack(null) // Optional: Adds the transaction to the back stack
                        .commit();
        }

        });

    }

    private final Runnable runnable = () -> viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);

    private void setUpTransformer() {
        CompositePageTransformer transformer = new CompositePageTransformer();
        transformer.addTransformer(new MarginPageTransformer(90));
        transformer.addTransformer((page, position) -> {
            float r = 1 - Math.abs(position);
            page.setScaleY(0.85f + r * 0.14f);
            page.setScaleX(0.85f + r * 0.4f);
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