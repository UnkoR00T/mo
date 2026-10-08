package iy;

import java.security.SecureRandom;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Liy/w;", "", "", "seed", "Ljava/security/SecureRandom;", "b", "([BLtq/e;)Ljava/lang/Object;", "a", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w {
    static /* synthetic */ Object c(w wVar, byte[] bArr, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSimpleSecureRandom");
        }
        if ((i15 & 1) != 0) {
            bArr = new byte[]{0};
        }
        return wVar.b(bArr, eVar);
    }

    Object a(byte[] bArr, tq.e<? super SecureRandom> eVar);

    Object b(byte[] bArr, tq.e<? super SecureRandom> eVar);
}
