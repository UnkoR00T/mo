package p143z0;

import b1.l;
import fr.t;
import g4.l0;
import p071kotlin.Metadata;
import w0.g2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lz0/l2;", "Lg4/l0;", "Lz0/u2;", "Lz0/v2;", "state", "Lz0/a2;", "orientation", "Lw0/g2;", "overscrollEffect", "", "enabled", "reverseDirection", "Lz0/e1;", "flingBehavior", "Lb1/l;", "interactionSource", "Lz0/y;", "bringIntoViewSpec", "<init>", "(Lz0/v2;Lz0/a2;Lw0/g2;ZZLz0/e1;Lb1/l;Lz0/y;)V", "a", "()Lz0/u2;", "node", "Loq/i0;", "l", "(Lz0/u2;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lz0/v2;", "getState", "()Lz0/v2;", "e", "Lz0/a2;", "getOrientation", "()Lz0/a2;", "f", "Lw0/g2;", "getOverscrollEffect", "()Lw0/g2;", "g", "Z", "getEnabled", "()Z", "h", "getReverseDirection", "i", "Lz0/e1;", "getFlingBehavior", "()Lz0/e1;", "j", "Lb1/l;", "getInteractionSource", "()Lb1/l;", "k", "Lz0/y;", "getBringIntoViewSpec", "()Lz0/y;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l2 extends l0<u2> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v2 state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a2 orientation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g2 overscrollEffect;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final e1 flingBehavior;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l interactionSource;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final y bringIntoViewSpec;

    public l2(v2 v2Var, a2 a2Var, g2 g2Var, boolean z15, boolean z16, e1 e1Var, l lVar, y yVar) {
        this.state = v2Var;
        this.orientation = a2Var;
        this.overscrollEffect = g2Var;
        this.enabled = z15;
        this.reverseDirection = z16;
        this.flingBehavior = e1Var;
        this.interactionSource = lVar;
        this.bringIntoViewSpec = yVar;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u2 create() {
        return new u2(this.state, this.overscrollEffect, this.flingBehavior, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.bringIntoViewSpec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) other;
        return t.c(this.state, l2Var.state) && this.orientation == l2Var.orientation && t.c(this.overscrollEffect, l2Var.overscrollEffect) && this.enabled == l2Var.enabled && this.reverseDirection == l2Var.reverseDirection && t.c(this.flingBehavior, l2Var.flingBehavior) && t.c(this.interactionSource, l2Var.interactionSource) && t.c(this.bringIntoViewSpec, l2Var.bringIntoViewSpec);
    }

    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31;
        g2 g2Var = this.overscrollEffect;
        int iHashCode2 = (((((iHashCode + (g2Var != null ? g2Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseDirection)) * 31;
        e1 e1Var = this.flingBehavior;
        int iHashCode3 = (iHashCode2 + (e1Var != null ? e1Var.hashCode() : 0)) * 31;
        l lVar = this.interactionSource;
        int iHashCode4 = (iHashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        y yVar = this.bringIntoViewSpec;
        return iHashCode4 + (yVar != null ? yVar.hashCode() : 0);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(u2 node) {
        node.D4(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }
}
