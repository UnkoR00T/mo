package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020\u0016H\u0080\u0010¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lju/p0;", "Ltq/i;", "context", "j", "(Lju/p0;Ltq/i;)Ltq/i;", "addedContext", "k", "(Ltq/i;Ltq/i;)Ltq/i;", "", "h", "(Ltq/i;)Z", "originalContext", "appendContext", "isNewCoroutine", "d", "(Ltq/i;Ltq/i;Z)Ltq/i;", "Ltq/e;", "", "oldValue", "Lju/i3;", "m", "(Ltq/e;Ltq/i;Ljava/lang/Object;)Lju/i3;", "Lvq/e;", "l", "(Lvq/e;)Lju/i3;", "", "g", "(Ltq/i;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final tq.i d(tq.i iVar, tq.i iVar2, final boolean z15) {
        boolean zH = h(iVar);
        boolean zH2 = h(iVar2);
        if (!zH && !zH2) {
            return iVar.n0(iVar2);
        }
        final fr.p0 p0Var = new fr.p0();
        p0Var.f66410a = iVar2;
        tq.j jVar = tq.j.f191408a;
        tq.i iVar3 = (tq.i) iVar.s1(jVar, new er.p() { // from class: ju.h0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return j0.e(p0Var, z15, (tq.i) obj, (tq.i.b) obj2);
            }
        });
        if (zH2) {
            p0Var.f66410a = ((tq.i) p0Var.f66410a).s1(jVar, new er.p() { // from class: ju.i0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j0.f((tq.i) obj, (tq.i.b) obj2);
                }
            });
        }
        return iVar3.n0((tq.i) p0Var.f66410a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, tq.i] */
    public static final tq.i e(fr.p0 p0Var, boolean z15, tq.i iVar, tq.i.b bVar) {
        if (!(bVar instanceof f0)) {
            return iVar.n0(bVar);
        }
        tq.i.b bVarM = ((tq.i) p0Var.f66410a).m(bVar.getKey());
        if (bVarM == null) {
            return iVar.n0(z15 ? ((f0) bVar).b0() : (f0) bVar);
        }
        p0Var.f66410a = ((tq.i) p0Var.f66410a).D1(bVar.getKey());
        return iVar.n0(((f0) bVar).L(bVarM));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tq.i f(tq.i iVar, tq.i.b bVar) {
        return bVar instanceof f0 ? iVar.n0(((f0) bVar).b0()) : iVar.n0(bVar);
    }

    public static final String g(tq.i iVar) {
        return null;
    }

    private static final boolean h(tq.i iVar) {
        return ((Boolean) iVar.s1(Boolean.FALSE, new er.p() { // from class: ju.g0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Boolean.valueOf(j0.i(((Boolean) obj).booleanValue(), (tq.i.b) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z15, tq.i.b bVar) {
        return z15 || (bVar instanceof f0);
    }

    public static final tq.i j(p0 p0Var, tq.i iVar) {
        tq.i iVarD = d(p0Var.getCoroutineContext(), iVar, true);
        return (iVarD == g1.a() || iVarD.m(tq.f.INSTANCE) != null) ? iVarD : iVarD.n0(g1.a());
    }

    public static final tq.i k(tq.i iVar, tq.i iVar2) {
        return !h(iVar2) ? iVar.n0(iVar2) : d(iVar, iVar2, false);
    }

    public static final i3<?> l(vq.e eVar) {
        while (!(eVar instanceof c1) && (eVar = eVar.e()) != null) {
            if (eVar instanceof i3) {
                return (i3) eVar;
            }
        }
        return null;
    }

    public static final i3<?> m(tq.e<?> eVar, tq.i iVar, Object obj) {
        if (!(eVar instanceof vq.e) || iVar.m(j3.f105732a) == null) {
            return null;
        }
        i3<?> i3VarL = l((vq.e) eVar);
        if (i3VarL != null) {
            i3VarL.t1(iVar, obj);
        }
        return i3VarL;
    }
}
