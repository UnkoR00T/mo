package tk;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements fk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kk.b.EnumC2684b f190545b = kk.b.EnumC2684b.f111286b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hk.b f190546a;

    public c(byte[] bArr) throws GeneralSecurityException {
        if (!f190545b.b()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f190546a = new hk.b(bArr, true);
    }

    @Override // fk.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f190546a.b(p.c(12), bArr, bArr2);
    }

    @Override // fk.a
    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        return this.f190546a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
