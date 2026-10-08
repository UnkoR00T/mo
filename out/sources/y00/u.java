package y00;

import android.app.KeyguardManager;
import android.content.Context;
import iy.ConfirmDeviceCredentialParams;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ly00/u;", "Loz/b;", "Liy/k;", "", "Ly00/t;", "Liy/u;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "()Z", "c", "params", "f", "(Liy/k;Ltq/e;)Ljava/lang/Object;", "Landroid/app/KeyguardManager;", "d", "Landroid/app/KeyguardManager;", "keyguardManager", "LnuL/b0;", "e", "LnuL/b0;", "r", "()LnuL/b0;", "contract", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends oz.b<ConfirmDeviceCredentialParams, Boolean> implements t, iy.u {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final KeyguardManager keyguardManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p087nuL.b0<ConfirmDeviceCredentialParams, Boolean> contract;

    public u(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getApplicationContext().getSystemService("keyguard");
        this.keyguardManager = keyguardManager;
        this.contract = new n(keyguardManager);
    }

    @Override // iy.u
    public boolean a() {
        return this.keyguardManager.isKeyguardSecure();
    }

    @Override // iy.u
    public boolean c() {
        return this.keyguardManager.isDeviceSecure();
    }

    @Override // iy.u
    public Object f(ConfirmDeviceCredentialParams confirmDeviceCredentialParams, tq.e<? super Boolean> eVar) {
        return s(confirmDeviceCredentialParams, eVar);
    }

    @Override // oz.b
    public p087nuL.b0<ConfirmDeviceCredentialParams, Boolean> r() {
        return this.contract;
    }
}
