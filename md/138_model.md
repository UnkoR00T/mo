# Paczka 138 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/x4.java`, `ii/x5.java`, `ii/x6.java`, `ii/y.java`, `ii/y0.java`

## ii/x4.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class x4 implements Parcelable.Creator {
    x4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new y4((Uri) parcel.readParcelable(x.class.getClassLoader()), (Uri) parcel.readParcelable(x.class.getClassLoader()), (Uri) parcel.readParcelable(x.class.getClassLoader()), (Uri) parcel.readParcelable(x.class.getClassLoader()), (Uri) parcel.readParcelable(x.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new y4[i15];
    }
}

```

## ii/x5.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class x5 extends l2 {
    public static final Parcelable.Creator<x5> CREATOR = new w5();

    x5(String str, String str2, String str3, c cVar, List list, l0.c cVar2, l lVar, l0.a aVar, g0 g0Var, l0.a aVar2, l0.a aVar3, String str4, String str5, Integer num, String str6, String str7, LatLng latLng, String str8, String str9, String str10, g0 g0Var2, String str11, String str12, List list2, List list3, List list4, n0 n0Var, Integer num2, p0 p0Var, String str13, String str14, String str15, Double d15, l0.a aVar4, List list5, List list6, l0.a aVar5, l0.a aVar6, l0.a aVar7, l0.a aVar8, l0.a aVar9, l0.a aVar10, l0.a aVar11, l0.a aVar12, Integer num3, Integer num4, LatLngBounds latLngBounds, Uri uri, Uri uri2, a aVar13, h0 h0Var, i0 i0Var, q qVar, l0.a aVar14, l0.a aVar15, l0.a aVar16, l0.a aVar17, l0.a aVar18, l0.a aVar19, l0.a aVar20, l0.a aVar21, l0.a aVar22, l0.a aVar23, l0.a aVar24, List list7, u uVar, l0.a aVar25, w wVar, t tVar, f0 f0Var, s0 s0Var, x xVar, List list8, ZoneId zoneId, d dVar, o0 o0Var) {
        super(str, str2, str3, cVar, list, cVar2, lVar, aVar, g0Var, aVar2, aVar3, str4, str5, num, str6, str7, latLng, str8, str9, str10, g0Var2, str11, str12, list2, list3, list4, n0Var, num2, p0Var, str13, str14, str15, d15, aVar4, list5, list6, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, num3, num4, latLngBounds, uri, uri2, aVar13, h0Var, i0Var, qVar, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, list7, uVar, aVar25, wVar, tVar, f0Var, s0Var, xVar, list8, zoneId, dVar, o0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        if (v() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(v());
        }
        if (r0() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(r0());
        }
        if (e() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(e());
        }
        parcel.writeParcelable(c(), i15);
        parcel.writeList(g());
        parcel.writeParcelable(h(), i15);
        parcel.writeParcelable(i(), i15);
        parcel.writeParcelable(k(), i15);
        parcel.writeParcelable(l(), i15);
        parcel.writeParcelable(n(), i15);
        parcel.writeParcelable(o(), i15);
        if (r() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(r());
        }
        if (s() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(s());
        }
        if (D() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(D().intValue());
        }
        if (E() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(E());
        }
        if (F() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(F());
        }
        parcel.writeParcelable(I(), i15);
        if (p() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(p());
        }
        if (q() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(q());
        }
        if (c0() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c0());
        }
        parcel.writeParcelable(M(), i15);
        if (G() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(G());
        }
        if (K() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(K());
        }
        parcel.writeList(Q());
        parcel.writeList(f0());
        parcel.writeList(R());
        parcel.writeParcelable(S(), i15);
        if (U() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(U().intValue());
        }
        parcel.writeParcelable(V(), i15);
        if (W() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(W());
        }
        if (X() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(X());
        }
        if (Y() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(Y());
        }
        if (a0() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(a0().doubleValue());
        }
        parcel.writeParcelable(b0(), i15);
        parcel.writeList(g0());
        parcel.writeList(m());
        parcel.writeParcelable(h0(), i15);
        parcel.writeParcelable(i0(), i15);
        parcel.writeParcelable(j0(), i15);
        parcel.writeParcelable(n0(), i15);
        parcel.writeParcelable(o0(), i15);
        parcel.writeParcelable(p0(), i15);
        parcel.writeParcelable(q0(), i15);
        parcel.writeParcelable(t0(), i15);
        if (v0() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(v0().intValue());
        }
        if (w0() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(w0().intValue());
        }
        parcel.writeParcelable(x0(), i15);
        parcel.writeParcelable(y0(), i15);
        parcel.writeParcelable(C(), i15);
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(O(), i15);
        parcel.writeParcelable(P(), i15);
        parcel.writeParcelable(u(), i15);
        parcel.writeParcelable(N(), i15);
        parcel.writeParcelable(H(), i15);
        parcel.writeParcelable(J(), i15);
        parcel.writeParcelable(k0(), i15);
        parcel.writeParcelable(m0(), i15);
        parcel.writeParcelable(l0(), i15);
        parcel.writeParcelable(y(), i15);
        parcel.writeParcelable(f(), i15);
        parcel.writeParcelable(d0(), i15);
        parcel.writeParcelable(z(), i15);
        parcel.writeParcelable(A(), i15);
        parcel.writeList(s0());
        parcel.writeParcelable(w(), i15);
        parcel.writeParcelable(Z(), i15);
        parcel.writeParcelable(x(), i15);
        parcel.writeParcelable(t(), i15);
        parcel.writeParcelable(L(), i15);
        parcel.writeParcelable(e0(), i15);
        parcel.writeParcelable(B(), i15);
        parcel.writeList(j());
        if (u0() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(u0());
        }
        parcel.writeParcelable(d(), i15);
        parcel.writeParcelable(T(), i15);
    }
}

```

