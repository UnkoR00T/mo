# Paczka 098 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ch/j.java`, `ch/jl.java`, `ch/jm.java`, `ch/kl.java`, `ch/km.java`, `ch/l4.java`, `ch/ll.java`, `ch/lm.java`, `ch/m5.java`

## ch/j.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                zO = kg.b.o(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new i(iV, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new i[i15];
    }
}

```

## ch/jl.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jl extends kg.a {
    public static final Parcelable.Creator<jl> CREATOR = new zl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f25987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25988h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f25989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f25990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f25991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f25992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f25993n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f25994p;

    public jl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f25981a = str;
        this.f25982b = str2;
        this.f25983c = str3;
        this.f25984d = str4;
        this.f25985e = str5;
        this.f25986f = str6;
        this.f25987g = str7;
        this.f25988h = str8;
        this.f25989j = str9;
        this.f25990k = str10;
        this.f25991l = str11;
        this.f25992m = str12;
        this.f25993n = str13;
        this.f25994p = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f25981a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f25982b, false);
        kg.c.u(parcel, 3, this.f25983c, false);
        kg.c.u(parcel, 4, this.f25984d, false);
        kg.c.u(parcel, 5, this.f25985e, false);
        kg.c.u(parcel, 6, this.f25986f, false);
        kg.c.u(parcel, 7, this.f25987g, false);
        kg.c.u(parcel, 8, this.f25988h, false);
        kg.c.u(parcel, 9, this.f25989j, false);
        kg.c.u(parcel, 10, this.f25990k, false);
        kg.c.u(parcel, 11, this.f25991l, false);
        kg.c.u(parcel, 12, this.f25992m, false);
        kg.c.u(parcel, 13, this.f25993n, false);
        kg.c.u(parcel, 14, this.f25994p, false);
        kg.c.b(parcel, iA);
    }
}

```

## ch/jm.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                strH = kg.b.h(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                strH2 = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new pl(strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new pl[i15];
    }
}

```

## ch/kl.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class kl extends kg.a {
    public static final Parcelable.Creator<kl> CREATOR = new am();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26106d;

    public kl(int i15, String str, String str2, String str3) {
        this.f26103a = i15;
        this.f26104b = str;
        this.f26105c = str2;
        this.f26106d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f26103a);
        kg.c.u(parcel, 2, this.f26104b, false);
        kg.c.u(parcel, 3, this.f26105c, false);
        kg.c.u(parcel, 4, this.f26106d, false);
        kg.c.b(parcel, iA);
    }
}

```

## ch/km.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class km implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 2) {
                strH2 = kg.b.h(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                iV = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new rl(strH, strH2, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new rl[i15];
    }
}

```

## ch/l4.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class l4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String[] strArrI = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                strArrI = kg.b.i(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new m5(iV, strArrI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new m5[i15];
    }
}

```

## ch/ll.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ll extends kg.a {
    public static final Parcelable.Creator<ll> CREATOR = new bm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f26143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f26144b;

    public ll(double d15, double d16) {
        this.f26143a = d15;
        this.f26144b = d16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.h(parcel, 1, this.f26143a);
        kg.c.h(parcel, 2, this.f26144b);
        kg.c.b(parcel, iA);
    }
}

```

## ch/lm.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class lm extends kg.a {
    public static final Parcelable.Creator<lm> CREATOR = new mm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f26149e;

    public lm(int i15, int i16, int i17, int i18, long j15) {
        this.f26145a = i15;
        this.f26146b = i16;
        this.f26147c = i17;
        this.f26148d = i18;
        this.f26149e = j15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f26145a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, this.f26146b);
        kg.c.m(parcel, 3, this.f26147c);
        kg.c.m(parcel, 4, this.f26148d);
        kg.c.r(parcel, 5, this.f26149e);
        kg.c.b(parcel, iA);
    }
}

```

## ch/m5.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class m5 extends kg.a {
    public static final Parcelable.Creator<m5> CREATOR = new l4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f26152b;

    public m5() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f26151a);
        kg.c.v(parcel, 3, this.f26152b, false);
        kg.c.b(parcel, iA);
    }

    public m5(int i15, String[] strArr) {
        this.f26151a = i15;
        this.f26152b = strArr;
    }
}

```
