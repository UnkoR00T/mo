package we;

import android.util.Log;
import i6.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g<Object> f212544a = new C5605a();

    /* JADX INFO: renamed from: we.a$a, reason: collision with other inner class name */
    class C5605a implements g<Object> {
        C5605a() {
        }

        @Override // we.a.g
        public void a(Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> implements d<List<T>> {
        b() {
        }

        @Override // we.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> implements g<List<T>> {
        c() {
        }

        @Override // we.a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List<T> list) {
            list.clear();
        }
    }

    public interface d<T> {
        T a();
    }

    private static final class e<T> implements i6.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<T> f212545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g<T> f212546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i6.f<T> f212547c;

        e(i6.f<T> fVar, d<T> dVar, g<T> gVar) {
            this.f212547c = fVar;
            this.f212545a = dVar;
            this.f212546b = gVar;
        }

        @Override // i6.f
        public boolean A(T t15) {
            if (t15 instanceof f) {
                ((f) t15).b().b(true);
            }
            this.f212546b.a(t15);
            return this.f212547c.A(t15);
        }

        @Override // i6.f
        public T z() {
            T tZ = this.f212547c.z();
            if (tZ == null) {
                tZ = this.f212545a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    tZ.getClass().toString();
                }
            }
            if (tZ instanceof f) {
                ((f) tZ).b().b(false);
            }
            return tZ;
        }
    }

    public interface f {
        we.c b();
    }

    public interface g<T> {
        void a(T t15);
    }

    private static <T extends f> i6.f<T> a(i6.f<T> fVar, d<T> dVar) {
        return b(fVar, dVar, c());
    }

    private static <T> i6.f<T> b(i6.f<T> fVar, d<T> dVar, g<T> gVar) {
        return new e(fVar, dVar, gVar);
    }

    private static <T> g<T> c() {
        return (g<T>) f212544a;
    }

    public static <T extends f> i6.f<T> d(int i15, d<T> dVar) {
        return a(new h(i15), dVar);
    }

    public static <T> i6.f<List<T>> e() {
        return f(20);
    }

    public static <T> i6.f<List<T>> f(int i15) {
        return b(new h(i15), new b(), new c());
    }
}
