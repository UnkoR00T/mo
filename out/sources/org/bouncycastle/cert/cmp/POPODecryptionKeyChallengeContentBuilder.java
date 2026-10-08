package org.bouncycastle.cert.cmp;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.Challenge;
import org.bouncycastle.asn1.cmp.POPODecKeyChallContent;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.cms.CMSEnvelopedDataGenerator;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.RecipientInfoGenerator;
import org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class POPODecryptionKeyChallengeContentBuilder {
    private final ASN1ObjectIdentifier challengeEncAlg;
    private ASN1EncodableVector challenges = new ASN1EncodableVector();
    private final DigestCalculator owfCalculator;

    public POPODecryptionKeyChallengeContentBuilder(DigestCalculator digestCalculator, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.owfCalculator = digestCalculator;
        this.challengeEncAlg = aSN1ObjectIdentifier;
    }

    public POPODecryptionKeyChallengeContentBuilder addChallenge(RecipientInfoGenerator recipientInfoGenerator, GeneralName generalName, byte[] bArr) throws CMPException {
        ASN1EncodableVector aSN1EncodableVector;
        Challenge challenge;
        byte[] bArrClone = Arrays.clone(bArr);
        try {
            OutputStream outputStream = this.owfCalculator.getOutputStream();
            outputStream.write(new ASN1Integer(bArrClone).getEncoded());
            outputStream.close();
            try {
                CMSEnvelopedDataGenerator cMSEnvelopedDataGenerator = new CMSEnvelopedDataGenerator();
                cMSEnvelopedDataGenerator.addRecipientInfoGenerator(recipientInfoGenerator);
                EnvelopedData envelopedData = EnvelopedData.getInstance(cMSEnvelopedDataGenerator.generate(new CMSProcessableByteArray(new Challenge.Rand(bArr, generalName).getEncoded()), new JceCMSContentEncryptorBuilder(this.challengeEncAlg).setProvider(BouncyCastleProvider.PROVIDER_NAME).build()).toASN1Structure().getContent());
                if (this.challenges.size() == 0) {
                    aSN1EncodableVector = this.challenges;
                    challenge = new Challenge(this.owfCalculator.getAlgorithmIdentifier(), this.owfCalculator.getDigest(), envelopedData);
                } else {
                    aSN1EncodableVector = this.challenges;
                    challenge = new Challenge(this.owfCalculator.getDigest(), envelopedData);
                }
                aSN1EncodableVector.add(challenge);
                return this;
            } catch (Exception e15) {
                throw new CMPException("unable to encrypt challenge", e15);
            }
        } catch (IOException e16) {
            throw new CMPException("unable to calculate witness", e16);
        }
    }

    public POPODecryptionKeyChallengeContent build() {
        return new POPODecryptionKeyChallengeContent(POPODecKeyChallContent.getInstance(new DERSequence(this.challenges)), new DigestCalculatorProvider() { // from class: org.bouncycastle.cert.cmp.POPODecryptionKeyChallengeContentBuilder.1
            @Override // org.bouncycastle.operator.DigestCalculatorProvider
            public DigestCalculator get(AlgorithmIdentifier algorithmIdentifier) {
                return POPODecryptionKeyChallengeContentBuilder.this.owfCalculator;
            }
        });
    }
}
