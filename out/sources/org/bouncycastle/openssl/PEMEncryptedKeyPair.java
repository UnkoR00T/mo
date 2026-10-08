package org.bouncycastle.openssl;

import java.io.IOException;
import org.bouncycastle.operator.OperatorCreationException;

/* JADX INFO: loaded from: classes5.dex */
public class PEMEncryptedKeyPair {
    private final String dekAlgName;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private final byte[] f149408iv;
    private final byte[] keyBytes;
    private final PEMKeyPairParser parser;

    PEMEncryptedKeyPair(String str, byte[] bArr, byte[] bArr2, PEMKeyPairParser pEMKeyPairParser) {
        this.dekAlgName = str;
        this.f149408iv = bArr;
        this.keyBytes = bArr2;
        this.parser = pEMKeyPairParser;
    }

    public PEMKeyPair decryptKeyPair(PEMDecryptorProvider pEMDecryptorProvider) throws IOException {
        try {
            return this.parser.parse(pEMDecryptorProvider.get(this.dekAlgName).decrypt(this.keyBytes, this.f149408iv));
        } catch (IOException e15) {
            throw e15;
        } catch (OperatorCreationException e16) {
            throw new PEMException("cannot create extraction operator: " + e16.getMessage(), e16);
        } catch (Exception e17) {
            throw new PEMException("exception processing key pair: " + e17.getMessage(), e17);
        }
    }

    public String getDekAlgName() {
        return this.dekAlgName;
    }
}
