package com.example.rubiccube10;

import android.graphics.Color;
import android.widget.ImageView;
import android.widget.TextView;

public class DTO {
    private ImageView iv_1;
    private ImageView iv_2;
    private ImageView iv_3;

    private ImageView iv_4;
    private ImageView iv_5;
    private ImageView iv_6;

    private ImageView iv_7;
    private ImageView iv_8;
    private ImageView iv_9;

    private TextView tv_1;
    private TextView tv_2;
    private TextView tv_3;

    private TextView tv_4;
    private TextView tv_5;
    private TextView tv_6;

    private TextView tv_7;
    private TextView tv_8;
    private TextView tv_9;

    public DTO(ImageView iv_1, ImageView iv_2, ImageView iv_3,
               ImageView iv_4, ImageView iv_5, ImageView iv_6,
               ImageView iv_7, ImageView iv_8, ImageView iv_9,

               TextView tv_1, TextView tv_2, TextView tv_3,
               TextView tv_4, TextView tv_5, TextView tv_6,
               TextView tv_7, TextView tv_8, TextView tv_9) {
        this.iv_1 = iv_1;
        this.iv_2 = iv_2;
        this.iv_3 = iv_3;

        this.iv_4 = iv_4;
        this.iv_5 = iv_5;
        this.iv_6 = iv_6;

        this.iv_7 = iv_7;
        this.iv_8 = iv_8;
        this.iv_9 = iv_9;

        this.tv_1 = tv_1;
        this.tv_2 = tv_2;
        this.tv_3 = tv_3;

        this.tv_4 = tv_4;
        this.tv_5 = tv_5;
        this.tv_6 = tv_6;

        this.tv_7 = tv_7;
        this.tv_8 = tv_8;
        this.tv_9 = tv_9;
    }

    public TextView getTv_1() {
        return tv_1;
    }

    public TextView getTv_2() {
        return tv_2;
    }

    public TextView getTv_3() {
        return tv_3;
    }

    public TextView getTv_4() {
        return tv_4;
    }

    public TextView getTv_5() {
        return tv_5;
    }

    public TextView getTv_6() {
        return tv_6;
    }

    public TextView getTv_7() {
        return tv_7;
    }

    public TextView getTv_8() {
        return tv_8;
    }

    public TextView getTv_9() {
        return tv_9;
    }

    public ImageView getIv_1() {
        return iv_1;
    }

    public ImageView getIv_2() {
        return iv_2;
    }

    public ImageView getIv_3() {
        return iv_3;
    }

    public ImageView getIv_4() {
        return iv_4;
    }

    public ImageView getIv_5() {
        return iv_5;
    }

    public ImageView getIv_6() {
        return iv_6;
    }

    public ImageView getIv_7() {
        return iv_7;
    }

    public ImageView getIv_8() {
        return iv_8;
    }

    public ImageView getIv_9() {
        return iv_9;
    }

    public void printV_1(boolean white) {
        if (white) {
            iv_1.setBackgroundColor(Color.WHITE);
            tv_1.setTextColor(Color.BLACK);
        } else {
            iv_1.setBackgroundColor(Color.BLACK);
            tv_1.setTextColor(Color.WHITE);
        }
    }
    public void printV_2(boolean white) {
        if (white) {
            iv_2.setBackgroundColor(Color.WHITE);
            tv_2.setTextColor(Color.BLACK);
        } else {
            iv_2.setBackgroundColor(Color.BLACK);
            tv_2.setTextColor(Color.WHITE);
        }
    }
    public void printV_3(boolean white) {
        if (white) {
            iv_3.setBackgroundColor(Color.WHITE);
            tv_3.setTextColor(Color.BLACK);
        } else {
            iv_3.setBackgroundColor(Color.BLACK);
            tv_3.setTextColor(Color.WHITE);
        }
    }
    public void printV_4(boolean white) {
        if (white) {
            iv_4.setBackgroundColor(Color.WHITE);
            tv_4.setTextColor(Color.BLACK);
        } else {
            iv_4.setBackgroundColor(Color.BLACK);
            tv_4.setTextColor(Color.WHITE);
        }
    }
    public void printV_5(boolean white) {
        if (white) {
            iv_5.setBackgroundColor(Color.WHITE);
            tv_5.setTextColor(Color.BLACK);
        } else {
            iv_5.setBackgroundColor(Color.BLACK);
            tv_5.setTextColor(Color.WHITE);
        }
    }
    public void printV_6(boolean white) {
        if (white) {
            iv_6.setBackgroundColor(Color.WHITE);
            tv_6.setTextColor(Color.BLACK);
        } else {
            iv_6.setBackgroundColor(Color.BLACK);
            tv_6.setTextColor(Color.WHITE);
        }
    }
    public void printV_7(boolean white) {
        if (white) {
            iv_7.setBackgroundColor(Color.WHITE);
            tv_7.setTextColor(Color.BLACK);
        } else {
            iv_7.setBackgroundColor(Color.BLACK);
            tv_7.setTextColor(Color.WHITE);
        }
    }
    public void printV_8(boolean white) {
        if (white) {
            iv_8.setBackgroundColor(Color.WHITE);
            tv_8.setTextColor(Color.BLACK);
        } else {
            iv_8.setBackgroundColor(Color.BLACK);
            tv_8.setTextColor(Color.WHITE);
        }
    }
    public void printV_9(boolean white) {
        if (white) {
            iv_9.setBackgroundColor(Color.WHITE);
            tv_9.setTextColor(Color.BLACK);
        } else {
            iv_9.setBackgroundColor(Color.BLACK);
            tv_9.setTextColor(Color.WHITE);
        }
    }
}
