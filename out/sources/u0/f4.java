package u0;

import p071kotlin.Metadata;
import u0.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d¨\u0006\u001f"}, d2 = {"Lu0/f4;", "Lu0/t;", "V", "Lu0/w3;", "", "durationMillis", "delayMillis", "Lu0/g0;", "easing", "<init>", "(IILu0/g0;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "g", "(JLu0/t;Lu0/t;Lu0/t;)Lu0/t;", "f", "a", "I", "b", "()I", "d", "c", "Lu0/g0;", "getEasing", "()Lu0/g0;", "Lu0/y3;", "Lu0/y3;", "anim", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f4<V extends t> implements w3<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g0 easing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y3<V> anim;

    public f4(int i15, int i16, g0 g0Var) {
        this.durationMillis = i15;
        this.delayMillis = i16;
        this.easing = g0Var;
        this.anim = new y3<>(new o0(getDurationMillis(), getDelayMillis(), g0Var));
    }

    @Override // u0.w3
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // u0.w3
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // u0.t3
    public V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.anim.f(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // u0.t3
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.anim.g(playTimeNanos, initialValue, targetValue, initialVelocity);
    }
}
