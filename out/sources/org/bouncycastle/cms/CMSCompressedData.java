package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.cms.CompressedData;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.operator.InputExpanderProvider;
import org.bouncycastle.util.Encodable;

/* JADX INFO: loaded from: classes5.dex */
public class CMSCompressedData implements Encodable {
    CompressedData comData;
    ContentInfo contentInfo;

    public CMSCompressedData(InputStream inputStream) {
        this(CMSUtils.readContentInfo(inputStream));
    }

    public ASN1ObjectIdentifier getCompressedContentType() {
        return this.comData.getEncapContentInfo().getContentType();
    }

    public byte[] getContent(InputExpanderProvider inputExpanderProvider) throws CMSException {
        try {
            return CMSUtils.streamToByteArray(inputExpanderProvider.get(this.comData.getCompressionAlgorithmIdentifier()).getInputStream(((ASN1OctetString) this.comData.getEncapContentInfo().getContent()).getOctetStream()));
        } catch (IOException e15) {
            throw new CMSException("exception reading compressed stream.", e15);
        }
    }

    public CMSTypedStream getContentStream(InputExpanderProvider inputExpanderProvider) {
        ContentInfo encapContentInfo = this.comData.getEncapContentInfo();
        return new CMSTypedStream(encapContentInfo.getContentType(), inputExpanderProvider.get(this.comData.getCompressionAlgorithmIdentifier()).getInputStream(((ASN1OctetString) encapContentInfo.getContent()).getOctetStream()));
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.contentInfo.getContentType();
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return this.contentInfo.getEncoded();
    }

    public ContentInfo toASN1Structure() {
        return this.contentInfo;
    }

    public CMSCompressedData(ContentInfo contentInfo) throws CMSException {
        this.contentInfo = contentInfo;
        try {
            this.comData = CompressedData.getInstance(contentInfo.getContent());
        } catch (ClassCastException e15) {
            throw new CMSException("Malformed content.", e15);
        } catch (IllegalArgumentException e16) {
            throw new CMSException("Malformed content.", e16);
        }
    }

    public CMSCompressedData(byte[] bArr) {
        this(CMSUtils.readContentInfo(bArr));
    }
}
