package tt;

import java.util.Collection;
import st.t0;
import st.x1;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends st.s {

    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f192119a = new a();

        private a() {
        }

        @Override // tt.g
        public vr.e b(zs.b bVar) {
            return null;
        }

        @Override // tt.g
        public <S extends lt.k> S c(vr.e eVar, er.a<? extends S> aVar) {
            return aVar.a();
        }

        @Override // tt.g
        public boolean d(i0 i0Var) {
            return false;
        }

        @Override // tt.g
        public boolean e(x1 x1Var) {
            return false;
        }

        @Override // tt.g
        public Collection<t0> g(vr.e eVar) {
            return eVar.o().q();
        }

        @Override // st.s
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public t0 a(wt.i iVar) {
            return (t0) iVar;
        }

        @Override // tt.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public vr.e f(vr.m mVar) {
            return null;
        }
    }

    public abstract vr.e b(zs.b bVar);

    public abstract <S extends lt.k> S c(vr.e eVar, er.a<? extends S> aVar);

    public abstract boolean d(i0 i0Var);

    public abstract boolean e(x1 x1Var);

    public abstract vr.h f(vr.m mVar);

    public abstract Collection<t0> g(vr.e eVar);

    /* JADX INFO: renamed from: h */
    public abstract t0 a(wt.i iVar);
}
