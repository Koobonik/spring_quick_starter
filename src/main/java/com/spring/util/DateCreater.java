package com.spring.util;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@NoArgsConstructor
@Getter
public class DateCreater {
    // 날짜 잡아주기
    Date datetime = new Date();
    SimpleDateFormat simpleDateFormat_yyyy_MM_dd_HH_mm_ss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);
    SimpleDateFormat simpleDateFormat_yyyy_MM_dd = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
    SimpleDateFormat simpleDateFormat_yyyyMMdd = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
    String createdDate_yyyy_MM_dd_HH_mm_ss = simpleDateFormat_yyyy_MM_dd_HH_mm_ss.format(datetime);
    String createdDate_yyyy_MM_dd = simpleDateFormat_yyyy_MM_dd.format(datetime);
    String createdDate_yyyyMMdd = simpleDateFormat_yyyyMMdd.format(datetime);
}
