# Paczka 136 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/t.java`, `ii/t3.java`, `ii/t4.java`, `ii/t5.java`, `ii/u.java`, `ii/u0.java`, `ii/u3.java`, `ii/u4.java`, `ii/u5.java`, `ii/u6.java`, `ii/v.java`, `ii/v3.java`, `ii/v4.java`, `ii/v5.java`

## ii/t.java

```java
package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends g3 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract t a();

        @RecentlyNonNull
        public abstract a b(o oVar);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(String str);

        @RecentlyNonNull
        public abstract a e(Uri uri);

        @RecentlyNonNull
        public abstract a f(o oVar);

        @RecentlyNonNull
        public abstract a g(o oVar);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull o oVar) {
        e1 e1Var = new e1();
        e1Var.h(oVar);
        return e1Var;
    }

    @RecentlyNullable
    public abstract o b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract Uri e();

    @RecentlyNonNull
    public abstract o f();

    @RecentlyNullable
    public abstract o g();

    @RecentlyNullable
    public abstract o h();
}

```

## ii/t3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class t3 extends j7 {
    public static final Parcelable.Creator<t3> CREATOR = new r3();

    t3(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(b());
        if (d() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(d());
        }
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c());
        }
    }
}

```

## ii/t4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class t4 implements Parcelable.Creator {
    t4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new u4((v.b) parcel.readParcelable(v.class.getClassLoader()), (e0) parcel.readParcelable(v.class.getClassLoader()), (Instant) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new u4[i15];
    }
}

```

## ii/t5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class t5 extends h2 {
    public static final Parcelable.Creator<t5> CREATOR = new s5();

    t5(y0 y0Var, y0 y0Var2) {
        super(y0Var, y0Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(c(), i15);
        parcel.writeParcelable(b(), i15);
    }
}

```

## ii/u.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public u a() {
            c(ak.n0.v(b()));
            return d();
        }

        @RecentlyNonNull
        public abstract List<v> b();

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull List<v> list);

        abstract u d();
    }

    @RecentlyNonNull
    public static u b(@RecentlyNonNull List<v> list) {
        g1 g1Var = new g1();
        g1Var.c(list);
        return g1Var.a();
    }

    @RecentlyNonNull
    public abstract List<v> a();
}

```

## ii/u0.java

```java
package ii;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u0 implements Parcelable {

    @SuppressLint({"AmbiguousGranuleClass"})
    public static abstract class a {
        @RecentlyNonNull
        public abstract u0 a();

        @RecentlyNonNull
        public u0 b() {
            e(ak.n0.v(c()));
            return a();
        }

        @RecentlyNonNull
        public abstract List<z> c();

        @RecentlyNonNull
        public abstract a d(Uri uri);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull List<z> list);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull List<z> list) {
        y2 y2Var = new y2();
        y2Var.e(list);
        return y2Var;
    }

    @RecentlyNullable
    public abstract Uri b();

    @RecentlyNonNull
    public abstract List<z> c();
}

```

## ii/u3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class u3 implements Parcelable.Creator {
    u3() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new v3(parcel.readArrayList(g.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new v3[i15];
    }
}

```

## ii/u4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class u4 extends j1 {
    public static final Parcelable.Creator<u4> CREATOR = new t4();

    u4(v.b bVar, e0 e0Var, Instant instant) {
        super(bVar, e0Var, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(a(), i15);
        parcel.writeSerializable(c());
    }
}

```

## ii/u5.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class u5 implements Parcelable.Creator {
    u5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new v5(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (g) parcel.readParcelable(k0.class.getClassLoader()), (Uri) parcel.readParcelable(k0.class.getClassLoader()), (Uri) parcel.readParcelable(k0.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new v5[i15];
    }
}

```

## ii/u6.java

```java
package ii;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u6 implements Parcelable {
    public static t6 c() {
        return new n7();
    }

    abstract int a();

    abstract int b();
}

```

## ii/v.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract v a();

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull e0 e0Var);

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull Instant instant);
    }

    public enum b implements Parcelable {
        FUEL_TYPE_UNSPECIFIED,
        DIESEL,
        REGULAR_UNLEADED,
        MIDGRADE,
        PREMIUM,
        SP91,
        SP91_E10,
        SP92,
        SP95,
        SP95_E10,
        SP98,
        SP99,
        SP100,
        LPG,
        E80,
        E85,
        METHANE,
        BIO_DIESEL,
        TRUCK_DIESEL;


        @RecentlyNonNull
        public static final Parcelable.Creator<b> CREATOR = new x6();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i15) {
            parcel.writeString(name());
        }
    }

    @RecentlyNonNull
    public static v d(@RecentlyNonNull b bVar, @RecentlyNonNull e0 e0Var, @RecentlyNonNull Instant instant) {
        i1 i1Var = new i1();
        i1Var.d(bVar);
        i1Var.b(e0Var);
        i1Var.c(instant);
        return i1Var.a();
    }

    @RecentlyNonNull
    public abstract e0 a();

    @RecentlyNonNull
    public abstract b b();

    @RecentlyNonNull
    public abstract Instant c();
}

```

## ii/v3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class v3 extends k7 {
    public static final Parcelable.Creator<v3> CREATOR = new u3();

    v3(List list) {
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

## ii/v4.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class v4 implements Parcelable.Creator {
    v4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new w4(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Uri) parcel.readParcelable(w.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new w4[i15];
    }
}

```

## ii/v5.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class v5 extends j2 {
    public static final Parcelable.Creator<v5> CREATOR = new u5();

    v5(String str, int i15, int i16, String str2, String str3, g gVar, Uri uri, Uri uri2) {
        super(str, i15, i16, str2, str3, gVar, uri, uri2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(b());
        parcel.writeInt(f());
        parcel.writeInt(g());
        parcel.writeString(h());
        if (i() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(i());
        }
        parcel.writeParcelable(c(), i15);
        parcel.writeParcelable(d(), i15);
        parcel.writeParcelable(e(), i15);
    }
}

```
