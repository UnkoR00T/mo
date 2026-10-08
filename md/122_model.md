# Paczka 122 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `fh/vk.java`, `fh/wk.java`, `fh/xk.java`, `fh/yk.java`, `fh/zk.java`, `gb/a.java`

## fh/vk.java

```java
package fh;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class vk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        Rect rect = null;
        ArrayList arrayListL = null;
        String strH2 = null;
        ArrayList arrayListL2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 2) {
                rect = (Rect) kg.b.g(parcel, iT, Rect.CREATOR);
            } else if (iN == 3) {
                arrayListL = kg.b.l(parcel, iT, Point.CREATOR);
            } else if (iN == 4) {
                strH2 = kg.b.h(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                arrayListL2 = kg.b.l(parcel, iT, yk.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new tk(strH, rect, arrayListL, strH2, arrayListL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new tk[i15];
    }
}

```

## fh/wk.java

```java
package fh;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wk extends kg.a {
    public static final Parcelable.Creator<wk> CREATOR = new xk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f63694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f63695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f63696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f63697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f63698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f63699g;

    public wk(String str, Rect rect, List list, String str2, float f15, float f16, List list2) {
        this.f63693a = str;
        this.f63694b = rect;
        this.f63695c = list;
        this.f63696d = str2;
        this.f63697e = f15;
        this.f63698f = f16;
        this.f63699g = list2;
    }

    public final String c() {
        return this.f63696d;
    }

    public final String d() {
        return this.f63693a;
    }

    public final float h() {
        return this.f63698f;
    }

    public final float m() {
        return this.f63697e;
    }

    public final Rect p() {
        return this.f63694b;
    }

    public final List r() {
        return this.f63695c;
    }

    public final List u() {
        return this.f63699g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f63693a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.t(parcel, 2, this.f63694b, i15, false);
        kg.c.y(parcel, 3, this.f63695c, false);
        kg.c.u(parcel, 4, this.f63696d, false);
        kg.c.i(parcel, 5, this.f63697e);
        kg.c.i(parcel, 6, this.f63698f);
        kg.c.y(parcel, 7, this.f63699g, false);
        kg.c.b(parcel, iA);
    }
}

```

## fh/xk.java

```java
package fh;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class xk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        Rect rect = null;
        ArrayList arrayListL = null;
        String strH2 = null;
        ArrayList arrayListL2 = null;
        float fR = 0.0f;
        float fR2 = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 2:
                    rect = (Rect) kg.b.g(parcel, iT, Rect.CREATOR);
                    break;
                case 3:
                    arrayListL = kg.b.l(parcel, iT, Point.CREATOR);
                    break;
                case 4:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 6:
                    fR2 = kg.b.r(parcel, iT);
                    break;
                case 7:
                    arrayListL2 = kg.b.l(parcel, iT, el.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new wk(strH, rect, arrayListL, strH2, fR, fR2, arrayListL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new wk[i15];
    }
}

```

## fh/yk.java

```java
package fh;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yk extends kg.a {
    public static final Parcelable.Creator<yk> CREATOR = new zk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f63752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f63753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f63754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f63755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f63756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f63757g;

    public yk(String str, Rect rect, List list, String str2, List list2, float f15, float f16) {
        this.f63751a = str;
        this.f63752b = rect;
        this.f63753c = list;
        this.f63754d = str2;
        this.f63755e = list2;
        this.f63756f = f15;
        this.f63757g = f16;
    }

    public final String c() {
        return this.f63754d;
    }

    public final String d() {
        return this.f63751a;
    }

    public final float h() {
        return this.f63757g;
    }

    public final float m() {
        return this.f63756f;
    }

    public final Rect p() {
        return this.f63752b;
    }

    public final List r() {
        return this.f63753c;
    }

    public final List u() {
        return this.f63755e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f63751a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.t(parcel, 2, this.f63752b, i15, false);
        kg.c.y(parcel, 3, this.f63753c, false);
        kg.c.u(parcel, 4, this.f63754d, false);
        kg.c.y(parcel, 5, this.f63755e, false);
        kg.c.i(parcel, 6, this.f63756f);
        kg.c.i(parcel, 7, this.f63757g);
        kg.c.b(parcel, iA);
    }
}

```

## fh/zk.java

```java
package fh;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        float fR = 0.0f;
        float fR2 = 0.0f;
        String strH = null;
        Rect rect = null;
        ArrayList arrayListL = null;
        String strH2 = null;
        ArrayList arrayListL2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 2:
                    rect = (Rect) kg.b.g(parcel, iT, Rect.CREATOR);
                    break;
                case 3:
                    arrayListL = kg.b.l(parcel, iT, Point.CREATOR);
                    break;
                case 4:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    arrayListL2 = kg.b.l(parcel, iT, wk.CREATOR);
                    break;
                case 6:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 7:
                    fR2 = kg.b.r(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new yk(strH, rect, arrayListL, strH2, arrayListL2, fR, fR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new yk[i15];
    }
}

```

## gb/a.java

```java
package gb;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    private a() {
    }

    public static <T extends b> T a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static <T extends b> T b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(a.class.getClassLoader());
            return (T) a(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}

```
