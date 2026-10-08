# Paczka 110 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `eh/e4.java`, `eh/ee.java`, `eh/f5.java`, `eh/fe.java`, `eh/g6.java`, `eh/ge.java`

## eh/e4.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 extends kg.a {
    public static final Parcelable.Creator<e4> CREATOR = new f5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f50485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f50486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f50487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f50488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f50489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f50490h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f50491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mc[] f50492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f50493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f50494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f50495n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c2[] f50496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f50497q;

    public e4(int i15, int i16, float f15, float f16, float f17, float f18, float f19, float f25, float f26, mc[] mcVarArr, float f27, float f28, float f29, c2[] c2VarArr, float f35) {
        this.f50483a = i15;
        this.f50484b = i16;
        this.f50485c = f15;
        this.f50486d = f16;
        this.f50487e = f17;
        this.f50488f = f18;
        this.f50489g = f19;
        this.f50490h = f25;
        this.f50491j = f26;
        this.f50492k = mcVarArr;
        this.f50493l = f27;
        this.f50494m = f28;
        this.f50495n = f29;
        this.f50496p = c2VarArr;
        this.f50497q = f35;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50483a);
        kg.c.m(parcel, 2, this.f50484b);
        kg.c.i(parcel, 3, this.f50485c);
        kg.c.i(parcel, 4, this.f50486d);
        kg.c.i(parcel, 5, this.f50487e);
        kg.c.i(parcel, 6, this.f50488f);
        kg.c.i(parcel, 7, this.f50489g);
        kg.c.i(parcel, 8, this.f50490h);
        kg.c.x(parcel, 9, this.f50492k, i15, false);
        kg.c.i(parcel, 10, this.f50493l);
        kg.c.i(parcel, 11, this.f50494m);
        kg.c.i(parcel, 12, this.f50495n);
        kg.c.x(parcel, 13, this.f50496p, i15, false);
        kg.c.i(parcel, 14, this.f50491j);
        kg.c.i(parcel, 15, this.f50497q);
        kg.c.b(parcel, iA);
    }
}

```

## eh/ee.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ee implements Parcelable.Creator {
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
        return new de(iV, iV2, iV3, iV4, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new de[i15];
    }
}

```

## eh/f5.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        int iV2 = 0;
        float fR = 0.0f;
        float fR2 = 0.0f;
        float fR3 = 0.0f;
        float fR4 = 0.0f;
        float fR5 = 0.0f;
        float fR6 = 0.0f;
        float fR7 = 0.0f;
        float fR8 = Float.MAX_VALUE;
        float fR9 = Float.MAX_VALUE;
        float fR10 = Float.MAX_VALUE;
        mc[] mcVarArr = null;
        c2[] c2VarArr = null;
        float fR11 = -1.0f;
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
                    fR8 = kg.b.r(parcel, iT);
                    break;
                case 8:
                    fR9 = kg.b.r(parcel, iT);
                    break;
                case 9:
                    mcVarArr = (mc[]) kg.b.k(parcel, iT, mc.CREATOR);
                    break;
                case 10:
                    fR5 = kg.b.r(parcel, iT);
                    break;
                case 11:
                    fR6 = kg.b.r(parcel, iT);
                    break;
                case 12:
                    fR7 = kg.b.r(parcel, iT);
                    break;
                case 13:
                    c2VarArr = (c2[]) kg.b.k(parcel, iT, c2.CREATOR);
                    break;
                case 14:
                    fR10 = kg.b.r(parcel, iT);
                    break;
                case 15:
                    fR11 = kg.b.r(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new e4(iV, iV2, fR, fR2, fR3, fR4, fR8, fR9, fR10, mcVarArr, fR5, fR6, fR7, c2VarArr, fR11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new e4[i15];
    }
}

```

## eh/fe.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fe extends kg.a {
    public static final Parcelable.Creator<fe> CREATOR = new ge();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f50563b;

    public fe(int i15, List list) {
        this.f50562a = i15;
        this.f50563b = list;
    }

    public final int h() {
        return this.f50562a;
    }

    public final List m() {
        return this.f50563b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50562a);
        kg.c.y(parcel, 2, this.f50563b, false);
        kg.c.b(parcel, iA);
    }
}

```

## eh/g6.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g6 extends kg.a {
    public static final Parcelable.Creator<g6> CREATOR = new h7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f50581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f50582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f50583f;

    public g6(int i15, int i16, int i17, boolean z15, boolean z16, float f15) {
        this.f50578a = i15;
        this.f50579b = i16;
        this.f50580c = i17;
        this.f50581d = z15;
        this.f50582e = z16;
        this.f50583f = f15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f50578a);
        kg.c.m(parcel, 3, this.f50579b);
        kg.c.m(parcel, 4, this.f50580c);
        kg.c.c(parcel, 5, this.f50581d);
        kg.c.c(parcel, 6, this.f50582e);
        kg.c.i(parcel, 7, this.f50583f);
        kg.c.b(parcel, iA);
    }
}

```

## eh/ge.java

```java
package eh;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ge implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        ArrayList arrayListL = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                arrayListL = kg.b.l(parcel, iT, PointF.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new fe(iV, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new fe[i15];
    }
}

```
