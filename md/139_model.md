# Paczka 139 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/y3.java`, `ii/y4.java`, `ii/y5.java`, `ii/z.java`, `ii/z3.java`, `ii/z4.java`, `ii/z5.java`, `il/f.java`, `jg/a0.java`

## ii/y3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class y3 implements Parcelable.Creator {
    y3() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new z3(parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new z3[i15];
    }
}

```

## ii/y4.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class y4 extends n1 {
    public static final Parcelable.Creator<y4> CREATOR = new x4();

    y4(Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5) {
        super(uri, uri2, uri3, uri4, uri5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(d(), i15);
        parcel.writeParcelable(f(), i15);
        parcel.writeParcelable(e(), i15);
        parcel.writeParcelable(c(), i15);
    }
}

```

## ii/y5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class y5 implements Parcelable.Creator {
    y5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new z5((l0) parcel.readParcelable(m0.class.getClassLoader()), parcel.readDouble());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new z5[i15];
    }
}

```

## ii/z.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z implements Parcelable {
    @RecentlyNonNull
    public static z c(@RecentlyNonNull Duration duration, int i15) {
        return new c5(duration, i15);
    }

    public abstract int a();

    @RecentlyNonNull
    public abstract Duration b();
}

```

## ii/z3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class z3 extends o7 {
    public static final Parcelable.Creator<z3> CREATOR = new y3();

    z3(int i15, int i16) {
        super(i15, i16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(a());
        parcel.writeInt(b());
    }
}

```

## ii/z4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class z4 implements Parcelable.Creator {
    z4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new a5(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(y.class.getClassLoader()), parcel.readInt() == 0 ? (y.b) Enum.valueOf(y.b.class, parcel.readString()) : null, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new a5[i15];
    }
}

```

## ii/z5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class z5 extends m2 {
    public static final Parcelable.Creator<z5> CREATOR = new y5();

    z5(l0 l0Var, double d15) {
        super(l0Var, d15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
        parcel.writeDouble(a());
    }
}

```

## il/f.java

```java
package il;

import android.content.Context;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import yk.d0;
import yk.w;

/* JADX INFO: loaded from: classes4.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kl.b<q> f93234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f93235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kl.b<tl.i> f93236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<g> f93237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f93238e;

    private f(final Context context, final String str, Set<g> set, kl.b<tl.i> bVar, Executor executor) {
        this(new w(new kl.b() { // from class: il.d
            @Override // kl.b
            public final Object get() {
                return f.d(context, str);
            }
        }), set, executor, bVar, context);
    }

    public static /* synthetic */ String c(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                q qVar = fVar.f93234a.get();
                List<r> listG = qVar.g();
                qVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i15 = 0; i15 < listG.size(); i15++) {
                    r rVar = listG.get(i15);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", rVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) rVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th4) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                throw th8;
            }
        }
        return string;
    }

    public static /* synthetic */ q d(Context context, String str) {
        return new q(context, str);
    }

    public static /* synthetic */ f e(d0 d0Var, yk.d dVar) {
        return new f((Context) dVar.a(Context.class), ((vk.e) dVar.a(vk.e.class)).n(), (Set<g>) dVar.c(g.class), (kl.b<tl.i>) dVar.d(tl.i.class), (Executor) dVar.b(d0Var));
    }

    public static /* synthetic */ Void f(f fVar) {
        synchronized (fVar) {
            fVar.f93234a.get().o(System.currentTimeMillis(), fVar.f93236c.get().a());
        }
        return null;
    }

    public static yk.c<f> g() {
        final d0 d0VarA = d0.a(xk.a.class, Executor.class);
        return yk.c.d(f.class, i.class, j.class).b(yk.q.j(Context.class)).b(yk.q.j(vk.e.class)).b(yk.q.m(g.class)).b(yk.q.l(tl.i.class)).b(yk.q.k(d0VarA)).e(new yk.g() { // from class: il.c
            @Override // yk.g
            public final Object a(yk.d dVar) {
                return f.e(d0VarA, dVar);
            }
        }).d();
    }

    @Override // il.i
    public vh.l<String> a() {
        return !e6.m.a(this.f93235b) ? vh.o.f("") : vh.o.c(this.f93238e, new Callable() { // from class: il.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.c(this.f93233a);
            }
        });
    }

    @Override // il.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        q qVar = this.f93234a.get();
        if (!qVar.m(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        qVar.k();
        return j.a.GLOBAL;
    }

    public vh.l<Void> h() {
        if (this.f93237d.size() > 0 && e6.m.a(this.f93235b)) {
            return vh.o.c(this.f93238e, new Callable() { // from class: il.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return f.f(this.f93229a);
                }
            });
        }
        return vh.o.f(null);
    }

    f(kl.b<q> bVar, Set<g> set, Executor executor, kl.b<tl.i> bVar2, Context context) {
        this.f93234a = bVar;
        this.f93237d = set;
        this.f93238e = executor;
        this.f93236c = bVar2;
        this.f93235b = context;
    }
}

```

## jg/a0.java

```java
package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Parcelable.Creator {
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
        return new d(iV, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new d[i15];
    }
}

```
