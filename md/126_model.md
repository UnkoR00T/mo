# Paczka 126 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ib/c.java`, `ig/l1.java`, `ii/a.java`, `ii/a0.java`, `ii/a4.java`, `ii/a5.java`, `ii/a6.java`, `ii/a7.java`

## ib/c.java

```java
package ib;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public interface c {
    Parcelable a();

    void b(Parcelable parcelable);
}

```

## ig/l1.java

```java
package ig;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l1 extends h implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile boolean f92223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AtomicReference f92224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f92225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final gg.d f92226e;

    l1(i iVar, gg.d dVar) {
        super(iVar);
        this.f92224c = new AtomicReference(null);
        this.f92225d = new vg.f(Looper.getMainLooper());
        this.f92226e = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void r() {
        this.f92224c.set(null);
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void s(gg.a aVar, int i15) {
        this.f92224c.set(null);
        o(aVar, i15);
    }

    private static final int n(i1 i1Var) {
        if (i1Var == null) {
            return -1;
        }
        return i1Var.a();
    }

    @Override // ig.h
    public final void e(int i15, int i16, Intent intent) {
        i1 i1Var = (i1) this.f92224c.get();
        if (i15 != 1) {
            if (i15 == 2) {
                int iG = this.f92226e.g(b());
                if (iG == 0) {
                    r();
                    return;
                } else {
                    if (i1Var == null) {
                        return;
                    }
                    if (i1Var.b().m() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i16 == -1) {
            r();
            return;
        } else if (i16 == 0) {
            if (i1Var != null) {
                s(new gg.a(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, i1Var.b().toString()), n(i1Var));
                return;
            }
            return;
        }
        if (i1Var != null) {
            s(i1Var.b(), i1Var.a());
        }
    }

    @Override // ig.h
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f92224c.set(bundle.getBoolean("resolving_error", false) ? new i1(new gg.a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // ig.h
    public final void i(Bundle bundle) {
        super.i(bundle);
        i1 i1Var = (i1) this.f92224c.get();
        if (i1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", i1Var.a());
        bundle.putInt("failed_status", i1Var.b().m());
        bundle.putParcelable("failed_resolution", i1Var.b().r());
    }

    @Override // ig.h
    public void j() {
        super.j();
        this.f92223b = true;
    }

    @Override // ig.h
    public void k() {
        super.k();
        this.f92223b = false;
    }

    protected abstract void o(gg.a aVar, int i15);

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        s(new gg.a(13, null), n((i1) this.f92224c.get()));
    }

    protected abstract void p();

    public final void q(gg.a aVar, int i15) {
        i1 i1Var = new i1(aVar, i15);
        if (androidx.camera.view.i.a(this.f92224c, null, i1Var)) {
            this.f92225d.post(new k1(this, i1Var));
        }
    }
}

```

## ii/a.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: ii.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2187a {
        @RecentlyNonNull
        public abstract a a();

        @RecentlyNonNull
        public abstract AbstractC2187a b(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract AbstractC2187a c(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract AbstractC2187a d(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract AbstractC2187a e(@RecentlyNonNull l0.a aVar);
    }

    @RecentlyNonNull
    public static AbstractC2187a a() {
        z0 z0Var = new z0();
        l0.a aVar = l0.a.UNKNOWN;
        z0Var.b(aVar);
        z0Var.d(aVar);
        z0Var.c(aVar);
        z0Var.e(aVar);
        return z0Var;
    }

    @RecentlyNonNull
    public abstract l0.a b();

    @RecentlyNonNull
    public abstract l0.a c();

    @RecentlyNonNull
    public abstract l0.a d();

    @RecentlyNonNull
    public abstract l0.a e();
}

```

## ii/a0.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 implements Parcelable, Comparable<a0> {
    @RecentlyNonNull
    public static a0 k(int i15, int i16, int i17) {
        r1 r1Var = new r1();
        r1Var.d(i15);
        r1Var.a(i16);
        r1Var.b(i17);
        a0 a0VarC = r1Var.c();
        int iG = a0VarC.g();
        ak.q1 q1VarD = ak.q1.d(1, 12);
        Integer numValueOf = Integer.valueOf(iG);
        zj.p.h(q1VarD.g(numValueOf), "Month must not be out of range of 1 to 12, but was: %s.", iG);
        int iE = a0VarC.e();
        ak.q1 q1VarD2 = ak.q1.d(1, 31);
        Integer numValueOf2 = Integer.valueOf(iE);
        zj.p.h(q1VarD2.g(numValueOf2), "Day must not be out of range of 1 to 31, but was: %s.", iE);
        if (Arrays.asList(4, 6, 9, 11).contains(numValueOf)) {
            zj.p.i(ak.q1.d(1, 30).g(numValueOf2), "%s is not a valid day for month %s.", iE, iG);
        }
        if (iG == 2) {
            int iJ = a0VarC.j();
            zj.p.n(ak.q1.d(1, Integer.valueOf(iJ % 4 == 0 ? 29 : 28)).g(numValueOf2), "%s is not a valid day for month %s in year %s.", numValueOf2, 2, Integer.valueOf(iJ));
        }
        return a0VarC;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@RecentlyNonNull a0 a0Var) {
        int iE;
        int iE2;
        zj.p.r(a0Var, "dateToCompare must not be null.");
        if (this == a0Var) {
            return 0;
        }
        if (j() != a0Var.j()) {
            iE = j();
            iE2 = a0Var.j();
        } else if (g() != a0Var.g()) {
            iE = g();
            iE2 = a0Var.g();
        } else {
            iE = e();
            iE2 = a0Var.e();
        }
        return iE - iE2;
    }

    public abstract int e();

    public abstract int g();

    public abstract int j();

    @RecentlyNonNull
    public final String toString() {
        return String.format(Locale.getDefault(), "%s-%s-%s", Integer.valueOf(j()), String.format(Locale.getDefault(), "%02d", Integer.valueOf(g())), String.format(Locale.getDefault(), "%02d", Integer.valueOf(e())));
    }
}

```

## ii/a4.java

```java
package ii;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class a4 implements Parcelable.Creator {
    a4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new b4((ParcelUuid) parcel.readParcelable(i.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new b4[i15];
    }
}

```

## ii/a5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class a5 extends p1 {
    public static final Parcelable.Creator<a5> CREATOR = new z4();

    a5(String str, String str2, String str3, String str4, List list, y.b bVar, Double d15, Double d16) {
        super(str, str2, str3, str4, list, bVar, d15, d16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        if (e() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(e());
        }
        if (d() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(d());
        }
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(b());
        }
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c());
        }
        parcel.writeList(i());
        if (f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(f().name());
        }
        if (g() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(g().doubleValue());
        }
        if (h() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(h().doubleValue());
        }
    }
}

```

## ii/a6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class a6 implements Parcelable.Creator {
    a6() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new b6(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new b6[i15];
    }
}

```

## ii/a7.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class a7 implements Parcelable.Creator {
    a7() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return g0.b.valueOf((String) zj.p.q(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new g0.b[i15];
    }
}

```
