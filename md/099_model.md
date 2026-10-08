# Paczka 099 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ch/ml.java`, `ch/mm.java`, `ch/n6.java`, `ch/nl.java`, `ch/nm.java`, `ch/o.java`, `ch/o7.java`

## ch/ml.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ml extends kg.a {
    public static final Parcelable.Creator<ml> CREATOR = new gm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f26170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f26171g;

    public ml(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f26165a = str;
        this.f26166b = str2;
        this.f26167c = str3;
        this.f26168d = str4;
        this.f26169e = str5;
        this.f26170f = str6;
        this.f26171g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f26165a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f26166b, false);
        kg.c.u(parcel, 3, this.f26167c, false);
        kg.c.u(parcel, 4, this.f26168d, false);
        kg.c.u(parcel, 5, this.f26169e, false);
        kg.c.u(parcel, 6, this.f26170f, false);
        kg.c.u(parcel, 7, this.f26171g, false);
        kg.c.b(parcel, iA);
    }
}

```

## ch/mm.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class mm implements Parcelable.Creator {
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
        return new lm(iV, iV2, iV3, iV4, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new lm[i15];
    }
}

```

## ch/n6.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class n6 extends kg.a {
    public static final Parcelable.Creator<n6> CREATOR = new xj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26180h;

    public n6() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f26173a);
        kg.c.m(parcel, 3, this.f26174b);
        kg.c.m(parcel, 4, this.f26175c);
        kg.c.m(parcel, 5, this.f26176d);
        kg.c.m(parcel, 6, this.f26177e);
        kg.c.m(parcel, 7, this.f26178f);
        kg.c.c(parcel, 8, this.f26179g);
        kg.c.u(parcel, 9, this.f26180h, false);
        kg.c.b(parcel, iA);
    }

    public n6(int i15, int i16, int i17, int i18, int i19, int i25, boolean z15, String str) {
        this.f26173a = i15;
        this.f26174b = i16;
        this.f26175c = i17;
        this.f26176d = i18;
        this.f26177e = i19;
        this.f26178f = i25;
        this.f26179g = z15;
        this.f26180h = str;
    }
}

```

## ch/nl.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class nl extends kg.a {
    public static final Parcelable.Creator<nl> CREATOR = new hm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26200b;

    public nl(int i15, String str) {
        this.f26199a = i15;
        this.f26200b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f26199a);
        kg.c.u(parcel, 2, this.f26200b, false);
        kg.c.b(parcel, iA);
    }
}

```

## ch/nm.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class nm implements Parcelable.Creator {
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
                    strH6 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    strH7 = kg.b.h(parcel, iT);
                    break;
                case 9:
                    strH8 = kg.b.h(parcel, iT);
                    break;
                case 10:
                    strH9 = kg.b.h(parcel, iT);
                    break;
                case 11:
                    strH10 = kg.b.h(parcel, iT);
                    break;
                case 12:
                    strH11 = kg.b.h(parcel, iT);
                    break;
                case 13:
                    strH12 = kg.b.h(parcel, iT);
                    break;
                case 14:
                    strH13 = kg.b.h(parcel, iT);
                    break;
                case 15:
                    strH14 = kg.b.h(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new q9(strH, strH2, strH3, strH4, strH5, strH6, strH7, strH8, strH9, strH10, strH11, strH12, strH13, strH14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new q9[i15];
    }
}

```

## ch/o.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends kg.a {
    public static final Parcelable.Creator<o> CREATOR = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26205e;

    public o(int i15, int i16, int i17, long j15, int i18) {
        this.f26201a = i15;
        this.f26202b = i16;
        this.f26203c = i17;
        this.f26204d = j15;
        this.f26205e = i18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f26201a);
        kg.c.m(parcel, 3, this.f26202b);
        kg.c.m(parcel, 4, this.f26203c);
        kg.c.r(parcel, 5, this.f26204d);
        kg.c.m(parcel, 6, this.f26205e);
        kg.c.b(parcel, iA);
    }
}

```

## ch/o7.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o7 extends kg.a {
    public static final Parcelable.Creator<o7> CREATOR = new yk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n6 f26218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n6 f26219g;

    public o7() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f26213a, false);
        kg.c.u(parcel, 3, this.f26214b, false);
        kg.c.u(parcel, 4, this.f26215c, false);
        kg.c.u(parcel, 5, this.f26216d, false);
        kg.c.u(parcel, 6, this.f26217e, false);
        kg.c.t(parcel, 7, this.f26218f, i15, false);
        kg.c.t(parcel, 8, this.f26219g, i15, false);
        kg.c.b(parcel, iA);
    }

    public o7(String str, String str2, String str3, String str4, String str5, n6 n6Var, n6 n6Var2) {
        this.f26213a = str;
        this.f26214b = str2;
        this.f26215c = str3;
        this.f26216d = str4;
        this.f26217e = str5;
        this.f26218f = n6Var;
        this.f26219g = n6Var2;
    }
}

```
