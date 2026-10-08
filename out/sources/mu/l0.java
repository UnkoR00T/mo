package mu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmu/l0;", "", "Lmu/p0;", "", "subscriptionCount", "Lmu/g;", "Lmu/j0;", "a", "(Lmu/p0;)Lmu/g;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f128236a;

    /* JADX INFO: renamed from: mu.l0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Lmu/l0$a;", "", "<init>", "()V", "", "stopTimeoutMillis", "replayExpirationMillis", "Lmu/l0;", "a", "(JJ)Lmu/l0;", "b", "Lmu/l0;", "c", "()Lmu/l0;", "Eagerly", "d", "Lazily", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f128236a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final l0 Eagerly = new m0();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final l0 Lazily = new n0();

        private Companion() {
        }

        public static /* synthetic */ l0 b(Companion companion, long j15, long j16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                j15 = 0;
            }
            if ((i15 & 2) != 0) {
                j16 = Long.MAX_VALUE;
            }
            return companion.a(j15, j16);
        }

        public final l0 a(long stopTimeoutMillis, long replayExpirationMillis) {
            return new o0(stopTimeoutMillis, replayExpirationMillis);
        }

        public final l0 c() {
            return Eagerly;
        }

        public final l0 d() {
            return Lazily;
        }
    }

    g<j0> a(p0<Integer> subscriptionCount);
}
