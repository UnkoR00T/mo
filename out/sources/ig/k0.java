package ig;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hg.e f92220c;

    public k0(hg.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f92220c = eVar;
    }

    @Override // hg.f
    public final Looper a() {
        return this.f92220c.w();
    }
}
