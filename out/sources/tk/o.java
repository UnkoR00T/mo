package tk;

import fk.t;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes4.dex */
public class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rk.a f190595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f190596b;

    public o(rk.a aVar, int i15) throws InvalidAlgorithmParameterException {
        this.f190595a = aVar;
        this.f190596b = i15;
        if (i15 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i15);
    }

    @Override // fk.t
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // fk.t
    public byte[] b(byte[] bArr) {
        return this.f190595a.a(bArr, this.f190596b);
    }
}
