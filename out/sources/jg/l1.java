package jg;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends xg.a implements l {
    l1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // jg.l
    public final Account zzb() {
        Parcel parcelL3 = l3(2, n3());
        Account account = (Account) xg.o.a(parcelL3, Account.CREATOR);
        parcelL3.recycle();
        return account;
    }
}
