package p036e4;

import er.l;
import fr.t;
import g4.l0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Le4/t1;", "Lg4/l0;", "Le4/v1;", "", "minDurationMs", "", "minFractionVisible", "Le4/a0;", "viewportBounds", "Lkotlin/Function1;", "", "Loq/i0;", "callback", "<init>", "(JFLe4/a0;Ler/l;)V", "a", "()Le4/v1;", "node", "l", "(Le4/v1;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "J", "getMinDurationMs", "()J", "e", "F", "getMinFractionVisible", "()F", "f", "Ler/l;", "getCallback", "()Ler/l;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class t1 extends l0<v1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long minDurationMs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float minFractionVisible;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l<Boolean, i0> callback;

    /* JADX WARN: Multi-variable type inference failed */
    public t1(long j15, float f15, a0 a0Var, l<? super Boolean, i0> lVar) {
        this.minDurationMs = j15;
        this.minFractionVisible = f15;
        this.callback = lVar;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v1 create() {
        return new v1(this.minDurationMs, this.minFractionVisible, null, this.callback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && t1.class == other.getClass()) {
            t1 t1Var = (t1) other;
            return this.minDurationMs == t1Var.minDurationMs && this.minFractionVisible == t1Var.minFractionVisible && t.c(null, null) && this.callback == t1Var.callback;
        }
        return false;
    }

    public int hashCode() {
        return (((Long.hashCode(this.minDurationMs) * 31) + Float.hashCode(this.minFractionVisible)) * 961) + this.callback.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(v1 node) {
        node.w3(this.minDurationMs);
        node.x3(this.minFractionVisible);
        node.u3(this.callback);
        node.y3(null);
        node.p3();
    }
}
