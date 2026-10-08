package org.bouncycastle.tsp;

import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.cmp.PKIFreeText;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.tsp.TimeStampResp;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class TimeStampResponse {
    private final TimeStampResp resp;
    private final TimeStampToken timeStampToken;

    public TimeStampResponse(InputStream inputStream) {
        this(parseTimeStampResp(inputStream));
    }

    private static TimeStampResp parseTimeStampResp(InputStream inputStream) throws TSPException {
        try {
            return TimeStampResp.getInstance(new ASN1InputStream(inputStream).readObject());
        } catch (ClassCastException e15) {
            throw new TSPException("malformed timestamp response: " + e15, e15);
        } catch (IllegalArgumentException e16) {
            throw new TSPException("malformed timestamp response: " + e16, e16);
        }
    }

    public byte[] getEncoded() {
        return this.resp.getEncoded();
    }

    public PKIFailureInfo getFailInfo() {
        if (this.resp.getStatus().getFailInfo() != null) {
            return new PKIFailureInfo(this.resp.getStatus().getFailInfo());
        }
        return null;
    }

    public int getStatus() {
        return this.resp.getStatus().getStatusObject().intValueExact();
    }

    public String getStatusString() {
        if (this.resp.getStatus().getStatusString() == null) {
            return null;
        }
        StringBuilder sb5 = new StringBuilder();
        PKIFreeText statusString = this.resp.getStatus().getStatusString();
        for (int i15 = 0; i15 != statusString.size(); i15++) {
            sb5.append(statusString.getStringAtUTF8(i15).getString());
        }
        return sb5.toString();
    }

    public TimeStampToken getTimeStampToken() {
        return this.timeStampToken;
    }

    public void validate(TimeStampRequest timeStampRequest) throws TSPValidationException {
        TimeStampToken timeStampToken = getTimeStampToken();
        if (timeStampToken == null) {
            if (getStatus() == 0 || getStatus() == 1) {
                throw new TSPValidationException("no time stamp token found and one expected.");
            }
            return;
        }
        TimeStampTokenInfo timeStampInfo = timeStampToken.getTimeStampInfo();
        if (timeStampRequest.getNonce() != null && !timeStampRequest.getNonce().equals(timeStampInfo.getNonce())) {
            throw new TSPValidationException("response contains wrong nonce value.");
        }
        if (getStatus() != 0 && getStatus() != 1) {
            throw new TSPValidationException("time stamp token found in failed request.");
        }
        if (!timeStampInfo.getMessageImprintAlgOID().equals((ASN1Primitive) timeStampRequest.getMessageImprintAlgOID())) {
            throw new TSPValidationException("response for different message imprint algorithm.");
        }
        if (!Arrays.constantTimeAreEqual(timeStampRequest.getMessageImprintDigest(), timeStampInfo.getMessageImprintDigest())) {
            throw new TSPValidationException("response for different message imprint digest.");
        }
        Attribute attribute = timeStampToken.getSignedAttributes().get(PKCSObjectIdentifiers.id_aa_signingCertificate);
        Attribute attribute2 = timeStampToken.getSignedAttributes().get(PKCSObjectIdentifiers.id_aa_signingCertificateV2);
        if (attribute == null && attribute2 == null) {
            throw new TSPValidationException("no signing certificate attribute present.");
        }
        if (timeStampRequest.getReqPolicy() != null && !timeStampRequest.getReqPolicy().equals((ASN1Primitive) timeStampInfo.getPolicy())) {
            throw new TSPValidationException("TSA policy wrong for request.");
        }
    }

    TimeStampResponse(DLSequence dLSequence) throws TSPException {
        try {
            this.resp = TimeStampResp.getInstance(dLSequence);
            this.timeStampToken = new TimeStampToken(ContentInfo.getInstance(dLSequence.getObjectAt(1)));
        } catch (ClassCastException e15) {
            throw new TSPException("malformed timestamp response: " + e15, e15);
        } catch (IllegalArgumentException e16) {
            throw new TSPException("malformed timestamp response: " + e16, e16);
        }
    }

    private static TimeStampResp parseTimeStampResp(byte[] bArr) throws TSPException {
        try {
            return TimeStampResp.getInstance(bArr);
        } catch (ClassCastException e15) {
            throw new TSPException("malformed timestamp response: " + e15, e15);
        } catch (IllegalArgumentException e16) {
            throw new TSPException("malformed timestamp response: " + e16, e16);
        }
    }

    public byte[] getEncoded(String str) {
        ASN1Object dLSequence = this.resp;
        if (ASN1Encoding.DL.equals(str)) {
            dLSequence = this.timeStampToken == null ? new DLSequence(this.resp.getStatus()) : new DLSequence(this.resp.getStatus(), this.timeStampToken.toCMSSignedData().toASN1Structure());
        }
        return dLSequence.getEncoded(str);
    }

    public TimeStampResponse(TimeStampResp timeStampResp) {
        this.resp = timeStampResp;
        ContentInfo timeStampToken = timeStampResp.getTimeStampToken();
        this.timeStampToken = timeStampToken == null ? null : new TimeStampToken(timeStampToken);
    }

    public TimeStampResponse(byte[] bArr) {
        this(parseTimeStampResp(bArr));
    }
}
