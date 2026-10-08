package com.google.android.exoplayer2.ui;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class b {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i15) {
        return bg.c.b("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i15)), Integer.valueOf(Color.green(i15)), Integer.valueOf(Color.blue(i15)), Double.valueOf(((double) Color.alpha(i15)) / 255.0d));
    }
}
