# Paczka 102 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ch/ul.java`, `ch/ve.java`, `ch/vl.java`, `ch/wi.java`, `ch/wl.java`, `ch/xf.java`, `ch/xj.java`, `ch/xl.java`

## ch/ul.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ul extends kg.a {
    public static final Parcelable.Creator<ul> CREATOR = new vl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26408b;

    public ul(int i15, boolean z15) {
        this.f26407a = i15;
        this.f26408b = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f26407a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.c(parcel, 2, this.f26408b);
        kg.c.b(parcel, iA);
    }
}

```

## ch/ve.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ve extends kg.a {
    public static final Parcelable.Creator<ve> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26432b;

    public ve() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f26431a, false);
        kg.c.u(parcel, 3, this.f26432b, false);
        kg.c.b(parcel, iA);
    }

    public ve(String str, String str2) {
        this.f26431a = str;
        this.f26432b = str2;
    }
}

```

## ch/vl.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class vl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                zO = kg.b.o(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new ul(iV, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new ul[i15];
    }
}

```

## ch/wi.java

```java
package ch;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class wi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        double dQ = 0.0d;
        int iV = 0;
        int iV2 = 0;
        boolean zO = false;
        String strH = null;
        String strH2 = null;
        Point[] pointArr = null;
        ra raVar = null;
        ud udVar = null;
        ve veVar = null;
        yg ygVar = null;
        xf xfVar = null;
        sb sbVar = null;
        o7 o7Var = null;
        p8 p8Var = null;
        q9 q9Var = null;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 3:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 6:
                    pointArr = (Point[]) kg.b.k(parcel, iT, Point.CREATOR);
                    break;
                case 7:
                    raVar = (ra) kg.b.g(parcel, iT, ra.CREATOR);
                    break;
                case 8:
                    udVar = (ud) kg.b.g(parcel, iT, ud.CREATOR);
                    break;
                case 9:
                    veVar = (ve) kg.b.g(parcel, iT, ve.CREATOR);
                    break;
                case 10:
                    ygVar = (yg) kg.b.g(parcel, iT, yg.CREATOR);
                    break;
                case 11:
                    xfVar = (xf) kg.b.g(parcel, iT, xf.CREATOR);
                    break;
                case 12:
                    sbVar = (sb) kg.b.g(parcel, iT, sb.CREATOR);
                    break;
                case 13:
                    o7Var = (o7) kg.b.g(parcel, iT, o7.CREATOR);
                    break;
                case 14:
                    p8Var = (p8) kg.b.g(parcel, iT, p8.CREATOR);
                    break;
                case 15:
                    q9Var = (q9) kg.b.g(parcel, iT, q9.CREATOR);
                    break;
                case 16:
                    bArrB = kg.b.b(parcel, iT);
                    break;
                case 17:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 18:
                    dQ = kg.b.q(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new zh(iV, strH, strH2, iV2, pointArr, raVar, udVar, veVar, ygVar, xfVar, sbVar, o7Var, p8Var, q9Var, bArrB, zO, dQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new zh[i15];
    }
}

```

## ch/wl.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class wl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        int iV5 = 0;
        int iV6 = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 2:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 3:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                case 4:
                    iV4 = kg.b.v(parcel, iT);
                    break;
                case 5:
                    iV5 = kg.b.v(parcel, iT);
                    break;
                case 6:
                    iV6 = kg.b.v(parcel, iT);
                    break;
                case 7:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 8:
                    strH = kg.b.h(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new gl(iV, iV2, iV3, iV4, iV5, iV6, zO, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new gl[i15];
    }
}

```

## ch/xf.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class xf extends kg.a {
    public static final Parcelable.Creator<xf> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26526b;

    public xf() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f26525a, false);
        kg.c.u(parcel, 3, this.f26526b, false);
        kg.c.b(parcel, iA);
    }

    public xf(String str, String str2) {
        this.f26525a = str;
        this.f26526b = str2;
    }
}

```

## ch/xj.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class xj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        int iV5 = 0;
        int iV6 = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 3:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 4:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                case 5:
                    iV4 = kg.b.v(parcel, iT);
                    break;
                case 6:
                    iV5 = kg.b.v(parcel, iT);
                    break;
                case 7:
                    iV6 = kg.b.v(parcel, iT);
                    break;
                case 8:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 9:
                    strH = kg.b.h(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new n6(iV, iV2, iV3, iV4, iV5, iV6, zO, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new n6[i15];
    }
}

```

## ch/xl.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class xl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        gl glVar = null;
        gl glVar2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 2:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH5 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    glVar = (gl) kg.b.g(parcel, iT, gl.CREATOR);
                    break;
                case 7:
                    glVar2 = (gl) kg.b.g(parcel, iT, gl.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new hl(strH, strH2, strH3, strH4, strH5, glVar, glVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new hl[i15];
    }
}

```
