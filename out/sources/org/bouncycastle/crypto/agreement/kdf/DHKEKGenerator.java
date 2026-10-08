package org.bouncycastle.crypto.agreement.kdf;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class DHKEKGenerator implements DerivationFunction {
    private ASN1ObjectIdentifier algorithm;
    private final Digest digest;
    private int keySize;
    private byte[] partyAInfo;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private byte[] f148950z;

    public DHKEKGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i15, int i16) {
        boolean z15;
        int i17 = i16;
        int i18 = i15;
        if (bArr.length - i17 < i18) {
            throw new OutputLengthException("output buffer too small");
        }
        long j15 = i17;
        int digestSize = this.digest.getDigestSize();
        if (j15 > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j16 = digestSize;
        int i19 = (int) (((j15 + j16) - 1) / j16);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        int i25 = 0;
        int i26 = 0;
        int i27 = 1;
        while (i26 < i19) {
            Digest digest = this.digest;
            byte[] bArr3 = this.f148950z;
            digest.update(bArr3, i25, bArr3.length);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(this.algorithm);
            aSN1EncodableVector2.add(new DEROctetString(Pack.intToBigEndian(i27)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
            if (this.partyAInfo != null) {
                z15 = true;
                aSN1EncodableVector.add(new DERTaggedObject(true, i25, (ASN1Encodable) new DEROctetString(this.partyAInfo)));
            } else {
                z15 = true;
            }
            aSN1EncodableVector.add(new DERTaggedObject(z15, 2, new DEROctetString(Pack.intToBigEndian(this.keySize))));
            try {
                byte[] encoded = new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                this.digest.update(encoded, 0, encoded.length);
                this.digest.doFinal(bArr2, 0);
                if (i17 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i18, digestSize);
                    i18 += digestSize;
                    i17 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i18, i17);
                }
                i27++;
                i26++;
                i25 = 0;
            } catch (IOException e15) {
                throw new IllegalArgumentException("unable to encode parameter info: " + e15.getMessage());
            }
        }
        this.digest.reset();
        return (int) j15;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.algorithm = dHKDFParameters.getAlgorithm();
        this.keySize = dHKDFParameters.getKeySize();
        this.f148950z = dHKDFParameters.getZ();
        this.partyAInfo = dHKDFParameters.getExtraInfo();
    }
}
