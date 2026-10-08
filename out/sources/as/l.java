package as;

import bs.u;
import vr.i1;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements ps.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f14290a = new l();

    public static final class a implements ps.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f14291b;

        public a(u uVar) {
            this.f14291b = uVar;
        }

        @Override // vr.h1
        public i1 b() {
            return i1.f208053a;
        }

        @Override // ps.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u c() {
            return this.f14291b;
        }

        public String toString() {
            return a.class.getName() + ": " + c();
        }
    }

    private l() {
    }

    @Override // ps.b
    public ps.a a(qs.l lVar) {
        return new a((u) lVar);
    }
}
