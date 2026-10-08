package yr;

import st.g2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z implements vr.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f228959a = new a(null);

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final lt.k a(vr.e eVar, g2 g2Var, tt.g gVar) {
            lt.k kVarM0;
            z zVar = eVar instanceof z ? (z) eVar : null;
            return (zVar == null || (kVarM0 = zVar.m0(g2Var, gVar)) == null) ? eVar.O(g2Var) : kVarM0;
        }

        public final lt.k b(vr.e eVar, tt.g gVar) {
            lt.k kVarI0;
            z zVar = eVar instanceof z ? (z) eVar : null;
            return (zVar == null || (kVarI0 = zVar.I0(gVar)) == null) ? eVar.a0() : kVarI0;
        }

        private a() {
        }
    }

    protected abstract lt.k I0(tt.g gVar);

    @Override // vr.e, vr.m
    public /* bridge */ /* synthetic */ vr.h a() {
        return a();
    }

    protected abstract lt.k m0(g2 g2Var, tt.g gVar);

    @Override // vr.m
    public /* bridge */ /* synthetic */ vr.m a() {
        return a();
    }
}
