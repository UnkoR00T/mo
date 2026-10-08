# Paczka 239 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `zg/g1.java`, `zg/h1.java`, `zg/k0.java`, `zg/l0.java`, `zg/m0.java`, `zg/n.java`, `zg/n0.java`

## zg/g1.java

```java
package zg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends kg.a implements hg.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f235078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f235077b = new g1(Status.f29007f);
    public static final Parcelable.Creator<g1> CREATOR = new h1();

    public g1(Status status) {
        this.f235078a = status;
    }

    @Override // hg.l
    public final Status b() {
        return this.f235078a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f235078a, i15, false);
        kg.c.b(parcel, iA);
    }
}

```

## zg/h1.java

```java
package zg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        Status status = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 1) {
                kg.b.B(parcel, iT);
            } else {
                status = (Status) kg.b.g(parcel, iT, Status.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new g1(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new g1[i15];
    }
}

```

## zg/k0.java

```java
package zg;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends kg.a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f235089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder f235090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f235091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PendingIntent f235092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f235093e;

    k0(int i15, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f235089a = i15;
        this.f235090b = iBinder;
        this.f235091c = iBinder2;
        this.f235092d = pendingIntent;
        this.f235093e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, kh.u] */
    public static k0 h(IInterface iInterface, kh.u uVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new k0(2, iInterface, uVar, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k0 m(q1 q1Var) {
        return new k0(4, null, q1Var, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f235089a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.l(parcel, 2, this.f235090b, false);
        kg.c.l(parcel, 3, this.f235091c, false);
        kg.c.t(parcel, 4, this.f235092d, i15, false);
        kg.c.u(parcel, 6, this.f235093e, false);
        kg.c.b(parcel, iA);
    }
}

```

## zg/l0.java

```java
package zg;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        IBinder iBinderU = null;
        IBinder iBinderU2 = null;
        PendingIntent pendingIntent = null;
        String strH = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                iBinderU = kg.b.u(parcel, iT);
            } else if (iN == 3) {
                iBinderU2 = kg.b.u(parcel, iT);
            } else if (iN == 4) {
                pendingIntent = (PendingIntent) kg.b.g(parcel, iT, PendingIntent.CREATOR);
            } else if (iN != 6) {
                kg.b.B(parcel, iT);
            } else {
                strH = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new k0(iV, iBinderU, iBinderU2, pendingIntent, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new k0[i15];
    }
}

```

## zg/m0.java

```java
package zg;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class m0 extends kg.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LocationRequest f235096a;

    m0(LocationRequest locationRequest, List list, boolean z15, boolean z16, boolean z17, boolean z18, String str, long j15) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jg.d dVar = (jg.d) it.next();
                    com.google.android.gms.common.util.m.a(workSource, dVar.f102437a, dVar.f102438b);
                }
            }
            aVar.n(workSource);
        }
        if (z15) {
            aVar.c(1);
        }
        if (z16) {
            aVar.l(2);
        }
        if (z17) {
            aVar.m(true);
        }
        if (z18) {
            aVar.k(true);
        }
        if (j15 != Long.MAX_VALUE) {
            aVar.e(j15);
        }
        this.f235096a = aVar.a();
    }

    @Deprecated
    public static m0 h(String str, LocationRequest locationRequest) {
        return new m0(locationRequest, null, false, false, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            return jg.r.a(this.f235096a, ((m0) obj).f235096a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f235096a.hashCode();
    }

    public final String toString() {
        return this.f235096a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f235096a, i15, false);
        kg.c.b(parcel, iA);
    }
}

```

## zg/n.java

```java
package zg;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ClassLoader f235097a = n.class.getClassLoader();

    private n() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }

    public static void d(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
        sb5.append("Parcel data not fully consumed, unread size: ");
        sb5.append(iDataAvail);
        throw new BadParcelableException(sb5.toString());
    }
}

```

## zg/n0.java

```java
package zg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        long jY = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList arrayListL = null;
        String strH = null;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                locationRequest = (LocationRequest) kg.b.g(parcel, iT, LocationRequest.CREATOR);
            } else if (iN == 5) {
                arrayListL = kg.b.l(parcel, iT, jg.d.CREATOR);
            } else if (iN == 8) {
                zO = kg.b.o(parcel, iT);
            } else if (iN != 9) {
                switch (iN) {
                    case 11:
                        zO3 = kg.b.o(parcel, iT);
                        break;
                    case 12:
                        zO4 = kg.b.o(parcel, iT);
                        break;
                    case 13:
                        strH = kg.b.h(parcel, iT);
                        break;
                    case 14:
                        jY = kg.b.y(parcel, iT);
                        break;
                    default:
                        kg.b.B(parcel, iT);
                        break;
                }
            } else {
                zO2 = kg.b.o(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new m0(locationRequest, arrayListL, zO, zO2, zO3, zO4, strH, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new m0[i15];
    }
}

```
