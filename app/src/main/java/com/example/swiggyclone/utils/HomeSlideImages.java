package com.example.swiggyclone.utils;
import com.example.swiggyclone.R;
import com.example.swiggyclone.model.HoriFoodsDataClass;
import com.example.swiggyclone.model.VertiFoodsDataClass;
//*import com.example.swiggyclone.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeSlideImages {
    public static final List<Integer> homeSlideImages = Arrays.asList(
            R.drawable.homeslide5,
            R.drawable.homeslide6,
            R.drawable.homeslide1,
            R.drawable.homeslide7,
            R.drawable.homeslide2
    );

    public static final List<HoriFoodsDataClass> topRatedFoodsList = new ArrayList<HoriFoodsDataClass>() {{
        add(new HoriFoodsDataClass(R.drawable.hori_img_1, "Salem RR Briyani", "3.8", "27 mins", "Briyani, Chettinad, Tandoori"));
        add(new HoriFoodsDataClass(R.drawable.hori_img_2, "Fasta Pizza", "4.5", "29 mins", "Pizza, Burger, Chicken"));
        add(new HoriFoodsDataClass(R.drawable.hori_img_3, "Grill Nights", "4.2", "25 mins", "Chinese, Mexican, Tandoori"));
        add(new HoriFoodsDataClass(R.drawable.hori_img_4, "Domino's Pizza", "2.8", "15 mins", "Italian, Dutch, Cheese"));
        add(new HoriFoodsDataClass(R.drawable.hori_img_5, "Oho Shawarma", "3.5", "44 mins", "Chicken, Cheese, Veggie"));
        add(new HoriFoodsDataClass(R.drawable.hori_img_6, "Ya Rahman Briyani", "3.9", "32 mins", "Indian, Briyani"));
        add(new HoriFoodsDataClass(R.drawable.hori_img_7, "Dindigul Thalapakatti", "4.6", "19 mins", "Arabian, Indian, BBQ, Chinese"));

    }};

    public static final List<HoriFoodsDataClass> getQuicklyFoodsList = new ArrayList<HoriFoodsDataClass>() {{
        add(new HoriFoodsDataClass(R.drawable.hori_img_8, "A2B Adayar Anandha Bavan", "4.9", "27 mins", "South Indian, Pan-India"));
        add(new HoriFoodsDataClass(R.drawable.hori_img_9, "Muniyandi Vilaas", "4.3", "22 mins", "Tamilan, Pan-Indian, Meals"));
        add(new HoriFoodsDataClass(R.drawable.hori_img_10, "Saravana Bavan", "3.8", "36 mins", "Tamilan, Meals, South Indian"));
        add(new HoriFoodsDataClass(R.drawable.hori_img_11, "Apty Choice", "3.5", "48 mins", "Shawarma, Chicken, Noodles"));
        add(new HoriFoodsDataClass(R.drawable.hori_img_12, "The Red Box", "3.7", "21 mins", "Mutton, Veggie, Chicken"));
        add(new HoriFoodsDataClass(R.drawable.hori_img_1, "Ya Rahman Briyani", "3.9", "13 mins", "Indian, Briyani"));
        add(new HoriFoodsDataClass(R.drawable.hori_img_2, "The Pizza Hut", "4.5", "34 mins", "Mexican, Lebanese, Italian"));
    }};

    public static final List<Integer> whatsOnMindFoodsList = new ArrayList<Integer>() {{
        add(R.drawable.whatsonmind1);
        add(R.drawable.whatsonmind2);
        add(R.drawable.whatsonmind3);
    }};

    public static final List<VertiFoodsDataClass> exploreFoodsList = new ArrayList<VertiFoodsDataClass>() {
        {
            add(new VertiFoodsDataClass(R.drawable.verti_img_1, "Apty Choice", "3.9", "26 mins", "Briyani, Chinese, Continental Taste", "Nanmangalam (1.7 km)", R.drawable.img_extra10));
            add(new VertiFoodsDataClass(R.drawable.verti_img_2, "Grill Nights", "3.4", "35 mins", "Briyani, Chinese, Continental Taste", "Shollinganalur (5.4 km)", R.drawable.img_freedelivery));
            add(new VertiFoodsDataClass(R.drawable.verti_img_3, "Oho Shwarma", "2.9", "40 mins", "Briyani, Chinese, Continental Taste", "Pallikaranai (3.2 km)", R.drawable.img_extra10));
            add(new VertiFoodsDataClass(R.drawable.verti_img_5, "Salem RR Briyani", "4.5", "15 mins", "Briyani, Chinese, Continental Taste", "Tambaram (2.9 km)", R.drawable.img_freedelivery));
            add(new VertiFoodsDataClass(R.drawable.verti_img_4, "Fasta Pizza", "3.8", "10 mins", "Briyani, Chinese, Continental Taste", "Nanmangalam (1.8 km)", R.drawable.img_extra10));
            add(new VertiFoodsDataClass(R.drawable.verti_img_6, "Domino's Pizza", "2.7", "22 mins", "Briyani, Chinese, Continental Taste", "Keelkatalai (3.6 km)", R.drawable.img_freedelivery));
            add(new VertiFoodsDataClass(R.drawable.verti_img_7, "Sangeetha Veg Restarurant", "3.9", "32 mins", "Briyani, Chinese, Continental Taste", "Medavakkam (4.2 km)", R.drawable.img_extra10));
            add(new VertiFoodsDataClass(R.drawable.verti_img_8, "Nandhana Palace", "4.4", "12 mins", "Briyani, Chinese, Continental Taste", "Tambaram (6.7 km)", R.drawable.img_extra10));
            add(new VertiFoodsDataClass(R.drawable.verti_img_7, "Mani's Dum Briyani", "4.7", "28 mins", "Briyani, Chinese, Continental Taste", "Pallikaranai (4.4 km)", R.drawable.img_extra10));
            add(new VertiFoodsDataClass(R.drawable.verti_img_8, "Subway", "3.6", "25 mins", "Briyani, Chinese, Continental Taste", "Shollinganalur (3.9 km)", R.drawable.img_freedelivery));
        }};
}

