# Paczka 234 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `yh/k0.java`, `yh/l.java`, `yh/l0.java`, `yh/m.java`, `yh/m0.java`, `yh/o.java`, `yh/p.java`, `yh/q.java`

## yh/k0.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList arrayListC = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC2 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC3 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListL = arrayListC;
        ArrayList arrayListL2 = arrayListC2;
        ArrayList arrayListL3 = arrayListC3;
        ArrayList arrayListC4 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC5 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC6 = com.google.android.gms.common.util.b.c();
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        String strH8 = null;
        String strH9 = null;
        String strH10 = null;
        ei.f fVar = null;
        String strH11 = null;
        String strH12 = null;
        ei.c cVar = null;
        int iV = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    strH5 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    strH6 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    strH7 = kg.b.h(parcel, iT);
                    break;
                case 9:
                    strH8 = kg.b.h(parcel, iT);
                    break;
                case 10:
                    strH9 = kg.b.h(parcel, iT);
                    break;
                case 11:
                    strH10 = kg.b.h(parcel, iT);
                    break;
                case 12:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 13:
                    arrayListL = kg.b.l(parcel, iT, ei.h.CREATOR);
                    break;
                case 14:
                    fVar = (ei.f) kg.b.g(parcel, iT, ei.f.CREATOR);
                    break;
                case 15:
                    arrayListL2 = kg.b.l(parcel, iT, LatLng.CREATOR);
                    break;
                case 16:
                    strH11 = kg.b.h(parcel, iT);
                    break;
                case 17:
                    strH12 = kg.b.h(parcel, iT);
                    break;
                case 18:
                    arrayListL3 = kg.b.l(parcel, iT, ei.b.CREATOR);
                    break;
                case 19:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 20:
                    arrayListC4 = kg.b.l(parcel, iT, ei.g.CREATOR);
                    break;
                case 21:
                    arrayListC5 = kg.b.l(parcel, iT, ei.e.CREATOR);
                    break;
                case 22:
                    arrayListC6 = kg.b.l(parcel, iT, ei.g.CREATOR);
                    break;
                case 23:
                    cVar = (ei.c) kg.b.g(parcel, iT, ei.c.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new f(strH, strH2, strH3, strH4, strH5, strH6, strH7, strH8, strH9, strH10, iV, arrayListL, fVar, arrayListL2, strH11, strH12, arrayListL3, zO, arrayListC4, arrayListC5, arrayListC6, cVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new f[i15];
    }
}

```

## yh/l.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends kg.a {
    public static final Parcelable.Creator<l> CREATOR = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f226885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f226886b;

    private l() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f226885a);
        kg.c.u(parcel, 3, this.f226886b, false);
        kg.c.b(parcel, iA);
    }

    l(int i15, String str) {
        this.f226885a = i15;
        this.f226886b = str;
    }
}

```

## yh/l0.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        CommonWalletObject commonWalletObject = null;
        int iV = 0;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 3) {
                strH2 = kg.b.h(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                commonWalletObject = (CommonWalletObject) kg.b.g(parcel, iT, CommonWalletObject.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new g(iV, strH, strH2, commonWalletObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new g[i15];
    }
}

```

## yh/m.java

```java
package yh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends kg.a {
    public static final Parcelable.Creator<m> CREATOR = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f226887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Bundle f226888b;

    private m() {
        this.f226888b = new Bundle();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f226887a);
        kg.c.d(parcel, 3, this.f226888b, false);
        kg.c.b(parcel, iA);
    }

    m(int i15, Bundle bundle) {
        new Bundle();
        this.f226887a = i15;
        this.f226888b = bundle;
    }
}

```

## yh/m0.java

```java
package yh;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements Parcelable.Creator {
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
        return new h(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new h[i15];
    }
}

```

## yh/o.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o extends kg.a {
    public static final Parcelable.Creator<o> CREATOR = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f226889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f226890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f226891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f226892d;

    public o(String str, String str2, int i15, int i16) {
        this.f226889a = str;
        this.f226890b = str2;
        this.f226891c = i15;
        this.f226892d = i16;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        String str = this.f226889a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, str, false);
        kg.c.u(parcel, 3, this.f226890b, false);
        kg.c.m(parcel, 4, this.f226891c);
        kg.c.m(parcel, 5, this.f226892d);
        kg.c.b(parcel, iA);
    }
}

```

## yh/p.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends kg.a {
    public static final Parcelable.Creator<p> CREATOR = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f226893a;

    private p() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.w(parcel, 1, this.f226893a, false);
        kg.c.b(parcel, iA);
    }

    p(ArrayList arrayList) {
        this.f226893a = arrayList;
    }
}

```

## yh/q.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends kg.a {
    public static final Parcelable.Creator<q> CREATOR = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f226894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f226895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f226896c;

    private q() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f226894a);
        kg.c.u(parcel, 2, this.f226895b, false);
        kg.c.u(parcel, 3, this.f226896c, false);
        kg.c.b(parcel, iA);
    }

    public q(int i15, String str, String str2) {
        this.f226894a = i15;
        this.f226895b = str;
        this.f226896c = str2;
    }
}

```
