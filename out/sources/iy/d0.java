package iy;

import java.security.PublicKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Liy/d0;", "", "", "message", "signature", "Ljava/security/PublicKey;", "publicKey", "Lry/n;", "algorithm", "", "a", "([B[BLjava/security/PublicKey;Lry/n;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d0 {
    static /* synthetic */ boolean b(d0 d0Var, byte[] bArr, byte[] bArr2, PublicKey publicKey, ry.n nVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verify");
        }
        if ((i15 & 8) != 0) {
            nVar = ry.n.b.a.f176853d;
        }
        return d0Var.a(bArr, bArr2, publicKey, nVar);
    }

    boolean a(byte[] message, byte[] signature, PublicKey publicKey, ry.n algorithm);
}
