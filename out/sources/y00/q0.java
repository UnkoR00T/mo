package y00;

import java.io.ByteArrayInputStream;
import java.security.cert.X509CRL;
import org.bouncycastle.jce.provider.X509CRLParser;
import org.bouncycastle.x509.util.StreamParsingException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly00/q0;", "Liy/k0;", "<init>", "()V", "", "bytes", "Ljava/security/cert/X509CRL;", "parse", "([B)Ljava/security/cert/X509CRL;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 implements iy.k0 {
    @Override // iy.k0
    public X509CRL parse(byte[] bytes) throws StreamParsingException {
        X509CRLParser x509CRLParser = new X509CRLParser();
        x509CRLParser.engineInit(new ByteArrayInputStream(bytes));
        Object objEngineRead = x509CRLParser.engineRead();
        if (objEngineRead instanceof X509CRL) {
            return (X509CRL) objEngineRead;
        }
        return null;
    }
}
