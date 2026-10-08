# Paczka 100 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ch/ol.java`, `ch/p.java`, `ch/p0.java`, `ch/p8.java`, `ch/pl.java`, `ch/q9.java`, `ch/ql.java`, `ch/ra.java`

## ch/ol.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ol extends kg.a {
    public static final Parcelable.Creator<ol> CREATOR = new im();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26238b;

    public ol(String str, String str2) {
        this.f26237a = str;
        this.f26238b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f26237a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f26238b, false);
        kg.c.b(parcel, iA);
    }
}

```

## ch/p.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        long jY = 0;
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
                jY = kg.b.y(parcel, iT);
            } else if (iN != 6) {
                kg.b.B(parcel, iT);
            } else {
                iV4 = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new o(iV, iV2, iV3, jY, iV4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new o[i15];
    }
}

```

## ch/p0.java

```java
package ch;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {
    static {
        p0.class.getClassLoader();
    }

    private p0() {
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}

```

## ch/p8.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class p8 extends kg.a {
    public static final Parcelable.Creator<p8> CREATOR = new ql();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tc f26248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ud[] f26251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ra[] f26252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f26253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m5[] f26254g;

    public p8() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 2, this.f26248a, i15, false);
        kg.c.u(parcel, 3, this.f26249b, false);
        kg.c.u(parcel, 4, this.f26250c, false);
        kg.c.x(parcel, 5, this.f26251d, i15, false);
        kg.c.x(parcel, 6, this.f26252e, i15, false);
        kg.c.v(parcel, 7, this.f26253f, false);
        kg.c.x(parcel, 8, this.f26254g, i15, false);
        kg.c.b(parcel, iA);
    }

    public p8(tc tcVar, String str, String str2, ud[] udVarArr, ra[] raVarArr, String[] strArr, m5[] m5VarArr) {
        this.f26248a = tcVar;
        this.f26249b = str;
        this.f26250c = str2;
        this.f26251d = udVarArr;
        this.f26252e = raVarArr;
        this.f26253f = strArr;
        this.f26254g = m5VarArr;
    }
}

```

## ch/pl.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class pl extends kg.a {
    public static final Parcelable.Creator<pl> CREATOR = new jm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26269b;

    public pl(String str, String str2) {
        this.f26268a = str;
        this.f26269b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f26268a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f26269b, false);
        kg.c.b(parcel, iA);
    }
}

```

## ch/q9.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class q9 extends kg.a {
    public static final Parcelable.Creator<q9> CREATOR = new nm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26283h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f26286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f26287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f26288n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f26289p;

    public q9() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f26276a, false);
        kg.c.u(parcel, 3, this.f26277b, false);
        kg.c.u(parcel, 4, this.f26278c, false);
        kg.c.u(parcel, 5, this.f26279d, false);
        kg.c.u(parcel, 6, this.f26280e, false);
        kg.c.u(parcel, 7, this.f26281f, false);
        kg.c.u(parcel, 8, this.f26282g, false);
        kg.c.u(parcel, 9, this.f26283h, false);
        kg.c.u(parcel, 10, this.f26284j, false);
        kg.c.u(parcel, 11, this.f26285k, false);
        kg.c.u(parcel, 12, this.f26286l, false);
        kg.c.u(parcel, 13, this.f26287m, false);
        kg.c.u(parcel, 14, this.f26288n, false);
        kg.c.u(parcel, 15, this.f26289p, false);
        kg.c.b(parcel, iA);
    }

    public q9(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f26276a = str;
        this.f26277b = str2;
        this.f26278c = str3;
        this.f26279d = str4;
        this.f26280e = str5;
        this.f26281f = str6;
        this.f26282g = str7;
        this.f26283h = str8;
        this.f26284j = str9;
        this.f26285k = str10;
        this.f26286l = str11;
        this.f26287m = str12;
        this.f26288n = str13;
        this.f26289p = str14;
    }
}

```

## ch/ql.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ql implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        tc tcVar = null;
        String strH = null;
        String strH2 = null;
        ud[] udVarArr = null;
        ra[] raVarArr = null;
        String[] strArrI = null;
        m5[] m5VarArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    tcVar = (tc) kg.b.g(parcel, iT, tc.CREATOR);
                    break;
                case 3:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    udVarArr = (ud[]) kg.b.k(parcel, iT, ud.CREATOR);
                    break;
                case 6:
                    raVarArr = (ra[]) kg.b.k(parcel, iT, ra.CREATOR);
                    break;
                case 7:
                    strArrI = kg.b.i(parcel, iT);
                    break;
                case 8:
                    m5VarArr = (m5[]) kg.b.k(parcel, iT, m5.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new p8(tcVar, strH, strH2, udVarArr, raVarArr, strArrI, m5VarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new p8[i15];
    }
}

```

## ch/ra.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ra extends kg.a {
    public static final Parcelable.Creator<ra> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26316d;

    public ra() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f26313a);
        kg.c.u(parcel, 3, this.f26314b, false);
        kg.c.u(parcel, 4, this.f26315c, false);
        kg.c.u(parcel, 5, this.f26316d, false);
        kg.c.b(parcel, iA);
    }

    public ra(int i15, String str, String str2, String str3) {
        this.f26313a = i15;
        this.f26314b = str;
        this.f26315c = str2;
        this.f26316d = str3;
    }
}

```
