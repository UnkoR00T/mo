# Paczka 160 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `kh/m.java`, `kh/p.java`

## kh/m.java

```java
package kh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        long jY = -1;
        long jY2 = -1;
        int iV = 1;
        int iV2 = 1;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN == 3) {
                jY = kg.b.y(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                jY2 = kg.b.y(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new l(iV, iV2, jY, jY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new l[i15];
    }
}

```

## kh/p.java

Powiązane klasy (możesz dosłać): `zg/f0.java`

```java
package kh;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import zg.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        WorkSource workSource = new WorkSource();
        f0 f0Var = null;
        int iV = 0;
        boolean zO = false;
        int iV2 = 0;
        long jY = Long.MAX_VALUE;
        long jY2 = Long.MAX_VALUE;
        int iV3 = 102;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    jY = kg.b.y(parcel, iT);
                    break;
                case 2:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 3:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                case 4:
                    jY2 = kg.b.y(parcel, iT);
                    break;
                case 5:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 6:
                    workSource = (WorkSource) kg.b.g(parcel, iT, WorkSource.CREATOR);
                    break;
                case 7:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 8:
                default:
                    kg.b.B(parcel, iT);
                    break;
                case 9:
                    f0Var = (f0) kg.b.g(parcel, iT, f0.CREATOR);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new a(jY, iV, iV3, jY2, zO, iV2, workSource, f0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new a[i15];
    }
}

```
