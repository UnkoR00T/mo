package androidx.compose.ui.node;

import android.os.Trace;
import fr.t;
import g4.h0;
import g4.x;
import g4.y0;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u0014J\u001f\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\t¢\u0006\u0004\b#\u0010\u0014J\u001f\u0010$\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\t¢\u0006\u0004\b$\u0010\u0014J\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\t¢\u0006\u0004\b%\u0010\u0014J\u0015\u0010&\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0005J\u001f\u0010)\u001a\u00020\t2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\r¢\u0006\u0004\b+\u0010\u0011J\u001d\u0010,\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b2\u0010\u001aJ\u0017\u00104\u001a\u00020\r2\b\b\u0002\u00103\u001a\u00020\t¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b6\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010B\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u00105R\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010>R\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020.0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010IR$\u0010P\u001a\u00020K2\u0006\u0010L\u001a\u00020K8F@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010$\u001a\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010IR\u0018\u0010T\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010SR\u0016\u0010W\u001a\u0004\u0018\u00010U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010VR\u0018\u0010Z\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0018\u0010\\\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0018\u0010^\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010YR\u0018\u0010`\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010YR\u0018\u0010b\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010YR\u0018\u0010d\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010YR\u0011\u0010f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\be\u0010@R\u0011\u0010h\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bg\u0010@R$\u0010j\u001a\u0004\u0018\u00010i8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006p"}, d2 = {"Landroidx/compose/ui/node/m;", "", "Landroidx/compose/ui/node/g;", "root", "<init>", "(Landroidx/compose/ui/node/g;)V", "layoutNode", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "", "h", "(Landroidx/compose/ui/node/g;Lc5/b;)Z", "i", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "k", "e", "()V", "affectsLookahead", "E", "(Landroidx/compose/ui/node/g;Z)Z", "shouldTraceMeasure", "F", "(Landroidx/compose/ui/node/g;ZZ)Z", "j", "I", "(Landroidx/compose/ui/node/g;Z)V", "node", "C", "m", "A", "Q", "(J)V", "forced", "K", "N", "J", "M", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Lkotlin/Function0;", "onLayout", "x", "(Ler/a;)Z", "z", "y", "(Landroidx/compose/ui/node/g;J)V", "Landroidx/compose/ui/node/Owner$b;", "listener", ip.a.f96138c, "(Landroidx/compose/ui/node/Owner$b;)V", "l", "forceDispatch", "f", "(Z)V", "B", "a", "Landroidx/compose/ui/node/g;", "Lg4/m;", "b", "Lg4/m;", "relayoutNodes", "c", "Z", "p", "()Z", "setDuringMeasureLayout$ui", "duringMeasureLayout", "d", "duringFullMeasureLayoutPass", "Lg4/y0;", "Lg4/y0;", "onPositionedDispatcher", "Ln2/c;", "Ln2/c;", "onLayoutCompletedListeners", "", "value", "g", "t", "()J", "measureIteration", "Landroidx/compose/ui/node/m$a;", "postponedMeasureRequests", "Lc5/b;", "rootConstraints", "Landroidx/compose/ui/node/i;", "Landroidx/compose/ui/node/i;", "consistencyChecker", "w", "(Landroidx/compose/ui/node/g;)Z", "isUsedInMeasureOrLayout", "v", "remeasureCanAffectParentSize", "u", "measuredByPlacedParent", "o", "canAffectPlacedParent", "n", "canAffectParentInLookahead", "s", "lookaheadRemeasureCanAffectParentSize", "q", "hasPendingMeasureOrLayout", "r", "hasPendingOnPositionedCallbacks", "Landroidx/compose/ui/node/q$a;", "uncaughtExceptionHandler", "Landroidx/compose/ui/node/q$a;", "getUncaughtExceptionHandler$ui", "()Landroidx/compose/ui/node/q$a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Landroidx/compose/ui/node/q$a;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g4.m relayoutNodes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean duringMeasureLayout;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean duringFullMeasureLayoutPass;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y0 onPositionedDispatcher;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n2.c<Owner.b> onLayoutCompletedListeners;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long measureIteration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final n2.c<a> postponedMeasureRequests;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private c5.b rootConstraints;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i consistencyChecker;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/m$a;", "", "Landroidx/compose/ui/node/g;", "node", "", "isLookahead", "isForced", "<init>", "(Landroidx/compose/ui/node/g;ZZ)V", "a", "Landroidx/compose/ui/node/g;", "()Landroidx/compose/ui/node/g;", "b", "Z", "c", "()Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final g node;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isLookahead;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isForced;

        public a(g gVar, boolean z15, boolean z16) {
            this.node = gVar;
            this.isLookahead = z15;
            this.isForced = z16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final g getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10235a;

        static {
            int[] iArr = new int[g.e.values().length];
            try {
                iArr[g.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f10235a = iArr;
        }
    }

    public m(g gVar) {
        this.root = gVar;
        Owner.Companion companion = Owner.INSTANCE;
        g4.m mVar = new g4.m(companion.a());
        this.relayoutNodes = mVar;
        this.onPositionedDispatcher = new y0();
        this.onLayoutCompletedListeners = new n2.c<>(new Owner.b[16], 0);
        this.measureIteration = 1L;
        n2.c<a> cVar = new n2.c<>(new a[16], 0);
        this.postponedMeasureRequests = cVar;
        this.consistencyChecker = companion.a() ? new i(gVar, mVar, cVar.i()) : null;
    }

    private final boolean A(g gVar, boolean z15) {
        return z15 ? gVar.k0() : gVar.p0();
    }

    private final void C(g node, boolean affectsLookahead) {
        if (A(node, affectsLookahead)) {
            G(this, node, affectsLookahead, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E(g layoutNode, boolean affectsLookahead) {
        boolean zI;
        g gVarC0;
        boolean zH;
        boolean z15 = false;
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if (w(layoutNode)) {
            c5.b bVar = layoutNode == this.root ? this.rootConstraints : null;
            if (affectsLookahead) {
                if (layoutNode.k0()) {
                    if (e3.g.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:lookaheadMeasure");
                        try {
                            zH = h(layoutNode, bVar);
                            Trace.endSection();
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    } else {
                        zH = h(layoutNode, bVar);
                    }
                    z15 = zH;
                }
                if ((z15 || layoutNode.j0()) && t.c(layoutNode.c1(), Boolean.TRUE)) {
                    if (e3.g.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:lookaheadLayout");
                        try {
                            layoutNode.g1();
                            i0 i0Var = i0.f148189a;
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    } else {
                        layoutNode.g1();
                    }
                }
            } else {
                if (!layoutNode.p0()) {
                    zI = false;
                } else if (e3.g.isVerboseTracingEnabled) {
                    Trace.beginSection("Compose:measure");
                    try {
                        zI = i(layoutNode, bVar);
                        Trace.endSection();
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                } else {
                    zI = i(layoutNode, bVar);
                }
                if (layoutNode.h0() && (layoutNode == this.root || ((gVarC0 = layoutNode.C0()) != null && gVarC0.p() && layoutNode.b1()))) {
                    if (e3.g.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:layout");
                        try {
                            if (layoutNode == this.root) {
                                layoutNode.y1(0, 0);
                            } else {
                                layoutNode.E1();
                            }
                            i0 i0Var2 = i0.f148189a;
                            Trace.endSection();
                        } catch (Throwable th7) {
                            Trace.endSection();
                            throw th7;
                        }
                    } else if (layoutNode == this.root) {
                        layoutNode.y1(0, 0);
                    } else {
                        layoutNode.E1();
                    }
                    this.onPositionedDispatcher.d(layoutNode);
                    i iVar = this.consistencyChecker;
                    if (iVar != null) {
                        iVar.a();
                    }
                }
                z15 = zI;
            }
            j();
        }
        return z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F(g layoutNode, boolean affectsLookahead, boolean shouldTraceMeasure) {
        boolean zI;
        boolean z15 = false;
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if (w(layoutNode)) {
            c5.b bVar = layoutNode == this.root ? this.rootConstraints : null;
            if (affectsLookahead) {
                if (layoutNode.k0()) {
                    if (e3.g.isVerboseTracingEnabled && shouldTraceMeasure) {
                        Trace.beginSection("Compose:lookaheadMeasure");
                        try {
                            zI = h(layoutNode, bVar);
                            Trace.endSection();
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    } else {
                        zI = h(layoutNode, bVar);
                    }
                    z15 = zI;
                }
            } else if (layoutNode.p0()) {
                if (e3.g.isVerboseTracingEnabled && shouldTraceMeasure) {
                    Trace.beginSection("Compose:measure");
                    try {
                        zI = i(layoutNode, bVar);
                        Trace.endSection();
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                } else {
                    zI = i(layoutNode, bVar);
                }
                z15 = zI;
            }
            j();
        }
        return z15;
    }

    static /* synthetic */ boolean G(m mVar, g gVar, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        return mVar.F(gVar, z15, z16);
    }

    private final void H(g layoutNode) {
        n2.c<g> cVarL0 = layoutNode.L0();
        g[] gVarArr = cVarL0.content;
        int iO = cVarL0.getSize();
        for (int i15 = 0; i15 < iO; i15++) {
            g gVar = gVarArr[i15];
            if (v(gVar)) {
                if (h0.a(gVar)) {
                    I(gVar, true);
                } else {
                    H(gVar);
                }
            }
        }
    }

    private final void I(g layoutNode, boolean affectsLookahead) {
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        c5.b bVar = layoutNode == this.root ? this.rootConstraints : null;
        if (affectsLookahead) {
            h(layoutNode, bVar);
        } else {
            i(layoutNode, bVar);
        }
    }

    public static /* synthetic */ boolean O(m mVar, g gVar, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return mVar.N(gVar, z15);
    }

    private final void e() {
        n2.c<Owner.b> cVar = this.onLayoutCompletedListeners;
        Owner.b[] bVarArr = cVar.content;
        int iO = cVar.getSize();
        for (int i15 = 0; i15 < iO; i15++) {
            bVarArr[i15].q();
        }
        this.onLayoutCompletedListeners.j();
    }

    public static /* synthetic */ void g(m mVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        mVar.f(z15);
    }

    private final boolean h(g layoutNode, c5.b constraints) {
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        boolean zE1 = constraints != null ? layoutNode.e1(constraints) : g.f1(layoutNode, null, 1, null);
        g gVarC0 = layoutNode.C0();
        if (zE1 && gVarC0 != null) {
            if (gVarC0.getLookaheadRoot() == null) {
                g.O1(gVarC0, false, false, false, 3, null);
                return zE1;
            }
            if (layoutNode.s0() == g.EnumC0220g.InMeasureBlock) {
                g.J1(gVarC0, false, false, false, 3, null);
                return zE1;
            }
            if (layoutNode.s0() == g.EnumC0220g.InLayoutBlock) {
                g.H1(gVarC0, false, 1, null);
            }
        }
        return zE1;
    }

    private final boolean i(g layoutNode, c5.b constraints) {
        boolean zA1 = constraints != null ? layoutNode.A1(constraints) : g.B1(layoutNode, null, 1, null);
        g gVarC0 = layoutNode.C0();
        if (zA1 && gVarC0 != null) {
            if (layoutNode.r0() == g.EnumC0220g.InMeasureBlock) {
                g.O1(gVarC0, false, false, false, 3, null);
                return zA1;
            }
            if (layoutNode.r0() == g.EnumC0220g.InLayoutBlock) {
                g.M1(gVarC0, false, 1, null);
            }
        }
        return zA1;
    }

    private final void j() {
        if (this.postponedMeasureRequests.getSize() != 0) {
            n2.c<a> cVar = this.postponedMeasureRequests;
            a[] aVarArr = cVar.content;
            int iO = cVar.getSize();
            for (int i15 = 0; i15 < iO; i15++) {
                a aVar = aVarArr[i15];
                if (aVar.getNode().c()) {
                    if (aVar.getIsLookahead()) {
                        g.J1(aVar.getNode(), aVar.getIsForced(), false, false, 2, null);
                    } else {
                        g.O1(aVar.getNode(), aVar.getIsForced(), false, false, 2, null);
                    }
                }
            }
            this.postponedMeasureRequests.j();
        }
    }

    private final void k(g layoutNode) {
        n2.c<g> cVarL0 = layoutNode.L0();
        g[] gVarArr = cVarL0.content;
        int iO = cVarL0.getSize();
        for (int i15 = 0; i15 < iO; i15++) {
            g gVar = gVarArr[i15];
            if (t.c(gVar.c1(), Boolean.TRUE) && !gVar.getIsDeactivated()) {
                if (this.relayoutNodes.f(gVar, true)) {
                    gVar.g1();
                }
                k(gVar);
            }
        }
    }

    private final void m(g layoutNode, boolean affectsLookahead) {
        n2.c<g> cVarL0 = layoutNode.L0();
        g[] gVarArr = cVarL0.content;
        int iO = cVarL0.getSize();
        for (int i15 = 0; i15 < iO; i15++) {
            g gVar = gVarArr[i15];
            if ((!affectsLookahead && v(gVar)) || (affectsLookahead && s(gVar))) {
                if (h0.a(gVar) && !affectsLookahead) {
                    if (gVar.k0() && this.relayoutNodes.f(gVar, true)) {
                        G(this, gVar, true, false, 4, null);
                    } else {
                        l(gVar, true);
                    }
                }
                C(gVar, affectsLookahead);
                if (!A(gVar, affectsLookahead)) {
                    m(gVar, affectsLookahead);
                }
            }
        }
        C(layoutNode, affectsLookahead);
    }

    private final boolean n(g gVar) {
        g4.b bVarO;
        g4.a aVarI;
        if (gVar.k0()) {
            return (gVar.s0() == g.EnumC0220g.NotUsed && ((bVarO = gVar.getLayoutDelegate().o()) == null || (aVarI = bVarO.getAlignmentLines()) == null || !aVarI.k())) ? false : true;
        }
        return false;
    }

    private final boolean o(g gVar) {
        return gVar.p0() && u(gVar);
    }

    private final boolean s(g gVar) {
        g4.b bVarO;
        g4.a aVarI;
        return gVar.s0() == g.EnumC0220g.InMeasureBlock || !((bVarO = gVar.getLayoutDelegate().o()) == null || (aVarI = bVarO.getAlignmentLines()) == null || !aVarI.k());
    }

    private final boolean u(g gVar) {
        do {
            if (gVar.r0() == g.EnumC0220g.NotUsed && !gVar.getLayoutDelegate().b().getAlignmentLines().k()) {
                g gVarC0 = gVar.C0();
                if ((gVarC0 != null ? gVarC0.i0() : null) != g.e.Measuring) {
                    return false;
                }
            }
            gVar = gVar.C0();
            if (gVar == null) {
                return false;
            }
        } while (!gVar.p());
        return true;
    }

    private final boolean v(g gVar) {
        return gVar.r0() == g.EnumC0220g.InMeasureBlock || gVar.getLayoutDelegate().b().getAlignmentLines().k();
    }

    private final boolean w(g gVar) {
        return gVar.p() || gVar.b1() || o(gVar) || t.c(gVar.c1(), Boolean.TRUE) || n(gVar) || gVar.M();
    }

    public final void B(g node) {
        this.relayoutNodes.j(node);
        this.onPositionedDispatcher.f(node);
    }

    public final void D(Owner.b listener) {
        this.onLayoutCompletedListeners.d(listener);
    }

    public final boolean J(g layoutNode, boolean forced) {
        int i15 = b.f10235a[layoutNode.i0().ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    if (i15 != 4 && i15 != 5) {
                        throw new oq.p();
                    }
                }
            }
            if ((layoutNode.k0() || layoutNode.j0()) && !forced) {
                i iVar = this.consistencyChecker;
                if (iVar != null) {
                    iVar.a();
                }
                return false;
            }
            layoutNode.i1();
            layoutNode.h1();
            if (layoutNode.getIsDeactivated()) {
                return false;
            }
            g gVarC0 = layoutNode.C0();
            if (t.c(layoutNode.c1(), Boolean.TRUE) && ((gVarC0 == null || !gVarC0.k0()) && (gVarC0 == null || !gVarC0.j0()))) {
                this.relayoutNodes.d(layoutNode, x.LookaheadPlacement);
            } else if (layoutNode.p() && ((gVarC0 == null || !gVarC0.h0()) && (gVarC0 == null || !gVarC0.p0()))) {
                this.relayoutNodes.d(layoutNode, x.Placement);
            }
            return !this.duringFullMeasureLayoutPass;
        }
        i iVar2 = this.consistencyChecker;
        if (iVar2 != null) {
            iVar2.a();
        }
        return false;
    }

    public final boolean K(g layoutNode, boolean forced) {
        g gVarC0;
        g gVarC1;
        if (!(layoutNode.getLookaheadRoot() != null)) {
            d4.a.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i15 = b.f10235a[layoutNode.i0().ordinal()];
        if (i15 != 1) {
            if (i15 != 2 && i15 != 3 && i15 != 4) {
                if (i15 != 5) {
                    throw new oq.p();
                }
                if (layoutNode.k0() && !forced) {
                    return false;
                }
                layoutNode.j1();
                layoutNode.k1();
                if (layoutNode.getIsDeactivated()) {
                    return false;
                }
                if ((t.c(layoutNode.c1(), Boolean.TRUE) || n(layoutNode)) && ((gVarC0 = layoutNode.C0()) == null || !gVarC0.k0())) {
                    this.relayoutNodes.d(layoutNode, x.LookaheadMeasurement);
                } else if ((layoutNode.p() || o(layoutNode)) && ((gVarC1 = layoutNode.C0()) == null || !gVarC1.p0())) {
                    this.relayoutNodes.d(layoutNode, x.Measurement);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.d(new a(layoutNode, true, forced));
            i iVar = this.consistencyChecker;
            if (iVar != null) {
                iVar.a();
            }
        }
        return false;
    }

    public final void L(g layoutNode) {
        this.onPositionedDispatcher.d(layoutNode);
    }

    public final boolean M(g layoutNode, boolean forced) {
        int i15 = b.f10235a[layoutNode.i0().ordinal()];
        if (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) {
            i iVar = this.consistencyChecker;
            if (iVar != null) {
                iVar.a();
            }
            return false;
        }
        if (i15 != 5) {
            throw new oq.p();
        }
        g gVarC0 = layoutNode.C0();
        boolean z15 = gVarC0 == null || gVarC0.p();
        if (!forced && (layoutNode.p0() || (layoutNode.h0() && layoutNode.p() == z15 && layoutNode.p() == layoutNode.b1()))) {
            i iVar2 = this.consistencyChecker;
            if (iVar2 != null) {
                iVar2.a();
            }
            return false;
        }
        layoutNode.h1();
        if (!layoutNode.getIsDeactivated() && layoutNode.b1() && z15) {
            if ((gVarC0 == null || !gVarC0.h0()) && (gVarC0 == null || !gVarC0.p0())) {
                this.relayoutNodes.d(layoutNode, x.Placement);
            }
            if (!this.duringFullMeasureLayoutPass) {
                return true;
            }
        }
        return false;
    }

    public final boolean N(g layoutNode, boolean forced) {
        int i15 = b.f10235a[layoutNode.i0().ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3 && i15 != 4) {
                if (i15 != 5) {
                    throw new oq.p();
                }
                if (layoutNode.p0() && !forced) {
                    return false;
                }
                layoutNode.k1();
                if (layoutNode.getIsDeactivated()) {
                    return false;
                }
                if (!layoutNode.p() && !o(layoutNode)) {
                    return false;
                }
                g gVarC0 = layoutNode.C0();
                if (gVarC0 == null || !gVarC0.p0()) {
                    this.relayoutNodes.d(layoutNode, x.Measurement);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.d(new a(layoutNode, false, forced));
            i iVar = this.consistencyChecker;
            if (iVar != null) {
                iVar.a();
            }
        }
        return false;
    }

    public final void P(q.a aVar) {
    }

    public final void Q(long constraints) {
        c5.b bVar = this.rootConstraints;
        if (bVar == null ? false : c5.b.f(bVar.getValue(), constraints)) {
            return;
        }
        if (this.duringMeasureLayout) {
            d4.a.a("updateRootConstraints called while measuring");
        }
        this.rootConstraints = c5.b.a(constraints);
        if (this.root.getLookaheadRoot() != null) {
            this.root.j1();
        }
        this.root.k1();
        g4.m mVar = this.relayoutNodes;
        g gVar = this.root;
        mVar.d(gVar, gVar.getLookaheadRoot() != null ? x.LookaheadMeasurement : x.Measurement);
    }

    public final void f(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.e(this.root);
        }
        if (this.onPositionedDispatcher.c()) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                this.onPositionedDispatcher.a();
                i0 i0Var = i0.f148189a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void l(g layoutNode, boolean affectsLookahead) {
        if (!this.duringMeasureLayout) {
            d4.a.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (A(layoutNode, affectsLookahead)) {
            d4.a.a("node not yet measured");
        }
        m(layoutNode, affectsLookahead);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getDuringMeasureLayout() {
        return this.duringMeasureLayout;
    }

    public final boolean q() {
        return this.relayoutNodes.i();
    }

    public final boolean r() {
        return this.onPositionedDispatcher.c();
    }

    public final long t() {
        if (!this.duringMeasureLayout) {
            d4.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    public final boolean x(er.a<i0> onLayout) {
        boolean z15;
        g gVarD;
        boolean z16;
        boolean z17;
        boolean zF;
        if (!this.root.c()) {
            d4.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.p()) {
            d4.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            d4.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z18 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = true;
            try {
                if (this.relayoutNodes.i()) {
                    g4.m mVar = this.relayoutNodes;
                    z15 = false;
                    while (true) {
                        if (!mVar.lookaheadAndAncestorMeasureSet.c()) {
                            gVarD = mVar.lookaheadAndAncestorMeasureSet.d();
                            z17 = gVarD.getLookaheadRoot() != null;
                            z16 = false;
                        } else if (!mVar.lookaheadAndAncestorPlaceSet.c()) {
                            gVarD = mVar.lookaheadAndAncestorPlaceSet.d();
                            z17 = gVarD.getLookaheadRoot() != null;
                            z16 = true;
                        } else {
                            if (mVar.approachSet.c()) {
                                break;
                            }
                            gVarD = mVar.approachSet.d();
                            z16 = true;
                            z17 = false;
                        }
                        if (z16) {
                            zF = E(gVarD, z17);
                        } else {
                            zF = F(gVarD, z17, true);
                            if (gVarD.j0()) {
                                this.relayoutNodes.d(gVarD, x.LookaheadPlacement);
                            }
                            if (gVarD.h0()) {
                                this.relayoutNodes.d(gVarD, x.Placement);
                            }
                        }
                        if (gVarD == this.root && zF) {
                            z15 = true;
                        }
                    }
                    if (onLayout != null) {
                        onLayout.a();
                    }
                } else {
                    z15 = false;
                }
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                i iVar = this.consistencyChecker;
                if (iVar != null) {
                    iVar.a();
                }
                z18 = z15;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    throw th5;
                }
            }
        }
        e();
        return z18;
    }

    public final void y(g layoutNode, long constraints) {
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (t.c(layoutNode, this.root)) {
            d4.a.a("measureAndLayout called on root");
        }
        if (!this.root.c()) {
            d4.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.p()) {
            d4.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            d4.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = false;
            try {
                this.relayoutNodes.j(layoutNode);
                if (h(layoutNode, c5.b.a(constraints)) || layoutNode.j0()) {
                    if (t.c(layoutNode.c1(), Boolean.TRUE)) {
                        layoutNode.g1();
                    }
                }
                k(layoutNode);
                i(layoutNode, c5.b.a(constraints));
                if (layoutNode.h0() && layoutNode.p()) {
                    layoutNode.E1();
                    this.onPositionedDispatcher.d(layoutNode);
                }
                j();
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                i iVar = this.consistencyChecker;
                if (iVar != null) {
                    iVar.a();
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    throw th5;
                }
            }
        }
        e();
    }

    public final void z() {
        if (this.relayoutNodes.i()) {
            if (!this.root.c()) {
                d4.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.p()) {
                d4.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                d4.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                this.duringFullMeasureLayoutPass = false;
                try {
                    if (e3.g.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:lookaheadRemeasure");
                        try {
                            if (this.relayoutNodes.g()) {
                                if (this.root.getLookaheadRoot() != null) {
                                    I(this.root, true);
                                } else {
                                    H(this.root);
                                }
                            }
                            i0 i0Var = i0.f148189a;
                            Trace.endSection();
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    } else if (this.relayoutNodes.g()) {
                        if (this.root.getLookaheadRoot() != null) {
                            I(this.root, true);
                        } else {
                            H(this.root);
                        }
                    }
                    if (e3.g.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:remeasure");
                        try {
                            I(this.root, false);
                            i0 i0Var2 = i0.f148189a;
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    } else {
                        I(this.root, false);
                    }
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    i iVar = this.consistencyChecker;
                    if (iVar != null) {
                        iVar.a();
                    }
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        this.duringMeasureLayout = false;
                        this.duringFullMeasureLayoutPass = false;
                        throw th7;
                    }
                }
            }
        }
    }
}
