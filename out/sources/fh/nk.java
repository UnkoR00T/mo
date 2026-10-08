package fh;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nk extends b0 implements ok {
    public static ok l3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
        return iInterfaceQueryLocalInterface instanceof ok ? (ok) iInterfaceQueryLocalInterface : new mk(iBinder);
    }
}
