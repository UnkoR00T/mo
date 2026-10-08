package g4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p036e4.x1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\b\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001b\"\u001c\u0010 \u001a\u00020\u0015*\u0006\u0012\u0002\b\u00030\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lf3/m$b;", "element", "", "f", "(Lf3/m$b;)I", "Lf3/m$c;", "node", "g", "(Lf3/m$c;)I", "Loq/i0;", "d", "(Lf3/m$c;)V", "a", "e", "remainingSet", "phase", "b", "(Lf3/m$c;II)V", "selfKindSet", "c", "Ll3/z;", "", "j", "(Ll3/z;)Z", "h", "Lr0/p0;", "", "Lr0/p0;", "classToKindSetMap", "Lg4/s0;", "i", "(I)Z", "includeSelfInTraversal", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r0.p0<Object> f70395a = r0.z0.b();

    public static final void a(f3.m.c cVar) {
        if (!cVar.getIsAttached()) {
            d4.a.c("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void b(f3.m.c cVar, int i15, int i16) {
        if (!(cVar instanceof j)) {
            c(cVar, i15 & cVar.getKindSet(), i16);
            return;
        }
        j jVar = (j) cVar;
        c(cVar, jVar.getSelfKindSet() & i15, i16);
        int i17 = (~jVar.getSelfKindSet()) & i15;
        for (f3.m.c cVarO3 = jVar.getDelegate(); cVarO3 != null; cVarO3 = cVarO3.getChild()) {
            b(cVarO3, i17, i16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(f3.m.c cVar, int i15, int i16) {
        if (i16 != 0 || cVar.getShouldAutoInvalidate()) {
            if ((s0.a(2) & i15) != 0 && (cVar instanceof z)) {
                b0.b((z) cVar);
                if (i16 == 2) {
                    h.n(cVar, s0.a(2)).K3();
                }
            }
            if ((s0.a(128) & i15) != 0 && i16 != 2) {
                h.s(cVar).W0();
            }
            if ((s0.a(4194304) & i15) != 0 && i16 != 2) {
                androidx.compose.ui.node.g.M1(h.s(cVar), false, 1, null);
            }
            if ((s0.a(256) & i15) != 0 && (cVar instanceof s)) {
                if (i16 == 1) {
                    androidx.compose.ui.node.g gVarS = h.s(cVar);
                    gVarS.V1(gVarS.getGloballyPositionedObservers() + 1);
                } else if (i16 == 2) {
                    androidx.compose.ui.node.g gVarS2 = h.s(cVar);
                    gVarS2.V1(gVarS2.getGloballyPositionedObservers() - 1);
                }
                if (i16 != 2) {
                    h.s(cVar).X0();
                }
            }
            if ((s0.a(4) & i15) != 0 && (cVar instanceof q)) {
                r.a((q) cVar);
            }
            if ((s0.a(8) & i15) != 0 && (cVar instanceof i1)) {
                h.s(cVar).i2(true);
            }
            if ((s0.a(64) & i15) != 0 && (cVar instanceof d1)) {
                e1.a((d1) cVar);
            }
            if ((s0.a(2048) & i15) != 0 && (cVar instanceof l3.z)) {
                l3.z zVar = (l3.z) cVar;
                if (j(zVar)) {
                    l3.a0.a(zVar);
                }
            }
            if ((s0.a(PKIFailureInfo.certConfirmed) & i15) != 0 && (cVar instanceof l3.j)) {
                l3.k.a((l3.j) cVar);
            }
            if ((i15 & s0.a(PKIFailureInfo.badSenderNonce)) != 0 && (cVar instanceof x3.g) && i16 == 2) {
                ((x3.g) cVar).m2();
            }
        }
    }

    public static final void d(f3.m.c cVar) {
        if (!cVar.getIsAttached()) {
            d4.a.c("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(f3.m.c cVar) {
        if (!cVar.getIsAttached()) {
            d4.a.c("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int f(f3.m.b bVar) {
        int iA = s0.a(1);
        if (bVar instanceof p036e4.k0) {
            iA |= s0.a(2);
        }
        if (bVar instanceof k3.j) {
            iA |= s0.a(4);
        }
        if (bVar instanceof n4.u) {
            iA |= s0.a(8);
        }
        if (bVar instanceof a4.i0) {
            iA |= s0.a(16);
        }
        if ((bVar instanceof f4.d) || (bVar instanceof f4.j)) {
            iA |= s0.a(32);
        }
        if (bVar instanceof l3.i) {
            iA |= s0.a(PKIFailureInfo.certConfirmed);
        }
        if (bVar instanceof l3.r) {
            iA |= s0.a(2048);
        }
        if (bVar instanceof p036e4.k1) {
            iA |= s0.a(256);
        }
        if (bVar instanceof x1) {
            iA |= s0.a(64);
        }
        if (bVar instanceof p036e4.o1) {
            iA |= s0.a(4194304);
        }
        if (bVar instanceof p036e4.p1) {
            iA |= s0.a(128);
        }
        return bVar instanceof k4.a ? s0.a(PKIFailureInfo.signerNotTrusted) | iA : iA;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0106  */
    /* JADX WARN: Code duplicated, block: B:76:0x0111  */
    public static final int g(f3.m.c cVar) {
        int iA;
        if (cVar.getKindSet() != 0) {
            return cVar.getKindSet();
        }
        r0.p0<Object> p0Var = f70395a;
        Object objB = f3.b.b(cVar);
        int iB = p0Var.b(objB);
        if (iB >= 0) {
            return p0Var.values[iB];
        }
        int iA2 = s0.a(1);
        if (cVar instanceof z) {
            iA2 |= s0.a(2);
        }
        if (cVar instanceof q) {
            iA2 |= s0.a(4);
        }
        if (cVar instanceof i1) {
            iA2 |= s0.a(8);
        }
        if (cVar instanceof f1) {
            iA2 |= s0.a(16);
        }
        if (cVar instanceof f4.h) {
            iA2 |= s0.a(32);
        }
        if (cVar instanceof d1) {
            iA2 |= s0.a(64);
        }
        if (!(cVar instanceof y)) {
            if (cVar instanceof k0) {
                iA = s0.a(128);
            }
            if (cVar instanceof s) {
                iA2 |= s0.a(256);
            }
            if (cVar instanceof p036e4.e) {
                iA2 |= s0.a(512);
            }
            if (cVar instanceof l3.p0) {
                iA2 |= s0.a(1024);
            }
            if (cVar instanceof l3.z) {
                iA2 |= s0.a(2048);
            }
            if (cVar instanceof l3.j) {
                iA2 |= s0.a(PKIFailureInfo.certConfirmed);
            }
            if (cVar instanceof y3.g) {
                iA2 |= s0.a(PKIFailureInfo.certRevoked);
            }
            if (cVar instanceof c4.a) {
                iA2 |= s0.a(16384);
            }
            if (cVar instanceof e) {
                iA2 |= s0.a(32768);
            }
            if (cVar instanceof y3.j) {
                iA2 |= s0.a(PKIFailureInfo.unsupportedVersion);
            }
            if (cVar instanceof q1) {
                iA2 |= s0.a(PKIFailureInfo.transactionIdInUse);
            }
            if (cVar instanceof k4.a) {
                iA2 |= s0.a(PKIFailureInfo.signerNotTrusted);
            }
            if (cVar instanceof t1) {
                iA2 |= s0.a(PKIFailureInfo.badCertTemplate);
            }
            if (cVar instanceof x3.g) {
                iA2 |= s0.a(PKIFailureInfo.badSenderNonce);
            }
            if (cVar instanceof p036e4.j) {
                iA2 |= s0.a(8388608);
            }
            p0Var.u(objB, iA2);
            return iA2;
        }
        iA2 |= s0.a(128);
        iA = s0.a(4194304);
        iA2 |= iA;
        if (cVar instanceof s) {
            iA2 |= s0.a(256);
        }
        if (cVar instanceof p036e4.e) {
            iA2 |= s0.a(512);
        }
        if (cVar instanceof l3.p0) {
            iA2 |= s0.a(1024);
        }
        if (cVar instanceof l3.z) {
            iA2 |= s0.a(2048);
        }
        if (cVar instanceof l3.j) {
            iA2 |= s0.a(PKIFailureInfo.certConfirmed);
        }
        if (cVar instanceof y3.g) {
            iA2 |= s0.a(PKIFailureInfo.certRevoked);
        }
        if (cVar instanceof c4.a) {
            iA2 |= s0.a(16384);
        }
        if (cVar instanceof e) {
            iA2 |= s0.a(32768);
        }
        if (cVar instanceof y3.j) {
            iA2 |= s0.a(PKIFailureInfo.unsupportedVersion);
        }
        if (cVar instanceof q1) {
            iA2 |= s0.a(PKIFailureInfo.transactionIdInUse);
        }
        if (cVar instanceof k4.a) {
            iA2 |= s0.a(PKIFailureInfo.signerNotTrusted);
        }
        if (cVar instanceof t1) {
            iA2 |= s0.a(PKIFailureInfo.badCertTemplate);
        }
        if (cVar instanceof x3.g) {
            iA2 |= s0.a(PKIFailureInfo.badSenderNonce);
        }
        if (cVar instanceof p036e4.j) {
            iA2 |= s0.a(8388608);
        }
        p0Var.u(objB, iA2);
        return iA2;
    }

    public static final int h(f3.m.c cVar) {
        if (!(cVar instanceof j)) {
            return g(cVar);
        }
        j jVar = (j) cVar;
        int iP3 = jVar.getSelfKindSet();
        for (f3.m.c cVarO3 = jVar.getDelegate(); cVarO3 != null; cVarO3 = cVarO3.getChild()) {
            iP3 |= h(cVarO3);
        }
        return iP3;
    }

    public static final boolean i(int i15) {
        return ((s0.a(128) & i15) != 0) | ((i15 & s0.a(4194304)) != 0);
    }

    private static final boolean j(l3.z zVar) {
        c cVar = c.f70313b;
        cVar.t();
        zVar.I0(cVar);
        return cVar.c();
    }
}
