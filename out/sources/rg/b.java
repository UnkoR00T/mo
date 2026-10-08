package rg;

import android.os.IBinder;
import android.os.IInterface;
import xg.n;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends IInterface {

    public static abstract class a extends n implements b {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static b m3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new l(iBinder);
        }
    }
}
