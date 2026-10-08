package jg;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface m extends IInterface {

    public static abstract class a extends xg.n implements m {
        public static m m3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m1(iBinder);
        }
    }

    void cancel();
}
