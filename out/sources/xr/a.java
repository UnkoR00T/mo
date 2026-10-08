package xr;

import java.util.Collection;
import pq.v;
import st.t0;
import vr.e;
import vr.g1;
import zs.f;

/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: xr.a$a, reason: collision with other inner class name */
    public static final class C5895a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5895a f220525a = new C5895a();

        private C5895a() {
        }

        @Override // xr.a
        public Collection<vr.d> a(e eVar) {
            return v.n();
        }

        @Override // xr.a
        public Collection<g1> c(f fVar, e eVar) {
            return v.n();
        }

        @Override // xr.a
        public Collection<f> d(e eVar) {
            return v.n();
        }

        @Override // xr.a
        public Collection<t0> e(e eVar) {
            return v.n();
        }
    }

    Collection<vr.d> a(e eVar);

    Collection<g1> c(f fVar, e eVar);

    Collection<f> d(e eVar);

    Collection<t0> e(e eVar);
}
