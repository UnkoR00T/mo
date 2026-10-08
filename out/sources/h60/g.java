package h60;

import c5.h;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lh60/g;", "", "Lc5/h;", "dimension", "<init>", "(Ljava/lang/String;IF)V", "a", "F", "e", "()F", "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum g {
    XSmall(h.n(8)),
    SSmall(h.n(10)),
    MSmall(h.n(14)),
    Small(h.n(16)),
    SMedium(h.n(20)),
    Medium(h.n(24)),
    XSBig(h.n(30)),
    SBig(h.n(32)),
    MBig(h.n(40)),
    Big(h.n(48)),
    LBig(h.n(64)),
    XBig(h.n(70)),
    XXBig(h.n(96));


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ wq.a f81269r = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dimension;

    g(float f15) {
        this.dimension = f15;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getDimension() {
        return this.dimension;
    }
}
