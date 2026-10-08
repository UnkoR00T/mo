# Paczka 101 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ch/rl.java`, `ch/sb.java`, `ch/sl.java`, `ch/tc.java`, `ch/tl.java`, `ch/ud.java`

## ch/rl.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class rl extends kg.a {
    public static final Parcelable.Creator<rl> CREATOR = new km();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26321c;

    public rl(String str, String str2, int i15) {
        this.f26319a = str;
        this.f26320b = str2;
        this.f26321c = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f26319a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f26320b, false);
        kg.c.m(parcel, 3, this.f26321c);
        kg.c.b(parcel, iA);
    }
}

```

## ch/sb.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class sb extends kg.a {
    public static final Parcelable.Creator<sb> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f26332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f26333b;

    public sb() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.h(parcel, 2, this.f26332a);
        kg.c.h(parcel, 3, this.f26333b);
        kg.c.b(parcel, iA);
    }

    public sb(double d15, double d16) {
        this.f26332a = d15;
        this.f26333b = d16;
    }
}

```

## ch/sl.java

```java
package ch;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class sl extends kg.a {
    public static final Parcelable.Creator<sl> CREATOR = new tl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f26338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Point[] f26339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kl f26341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nl f26342h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ol f26343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final rl f26344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final pl f26345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ll f26346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final hl f26347n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final il f26348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final jl f26349q;

    public sl(int i15, String str, String str2, byte[] bArr, Point[] pointArr, int i16, kl klVar, nl nlVar, ol olVar, rl rlVar, pl plVar, ll llVar, hl hlVar, il ilVar, jl jlVar) {
        this.f26335a = i15;
        this.f26336b = str;
        this.f26337c = str2;
        this.f26338d = bArr;
        this.f26339e = pointArr;
        this.f26340f = i16;
        this.f26341g = klVar;
        this.f26342h = nlVar;
        this.f26343j = olVar;
        this.f26344k = rlVar;
        this.f26345l = plVar;
        this.f26346m = llVar;
        this.f26347n = hlVar;
        this.f26348p = ilVar;
        this.f26349q = jlVar;
    }

    public final int h() {
        return this.f26335a;
    }

    public final int m() {
        return this.f26340f;
    }

    public final String p() {
        return this.f26336b;
    }

    public final String r() {
        return this.f26337c;
    }

    public final byte[] u() {
        return this.f26338d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f26335a);
        kg.c.u(parcel, 2, this.f26336b, false);
        kg.c.u(parcel, 3, this.f26337c, false);
        kg.c.f(parcel, 4, this.f26338d, false);
        kg.c.x(parcel, 5, this.f26339e, i15, false);
        kg.c.m(parcel, 6, this.f26340f);
        kg.c.t(parcel, 7, this.f26341g, i15, false);
        kg.c.t(parcel, 8, this.f26342h, i15, false);
        kg.c.t(parcel, 9, this.f26343j, i15, false);
        kg.c.t(parcel, 10, this.f26344k, i15, false);
        kg.c.t(parcel, 11, this.f26345l, i15, false);
        kg.c.t(parcel, 12, this.f26346m, i15, false);
        kg.c.t(parcel, 13, this.f26347n, i15, false);
        kg.c.t(parcel, 14, this.f26348p, i15, false);
        kg.c.t(parcel, 15, this.f26349q, i15, false);
        kg.c.b(parcel, iA);
    }

    public final Point[] y() {
        return this.f26339e;
    }
}

```

## ch/tc.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class tc extends kg.a {
    public static final Parcelable.Creator<tc> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26369g;

    public tc() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f26363a, false);
        kg.c.u(parcel, 3, this.f26364b, false);
        kg.c.u(parcel, 4, this.f26365c, false);
        kg.c.u(parcel, 5, this.f26366d, false);
        kg.c.u(parcel, 6, this.f26367e, false);
        kg.c.u(parcel, 7, this.f26368f, false);
        kg.c.u(parcel, 8, this.f26369g, false);
        kg.c.b(parcel, iA);
    }

    public tc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f26363a = str;
        this.f26364b = str2;
        this.f26365c = str3;
        this.f26366d = str4;
        this.f26367e = str5;
        this.f26368f = str6;
        this.f26369g = str7;
    }
}

```

## ch/tl.java

```java
package ch;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class tl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        byte[] bArrB = null;
        Point[] pointArr = null;
        kl klVar = null;
        nl nlVar = null;
        ol olVar = null;
        rl rlVar = null;
        pl plVar = null;
        ll llVar = null;
        hl hlVar = null;
        il ilVar = null;
        jl jlVar = null;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    bArrB = kg.b.b(parcel, iT);
                    break;
                case 5:
                    pointArr = (Point[]) kg.b.k(parcel, iT, Point.CREATOR);
                    break;
                case 6:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 7:
                    klVar = (kl) kg.b.g(parcel, iT, kl.CREATOR);
                    break;
                case 8:
                    nlVar = (nl) kg.b.g(parcel, iT, nl.CREATOR);
                    break;
                case 9:
                    olVar = (ol) kg.b.g(parcel, iT, ol.CREATOR);
                    break;
                case 10:
                    rlVar = (rl) kg.b.g(parcel, iT, rl.CREATOR);
                    break;
                case 11:
                    plVar = (pl) kg.b.g(parcel, iT, pl.CREATOR);
                    break;
                case 12:
                    llVar = (ll) kg.b.g(parcel, iT, ll.CREATOR);
                    break;
                case 13:
                    hlVar = (hl) kg.b.g(parcel, iT, hl.CREATOR);
                    break;
                case 14:
                    ilVar = (il) kg.b.g(parcel, iT, il.CREATOR);
                    break;
                case 15:
                    jlVar = (jl) kg.b.g(parcel, iT, jl.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new sl(iV, strH, strH2, bArrB, pointArr, iV2, klVar, nlVar, olVar, rlVar, plVar, llVar, hlVar, ilVar, jlVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new sl[i15];
    }
}

```

## ch/ud.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ud extends kg.a {
    public static final Parcelable.Creator<ud> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26405b;

    public ud() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f26404a);
        kg.c.u(parcel, 3, this.f26405b, false);
        kg.c.b(parcel, iA);
    }

    public ud(int i15, String str) {
        this.f26404a = i15;
        this.f26405b = str;
    }
}

```
