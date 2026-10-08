package th;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import io.sentry.android.core.c2;
import jg.l0;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public class a extends jg.h<g> implements sh.f {
    public static final /* synthetic */ int P = 0;
    private final boolean L;
    private final jg.e M;
    private final Bundle N;
    private final Integer O;

    public a(Context context, Looper looper, boolean z15, jg.e eVar, Bundle bundle, hg.f.a aVar, hg.f.b bVar) {
        super(context, looper, 44, eVar, aVar, bVar);
        this.L = true;
        this.M = eVar;
        this.N = bundle;
        this.O = eVar.h();
    }

    public static Bundle j0(jg.e eVar) {
        eVar.g();
        Integer numH = eVar.h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (numH != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numH.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // jg.c
    protected final String B() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // jg.c
    protected final String C() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sh.f
    public final void f(f fVar) {
        s.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.M.b();
            ((g) A()).o3(new j(1, new l0(accountB, ((Integer) s.l(this.O)).intValue(), "<<default account>>".equals(accountB.name) ? cg.a.a(v()).b() : null)), fVar);
        } catch (RemoteException e15) {
            c2.g("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.k2(new l(1, new gg.a(8, null), null));
            } catch (RemoteException unused) {
                c2.k("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e15);
            }
        }
    }

    @Override // sh.f
    public final void h() {
        e(new jg.c.d(this));
    }

    @Override // jg.c, hg.a.f
    public final boolean i() {
        return this.L;
    }

    @Override // jg.c, hg.a.f
    public final int l() {
        return 12451000;
    }

    @Override // jg.c
    protected final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // jg.c
    protected final Bundle x() {
        jg.e eVar = this.M;
        if (!v().getPackageName().equals(eVar.d())) {
            this.N.putString("com.google.android.gms.signin.internal.realClientPackageName", eVar.d());
        }
        return this.N;
    }
}
