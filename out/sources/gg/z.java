package gg;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
abstract class z extends x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final WeakReference f72749f = new WeakReference(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference f72750e;

    z(byte[] bArr) {
        super(bArr);
        this.f72750e = f72749f;
    }

    @Override // gg.x
    final byte[] m3() {
        byte[] bArrN3;
        synchronized (this) {
            try {
                bArrN3 = (byte[]) this.f72750e.get();
                if (bArrN3 == null) {
                    bArrN3 = n3();
                    this.f72750e = new WeakReference(bArrN3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return bArrN3;
    }

    protected abstract byte[] n3();
}
