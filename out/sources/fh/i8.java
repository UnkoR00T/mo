package fh;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i8 extends b0 implements j9 {
    public static j9 l3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
        return iInterfaceQueryLocalInterface instanceof j9 ? (j9) iInterfaceQueryLocalInterface : new h7(iBinder);
    }
}
