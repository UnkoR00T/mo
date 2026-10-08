package g93;

import android.content.Context;
import iy.n;
import iy.s;
import iy.t;
import iy.z;
import p071kotlin.Metadata;
import py.k;
import y00.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010%\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lg93/a;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lpx/d;", "remoteLogger", "Lez/c;", "dateConverter", "Ljx/g;", "systemInfo", "Liy/n;", "emulatorDetector", "Ld93/b;", "d", "(Landroid/content/Context;Lpx/d;Lez/c;Ljx/g;Liy/n;)Ld93/b;", "Lac4/a;", "callActionWithLoaderUseCase", "Lc54/b;", "isFeatureEnabledUseCase", "threatDetectionManager", "Lf93/a;", "a", "(Lac4/a;Lc54/b;Ld93/b;)Lf93/a;", "Lgx/d;", "globalEventManager", "Lf93/b;", "c", "(Lgx/d;)Lf93/b;", "Liy/t;", "keyStoreProvider", "Lpy/k;", "keyStoreRsaKeyGenerator", "Liy/s;", "keyInspector", "Lf93/d;", "f", "(Lac4/a;Liy/t;Lpy/k;Liy/s;)Lf93/d;", "Liy/z;", "securityProviderUpdater", "Lf93/c;", "e", "(Liy/z;)Lf93/c;", "b", "(Landroid/content/Context;)Liy/n;", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final f93.a a(ac4.a callActionWithLoaderUseCase, c54.b isFeatureEnabledUseCase, d93.b threatDetectionManager) {
        return new q93.a(callActionWithLoaderUseCase, isFeatureEnabledUseCase, threatDetectionManager);
    }

    public final n b(Context applicationContext) {
        return new q(applicationContext);
    }

    public final f93.b c(gx.d globalEventManager) {
        return new q93.b(globalEventManager);
    }

    public final d93.b d(Context applicationContext, px.d remoteLogger, ez.c dateConverter, jx.g systemInfo, n emulatorDetector) {
        return new d93.c(applicationContext, remoteLogger, dateConverter, systemInfo, emulatorDetector);
    }

    public final f93.c e(z securityProviderUpdater) {
        return new q93.c(securityProviderUpdater);
    }

    public final f93.d f(ac4.a callActionWithLoaderUseCase, t keyStoreProvider, k keyStoreRsaKeyGenerator, s keyInspector) {
        return new q93.d(callActionWithLoaderUseCase, keyStoreRsaKeyGenerator, keyStoreProvider, keyInspector);
    }
}
