package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p007NuL.m;
import p007NuL.n;
import p007NuL.p;
import p007NuL.v;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8311a;

    private a(Context context) {
        this.f8311a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f8311a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f8311a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f8311a.getResources().getConfiguration();
        int i15 = configuration.screenWidthDp;
        int i16 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i15 > 600) {
            return 5;
        }
        if (i15 > 960 && i16 > 720) {
            return 5;
        }
        if (i15 > 720 && i16 > 960) {
            return 5;
        }
        if (i15 >= 500) {
            return 4;
        }
        if (i15 > 640 && i16 > 480) {
            return 4;
        }
        if (i15 <= 480 || i16 <= 640) {
            return i15 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f8311a.getResources().getDimensionPixelSize(p.f344b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f8311a.obtainStyledAttributes(null, v.f437a, m.f310c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(v.f482j, 0);
        Resources resources = this.f8311a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(p.f343a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f8311a.getResources().getBoolean(n.f334a);
    }

    public boolean h() {
        return true;
    }
}