## ii/x6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class x6 implements Parcelable.Creator {
    x6() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return v.b.valueOf((String) zj.p.q(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new v.b[i15];
    }
}

```

## ii/y.java

```java
package ii;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        @SuppressLint({"AmbiguousGranuleClass"})
        public y a() {
            List listJ = j();
            if (listJ != null) {
                i(ak.n0.v(listJ));
            }
            return k();
        }

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(String str);

        @RecentlyNonNull
        public abstract a e(String str);

        @RecentlyNonNull
        public abstract a f(b bVar);

        @RecentlyNonNull
        public abstract a g(Double d15);

        @RecentlyNonNull
        public abstract a h(Double d15);

        @RecentlyNonNull
        public abstract a i(List<String> list);

        abstract List j();

        abstract y k();
    }

    public enum b {
        NEAR,
        WITHIN,
        BESIDE,
        ACROSS_THE_ROAD,
        DOWN_THE_ROAD,
        AROUND_THE_CORNER,
        BEHIND
    }

    @RecentlyNonNull
    public static a a() {
        return new o1();
    }

    @RecentlyNullable
    public abstract String b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract String e();

    @RecentlyNullable
    public abstract b f();

    @RecentlyNullable
    public abstract Double g();

    @RecentlyNullable
    public abstract Double h();

    @RecentlyNullable
    public abstract List<String> i();
}

```

## ii/y0.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract y0 a();

        @RecentlyNonNull
        public abstract a b(a0 a0Var);

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull b0 b0Var);

        @RecentlyNonNull
        public abstract a d(boolean z15);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull p pVar, @RecentlyNonNull b0 b0Var) {
        e3 e3Var = new e3();
        e3Var.e(pVar);
        e3Var.c(b0Var);
        e3Var.d(false);
        return e3Var;
    }

    @RecentlyNonNull
    public static y0 f(@RecentlyNonNull p pVar, @RecentlyNonNull b0 b0Var) {
        return a(pVar, b0Var).a();
    }

    @RecentlyNullable
    public abstract a0 b();

    @RecentlyNonNull
    public abstract p c();

    @RecentlyNonNull
    public abstract b0 d();

    public abstract boolean e();
}

```
