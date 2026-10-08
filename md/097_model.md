# Paczka 097 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ch/gl.java`, `ch/gm.java`, `ch/h.java`, `ch/hl.java`, `ch/hm.java`, `ch/i.java`, `ch/il.java`, `ch/im.java`

## ch/gl.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class gl extends kg.a {
    public static final Parcelable.Creator<gl> CREATOR = new wl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f25916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f25917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25918h;

    public gl(int i15, int i16, int i17, int i18, int i19, int i25, boolean z15, String str) {
        this.f25911a = i15;
        this.f25912b = i16;
        this.f25913c = i17;
        this.f25914d = i18;
        this.f25915e = i19;
        this.f25916f = i25;
        this.f25917g = z15;
        this.f25918h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f25911a);
        kg.c.m(parcel, 2, this.f25912b);
        kg.c.m(parcel, 3, this.f25913c);
        kg.c.m(parcel, 4, this.f25914d);
        kg.c.m(parcel, 5, this.f25915e);
        kg.c.m(parcel, 6, this.f25916f);
        kg.c.c(parcel, 7, this.f25917g);
        kg.c.u(parcel, 8, this.f25918h, false);
        kg.c.b(parcel, iA);
    }
}

```

## ch/gm.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class gm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 2:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH5 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    strH6 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    strH7 = kg.b.h(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new ml(strH, strH2, strH3, strH4, strH5, strH6, strH7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new ml[i15];
    }
}

```

## ch/h.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 3) {
                strH2 = kg.b.h(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                iV = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new yg(strH, strH2, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new yg[i15];
    }
}

```

## ch/hl.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class hl extends kg.a {
    public static final Parcelable.Creator<hl> CREATOR = new xl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final gl f25940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final gl f25941g;

    public hl(String str, String str2, String str3, String str4, String str5, gl glVar, gl glVar2) {
        this.f25935a = str;
        this.f25936b = str2;
        this.f25937c = str3;
        this.f25938d = str4;
        this.f25939e = str5;
        this.f25940f = glVar;
        this.f25941g = glVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f25935a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f25936b, false);
        kg.c.u(parcel, 3, this.f25937c, false);
        kg.c.u(parcel, 4, this.f25938d, false);
        kg.c.u(parcel, 5, this.f25939e, false);
        kg.c.t(parcel, 6, this.f25940f, i15, false);
        kg.c.t(parcel, 7, this.f25941g, i15, false);
        kg.c.b(parcel, iA);
    }
}

```

## ch/hm.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class hm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                strH = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new nl(iV, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new nl[i15];
    }
}

```

## ch/i.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends kg.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25943b;

    public i() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f25942a == iVar.f25942a && jg.r.a(Boolean.valueOf(this.f25943b), Boolean.valueOf(iVar.f25943b));
    }

    public final int hashCode() {
        return jg.r.b(Integer.valueOf(this.f25942a), Boolean.valueOf(this.f25943b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f25942a);
        kg.c.c(parcel, 3, this.f25943b);
        kg.c.b(parcel, iA);
    }

    public i(int i15, boolean z15) {
        this.f25942a = i15;
        this.f25943b = z15;
    }
}

```

## ch/il.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class il extends kg.a {
    public static final Parcelable.Creator<il> CREATOR = new yl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ml f25959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nl[] f25962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kl[] f25963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f25964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fl[] f25965g;

    public il(ml mlVar, String str, String str2, nl[] nlVarArr, kl[] klVarArr, String[] strArr, fl[] flVarArr) {
        this.f25959a = mlVar;
        this.f25960b = str;
        this.f25961c = str2;
        this.f25962d = nlVarArr;
        this.f25963e = klVarArr;
        this.f25964f = strArr;
        this.f25965g = flVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f25959a, i15, false);
        kg.c.u(parcel, 2, this.f25960b, false);
        kg.c.u(parcel, 3, this.f25961c, false);
        kg.c.x(parcel, 4, this.f25962d, i15, false);
        kg.c.x(parcel, 5, this.f25963e, i15, false);
        kg.c.v(parcel, 6, this.f25964f, false);
        kg.c.x(parcel, 7, this.f25965g, i15, false);
        kg.c.b(parcel, iA);
    }
}

```

## ch/im.java

```java
package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class im implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                strH = kg.b.h(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                strH2 = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new ol(strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new ol[i15];
    }
}

```
