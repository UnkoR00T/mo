# Paczka 164 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `mg/g.java`, `mg/h.java`, `mg/i.java`, `mg/j.java`, `mg/k.java`, `mg/l.java`, `mh/r0.java`, `mi/a.java`

## mg/g.java

```java
package mg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class g extends kg.a {
    public static final Parcelable.Creator<g> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f126331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f126332b;

    public g(int i15) {
        this(i15, false);
    }

    public boolean h() {
        return this.f126331a == 0;
    }

    public int m() {
        return this.f126331a;
    }

    public final boolean p() {
        return this.f126332b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, m());
        kg.c.c(parcel, 2, this.f126332b);
        kg.c.b(parcel, iA);
    }

    public g(int i15, boolean z15) {
        this.f126331a = i15;
        this.f126332b = z15;
    }
}

```

## mg/h.java

```java
package mg;

import android.os.Parcel;
import android.os.Parcelable;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public class h extends kg.a {
    public static final Parcelable.Creator<h> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f126333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f126334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f126335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f126336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f126337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f126338f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f126339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f126340b;

        a(long j15, long j16) {
            s.n(j16);
            this.f126339a = j15;
            this.f126340b = j16;
        }
    }

    public h(int i15, int i16, Long l15, Long l16, int i17) {
        this.f126333a = i15;
        this.f126334b = i16;
        this.f126335c = l15;
        this.f126336d = l16;
        this.f126337e = i17;
        this.f126338f = (l15 == null || l16 == null || l16.longValue() == 0) ? null : new a(l15.longValue(), l16.longValue());
    }

    public int h() {
        return this.f126337e;
    }

    public int m() {
        return this.f126334b;
    }

    public int p() {
        return this.f126333a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, p());
        kg.c.m(parcel, 2, m());
        kg.c.s(parcel, 3, this.f126335c, false);
        kg.c.s(parcel, 4, this.f126336d, false);
        kg.c.m(parcel, 5, h());
        kg.c.b(parcel, iA);
    }
}

```

## mg/i.java

```java
package mg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        boolean zO = false;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                zO = kg.b.o(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                iV = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new b(zO, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new b[i15];
    }
}

```

## mg/j.java

```java
package mg;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 1) {
                kg.b.B(parcel, iT);
            } else {
                pendingIntent = (PendingIntent) kg.b.g(parcel, iT, PendingIntent.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new e(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new e[i15];
    }
}

```

## mg/k.java

```java
package mg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                zO = kg.b.o(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new g(iV, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new g[i15];
    }
}

```

## mg/l.java

```java
package mg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        Long lZ = null;
        Long lZ2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN == 3) {
                lZ = kg.b.z(parcel, iT);
            } else if (iN == 4) {
                lZ2 = kg.b.z(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                iV3 = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new h(iV, iV2, lZ, lZ2, iV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new h[i15];
    }
}

```

## mh/r0.java

```java
package mh;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {
    private r0() {
    }

    public static Parcelable a(Bundle bundle, String str) {
        ClassLoader classLoaderD = d();
        bundle.setClassLoader(classLoaderD);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoaderD);
        return bundle2.getParcelable(str);
    }

    public static void b(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable parcelableA = a(bundle, "MapOptions");
        if (parcelableA != null) {
            c(bundle2, "MapOptions", parcelableA);
        }
        Parcelable parcelableA2 = a(bundle, "StreetViewPanoramaOptions");
        if (parcelableA2 != null) {
            c(bundle2, "StreetViewPanoramaOptions", parcelableA2);
        }
        Parcelable parcelableA3 = a(bundle, "camera");
        if (parcelableA3 != null) {
            c(bundle2, "camera", parcelableA3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoaderD = d();
        bundle.setClassLoader(classLoaderD);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoaderD);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    private static ClassLoader d() {
        return (ClassLoader) jg.s.l(r0.class.getClassLoader());
    }
}

```

## mi/a.java

```java
package mi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.internal.dg;
import com.google.android.libraries.places.internal.hg;
import com.google.android.libraries.places.internal.qh;
import com.google.android.libraries.places.internal.yh;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        hg hgVar = (hg) Enum.valueOf(hg.class, parcel.readString());
        yh yhVar = (yh) Enum.valueOf(yh.class, parcel.readString());
        int i15 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i15);
        for (int i16 = 0; i16 != i15; i16++) {
            arrayList.add((dg) Enum.valueOf(dg.class, parcel.readString()));
        }
        return new b(hgVar, yhVar, arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), (qh) parcel.readValue(b.class.getClassLoader()), (qh) parcel.readValue(b.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new b[i15];
    }
}

```
