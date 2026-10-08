package w44;

import a14.a0;
import android.content.Context;
import h64.n;
import h64.r;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u0002012\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b2\u00103J/\u0010=\u001a\u00020<2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u0002042\u0006\u0010C\u001a\u00020BH\u0007¢\u0006\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lw44/a;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lay/j;", "jsonSerializer", "Ly04/a;", "buildConfigRepository", "Lv44/e;", "k", "(Landroid/content/Context;Lay/j;Ly04/a;)Lv44/e;", "Lz44/c;", "requestWritePermissionUseCase", "Les0/b;", "getConfirmationUseCase", "La14/a0;", "saveFilesOnDeviceUseCase", "Lpx/d;", "remoteLogger", "Lgs0/a;", "getTransactionConfirmationUseCase", "Lr44/b;", "b", "(Lz44/c;Les0/b;La14/a0;Lpx/d;Lgs0/a;)Lr44/b;", "Lx44/a;", "ePaymentsRepository", "Lr44/a;", "a", "(Lx44/a;)Lr44/a;", "Les0/f;", "getPaymentsUseCase", "Lr44/d;", "e", "(Lx44/a;Les0/f;)Lr44/d;", "Lx44/b;", "googlePayManager", "Ls44/a;", "c", "(Lx44/b;)Ls44/a;", "Ls44/b;", "f", "(Lx44/b;)Ls44/b;", "Lh64/e;", "getFeatureFlagListUseCase", "Ls44/c;", "g", "(Lh64/e;)Ls44/c;", "Ls44/d;", "i", "(Lx44/b;)Ls44/d;", "Lx44/c;", "paymentsWidgetRepository", "Lh64/n;", "isServiceTemporaryInterruptedUC", "Lh64/r;", "loadServicesUseCase", "Les0/e;", "getPaymentsWidgetDataUC", "Lr44/c;", "d", "(Lx44/c;Lh64/n;Lh64/r;Les0/e;)Lr44/c;", "Lr44/e;", "j", "(Lx44/c;)Lr44/e;", "Lez/a;", "currentTimeProvider", "h", "(Lez/a;)Lx44/c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final r44.a a(x44.a ePaymentsRepository) {
        return new y44.a(ePaymentsRepository);
    }

    public final r44.b b(z44.c requestWritePermissionUseCase, es0.b getConfirmationUseCase, a0 saveFilesOnDeviceUseCase, px.d remoteLogger, gs0.a getTransactionConfirmationUseCase) {
        return new z44.a(requestWritePermissionUseCase, getConfirmationUseCase, saveFilesOnDeviceUseCase, remoteLogger, getTransactionConfirmationUseCase);
    }

    public final s44.a c(x44.b googlePayManager) {
        return new a54.a(googlePayManager);
    }

    public final r44.c d(x44.c paymentsWidgetRepository, n isServiceTemporaryInterruptedUC, r loadServicesUseCase, es0.e getPaymentsWidgetDataUC) {
        return new y44.b(paymentsWidgetRepository, isServiceTemporaryInterruptedUC, loadServicesUseCase, getPaymentsWidgetDataUC);
    }

    public final r44.d e(x44.a ePaymentsRepository, es0.f getPaymentsUseCase) {
        return new y44.c(ePaymentsRepository, getPaymentsUseCase);
    }

    public final s44.b f(x44.b googlePayManager) {
        return new a54.b(googlePayManager);
    }

    public final s44.c g(h64.e getFeatureFlagListUseCase) {
        return new a54.c(getFeatureFlagListUseCase);
    }

    public final x44.c h(ez.a currentTimeProvider) {
        return new v44.f(currentTimeProvider);
    }

    public final s44.d i(x44.b googlePayManager) {
        return new a54.d(googlePayManager);
    }

    public final r44.e j(x44.c paymentsWidgetRepository) {
        return new y44.d(paymentsWidgetRepository);
    }

    public final v44.e k(Context applicationContext, ay.j jsonSerializer, y04.a buildConfigRepository) {
        return new v44.e(applicationContext, jsonSerializer, buildConfigRepository);
    }
}
