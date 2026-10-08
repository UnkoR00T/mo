package jg;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface l extends IInterface {

    public static abstract class a extends xg.n implements l {
        public static l m3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new l1(iBinder);
        }
    }

    Account zzb();
}
