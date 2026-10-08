package l3;

import android.view.KeyEvent;
import androidx.compose.ui.node.Owner;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J/\u0010(\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b,\u0010+J\u001f\u0010.\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010/J7\u00103\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u00010\u001a2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b01H\u0016¢\u0006\u0004\b3\u00104J%\u00107\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b05H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b9\u0010\u0017J%\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020:2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b05H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\b2\u0006\u0010;\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020 H\u0016¢\u0006\u0004\bA\u0010\"J\u000f\u0010B\u001a\u00020 H\u0016¢\u0006\u0004\bB\u0010\"J\u0017\u0010D\u001a\u00020 2\u0006\u0010C\u001a\u00020\rH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020 2\u0006\u0010C\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020 H\u0016¢\u0006\u0004\bI\u0010\"J\u0011\u0010J\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\bH\u0016¢\u0006\u0004\bN\u0010MR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010OR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010PR\"\u0010T\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010Q\u001a\u0004\bR\u0010\u000f\"\u0004\bS\u0010ER\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010VR\u001a\u0010\\\u001a\u00020X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010Y\u001a\u0004\bZ\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010^R \u0010f\u001a\b\u0012\u0004\u0012\u00020a0`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR.\u0010j\u001a\u0004\u0018\u00010\r2\b\u0010g\u001a\u0004\u0018\u00010\r8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010Q\u001a\u0004\bh\u0010\u000f\"\u0004\bi\u0010ER*\u0010n\u001a\u00020\b2\u0006\u0010g\u001a\u00020\b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010k\u001a\u0004\bl\u0010M\"\u0004\bm\u0010&R\u0014\u0010r\u001a\u00020o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, d2 = {"Ll3/t;", "Ll3/s;", "Ll3/w0;", "platformFocusOwner", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Ll3/w0;Landroidx/compose/ui/node/Owner;)V", "", "forced", "refreshFocusEvents", ip.a.f96138c, "(ZZ)Z", "Ll3/p0;", "E", "()Ll3/p0;", "Lg4/g;", "Lf3/m$c;", "G", "(Lg4/g;)Lf3/m$c;", "Ly3/b;", "keyEvent", "J", "(Landroid/view/KeyEvent;)Z", "Ll3/g;", "focusDirection", "Lm3/g;", "previouslyFocusedRect", "c", "(Ll3/g;Lm3/g;)Z", "I", "(ILm3/g;)Z", "Loq/i0;", "z", "()V", "b", "force", "B", "(Z)V", "clearOwnerFocus", "v", "(ZZZI)Z", "y", "(I)Z", "h", "wrapAroundForOneDimensionalFocus", "f", "(IZ)Z", "focusedRect", "Lkotlin/Function1;", "onFound", "A", "(ILm3/g;Ler/l;)Ljava/lang/Boolean;", "Lkotlin/Function0;", "onFocusedItem", "m", "(Landroid/view/KeyEvent;Ler/a;)Z", "i", "Lc4/b;", "event", "e", "(Lc4/b;Ler/a;)Z", "Lx3/c;", "r", "(Lx3/c;)Z", "q", "a", "node", "C", "(Ll3/p0;)V", "Ll3/j;", "p", "(Ll3/j;)V", "n", "d", "()Lm3/g;", "x", "()Z", "u", "Ll3/w0;", "Landroidx/compose/ui/node/Owner;", "Ll3/p0;", "F", "setRootFocusNode$ui", "rootFocusNode", "Ll3/m;", "Ll3/m;", "focusInvalidationManager", "Lf3/m;", "Lf3/m;", "o", "()Lf3/m;", "modifier", "Lr0/n0;", "Lr0/n0;", "keysCurrentlyDown", "Lr0/q0;", "Ll3/n;", "g", "Lr0/q0;", "s", "()Lr0/q0;", "listeners", "value", "k", "j", "activeFocusTargetNode", "Z", "t", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "isFocusCaptured", "Ll3/l0;", "w", "()Ll3/l0;", "rootState", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w0 platformFocusOwner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Owner owner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m focusInvalidationManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private r0.n0 keysCurrentlyDown;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private p0 activeFocusTargetNode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isFocusCaptured;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private p0 rootFocusNode = new p0(t0.INSTANCE.b(), false, null, null, 14, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f3.m modifier = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final r0.q0<n> listeners = new r0.q0<>(1);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115620a;

        static {
            int[] iArr = new int[l3.c.values().length];
            try {
                iArr[l3.c.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l3.c.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l3.c.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l3.c.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f115620a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll3/p0;", "it", "", "c", "(Ll3/p0;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<p0, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f115621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f115622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.l<p0, Boolean> f115623d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p0 p0Var, t tVar, er.l<? super p0, Boolean> lVar) {
            super(1);
            this.f115621b = p0Var;
            this.f115622c = tVar;
            this.f115623d = lVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(p0 p0Var) {
            boolean zBooleanValue;
            if (fr.t.c(p0Var, this.f115621b)) {
                zBooleanValue = false;
            } else {
                if (fr.t.c(p0Var, this.f115622c.getRootFocusNode())) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                zBooleanValue = this.f115623d.b(p0Var).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"l3/t$c", "Lg4/l0;", "Ll3/p0;", "a", "()Ll3/p0;", "node", "Loq/i0;", "l", "(Ll3/p0;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends g4.l0<p0> {
        c() {
        }

        @Override // g4.l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 create() {
            return t.this.getRootFocusNode();
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return t.this.getRootFocusNode().hashCode();
        }

        @Override // g4.l0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void update(p0 node) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll3/p0;", "it", "", "c", "(Ll3/p0;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class d extends fr.w implements er.l<p0, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fr.p0<Boolean> f115625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f115626c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(fr.p0<Boolean> p0Var, int i15) {
            super(1);
            this.f115625b = p0Var;
            this.f115626c = i15;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(p0 p0Var) {
            this.f115625b.f66410a = Boolean.valueOf(p0Var.Q(this.f115626c));
            return this.f115625b.f66410a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll3/p0;", "it", "", "c", "(Ll3/p0;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class e extends fr.w implements er.l<p0, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f115627b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i15) {
            super(1);
            this.f115627b = i15;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(p0 p0Var) {
            return Boolean.valueOf(p0Var.Q(this.f115627b));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll3/p0;", "it", "", "c", "(Ll3/p0;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class f extends fr.w implements er.l<p0, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f115628b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i15) {
            super(1);
            this.f115628b = i15;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(p0 p0Var) {
            return Boolean.valueOf(p0Var.Q(this.f115628b));
        }
    }

    public t(w0 w0Var, Owner owner) {
        this.platformFocusOwner = w0Var;
        this.owner = owner;
        this.focusInvalidationManager = new m(this, owner);
    }

    private final boolean D(boolean forced, boolean refreshFocusEvents) {
        g4.p0 nodes;
        if (k() == null) {
            return true;
        }
        if (getIsFocusCaptured() && !forced) {
            return false;
        }
        p0 p0VarK = k();
        j(null);
        if (refreshFocusEvents && p0VarK != null) {
            p0VarK.t3(getIsFocusCaptured() ? m0.Captured : m0.Active, m0.Inactive);
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
                            n2.c cVar = null;
                            f3.m.c cVarL = parent;
                            while (cVarL != null) {
                                if (cVarL instanceof p0) {
                                    ((p0) cVarL).t3(m0.ActiveParent, m0.Inactive);
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
        return true;
    }

    private final p0 E() {
        return s0.b(this.rootFocusNode);
    }

    private final f3.m.c G(g4.g gVar) {
        int iA = g4.s0.a(1024) | g4.s0.a(PKIFailureInfo.certRevoked);
        if (!gVar.getNode().getIsAttached()) {
            d4.a.c("visitLocalDescendants called on an unattached node");
        }
        f3.m.c node = gVar.getNode();
        f3.m.c cVar = null;
        if ((node.getAggregateChildKindSet() & iA) != 0) {
            for (f3.m.c child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iA) != 0) {
                    if ((g4.s0.a(1024) & child.getKindSet()) != 0) {
                        return cVar;
                    }
                    cVar = child;
                }
            }
        }
        return cVar;
    }

    private final boolean J(KeyEvent keyEvent) {
        long jA = y3.d.a(keyEvent);
        int iB = y3.d.b(keyEvent);
        y3.c.Companion companion = y3.c.INSTANCE;
        if (y3.c.e(iB, companion.a())) {
            r0.n0 n0Var = this.keysCurrentlyDown;
            if (n0Var == null) {
                n0Var = new r0.n0(3);
                this.keysCurrentlyDown = n0Var;
            }
            n0Var.l(jA);
        } else if (y3.c.e(iB, companion.b())) {
            r0.n0 n0Var2 = this.keysCurrentlyDown;
            if (n0Var2 == null || !n0Var2.a(jA)) {
                return false;
            }
            r0.n0 n0Var3 = this.keysCurrentlyDown;
            if (n0Var3 != null) {
                n0Var3.m(jA);
            }
        }
        return true;
    }

    @Override // l3.s
    public Boolean A(int focusDirection, m3.g focusedRect, er.l<? super p0, Boolean> onFound) {
        p0 p0VarE = E();
        n2.c cVar = null;
        if (p0VarE != null) {
            d0 d0VarA = s0.a(p0VarE, focusDirection, this.owner.getLayoutDirection());
            d0.Companion companion = d0.INSTANCE;
            if (fr.t.c(d0VarA, companion.b())) {
                return null;
            }
            if (fr.t.c(d0VarA, companion.d())) {
                p0 p0VarE2 = E();
                if (p0VarE2 != null) {
                    return onFound.b(p0VarE2);
                }
                return null;
            }
            if (!fr.t.c(d0VarA, companion.c())) {
                if (d0VarA == companion.c()) {
                    throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                }
                if (d0VarA == companion.b()) {
                    throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                }
                boolean z15 = false;
                if (d0VarA.d().getSize() == 0) {
                    System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                } else {
                    n2.c<h0> cVarD = d0VarA.d();
                    h0[] h0VarArr = cVarD.content;
                    int size = cVarD.getSize();
                    int i15 = 0;
                    boolean z16 = false;
                    while (i15 < size) {
                        h0 h0Var = h0VarArr[i15];
                        int iA = g4.s0.a(1024);
                        if (!h0Var.getNode().getIsAttached()) {
                            d4.a.c("visitChildren called on an unattached node");
                        }
                        n2.c cVar2 = new n2.c(new f3.m.c[16], 0);
                        f3.m.c child = h0Var.getNode().getChild();
                        if (child == null) {
                            g4.h.c(cVar2, h0Var.getNode(), false);
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
                                        n2.c cVar3 = cVar;
                                        while (cVarL != null) {
                                            if (cVarL instanceof p0) {
                                                if (onFound.b((p0) cVarL).booleanValue()) {
                                                    z16 = true;
                                                    break;
                                                }
                                            } else {
                                                if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
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
                                                cVar = null;
                                            }
                                            cVarL = g4.h.l(cVar3);
                                            cVar = null;
                                        }
                                        break;
                                    }
                                    cVarL = cVarL.getChild();
                                    cVar = null;
                                }
                            }
                        }
                        i15++;
                        cVar = null;
                    }
                    z15 = z16;
                }
                return Boolean.valueOf(z15);
            }
        } else {
            p0VarE = null;
        }
        return s0.e(this.rootFocusNode, focusDirection, this.owner.getLayoutDirection(), focusedRect, new b(p0VarE, this, onFound));
    }

    @Override // l3.o
    public void B(boolean force) {
        v(force, true, true, g.INSTANCE.c());
    }

    @Override // l3.s
    public void C(p0 node) {
        this.focusInvalidationManager.g(node);
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final p0 getRootFocusNode() {
        return this.rootFocusNode;
    }

    public void H(boolean z15) {
        if (!((z15 && k() == null) ? false : true)) {
            d4.a.a("Cannot capture focus when the active focus target node is unset");
        }
        this.isFocusCaptured = z15;
    }

    public boolean I(int focusDirection, m3.g previouslyFocusedRect) {
        Boolean boolA = A(focusDirection, previouslyFocusedRect, new f(focusDirection));
        if (boolA != null) {
            return boolA.booleanValue();
        }
        return false;
    }

    @Override // l3.s
    public void a() {
        this.platformFocusOwner.a();
    }

    @Override // l3.s
    public void b() {
        this.platformFocusOwner.b();
    }

    @Override // l3.s
    public boolean c(g focusDirection, m3.g previouslyFocusedRect) {
        return this.platformFocusOwner.c(focusDirection, previouslyFocusedRect);
    }

    @Override // l3.s
    public m3.g d() {
        p0 p0VarE = E();
        if (p0VarE != null) {
            return s0.d(p0VarE);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r4v10, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v4, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v9, types: [f3.m$c] */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // l3.s
    public boolean e(c4.RotaryScrollEvent r17, er.a<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.t.e(c4.b, er.a):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Boolean] */
    @Override // l3.s
    public boolean f(int focusDirection, boolean wrapAroundForOneDimensionalFocus) {
        p0 p0VarK;
        if ((f3.h.isViewFocusFixEnabled || (f3.h.isBypassUnfocusableComposeViewEnabled && (p0VarK = k()) != null && p0VarK.getIsInteropViewHost())) && this.platformFocusOwner.e(focusDirection)) {
            return true;
        }
        fr.p0 p0Var = new fr.p0();
        p0Var.f66410a = Boolean.FALSE;
        p0 p0VarK2 = k();
        Boolean boolA = A(focusDirection, this.platformFocusOwner.getEmbeddedViewFocusRect(), new d(p0Var, focusDirection));
        if (fr.t.c(boolA, Boolean.TRUE) && p0VarK2 != k()) {
            return true;
        }
        if (boolA != null && p0Var.f66410a != 0) {
            if (boolA.booleanValue() && ((Boolean) p0Var.f66410a).booleanValue()) {
                return true;
            }
            if (u.a(focusDirection) && wrapAroundForOneDimensionalFocus) {
                return v(false, true, false, focusDirection) && I(focusDirection, null);
            }
            if (!f3.h.isViewFocusFixEnabled && !f3.h.isBypassUnfocusableComposeViewEnabled) {
                return this.platformFocusOwner.e(focusDirection);
            }
        }
        return false;
    }

    @Override // l3.o
    public boolean h(int focusDirection) {
        return f(focusDirection, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v4, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v5, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r2v7, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // l3.s
    public boolean i(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.t.i(android.view.KeyEvent):boolean");
    }

    @Override // l3.s
    public void j(p0 p0Var) {
        p0 p0Var2 = this.activeFocusTargetNode;
        this.activeFocusTargetNode = p0Var;
        if (p0Var == null || p0Var2 != p0Var) {
            H(false);
        }
        r0.q0<n> q0VarS = s();
        Object[] objArr = q0VarS.content;
        int i15 = q0VarS._size;
        for (int i16 = 0; i16 < i15; i16++) {
            ((n) objArr[i16]).N(p0Var2, p0Var);
        }
    }

    @Override // l3.s
    public p0 k() {
        p0 p0Var = this.activeFocusTargetNode;
        if (p0Var == null || !p0Var.getIsAttached()) {
            return null;
        }
        return this.activeFocusTargetNode;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0186 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x018b  */
    /* JADX WARN: Code duplicated, block: B:322:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0104 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0113 A[ADDED_TO_REGION, LOOP:15: B:73:0x0113->B:101:0x0169, LOOP_START, PHI: r10
      0x0113: PHI (r10v9 f3.m$c) = (r10v4 f3.m$c), (r10v10 f3.m$c) binds: [B:72:0x0111, B:101:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0115 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x011c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0120 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0126 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // l3.s
    public boolean m(android.view.KeyEvent r17, er.a<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.t.m(android.view.KeyEvent, er.a):boolean");
    }

    @Override // l3.s
    public void n() {
        this.focusInvalidationManager.e();
    }

    @Override // l3.s
    /* JADX INFO: renamed from: o, reason: from getter */
    public f3.m getModifier() {
        return this.modifier;
    }

    @Override // l3.s
    public void p(j node) {
        this.focusInvalidationManager.f(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // l3.s
    public void q() {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.t.q():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // l3.s
    public boolean r(x3.c r15) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.t.r(x3.c):boolean");
    }

    @Override // l3.s
    public r0.q0<n> s() {
        return this.listeners;
    }

    @Override // l3.s
    /* JADX INFO: renamed from: t, reason: from getter */
    public boolean getIsFocusCaptured() {
        return this.isFocusCaptured;
    }

    @Override // l3.s
    public boolean u() {
        if (!this.rootFocusNode.getIsAttached()) {
            return false;
        }
        p0 p0Var = this.rootFocusNode;
        int iA = g4.s0.a(1024);
        if (!p0Var.getNode().getIsAttached()) {
            d4.a.c("visitSubtreeIf called on an unattached node");
        }
        n2.c cVar = new n2.c(new f3.m.c[16], 0);
        f3.m.c child = p0Var.getNode().getChild();
        if (child == null) {
            g4.h.c(cVar, p0Var.getNode(), false);
        } else {
            cVar.d(child);
        }
        while (cVar.getSize() != 0) {
            f3.m.c cVar2 = (f3.m.c) cVar.v(cVar.getSize() - 1);
            if ((cVar2.getAggregateChildKindSet() & iA) != 0) {
                for (f3.m.c child2 = cVar2; child2 != null && child2.getIsAttached(); child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iA) != 0) {
                        f3.m.c cVarL = child2;
                        n2.c cVar3 = null;
                        while (cVarL != null) {
                            if (cVarL instanceof p0) {
                                p0 p0Var2 = (p0) cVarL;
                                if (p0Var2.getIsAttached()) {
                                    v vVarU3 = p0Var2.u3();
                                    if (p0Var2.getIsAttached() && !p0Var2.getIsInteropViewHost() && vVarU3.getCanFocus()) {
                                        return true;
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
                    }
                }
            }
            g4.h.c(cVar, cVar2, false);
        }
        return false;
    }

    @Override // l3.s
    public boolean v(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection) {
        boolean zD;
        if (force) {
            zD = D(force, refreshFocusEvents);
        } else {
            int i15 = a.f115620a[r0.e(this.rootFocusNode, focusDirection).ordinal()];
            if (i15 == 1 || i15 == 2 || i15 == 3) {
                zD = false;
            } else {
                if (i15 != 4) {
                    throw new oq.p();
                }
                zD = D(force, refreshFocusEvents);
            }
        }
        if (zD && clearOwnerFocus) {
            b();
        }
        return zD;
    }

    @Override // l3.s
    public l0 w() {
        return this.rootFocusNode.d0();
    }

    @Override // l3.s
    public boolean x() {
        if (!this.rootFocusNode.getIsAttached()) {
            return false;
        }
        p0 p0Var = this.rootFocusNode;
        int iA = g4.s0.a(1024);
        if (!p0Var.getNode().getIsAttached()) {
            d4.a.c("visitSubtreeIf called on an unattached node");
        }
        n2.c cVar = new n2.c(new f3.m.c[16], 0);
        f3.m.c child = p0Var.getNode().getChild();
        if (child == null) {
            g4.h.c(cVar, p0Var.getNode(), false);
        } else {
            cVar.d(child);
        }
        while (cVar.getSize() != 0) {
            f3.m.c cVar2 = (f3.m.c) cVar.v(cVar.getSize() - 1);
            if ((cVar2.getAggregateChildKindSet() & iA) != 0) {
                for (f3.m.c child2 = cVar2; child2 != null && child2.getIsAttached(); child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iA) != 0) {
                        f3.m.c cVarL = child2;
                        n2.c cVar3 = null;
                        while (cVarL != null) {
                            if (cVarL instanceof p0) {
                                p0 p0Var2 = (p0) cVarL;
                                if (p0Var2.getIsAttached() && p0Var2.u3().getCanFocus()) {
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
                    }
                }
            }
            g4.h.c(cVar, cVar2, false);
        }
        return false;
    }

    @Override // l3.s
    public boolean y(int focusDirection) {
        if (!v(false, true, false, focusDirection)) {
            return false;
        }
        Boolean boolA = A(focusDirection, null, new e(focusDirection));
        boolean zBooleanValue = boolA != null ? boolA.booleanValue() : false;
        if (!zBooleanValue) {
            b();
        }
        return zBooleanValue;
    }

    @Override // l3.s
    public void z() {
        r0.b(this.rootFocusNode, true, true);
        if (!f3.h.isOptimizedFocusEventDispatchEnabled || k() == null) {
            return;
        }
        p0 p0VarK = k();
        j(null);
        if (p0VarK != null) {
            p0VarK.t3(m0.Active, m0.Inactive);
        }
    }
}
