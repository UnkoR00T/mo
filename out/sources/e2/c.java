package e2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Lc5/d;", "", "bounded", "Lm3/k;", "size", "", "a", "(Lc5/d;ZJ)F", "Lc5/h;", "F", "BoundedRippleExtraRadius", "material-ripple"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f46888a = c5.h.n(10);

    public static final float a(c5.d dVar, boolean z15, long j15) {
        float fK = m3.e.k(m3.f.a(m3.k.i(j15), m3.k.g(j15))) / 2.0f;
        return z15 ? fK + dVar.l2(f46888a) : fK;
    }
}
