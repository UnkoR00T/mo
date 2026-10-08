package l3;

import android.os.Trace;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001UBQ\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020$2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0000¢\u0006\u0004\b'\u0010\u0019J\u001f\u0010*\u001a\u00020\r2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\fH\u0000¢\u0006\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R(\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010-R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010-R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010>\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/R*\u0010\b\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010M\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010P\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0013\u0010T\u001a\u0004\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006V"}, d2 = {"Ll3/p0;", "Lg4/e;", "Lg4/y;", "Ll3/n0;", "Lg4/v0;", "Lf4/h;", "Lf3/m$c;", "Ll3/t0;", "focusability", "", "isInteropViewHost", "Lkotlin/Function2;", "Ll3/l0;", "Loq/i0;", "onFocusChange", "Lkotlin/Function1;", "onDispatchEventsCompleted", "<init>", "(IZLer/p;Ler/l;Lfr/k;)V", "Ll3/g;", "focusDirection", "s3", "(I)Z", "Q", "T0", "()V", "Y2", "X2", "Le4/b0;", "coordinates", "E", "(Le4/b0;)V", "Ll3/v;", "u3", "()Ll3/v;", "relativeCoordinates", "Lm3/g;", "v3", "(Le4/b0;)Lm3/g;", "A3", "previousState", "newState", "t3", "(Ll3/l0;Ll3/l0;)V", "r", "Z", "B3", "()Z", "s", "Ler/p;", "t", "Ler/l;", "v", "isProcessingCustomExit", "w", "isProcessingCustomEnter", "Ll3/m0;", "x", "Ll3/m0;", "committedFocusState", "y", "R2", "shouldAutoInvalidate", "value", "z", "I", "z3", "()I", "setFocusability-josRg5g", "(I)V", "", "A", "Ljava/lang/Integer;", "getPreviouslyFocusedChildHash", "()Ljava/lang/Integer;", "C3", "(Ljava/lang/Integer;)V", "previouslyFocusedChildHash", "y3", "()Ll3/m0;", "focusState", "Le4/h;", "x3", "()Le4/h;", "beyondBoundsLayoutParent", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 extends f3.m.c implements g4.e, g4.y, n0, g4.v0, f4.h {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Integer previouslyFocusedChildHash;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean isInteropViewHost;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final er.p<l0, l0, oq.i0> onFocusChange;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final er.l<p0, oq.i0> onDispatchEventsCompleted;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessingCustomExit;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessingCustomEnter;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private m0 committedFocusState;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private int focusability;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ll3/p0$a;", "Lg4/l0;", "Ll3/p0;", "<init>", "()V", "a", "()Ll3/p0;", "node", "Loq/i0;", "l", "(Ll3/p0;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends g4.l0<p0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f115599d = new a();

        private a() {
        }

        @Override // g4.l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 create() {
            return new p0(0, false, null, null, 15, null);
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return 1739042953;
        }

        @Override // g4.l0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void update(p0 node) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f115601b;

        static {
            int[] iArr = new int[l3.c.values().length];
            try {
                iArr[l3.c.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l3.c.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l3.c.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l3.c.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f115600a = iArr;
            int[] iArr2 = new int[m0.values().length];
            try {
                iArr2[m0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[m0.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[m0.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[m0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f115601b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class c extends fr.w implements er.a<oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fr.p0<v> f115602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0 f115603c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fr.p0<v> p0Var, p0 p0Var2) {
            super(0);
            this.f115602b = p0Var;
            this.f115603c = p0Var2;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            c();
            return oq.i0.f148189a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, l3.v] */
        public final void c() {
            this.f115602b.f66410a = this.f115603c.u3();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll3/p0;", "it", "", "c", "(Ll3/p0;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class d extends fr.w implements er.l<p0, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f115604b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i15) {
            super(1);
            this.f115604b = i15;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(p0 p0Var) {
            return Boolean.valueOf(p0Var.s3(this.f115604b));
        }
    }

    public /* synthetic */ p0(int i15, boolean z15, er.p pVar, er.l lVar, fr.k kVar) {
        this(i15, z15, pVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s3(int focusDirection) {
        int i15 = b.f115600a[r0.h(this, focusDirection).ordinal()];
        if (i15 == 1) {
            return r0.i(this);
        }
        if (i15 == 2) {
            return true;
        }
        if (i15 == 3 || i15 == 4) {
            return false;
        }
        throw new oq.p();
    }

    public static /* synthetic */ m3.g w3(p0 p0Var, p036e4.b0 b0Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = null;
        }
        return p0Var.v3(b0Var);
    }

    public final void A3() {
        int i15 = b.f115601b[d0().ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3 && i15 != 4) {
                throw new oq.p();
            }
        } else {
            fr.p0 p0Var = new fr.p0();
            g4.w0.a(this, new c(p0Var, this));
            T t15 = p0Var.f66410a;
            if ((t15 == 0 ? null : (v) t15).getCanFocus()) {
                return;
            }
            g4.h.t(this).getFocusOwner().B(true);
        }
    }

    /* JADX INFO: renamed from: B3, reason: from getter */
    public final boolean getIsInteropViewHost() {
        return this.isInteropViewHost;
    }

    public final void C3(Integer num) {
        this.previouslyFocusedChildHash = num;
    }

    @Override // g4.y
    public void E(p036e4.b0 coordinates) {
        if (f3.h.isInitialFocusOnFocusableAvailable) {
            g4.h.t(getNode()).getFocusOwner().a();
        }
    }

    @Override // l3.n0
    public boolean Q(int focusDirection) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return u3().getCanFocus() ? s3(focusDirection) : x0.k(this, focusDirection, new d(focusDirection));
        } finally {
            Trace.endSection();
        }
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // g4.v0
    public void T0() {
        A3();
    }

    @Override // f3.m.c
    public void X2() {
        int i15 = b.f115601b[d0().ordinal()];
        if (i15 == 1 || i15 == 2) {
            s focusOwner = g4.h.t(this).getFocusOwner();
            focusOwner.v(true, true, false, g.INSTANCE.c());
            if (this.isInteropViewHost) {
                focusOwner.c(null, null);
            }
            focusOwner.n();
        } else if (i15 == 3) {
            s focusOwner2 = g4.h.t(this).getFocusOwner();
            p0 p0VarB = s0.b(this);
            if (p0VarB != null && p0VarB.isInteropViewHost) {
                focusOwner2.c(null, null);
                focusOwner2.n();
            }
        } else if (i15 != 4) {
            throw new oq.p();
        }
        this.committedFocusState = null;
        this.previouslyFocusedChildHash = null;
    }

    @Override // f3.m.c
    public void Y2() {
        if (d0().b()) {
            g4.h.t(this).getFocusOwner().v(true, true, true, g.INSTANCE.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    public final void t3(l0 previousState, l0 newState) {
        g4.p0 nodes;
        er.p<l0, l0, oq.i0> pVar;
        s focusOwner = g4.h.t(this).getFocusOwner();
        p0 p0VarK = focusOwner.k();
        if (!fr.t.c(previousState, newState) && (pVar = this.onFocusChange) != null) {
            pVar.B(previousState, newState);
        }
        int iA = g4.s0.a(PKIFailureInfo.certConfirmed);
        int iA2 = g4.s0.a(1024);
        f3.m.c node = getNode();
        int i15 = iA | iA2;
        if (!getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        f3.m.c node2 = getNode();
        androidx.compose.ui.node.g gVarS = g4.h.s(this);
        loop0: while (gVarS != null) {
            if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & i15) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i15) != 0) {
                        if (node2 != node && (node2.getKindSet() & iA2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & iA) != 0) {
                            f3.m.c cVarL = node2;
                            n2.c cVar = null;
                            while (cVarL != 0) {
                                if (cVarL instanceof j) {
                                    j jVar = (j) cVarL;
                                    if (p0VarK == focusOwner.k()) {
                                        jVar.i(newState);
                                    }
                                } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                    f3.m.c delegate = ((g4.j) cVarL).getDelegate();
                                    int i16 = 0;
                                    cVarL = cVarL;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                cVarL = delegate;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new n2.c(new f3.m.c[16], 0);
                                                }
                                                if (cVarL != 0) {
                                                    cVar.d(cVarL);
                                                    cVarL = 0;
                                                }
                                                cVar.d(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        cVarL = cVarL;
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                cVarL = g4.h.l(cVar);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            gVarS = gVarS.C0();
            node2 = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
        }
        er.l<p0, oq.i0> lVar = this.onDispatchEventsCompleted;
        if (lVar != null) {
            lVar.b(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    public final v u3() {
        g4.p0 nodes;
        x xVar = new x();
        xVar.j(t0.d(getFocusability(), this));
        int iA = g4.s0.a(2048);
        int iA2 = g4.s0.a(1024);
        f3.m.c node = getNode();
        int i15 = iA | iA2;
        if (!getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        f3.m.c node2 = getNode();
        androidx.compose.ui.node.g gVarS = g4.h.s(this);
        while (gVarS != null) {
            if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & i15) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i15) != 0) {
                        if (node2 != node && (node2.getKindSet() & iA2) != 0) {
                            return xVar;
                        }
                        if ((node2.getKindSet() & iA) != 0) {
                            f3.m.c cVarL = node2;
                            n2.c cVar = null;
                            while (cVarL != 0) {
                                if (cVarL instanceof z) {
                                    ((z) cVarL).I0(xVar);
                                } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                    f3.m.c delegate = ((g4.j) cVarL).getDelegate();
                                    int i16 = 0;
                                    cVarL = cVarL;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                cVarL = delegate;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new n2.c(new f3.m.c[16], 0);
                                                }
                                                if (cVarL != 0) {
                                                    cVar.d(cVarL);
                                                    cVarL = 0;
                                                }
                                                cVar.d(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        cVarL = cVarL;
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                cVarL = g4.h.l(cVar);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            gVarS = gVarS.C0();
            node2 = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
        }
        return xVar;
    }

    public final m3.g v3(p036e4.b0 relativeCoordinates) {
        m3.g gVarY;
        m3.g gVarD = u3().getFocusRect();
        if (gVarD != v.INSTANCE.a()) {
            return relativeCoordinates == null ? gVarD : gVarD.u(p036e4.b0.O(relativeCoordinates, g4.h.q(this), 0L, false, 6, null));
        }
        return (relativeCoordinates == null || (gVarY = relativeCoordinates.Y(g4.h.q(this), false)) == null) ? m3.h.c(m3.e.INSTANCE.c(), c5.s.e(g4.h.q(this).b())) : gVarY;
    }

    public final p036e4.h x3() {
        return g4.h.f(this);
    }

    @Override // l3.n0
    /* JADX INFO: renamed from: y3, reason: merged with bridge method [inline-methods] */
    public m0 d0() {
        s focusOwner;
        p0 p0VarK;
        g4.p0 nodes;
        if (getIsAttached() && (p0VarK = (focusOwner = g4.h.t(this).getFocusOwner()).k()) != null) {
            if (this == p0VarK) {
                return focusOwner.t() ? m0.Captured : m0.Active;
            }
            if (p0VarK.getIsAttached()) {
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
                                f3.m.c cVarL = parent;
                                n2.c cVar = null;
                                while (cVarL != null) {
                                    if (cVarL instanceof p0) {
                                        if (this == ((p0) cVarL)) {
                                            return m0.ActiveParent;
                                        }
                                    } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                        int i15 = 0;
                                        for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & iA) != 0) {
                                                i15++;
                                                if (i15 == 1) {
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
                                        if (i15 == 1) {
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
            }
            return m0.Inactive;
        }
        return m0.Inactive;
    }

    /* JADX INFO: renamed from: z3, reason: from getter */
    public int getFocusability() {
        return this.focusability;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private p0(int i15, boolean z15, er.p<? super l0, ? super l0, oq.i0> pVar, er.l<? super p0, oq.i0> lVar) {
        this.isInteropViewHost = z15;
        this.onFocusChange = pVar;
        this.onDispatchEventsCompleted = lVar;
        this.focusability = i15;
    }

    public /* synthetic */ p0(int i15, boolean z15, er.p pVar, er.l lVar, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? t0.INSTANCE.a() : i15, (i16 & 2) != 0 ? false : z15, (i16 & 4) != 0 ? null : pVar, (i16 & 8) != 0 ? null : lVar, null);
    }
}
