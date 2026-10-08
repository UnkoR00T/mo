package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b¨\u0006\u001e"}, d2 = {"Lu0/o0;", "Lu0/k0;", "", "duration", "delay", "Lu0/g0;", "easing", "<init>", "(IILu0/g0;)V", "", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "c", "(JFFF)F", "e", "(FFF)J", "d", "a", "I", "getDuration", "()I", "b", "getDelay", "Lu0/g0;", "J", "durationNanos", "delayNanos", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int duration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g0 easing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long delayNanos;

    public o0(int i15, int i16, g0 g0Var) {
        this.duration = i15;
        this.delay = i16;
        this.easing = g0Var;
        this.durationNanos = ((long) i15) * 1000000;
        this.delayNanos = ((long) i16) * 1000000;
    }

    @Override // u0.k0
    public float c(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long j15 = playTimeNanos - this.delayNanos;
        long j16 = this.durationNanos;
        if (j15 < 0) {
            j15 = 0;
        }
        if (j15 > j16) {
            j15 = j16;
        }
        float fA = this.easing.a(this.duration == 0 ? 1.0f : j15 / j16);
        return (initialValue * (1 - fA)) + (targetValue * fA);
    }

    @Override // u0.k0
    public float d(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long j15 = playTimeNanos - this.delayNanos;
        long j16 = this.durationNanos;
        if (j15 < 0) {
            j15 = 0;
        }
        long j17 = j15 > j16 ? j16 : j15;
        if (j17 == 0) {
            return initialVelocity;
        }
        return (c(j17, initialValue, targetValue, initialVelocity) - c(j17 - 1000000, initialValue, targetValue, initialVelocity)) * 1000.0f;
    }

    @Override // u0.k0
    public long e(float initialValue, float targetValue, float initialVelocity) {
        return this.delayNanos + this.durationNanos;
    }
}
