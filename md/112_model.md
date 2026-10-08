# Paczka 112 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `eh/nd.java`, `eh/ne.java`, `eh/qe.java`, `eh/re.java`, `eh/se.java`, `ei/a.java`, `ei/b.java`, `ei/c.java`, `ei/d.java`, `ei/e.java`, `ei/f.java`

## eh/nd.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class nd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        float fR = 0.0f;
        float fR2 = 0.0f;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                fR = kg.b.r(parcel, iT);
            } else if (iN == 3) {
                fR2 = kg.b.r(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                iV2 = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new mc(iV, fR, fR2, iV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new mc[i15];
    }
}

```

## eh/ne.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ne extends kg.a {
    public static final Parcelable.Creator<ne> CREATOR = new se();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f50864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50865e;

    public ne(int i15, int i16, int i17, long j15, int i18) {
        this.f50861a = i15;
        this.f50862b = i16;
        this.f50863c = i17;
        this.f50864d = j15;
        this.f50865e = i18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f50861a);
        kg.c.m(parcel, 3, this.f50862b);
        kg.c.m(parcel, 4, this.f50863c);
        kg.c.r(parcel, 5, this.f50864d);
        kg.c.m(parcel, 6, this.f50865e);
        kg.c.b(parcel, iA);
    }
}

```

## eh/qe.java

```java
package eh;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class qe extends kg.a {
    public static final Parcelable.Creator<qe> CREATOR = new re();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f50988b;

    public qe(int i15, PointF pointF) {
        this.f50987a = i15;
        this.f50988b = pointF;
    }

    public final int h() {
        return this.f50987a;
    }

    public final PointF m() {
        return this.f50988b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50987a);
        kg.c.t(parcel, 2, this.f50988b, i15, false);
        kg.c.b(parcel, iA);
    }
}

```

## eh/re.java

```java
package eh;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class re implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        PointF pointF = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                pointF = (PointF) kg.b.g(parcel, iT, PointF.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new qe(iV, pointF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new qe[i15];
    }
}

```

## eh/se.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class se implements Parcelable.Creator {
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
        return new ne(iV, iV2, iV3, jY, iV4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new ne[i15];
    }
}

```

## ei/a.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f51526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f51527b;

    public a(String str, String str2) {
        this.f51526a = str;
        this.f51527b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f51526a, false);
        kg.c.u(parcel, 3, this.f51527b, false);
        kg.c.b(parcel, iA);
    }
}

```

## ei/b.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kg.a {
    public static final Parcelable.Creator<b> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    String f51528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    String f51529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f51530c;

    b(String str, String str2, ArrayList arrayList) {
        this.f51528a = str;
        this.f51529b = str2;
        this.f51530c = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f51528a, false);
        kg.c.u(parcel, 3, this.f51529b, false);
        kg.c.y(parcel, 4, this.f51530c, false);
        kg.c.b(parcel, iA);
    }
}

```

## ei/c.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends kg.a {
    public static final Parcelable.Creator<c> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f51531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f51532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    f f51533c;

    c() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f51531a, false);
        kg.c.t(parcel, 3, this.f51532b, i15, false);
        kg.c.t(parcel, 5, this.f51533c, i15, false);
        kg.c.b(parcel, iA);
    }

    c(String str, d dVar, f fVar) {
        this.f51531a = str;
        this.f51532b = dVar;
        this.f51533c = fVar;
    }
}

```

## ei/d.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends kg.a {
    public static final Parcelable.Creator<d> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f51534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f51535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f51536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f51537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f51538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f51539f;

    d() {
        this.f51539f = -1;
        this.f51534a = -1;
        this.f51536c = -1.0d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f51534a);
        kg.c.u(parcel, 3, this.f51535b, false);
        kg.c.h(parcel, 4, this.f51536c);
        kg.c.u(parcel, 5, this.f51537d, false);
        kg.c.r(parcel, 6, this.f51538e);
        kg.c.m(parcel, 7, this.f51539f);
        kg.c.b(parcel, iA);
    }

    d(int i15, String str, double d15, String str2, long j15, int i16) {
        this.f51534a = i15;
        this.f51535b = str;
        this.f51536c = d15;
        this.f51537d = str2;
        this.f51538e = j15;
        this.f51539f = i16;
    }
}

```

## ei/e.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends kg.a {
    public static final Parcelable.Creator<e> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f51540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f51541b;

    public e(String str, String str2) {
        this.f51540a = str;
        this.f51541b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f51540a, false);
        kg.c.u(parcel, 3, this.f51541b, false);
        kg.c.b(parcel, iA);
    }
}

```

## ei/f.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends kg.a {
    public static final Parcelable.Creator<f> CREATOR = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f51542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f51543b;

    f() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.r(parcel, 2, this.f51542a);
        kg.c.r(parcel, 3, this.f51543b);
        kg.c.b(parcel, iA);
    }

    public f(long j15, long j16) {
        this.f51542a = j15;
        this.f51543b = j16;
    }
}

```
