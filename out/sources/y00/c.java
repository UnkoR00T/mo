package y00;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly00/c;", "Liy/d0;", "Ly00/h0;", "securityProviderFactory", "<init>", "(Ly00/h0;)V", "", "message", "signature", "Ljava/security/PublicKey;", "publicKey", "Lry/n;", "algorithm", "", "a", "([B[BLjava/security/PublicKey;Lry/n;)Z", "Ly00/h0;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements iy.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0 securityProviderFactory;

    public c(h0 h0Var) {
        this.securityProviderFactory = h0Var;
    }

    @Override // iy.d0
    public boolean a(byte[] message, byte[] signature, PublicKey publicKey, ry.n algorithm) {
        try {
            Signature signature2 = Signature.getInstance(algorithm.getAlgorithm(), this.securityProviderFactory.b());
            signature2.initVerify(publicKey);
            signature2.update(message);
            return signature2.verify(signature);
        } catch (InvalidKeyException e15) {
            px.f.f163100a.d("Invalid key", e15, px.c.a(this));
            return false;
        } catch (NoSuchAlgorithmException e16) {
            px.f.f163100a.d("Invalid algorithm", e16, px.c.a(this));
            return false;
        } catch (SignatureException e17) {
            px.f.f163100a.d("Invalid signature", e17, px.c.a(this));
            return false;
        }
    }
}
