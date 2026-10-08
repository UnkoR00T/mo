package u0;

import p071kotlin.Metadata;
import u0.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\"¨\u0006$"}, d2 = {"Lu0/s1;", "Lu0/t;", "V", "Lu0/t3;", "vectorizedAnimationSpec", "", "startDelayNanos", "<init>", "(Lu0/t3;J)V", "initialValue", "targetValue", "initialVelocity", "c", "(Lu0/t;Lu0/t;Lu0/t;)J", "playTimeNanos", "f", "(JLu0/t;Lu0/t;Lu0/t;)Lu0/t;", "g", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu0/t3;", "getVectorizedAnimationSpec", "()Lu0/t3;", "b", "J", "getStartDelayNanos", "()J", "()Z", "isInfinite", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s1<V extends t> implements t3<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t3<V> vectorizedAnimationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long startDelayNanos;

    public s1(t3<V> t3Var, long j15) {
        this.vectorizedAnimationSpec = t3Var;
        this.startDelayNanos = j15;
    }

    @Override // u0.t3
    public boolean a() {
        return this.vectorizedAnimationSpec.a();
    }

    @Override // u0.t3
    public long c(V initialValue, V targetValue, V initialVelocity) {
        return this.vectorizedAnimationSpec.c(initialValue, targetValue, initialVelocity) + this.startDelayNanos;
    }

    public boolean equals(Object other) {
        if (!(other instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) other;
        return s1Var.startDelayNanos == this.startDelayNanos && fr.t.c(s1Var.vectorizedAnimationSpec, this.vectorizedAnimationSpec);
    }

    @Override // u0.t3
    public V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long j15 = this.startDelayNanos;
        return playTimeNanos < j15 ? initialVelocity : (V) this.vectorizedAnimationSpec.f(playTimeNanos - j15, initialValue, targetValue, initialVelocity);
    }

    @Override // u0.t3
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long j15 = this.startDelayNanos;
        return playTimeNanos < j15 ? initialValue : (V) this.vectorizedAnimationSpec.g(playTimeNanos - j15, initialValue, targetValue, initialVelocity);
    }

    public int hashCode() {
        return (this.vectorizedAnimationSpec.hashCode() * 31) + Long.hashCode(this.startDelayNanos);
    }
}
