# Paczka 169 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `nh/u.java`, `nh/v.java`, `nh/w.java`, `nh/x.java`, `nh/y.java`, `nh/z.java`, `ni/b.java`

## nh/u.java

```java
package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        double dQ = 0.0d;
        double dQ2 = 0.0d;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                dQ = kg.b.q(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                dQ2 = kg.b.q(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new LatLng(dQ, dQ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new LatLng[i15];
    }
}

```

## nh/v.java

```java
package nh;

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
            if (kg.b.n(iT) != 2) {
                kg.b.B(parcel, iT);
            } else {
                strH = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new g(strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new g[i15];
    }
}

```

## nh/w.java

```java
package nh;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        LatLng latLng = null;
        String strH = null;
        String strH2 = null;
        IBinder iBinderU = null;
        IBinder iBinderU2 = null;
        String strH3 = null;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        int iV = 0;
        int iV2 = 0;
        float fR = 0.0f;
        float fR2 = 0.0f;
        float fR3 = 0.0f;
        float fR4 = 0.0f;
        float fR5 = 0.0f;
        float fR6 = 1.0f;
        float fR7 = 0.5f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    latLng = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
                    break;
                case 3:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    iBinderU = kg.b.u(parcel, iT);
                    break;
                case 6:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 7:
                    fR2 = kg.b.r(parcel, iT);
                    break;
                case 8:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 9:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                case 10:
                    zO3 = kg.b.o(parcel, iT);
                    break;
                case 11:
                    fR3 = kg.b.r(parcel, iT);
                    break;
                case 12:
                    fR7 = kg.b.r(parcel, iT);
                    break;
                case 13:
                    fR4 = kg.b.r(parcel, iT);
                    break;
                case 14:
                    fR6 = kg.b.r(parcel, iT);
                    break;
                case 15:
                    fR5 = kg.b.r(parcel, iT);
                    break;
                case 16:
                default:
                    kg.b.B(parcel, iT);
                    break;
                case 17:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 18:
                    iBinderU2 = kg.b.u(parcel, iT);
                    break;
                case 19:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 20:
                    strH3 = kg.b.h(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new i(latLng, strH, strH2, iBinderU, fR, fR2, zO, zO2, zO3, fR3, fR7, fR4, fR6, fR5, iV, iBinderU2, iV2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new i[i15];
    }
}

```

## nh/x.java

```java
package nh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        Float fS = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                fS = kg.b.s(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new j(iV, fS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new j[i15];
    }
}

```

## nh/y.java

```java
package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        LatLng latLng = null;
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                latLng = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN == 3) {
                strH = kg.b.h(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                strH2 = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new k(latLng, strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new k[i15];
    }
}

```

## nh/z.java

```java
package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList arrayList = new ArrayList();
        float fR = 0.0f;
        ArrayList arrayListL = null;
        int iV = 0;
        int iV2 = 0;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        int iV3 = 0;
        float fR2 = 0.0f;
        ArrayList arrayListL2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    arrayListL2 = kg.b.l(parcel, iT, LatLng.CREATOR);
                    break;
                case 3:
                    kg.b.x(parcel, iT, arrayList, z.class.getClassLoader());
                    break;
                case 4:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 5:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 6:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 7:
                    fR2 = kg.b.r(parcel, iT);
                    break;
                case 8:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 9:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                case 10:
                    zO3 = kg.b.o(parcel, iT);
                    break;
                case 11:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                case 12:
                    arrayListL = kg.b.l(parcel, iT, j.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new m(arrayListL2, arrayList, fR, iV, iV2, fR2, zO, zO2, zO3, iV3, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new m[i15];
    }
}

```

## ni/b.java

```java
package ni;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new c[i15];
    }
}

```
