package lt;

import java.util.Collection;
import java.util.Set;
import pq.e1;
import vr.g1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public interface k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f120129a = a.f120130a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f120130a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final er.l<zs.f, Boolean> f120131b = j.f120128a;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean a(zs.f fVar) {
            return true;
        }

        public final er.l<zs.f, Boolean> c() {
            return f120131b;
        }
    }

    public static final class b extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f120132b = new b();

        private b() {
        }

        @Override // lt.l, lt.k
        public Set<zs.f> b() {
            return e1.e();
        }

        @Override // lt.l, lt.k
        public Set<zs.f> d() {
            return e1.e();
        }

        @Override // lt.l, lt.k
        public Set<zs.f> g() {
            return e1.e();
        }
    }

    Collection<? extends g1> a(zs.f fVar, ds.b bVar);

    Set<zs.f> b();

    Collection<? extends z0> c(zs.f fVar, ds.b bVar);

    Set<zs.f> d();

    Set<zs.f> g();
}
