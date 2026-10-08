package org.bouncycastle.operator;

import java.io.OutputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;

/* JADX INFO: loaded from: classes5.dex */
public class NoSignatureContentSigner implements ContentSigner {
    @Override // org.bouncycastle.operator.ContentSigner
    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return new AlgorithmIdentifier(X509ObjectIdentifiers.id_alg_unsigned);
    }

    @Override // org.bouncycastle.operator.ContentSigner
    public OutputStream getOutputStream() {
        return new OutputStream() { // from class: org.bouncycastle.operator.NoSignatureContentSigner.1
            @Override // java.io.OutputStream
            public void write(int i15) {
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i15, int i16) {
            }
        };
    }

    @Override // org.bouncycastle.operator.ContentSigner
    public byte[] getSignature() {
        return new byte[0];
    }
}
