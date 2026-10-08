# Paczka 203 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `th/a.java`, `th/b.java`, `th/c.java`, `th/h.java`, `th/i.java`, `th/j.java`, `th/k.java`, `th/l.java`

## th/a.java

Powiązane klasy (możesz dosłać): `jg/l0.java`

```java
package th;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import io.sentry.android.core.c2;
import jg.l0;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public class a extends jg.h<g> implements sh.f {
    public static final /* synthetic */ int P = 0;
    private final boolean L;
    private final jg.e M;
    private final Bundle N;
    private final Integer O;

    public a(Context context, Looper looper, boolean z15, jg.e eVar, Bundle bundle, hg.f.a aVar, hg.f.b bVar) {
        super(context, looper, 44, eVar, aVar, bVar);
        this.L = true;
        this.M = eVar;
        this.N = bundle;
        this.O = eVar.h();
    }

    public static Bundle j0(jg.e eVar) {
        eVar.g();
        Integer numH = eVar.h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (numH != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numH.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // jg.c
    protected final String B() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // jg.c
    protected final String C() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sh.f
    public final void f(f fVar) {
        s.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.M.b();
            ((g) A()).o3(new j(1, new l0(accountB, ((Integer) s.l(this.O)).intValue(), "<<default account>>".equals(accountB.name) ? cg.a.a(v()).b() : null)), fVar);
        } catch (RemoteException e15) {
            c2.g("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.k2(new l(1, new gg.a(8, null), null));
            } catch (RemoteException unused) {
                c2.k("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e15);
            }
        }
    }

    @Override // sh.f
    public final void h() {
        e(new jg.c.d(this));
    }

    @Override // jg.c, hg.a.f
    public final boolean i() {
        return this.L;
    }

    @Override // jg.c, hg.a.f
    public final int l() {
        return 12451000;
    }

    @Override // jg.c
    protected final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // jg.c
    protected final Bundle x() {
        jg.e eVar = this.M;
        if (!v().getPackageName().equals(eVar.d())) {
            this.N.putString("com.google.android.gms.signin.internal.realClientPackageName", eVar.d());
        }
        return this.N;
    }
}

```

## th/b.java

```java
package th;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kg.a implements hg.l {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f190190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f190191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f190192c;

    public b() {
        this(2, 0, null);
    }

    @Override // hg.l
    public final Status b() {
        return this.f190191b == 0 ? Status.f29007f : Status.f29011k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f190190a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, this.f190191b);
        kg.c.t(parcel, 3, this.f190192c, i15, false);
        kg.c.b(parcel, iA);
    }

    b(int i15, int i16, Intent intent) {
        this.f190190a = i15;
        this.f190191b = i16;
        this.f190192c = intent;
    }
}

```

## th/c.java

```java
package th;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        Intent intent = null;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                intent = (Intent) kg.b.g(parcel, iT, Intent.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new b(iV, iV2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new b[i15];
    }
}

```

## th/h.java

```java
package th;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends kg.a implements hg.l {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f190193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f190194b;

    public h(List list, String str) {
        this.f190193a = list;
        this.f190194b = str;
    }

    @Override // hg.l
    public final Status b() {
        return this.f190194b != null ? Status.f29007f : Status.f29011k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        List list = this.f190193a;
        int iA = kg.c.a(parcel);
        kg.c.w(parcel, 1, list, false);
        kg.c.u(parcel, 2, this.f190194b, false);
        kg.c.b(parcel, iA);
    }
}

```

## th/i.java

```java
package th;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList<String> arrayListJ = null;
        String strH = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                arrayListJ = kg.b.j(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                strH = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new h(arrayListJ, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new h[i15];
    }
}

```

## th/j.java

Powiązane klasy (możesz dosłać): `jg/l0.java`

```java
package th;

import android.os.Parcel;
import android.os.Parcelable;
import jg.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends kg.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f190195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final l0 f190196b;

    j(int i15, l0 l0Var) {
        this.f190195a = i15;
        this.f190196b = l0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f190195a);
        kg.c.t(parcel, 2, this.f190196b, i15, false);
        kg.c.b(parcel, iA);
    }
}

```

## th/k.java

Powiązane klasy (możesz dosłać): `jg/l0.java`

```java
package th;

import android.os.Parcel;
import android.os.Parcelable;
import jg.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        l0 l0Var = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                l0Var = (l0) kg.b.g(parcel, iT, l0.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new j(iV, l0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new j[i15];
    }
}

```

## th/l.java

Powiązane klasy (możesz dosłać): `jg/n0.java`

```java
package th;

import android.os.Parcel;
import android.os.Parcelable;
import jg.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends kg.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f190197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gg.a f190198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f190199c;

    l(int i15, gg.a aVar, n0 n0Var) {
        this.f190197a = i15;
        this.f190198b = aVar;
        this.f190199c = n0Var;
    }

    public final gg.a h() {
        return this.f190198b;
    }

    public final n0 m() {
        return this.f190199c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f190197a);
        kg.c.t(parcel, 2, this.f190198b, i15, false);
        kg.c.t(parcel, 3, this.f190199c, i15, false);
        kg.c.b(parcel, iA);
    }
}

```
