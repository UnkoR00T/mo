# Paczka 168 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `nh/m.java`, `nh/p.java`, `nh/q.java`, `nh/r.java`, `nh/t.java`

## nh/m.java

```java
package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends kg.a {
    public static final Parcelable.Creator<m> CREATOR = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f136299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f136300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f136301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f136302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f136303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f136304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f136305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f136306h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f136307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f136308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f136309l;

    public m() {
        this.f136301c = 10.0f;
        this.f136302d = -16777216;
        this.f136303e = 0;
        this.f136304f = 0.0f;
        this.f136305g = true;
        this.f136306h = false;
        this.f136307j = false;
        this.f136308k = 0;
        this.f136309l = null;
        this.f136299a = new ArrayList();
        this.f136300b = new ArrayList();
    }

    public List<LatLng> C() {
        return this.f136299a;
    }

    public int E() {
        return this.f136302d;
    }

    public int H() {
        return this.f136308k;
    }

    public List<j> I() {
        return this.f136309l;
    }

    public float J() {
        return this.f136301c;
    }

    public float K() {
        return this.f136304f;
    }

    public boolean L() {
        return this.f136307j;
    }

    public boolean M() {
        return this.f136306h;
    }

    public boolean N() {
        return this.f136305g;
    }

    public m O(int i15) {
        this.f136302d = i15;
        return this;
    }

    public m V(int i15) {
        this.f136308k = i15;
        return this;
    }

    public m Z(List<j> list) {
        this.f136309l = list;
        return this;
    }

    public m a0(float f15) {
        this.f136301c = f15;
        return this;
    }

    public m b0(boolean z15) {
        this.f136305g = z15;
        return this;
    }

    public m c0(float f15) {
        this.f136304f = f15;
        return this;
    }

    public m h(Iterable<LatLng> iterable) {
        jg.s.m(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.f136299a.add(it.next());
        }
        return this;
    }

    public m m(Iterable<LatLng> iterable) {
        jg.s.m(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f136300b.add(arrayList);
        return this;
    }

    public m p(boolean z15) {
        this.f136307j = z15;
        return this;
    }

    public m r(int i15) {
        this.f136303e = i15;
        return this;
    }

    public m u(boolean z15) {
        this.f136306h = z15;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.y(parcel, 2, C(), false);
        kg.c.q(parcel, 3, this.f136300b, false);
        kg.c.i(parcel, 4, J());
        kg.c.m(parcel, 5, E());
        kg.c.m(parcel, 6, y());
        kg.c.i(parcel, 7, K());
        kg.c.c(parcel, 8, N());
        kg.c.c(parcel, 9, M());
        kg.c.c(parcel, 10, L());
        kg.c.m(parcel, 11, H());
        kg.c.y(parcel, 12, I(), false);
        kg.c.b(parcel, iA);
    }

    public int y() {
        return this.f136303e;
    }

    m(List list, List list2, float f15, int i15, int i16, float f16, boolean z15, boolean z16, boolean z17, int i17, List list3) {
        this.f136299a = list;
        this.f136300b = list2;
        this.f136301c = f15;
        this.f136302d = i15;
        this.f136303e = i16;
        this.f136304f = f16;
        this.f136305g = z15;
        this.f136306h = z16;
        this.f136307j = z17;
        this.f136308k = i17;
        this.f136309l = list3;
    }
}

```

## nh/p.java

```java
package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends kg.a {
    public static final Parcelable.Creator<p> CREATOR = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f136311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLng f136312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LatLng f136313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LatLng f136314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LatLngBounds f136315e;

    public p(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f136311a = latLng;
        this.f136312b = latLng2;
        this.f136313c = latLng3;
        this.f136314d = latLng4;
        this.f136315e = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f136311a.equals(pVar.f136311a) && this.f136312b.equals(pVar.f136312b) && this.f136313c.equals(pVar.f136313c) && this.f136314d.equals(pVar.f136314d) && this.f136315e.equals(pVar.f136315e);
    }

    public int hashCode() {
        return jg.r.b(this.f136311a, this.f136312b, this.f136313c, this.f136314d, this.f136315e);
    }

    public String toString() {
        return jg.r.c(this).a("nearLeft", this.f136311a).a("nearRight", this.f136312b).a("farLeft", this.f136313c).a("farRight", this.f136314d).a("latLngBounds", this.f136315e).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        LatLng latLng = this.f136311a;
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 2, latLng, i15, false);
        kg.c.t(parcel, 3, this.f136312b, i15, false);
        kg.c.t(parcel, 4, this.f136313c, i15, false);
        kg.c.t(parcel, 5, this.f136314d, i15, false);
        kg.c.t(parcel, 6, this.f136315e, i15, false);
        kg.c.b(parcel, iA);
    }
}

```

## nh/q.java

```java
package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        float fR = 0.0f;
        float fR2 = 0.0f;
        LatLng latLng = null;
        float fR3 = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                latLng = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN == 3) {
                fR = kg.b.r(parcel, iT);
            } else if (iN == 4) {
                fR3 = kg.b.r(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                fR2 = kg.b.r(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new CameraPosition(latLng, fR, fR3, fR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new CameraPosition[i15];
    }
}

```

## nh/r.java

```java
package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                latLng = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN == 3) {
                latLng2 = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN == 4) {
                latLng3 = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN == 5) {
                latLng4 = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN != 6) {
                kg.b.B(parcel, iT);
            } else {
                latLngBounds = (LatLngBounds) kg.b.g(parcel, iT, LatLngBounds.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new p(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new p[i15];
    }
}

```

## nh/t.java

```java
package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                latLng = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                latLng2 = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new LatLngBounds[i15];
    }
}

```
