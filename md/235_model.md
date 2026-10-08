# Paczka 235 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `yh/s.java`, `yh/t.java`, `yh/u.java`, `yh/v.java`, `yh/w.java`, `yh/x.java`

## yh/s.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class s extends kg.a {
    public static final Parcelable.Creator<s> CREATOR = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f226909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f226910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f226911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f226912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f226913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f226914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f226915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f226916h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f226917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f226918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f226919l;

    s() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f226909a, false);
        kg.c.u(parcel, 3, this.f226910b, false);
        kg.c.u(parcel, 4, this.f226911c, false);
        kg.c.u(parcel, 5, this.f226912d, false);
        kg.c.u(parcel, 6, this.f226913e, false);
        kg.c.u(parcel, 7, this.f226914f, false);
        kg.c.u(parcel, 8, this.f226915g, false);
        kg.c.u(parcel, 9, this.f226916h, false);
        kg.c.u(parcel, 10, this.f226917j, false);
        kg.c.c(parcel, 11, this.f226918k);
        kg.c.u(parcel, 12, this.f226919l, false);
        kg.c.b(parcel, iA);
    }

    s(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z15, String str10) {
        this.f226909a = str;
        this.f226910b = str2;
        this.f226911c = str3;
        this.f226912d = str4;
        this.f226913e = str5;
        this.f226914f = str6;
        this.f226915g = str7;
        this.f226916h = str8;
        this.f226917j = str9;
        this.f226918k = z15;
        this.f226919l = str10;
    }
}

```

## yh/t.java

```java
package yh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        b bVar = null;
        UserAddress userAddress = null;
        l lVar = null;
        String strH2 = null;
        Bundle bundleA = null;
        String strH3 = null;
        Bundle bundleA2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 2:
                    bVar = (b) kg.b.g(parcel, iT, b.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) kg.b.g(parcel, iT, UserAddress.CREATOR);
                    break;
                case 4:
                    lVar = (l) kg.b.g(parcel, iT, l.CREATOR);
                    break;
                case 5:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    bundleA = kg.b.a(parcel, iT);
                    break;
                case 7:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    bundleA2 = kg.b.a(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new i(strH, bVar, userAddress, lVar, strH2, bundleA, strH3, bundleA2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new i[i15];
    }
}

```

## yh/u.java

```java
package yh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        c cVar = null;
        p pVar = null;
        ArrayList<Integer> arrayListF = null;
        m mVar = null;
        q qVar = null;
        String strH = null;
        byte[] bArrB = null;
        Bundle bundleA = null;
        boolean zO = true;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                case 2:
                    zO3 = kg.b.o(parcel, iT);
                    break;
                case 3:
                    cVar = (c) kg.b.g(parcel, iT, c.CREATOR);
                    break;
                case 4:
                    zO4 = kg.b.o(parcel, iT);
                    break;
                case 5:
                    pVar = (p) kg.b.g(parcel, iT, p.CREATOR);
                    break;
                case 6:
                    arrayListF = kg.b.f(parcel, iT);
                    break;
                case 7:
                    mVar = (m) kg.b.g(parcel, iT, m.CREATOR);
                    break;
                case 8:
                    qVar = (q) kg.b.g(parcel, iT, q.CREATOR);
                    break;
                case 9:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 10:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 11:
                    bundleA = kg.b.a(parcel, iT);
                    break;
                case 12:
                    bArrB = kg.b.b(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new j(zO2, zO3, cVar, zO4, pVar, arrayListF, mVar, qVar, zO, strH, bArrB, bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new j[i15];
    }
}

```

## yh/v.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 1) {
                kg.b.B(parcel, iT);
            } else {
                strH = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new k(strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new k[i15];
    }
}

```

## yh/w.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                strH = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new l(iV, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new l[i15];
    }
}

```

## yh/x.java

```java
package yh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        Bundle bundleA = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                bundleA = kg.b.a(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new m(iV, bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new m[i15];
    }
}

```
