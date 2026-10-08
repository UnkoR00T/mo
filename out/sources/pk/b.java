package pk;

import java.security.GeneralSecurityException;
import ok.g;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kk.b.EnumC2684b f158033b = kk.b.EnumC2684b.f111285a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ok.a f158034a;

    public b(ok.a aVar) throws GeneralSecurityException {
        if (!f158033b.b()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f158034a = aVar;
    }
}
