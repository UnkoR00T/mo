# Paczka 145 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `jg/p0.java`, `jg/q.java`, `jg/t0.java`, `jg/u.java`, `jg/u0.java`, `jg/w.java`

## jg/p0.java

```java
package jg;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
abstract class p0 extends w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f102533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f102534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f102535f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected p0(c cVar, int i15, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        Objects.requireNonNull(cVar);
        this.f102535f = cVar;
        this.f102533d = i15;
        this.f102534e = bundle;
    }

    @Override // jg.w0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        int i15 = this.f102533d;
        if (i15 != 0) {
            this.f102535f.T(1, null);
            Bundle bundle = this.f102534e;
            f(new gg.a(i15, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (e()) {
                return;
            }
            this.f102535f.T(1, null);
            f(new gg.a(8, null));
        }
    }

    protected abstract boolean e();

    protected abstract void f(gg.a aVar);
}

```

## jg/q.java

```java
package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class q extends kg.a {
    public static final Parcelable.Creator<q> CREATOR = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f102536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f102537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f102539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f102540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f102541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f102542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f102543h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f102544j;

    @Deprecated
    public q(int i15, int i16, int i17, long j15, long j16, String str, String str2, int i18) {
        this(i15, i16, i17, j15, j16, str, str2, i18, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f102536a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, this.f102537b);
        kg.c.m(parcel, 3, this.f102538c);
        kg.c.r(parcel, 4, this.f102539d);
        kg.c.r(parcel, 5, this.f102540e);
        kg.c.u(parcel, 6, this.f102541f, false);
        kg.c.u(parcel, 7, this.f102542g, false);
        kg.c.m(parcel, 8, this.f102543h);
        kg.c.m(parcel, 9, this.f102544j);
        kg.c.b(parcel, iA);
    }

    public q(int i15, int i16, int i17, long j15, long j16, String str, String str2, int i18, int i19) {
        this.f102536a = i15;
        this.f102537b = i16;
        this.f102538c = i17;
        this.f102539d = j15;
        this.f102540e = j16;
        this.f102541f = str;
        this.f102542g = str2;
        this.f102543h = i18;
        this.f102544j = i19;
    }
}

```

## jg/t0.java

```java
package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        boolean zO = false;
        boolean zO2 = false;
        int iV2 = 0;
        int iV3 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                zO = kg.b.o(parcel, iT);
            } else if (iN == 3) {
                zO2 = kg.b.o(parcel, iT);
            } else if (iN == 4) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                iV3 = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new u(iV, zO, zO2, iV2, iV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new u[i15];
    }
}

```

## jg/u.java

```java
package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class u extends kg.a {
    public static final Parcelable.Creator<u> CREATOR = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f102556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f102557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f102558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f102560e;

    public u(int i15, boolean z15, boolean z16, int i16, int i17) {
        this.f102556a = i15;
        this.f102557b = z15;
        this.f102558c = z16;
        this.f102559d = i16;
        this.f102560e = i17;
    }

    public int h() {
        return this.f102559d;
    }

    public int m() {
        return this.f102560e;
    }

    public boolean p() {
        return this.f102557b;
    }

    public boolean r() {
        return this.f102558c;
    }

    public int u() {
        return this.f102556a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, u());
        kg.c.c(parcel, 2, p());
        kg.c.c(parcel, 3, r());
        kg.c.m(parcel, 4, h());
        kg.c.m(parcel, 5, m());
        kg.c.b(parcel, iA);
    }
}

```

## jg/u0.java

```java
package jg;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f102561a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    static Intent a(Context context, f1 f1Var) {
        Bundle bundleCall;
        String strA = f1Var.a();
        if (strA == null) {
            return new Intent().setComponent(f1Var.c());
        }
        Intent intent = null;
        if (f1Var.d()) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", strA);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f102561a);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                StringBuilder sb5 = new StringBuilder(strA.length() + 72);
                                sb5.append("Dynamic lookup for intent failed for action ");
                                sb5.append(strA);
                                sb5.append(" but has possible resolution");
                                c2.g("ServiceBindIntentUtils", sb5.toString());
                                throw new s0(new gg.a(25, pendingIntent));
                            }
                        }
                    }
                    if (intent == null) {
                        c2.g("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(strA));
                    }
                } catch (Throwable th4) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th4;
                }
            } catch (RemoteException e15) {
                e = e15;
                c2.g("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            } catch (IllegalArgumentException e16) {
                e = e16;
                c2.g("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
        }
        return intent == null ? new Intent(strA).setPackage(f1Var.b()) : intent;
    }
}

```

## jg/w.java

```java
package jg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class w extends kg.a {
    public static final Parcelable.Creator<w> CREATOR = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f102565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f102566b;

    public w(int i15, List list) {
        this.f102565a = i15;
        this.f102566b = list;
    }

    public final int h() {
        return this.f102565a;
    }

    public final List m() {
        return this.f102566b;
    }

    public final void p(q qVar) {
        if (this.f102566b == null) {
            this.f102566b = new ArrayList();
        }
        this.f102566b.add(qVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f102565a);
        kg.c.y(parcel, 2, this.f102566b, false);
        kg.c.b(parcel, iA);
    }
}

```
