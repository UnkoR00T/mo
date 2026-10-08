package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a/\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001a7\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a'\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\t\u001a'\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\t\u001a\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ll3/p0;", "Ll3/g;", "direction", "Lkotlin/Function1;", "", "onFound", "f", "(Ll3/p0;ILer/l;)Z", "c", "(Ll3/p0;Ler/l;)Z", "b", "focusedItem", "d", "(Ll3/p0;Ll3/p0;ILer/l;)Z", "i", "h", "g", "e", "(Ll3/p0;)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115639a;

        static {
            int[] iArr = new int[m0.values().length];
            try {
                iArr[m0.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m0.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m0.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f115639a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/h$a;", "", "c", "(Le4/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<e4.h.a, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f115640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0 f115641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p0 f115642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f115643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l<p0, Boolean> f115644f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p0 p0Var, p0 p0Var2, p0 p0Var3, int i15, er.l<? super p0, Boolean> lVar) {
            super(1);
            this.f115640b = p0Var;
            this.f115641c = p0Var2;
            this.f115642d = p0Var3;
            this.f115643e = i15;
            this.f115644f = lVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(e4.h.a aVar) {
            if (this.f115640b != g4.h.t(this.f115641c).getFocusOwner().k()) {
                return Boolean.TRUE;
            }
            boolean zI = v0.i(this.f115641c, this.f115642d, this.f115643e, this.f115644f);
            Boolean boolValueOf = Boolean.valueOf(zI);
            if (zI || !aVar.getHasMoreContent()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final boolean b(p0 p0Var, er.l<? super p0, Boolean> lVar) {
        m0 m0VarD0 = p0Var.d0();
        int[] iArr = a.f115639a;
        int i15 = iArr[m0VarD0.ordinal()];
        if (i15 != 1) {
            if (i15 == 2 || i15 == 3) {
                return g(p0Var, lVar);
            }
            if (i15 != 4) {
                throw new oq.p();
            }
            if (!g(p0Var, lVar)) {
                if (!(p0Var.u3().getCanFocus() ? lVar.b(p0Var).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        p0 p0VarF = s0.f(p0Var);
        if (p0VarF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i16 = iArr[p0VarF.d0().ordinal()];
        if (i16 == 1) {
            return b(p0VarF, lVar) || d(p0Var, p0VarF, g.INSTANCE.f(), lVar) || (p0VarF.u3().getCanFocus() && lVar.b(p0VarF).booleanValue());
        }
        if (i16 == 2 || i16 == 3) {
            return d(p0Var, p0VarF, g.INSTANCE.f(), lVar);
        }
        if (i16 != 4) {
            throw new oq.p();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(p0 p0Var, er.l<? super p0, Boolean> lVar) {
        int i15 = a.f115639a[p0Var.d0().ordinal()];
        if (i15 == 1) {
            p0 p0VarF = s0.f(p0Var);
            if (p0VarF != null) {
                return c(p0VarF, lVar) || d(p0Var, p0VarF, g.INSTANCE.e(), lVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i15 == 2 || i15 == 3) {
            return h(p0Var, lVar);
        }
        if (i15 == 4) {
            return p0Var.u3().getCanFocus() ? lVar.b(p0Var).booleanValue() : h(p0Var, lVar);
        }
        throw new oq.p();
    }

    private static final boolean d(p0 p0Var, p0 p0Var2, int i15, er.l<? super p0, Boolean> lVar) {
        if (i(p0Var, p0Var2, i15, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) l3.a.a(p0Var, i15, new b(g4.h.t(p0Var).getFocusOwner().k(), p0Var, p0Var2, i15, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(p0 p0Var) {
        f3.m.c cVar;
        g4.p0 nodes;
        int iA = g4.s0.a(1024);
        if (!p0Var.getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        f3.m.c parent = p0Var.getNode().getParent();
        androidx.compose.ui.node.g gVarS = g4.h.s(p0Var);
        loop0: while (true) {
            cVar = null;
            if (gVarS == null) {
                break;
            }
            if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        f3.m.c cVarL = parent;
                        n2.c cVar2 = null;
                        while (cVarL != null) {
                            if (cVarL instanceof p0) {
                                cVar = cVarL;
                                break loop0;
                            }
                            if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
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
                    }
                    parent = parent.getParent();
                }
            }
            gVarS = gVarS.C0();
            parent = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
        }
        return cVar == null;
    }

    public static final boolean f(p0 p0Var, int i15, er.l<? super p0, Boolean> lVar) {
        g.Companion companion = g.INSTANCE;
        if (g.l(i15, companion.e())) {
            return c(p0Var, lVar);
        }
        if (g.l(i15, companion.f())) {
            return b(p0Var, lVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean g(p0 p0Var, er.l<? super p0, Boolean> lVar) {
        n2.c cVar = new n2.c(new p0[16], 0);
        int iA = g4.s0.a(1024);
        if (!p0Var.getNode().getIsAttached()) {
            d4.a.c("visitChildren called on an unattached node");
        }
        n2.c cVar2 = new n2.c(new f3.m.c[16], 0);
        f3.m.c child = p0Var.getNode().getChild();
        if (child == null) {
            g4.h.c(cVar2, p0Var.getNode(), false);
        } else {
            cVar2.d(child);
        }
        while (cVar2.getSize() != 0) {
            f3.m.c cVarL = (f3.m.c) cVar2.v(cVar2.getSize() - 1);
            if ((cVarL.getAggregateChildKindSet() & iA) == 0) {
                g4.h.c(cVar2, cVarL, false);
            } else {
                while (cVarL != null) {
                    if ((cVarL.getKindSet() & iA) != 0) {
                        n2.c cVar3 = null;
                        while (cVarL != null) {
                            if (cVarL instanceof p0) {
                                cVar.d((p0) cVarL);
                            } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                int i15 = 0;
                                for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            cVarL = delegate;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new n2.c(new f3.m.c[16], 0);
                                            }
                                            if (cVarL != null) {
                                                cVar3.d(cVarL);
                                                cVarL = null;
                                            }
                                            cVar3.d(delegate);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            cVarL = g4.h.l(cVar3);
                        }
                        break;
                    }
                    cVarL = cVarL.getChild();
                }
            }
        }
        cVar.B(u0.f115633a);
        int size = cVar.getSize() - 1;
        Object[] objArr = cVar.content;
        if (size < objArr.length) {
            while (size >= 0) {
                p0 p0Var2 = (p0) objArr[size];
                if (s0.g(p0Var2) && b(p0Var2, lVar)) {
                    return true;
                }
                size--;
            }
        }
        return false;
    }

    private static final boolean h(p0 p0Var, er.l<? super p0, Boolean> lVar) {
        n2.c cVar = new n2.c(new p0[16], 0);
        int iA = g4.s0.a(1024);
        if (!p0Var.getNode().getIsAttached()) {
            d4.a.c("visitChildren called on an unattached node");
        }
        n2.c cVar2 = new n2.c(new f3.m.c[16], 0);
        f3.m.c child = p0Var.getNode().getChild();
        if (child == null) {
            g4.h.c(cVar2, p0Var.getNode(), false);
        } else {
            cVar2.d(child);
        }
        while (cVar2.getSize() != 0) {
            f3.m.c cVarL = (f3.m.c) cVar2.v(cVar2.getSize() - 1);
            if ((cVarL.getAggregateChildKindSet() & iA) == 0) {
                g4.h.c(cVar2, cVarL, false);
            } else {
                while (cVarL != null) {
                    if ((cVarL.getKindSet() & iA) != 0) {
                        n2.c cVar3 = null;
                        while (cVarL != null) {
                            if (cVarL instanceof p0) {
                                cVar.d((p0) cVarL);
                            } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                int i15 = 0;
                                for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            cVarL = delegate;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new n2.c(new f3.m.c[16], 0);
                                            }
                                            if (cVarL != null) {
                                                cVar3.d(cVarL);
                                                cVarL = null;
                                            }
                                            cVar3.d(delegate);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            cVarL = g4.h.l(cVar3);
                        }
                        break;
                    }
                    cVarL = cVarL.getChild();
                }
            }
        }
        cVar.B(u0.f115633a);
        Object[] objArr = cVar.content;
        int size = cVar.getSize();
        for (int i16 = 0; i16 < size; i16++) {
            p0 p0Var2 = (p0) objArr[i16];
            if (s0.g(p0Var2) && c(p0Var2, lVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(p0 p0Var, p0 p0Var2, int i15, er.l<? super p0, Boolean> lVar) {
        if (p0Var.d0() != m0.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        n2.c cVar = new n2.c(new p0[16], 0);
        int iA = g4.s0.a(1024);
        if (!p0Var.getNode().getIsAttached()) {
            d4.a.c("visitChildren called on an unattached node");
        }
        n2.c cVar2 = new n2.c(new f3.m.c[16], 0);
        f3.m.c child = p0Var.getNode().getChild();
        if (child == null) {
            g4.h.c(cVar2, p0Var.getNode(), false);
        } else {
            cVar2.d(child);
        }
        while (cVar2.getSize() != 0) {
            f3.m.c cVarL = (f3.m.c) cVar2.v(cVar2.getSize() - 1);
            if ((cVarL.getAggregateChildKindSet() & iA) == 0) {
                g4.h.c(cVar2, cVarL, false);
            } else {
                while (cVarL != null) {
                    if ((cVarL.getKindSet() & iA) != 0) {
                        n2.c cVar3 = null;
                        while (cVarL != null) {
                            if (cVarL instanceof p0) {
                                cVar.d((p0) cVarL);
                            } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                int i16 = 0;
                                for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i16++;
                                        if (i16 == 1) {
                                            cVarL = delegate;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new n2.c(new f3.m.c[16], 0);
                                            }
                                            if (cVarL != null) {
                                                cVar3.d(cVarL);
                                                cVarL = null;
                                            }
                                            cVar3.d(delegate);
                                        }
                                    }
                                }
                                if (i16 == 1) {
                                }
                            }
                            cVarL = g4.h.l(cVar3);
                        }
                        break;
                    }
                    cVarL = cVarL.getChild();
                }
            }
        }
        cVar.B(u0.f115633a);
        g.Companion companion = g.INSTANCE;
        if (g.l(i15, companion.e())) {
            lr.i iVarW = lr.m.w(0, cVar.getSize());
            int first = iVarW.getFirst();
            int last = iVarW.getLast();
            if (first <= last) {
                boolean z15 = false;
                while (true) {
                    if (z15) {
                        p0 p0Var3 = (p0) cVar.content[first];
                        if (s0.g(p0Var3) && c(p0Var3, lVar)) {
                            return true;
                        }
                    }
                    if (fr.t.c(cVar.content[first], p0Var2)) {
                        z15 = true;
                    }
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
        } else {
            if (!g.l(i15, companion.f())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            lr.i iVarW2 = lr.m.w(0, cVar.getSize());
            int first2 = iVarW2.getFirst();
            int last2 = iVarW2.getLast();
            if (first2 <= last2) {
                boolean z16 = false;
                while (true) {
                    if (z16) {
                        p0 p0Var4 = (p0) cVar.content[last2];
                        if (s0.g(p0Var4) && b(p0Var4, lVar)) {
                            return true;
                        }
                    }
                    if (fr.t.c(cVar.content[last2], p0Var2)) {
                        z16 = true;
                    }
                    if (last2 == first2) {
                        break;
                    }
                    last2--;
                }
            }
        }
        if (g.l(i15, g.INSTANCE.e()) || !p0Var.u3().getCanFocus() || e(p0Var)) {
            return false;
        }
        return lVar.b(p0Var).booleanValue();
    }
}
