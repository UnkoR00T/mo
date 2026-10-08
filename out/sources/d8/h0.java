package d8;

import ak.n0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0<h8.x> f40283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0<t7.l.b> f40284b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n0.a<h8.x> f40285a = n0.s();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n0<t7.l.b> f40286b;

        public b c(h8.x xVar) {
            this.f40285a.a(xVar);
            return this;
        }

        public h0 d() {
            return new h0(this);
        }

        public b e(List<t7.l.b> list) {
            this.f40286b = n0.v(list);
            return this;
        }
    }

    private h0(b bVar) {
        this.f40283a = bVar.f40285a.k();
        this.f40284b = bVar.f40286b;
    }
}
