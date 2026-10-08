package k;

import android.os.SystemClock;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\r"}, d2 = {"Lk/v;", "", "", "realtimeNsToUtcMs", "realtimeNsToMonotonicNs", "<init>", "(JJ)V", "a", "J", "getRealtimeNsToUtcMs", "()J", "b", "c", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long realtimeNsToUtcMs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long realtimeNsToMonotonicNs;

    /* JADX INFO: renamed from: k.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lk/v$a;", "", "<init>", "()V", "", "c", "()J", "b", "Lk/v;", "a", "()Lk/v;", "NS_PER_MS", "J", "NS_PER_MS_X_2", "", "MEASUREMENT_ITERATIONS", "I", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private final long b() {
            long j15 = Long.MAX_VALUE;
            long j16 = 0;
            for (int i15 = 0; i15 < 3; i15++) {
                long jNanoTime = System.nanoTime();
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long jNanoTime2 = System.nanoTime();
                long j17 = jNanoTime2 - jNanoTime;
                if (j17 < j15) {
                    j16 = jElapsedRealtimeNanos - ((jNanoTime + jNanoTime2) / ((long) 2));
                    j15 = j17;
                }
            }
            return j16;
        }

        private final long c() {
            long j15 = Long.MAX_VALUE;
            long j16 = 0;
            for (int i15 = 0; i15 < 3; i15++) {
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                long j17 = jElapsedRealtimeNanos2 - jElapsedRealtimeNanos;
                if (j17 < j15) {
                    j16 = ((jElapsedRealtimeNanos + jElapsedRealtimeNanos2) / 2000000) - jCurrentTimeMillis;
                    j15 = j17;
                }
            }
            return j16;
        }

        public final v a() {
            return new v(c(), b(), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ v(long j15, long j16, fr.k kVar) {
        this(j15, j16);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getRealtimeNsToMonotonicNs() {
        return this.realtimeNsToMonotonicNs;
    }

    private v(long j15, long j16) {
        this.realtimeNsToUtcMs = j15;
        this.realtimeNsToMonotonicNs = j16;
    }
}
