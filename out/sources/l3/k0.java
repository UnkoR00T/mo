package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll3/p0;", "", "a", "(Ll3/p0;)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.a<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f115576b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i15) {
            super(0);
            this.f115576b = i15;
        }

        @Override // er.a
        public final Object a() {
            return Integer.valueOf(this.f115576b);
        }
    }

    public static final boolean a(p0 p0Var) {
        if (!p0Var.d0().e()) {
            return false;
        }
        int iA = g4.s0.a(1024);
        if (!p0Var.getNode().getIsAttached()) {
            d4.a.c("visitChildren called on an unattached node");
        }
        n2.c cVar = new n2.c(new f3.m.c[16], 0);
        f3.m.c child = p0Var.getNode().getChild();
        if (child == null) {
            g4.h.c(cVar, p0Var.getNode(), false);
        } else {
            cVar.d(child);
        }
        while (cVar.getSize() != 0) {
            f3.m.c cVarL = (f3.m.c) cVar.v(cVar.getSize() - 1);
            if ((cVarL.getAggregateChildKindSet() & iA) == 0) {
                g4.h.c(cVar, cVarL, false);
            } else {
                while (cVarL != null) {
                    if ((cVarL.getKindSet() & iA) != 0) {
                        n2.c cVar2 = null;
                        while (cVarL != null) {
                            if (cVarL instanceof p0) {
                                p0 p0Var2 = (p0) cVarL;
                                if (p0Var2.d0().e()) {
                                    int compositeKeyHash = g4.h.s(p0Var2).getCompositeKeyHash();
                                    p0Var.C3(Integer.valueOf(compositeKeyHash));
                                    b3.r rVar = (b3.r) g4.f.a(p0Var, b3.u.g());
                                    if (rVar != null) {
                                        rVar.c("pfc" + g4.h.s(p0Var).getCompositeKeyHash(), new a(compositeKeyHash));
                                    }
                                    return true;
                                }
                            } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                int i15 = 0;
                                for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            cVarL = delegate;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new n2.c(new f3.m.c[16], 0);
                                            }
                                            if (cVarL != null) {
                                                cVar2.d(cVarL);
                                                cVarL = null;
                                            }
                                            cVar2.d(delegate);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            cVarL = g4.h.l(cVar2);
                        }
                        break;
                    }
                    cVarL = cVarL.getChild();
                }
            }
        }
        return false;
    }
}
