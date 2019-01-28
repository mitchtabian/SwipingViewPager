package com.codingwithmitch.swipingviewpager.resources;

import com.codingwithmitch.swipingviewpager.R;
import com.codingwithmitch.swipingviewpager.models.Hat;

import java.math.BigDecimal;

public class Hats {

    public static Hat[] getHats(){
        return SNAPBACKS;
    }

    public static final Hat SNAPBACK_BLACK = new Hat("Black Snapback", R.drawable.snapback_black,
             new BigDecimal(20.99), 9377376);
    public static final Hat SNAPBACK_CAMO = new Hat("Camo Snapback", R.drawable.snapback_camo,
             new BigDecimal(20.99), 9377377);
    public static final Hat SNAPBACK_GREY = new Hat("Grey Snapback", R.drawable.snapback_grey,
             new BigDecimal(20.99), 9377378);
    public static final Hat SNAPBACK_NAVY = new Hat("Navy Snapback", R.drawable.snapback_navy,
             new BigDecimal(20.99), 9377379);
    public static final Hat SNAPBACK_RED = new Hat("Red Snapback", R.drawable.snapback_red,
             new BigDecimal(20.99), 9377380);
    public static final Hat SNAPBACK_TEAL = new Hat("Teal Snapback", R.drawable.snapback_teal,
             new BigDecimal(20.99), 9377381);

    public static final Hat[] SNAPBACKS = {SNAPBACK_NAVY, SNAPBACK_BLACK, SNAPBACK_CAMO, SNAPBACK_GREY, SNAPBACK_RED, SNAPBACK_TEAL};



}