package com.example.swiggyclone.view;



import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.example.swiggyclone.ImageSlideAdapter;
import com.example.swiggyclone.R;
import com.example.swiggyclone.adapters.InstamartImageAdapter;
import com.example.swiggyclone.databinding.FragmentInstamartBinding;
import com.example.swiggyclone.utils.HomeSlideImages;
//import com.example.swiggyclone.utils.InstamartSlide1;
//import com.example.swiggyclone.utils.InstamartSlide2;
//import com.example.swiggyclone.utils.TopPicksList;


import java.util.ArrayList;

public class InstamartFragment extends Fragment {

    private Handler handler;
    private ImageSlideAdapter slideAdapter1;
    private ImageSlideAdapter slideAdapter2;
    private InstamartImageAdapter hotDealsAdapter;
    private InstamartImageAdapter topPicksAdapter;
    private ArrayList<Integer> imageList1;
    private ArrayList<Integer> imageList2;
    private ViewPager2 viewPager1;
    private ViewPager2 viewPager2;
    private FragmentInstamartBinding binding;

    private final String[] hintStrings = {"Biscuits", "Fruits & Vegitables", "Toothpaste", "Consmetics", "Snacks & Drinks"};
    private int currentHintIndex = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentInstamartBinding.inflate(inflater);
        return binding.getRoot();
    }
//
//    @Override
//    public void onViewCreated(View view, Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        viewPager1 = binding.viewpager1;
//        viewPager2 = binding.viewpager2;

//        handler = new Handler(Looper.myLooper());
////        imageList1 = InstamartSlide1.INSTANCE.getInstamartSlide1();
////        imageList2 = InstamartSlide2.INSTANCE.getInstamartSlide2();
//
//        slideAdapter1 = new ImageSlideAdapter(imageList1, viewPager1);
//        slideAdapter2 = new ImageSlideAdapter(imageList2, viewPager2);
//
//        viewPager1.setAdapter(slideAdapter1);
//        viewPager2.setAdapter(slideAdapter2);
//        viewPager1.setOffscreenPageLimit(3);
//        viewPager2.setOffscreenPageLimit(3);
//        viewPager1.setClipToPadding(false);
//        viewPager2.setClipToPadding(false);
//        viewPager1.setClipChildren(false);
//        viewPager2.setClipChildren(false);
//        ((RecyclerView) viewPager1.getChildAt(0)).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
//        ((RecyclerView) viewPager2.getChildAt(0)).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
//
//        setUpTransformer();
//
//        viewPager1.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            @Override
//            public void onPageSelected(int position) {
//                super.onPageSelected(position);
//                handler.removeCallbacks(runnable);
//                handler.postDelayed(runnable, 2500);
//            }
//        });
//
//        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            @Override
//            public void onPageSelected(int position) {
//                super.onPageSelected(position);
//                handler.removeCallbacks(runnable);
//                handler.postDelayed(runnable, 2500);
//            }
//        });
//
//        binding.textSwitcher.setFactory(() -> {
//            TextView textView = new TextView(requireContext());
//            textView.setTextSize(16f);
//            textView.setTypeface(ResourcesCompat.getFont(requireContext(), R.font.swiggy_font_regular));
//            textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.grey));
//            return textView;
//        });
//
//        switchText();
//
////        binding.rvHotdeals.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
////        hotDealsAdapter = new InstamartImageAdapter(HomeSlideImages.INSTANCE.getHotDealsList());
////        binding.rvHotdeals.setAdapter(hotDealsAdapter);
////
////        binding.rvTopPicks.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
////        topPicksAdapter = new InstamartImageAdapter(TopPicksList.INSTANCE.getTopPicksList());
////        binding.rvTopPicks.setAdapter(topPicksAdapter);
//
//        binding.svInstamart.getViewTreeObserver().addOnScrollChangedListener(() -> {
//            int linearLayoutHeight = binding.llBanner.getHeight();
//            int scrollY = binding.svInstamart.getScrollY();
//
//            if (scrollY >= linearLayoutHeight) {
//                binding.llHeader.setVisibility(View.VISIBLE);
//            } else {
//                binding.llHeader.setVisibility(View.GONE);
//            }
//        });
//    }
//
//    private void setUpTransformer() {
//        CompositePageTransformer transformer = new CompositePageTransformer();
//        transformer.addTransformer(new MarginPageTransformer(90));
//        transformer.addTransformer((page, position) -> {
//            float r = 1 - Math.abs(position);
//            page.setScaleY(0.85f + r * 0.14f);
//            page.setScaleX(0.85f + r * 0.4f);
//        });
//        viewPager1.setPageTransformer(transformer);
//        viewPager2.setPageTransformer(transformer);
//    }
//
//    private final Runnable runnable = () -> {
//        viewPager1.setCurrentItem(viewPager1.getCurrentItem() + 1);
//        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
//    };
//
//    private void switchText() {
//        binding.textSwitcher.setText(hintStrings[currentHintIndex]);
//        currentHintIndex = (currentHintIndex + 1) % hintStrings.length;
//
//        binding.textSwitcher.postDelayed(this::switchText, 1500);
//    }
}
