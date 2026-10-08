package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a;\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a!\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a/\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b!\u0010\u001d\u001a\u0013\u0010\"\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a\u0013\u0010%\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Ll3/p0;", "Ll3/g;", "direction", "Lm3/g;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "t", "(Ll3/p0;ILm3/g;Ler/l;)Ljava/lang/Boolean;", "k", "(Ll3/p0;ILer/l;)Z", "focusedItem", "l", "(Ll3/p0;Lm3/g;ILer/l;)Z", "r", "Lg4/g;", "Ln2/c;", "accessibleChildren", "Loq/i0;", "i", "(Lg4/g;Ln2/c;)V", "focusRect", "j", "(Ln2/c;Lm3/g;I)Ll3/p0;", "proposedCandidate", "currentCandidate", "focusedRect", "m", "(Lm3/g;Lm3/g;Lm3/g;I)Z", "source", "rect1", "rect2", "c", "s", "(Lm3/g;)Lm3/g;", "h", "b", "(Ll3/p0;)Ll3/p0;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115660a;

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
            f115660a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/h$a;", "", "c", "(Le4/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<e4.h.a, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f115661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0 f115662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m3.g f115663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f115664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l<p0, Boolean> f115665f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p0 p0Var, p0 p0Var2, m3.g gVar, int i15, er.l<? super p0, Boolean> lVar) {
            super(1);
            this.f115661b = p0Var;
            this.f115662c = p0Var2;
            this.f115663d = gVar;
            this.f115664e = i15;
            this.f115665f = lVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(e4.h.a aVar) {
            if (this.f115661b != g4.h.t(this.f115662c).getFocusOwner().k()) {
                return Boolean.TRUE;
            }
            boolean zR = x0.r(this.f115662c, this.f115663d, this.f115664e, this.f115665f);
            Boolean boolValueOf = Boolean.valueOf(zR);
            if (zR || !aVar.getHasMoreContent()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final p0 b(p0 p0Var) {
        if (p0Var.d0() != m0.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        p0 p0VarB = s0.b(p0Var);
        if (p0VarB != null) {
            return p0VarB;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(m3.g gVar, m3.g gVar2, m3.g gVar3, int i15) {
        if (d(gVar3, i15, gVar) || !d(gVar2, i15, gVar)) {
            return false;
        }
        if (!e(gVar3, i15, gVar)) {
            return true;
        }
        g.Companion companion = g.INSTANCE;
        return g.l(i15, companion.d()) || g.l(i15, companion.g()) || f(gVar2, i15, gVar) < g(gVar3, i15, gVar);
    }

    private static final boolean d(m3.g gVar, int i15, m3.g gVar2) {
        g.Companion companion = g.INSTANCE;
        if (g.l(i15, companion.d()) || g.l(i15, companion.g())) {
            return gVar.getBottom() > gVar2.getTop() && gVar.getTop() < gVar2.getBottom();
        }
        if (g.l(i15, companion.h()) || g.l(i15, companion.a())) {
            return gVar.getRight() > gVar2.getLeft() && gVar.getLeft() < gVar2.getRight();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean e(m3.g gVar, int i15, m3.g gVar2) {
        g.Companion companion = g.INSTANCE;
        if (g.l(i15, companion.d())) {
            return gVar2.getLeft() >= gVar.getRight();
        }
        if (g.l(i15, companion.g())) {
            return gVar2.getRight() <= gVar.getLeft();
        }
        if (g.l(i15, companion.h())) {
            return gVar2.getTop() >= gVar.getBottom();
        }
        if (g.l(i15, companion.a())) {
            return gVar2.getBottom() <= gVar.getTop();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0057 A[RETURN] */
    private static final float f(m3.g gVar, int i15, m3.g gVar2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f15;
        g.Companion companion = g.INSTANCE;
        if (!g.l(i15, companion.d())) {
            if (g.l(i15, companion.g())) {
                top = gVar.getLeft();
                bottom = gVar2.getRight();
            } else if (g.l(i15, companion.h())) {
                top2 = gVar2.getTop();
                bottom2 = gVar.getBottom();
            } else {
                if (!g.l(i15, companion.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = gVar.getTop();
                bottom = gVar2.getBottom();
            }
            f15 = top - bottom;
            if (f15 < 0.0f) {
                return 0.0f;
            }
            return f15;
        }
        top2 = gVar2.getLeft();
        bottom2 = gVar.getRight();
        f15 = top2 - bottom2;
        if (f15 < 0.0f) {
            return 0.0f;
        }
        return f15;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0058 A[RETURN] */
    private static final float g(m3.g gVar, int i15, m3.g gVar2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f15;
        g.Companion companion = g.INSTANCE;
        if (!g.l(i15, companion.d())) {
            if (g.l(i15, companion.g())) {
                bottom = gVar.getRight();
                bottom2 = gVar2.getRight();
            } else if (g.l(i15, companion.h())) {
                top = gVar2.getTop();
                top2 = gVar.getTop();
            } else {
                if (!g.l(i15, companion.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                bottom = gVar.getBottom();
                bottom2 = gVar2.getBottom();
            }
            f15 = bottom - bottom2;
            if (f15 < 1.0f) {
                return 1.0f;
            }
            return f15;
        }
        top = gVar2.getLeft();
        top2 = gVar.getLeft();
        f15 = top - top2;
        if (f15 < 1.0f) {
            return 1.0f;
        }
        return f15;
    }

    private static final m3.g h(m3.g gVar) {
        return new m3.g(gVar.getRight(), gVar.getBottom(), gVar.getRight(), gVar.getBottom());
    }

    private static final void i(g4.g gVar, n2.c<p0> cVar) {
        int iA = g4.s0.a(1024);
        if (!gVar.getNode().getIsAttached()) {
            d4.a.c("visitChildren called on an unattached node");
        }
        n2.c cVar2 = new n2.c(new f3.m.c[16], 0);
        f3.m.c child = gVar.getNode().getChild();
        if (child == null) {
            g4.h.c(cVar2, gVar.getNode(), false);
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
                                p0 p0Var = (p0) cVarL;
                                if (p0Var.getIsAttached() && !g4.h.s(p0Var).getIsDeactivated()) {
                                    if (p0Var.u3().getCanFocus()) {
                                        cVar.d(p0Var);
                                    } else {
                                        i(p0Var, cVar);
                                    }
                                }
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
    }

    private static final p0 j(n2.c<p0> cVar, m3.g gVar, int i15) {
        m3.g gVarT;
        g.Companion companion = g.INSTANCE;
        if (g.l(i15, companion.d())) {
            gVarT = gVar.t((gVar.getRight() - gVar.getLeft()) + 1, 0.0f);
        } else if (g.l(i15, companion.g())) {
            gVarT = gVar.t(-((gVar.getRight() - gVar.getLeft()) + 1), 0.0f);
        } else if (g.l(i15, companion.h())) {
            gVarT = gVar.t(0.0f, (gVar.getBottom() - gVar.getTop()) + 1);
        } else {
            if (!g.l(i15, companion.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            gVarT = gVar.t(0.0f, -((gVar.getBottom() - gVar.getTop()) + 1));
        }
        p0[] p0VarArr = cVar.content;
        int size = cVar.getSize();
        p0 p0Var = null;
        for (int i16 = 0; i16 < size; i16++) {
            p0 p0Var2 = p0VarArr[i16];
            if (s0.g(p0Var2)) {
                m3.g gVarD = s0.d(p0Var2);
                if (m(gVarD, gVarT, gVar, i15)) {
                    p0Var = p0Var2;
                    gVarT = gVarD;
                }
            }
        }
        return p0Var;
    }

    public static final boolean k(p0 p0Var, int i15, er.l<? super p0, Boolean> lVar) {
        m3.g gVarS;
        n2.c cVar = new n2.c(new p0[16], 0);
        i(p0Var, cVar);
        if (cVar.getSize() <= 1) {
            p0 p0Var2 = (p0) (cVar.getSize() == 0 ? null : cVar.content[0]);
            if (p0Var2 != null) {
                return lVar.b(p0Var2).booleanValue();
            }
            return false;
        }
        g.Companion companion = g.INSTANCE;
        if (g.l(i15, companion.b())) {
            i15 = companion.g();
        }
        if (g.l(i15, companion.g()) || g.l(i15, companion.a())) {
            gVarS = s(s0.d(p0Var));
        } else {
            if (!g.l(i15, companion.d()) && !g.l(i15, companion.h())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            gVarS = h(s0.d(p0Var));
        }
        p0 p0VarJ = j(cVar, gVarS, i15);
        if (p0VarJ != null) {
            return lVar.b(p0VarJ).booleanValue();
        }
        return false;
    }

    private static final boolean l(p0 p0Var, m3.g gVar, int i15, er.l<? super p0, Boolean> lVar) {
        if (r(p0Var, gVar, i15, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) l3.a.a(p0Var, i15, new b(g4.h.t(p0Var).getFocusOwner().k(), p0Var, gVar, i15, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(m3.g gVar, m3.g gVar2, m3.g gVar3, int i15) {
        if (!n(gVar, i15, gVar3)) {
            return false;
        }
        if (n(gVar2, i15, gVar3) && !c(gVar3, gVar, gVar2, i15)) {
            return !c(gVar3, gVar2, gVar, i15) && q(i15, gVar3, gVar) < q(i15, gVar3, gVar2);
        }
        return true;
    }

    private static final boolean n(m3.g gVar, int i15, m3.g gVar2) {
        g.Companion companion = g.INSTANCE;
        if (g.l(i15, companion.d())) {
            return (gVar2.getRight() > gVar.getRight() || gVar2.getLeft() >= gVar.getRight()) && gVar2.getLeft() > gVar.getLeft();
        }
        if (g.l(i15, companion.g())) {
            return (gVar2.getLeft() < gVar.getLeft() || gVar2.getRight() <= gVar.getLeft()) && gVar2.getRight() < gVar.getRight();
        }
        if (g.l(i15, companion.h())) {
            return (gVar2.getBottom() > gVar.getBottom() || gVar2.getTop() >= gVar.getBottom()) && gVar2.getTop() > gVar.getTop();
        }
        if (g.l(i15, companion.a())) {
            return (gVar2.getTop() < gVar.getTop() || gVar2.getBottom() <= gVar.getTop()) && gVar2.getBottom() < gVar.getBottom();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0057 A[RETURN] */
    private static final float o(m3.g gVar, int i15, m3.g gVar2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f15;
        g.Companion companion = g.INSTANCE;
        if (!g.l(i15, companion.d())) {
            if (g.l(i15, companion.g())) {
                top = gVar.getLeft();
                bottom = gVar2.getRight();
            } else if (g.l(i15, companion.h())) {
                top2 = gVar2.getTop();
                bottom2 = gVar.getBottom();
            } else {
                if (!g.l(i15, companion.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = gVar.getTop();
                bottom = gVar2.getBottom();
            }
            f15 = top - bottom;
            if (f15 < 0.0f) {
                return 0.0f;
            }
            return f15;
        }
        top2 = gVar2.getLeft();
        bottom2 = gVar.getRight();
        f15 = top2 - bottom2;
        if (f15 < 0.0f) {
            return 0.0f;
        }
        return f15;
    }

    private static final float p(m3.g gVar, int i15, m3.g gVar2) {
        float f15;
        float f16;
        float top;
        float bottom;
        float top2;
        g.Companion companion = g.INSTANCE;
        if (g.l(i15, companion.d()) || g.l(i15, companion.g())) {
            float top3 = gVar2.getTop();
            float bottom2 = gVar2.getBottom() - gVar2.getTop();
            f15 = 2;
            f16 = top3 + (bottom2 / f15);
            top = gVar.getTop();
            bottom = gVar.getBottom();
            top2 = gVar.getTop();
        } else {
            if (!g.l(i15, companion.h()) && !g.l(i15, companion.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float left = gVar2.getLeft();
            float right = gVar2.getRight() - gVar2.getLeft();
            f15 = 2;
            f16 = left + (right / f15);
            top = gVar.getLeft();
            bottom = gVar.getRight();
            top2 = gVar.getLeft();
        }
        return f16 - (top + ((bottom - top2) / f15));
    }

    private static final long q(int i15, m3.g gVar, m3.g gVar2) {
        long jO = (long) o(gVar2, i15, gVar);
        long jP = (long) p(gVar2, i15, gVar);
        return (((long) 13) * jO * jO) + (jP * jP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(p0 p0Var, m3.g gVar, int i15, er.l<? super p0, Boolean> lVar) {
        p0 p0VarJ;
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
                                p0 p0Var2 = (p0) cVarL;
                                if (p0Var2.getIsAttached()) {
                                    cVar.d(p0Var2);
                                }
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
        while (cVar.getSize() != 0 && (p0VarJ = j(cVar, gVar, i15)) != null) {
            if (p0VarJ.u3().getCanFocus()) {
                return lVar.b(p0VarJ).booleanValue();
            }
            if (l(p0VarJ, gVar, i15, lVar)) {
                return true;
            }
            cVar.t(p0VarJ);
        }
        return false;
    }

    private static final m3.g s(m3.g gVar) {
        return new m3.g(gVar.getLeft(), gVar.getTop(), gVar.getLeft(), gVar.getTop());
    }

    public static final Boolean t(p0 p0Var, int i15, m3.g gVar, er.l<? super p0, Boolean> lVar) {
        m0 m0VarD0 = p0Var.d0();
        int[] iArr = a.f115660a;
        int i16 = iArr[m0VarD0.ordinal()];
        if (i16 != 1) {
            if (i16 == 2 || i16 == 3) {
                return Boolean.valueOf(k(p0Var, i15, lVar));
            }
            if (i16 != 4) {
                throw new oq.p();
            }
            if (p0Var.u3().getCanFocus()) {
                return lVar.b(p0Var);
            }
            return gVar == null ? Boolean.valueOf(k(p0Var, i15, lVar)) : Boolean.valueOf(r(p0Var, gVar, i15, lVar));
        }
        p0 p0VarF = s0.f(p0Var);
        if (p0VarF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i17 = iArr[p0VarF.d0().ordinal()];
        if (i17 == 1) {
            Boolean boolT = t(p0VarF, i15, gVar, lVar);
            if (!fr.t.c(boolT, Boolean.FALSE)) {
                return boolT;
            }
            if (gVar == null) {
                gVar = s0.d(b(p0VarF));
            }
            return Boolean.valueOf(l(p0Var, gVar, i15, lVar));
        }
        if (i17 == 2 || i17 == 3) {
            if (gVar == null) {
                gVar = s0.d(p0VarF);
            }
            return Boolean.valueOf(l(p0Var, gVar, i15, lVar));
        }
        if (i17 != 4) {
            throw new oq.p();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
