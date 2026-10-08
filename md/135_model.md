# Paczka 135 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/q4.java`, `ii/q5.java`, `ii/q6.java`, `ii/r.java`, `ii/r0.java`, `ii/r3.java`, `ii/r4.java`, `ii/r5.java`, `ii/r6.java`, `ii/s0.java`, `ii/s4.java`, `ii/s5.java`, `ii/s6.java`

## ii/q4.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class q4 extends f1 {
    public static final Parcelable.Creator<q4> CREATOR = new p4();

    q4(o oVar, o oVar2, o oVar3, o oVar4, Uri uri, String str, String str2) {
        super(oVar, oVar2, oVar3, oVar4, uri, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(f(), i15);
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(g(), i15);
        parcel.writeParcelable(h(), i15);
        parcel.writeParcelable(e(), i15);
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c());
        }
        if (d() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(d());
        }
    }
}

```

## ii/q5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class q5 implements Parcelable.Creator {
    q5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new r5((l0.a) parcel.readParcelable(i0.class.getClassLoader()), (l0.a) parcel.readParcelable(i0.class.getClassLoader()), (l0.a) parcel.readParcelable(i0.class.getClassLoader()), (l0.a) parcel.readParcelable(i0.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new r5[i15];
    }
}

```

## ii/q6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class q6 extends d3 {
    public static final Parcelable.Creator<q6> CREATOR = new p6();

    q6(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(a());
        parcel.writeString(b());
    }
}

```

## ii/r.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public enum r implements Parcelable {
    EV_CONNECTOR_TYPE_UNSPECIFIED,
    EV_CONNECTOR_TYPE_OTHER,
    EV_CONNECTOR_TYPE_J1772,
    EV_CONNECTOR_TYPE_TYPE_2,
    EV_CONNECTOR_TYPE_CHADEMO,
    EV_CONNECTOR_TYPE_CCS_COMBO_1,
    EV_CONNECTOR_TYPE_CCS_COMBO_2,
    EV_CONNECTOR_TYPE_TESLA,
    EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T,
    EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET,
    EV_CONNECTOR_TYPE_NACS;


    @RecentlyNonNull
    public static final Parcelable.Creator<r> CREATOR = new Parcelable.Creator() { // from class: ii.w6
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return r.valueOf((String) zj.p.q(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i15) {
            return new r[i15];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i15) {
        parcel.writeString(name());
    }
}

```

## ii/r0.java

```java
package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public r0 a() {
            Double dH = l().h();
            boolean z15 = false;
            if (dH.doubleValue() >= 1.0d && dH.doubleValue() <= 5.0d) {
                z15 = true;
            }
            zj.p.l(z15, "Rating must between 1.0 and 5.0 (inclusive), but was: %s.", dH);
            return l();
        }

        @RecentlyNonNull
        public abstract a b(Uri uri);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(String str);

        @RecentlyNonNull
        public abstract a e(String str);

        @RecentlyNonNull
        public abstract a f(String str);

        @RecentlyNonNull
        public abstract a g(String str);

        @RecentlyNonNull
        public abstract a h(String str);

        @RecentlyNonNull
        public abstract a i(a0 a0Var);

        abstract a j(f fVar);

        abstract a k(String str);

        abstract r0 l();
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Double d15, @RecentlyNonNull f fVar) {
        String strE = zj.v.e(fVar.d());
        if (strE.startsWith("//")) {
            strE = "https:".concat(strE);
        }
        com.google.android.libraries.places.internal.o oVar = new com.google.android.libraries.places.internal.o("a");
        int i15 = com.google.android.libraries.places.internal.r.f33475d;
        oVar.a(com.google.android.libraries.places.internal.r.a(strE, com.google.android.libraries.places.internal.q.f33370b));
        oVar.b(fVar.b());
        com.google.android.libraries.places.internal.n nVarC = oVar.c();
        t2 t2Var = new t2();
        t2Var.m(d15);
        t2Var.j(fVar);
        t2Var.k(nVarC.a());
        return t2Var;
    }

    @RecentlyNonNull
    public abstract String b();

    @RecentlyNonNull
    public abstract f c();

    @RecentlyNullable
    public abstract Uri d();

    @RecentlyNullable
    public abstract String e();

    @RecentlyNullable
    public abstract String f();

    @RecentlyNullable
    public abstract String g();

    @RecentlyNonNull
    public abstract Double h();

    @RecentlyNullable
    public abstract String i();

    @RecentlyNullable
    public abstract String j();

    @RecentlyNullable
    public abstract String k();

    @RecentlyNullable
    public abstract a0 l();
}

```

## ii/r3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class r3 implements Parcelable.Creator {
    r3() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new t3(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new t3[i15];
    }
}

```

## ii/r4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class r4 implements Parcelable.Creator {
    r4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new s4(parcel.readArrayList(u.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new s4[i15];
    }
}

```

## ii/r5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class r5 extends f2 {
    public static final Parcelable.Creator<r5> CREATOR = new q5();

    r5(l0.a aVar, l0.a aVar2, l0.a aVar3, l0.a aVar4) {
        super(aVar, aVar2, aVar3, aVar4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(c(), i15);
        parcel.writeParcelable(d(), i15);
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(e(), i15);
    }
}

```

## ii/r6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class r6 implements Parcelable.Creator {
    r6() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new s6((a0) parcel.readParcelable(y0.class.getClassLoader()), (p) parcel.readParcelable(y0.class.getClassLoader()), (b0) parcel.readParcelable(y0.class.getClassLoader()), parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new s6[i15];
    }
}

```

## ii/s0.java

```java
package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s0 extends g3 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract s0 a();

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(Uri uri);

        @RecentlyNonNull
        public abstract a e(Uri uri);

        @RecentlyNonNull
        public abstract a f(String str);

        @RecentlyNonNull
        public abstract a g(String str);
    }

    @RecentlyNonNull
    public static a a() {
        return new v2();
    }

    @RecentlyNullable
    public abstract String b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract Uri d();

    @RecentlyNullable
    public abstract Uri e();

    @RecentlyNullable
    public abstract String f();

    @RecentlyNullable
    public abstract String g();
}

```

## ii/s4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class s4 extends h1 {
    public static final Parcelable.Creator<s4> CREATOR = new r4();

    s4(List list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeList(a());
    }
}

```

## ii/s5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class s5 implements Parcelable.Creator {
    s5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new t5((y0) parcel.readParcelable(j0.class.getClassLoader()), (y0) parcel.readParcelable(j0.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new t5[i15];
    }
}

```

## ii/s6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class s6 extends f3 {
    public static final Parcelable.Creator<s6> CREATOR = new r6();

    s6(a0 a0Var, p pVar, b0 b0Var, boolean z15) {
        super(a0Var, pVar, b0Var, z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(c(), i15);
        parcel.writeParcelable(d(), i15);
        parcel.writeInt(e() ? 1 : 0);
    }
}

```
