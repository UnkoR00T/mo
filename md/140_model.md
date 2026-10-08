# Paczka 140 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `jg/b0.java`, `jg/b1.java`

## jg/b0.java

```java
package jg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList arrayListL = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                arrayListL = kg.b.l(parcel, iT, q.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new w(iV, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new w[i15];
    }
}

```

## jg/b1.java

```java
package jg;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends kg.a {
    public static final Parcelable.Creator<b1> CREATOR = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bundle f102405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    gg.c[] f102406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f102407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    f f102408d;

    public b1() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.d(parcel, 1, this.f102405a, false);
        kg.c.x(parcel, 2, this.f102406b, i15, false);
        kg.c.m(parcel, 3, this.f102407c);
        kg.c.t(parcel, 4, this.f102408d, i15, false);
        kg.c.b(parcel, iA);
    }

    b1(Bundle bundle, gg.c[] cVarArr, int i15, f fVar) {
        this.f102405a = bundle;
        this.f102406b = cVarArr;
        this.f102407c = i15;
        this.f102408d = fVar;
    }
}

```
