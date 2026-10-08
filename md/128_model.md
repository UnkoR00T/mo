# Paczka 128 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/d6.java`, `ii/d7.java`, `ii/e.java`, `ii/e0.java`, `ii/e4.java`, `ii/e5.java`, `ii/e6.java`, `ii/e7.java`, `ii/f.java`, `ii/f0.java`, `ii/f4.java`, `ii/f5.java`, `ii/f6.java`, `ii/f7.java`

## ii/d6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class d6 extends q2 {
    public static final Parcelable.Creator<d6> CREATOR = new c6();

    d6(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, String str8) {
        super(str, str2, str3, str4, str5, str6, str7, list, list2, str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(i());
        if (d() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(d());
        }
        if (g() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(g());
        }
        if (j() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(j());
        }
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c());
        }
        if (e() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(e());
        }
        if (k() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(k());
        }
        parcel.writeList(b());
        parcel.writeList(h());
        if (f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(f());
        }
    }
}

```

## ii/d7.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class d7 implements Parcelable.Creator {
    d7() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return l0.a.valueOf((String) zj.p.q(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new l0.a[i15];
    }
}

```

## ii/e.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract e a();

        @RecentlyNonNull
        public abstract a b(b bVar);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(String str);

        @RecentlyNonNull
        public abstract a e(String str);

        @RecentlyNonNull
        public abstract a f(String str);
    }

    public enum b {
        CONTAINMENT_UNSPECIFIED,
        WITHIN,
        OUTSKIRTS,
        NEAR
    }

    @RecentlyNonNull
    public static a a() {
        return new g7();
    }

    @RecentlyNullable
    public abstract b b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract String e();

    @RecentlyNullable
    public abstract String f();
}

```

## ii/e0.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public e0 a() {
            long jLongValue = c().longValue();
            Integer numB = b();
            if (jLongValue > 0) {
                zj.p.l(numB.intValue() >= 0, "Unit is positive and nano must be positive or zero, but was: %s.", numB);
            } else if (jLongValue < 0) {
                zj.p.l(numB.intValue() <= 0, "Unit is negative and nano must be negative or zero, but was: %s.", numB);
            }
            return f();
        }

        @RecentlyNonNull
        public abstract Integer b();

        @RecentlyNonNull
        public abstract Long c();

        @RecentlyNonNull
        public abstract a d(@RecentlyNonNull Integer num);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull Long l15);

        abstract e0 f();
    }

    @RecentlyNonNull
    public static e0 d(@RecentlyNonNull String str, @RecentlyNonNull Long l15, @RecentlyNonNull Integer num) {
        v1 v1Var = new v1();
        v1Var.g(str);
        v1Var.e(l15);
        v1Var.d(num);
        return v1Var.a();
    }

    @RecentlyNonNull
    public abstract String a();

    @RecentlyNonNull
    public abstract Integer b();

    @RecentlyNonNull
    public abstract Long c();
}

```

## ii/e4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class e4 implements Parcelable.Creator {
    e4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new f4(parcel.readInt() == 0 ? parcel.readString() : null, (m) parcel.readParcelable(l.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new f4[i15];
    }
}

```

## ii/e5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class e5 extends s1 {
    public static final Parcelable.Creator<e5> CREATOR = new d5();

    e5(int i15, int i16, int i17) {
        super(i15, i16, i17);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(j());
        parcel.writeInt(g());
        parcel.writeInt(e());
    }
}

```

## ii/e6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class e6 implements Parcelable.Creator {
    e6() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new f6((e0) parcel.readParcelable(p0.class.getClassLoader()), (e0) parcel.readParcelable(p0.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new f6[i15];
    }
}

```

## ii/e7.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class e7 implements Parcelable.Creator {
    e7() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return l0.c.valueOf((String) zj.p.q(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new l0.c[i15];
    }
}

```

## ii/f.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public f a() {
            zj.p.e(!d().b().isEmpty(), "Name must not be empty.");
            return d();
        }

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(String str);

        abstract f d();
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull String str) {
        i7 i7Var = new i7();
        i7Var.e(str);
        return i7Var;
    }

    @RecentlyNonNull
    public abstract String b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();
}

```

## ii/f0.java

```java
package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 extends g3 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract f0 a();

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
    }

    @RecentlyNonNull
    public static a a() {
        return new y1();
    }

    @RecentlyNullable
    public abstract o b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract Uri e();

    @RecentlyNullable
    public abstract o f();
}

```

## ii/f4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class f4 extends t7 {
    public static final Parcelable.Creator<f4> CREATOR = new e4();

    f4(String str, m mVar, String str2) {
        super(str, mVar, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        if (d() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(d());
        }
        parcel.writeParcelable(b(), i15);
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c());
        }
    }
}

```

## ii/f5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class f5 implements Parcelable.Creator {
    f5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new g5(parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new g5[i15];
    }
}

```

## ii/f6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class f6 extends s2 {
    public static final Parcelable.Creator<f6> CREATOR = new e6();

    f6(e0 e0Var, e0 e0Var2) {
        super(e0Var, e0Var2);
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

## ii/f7.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class f7 implements Parcelable.Creator {
    f7() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return l0.d.valueOf((String) zj.p.q(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new l0.d[i15];
    }
}

```
