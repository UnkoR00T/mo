package g60;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\b¨\u0006\r"}, d2 = {"Lg60/a0;", "", "Lc5/k;", "dpSize", "<init>", "(Ljava/lang/String;IJ)V", "a", "J", "e", "()J", "b", "c", "d", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a0 {
    SMALL(c5.i.a(c5.h.n(30), c5.h.n((float) 34.48d))),
    XSMALL(c5.i.a(c5.h.n(37), c5.h.n(46))),
    MEDIUM(c5.i.a(c5.h.n(54), c5.h.n(61))),
    LARGE(c5.i.a(c5.h.n(69), c5.h.n(76)));


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f70850g = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long dpSize;

    a0(long j15) {
        this.dpSize = j15;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getDpSize() {
        return this.dpSize;
    }
}
