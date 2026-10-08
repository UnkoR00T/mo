package ns;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import pq.e1;

/* JADX INFO: loaded from: classes4.dex */
public interface c {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f138060a = new a();

        private a() {
        }

        @Override // ns.c
        public Set<zs.f> a() {
            return e1.e();
        }

        @Override // ns.c
        public Set<zs.f> b() {
            return e1.e();
        }

        @Override // ns.c
        public Set<zs.f> c() {
            return e1.e();
        }

        @Override // ns.c
        public qs.w e(zs.f fVar) {
            return null;
        }

        @Override // ns.c
        public qs.n f(zs.f fVar) {
            return null;
        }

        @Override // ns.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public List<qs.r> d(zs.f fVar) {
            return pq.v.n();
        }
    }

    Set<zs.f> a();

    Set<zs.f> b();

    Set<zs.f> c();

    Collection<qs.r> d(zs.f fVar);

    qs.w e(zs.f fVar);

    qs.n f(zs.f fVar);
}
