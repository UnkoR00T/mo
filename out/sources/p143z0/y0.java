package p143z0;

import a4.p0;
import er.l;
import er.q;
import fr.t;
import g4.l0;
import m3.e;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R6\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R6\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010(¨\u00062"}, d2 = {"Lz0/y0;", "Lg4/l0;", "Lz0/c1;", "Lz0/d1;", "state", "Lz0/a2;", "orientation", "", "enabled", "Lb1/l;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lju/p0;", "Lm3/e;", "Ltq/e;", "Loq/i0;", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Lz0/d1;Lz0/a2;ZLb1/l;ZLer/q;Ler/q;Z)V", "m", "()Lz0/c1;", "node", "o", "(Lz0/c1;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Lz0/d1;", "e", "Lz0/a2;", "f", "Z", "g", "Lb1/l;", "h", "i", "Ler/q;", "j", "k", "l", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y0 extends l0<c1> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final l<p0, Boolean> f231780m = new l() { // from class: z0.x0
        @Override // er.l
        public final Object b(Object obj) {
            return Boolean.valueOf(y0.l((p0) obj));
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d1 state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a2 orientation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b1.l interactionSource;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean startDragImmediately;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final q<ju.p0, e, tq.e<? super i0>, Object> onDragStarted;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final q<ju.p0, Float, tq.e<? super i0>, Object> onDragStopped;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* JADX WARN: Multi-variable type inference failed */
    public y0(d1 d1Var, a2 a2Var, boolean z15, b1.l lVar, boolean z16, q<? super ju.p0, ? super e, ? super tq.e<? super i0>, ? extends Object> qVar, q<? super ju.p0, ? super Float, ? super tq.e<? super i0>, ? extends Object> qVar2, boolean z17) {
        this.state = d1Var;
        this.orientation = a2Var;
        this.enabled = z15;
        this.interactionSource = lVar;
        this.startDragImmediately = z16;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(p0 p0Var) {
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || y0.class != other.getClass()) {
            return false;
        }
        y0 y0Var = (y0) other;
        return t.c(this.state, y0Var.state) && this.orientation == y0Var.orientation && this.enabled == y0Var.enabled && t.c(this.interactionSource, y0Var.interactionSource) && this.startDragImmediately == y0Var.startDragImmediately && t.c(this.onDragStarted, y0Var.onDragStarted) && t.c(this.onDragStopped, y0Var.onDragStopped) && this.reverseDirection == y0Var.reverseDirection;
    }

    public int hashCode() {
        int iHashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        b1.l lVar = this.interactionSource;
        return ((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public c1 create() {
        return new c1(this.state, f231780m, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void update(c1 node) {
        node.t4(this.state, f231780m, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }
}
