package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\fJ\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014¨\u0006 "}, d2 = {"Lg4/m;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/g;", "node", "affectsLookahead", "f", "(Landroidx/compose/ui/node/g;Z)Z", "e", "(Landroidx/compose/ui/node/g;)Z", "Lg4/x;", "invalidation", "Loq/i0;", "d", "(Landroidx/compose/ui/node/g;Lg4/x;)V", "j", "h", "()Z", "i", "Lg4/k;", "a", "Lg4/k;", "lookaheadAndAncestorMeasureSet", "b", "lookaheadAndAncestorPlaceSet", "c", "approachSet", "g", "affectsLookaheadMeasure", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k lookaheadAndAncestorMeasureSet;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k lookaheadAndAncestorPlaceSet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k approachSet;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70349a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.LookaheadMeasurement.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.LookaheadPlacement.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.Measurement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x.Placement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f70349a = iArr;
        }
    }

    public m(boolean z15) {
        this.lookaheadAndAncestorMeasureSet = new k(z15);
        this.lookaheadAndAncestorPlaceSet = new k(z15);
        this.approachSet = new k(z15);
    }

    public final void d(androidx.compose.ui.node.g node, x invalidation) {
        int i15 = a.f70349a[invalidation.ordinal()];
        if (i15 == 1) {
            this.lookaheadAndAncestorMeasureSet.a(node);
            this.approachSet.a(node);
            return;
        }
        if (i15 == 2) {
            this.lookaheadAndAncestorPlaceSet.a(node);
            this.approachSet.a(node);
            return;
        }
        if (i15 == 3) {
            if (node.getLookaheadRoot() != null) {
                this.approachSet.a(node);
                return;
            } else {
                this.lookaheadAndAncestorMeasureSet.a(node);
                return;
            }
        }
        if (i15 != 4) {
            throw new oq.p();
        }
        if (node.getLookaheadRoot() != null) {
            this.approachSet.a(node);
        } else {
            this.lookaheadAndAncestorPlaceSet.a(node);
        }
    }

    public final boolean e(androidx.compose.ui.node.g node) {
        return this.lookaheadAndAncestorMeasureSet.b(node) || this.lookaheadAndAncestorPlaceSet.b(node) || this.approachSet.b(node);
    }

    public final boolean f(androidx.compose.ui.node.g node, boolean affectsLookahead) {
        boolean z15 = node.getLookaheadRoot() == null;
        boolean z16 = this.lookaheadAndAncestorMeasureSet.b(node) || this.lookaheadAndAncestorPlaceSet.b(node);
        if (affectsLookahead) {
            return !z15 && z16;
        }
        return (z15 && z16) || this.approachSet.b(node);
    }

    public final boolean g() {
        return (this.approachSet.c() || this.lookaheadAndAncestorMeasureSet.c()) ? false : true;
    }

    public final boolean h() {
        return this.lookaheadAndAncestorMeasureSet.c() && this.approachSet.c() && this.lookaheadAndAncestorPlaceSet.c();
    }

    public final boolean i() {
        return !h();
    }

    public final boolean j(androidx.compose.ui.node.g node) {
        return this.approachSet.e(node) || this.lookaheadAndAncestorMeasureSet.e(node) || this.lookaheadAndAncestorPlaceSet.e(node);
    }
}
