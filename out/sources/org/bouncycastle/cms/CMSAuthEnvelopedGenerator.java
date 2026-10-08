package org.bouncycastle.cms;

import org.bouncycastle.asn1.cms.OriginatorInfo;

/* JADX INFO: loaded from: classes5.dex */
public class CMSAuthEnvelopedGenerator extends CMSEnvelopedGenerator {
    protected OriginatorInfo originatorInfo;
    public static final String AES128_CCM = CMSAlgorithm.AES128_CCM.getId();
    public static final String AES192_CCM = CMSAlgorithm.AES192_CCM.getId();
    public static final String AES256_CCM = CMSAlgorithm.AES256_CCM.getId();
    public static final String AES128_GCM = CMSAlgorithm.AES128_GCM.getId();
    public static final String AES192_GCM = CMSAlgorithm.AES192_GCM.getId();
    public static final String AES256_GCM = CMSAlgorithm.AES256_GCM.getId();
    public static final String ChaCha20Poly1305 = CMSAlgorithm.ChaCha20Poly1305.getId();
    protected CMSAttributeTableGenerator authAttrsGenerator = null;
    protected CMSAttributeTableGenerator unauthAttrsGenerator = null;

    protected CMSAuthEnvelopedGenerator() {
    }

    @Override // org.bouncycastle.cms.CMSEnvelopedGenerator
    public void addRecipientInfoGenerator(RecipientInfoGenerator recipientInfoGenerator) {
        this.recipientInfoGenerators.add(recipientInfoGenerator);
    }

    public void setAuthenticatedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.authAttrsGenerator = cMSAttributeTableGenerator;
    }

    @Override // org.bouncycastle.cms.CMSEnvelopedGenerator
    public void setOriginatorInfo(OriginatorInformation originatorInformation) {
        this.originatorInfo = originatorInformation.toASN1Structure();
    }

    public void setUnauthenticatedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.unauthAttrsGenerator = cMSAttributeTableGenerator;
    }
}
