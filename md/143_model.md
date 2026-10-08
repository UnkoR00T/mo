# Paczka 143 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `jg/c1.java`, `jg/d.java`, `jg/d1.java`, `jg/e1.java`, `jg/f.java`

## jg/c1.java

```java
package jg;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        Bundle bundleA = null;
        f fVar = null;
        int iV = 0;
        gg.c[] cVarArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                bundleA = kg.b.a(parcel, iT);
            } else if (iN == 2) {
                cVarArr = (gg.c[]) kg.b.k(parcel, iT, gg.c.CREATOR);
            } else if (iN == 3) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                fVar = (f) kg.b.g(parcel, iT, f.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new b1(bundleA, cVarArr, iV, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new b1[i15];
    }
}

```

## jg/d.java

```java
package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class d extends kg.a {
    public static final Parcelable.Creator<d> CREATOR = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102438b;

    public d(int i15, String str) {
        this.f102437a = i15;
        this.f102438b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f102437a == this.f102437a && r.a(dVar.f102438b, this.f102438b);
    }

    public final int hashCode() {
        return this.f102437a;
    }

    public final String toString() {
        int i15 = this.f102437a;
        int length = String.valueOf(i15).length();
        String str = this.f102438b;
        StringBuilder sb5 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb5.append(i15);
        sb5.append(":");
        sb5.append(str);
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f102437a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.u(parcel, 2, this.f102438b, false);
        kg.c.b(parcel, iA);
    }
}

```

## jg/d1.java

```java
package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        u uVar = null;
        int[] iArrE = null;
        int[] iArrE2 = null;
        boolean zO = false;
        boolean zO2 = false;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    uVar = (u) kg.b.g(parcel, iT, u.CREATOR);
                    break;
                case 2:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 3:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                case 4:
                    iArrE = kg.b.e(parcel, iT);
                    break;
                case 5:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 6:
                    iArrE2 = kg.b.e(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new f(uVar, zO, zO2, iArrE, iV, iArrE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new f[i15];
    }
}

```

## jg/e1.java

```java
package jg;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements Parcelable.Creator {
    static void a(g gVar, Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, gVar.f102475a);
        kg.c.m(parcel, 2, gVar.f102476b);
        kg.c.m(parcel, 3, gVar.f102477c);
        kg.c.u(parcel, 4, gVar.f102478d, false);
        kg.c.l(parcel, 5, gVar.f102479e, false);
        kg.c.x(parcel, 6, gVar.f102480f, i15, false);
        kg.c.d(parcel, 7, gVar.f102481g, false);
        kg.c.t(parcel, 8, gVar.f102482h, i15, false);
        kg.c.x(parcel, 10, gVar.f102483j, i15, false);
        kg.c.x(parcel, 11, gVar.f102484k, i15, false);
        kg.c.c(parcel, 12, gVar.f102485l);
        kg.c.m(parcel, 13, gVar.f102486m);
        kg.c.c(parcel, 14, gVar.f102487n);
        kg.c.u(parcel, 15, gVar.h(), false);
        kg.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        Scope[] scopeArr = g.f102473q;
        Bundle bundle = new Bundle();
        gg.c[] cVarArr = g.f102474r;
        gg.c[] cVarArr2 = cVarArr;
        String strH = null;
        IBinder iBinderU = null;
        Account account = null;
        String strH2 = null;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        boolean zO = false;
        int iV4 = 0;
        boolean zO2 = false;
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
                    strH = kg.b.h(parcel, iT);
                    break;
                case 5:
                    iBinderU = kg.b.u(parcel, iT);
                    break;
                case 6:
                    scopeArr = (Scope[]) kg.b.k(parcel, iT, Scope.CREATOR);
                    break;
                case 7:
                    bundle = kg.b.a(parcel, iT);
                    break;
                case 8:
                    account = (Account) kg.b.g(parcel, iT, Account.CREATOR);
                    break;
                case 9:
                default:
                    kg.b.B(parcel, iT);
                    break;
                case 10:
                    cVarArr = (gg.c[]) kg.b.k(parcel, iT, gg.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (gg.c[]) kg.b.k(parcel, iT, gg.c.CREATOR);
                    break;
                case 12:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 13:
                    iV4 = kg.b.v(parcel, iT);
                    break;
                case 14:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                case 15:
                    strH2 = kg.b.h(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new g(iV, iV2, iV3, strH, iBinderU, scopeArr, bundle, account, cVarArr, cVarArr2, zO, iV4, zO2, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new g[i15];
    }
}

```

## jg/f.java

```java
package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class f extends kg.a {
    public static final Parcelable.Creator<f> CREATOR = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f102459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f102460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f102461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f102462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f102463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f102464f;

    public f(u uVar, boolean z15, boolean z16, int[] iArr, int i15, int[] iArr2) {
        this.f102459a = uVar;
        this.f102460b = z15;
        this.f102461c = z16;
        this.f102462d = iArr;
        this.f102463e = i15;
        this.f102464f = iArr2;
    }

    public int h() {
        return this.f102463e;
    }

    public int[] m() {
        return this.f102462d;
    }

    public int[] p() {
        return this.f102464f;
    }

    public boolean r() {
        return this.f102460b;
    }

    public boolean u() {
        return this.f102461c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f102459a, i15, false);
        kg.c.c(parcel, 2, r());
        kg.c.c(parcel, 3, u());
        kg.c.n(parcel, 4, m(), false);
        kg.c.m(parcel, 5, h());
        kg.c.n(parcel, 6, p(), false);
        kg.c.b(parcel, iA);
    }

    public final u y() {
        return this.f102459a;
    }
}

```
