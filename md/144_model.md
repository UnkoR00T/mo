# Paczka 144 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `jg/g.java`, `jg/k0.java`, `jg/l0.java`, `jg/m0.java`, `jg/n0.java`, `jg/o0.java`

## jg/g.java

```java
package jg;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes3.dex */
public class g extends kg.a {
    public static final Parcelable.Creator<g> CREATOR = new e1();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final Scope[] f102473q = new Scope[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final gg.c[] f102474r = new gg.c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f102475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f102476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f102477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f102478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IBinder f102479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Scope[] f102480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f102481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Account f102482h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    gg.c[] f102483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    gg.c[] f102484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f102485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f102486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f102487n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f102488p;

    g(int i15, int i16, int i17, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, gg.c[] cVarArr, gg.c[] cVarArr2, boolean z15, int i18, boolean z16, String str2) {
        scopeArr = scopeArr == null ? f102473q : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? f102474r : cVarArr;
        cVarArr2 = cVarArr2 == null ? f102474r : cVarArr2;
        this.f102475a = i15;
        this.f102476b = i16;
        this.f102477c = i17;
        if ("com.google.android.gms".equals(str)) {
            this.f102478d = "com.google.android.gms";
        } else {
            this.f102478d = str;
        }
        if (i15 < 2) {
            this.f102482h = iBinder != null ? a.n3(l.a.m3(iBinder)) : null;
        } else {
            this.f102479e = iBinder;
            this.f102482h = account;
        }
        this.f102480f = scopeArr;
        this.f102481g = bundle;
        this.f102483j = cVarArr;
        this.f102484k = cVarArr2;
        this.f102485l = z15;
        this.f102486m = i18;
        this.f102487n = z16;
        this.f102488p = str2;
    }

    public String h() {
        return this.f102488p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        e1.a(this, parcel, i15);
    }
}

```

## jg/k0.java

```java
package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = -1;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        int iV5 = 0;
        String strH = null;
        String strH2 = null;
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 2:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                case 3:
                    iV4 = kg.b.v(parcel, iT);
                    break;
                case 4:
                    jY = kg.b.y(parcel, iT);
                    break;
                case 5:
                    jY2 = kg.b.y(parcel, iT);
                    break;
                case 6:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 7:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    iV5 = kg.b.v(parcel, iT);
                    break;
                case 9:
                    iV = kg.b.v(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new q(iV2, iV3, iV4, jY, jY2, strH, strH2, iV5, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new q[i15];
    }
}

```

## jg/l0.java

```java
package jg;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends kg.a {
    public static final Parcelable.Creator<l0> CREATOR = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f102521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Account f102522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f102524d;

    l0(int i15, Account account, int i16, GoogleSignInAccount googleSignInAccount) {
        this.f102521a = i15;
        this.f102522b = account;
        this.f102523c = i16;
        this.f102524d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f102521a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.t(parcel, 2, this.f102522b, i15, false);
        kg.c.m(parcel, 3, this.f102523c);
        kg.c.t(parcel, 4, this.f102524d, i15, false);
        kg.c.b(parcel, iA);
    }

    public l0(Account account, int i15, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i15, googleSignInAccount);
    }
}

```

## jg/m0.java

```java
package jg;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        Account account = null;
        int iV = 0;
        int iV2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                account = (Account) kg.b.g(parcel, iT, Account.CREATOR);
            } else if (iN == 3) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                googleSignInAccount = (GoogleSignInAccount) kg.b.g(parcel, iT, GoogleSignInAccount.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new l0(iV, account, iV2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new l0[i15];
    }
}

```

## jg/n0.java

```java
package jg;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends kg.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f102525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final IBinder f102526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gg.a f102527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f102528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f102529e;

    n0(int i15, IBinder iBinder, gg.a aVar, boolean z15, boolean z16) {
        this.f102525a = i15;
        this.f102526b = iBinder;
        this.f102527c = aVar;
        this.f102528d = z15;
        this.f102529e = z16;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f102527c.equals(n0Var.f102527c) && r.a(h(), n0Var.h());
    }

    public final l h() {
        IBinder iBinder = this.f102526b;
        if (iBinder == null) {
            return null;
        }
        return l.a.m3(iBinder);
    }

    public final gg.a m() {
        return this.f102527c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f102525a);
        kg.c.l(parcel, 2, this.f102526b, false);
        kg.c.t(parcel, 3, this.f102527c, i15, false);
        kg.c.c(parcel, 4, this.f102528d);
        kg.c.c(parcel, 5, this.f102529e);
        kg.c.b(parcel, iA);
    }
}

```

## jg/o0.java

```java
package jg;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        boolean zO = false;
        boolean zO2 = false;
        IBinder iBinderU = null;
        gg.a aVar = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                iBinderU = kg.b.u(parcel, iT);
            } else if (iN == 3) {
                aVar = (gg.a) kg.b.g(parcel, iT, gg.a.CREATOR);
            } else if (iN == 4) {
                zO = kg.b.o(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                zO2 = kg.b.o(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new n0(iV, iBinderU, aVar, zO, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new n0[i15];
    }
}

```
