package di;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.c2;
import vh.m;
import yh.h0;
import yh.i;
import yh.j;

/* JADX INFO: loaded from: classes3.dex */
public class c extends jg.h<a> {
    private final Context L;
    private final int M;
    private final String N;
    private final int O;
    private final boolean P;
    private final String Q;

    public c(Context context, Looper looper, jg.e eVar, hg.f.a aVar, hg.f.b bVar, int i15, int i16, boolean z15, String str) {
        super(context, looper, 4, eVar, aVar, bVar);
        this.L = context;
        this.M = i15;
        Account accountA = eVar.a();
        this.N = accountA != null ? accountA.name : null;
        this.O = i16;
        this.P = z15;
        this.Q = str;
    }

    public static Bundle j0(int i15, String str, String str2, int i16, boolean z15, String str3) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i15);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z15);
        bundle.putString("androidPackageName", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str2, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i16);
        bundle.putString("com.google.android.gms.wallet.EXTRA_WALLET_CLIENT_ID", str3);
        return bundle;
    }

    private final Bundle n0() {
        return j0(this.M, this.L.getPackageName(), this.N, this.O, this.P, this.Q);
    }

    @Override // jg.c
    protected String B() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // jg.c
    protected String C() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // jg.c
    public boolean L() {
        return true;
    }

    @Override // jg.c
    public boolean P() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jg.c
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public a p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new d(iBinder);
    }

    @Override // jg.c, hg.a.f
    public int l() {
        return 12600000;
    }

    public void l0(yh.e eVar, m<Boolean> mVar) {
        g gVar = new g(mVar);
        try {
            ((a) A()).X2(eVar, n0(), gVar);
        } catch (RemoteException e15) {
            c2.f("WalletClientImpl", "RemoteException during isReadyToPay", e15);
            gVar.u0(Status.f29009h, false, Bundle.EMPTY);
        }
    }

    public void m0(j jVar, m<i> mVar) {
        Bundle bundleN0 = n0();
        bundleN0.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        h hVar = new h(mVar);
        try {
            ((a) A()).Y0(jVar, bundleN0, hVar);
        } catch (RemoteException e15) {
            c2.f("WalletClientImpl", "RemoteException getting payment data", e15);
            hVar.s2(Status.f29009h, null, Bundle.EMPTY);
        }
    }

    @Override // jg.c
    public gg.c[] s() {
        return h0.f226862i;
    }
}
