package androidx.compose.ui.platform;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/i1;", "", "Lc5/r;", "pxSize", "Lc5/k;", "dpSize", "<init>", "(JJLfr/k;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "b", "()J", "getDpSize-MYxV2XQ", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i1 f10620d = new i1(c5.r.INSTANCE.a(), c5.k.INSTANCE.b(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long pxSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long dpSize;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.i1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/i1$a;", "", "<init>", "()V", "Lc5/r;", "pxSize", "Lc5/d;", "density", "Landroidx/compose/ui/platform/i1;", "b", "(JLc5/d;)Landroidx/compose/ui/platform/i1;", "Lc5/k;", "dpSize", "a", "Zero", "Landroidx/compose/ui/platform/i1;", "c", "()Landroidx/compose/ui/platform/i1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final i1 a(long dpSize, c5.d density) {
            return new i1(c5.s.d(density.B2(dpSize)), dpSize, null);
        }

        public final i1 b(long pxSize, c5.d density) {
            return new i1(pxSize, density.a0(c5.s.e(pxSize)), null);
        }

        public final i1 c() {
            return i1.f10620d;
        }

        private Companion() {
        }
    }

    public /* synthetic */ i1(long j15, long j16, fr.k kVar) {
        this(j15, j16);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getPxSize() {
        return this.pxSize;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) other;
        return c5.r.e(this.pxSize, i1Var.pxSize) && c5.k.h(this.dpSize, i1Var.dpSize);
    }

    public int hashCode() {
        return (c5.r.h(this.pxSize) * 31) + c5.k.k(this.dpSize);
    }

    private i1(long j15, long j16) {
        this.pxSize = j15;
        this.dpSize = j16;
    }
}
