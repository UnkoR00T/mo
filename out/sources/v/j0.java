package v;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface j0 extends o.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f202614a = new b();

    class a implements u.m {
        a() {
        }

        @Override // u.m
        public com.google.common.util.concurrent.q<Void> a() {
            return a0.f.h(null);
        }

        @Override // u.m
        public com.google.common.util.concurrent.q<Void> b() {
            return a0.f.h(null);
        }
    }

    class b implements j0 {
        b() {
        }

        @Override // v.j0
        public void a() {
        }

        @Override // v.j0
        public void b(j3.b bVar) {
        }

        @Override // v.j0
        public void c(p1 p1Var) {
        }

        @Override // v.j0
        public com.google.common.util.concurrent.q<List<Void>> e(List<n1> list, int i15, int i16) {
            return a0.f.h(Collections.EMPTY_LIST);
        }

        @Override // o.j
        public com.google.common.util.concurrent.q<Void> f(float f15) {
            return a0.f.h(null);
        }

        @Override // v.j0
        public void g(int i15) {
        }

        @Override // v.j0
        public p1 h() {
            return null;
        }

        @Override // v.j0
        public void j() {
        }
    }

    void a();

    void b(j3.b bVar);

    void c(p1 p1Var);

    default void d(o.t0.j jVar) {
    }

    com.google.common.util.concurrent.q<List<Void>> e(List<n1> list, int i15, int i16);

    void g(int i15);

    p1 h();

    default com.google.common.util.concurrent.q<u.m> i(int i15, int i16) {
        return a0.f.h(new a());
    }

    void j();
}
