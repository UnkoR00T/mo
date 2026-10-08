# Paczka 123 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `gg/a.java`, `gg/c.java`, `gg/p.java`, `gg/q.java`

## gg/a.java

```java
package gg;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f72706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f72707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f72708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f72709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f72710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f72705f = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new p();

    a(int i15, int i16, PendingIntent pendingIntent, String str, Integer num) {
        this.f72706a = i15;
        this.f72707b = i16;
        this.f72708c = pendingIntent;
        this.f72709d = str;
        this.f72710e = num;
    }

    static String C(int i15) {
        if (i15 == 99) {
            return "UNFINISHED";
        }
        if (i15 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i15) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i15) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 20);
                        sb5.append("UNKNOWN_ERROR_CODE(");
                        sb5.append(i15);
                        sb5.append(")");
                        return sb5.toString();
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f72707b == aVar.f72707b && jg.r.a(this.f72708c, aVar.f72708c) && jg.r.a(this.f72709d, aVar.f72709d) && jg.r.a(this.f72710e, aVar.f72710e);
    }

    public Integer h() {
        return this.f72710e;
    }

    public int hashCode() {
        return jg.r.b(Integer.valueOf(this.f72707b), this.f72708c, this.f72709d, this.f72710e);
    }

    public int m() {
        return this.f72707b;
    }

    public String p() {
        return this.f72709d;
    }

    public PendingIntent r() {
        return this.f72708c;
    }

    public String toString() {
        jg.r.a aVarC = jg.r.c(this);
        aVarC.a("statusCode", C(this.f72707b));
        aVarC.a("resolution", this.f72708c);
        aVarC.a("message", this.f72709d);
        aVarC.a("clientMethodKey", this.f72710e);
        return aVarC.toString();
    }

    public boolean u() {
        return (this.f72707b == 0 || this.f72708c == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f72706a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, m());
        kg.c.t(parcel, 3, r(), i15, false);
        kg.c.u(parcel, 4, p(), false);
        kg.c.p(parcel, 5, h(), false);
        kg.c.b(parcel, iA);
    }

    public boolean y() {
        return this.f72707b == 0;
    }

    public a(int i15) {
        this(i15, null, null);
    }

    public a(int i15, PendingIntent pendingIntent) {
        this(i15, pendingIntent, null);
    }

    public a(int i15, PendingIntent pendingIntent, String str) {
        this(1, i15, pendingIntent, str, null);
    }
}

```

## gg/c.java

```java
package gg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class c extends kg.a {
    public static final Parcelable.Creator<c> CREATOR = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f72725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    private final int f72726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f72727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f72728d;

    public c(String str, int i15, long j15, boolean z15) {
        this.f72725a = str;
        this.f72726b = i15;
        this.f72727c = j15;
        this.f72728d = z15;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (r(cVar) && h() == cVar.h()) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return this.f72728d;
    }

    public final int hashCode() {
        return jg.r.b(m(), Long.valueOf(p()), Boolean.valueOf(h()));
    }

    public String m() {
        return this.f72725a;
    }

    public long p() {
        long j15 = this.f72727c;
        return j15 == -1 ? this.f72726b : j15;
    }

    public boolean r(c cVar) {
        return cVar != null && jg.r.a(m(), cVar.m()) && p() == cVar.p();
    }

    public final String toString() {
        jg.r.a aVarC = jg.r.c(this);
        aVarC.a("name", m());
        aVarC.a("version", Long.valueOf(p()));
        aVarC.a("is_fully_rolled_out", Boolean.valueOf(h()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, m(), false);
        kg.c.m(parcel, 2, this.f72726b);
        kg.c.r(parcel, 3, p());
        kg.c.c(parcel, 4, h());
        kg.c.b(parcel, iA);
    }

    public c(String str, long j15) {
        this(str, -1, j15, false);
    }

    public c(String str, long j15, boolean z15) {
        this(str, -1, j15, z15);
    }
}

```

## gg/p.java

```java
package gg;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        PendingIntent pendingIntent = null;
        String strH = null;
        Integer numW = null;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN == 3) {
                pendingIntent = (PendingIntent) kg.b.g(parcel, iT, PendingIntent.CREATOR);
            } else if (iN == 4) {
                strH = kg.b.h(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                numW = kg.b.w(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new a(iV, iV2, pendingIntent, strH, numW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new a[i15];
    }
}

```

## gg/q.java

```java
package gg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        boolean zO = false;
        long jY = -1;
        String strH = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 2) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 3) {
                jY = kg.b.y(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                zO = kg.b.o(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new c(strH, iV, jY, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new c[i15];
    }
}

```
