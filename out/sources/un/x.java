package un;

import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes4.dex */
public class x {
    public static g a(SecretKey secretKey, io.f<byte[]> fVar, byte[] bArr, byte[] bArr2) throws sn.h {
        try {
            try {
                byte[] bArrA = new tk.s(secretKey.getEncoded()).a(bArr, bArr2);
                int length = bArrA.length - io.e.a(128);
                int iA = io.e.a(192);
                byte[] bArrE = io.e.e(bArrA, 0, iA);
                byte[] bArrE2 = io.e.e(bArrA, iA, length - iA);
                byte[] bArrE3 = io.e.e(bArrA, length, io.e.a(128));
                fVar.b(bArrE);
                return new g(bArrE2, bArrE3);
            } catch (GeneralSecurityException e15) {
                throw new sn.h("Couldn't encrypt with XChaCha20Poly1305: " + e15.getMessage(), e15);
            }
        } catch (GeneralSecurityException e16) {
            throw new sn.h("Invalid XChaCha20Poly1305 key: " + e16.getMessage(), e16);
        }
    }
}
