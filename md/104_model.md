# Paczka 104 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ci/a.java`, `ci/b.java`

## ci/a.java

Powiązane klasy (możesz dosłać): `kg/c.java`

```java
package ci;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import kg.c;

/* JADX INFO: loaded from: classes3.dex */
public class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String[] f27144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f27145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    RemoteViews f27146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    byte[] f27147d;

    private a() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = c.a(parcel);
        c.v(parcel, 1, this.f27144a, false);
        c.n(parcel, 2, this.f27145b, false);
        c.t(parcel, 3, this.f27146c, i15, false);
        c.f(parcel, 4, this.f27147d, false);
        c.b(parcel, iA);
    }

    public a(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.f27144a = strArr;
        this.f27145b = iArr;
        this.f27146c = remoteViews;
        this.f27147d = bArr;
    }
}

```

## ci/b.java

```java
package ci;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String[] strArrI = null;
        int[] iArrE = null;
        RemoteViews remoteViews = null;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                strArrI = kg.b.i(parcel, iT);
            } else if (iN == 2) {
                iArrE = kg.b.e(parcel, iT);
            } else if (iN == 3) {
                remoteViews = (RemoteViews) kg.b.g(parcel, iT, RemoteViews.CREATOR);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                bArrB = kg.b.b(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new a(strArrI, iArrE, remoteViews, bArrB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new a[i15];
    }
}

```
