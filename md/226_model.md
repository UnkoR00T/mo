# Paczka 226 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `xg/o.java`, `xh/a.java`, `xh/b.java`, `xh/c.java`, `xh/d.java`

## xg/o.java

```java
package xg;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ClassLoader f218460a = o.class.getClassLoader();

    private o() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static void c(Parcel parcel) {
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

## xh/a.java

```java
package xh;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF[] f218580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f218581b;

    public a(PointF[] pointFArr, int i15) {
        this.f218580a = pointFArr;
        this.f218581b = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.x(parcel, 2, this.f218580a, i15, false);
        kg.c.m(parcel, 3, this.f218581b);
        kg.c.b(parcel, iA);
    }
}

```

## xh/b.java

```java
package xh;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        PointF[] pointFArr = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                pointFArr = (PointF[]) kg.b.k(parcel, iT, PointF.CREATOR);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                iV = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new a(pointFArr, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i15) {
        return new a[i15];
    }
}

```

## xh/c.java

```java
package xh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator<FaceParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FaceParcel createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        int iV2 = 0;
        float fR = 0.0f;
        float fR2 = 0.0f;
        float fR3 = 0.0f;
        float fR4 = 0.0f;
        float fR5 = 0.0f;
        float fR6 = 0.0f;
        float fR7 = 0.0f;
        float fR8 = Float.MAX_VALUE;
        float fR9 = Float.MAX_VALUE;
        float fR10 = Float.MAX_VALUE;
        LandmarkParcel[] landmarkParcelArr = null;
        a[] aVarArr = null;
        float fR11 = -1.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 2:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 3:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 4:
                    fR2 = kg.b.r(parcel, iT);
                    break;
                case 5:
                    fR3 = kg.b.r(parcel, iT);
                    break;
                case 6:
                    fR4 = kg.b.r(parcel, iT);
                    break;
                case 7:
                    fR8 = kg.b.r(parcel, iT);
                    break;
                case 8:
                    fR9 = kg.b.r(parcel, iT);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) kg.b.k(parcel, iT, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    fR5 = kg.b.r(parcel, iT);
                    break;
                case 11:
                    fR6 = kg.b.r(parcel, iT);
                    break;
                case 12:
                    fR7 = kg.b.r(parcel, iT);
                    break;
                case 13:
                    aVarArr = (a[]) kg.b.k(parcel, iT, a.CREATOR);
                    break;
                case 14:
                    fR10 = kg.b.r(parcel, iT);
                    break;
                case 15:
                    fR11 = kg.b.r(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new FaceParcel(iV, iV2, fR, fR2, fR3, fR4, fR8, fR9, fR10, landmarkParcelArr, fR5, fR6, fR7, aVarArr, fR11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FaceParcel[] newArray(int i15) {
        return new FaceParcel[i15];
    }
}

```

## xh/d.java

```java
package xh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Parcelable.Creator<LandmarkParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LandmarkParcel createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        float fR = 0.0f;
        float fR2 = 0.0f;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                fR = kg.b.r(parcel, iT);
            } else if (iN == 3) {
                fR2 = kg.b.r(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                iV2 = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new LandmarkParcel(iV, fR, fR2, iV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LandmarkParcel[] newArray(int i15) {
        return new LandmarkParcel[i15];
    }
}

```
