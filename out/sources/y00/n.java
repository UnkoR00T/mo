package y00;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import iy.ConfirmDeviceCredentialParams;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ly00/n;", "LnuL/b0;", "Liy/k;", "", "Landroid/app/KeyguardManager;", "keyguardManager", "<init>", "(Landroid/app/KeyguardManager;)V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;Liy/k;)Landroid/content/Intent;", "", "resultCode", "intent", "e", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "a", "Landroid/app/KeyguardManager;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class n extends p087nuL.b0<ConfirmDeviceCredentialParams, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KeyguardManager keyguardManager;

    public n(KeyguardManager keyguardManager) {
        this.keyguardManager = keyguardManager;
    }

    @Override // p087nuL.b0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, ConfirmDeviceCredentialParams input) {
        return this.keyguardManager.createConfirmDeviceCredentialIntent(input.getTitle().getText(), input.getDescription().getText());
    }

    @Override // p087nuL.b0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean c(int resultCode, Intent intent) {
        return Boolean.valueOf(resultCode == -1);
    }
}
