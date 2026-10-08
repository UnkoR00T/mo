# Paczka 159 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `kh/a.java`, `kh/i.java`, `kh/j.java`, `kh/l.java`

## kh/a.java

Powiązane klasy (możesz dosłać): `zg/f0.java`

```java
package kh;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import zg.f0;
import zg.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f110920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f110921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f110922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f110923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f110924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f110925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WorkSource f110926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f0 f110927h;

    /* JADX INFO: renamed from: kh.a$a, reason: collision with other inner class name */
    public static final class C2669a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f110928a = 10000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f110929b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f110930c = 102;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f110931d = Long.MAX_VALUE;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f110932e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f110933f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WorkSource f110934g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final f0 f110935h = null;

        public a a() {
            return new a(this.f110928a, this.f110929b, this.f110930c, this.f110931d, this.f110932e, this.f110933f, new WorkSource(this.f110934g), this.f110935h);
        }

        public C2669a b(long j15) {
            jg.s.b(j15 > 0, "durationMillis must be greater than 0");
            this.f110931d = j15;
            return this;
        }

        public C2669a c(int i15) {
            n.a(i15);
            this.f110930c = i15;
            return this;
        }
    }

    a(long j15, int i15, int i16, long j16, boolean z15, int i17, WorkSource workSource, f0 f0Var) {
        this.f110920a = j15;
        this.f110921b = i15;
        this.f110922c = i16;
        this.f110923d = j16;
        this.f110924e = z15;
        this.f110925f = i17;
        this.f110926g = workSource;
        this.f110927h = f0Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f110920a == aVar.f110920a && this.f110921b == aVar.f110921b && this.f110922c == aVar.f110922c && this.f110923d == aVar.f110923d && this.f110924e == aVar.f110924e && this.f110925f == aVar.f110925f && jg.r.a(this.f110926g, aVar.f110926g) && jg.r.a(this.f110927h, aVar.f110927h);
    }

    public long h() {
        return this.f110923d;
    }

    public int hashCode() {
        return jg.r.b(Long.valueOf(this.f110920a), Integer.valueOf(this.f110921b), Integer.valueOf(this.f110922c), Long.valueOf(this.f110923d));
    }

    public int m() {
        return this.f110921b;
    }

    public long p() {
        return this.f110920a;
    }

    public int r() {
        return this.f110922c;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("CurrentLocationRequest[");
        sb5.append(n.b(this.f110922c));
        if (this.f110920a != Long.MAX_VALUE) {
            sb5.append(", maxAge=");
            q0.c(this.f110920a, sb5);
        }
        if (this.f110923d != Long.MAX_VALUE) {
            sb5.append(", duration=");
            sb5.append(this.f110923d);
            sb5.append("ms");
        }
        if (this.f110921b != 0) {
            sb5.append(", ");
            sb5.append(r.b(this.f110921b));
        }
        if (this.f110924e) {
            sb5.append(", bypass");
        }
        if (this.f110925f != 0) {
            sb5.append(", ");
            sb5.append(o.b(this.f110925f));
        }
        if (!com.google.android.gms.common.util.m.d(this.f110926g)) {
            sb5.append(", workSource=");
            sb5.append(this.f110926g);
        }
        if (this.f110927h != null) {
            sb5.append(", impersonation=");
            sb5.append(this.f110927h);
        }
        sb5.append(']');
        return sb5.toString();
    }

    public final int u() {
        return this.f110925f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.r(parcel, 1, p());
        kg.c.m(parcel, 2, m());
        kg.c.m(parcel, 3, r());
        kg.c.r(parcel, 4, h());
        kg.c.c(parcel, 5, this.f110924e);
        kg.c.t(parcel, 6, this.f110926g, i15, false);
        kg.c.m(parcel, 7, this.f110925f);
        kg.c.t(parcel, 9, this.f110927h, i15, false);
        kg.c.b(parcel, iA);
    }

    public final WorkSource y() {
        return this.f110926g;
    }

    public final boolean zza() {
        return this.f110924e;
    }
}

```

## kh/i.java

Powiązane klasy (możesz dosłać): `zg/f0.java`

```java
package kh;

import android.os.Parcel;
import android.os.Parcelable;
import zg.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends kg.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f110940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f110941b;

    i(boolean z15, f0 f0Var) {
        this.f110940a = z15;
        this.f110941b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f110940a == iVar.f110940a && jg.r.a(this.f110941b, iVar.f110941b);
    }

    public final int hashCode() {
        return jg.r.b(Boolean.valueOf(this.f110940a));
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("LocationAvailabilityRequest[");
        if (this.f110940a) {
            sb5.append("bypass, ");
        }
        if (this.f110941b != null) {
            sb5.append("impersonation=");
            sb5.append(this.f110941b);
            sb5.append(", ");
        }
        sb5.setLength(sb5.length() - 2);
        sb5.append(']');
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        boolean z15 = this.f110940a;
        int iA = kg.c.a(parcel);
        kg.c.c(parcel, 1, z15);
        kg.c.t(parcel, 2, this.f110941b, i15, false);
        kg.c.b(parcel, iA);
    }
}

```

## kh/j.java

Powiązane klasy (możesz dosłać): `zg/f0.java`

```java
package kh;

import android.os.Parcel;
import android.os.Parcelable;
import zg.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        f0 f0Var = null;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                zO = kg.b.o(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                f0Var = (f0) kg.b.g(parcel, iT, f0.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new i(zO, f0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new i[i15];
    }
}

```

## kh/l.java

```java
package kh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class l extends kg.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f110948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f110949d;

    l(int i15, int i16, long j15, long j16) {
        this.f110946a = i15;
        this.f110947b = i16;
        this.f110948c = j15;
        this.f110949d = j16;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f110946a == lVar.f110946a && this.f110947b == lVar.f110947b && this.f110948c == lVar.f110948c && this.f110949d == lVar.f110949d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return jg.r.b(Integer.valueOf(this.f110947b), Integer.valueOf(this.f110946a), Long.valueOf(this.f110949d), Long.valueOf(this.f110948c));
    }

    public final String toString() {
        int i15 = this.f110946a;
        int length = String.valueOf(i15).length();
        int i16 = this.f110947b;
        int length2 = String.valueOf(i16).length();
        long j15 = this.f110949d;
        int length3 = String.valueOf(j15).length();
        long j16 = this.f110948c;
        StringBuilder sb5 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j16).length());
        sb5.append("NetworkLocationStatus: Wifi status: ");
        sb5.append(i15);
        sb5.append(" Cell status: ");
        sb5.append(i16);
        sb5.append(" elapsed time NS: ");
        sb5.append(j15);
        sb5.append(" system time ms: ");
        sb5.append(j16);
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f110946a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, this.f110947b);
        kg.c.r(parcel, 3, this.f110948c);
        kg.c.r(parcel, 4, this.f110949d);
        kg.c.b(parcel, iA);
    }
}

```
