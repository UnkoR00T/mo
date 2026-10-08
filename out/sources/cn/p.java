package cn;

import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p {
    static p c(int i15, RemoteException remoteException) {
        return new c(i15, tl.e(remoteException));
    }

    public abstract int a();

    public abstract tl b();

    public final boolean d() {
        return !b().c();
    }
}
