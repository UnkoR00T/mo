package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\u0003\u001a'\u0010\t\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a+\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001b\u0010\u0017\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Ll3/p0;", "", "i", "(Ll3/p0;)Z", "forced", "refreshFocusEvents", "b", "(Ll3/p0;ZZ)Z", "d", "a", "Ll3/g;", "focusDirection", "Lm3/g;", "previouslyFocusedRect", "j", "(Ll3/p0;Ll3/g;Lm3/g;)Z", "l", "(Ll3/p0;)Ll3/p0;", "Ll3/c;", "h", "(Ll3/p0;I)Ll3/c;", "e", "f", "g", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115606a;

        static {
            int[] iArr = new int[m0.values().length];
            try {
                iArr[m0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m0.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m0.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f115606a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.a<oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f115607b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p0 p0Var) {
            super(0);
            this.f115607b = p0Var;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            c();
            return oq.i0.f148189a;
        }

        public final void c() {
            this.f115607b.u3();
        }
    }

    private static final boolean a(p0 p0Var, boolean z15, boolean z16) {
        p0 p0VarF = s0.f(p0Var);
        if (p0VarF != null) {
            return b(p0VarF, z15, z16);
        }
        return true;
    }

    public static final boolean b(p0 p0Var, boolean z15, boolean z16) {
        int i15 = a.f115606a[p0Var.d0().ordinal()];
        if (i15 == 1) {
            if (!f3.h.isOptimizedFocusEventDispatchEnabled) {
                g4.h.t(p0Var).getFocusOwner().j(null);
                if (z16) {
                    p0Var.t3(m0.Active, m0.Inactive);
                }
            }
            return true;
        }
        if (i15 == 2) {
            if (z15 && !f3.h.isOptimizedFocusEventDispatchEnabled) {
                g4.h.t(p0Var).getFocusOwner().j(null);
                if (z16) {
                    p0Var.t3(m0.Captured, m0.Inactive);
                }
            }
            return z15;
        }
        if (i15 != 3) {
            if (i15 == 4) {
                return true;
            }
            throw new oq.p();
        }
        if (!a(p0Var, z15, z16)) {
            return false;
        }
        if (z16) {
            p0Var.t3(m0.ActiveParent, m0.Inactive);
        }
        return true;
    }

    public static /* synthetic */ boolean c(p0 p0Var, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return b(p0Var, z15, z16);
    }

    private static final boolean d(p0 p0Var) {
        g4.w0.a(p0Var, new b(p0Var));
        int i15 = a.f115606a[p0Var.d0().ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3 && i15 != 4) {
                throw new oq.p();
            }
            g4.h.t(p0Var).getFocusOwner().j(p0Var);
        }
        return true;
    }

    public static final c e(p0 p0Var, int i15) {
        int i16 = a.f115606a[p0Var.d0().ordinal()];
        if (i16 != 1) {
            if (i16 == 2) {
                return c.Cancelled;
            }
            if (i16 == 3) {
                c cVarE = e(l(p0Var), i15);
                if (cVarE == c.None) {
                    cVarE = null;
                }
                return cVarE == null ? g(p0Var, i15) : cVarE;
            }
            if (i16 != 4) {
                throw new oq.p();
            }
        }
        return c.None;
    }

    private static final c f(p0 p0Var, int i15) {
        if (!p0Var.isProcessingCustomEnter) {
            p0Var.isProcessingCustomEnter = true;
            try {
                v vVarU3 = p0Var.u3();
                l3.b bVar = new l3.b(i15, null);
                s focusOwner = g4.h.t(p0Var).getFocusOwner();
                p0 p0VarK = focusOwner.k();
                vVarU3.o().b(bVar);
                p0 p0VarK2 = focusOwner.k();
                if (bVar.getIsCanceled()) {
                    d0.Companion companion = d0.INSTANCE;
                    d0 d0VarB = companion.b();
                    if (d0VarB == companion.b()) {
                        return c.Cancelled;
                    }
                    if (d0VarB == companion.d()) {
                        return c.Redirected;
                    }
                    return d0.f(d0VarB, 0, 1, null) ? c.Redirected : c.RedirectCancelled;
                }
                if (p0VarK != p0VarK2 && p0VarK2 != null) {
                    d0.Companion companion2 = d0.INSTANCE;
                    d0 d0VarD = companion2.d();
                    if (d0VarD == companion2.b()) {
                        return c.Cancelled;
                    }
                    if (d0VarD == companion2.d()) {
                        return c.Redirected;
                    }
                    return d0.f(d0VarD, 0, 1, null) ? c.Redirected : c.RedirectCancelled;
                }
            } finally {
                p0Var.isProcessingCustomEnter = false;
            }
        }
        return c.None;
    }

    private static final c g(p0 p0Var, int i15) {
        if (!p0Var.isProcessingCustomExit) {
            p0Var.isProcessingCustomExit = true;
            try {
                v vVarU3 = p0Var.u3();
                l3.b bVar = new l3.b(i15, null);
                s focusOwner = g4.h.t(p0Var).getFocusOwner();
                p0 p0VarK = focusOwner.k();
                vVarU3.q().b(bVar);
                p0 p0VarK2 = focusOwner.k();
                if (bVar.getIsCanceled()) {
                    d0.Companion companion = d0.INSTANCE;
                    d0 d0VarB = companion.b();
                    if (d0VarB == companion.b()) {
                        return c.Cancelled;
                    }
                    if (d0VarB == companion.d()) {
                        return c.Redirected;
                    }
                    return d0.f(d0VarB, 0, 1, null) ? c.Redirected : c.RedirectCancelled;
                }
                if (p0VarK != p0VarK2 && p0VarK2 != null) {
                    d0.Companion companion2 = d0.INSTANCE;
                    d0 d0VarD = companion2.d();
                    if (d0VarD == companion2.b()) {
                        return c.Cancelled;
                    }
                    if (d0VarD == companion2.d()) {
                        return c.Redirected;
                    }
                    return d0.f(d0VarD, 0, 1, null) ? c.Redirected : c.RedirectCancelled;
                }
            } finally {
                p0Var.isProcessingCustomExit = false;
            }
        }
        return c.None;
    }

    public static final c h(p0 p0Var, int i15) {
        f3.m.c cVarL;
        g4.p0 nodes;
        int i16 = a.f115606a[p0Var.d0().ordinal()];
        if (i16 == 1 || i16 == 2) {
            return c.None;
        }
        if (i16 == 3) {
            return e(l(p0Var), i15);
        }
        if (i16 != 4) {
            throw new oq.p();
        }
        int iA = g4.s0.a(1024);
        if (!p0Var.getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        f3.m.c parent = p0Var.getNode().getParent();
        androidx.compose.ui.node.g gVarS = g4.h.s(p0Var);
        loop0: while (true) {
            if (gVarS == null) {
                cVarL = null;
                break;
            }
            if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        cVarL = parent;
                        n2.c cVar = null;
                        while (cVarL != null) {
                            if (cVarL instanceof p0) {
                                break loop0;
                            }
                            if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                int i17 = 0;
                                for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i17++;
                                        if (i17 == 1) {
                                            cVarL = delegate;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new n2.c(new f3.m.c[16], 0);
                                            }
                                            if (cVarL != null) {
                                                cVar.d(cVarL);
                                                cVarL = null;
                                            }
                                            cVar.d(delegate);
                                        }
                                    }
                                }
                                if (i17 == 1) {
                                }
                            }
                            cVarL = g4.h.l(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            gVarS = gVarS.C0();
            parent = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
        }
        p0 p0Var2 = (p0) cVarL;
        if (p0Var2 == null) {
            return c.None;
        }
        int i18 = a.f115606a[p0Var2.d0().ordinal()];
        if (i18 == 1) {
            return f(p0Var2, i15);
        }
        if (i18 == 2) {
            return c.Cancelled;
        }
        if (i18 == 3) {
            return h(p0Var2, i15);
        }
        if (i18 != 4) {
            throw new oq.p();
        }
        c cVarH = h(p0Var2, i15);
        c cVar2 = cVarH != c.None ? cVarH : null;
        return cVar2 == null ? f(p0Var2, i15) : cVar2;
    }

    public static final boolean i(p0 p0Var) {
        n2.c cVar;
        g4.p0 nodes;
        g4.p0 nodes2;
        boolean z15;
        String str;
        g4.p0 nodes3;
        s focusOwner = g4.h.t(p0Var).getFocusOwner();
        p0 p0VarK = focusOwner.k();
        m0 m0VarD0 = p0Var.d0();
        int i15 = 1;
        if (p0VarK == p0Var) {
            p0Var.t3(m0VarD0, m0VarD0);
            return true;
        }
        n2.c cVar2 = null;
        if (f3.h.isBypassUnfocusableComposeViewEnabled) {
            if ((p0VarK == null || p0VarK.getIsInteropViewHost()) && !p0Var.getIsInteropViewHost() && !k(p0Var, null, null, 3, null)) {
                return false;
            }
        } else if (p0VarK == null && !k(p0Var, null, null, 3, null)) {
            return false;
        }
        String str2 = "visitAncestors called on an unattached node";
        int i16 = 1024;
        if (p0VarK != null) {
            cVar = new n2.c(new p0[16], 0);
            int iA = g4.s0.a(1024);
            if (!p0VarK.getNode().getIsAttached()) {
                d4.a.c("visitAncestors called on an unattached node");
            }
            f3.m.c parent = p0VarK.getNode().getParent();
            androidx.compose.ui.node.g gVarS = g4.h.s(p0VarK);
            while (gVarS != null) {
                if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iA) != 0) {
                            n2.c cVar3 = cVar2;
                            f3.m.c cVarL = parent;
                            while (cVarL != null) {
                                i16 = i16;
                                if (cVarL instanceof p0) {
                                    cVar.d((p0) cVarL);
                                } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                    f3.m.c delegate = ((g4.j) cVarL).getDelegate();
                                    int i17 = 0;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i17++;
                                            if (i17 == i15) {
                                                oq.i0 i0Var = oq.i0.f148189a;
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
                                        delegate = delegate.getChild();
                                        i15 = 1;
                                    }
                                    if (i17 == i15) {
                                    }
                                }
                                cVarL = g4.h.l(cVar3);
                                i15 = 1;
                            }
                        }
                        parent = parent.getParent();
                        i16 = i16;
                        i15 = 1;
                        cVar2 = null;
                    }
                }
                int i18 = i16;
                gVarS = gVarS.C0();
                parent = (gVarS == null || (nodes3 = gVarS.getNodes()) == null) ? null : nodes3.getTail();
                i16 = i18;
                i15 = 1;
                cVar2 = null;
            }
        } else {
            cVar = null;
        }
        int i19 = i16;
        n2.c cVar4 = new n2.c(new p0[16], 0);
        n2.c cVar5 = new n2.c(new p0[16], 0);
        int iA2 = g4.s0.a(i19);
        if (!p0Var.getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        f3.m.c parent2 = p0Var.getNode().getParent();
        androidx.compose.ui.node.g gVarS2 = g4.h.s(p0Var);
        boolean z16 = true;
        while (gVarS2 != null) {
            if ((gVarS2.getNodes().getHead().getAggregateChildKindSet() & iA2) != 0) {
                while (parent2 != null) {
                    if ((parent2.getKindSet() & iA2) != 0) {
                        f3.m.c cVarL2 = parent2;
                        n2.c cVar6 = null;
                        while (cVarL2 != null) {
                            if (cVarL2 instanceof p0) {
                                p0 p0Var2 = (p0) cVarL2;
                                if (fr.t.c(cVar != null ? Boolean.valueOf(cVar.t(p0Var2)) : null, Boolean.TRUE)) {
                                    cVar4.d(p0Var2);
                                } else {
                                    cVar5.d(p0Var2);
                                }
                                if (p0Var2 == p0VarK) {
                                    z16 = false;
                                }
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && (cVarL2.getKindSet() & iA2) != 0 && (cVarL2 instanceof g4.j)) {
                                f3.m.c delegate2 = ((g4.j) cVarL2).getDelegate();
                                int i25 = 0;
                                while (delegate2 != null) {
                                    if ((delegate2.getKindSet() & iA2) == 0) {
                                        str2 = str2;
                                    } else {
                                        i25++;
                                        if (i25 == 1) {
                                            oq.i0 i0Var2 = oq.i0.f148189a;
                                            cVarL2 = delegate2;
                                            str2 = str2;
                                        } else {
                                            if (cVar6 == null) {
                                                cVar6 = new n2.c(new f3.m.c[16], 0);
                                            }
                                            if (cVarL2 != null) {
                                                cVar6.d(cVarL2);
                                                cVarL2 = null;
                                            }
                                            cVar6.d(delegate2);
                                        }
                                    }
                                    delegate2 = delegate2.getChild();
                                    str2 = str2;
                                }
                                str = str2;
                                if (i25 == 1) {
                                }
                                focusOwner = focusOwner;
                                str2 = str;
                            } else {
                                str = str2;
                            }
                            cVarL2 = g4.h.l(cVar6);
                            focusOwner = focusOwner;
                            str2 = str;
                        }
                    }
                    parent2 = parent2.getParent();
                    focusOwner = focusOwner;
                    str2 = str2;
                }
            }
            s sVar = focusOwner;
            String str3 = str2;
            gVarS2 = gVarS2.C0();
            parent2 = (gVarS2 == null || (nodes2 = gVarS2.getNodes()) == null) ? null : nodes2.getTail();
            focusOwner = sVar;
            str2 = str3;
        }
        s sVar2 = focusOwner;
        String str4 = str2;
        if (z16 && p0VarK != null && !c(p0VarK, false, true, 1, null)) {
            return false;
        }
        d(p0Var);
        if (f3.h.isOptimizedFocusEventDispatchEnabled && z16 && p0VarK != null) {
            p0VarK.t3(m0.Active, m0.Inactive);
            oq.i0 i0Var3 = oq.i0.f148189a;
        }
        if (cVar != null) {
            int size = cVar.getSize() - 1;
            Object[] objArr = cVar.content;
            if (size < objArr.length) {
                while (size >= 0) {
                    p0 p0Var3 = (p0) objArr[size];
                    if (sVar2.k() != p0Var) {
                        return false;
                    }
                    p0Var3.t3(m0.ActiveParent, m0.Inactive);
                    size--;
                }
            }
            oq.i0 i0Var4 = oq.i0.f148189a;
        }
        int size2 = cVar5.getSize() - 1;
        Object[] objArr2 = cVar5.content;
        if (size2 < objArr2.length) {
            while (size2 >= 0) {
                p0 p0Var4 = (p0) objArr2[size2];
                if (sVar2.k() != p0Var) {
                    return false;
                }
                p0Var4.t3(p0Var4 == p0VarK ? m0.Active : m0.Inactive, m0.ActiveParent);
                size2--;
            }
        }
        if (sVar2.k() != p0Var) {
            return false;
        }
        p0Var.t3(m0VarD0, m0.Active);
        if (sVar2.k() != p0Var) {
            return false;
        }
        if (f3.h.isFocusRestorationEnabled) {
            p0 p0Var5 = (p0) (cVar4.getSize() == 0 ? null : cVar4.content[cVar4.getSize() - 1]);
            int iA3 = g4.s0.a(i19);
            if (!p0Var.getNode().getIsAttached()) {
                d4.a.c(str4);
            }
            f3.m.c parent3 = p0Var.getNode().getParent();
            androidx.compose.ui.node.g gVarS3 = g4.h.s(p0Var);
            loop10: while (gVarS3 != null) {
                if ((gVarS3.getNodes().getHead().getAggregateChildKindSet() & iA3) != 0) {
                    while (parent3 != null) {
                        if ((parent3.getKindSet() & iA3) != 0) {
                            f3.m.c cVarL3 = parent3;
                            n2.c cVar7 = null;
                            while (cVarL3 != null) {
                                if (cVarL3 instanceof p0) {
                                    p0 p0Var6 = (p0) cVarL3;
                                    k0.a(p0Var6);
                                    if (p0Var6 == p0Var5) {
                                        break loop10;
                                    }
                                } else if ((cVarL3.getKindSet() & iA3) != 0 && (cVarL3 instanceof g4.j)) {
                                    int i26 = 0;
                                    for (f3.m.c delegate3 = ((g4.j) cVarL3).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                                        if ((delegate3.getKindSet() & iA3) != 0) {
                                            i26++;
                                            if (i26 == 1) {
                                                oq.i0 i0Var5 = oq.i0.f148189a;
                                                cVarL3 = delegate3;
                                            } else {
                                                if (cVar7 == null) {
                                                    cVar7 = new n2.c(new f3.m.c[16], 0);
                                                }
                                                if (cVarL3 != null) {
                                                    cVar7.d(cVarL3);
                                                    cVarL3 = null;
                                                }
                                                cVar7.d(delegate3);
                                            }
                                        }
                                    }
                                    if (i26 != 1) {
                                        cVarL3 = g4.h.l(cVar7);
                                    }
                                }
                                cVarL3 = g4.h.l(cVar7);
                            }
                        }
                        parent3 = parent3.getParent();
                    }
                }
                gVarS3 = gVarS3.C0();
                parent3 = (gVarS3 == null || (nodes = gVarS3.getNodes()) == null) ? null : nodes.getTail();
            }
            oq.i0 i0Var6 = oq.i0.f148189a;
        }
        if (!f3.h.isViewFocusFixEnabled || g4.h.s(p0Var).d0() != null) {
            return true;
        }
        j(p0Var, g.i(g.INSTANCE.e()), null);
        return true;
    }

    private static final boolean j(p0 p0Var, g gVar, m3.g gVar2) {
        return g4.h.t(p0Var).getFocusOwner().c(gVar, gVar2);
    }

    static /* synthetic */ boolean k(p0 p0Var, g gVar, m3.g gVar2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            gVar = null;
        }
        if ((i15 & 2) != 0) {
            gVar2 = null;
        }
        return j(p0Var, gVar, gVar2);
    }

    private static final p0 l(p0 p0Var) {
        p0 p0VarF = s0.f(p0Var);
        if (p0VarF != null) {
            return p0VarF;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
