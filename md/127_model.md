# Paczka 127 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/b.java`, `ii/b0.java`, `ii/b4.java`, `ii/b5.java`, `ii/b6.java`, `ii/c.java`, `ii/c4.java`, `ii/c5.java`, `ii/c6.java`, `ii/d.java`, `ii/d4.java`, `ii/d5.java`

## ii/b.java

```java
package ii;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public b a() {
            b bVarD = d();
            zj.p.e(!bVarD.b().isEmpty(), "Name must not be empty.");
            List<String> listD = bVarD.d();
            Iterator<String> it = listD.iterator();
            while (it.hasNext()) {
                zj.p.e(!TextUtils.isEmpty(it.next()), "Types must not contain null or empty values.");
            }
            c(ak.n0.v(listD));
            return d();
        }

        @RecentlyNonNull
        public abstract a b(String str);

        abstract a c(List list);

        abstract b d();
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull String str, @RecentlyNonNull List<String> list) {
        w2 w2Var = new w2();
        w2Var.e(str);
        w2Var.c(list);
        return w2Var;
    }

    @RecentlyNonNull
    public abstract String b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNonNull
    public abstract List<String> d();
}

```

## ii/b0.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 implements Parcelable, Comparable<b0> {
    @RecentlyNonNull
    public static b0 j(int i15, int i16) {
        try {
            t1 t1Var = new t1();
            t1Var.c(i15);
            t1Var.a(i16);
            b0 b0VarB = t1Var.b();
            int iE = b0VarB.e();
            zj.p.z(ak.q1.d(0, 23).g(Integer.valueOf(iE)), "Hours must not be out-of-range: 0 to 23, but was: %s.", iE);
            int iG = b0VarB.g();
            zj.p.z(ak.q1.d(0, 59).g(Integer.valueOf(iG)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", iG);
            return b0VarB;
        } catch (IllegalStateException e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@RecentlyNonNull b0 b0Var) {
        int iE;
        int iE2;
        zj.p.r(b0Var, "compare must not be null.");
        if (this == b0Var) {
            return 0;
        }
        if (e() == b0Var.e()) {
            iE = g();
            iE2 = b0Var.g();
        } else {
            iE = e();
            iE2 = b0Var.e();
        }
        return iE - iE2;
    }

    public abstract int e();

    public abstract int g();
}

```

## ii/b4.java

```java
package ii;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class b4 extends p7 {
    public static final Parcelable.Creator<b4> CREATOR = new a4();

    b4(ParcelUuid parcelUuid) {
        super(parcelUuid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
    }
}

```

## ii/b5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
final class b5 implements Parcelable.Creator {
    b5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new c5((Duration) parcel.readSerializable(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new c5[i15];
    }
}

```

## ii/b6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class b6 extends o2 {
    public static final Parcelable.Creator<b6> CREATOR = new a6();

    b6(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(b());
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

## ii/c.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements Parcelable {
    @RecentlyNonNull
    public static c b(@RecentlyNonNull List<b> list) {
        return new m3(list);
    }

    @RecentlyNonNull
    public abstract List<b> a();
}

```

## ii/c4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class c4 implements Parcelable.Creator {
    c4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new d4((r) parcel.readParcelable(k.class.getClassLoader()), Double.valueOf(parcel.readDouble()), Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new d4[i15];
    }
}

```

## ii/c5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
final class c5 extends q1 {
    public static final Parcelable.Creator<c5> CREATOR = new b5();

    c5(Duration duration, int i15) {
        super(duration, i15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeSerializable(b());
        parcel.writeInt(a());
    }
}

```

## ii/c6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class c6 implements Parcelable.Creator {
    c6() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new d6(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(o0.class.getClassLoader()), parcel.readArrayList(o0.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new d6[i15];
    }
}

```

## ii/d.java

```java
package ii;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        @SuppressLint({"AmbiguousGranuleClass"})
        public d a() {
            List listD = d();
            if (listD != null) {
                c(ak.n0.v(listD));
            }
            List listE = e();
            if (listE != null) {
                b(ak.n0.v(listE));
            }
            return f();
        }

        @RecentlyNonNull
        public abstract a b(List<e> list);

        @RecentlyNonNull
        public abstract a c(List<y> list);

        abstract List d();

        abstract List e();

        abstract d f();
    }

    @RecentlyNonNull
    public static a a() {
        return new o5();
    }

    @RecentlyNullable
    public abstract List<e> b();

    @RecentlyNullable
    public abstract List<y> c();
}

```

## ii/d4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class d4 extends r7 {
    public static final Parcelable.Creator<d4> CREATOR = new c4();

    d4(r rVar, Double d15, Integer num, Integer num2, Integer num3, Instant instant) {
        super(rVar, d15, num, num2, num3, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(g(), i15);
        parcel.writeDouble(e().doubleValue());
        parcel.writeInt(d().intValue());
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(c().intValue());
        }
        if (f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(f().intValue());
        }
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(b());
        }
    }
}

```

## ii/d5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class d5 implements Parcelable.Creator {
    d5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new e5(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new e5[i15];
    }
}

```
