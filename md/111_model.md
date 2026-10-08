# Paczka 111 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `eh/h7.java`, `eh/he.java`, `eh/ie.java`, `eh/je.java`, `eh/ke.java`, `eh/mc.java`

## eh/h7.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class h7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        boolean zO = false;
        boolean zO2 = false;
        float fR = -1.0f;
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
                    zO = kg.b.o(parcel, iT);
                    break;
                case 6:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                case 7:
                    fR = kg.b.r(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new g6(iV, iV2, iV3, zO, zO2, fR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new g6[i15];
    }
}

```

## eh/he.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class he extends kg.a {
    public static final Parcelable.Creator<he> CREATOR = new ie();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f50644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f50645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f50646f;

    public he(int i15, int i16, int i17, int i18, boolean z15, float f15) {
        this.f50641a = i15;
        this.f50642b = i16;
        this.f50643c = i17;
        this.f50644d = i18;
        this.f50645e = z15;
        this.f50646f = f15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50641a);
        kg.c.m(parcel, 2, this.f50642b);
        kg.c.m(parcel, 3, this.f50643c);
        kg.c.m(parcel, 4, this.f50644d);
        kg.c.c(parcel, 5, this.f50645e);
        kg.c.i(parcel, 6, this.f50646f);
        kg.c.b(parcel, iA);
    }
}

```

## eh/ie.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ie implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        boolean zO = false;
        float fR = 0.0f;
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
                    zO = kg.b.o(parcel, iT);
                    break;
                case 6:
                    fR = kg.b.r(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new he(iV, iV2, iV3, iV4, zO, fR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new he[i15];
    }
}

```

## eh/je.java

```java
package eh;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class je extends kg.a {
    public static final Parcelable.Creator<je> CREATOR = new ke();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f50711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f50712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f50713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f50714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f50715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f50716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f50717h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f50718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f50719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f50720l;

    public je(int i15, Rect rect, float f15, float f16, float f17, float f18, float f19, float f25, float f26, List list, List list2) {
        this.f50710a = i15;
        this.f50711b = rect;
        this.f50712c = f15;
        this.f50713d = f16;
        this.f50714e = f17;
        this.f50715f = f18;
        this.f50716g = f19;
        this.f50717h = f25;
        this.f50718j = f26;
        this.f50719k = list;
        this.f50720l = list2;
    }

    public final Rect C() {
        return this.f50711b;
    }

    public final List E() {
        return this.f50720l;
    }

    public final List H() {
        return this.f50719k;
    }

    public final float h() {
        return this.f50715f;
    }

    public final int i() {
        return this.f50710a;
    }

    public final float m() {
        return this.f50713d;
    }

    public final float p() {
        return this.f50716g;
    }

    public final float r() {
        return this.f50712c;
    }

    public final float u() {
        return this.f50717h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50710a);
        kg.c.t(parcel, 2, this.f50711b, i15, false);
        kg.c.i(parcel, 3, this.f50712c);
        kg.c.i(parcel, 4, this.f50713d);
        kg.c.i(parcel, 5, this.f50714e);
        kg.c.i(parcel, 6, this.f50715f);
        kg.c.i(parcel, 7, this.f50716g);
        kg.c.i(parcel, 8, this.f50717h);
        kg.c.i(parcel, 9, this.f50718j);
        kg.c.y(parcel, 10, this.f50719k, false);
        kg.c.y(parcel, 11, this.f50720l, false);
        kg.c.b(parcel, iA);
    }

    public final float y() {
        return this.f50714e;
    }
}

```

## eh/ke.java

```java
package eh;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ke implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        Rect rect = null;
        ArrayList arrayListL = null;
        ArrayList arrayListL2 = null;
        float fR = 0.0f;
        float fR2 = 0.0f;
        float fR3 = 0.0f;
        float fR4 = 0.0f;
        float fR5 = 0.0f;
        float fR6 = 0.0f;
        float fR7 = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 2:
                    rect = (Rect) kg.b.g(parcel, iT, Rect.CREATOR);
                    break;
                case 3:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 4:
                    fR2 = kg.b.r(parcel, iT);
                    break;
                case 5:
                    fR3 = kg.b.r(parcel, iT);
                    break;
                case 6:
                    fR4 = kg.b.r(parcel, iT);
                    break;
                case 7:
                    fR5 = kg.b.r(parcel, iT);
                    break;
                case 8:
                    fR6 = kg.b.r(parcel, iT);
                    break;
                case 9:
                    fR7 = kg.b.r(parcel, iT);
                    break;
                case 10:
                    arrayListL = kg.b.l(parcel, iT, qe.CREATOR);
                    break;
                case 11:
                    arrayListL2 = kg.b.l(parcel, iT, fe.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new je(iV, rect, fR, fR2, fR3, fR4, fR5, fR6, fR7, arrayListL, arrayListL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new je[i15];
    }
}

```

## eh/mc.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class mc extends kg.a {
    public static final Parcelable.Creator<mc> CREATOR = new nd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f50819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f50820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50821d;

    public mc(int i15, float f15, float f16, int i16) {
        this.f50818a = i15;
        this.f50819b = f15;
        this.f50820c = f16;
        this.f50821d = i16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50818a);
        kg.c.i(parcel, 2, this.f50819b);
        kg.c.i(parcel, 3, this.f50820c);
        kg.c.m(parcel, 4, this.f50821d);
        kg.c.b(parcel, iA);
    }
}

```
