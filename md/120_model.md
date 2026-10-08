# Paczka 120 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `fh/e4.java`, `fh/el.java`, `fh/f5.java`, `fh/fl.java`, `fh/ka.java`, `fh/kk.java`

## fh/e4.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 extends kg.a {
    public static final Parcelable.Creator<e4> CREATOR = new f5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f63015e;

    public e4(int i15, int i16, int i17, int i18, float f15) {
        this.f63011a = i15;
        this.f63012b = i16;
        this.f63013c = i17;
        this.f63014d = i18;
        this.f63015e = f15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f63011a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, i16);
        kg.c.m(parcel, 3, this.f63012b);
        kg.c.m(parcel, 4, this.f63013c);
        kg.c.m(parcel, 5, this.f63014d);
        kg.c.i(parcel, 6, this.f63015e);
        kg.c.b(parcel, iA);
    }
}

```

## fh/el.java

```java
package fh;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class el extends kg.a {
    public static final Parcelable.Creator<el> CREATOR = new fl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f63024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f63025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f63026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f63027e;

    public el(String str, Rect rect, List list, float f15, float f16) {
        this.f63023a = str;
        this.f63024b = rect;
        this.f63025c = list;
        this.f63026d = f15;
        this.f63027e = f16;
    }

    public final String c() {
        return this.f63023a;
    }

    public final float h() {
        return this.f63027e;
    }

    public final float m() {
        return this.f63026d;
    }

    public final Rect p() {
        return this.f63024b;
    }

    public final List r() {
        return this.f63025c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f63023a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.t(parcel, 2, this.f63024b, i15, false);
        kg.c.y(parcel, 3, this.f63025c, false);
        kg.c.i(parcel, 4, this.f63026d);
        kg.c.i(parcel, 5, this.f63027e);
        kg.c.b(parcel, iA);
    }
}

```

## fh/f5.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        float fR = 0.0f;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 3) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN == 4) {
                iV3 = kg.b.v(parcel, iT);
            } else if (iN == 5) {
                iV4 = kg.b.v(parcel, iT);
            } else if (iN != 6) {
                kg.b.B(parcel, iT);
            } else {
                fR = kg.b.r(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new e4(iV, iV2, iV3, iV4, fR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new e4[i15];
    }
}

```

## fh/fl.java

```java
package fh;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class fl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        float fR = 0.0f;
        float fR2 = 0.0f;
        String strH = null;
        Rect rect = null;
        ArrayList arrayListL = null;
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
                fR = kg.b.r(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                fR2 = kg.b.r(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new el(strH, rect, arrayListL, fR, fR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new el[i15];
    }
}

```

## fh/ka.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ka extends kg.a {
    public static final Parcelable.Creator<ka> CREATOR = new lb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg[] f63319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4 f63320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4 f63321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e4 f63322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f63323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f63324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f63326h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f63327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f63328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f63329l;

    public ka(rg[] rgVarArr, e4 e4Var, e4 e4Var2, e4 e4Var3, String str, float f15, String str2, int i15, boolean z15, int i16, int i17) {
        this.f63319a = rgVarArr;
        this.f63320b = e4Var;
        this.f63321c = e4Var2;
        this.f63322d = e4Var3;
        this.f63323e = str;
        this.f63324f = f15;
        this.f63325g = str2;
        this.f63326h = i15;
        this.f63327j = z15;
        this.f63328k = i16;
        this.f63329l = i17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        rg[] rgVarArr = this.f63319a;
        int iA = kg.c.a(parcel);
        kg.c.x(parcel, 2, rgVarArr, i15, false);
        kg.c.t(parcel, 3, this.f63320b, i15, false);
        kg.c.t(parcel, 4, this.f63321c, i15, false);
        kg.c.t(parcel, 5, this.f63322d, i15, false);
        kg.c.u(parcel, 6, this.f63323e, false);
        kg.c.i(parcel, 7, this.f63324f);
        kg.c.u(parcel, 8, this.f63325g, false);
        kg.c.m(parcel, 9, this.f63326h);
        kg.c.c(parcel, 10, this.f63327j);
        kg.c.m(parcel, 11, this.f63328k);
        kg.c.m(parcel, 12, this.f63329l);
        kg.c.b(parcel, iA);
    }
}

```

## fh/kk.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class kk extends kg.a {
    public static final Parcelable.Creator<kk> CREATOR = new lk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f63351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f63353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f63354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f63355e;

    public kk(int i15, int i16, int i17, int i18, long j15) {
        this.f63351a = i15;
        this.f63352b = i16;
        this.f63353c = i17;
        this.f63354d = i18;
        this.f63355e = j15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f63351a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, this.f63352b);
        kg.c.m(parcel, 3, this.f63353c);
        kg.c.m(parcel, 4, this.f63354d);
        kg.c.r(parcel, 5, this.f63355e);
        kg.c.b(parcel, iA);
    }
}

```
