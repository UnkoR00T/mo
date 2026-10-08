package de;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f41108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41109d;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f41110i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f41111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ActivityManager f41112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f41113c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f41115e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f41114d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f41116f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f41117g = 0.33f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f41118h = 4194304;

        public a(Context context) {
            this.f41115e = f41110i;
            this.f41111a = context;
            this.f41112b = (ActivityManager) context.getSystemService("activity");
            this.f41113c = new b(context.getResources().getDisplayMetrics());
            if (i.e(this.f41112b)) {
                this.f41115e = 0.0f;
            }
        }

        public i a() {
            return new i(this);
        }
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f41119a;

        b(DisplayMetrics displayMetrics) {
            this.f41119a = displayMetrics;
        }

        @Override // de.i.c
        public int a() {
            return this.f41119a.heightPixels;
        }

        @Override // de.i.c
        public int b() {
            return this.f41119a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f41108c = aVar.f41111a;
        int i15 = e(aVar.f41112b) ? aVar.f41118h / 2 : aVar.f41118h;
        this.f41109d = i15;
        int iC = c(aVar.f41112b, aVar.f41116f, aVar.f41117g);
        float fB = aVar.f41113c.b() * aVar.f41113c.a() * 4;
        int iRound = Math.round(aVar.f41115e * fB);
        int iRound2 = Math.round(fB * aVar.f41114d);
        int i16 = iC - i15;
        if (iRound2 + iRound <= i16) {
            this.f41107b = iRound2;
            this.f41106a = iRound;
        } else {
            float f15 = i16;
            float f16 = aVar.f41115e;
            float f17 = aVar.f41114d;
            float f18 = f15 / (f16 + f17);
            this.f41107b = Math.round(f17 * f18);
            this.f41106a = Math.round(f18 * aVar.f41115e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            f(this.f41107b);
            f(this.f41106a);
            f(i15);
            f(iC);
            aVar.f41112b.getMemoryClass();
            e(aVar.f41112b);
        }
    }

    private static int c(ActivityManager activityManager, float f15, float f16) {
        float memoryClass = activityManager.getMemoryClass() * PKIFailureInfo.badCertTemplate;
        if (e(activityManager)) {
            f15 = f16;
        }
        return Math.round(memoryClass * f15);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i15) {
        return Formatter.formatFileSize(this.f41108c, i15);
    }

    public int a() {
        return this.f41109d;
    }

    public int b() {
        return this.f41106a;
    }

    public int d() {
        return this.f41107b;
    }
}
