package v;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends u1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Surface f202607o;

    public h2(Surface surface, Size size, int i15) {
        super(size, i15);
        this.f202607o = surface;
    }

    @Override // v.u1
    public com.google.common.util.concurrent.q<Surface> o() {
        return a0.f.h(this.f202607o);
    }
}
