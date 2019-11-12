package com.example.customview;


import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * <p> 转换相关工具类 </p><br>
 *
 * @author lwc
 * @date 2017/3/10 15:36
 * @note -
 * bytes2HexString, hexString2Bytes        : byteArr与hexString互转
 * chars2Bytes, bytes2Chars                : charArr与byteArr互转
 * memorySize2Byte, byte2MemorySize        : 以unit为单位的内存大小与字节数互转
 * byte2FitMemorySize                      : 字节数转合适内存大小
 * timeSpan2Millis, millis2TimeSpan        : 以unit为单位的时间长度与毫秒时间戳互转
 * millis2FitTimeSpan                      : 毫秒时间戳转合适时间长度
 * bytes2Bits, bits2Bytes                  : bytes与bits互转
 * input2OutputStream, output2InputStream  : inputStream与outputStream互转
 * inputStream2Bytes, bytes2InputStream    : inputStream与byteArr互转
 * outputStream2Bytes, bytes2OutputStream  : outputStream与byteArr互转
 * inputStream2String, string2InputStream  : inputStream与string按编码互转
 * outputStream2String, string2OutputStream: outputStream与string按编码互转
 * bitmap2Bytes, bytes2Bitmap              : bitmap与byteArr互转
 * drawable2Bitmap, bitmap2Drawable        : drawable与bitmap互转
 * drawable2Bytes, bytes2Drawable          : drawable与byteArr互转
 * view2Bitmap                             : view转Bitmap
 * dp2px, px2dp                            : dp与px互转
 * sp2px, px2sp                            : sp与px互转
 * -------------------------------------------------------------------------------------------------
 * @modified mos
 * @date 2017.05.19
 * @note 1. 加入十六进制字符串转int函数：hexStr2Int
 * -------------------------------------------------------------------------------------------------
 * @modified -
 * @date -
 * @note -
 */
public class ConvertUtils {

    /**
     * dp转px
     *
     * @param dpValue dp值
     * @return px值
     */
    public static int dp2px(float dpValue) {
        final float scale = Utils.getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * sp转px
     *
     * @param spValue sp值
     * @return px值
     */
    public static int sp2px(float spValue) {
        final float fontScale = Utils.getContext().getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }
}
