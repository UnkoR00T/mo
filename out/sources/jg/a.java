package jg;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public class a extends l.a {
    public static Account n3(l lVar) {
        if (lVar == null) {
            return null;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return lVar.zzb();
        } catch (RemoteException unused) {
            c2.g("AccountAccessor", "Remote account accessor probably died");
            return null;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }
}
