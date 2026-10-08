# Paczka 121 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `fh/lb.java`, `fh/lk.java`, `fh/mc.java`, `fh/nd.java`, `fh/oe.java`, `fh/qf.java`, `fh/rg.java`, `fh/sh.java`, `fh/tk.java`

## fh/lb.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class lb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        boolean zO = false;
        int iV2 = 0;
        int iV3 = 0;
        rg[] rgVarArr = null;
        e4 e4Var = null;
        e4 e4Var2 = null;
        e4 e4Var3 = null;
        String strH = null;
        String strH2 = null;
        float fR = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    rgVarArr = (rg[]) kg.b.k(parcel, iT, rg.CREATOR);
                    break;
                case 3:
                    e4Var = (e4) kg.b.g(parcel, iT, e4.CREATOR);
                    break;
                case 4:
                    e4Var2 = (e4) kg.b.g(parcel, iT, e4.CREATOR);
                    break;
                case 5:
                    e4Var3 = (e4) kg.b.g(parcel, iT, e4.CREATOR);
                    break;
                case 6:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 7:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 8:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 9:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 10:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 11:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 12:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new ka(rgVarArr, e4Var, e4Var2, e4Var3, strH, fR, strH2, iV, zO, iV2, iV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new ka[i15];
    }
}

```

## fh/lk.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class lk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        long jY = 0;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN == 3) {
                iV3 = kg.b.v(parcel, iT);
            } else if (iN == 4) {
                iV4 = kg.b.v(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                jY = kg.b.y(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new kk(iV, iV2, iV3, iV4, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new kk[i15];
    }
}

```

## fh/mc.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class mc extends kg.a {
    public static final Parcelable.Creator<mc> CREATOR = new nd();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        kg.c.b(parcel, kg.c.a(parcel));
    }
}

```

## fh/nd.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class nd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            kg.b.n(iT);
            kg.b.B(parcel, iT);
        }
        kg.b.m(parcel, iC);
        return new mc();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new mc[i15];
    }
}

```

## fh/oe.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class oe extends kg.a {
    public static final Parcelable.Creator<oe> CREATOR = new qf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63432a;

    public oe(String str) {
        this.f63432a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f63432a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, str, false);
        kg.c.b(parcel, iA);
    }
}

```

## fh/qf.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class qf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 2) {
                kg.b.B(parcel, iT);
            } else {
                strH = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new oe(strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new oe[i15];
    }
}

```

## fh/rg.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class rg extends kg.a {
    public static final Parcelable.Creator<rg> CREATOR = new sh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mc[] f63491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4 f63492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4 f63493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f63494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f63495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f63496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f63497g;

    public rg(mc[] mcVarArr, e4 e4Var, e4 e4Var2, String str, float f15, String str2, boolean z15) {
        this.f63491a = mcVarArr;
        this.f63492b = e4Var;
        this.f63493c = e4Var2;
        this.f63494d = str;
        this.f63495e = f15;
        this.f63496f = str2;
        this.f63497g = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        mc[] mcVarArr = this.f63491a;
        int iA = kg.c.a(parcel);
        kg.c.x(parcel, 2, mcVarArr, i15, false);
        kg.c.t(parcel, 3, this.f63492b, i15, false);
        kg.c.t(parcel, 4, this.f63493c, i15, false);
        kg.c.u(parcel, 5, this.f63494d, false);
        kg.c.i(parcel, 6, this.f63495e);
        kg.c.u(parcel, 7, this.f63496f, false);
        kg.c.c(parcel, 8, this.f63497g);
        kg.c.b(parcel, iA);
    }
}

```

## fh/sh.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class sh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        boolean zO = false;
        mc[] mcVarArr = null;
        e4 e4Var = null;
        e4 e4Var2 = null;
        String strH = null;
        String strH2 = null;
        float fR = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    mcVarArr = (mc[]) kg.b.k(parcel, iT, mc.CREATOR);
                    break;
                case 3:
                    e4Var = (e4) kg.b.g(parcel, iT, e4.CREATOR);
                    break;
                case 4:
                    e4Var2 = (e4) kg.b.g(parcel, iT, e4.CREATOR);
                    break;
                case 5:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 6:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 7:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    zO = kg.b.o(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new rg(mcVarArr, e4Var, e4Var2, strH, fR, strH2, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new rg[i15];
    }
}

```

## fh/tk.java

```java
package fh;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tk extends kg.a {
    public static final Parcelable.Creator<tk> CREATOR = new vk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f63546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f63547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f63548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f63549e;

    public tk(String str, Rect rect, List list, String str2, List list2) {
        this.f63545a = str;
        this.f63546b = rect;
        this.f63547c = list;
        this.f63548d = str2;
        this.f63549e = list2;
    }

    public final String a() {
        return this.f63545a;
    }

    public final Rect h() {
        return this.f63546b;
    }

    public final String m() {
        return this.f63548d;
    }

    public final List p() {
        return this.f63547c;
    }

    public final List r() {
        return this.f63549e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f63545a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.t(parcel, 2, this.f63546b, i15, false);
        kg.c.y(parcel, 3, this.f63547c, false);
        kg.c.u(parcel, 4, this.f63548d, false);
        kg.c.y(parcel, 5, this.f63549e, false);
        kg.c.b(parcel, iA);
    }
}

```
