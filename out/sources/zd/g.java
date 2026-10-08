package zd;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b<Object> f234356e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f234357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b<T> f234358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f234359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile byte[] f234360d;

    class a implements b<Object> {
        a() {
        }

        @Override // zd.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t15, MessageDigest messageDigest);
    }

    private g(String str, T t15, b<T> bVar) {
        this.f234359c = ve.k.b(str);
        this.f234357a = t15;
        this.f234358b = (b) ve.k.d(bVar);
    }

    public static <T> g<T> a(String str, T t15, b<T> bVar) {
        return new g<>(str, t15, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) f234356e;
    }

    private byte[] d() {
        if (this.f234360d == null) {
            this.f234360d = this.f234359c.getBytes(f.f234355a);
        }
        return this.f234360d;
    }

    public static <T> g<T> e(String str) {
        return new g<>(str, null, b());
    }

    public static <T> g<T> f(String str, T t15) {
        return new g<>(str, t15, b());
    }

    public T c() {
        return this.f234357a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f234359c.equals(((g) obj).f234359c);
        }
        return false;
    }

    public void g(T t15, MessageDigest messageDigest) {
        this.f234358b.a(d(), t15, messageDigest);
    }

    public int hashCode() {
        return this.f234359c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f234359c + "'}";
    }
}
