package k1;

import b1.l;
import g4.j1;
import n4.f0;
import n4.i0;
import p071kotlin.Metadata;
import w0.r1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JQ\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lk1/e;", "Landroidx/compose/foundation/c;", "", "selected", "Lb1/l;", "interactionSource", "Lw0/r1;", "indicationNodeFactory", "useLocalIndication", "enabled", "Ln4/l;", "role", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(ZLb1/l;Lw0/r1;ZZLn4/l;Ler/a;Lfr/k;)V", "t4", "(ZLb1/l;Lw0/r1;ZZLn4/l;Ler/a;)V", "Ln4/i0;", "F3", "(Ln4/i0;)V", "t0", "Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e extends androidx.compose.foundation.c {

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private boolean selected;

    public /* synthetic */ e(boolean z15, l lVar, r1 r1Var, boolean z16, boolean z17, n4.l lVar2, er.a aVar, fr.k kVar) {
        this(z15, lVar, r1Var, z16, z17, lVar2, aVar);
    }

    @Override // androidx.compose.foundation.a
    public void F3(i0 i0Var) {
        f0.s0(i0Var, this.selected);
    }

    public final void t4(boolean selected, l interactionSource, r1 indicationNodeFactory, boolean useLocalIndication, boolean enabled, n4.l role, er.a<oq.i0> onClick) {
        if (this.selected != selected) {
            this.selected = selected;
            j1.d(this);
        }
        super.s4(interactionSource, indicationNodeFactory, useLocalIndication, enabled, null, role, onClick);
    }

    private e(boolean z15, l lVar, r1 r1Var, boolean z16, boolean z17, n4.l lVar2, er.a<oq.i0> aVar) {
        super(lVar, r1Var, z16, z17, null, lVar2, aVar, null);
        this.selected = z15;
    }
}
