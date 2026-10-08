package iy;

import java.security.cert.X509Certificate;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\bH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Liy/j;", "", "", "data", "Lry/c;", "certKeyPair", "Ldx/i;", "Ldx/b;", "", "c", "(Ljava/lang/String;Lry/c;)Ldx/i;", "b", "([BLry/c;)[B", "plaintext", "Ljava/security/cert/X509Certificate;", "recipientCertificate", "d", "([BLjava/security/cert/X509Certificate;)Ljava/lang/String;", "a", "([B)Ljava/lang/String;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {
    String a(byte[] data);

    byte[] b(byte[] data, CertKeyPair certKeyPair);

    dx.i<dx.b, byte[]> c(String data, CertKeyPair certKeyPair);

    String d(byte[] plaintext, X509Certificate recipientCertificate);
}
