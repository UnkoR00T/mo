package u0;

import p071kotlin.Metadata;
import u0.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J/\u0010\u0019\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010'¨\u0006)"}, d2 = {"Lu0/a4;", "Lu0/t;", "V", "Lu0/t3;", "Lu0/w3;", "animation", "Lu0/i1;", "repeatMode", "Lu0/t1;", "initialStartOffset", "<init>", "(Lu0/w3;Lu0/i1;JLfr/k;)V", "", "playTimeNanos", "h", "(J)J", "start", "startVelocity", "end", "i", "(JLu0/t;Lu0/t;Lu0/t;)Lu0/t;", "initialValue", "targetValue", "initialVelocity", "g", "f", "c", "(Lu0/t;Lu0/t;Lu0/t;)J", "a", "Lu0/w3;", "b", "Lu0/i1;", "J", "getDurationNanos$animation_core", "()J", "durationNanos", "d", "initialOffsetNanos", "", "()Z", "isInfinite", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a4<V extends t> implements t3<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w3<V> animation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i1 repeatMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long initialOffsetNanos;

    public /* synthetic */ a4(w3 w3Var, i1 i1Var, long j15, fr.k kVar) {
        this(w3Var, i1Var, j15);
    }

    private final long h(long playTimeNanos) {
        long j15 = this.initialOffsetNanos;
        if (playTimeNanos + j15 <= 0) {
            return 0L;
        }
        long j16 = playTimeNanos + j15;
        long j17 = this.durationNanos;
        long j18 = j16 / j17;
        return (this.repeatMode == i1.Restart || j18 % ((long) 2) == 0) ? j16 - (j18 * j17) : ((j18 + 1) * j17) - j16;
    }

    private final V i(long playTimeNanos, V start, V startVelocity, V end) {
        long j15 = this.initialOffsetNanos;
        long j16 = playTimeNanos + j15;
        long j17 = this.durationNanos;
        return j16 > j17 ? this.animation.f(j17 - j15, start, end, startVelocity) : startVelocity;
    }

    @Override // u0.t3
    public boolean a() {
        return true;
    }

    @Override // u0.t3
    public long c(V initialValue, V targetValue, V initialVelocity) {
        return Long.MAX_VALUE;
    }

    @Override // u0.t3
    public V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.animation.f(h(playTimeNanos), initialValue, targetValue, i(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    @Override // u0.t3
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.animation.g(h(playTimeNanos), initialValue, targetValue, i(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    private a4(w3<V> w3Var, i1 i1Var, long j15) {
        this.animation = w3Var;
        this.repeatMode = i1Var;
        this.durationNanos = ((long) (w3Var.getDelayMillis() + w3Var.b())) * 1000000;
        this.initialOffsetNanos = j15 * 1000000;
    }
}
