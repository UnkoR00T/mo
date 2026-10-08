package p046f2;

import b3.a0;
import b3.b0;
import b3.x;
import er.a;
import er.l;
import er.p;
import fr.k;
import h2.q1;
import oq.i0;
import p071kotlin.Metadata;
import p143z0.e1;
import tq.e;
import u0.j0;
import u0.m;
import uq.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u001fBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0016\u0010\u0013J&\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018H\u0080@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010&R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b'\u0010&R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b,\u0010#R(\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u0010=\u001a\b\u0012\u0004\u0012\u00020\b058\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b;\u0010<\u001a\u0004\b(\u00108\"\u0004\b9\u0010:R(\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010?\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR\u0011\u0010I\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010HR\u0011\u0010\u0017\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010#R\u0011\u0010M\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b6\u0010#R\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b>\u0010#¨\u0006O"}, d2 = {"Lf2/hj;", "", "", "skipPartiallyExpanded", "Lkotlin/Function0;", "", "positionalThreshold", "velocityThreshold", "Lf2/ij;", "initialValue", "Lkotlin/Function1;", "confirmValueChange", "skipHiddenState", "<init>", "(ZLer/a;Ler/a;Lf2/ij;Ler/l;Z)V", "o", "()F", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "n", "s", "l", "targetValue", "Lu0/j0;", "animationSpec", "b", "(Lf2/ij;Lu0/j0;Ltq/e;)Ljava/lang/Object;", "Lz0/e1;", "flingBehavior", "initialVelocity", "a", "(Lz0/e1;FLtq/e;)Ljava/lang/Object;", "Z", "j", "()Z", "Ler/a;", "i", "()Ler/a;", "getVelocityThreshold$material3", "d", "Ler/l;", "e", "()Ler/l;", "getSkipHiddenState$material3", "Lu0/l;", "f", "Lu0/l;", "getAnchoredDraggableMotionSpec$material3", "()Lu0/l;", "p", "(Lu0/l;)V", "anchoredDraggableMotionSpec", "Lh2/q1;", "g", "Lh2/q1;", "()Lh2/q1;", "setAnchoredDraggableState$material3", "(Lh2/q1;)V", "getAnchoredDraggableState$material3$annotations", "()V", "anchoredDraggableState", "h", "Lu0/j0;", "getShowMotionSpec$material3", "()Lu0/j0;", "r", "(Lu0/j0;)V", "showMotionSpec", "getHideMotionSpec$material3", "q", "hideMotionSpec", "()Lf2/ij;", "currentValue", "k", "m", "isVisible", "hasExpandedState", "hasPartiallyExpandedState", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class hj {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean skipPartiallyExpanded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a<Float> positionalThreshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a<Float> velocityThreshold;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l<ij, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean skipHiddenState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private u0.l<Float> anchoredDraggableMotionSpec;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private q1<ij> anchoredDraggableState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private j0<Float> showMotionSpec;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private j0<Float> hideMotionSpec;

    /* JADX INFO: renamed from: f2.hj$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lf2/hj$a;", "", "<init>", "()V", "", "skipPartiallyExpanded", "Lkotlin/Function0;", "", "positionalThreshold", "velocityThreshold", "Lkotlin/Function1;", "Lf2/ij;", "confirmValueChange", "skipHiddenState", "Lb3/x;", "Lf2/hj;", "c", "(ZLer/a;Ler/a;Ler/l;Z)Lb3/x;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ij d(b0 b0Var, hj hjVar) {
            return hjVar.f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hj e(boolean z15, a aVar, a aVar2, l lVar, boolean z16, ij ijVar) {
            if (z15 && ijVar == ij.PartiallyExpanded) {
                ijVar = ij.Expanded;
            }
            return new hj(z15, aVar, aVar2, ijVar, lVar, z16);
        }

        public final x<hj, ij> c(final boolean skipPartiallyExpanded, final a<Float> positionalThreshold, final a<Float> velocityThreshold, final l<? super ij, Boolean> confirmValueChange, final boolean skipHiddenState) {
            return a0.e(new p() { // from class: f2.fj
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return hj.Companion.d((b0) obj, (hj) obj2);
                }
            }, new l() { // from class: f2.gj
                @Override // er.l
                public final Object b(Object obj) {
                    return hj.Companion.e(skipPartiallyExpanded, positionalThreshold, velocityThreshold, confirmValueChange, skipHiddenState, (ij) obj);
                }
            });
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hj(boolean z15, a<Float> aVar, a<Float> aVar2, ij ijVar, l<? super ij, Boolean> lVar, boolean z16) {
        this.skipPartiallyExpanded = z15;
        this.positionalThreshold = aVar;
        this.velocityThreshold = aVar2;
        this.confirmValueChange = lVar;
        this.skipHiddenState = z16;
        if (z15 && ijVar == ij.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z16 && ijVar == ij.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.anchoredDraggableMotionSpec = ej.p();
        this.anchoredDraggableState = new q1<>(ijVar, null, null, null, null, lVar, 30, null);
        this.showMotionSpec = m.h(0, 1, null);
        this.hideMotionSpec = m.h(0, 1, null);
    }

    public final Object a(e1 e1Var, float f15, e<? super Float> eVar) {
        return this.anchoredDraggableState.d(e1Var, f15, eVar);
    }

    public final Object b(ij ijVar, j0<Float> j0Var, e<? super i0> eVar) throws Throwable {
        Object objE = this.anchoredDraggableState.e(ijVar, j0Var, eVar);
        return objE == b.e() ? objE : i0.f148189a;
    }

    public final Object c(e<? super i0> eVar) {
        Object objB;
        l<ij, Boolean> lVar = this.confirmValueChange;
        ij ijVar = ij.Expanded;
        return (lVar.b(ijVar).booleanValue() && (objB = b(ijVar, this.showMotionSpec, eVar)) == b.e()) ? objB : i0.f148189a;
    }

    public final q1<ij> d() {
        return this.anchoredDraggableState;
    }

    public final l<ij, Boolean> e() {
        return this.confirmValueChange;
    }

    public final ij f() {
        return this.anchoredDraggableState.k();
    }

    public final boolean g() {
        return this.anchoredDraggableState.i().d(ij.Expanded);
    }

    public final boolean h() {
        return this.anchoredDraggableState.i().d(ij.PartiallyExpanded);
    }

    public final a<Float> i() {
        return this.positionalThreshold;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getSkipPartiallyExpanded() {
        return this.skipPartiallyExpanded;
    }

    public final ij k() {
        return this.anchoredDraggableState.m();
    }

    public final Object l(e<? super i0> eVar) {
        Object objB;
        if (this.skipHiddenState) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        l<ij, Boolean> lVar = this.confirmValueChange;
        ij ijVar = ij.Hidden;
        return (lVar.b(ijVar).booleanValue() && (objB = b(ijVar, this.hideMotionSpec, eVar)) == b.e()) ? objB : i0.f148189a;
    }

    public final boolean m() {
        return this.anchoredDraggableState.j() != ij.Hidden;
    }

    public final Object n(e<? super i0> eVar) {
        Object objB;
        if (this.skipPartiallyExpanded) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        l<ij, Boolean> lVar = this.confirmValueChange;
        ij ijVar = ij.PartiallyExpanded;
        return (lVar.b(ijVar).booleanValue() && (objB = b(ijVar, this.hideMotionSpec, eVar)) == b.e()) ? objB : i0.f148189a;
    }

    public final float o() {
        return this.anchoredDraggableState.p();
    }

    public final void p(u0.l<Float> lVar) {
        this.anchoredDraggableMotionSpec = lVar;
    }

    public final void q(j0<Float> j0Var) {
        this.hideMotionSpec = j0Var;
    }

    public final void r(j0<Float> j0Var) {
        this.showMotionSpec = j0Var;
    }

    public final Object s(e<? super i0> eVar) {
        Object objB;
        ij ijVar = h() ? ij.PartiallyExpanded : ij.Expanded;
        return (this.confirmValueChange.b(ijVar).booleanValue() && (objB = b(ijVar, this.showMotionSpec, eVar)) == b.e()) ? objB : i0.f148189a;
    }
}
