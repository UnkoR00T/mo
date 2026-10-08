package org.bouncycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: loaded from: classes5.dex */
public class PKCS7TypedStream extends CMSTypedStream {
    private final ASN1Encodable content;

    public PKCS7TypedStream(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        super(aSN1ObjectIdentifier);
        this.content = aSN1Encodable;
    }

    @Override // org.bouncycastle.cms.CMSTypedStream
    public void drain() {
        this.content.toASN1Primitive();
    }

    public ASN1Encodable getContent() {
        return this.content;
    }

    @Override // org.bouncycastle.cms.CMSTypedStream
    public InputStream getContentStream() {
        try {
            return getContentStream(this.content);
        } catch (IOException e15) {
            throw new CMSRuntimeException("unable to convert content to stream: " + e15.getMessage(), e15);
        }
    }

    private InputStream getContentStream(ASN1Encodable aSN1Encodable) {
        int i15;
        byte[] encoded = aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        int i16 = 1;
        if ((encoded[0] & 31) == 31) {
            do {
                i15 = encoded[i16] & 128;
                i16++;
            } while (i15 != 0);
        }
        int i17 = i16 + 1;
        byte b15 = encoded[i16];
        if ((b15 & 128) != 0) {
            i17 += b15 & 127;
        }
        return new ByteArrayInputStream(encoded, i17, encoded.length - i17);
    }
}
