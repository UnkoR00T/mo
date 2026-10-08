package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Integer;

/* JADX INFO: loaded from: classes3.dex */
public class SubsequentMessage extends ASN1Integer {
    public static final SubsequentMessage encrCert = new SubsequentMessage(0);
    public static final SubsequentMessage challengeResp = new SubsequentMessage(1);

    private SubsequentMessage(int i15) {
        super(i15);
    }

    public static SubsequentMessage valueOf(int i15) {
        if (i15 == 0) {
            return encrCert;
        }
        if (i15 == 1) {
            return challengeResp;
        }
        throw new IllegalArgumentException("unknown value: " + i15);
    }
}
