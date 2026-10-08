# Paczka 113 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ei/g.java`, `ei/h.java`, `ei/i.java`, `ei/j.java`, `ei/k.java`, `ei/l.java`, `ei/m.java`, `ei/n.java`, `ei/o.java`, `ei/p.java`

## ei/g.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends kg.a {
    public static final Parcelable.Creator<g> CREATOR = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f51544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f51545b;

    g() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f51544a, false);
        kg.c.u(parcel, 3, this.f51545b, false);
        kg.c.b(parcel, iA);
    }

    public g(String str, String str2) {
        this.f51544a = str;
        this.f51545b = str2;
    }
}

```

## ei/h.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends kg.a {
    public static final Parcelable.Creator<h> CREATOR = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f51546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f51547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    f f51548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    g f51549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    g f51550e;

    h(String str, String str2, f fVar, g gVar, g gVar2) {
        this.f51546a = str;
        this.f51547b = str2;
        this.f51548c = fVar;
        this.f51549d = gVar;
        this.f51550e = gVar2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f51546a, false);
        kg.c.u(parcel, 3, this.f51547b, false);
        kg.c.t(parcel, 4, this.f51548c, i15, false);
        kg.c.t(parcel, 5, this.f51549d, i15, false);
        kg.c.t(parcel, 6, this.f51550e, i15, false);
        kg.c.b(parcel, iA);
    }
}

```

## ei/i.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                strH2 = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new a(strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new a[i15];
    }
}

```

## ei/j.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList arrayListC = com.google.android.gms.common.util.b.c();
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
                arrayListC = kg.b.l(parcel, iT, a.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new b(strH, strH2, arrayListC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new b[i15];
    }
}

```

## ei/k.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = -1;
        long jY = 0;
        String strH = null;
        String strH2 = null;
        double dQ = 0.0d;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 3:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 4:
                    dQ = kg.b.q(parcel, iT);
                    break;
                case 5:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    jY = kg.b.y(parcel, iT);
                    break;
                case 7:
                    iV = kg.b.v(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new d(iV2, strH, dQ, strH2, jY, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new d[i15];
    }
}

```

## ei/l.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        d dVar = null;
        f fVar = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 3) {
                dVar = (d) kg.b.g(parcel, iT, d.CREATOR);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                fVar = (f) kg.b.g(parcel, iT, f.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new c(strH, dVar, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new c[i15];
    }
}

```

## ei/m.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                strH2 = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new e(strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new e[i15];
    }
}

```

## ei/n.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                jY = kg.b.y(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                jY2 = kg.b.y(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new f(jY, jY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new f[i15];
    }
}

```

## ei/o.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                strH2 = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new g(strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new g[i15];
    }
}

```

## ei/p.java

```java
package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        f fVar = null;
        g gVar = null;
        g gVar2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 3) {
                strH2 = kg.b.h(parcel, iT);
            } else if (iN == 4) {
                fVar = (f) kg.b.g(parcel, iT, f.CREATOR);
            } else if (iN == 5) {
                gVar = (g) kg.b.g(parcel, iT, g.CREATOR);
            } else if (iN != 6) {
                kg.b.B(parcel, iT);
            } else {
                gVar2 = (g) kg.b.g(parcel, iT, g.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new h(strH, strH2, fVar, gVar, gVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new h[i15];
    }
}

```
