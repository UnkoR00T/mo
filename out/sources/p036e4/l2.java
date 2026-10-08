package p036e4;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0083@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Le4/l2;", "", "", "value", "s", "(I)I", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f47302b = s(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f47303c = s(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f47304d = s(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f47305e = s(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f47306f = s(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f47307g = s(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f47308h = s(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f47309i = s(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f47310j = s(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f47311k = s(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f47312l = s(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f47313m = s(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f47314n = s(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f47315o = s(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f47316p = s(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f47317q = s(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f47318r = s(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f47319s = s(17);

    /* JADX INFO: renamed from: e4.l2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\b¨\u0006+"}, d2 = {"Le4/l2$a;", "", "<init>", "()V", "Le4/l2;", "CancelPausedPrecomposition", "I", "b", "()I", "ReuseForceSyncDeactivation", "h", "ReuseScheduleOutOfFrameDeactivation", "i", "ReuseSyncDeactivation", "j", "ReuseDeactivationViaHost", "g", "TookFromPrecomposeMap", "r", "Subcompose", "n", "SubcomposeNew", "p", "SubcomposePausable", "q", "SubcomposeForceReuse", "o", "DeactivateOutOfFrame", "c", "DeactivateOutOfFrameCancelled", "d", "SlotToReusedFromOnDeactivate", "l", "SlotToReusedFromOnReuse", "m", "Reused", "k", "ResumePaused", "f", "PausePaused", "e", "ApplyPaused", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final int a() {
            return l2.f47319s;
        }

        public final int b() {
            return l2.f47302b;
        }

        public final int c() {
            return l2.f47312l;
        }

        public final int d() {
            return l2.f47313m;
        }

        public final int e() {
            return l2.f47318r;
        }

        public final int f() {
            return l2.f47317q;
        }

        public final int g() {
            return l2.f47306f;
        }

        public final int h() {
            return l2.f47303c;
        }

        public final int i() {
            return l2.f47304d;
        }

        public final int j() {
            return l2.f47305e;
        }

        public final int k() {
            return l2.f47316p;
        }

        public final int l() {
            return l2.f47314n;
        }

        public final int m() {
            return l2.f47315o;
        }

        public final int n() {
            return l2.f47308h;
        }

        public final int o() {
            return l2.f47311k;
        }

        public final int p() {
            return l2.f47309i;
        }

        public final int q() {
            return l2.f47310j;
        }

        public final int r() {
            return l2.f47307g;
        }

        private Companion() {
        }
    }

    public static int s(int i15) {
        return i15;
    }

    public static final boolean t(int i15, int i16) {
        return i15 == i16;
    }
}
