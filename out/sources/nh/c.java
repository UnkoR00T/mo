package nh;

import android.graphics.Bitmap;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ah.p f136269a;

    public static b a(Bitmap bitmap) {
        jg.s.m(bitmap, "image must not be null");
        try {
            return new b(c().g0(bitmap));
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public static void b(ah.p pVar) {
        if (f136269a != null) {
            return;
        }
        f136269a = (ah.p) jg.s.m(pVar, "delegate must not be null");
    }

    private static ah.p c() {
        return (ah.p) jg.s.m(f136269a, "IBitmapDescriptorFactory is not initialized");
    }
}
