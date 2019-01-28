package com.codingwithmitch.swipingviewpager.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalUtil {

    public static String getValue(BigDecimal value){
        DecimalFormat df = new DecimalFormat("###,###,###.00");
        return String.valueOf(df.format(value));
    }


}
