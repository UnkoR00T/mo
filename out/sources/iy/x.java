package iy;

import java.security.SecureRandom;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/security/SecureRandom;", "", "size", "", "a", "(Ljava/security/SecureRandom;I)[B", "domain"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x {
    public static final byte[] a(SecureRandom secureRandom, int i15) {
        byte[] bArr = new byte[i15];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}
