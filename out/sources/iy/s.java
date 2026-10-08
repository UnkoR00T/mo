package iy;

import java.security.PrivateKey;
import javax.crypto.SecretKey;
import p071kotlin.Metadata;
import ry.DomainKeyInfo;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Liy/s;", "", "Ljava/security/PrivateKey;", "privateKey", "", "report", "Ldx/i;", "Ldx/b;", "Lry/d;", "b", "(Ljava/security/PrivateKey;ZLtq/e;)Ljava/lang/Object;", "Ljavax/crypto/SecretKey;", "secretKey", "d", "(Ljavax/crypto/SecretKey;ZLtq/e;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface s {
    static /* synthetic */ Object a(s sVar, SecretKey secretKey, boolean z15, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSecretKeyInfo");
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return sVar.d(secretKey, z15, eVar);
    }

    static /* synthetic */ Object c(s sVar, PrivateKey privateKey, boolean z15, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrivateKeyInfo");
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return sVar.b(privateKey, z15, eVar);
    }

    Object b(PrivateKey privateKey, boolean z15, tq.e<? super dx.i<? extends dx.b, DomainKeyInfo>> eVar);

    Object d(SecretKey secretKey, boolean z15, tq.e<? super dx.i<? extends dx.b, DomainKeyInfo>> eVar);
}
