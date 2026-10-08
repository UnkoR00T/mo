package lh;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mh.e f118221a;

    j(mh.e eVar) {
        this.f118221a = eVar;
    }

    public nh.p a() {
        try {
            return this.f118221a.w0();
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }
}
