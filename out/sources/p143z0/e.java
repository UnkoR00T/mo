package p143z0;

import b1.l;
import fr.k;
import fr.t;
import g4.l0;
import p071kotlin.Metadata;
import w0.g2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\r\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lz0/e;", "T", "Lg4/l0;", "Lz0/n;", "Lz0/r;", "state", "Lz0/a2;", "orientation", "", "enabled", "reverseDirection", "Lb1/l;", "interactionSource", "startDragImmediately", "Lw0/g2;", "overscrollEffect", "Lz0/e1;", "flingBehavior", "<init>", "(Lz0/r;Lz0/a2;ZLjava/lang/Boolean;Lb1/l;Ljava/lang/Boolean;Lw0/g2;Lz0/e1;)V", "a", "()Lz0/n;", "node", "Loq/i0;", "l", "(Lz0/n;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lz0/r;", "e", "Lz0/a2;", "f", "Z", "g", "Ljava/lang/Boolean;", "h", "Lb1/l;", "i", "j", "Lw0/g2;", "k", "Lz0/e1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e<T> extends l0<n<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r<T> state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a2 orientation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Boolean reverseDirection;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l interactionSource;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Boolean startDragImmediately;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g2 overscrollEffect;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final e1 flingBehavior;

    public e(r<T> rVar, a2 a2Var, boolean z15, Boolean bool, l lVar, Boolean bool2, g2 g2Var, e1 e1Var) {
        this.state = rVar;
        this.orientation = a2Var;
        this.enabled = z15;
        this.reverseDirection = bool;
        this.interactionSource = lVar;
        this.startDragImmediately = bool2;
        this.overscrollEffect = g2Var;
        this.flingBehavior = e1Var;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n<T> create() {
        return new n<>(this.state, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.overscrollEffect, this.startDragImmediately, this.flingBehavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return t.c(this.state, eVar.state) && this.orientation == eVar.orientation && this.enabled == eVar.enabled && t.c(this.reverseDirection, eVar.reverseDirection) && t.c(this.interactionSource, eVar.interactionSource) && t.c(this.startDragImmediately, eVar.startDragImmediately) && t.c(this.overscrollEffect, eVar.overscrollEffect) && t.c(this.flingBehavior, eVar.flingBehavior);
    }

    public int hashCode() {
        int iHashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Boolean bool = this.reverseDirection;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l lVar = this.interactionSource;
        int iHashCode3 = (iHashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        Boolean bool2 = this.startDragImmediately;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        g2 g2Var = this.overscrollEffect;
        int iHashCode5 = (iHashCode4 + (g2Var != null ? g2Var.hashCode() : 0)) * 31;
        e1 e1Var = this.flingBehavior;
        return iHashCode5 + (e1Var != null ? e1Var.hashCode() : 0);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(n<T> node) {
        node.F4(this.state, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.overscrollEffect, this.startDragImmediately, this.flingBehavior);
    }

    public /* synthetic */ e(r rVar, a2 a2Var, boolean z15, Boolean bool, l lVar, Boolean bool2, g2 g2Var, e1 e1Var, int i15, k kVar) {
        this(rVar, a2Var, z15, bool, lVar, (i15 & 32) != 0 ? null : bool2, g2Var, (i15 & 128) != 0 ? null : e1Var);
    }
}
