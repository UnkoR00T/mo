package pc4;

import android.content.Context;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lpc4/k5;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ln14/a;", "appVersionDataSource", "Lg04/e;", "checkBiometricActivatedUseCase", "Lkh2/a;", "getAppLanguageUseCase", "Liy/g0;", "uuidGenerator", "Ljx/a;", "a", "(Landroid/content/Context;Ln14/a;Lg04/e;Lkh2/a;Liy/g0;)Ljx/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k5 f155081a = new k5();

    private k5() {
    }

    public final jx.a a(Context context, n14.a appVersionDataSource, g04.e checkBiometricActivatedUseCase, kh2.a getAppLanguageUseCase, iy.g0 uuidGenerator) {
        return new oc4.a(appVersionDataSource, checkBiometricActivatedUseCase, getAppLanguageUseCase, new lz.d(context, uuidGenerator));
    }
}
