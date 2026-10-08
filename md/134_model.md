# Paczka 134 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/o.java`, `ii/o0.java`, `ii/o3.java`, `ii/o6.java`, `ii/p.java`, `ii/p0.java`, `ii/p3.java`, `ii/p4.java`, `ii/p5.java`, `ii/p6.java`, `ii/q.java`, `ii/q3.java`

## ii/o.java

```java
package ii;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        @SuppressLint({"AmbiguousGranuleClass"})
        public o a() {
            List listF = f();
            if (listF != null) {
                e(ak.n0.v(listF));
            }
            List listG = g();
            if (listG != null) {
                d(ak.n0.v(listG));
            }
            return h();
        }

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(List<String> list);

        @RecentlyNonNull
        public abstract a e(List<String> list);

        abstract List f();

        abstract List g();

        abstract o h();
    }

    @RecentlyNonNull
    public static a a() {
        return new a1();
    }

    @RecentlyNullable
    public abstract String b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract List<String> d();

    @RecentlyNullable
    public abstract List<String> e();
}

```

## ii/o0.java

```java
package ii;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 implements Parcelable {

    @SuppressLint({"AmbiguousGranuleClass"})
    public static abstract class a {
        @RecentlyNonNull
        public o0 a() {
            List listK = k();
            if (listK != null) {
                b(ak.n0.v(listK));
            }
            List listL = l();
            if (listL != null) {
                h(ak.n0.v(listL));
            }
            return m();
        }

        @RecentlyNonNull
        public abstract a b(List<String> list);

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
        public abstract a h(List<String> list);

        @RecentlyNonNull
        public abstract a i(String str);

        @RecentlyNonNull
        public abstract a j(String str);

        abstract List k();

        abstract List l();

        abstract o0 m();
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull String str) {
        p2 p2Var = new p2();
        p2Var.n(str);
        return p2Var;
    }

    @RecentlyNullable
    public abstract List<String> b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract String e();

    @RecentlyNullable
    public abstract String f();

    @RecentlyNullable
    public abstract String g();

    @RecentlyNullable
    public abstract List<String> h();

    @RecentlyNonNull
    public abstract String i();

    @RecentlyNullable
    public abstract String j();

    @RecentlyNullable
    public abstract String k();
}

```

## ii/o3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class o3 extends k6 {
    public static final Parcelable.Creator<o3> CREATOR = new n3();

    o3(List list, List list2) {
        super(list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeList(c());
        parcel.writeList(b());
    }
}

```

## ii/o6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class o6 extends b3 {
    public static final Parcelable.Creator<o6> CREATOR = new n6();

    o6(a0 a0Var, boolean z15) {
        super(a0Var, z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
        parcel.writeInt(c() ? 1 : 0);
    }
}

```

## ii/p.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public enum p implements Parcelable {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;


    @RecentlyNonNull
    public static final Parcelable.Creator<p> CREATOR = new Parcelable.Creator() { // from class: ii.v6
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            p pVar = p.SUNDAY;
            return p.valueOf((String) zj.p.q(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i15) {
            return new p[i15];
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

## ii/p0.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract p0 a();

        @RecentlyNonNull
        public abstract a b(e0 e0Var);

        @RecentlyNonNull
        public abstract a c(e0 e0Var);
    }

    @RecentlyNonNull
    public static a a() {
        return new r2();
    }

    @RecentlyNullable
    public abstract e0 b();

    @RecentlyNullable
    public abstract e0 c();
}

```

## ii/p3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class p3 implements Parcelable.Creator {
    p3() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new q3(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? (e.b) Enum.valueOf(e.b.class, parcel.readString()) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new q3[i15];
    }
}

```

## ii/p4.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class p4 implements Parcelable.Creator {
    p4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new q4((o) parcel.readParcelable(t.class.getClassLoader()), (o) parcel.readParcelable(t.class.getClassLoader()), (o) parcel.readParcelable(t.class.getClassLoader()), (o) parcel.readParcelable(t.class.getClassLoader()), (Uri) parcel.readParcelable(t.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new q4[i15];
    }
}

```

## ii/p5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class p5 extends d2 {
    public static final Parcelable.Creator<p5> CREATOR = new n5();

    p5(l0.a aVar, l0.a aVar2, l0.a aVar3, l0.a aVar4, l0.a aVar5, l0.a aVar6, l0.a aVar7) {
        super(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(c(), i15);
        parcel.writeParcelable(f(), i15);
        parcel.writeParcelable(d(), i15);
        parcel.writeParcelable(g(), i15);
        parcel.writeParcelable(h(), i15);
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(e(), i15);
    }
}

```

## ii/p6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class p6 implements Parcelable.Creator {
    p6() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new q6(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new q6[i15];
    }
}

```

## ii/q.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract q a();

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull List<k> list);
    }

    @RecentlyNonNull
    public static q c(@RecentlyNonNull Integer num, @RecentlyNonNull List<k> list) {
        c1 c1Var = new c1();
        c1Var.c(num);
        c1Var.b(list);
        return c1Var.a();
    }

    @RecentlyNonNull
    public abstract List<k> a();

    @RecentlyNonNull
    public abstract Integer b();
}

```

## ii/q3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class q3 extends h7 {
    public static final Parcelable.Creator<q3> CREATOR = new p3();

    q3(String str, String str2, String str3, String str4, e.b bVar) {
        super(str, str2, str3, str4, bVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        if (f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(f());
        }
        if (e() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(e());
        }
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
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(b().name());
        }
    }
}

```
