package vn3;

import a14.s;
import co3.i;
import go3.f0;
import go3.j0;
import go3.k0;
import iy.j;
import p071kotlin.Metadata;
import yn3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lvn3/a;", "", "<init>", "()V", "La14/s;", "launchAppUseCase", "Lyn3/d;", "c", "(La14/s;)Lyn3/d;", "Lgo3/d;", "fetchQrCodeDataUseCase", "Lgo3/f0;", "loadInstitutionsDataUseCase", "Lgo3/k0;", "sendDataToInstitutionUseCase", "Lxn3/a;", "b", "(Lgo3/d;Lgo3/f0;Lgo3/k0;)Lxn3/a;", "Liy/j;", "cmsManager", "Lco3/i;", "scopeMapper", "Lay/j;", "jsonSerializer", "Lez/a;", "currentTimeProvider", "Lbo3/a;", "verificationContainersInteractor", "Lao3/a;", "a", "(Liy/j;Lco3/i;Lay/j;Lez/a;Lbo3/a;)Lao3/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f207666a = new a();

    private a() {
    }

    public final ao3.a a(j cmsManager, i scopeMapper, ay.j jsonSerializer, ez.a currentTimeProvider, bo3.a verificationContainersInteractor) {
        return new yn3.a(cmsManager, scopeMapper, jsonSerializer, currentTimeProvider, verificationContainersInteractor);
    }

    public final xn3.a b(go3.d fetchQrCodeDataUseCase, f0 loadInstitutionsDataUseCase, k0 sendDataToInstitutionUseCase) {
        return new j0(fetchQrCodeDataUseCase, loadInstitutionsDataUseCase, sendDataToInstitutionUseCase);
    }

    public final yn3.d c(s launchAppUseCase) {
        return new e(launchAppUseCase);
    }
}
