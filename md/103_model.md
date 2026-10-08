# Paczka 103 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ch/yg.java`, `ch/yk.java`, `ch/yl.java`, `ch/zh.java`, `ch/zl.java`

## ch/yg.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class yg extends kg.a {
    public static final Parcelable.Creator<yg> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26704c;

    public yg() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f26702a, false);
        kg.c.u(parcel, 3, this.f26703b, false);
        kg.c.m(parcel, 4, this.f26704c);
        kg.c.b(parcel, iA);
    }

    public yg(String str, String str2, int i15) {
        this.f26702a = str;
        this.f26703b = str2;
        this.f26704c = i15;
    }
}

```

## ch/yk.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class yk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        n6 n6Var = null;
        n6 n6Var2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    strH5 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    n6Var = (n6) kg.b.g(parcel, iT, n6.CREATOR);
                    break;
                case 8:
                    n6Var2 = (n6) kg.b.g(parcel, iT, n6.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new o7(strH, strH2, strH3, strH4, strH5, n6Var, n6Var2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new o7[i15];
    }
}

```

## ch/yl.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class yl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ml mlVar = null;
        String strH = null;
        String strH2 = null;
        nl[] nlVarArr = null;
        kl[] klVarArr = null;
        String[] strArrI = null;
        fl[] flVarArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    mlVar = (ml) kg.b.g(parcel, iT, ml.CREATOR);
                    break;
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    nlVarArr = (nl[]) kg.b.k(parcel, iT, nl.CREATOR);
                    break;
                case 5:
                    klVarArr = (kl[]) kg.b.k(parcel, iT, kl.CREATOR);
                    break;
                case 6:
                    strArrI = kg.b.i(parcel, iT);
                    break;
                case 7:
                    flVarArr = (fl[]) kg.b.k(parcel, iT, fl.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new il(mlVar, strH, strH2, nlVarArr, klVarArr, strArrI, flVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new il[i15];
    }
}

```

## ch/zh.java

```java
package ch;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zh extends kg.a {
    public static final Parcelable.Creator<zh> CREATOR = new wi();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Point[] f26751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ra f26752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ud f26753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ve f26754h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yg f26755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public xf f26756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public sb f26757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o7 f26758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p8 f26759n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q9 f26760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f26761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double f26763s;

    public zh() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f26747a);
        kg.c.u(parcel, 3, this.f26748b, false);
        kg.c.u(parcel, 4, this.f26749c, false);
        kg.c.m(parcel, 5, this.f26750d);
        kg.c.x(parcel, 6, this.f26751e, i15, false);
        kg.c.t(parcel, 7, this.f26752f, i15, false);
        kg.c.t(parcel, 8, this.f26753g, i15, false);
        kg.c.t(parcel, 9, this.f26754h, i15, false);
        kg.c.t(parcel, 10, this.f26755j, i15, false);
        kg.c.t(parcel, 11, this.f26756k, i15, false);
        kg.c.t(parcel, 12, this.f26757l, i15, false);
        kg.c.t(parcel, 13, this.f26758m, i15, false);
        kg.c.t(parcel, 14, this.f26759n, i15, false);
        kg.c.t(parcel, 15, this.f26760p, i15, false);
        kg.c.f(parcel, 16, this.f26761q, false);
        kg.c.c(parcel, 17, this.f26762r);
        kg.c.h(parcel, 18, this.f26763s);
        kg.c.b(parcel, iA);
    }

    public zh(int i15, String str, String str2, int i16, Point[] pointArr, ra raVar, ud udVar, ve veVar, yg ygVar, xf xfVar, sb sbVar, o7 o7Var, p8 p8Var, q9 q9Var, byte[] bArr, boolean z15, double d15) {
        this.f26747a = i15;
        this.f26748b = str;
        this.f26761q = bArr;
        this.f26749c = str2;
        this.f26750d = i16;
        this.f26751e = pointArr;
        this.f26762r = z15;
        this.f26763s = d15;
        this.f26752f = raVar;
        this.f26753g = udVar;
        this.f26754h = veVar;
        this.f26755j = ygVar;
        this.f26756k = xfVar;
        this.f26757l = sbVar;
        this.f26758m = o7Var;
        this.f26759n = p8Var;
        this.f26760p = q9Var;
    }
}

```

## ch/zl.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        String strH8 = null;
        String strH9 = null;
        String strH10 = null;
        String strH11 = null;
        String strH12 = null;
        String strH13 = null;
        String strH14 = null;
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
                    strH6 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    strH7 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    strH8 = kg.b.h(parcel, iT);
                    break;
                case 9:
                    strH9 = kg.b.h(parcel, iT);
                    break;
                case 10:
                    strH10 = kg.b.h(parcel, iT);
                    break;
                case 11:
                    strH11 = kg.b.h(parcel, iT);
                    break;
                case 12:
                    strH12 = kg.b.h(parcel, iT);
                    break;
                case 13:
                    strH13 = kg.b.h(parcel, iT);
                    break;
                case 14:
                    strH14 = kg.b.h(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new jl(strH, strH2, strH3, strH4, strH5, strH6, strH7, strH8, strH9, strH10, strH11, strH12, strH13, strH14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new jl[i15];
    }
}

```
