package k4;

import c5.s;
import f3.m;
import fr.w;
import g4.h;
import g4.j;
import g4.p0;
import g4.s0;
import m3.g;
import m3.l;
import n2.c;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p036e4.b0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg4/g;", "Lkotlin/Function0;", "Lm3/g;", "bounds", "Loq/i0;", "a", "(Lg4/g;Ler/a;Ltq/e;)Ljava/lang/Object;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm3/g;", "c", "()Lm3/g;"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.a<g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.a<g> f108234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0 f108235c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(er.a<g> aVar, b0 b0Var) {
            super(0);
            this.f108234b = aVar;
            this.f108235c = b0Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final g a() {
            g gVarA;
            er.a<g> aVar = this.f108234b;
            if (aVar != null && (gVarA = aVar.a()) != null) {
                return gVarA;
            }
            b0 b0Var = this.f108235c;
            if (!b0Var.c()) {
                b0Var = null;
            }
            if (b0Var != null) {
                return l.c(s.e(b0Var.b()));
            }
            return null;
        }
    }

    public static final Object a(g4.g gVar, er.a<g> aVar, e<? super i0> eVar) {
        Object obj;
        b0 b0VarQ;
        Object objQ1;
        p0 nodes;
        if (!gVar.getNode().getIsAttached()) {
            return i0.f148189a;
        }
        int iA = s0.a(PKIFailureInfo.signerNotTrusted);
        if (!gVar.getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        m.c parent = gVar.getNode().getParent();
        androidx.compose.ui.node.g gVarS = h.s(gVar);
        loop0: while (true) {
            obj = null;
            if (gVarS == null) {
                break;
            }
            if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        m.c cVarL = parent;
                        c cVar = null;
                        while (cVarL != null) {
                            if (cVarL instanceof k4.a) {
                                obj = cVarL;
                                break loop0;
                            }
                            if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof j)) {
                                int i15 = 0;
                                for (m.c delegate = ((j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            cVarL = delegate;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new c(new m.c[16], 0);
                                            }
                                            if (cVarL != null) {
                                                vq.b.a(cVar.d(cVarL));
                                                cVarL = null;
                                            }
                                            vq.b.a(cVar.d(delegate));
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            cVarL = h.l(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            gVarS = gVarS.C0();
            parent = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
        }
        k4.a aVar2 = (k4.a) obj;
        return (aVar2 != null && (objQ1 = aVar2.q1((b0VarQ = h.q(gVar)), new a(aVar, b0VarQ), eVar)) == uq.b.e()) ? objQ1 : i0.f148189a;
    }

    public static /* synthetic */ Object b(g4.g gVar, er.a aVar, e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = null;
        }
        return a(gVar, aVar, eVar);
    }
}
