package pk;

import java.security.GeneralSecurityException;
import ok.g;
import ok.i;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kk.b.EnumC2684b f158035b = kk.b.EnumC2684b.f111286b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f158036a;

    public c(i iVar) throws GeneralSecurityException {
        if (!f158035b.b()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f158036a = iVar;
    }
}
