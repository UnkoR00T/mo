package h8;

import android.os.Handler;
import b8.e2;

/* JADX INFO: loaded from: classes3.dex */
public interface c0 {

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f81467a = k0.f81621b;

        default a a(l9.s.a aVar) {
            return this;
        }

        default a b(int i15) {
            return this;
        }

        a c(d8.w wVar);

        c0 d(t7.s sVar);

        a e(k8.j jVar);

        @Deprecated
        default a f(boolean z15) {
            return this;
        }

        default a g(zj.w<l8.a> wVar) {
            return this;
        }

        default a h(k8.e eVar) {
            return this;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f81468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f81471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f81472e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f81468a.equals(obj) ? this : new b(obj, this.f81469b, this.f81470c, this.f81471d, this.f81472e);
        }

        public boolean b() {
            return this.f81469b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f81468a.equals(bVar.f81468a) && this.f81469b == bVar.f81469b && this.f81470c == bVar.f81470c && this.f81471d == bVar.f81471d && this.f81472e == bVar.f81472e;
        }

        public int hashCode() {
            return ((((((((527 + this.f81468a.hashCode()) * 31) + this.f81469b) * 31) + this.f81470c) * 31) + ((int) this.f81471d)) * 31) + this.f81472e;
        }

        public b(Object obj, long j15) {
            this(obj, -1, -1, j15, -1);
        }

        public b(Object obj, long j15, int i15) {
            this(obj, -1, -1, j15, i15);
        }

        public b(Object obj, int i15, int i16, long j15) {
            this(obj, i15, i16, j15, -1);
        }

        private b(Object obj, int i15, int i16, long j15, int i17) {
            this.f81468a = obj;
            this.f81469b = i15;
            this.f81470c = i16;
            this.f81471d = j15;
            this.f81472e = i17;
        }
    }

    public interface c {
        void a(c0 c0Var, t7.e0 e0Var);
    }

    void a(Handler handler, d8.t tVar);

    t7.s b();

    default void c(t7.s sVar) {
    }

    void d(c cVar, y7.x xVar, e2 e2Var);

    b0 e(b bVar, k8.b bVar2, long j15);

    void f(d8.t tVar);

    void g(c cVar);

    void h(c cVar);

    void i(c cVar);

    void j();

    default boolean k() {
        return true;
    }

    void l(j0 j0Var);

    default t7.e0 m() {
        return null;
    }

    void n(Handler handler, j0 j0Var);

    void p(b0 b0Var);
}
