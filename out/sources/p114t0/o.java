package p114t0;

import c5.b;
import c5.r;
import er.p;
import fr.t;
import g4.l0;
import p036e4.s0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lt0/o;", "Lg4/l0;", "Lt0/p;", "Le4/s0;", "lookaheadScope", "Lt0/q;", "boundsTransform", "Lkotlin/Function2;", "Lc5/r;", "Lc5/b;", "resolveMeasureConstraints", "", "animateMotionFrameOfReference", "<init>", "(Le4/s0;Lt0/q;Ler/p;Z)V", "a", "()Lt0/p;", "node", "Loq/i0;", "l", "(Lt0/p;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Le4/s0;", "getLookaheadScope", "()Le4/s0;", "e", "Lt0/q;", "getBoundsTransform", "()Lt0/q;", "f", "Ler/p;", "getResolveMeasureConstraints", "()Ler/p;", "g", "Z", "getAnimateMotionFrameOfReference", "()Z", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends l0<p> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s0 lookaheadScope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q boundsTransform;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p<r, b, b> resolveMeasureConstraints;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean animateMotionFrameOfReference;

    /* JADX WARN: Multi-variable type inference failed */
    public o(s0 s0Var, q qVar, p<? super r, ? super b, b> pVar, boolean z15) {
        this.lookaheadScope = s0Var;
        this.boundsTransform = qVar;
        this.resolveMeasureConstraints = pVar;
        this.animateMotionFrameOfReference = z15;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p create() {
        return new p(this.lookaheadScope, this.boundsTransform, this.resolveMeasureConstraints, this.animateMotionFrameOfReference);
    }

    public boolean equals(Object other) {
        if (!(other instanceof o)) {
            return false;
        }
        o oVar = (o) other;
        return t.c(oVar.lookaheadScope, this.lookaheadScope) && t.c(oVar.boundsTransform, this.boundsTransform) && oVar.resolveMeasureConstraints == this.resolveMeasureConstraints && oVar.animateMotionFrameOfReference == this.animateMotionFrameOfReference;
    }

    public int hashCode() {
        return (((((this.lookaheadScope.hashCode() * 31) + this.boundsTransform.hashCode()) * 31) + this.resolveMeasureConstraints.hashCode()) * 31) + Boolean.hashCode(this.animateMotionFrameOfReference);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(p node) {
        node.s3(this.lookaheadScope);
        node.r3(this.boundsTransform);
        node.t3(this.resolveMeasureConstraints);
        node.q3(this.animateMotionFrameOfReference);
    }
}
