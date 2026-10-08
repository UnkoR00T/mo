package org.bouncycastle.cert.cmp;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmp.Challenge;
import org.bouncycastle.asn1.cmp.PKIHeader;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.cms.CMSEnvelopedData;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.Recipient;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ChallengeContent {
    private final Challenge challenge;
    private final DigestCalculator owfCalc;

    ChallengeContent(Challenge challenge, DigestCalculator digestCalculator) {
        this.challenge = challenge;
        this.owfCalc = digestCalculator;
    }

    public byte[] extractChallenge(PKIHeader pKIHeader, Recipient recipient) throws CMPException {
        try {
            Challenge.Rand rand = Challenge.Rand.getInstance(new CMSEnvelopedData(new ContentInfo(PKCSObjectIdentifiers.envelopedData, this.challenge.getEncryptedRand())).getRecipientInfos().getRecipients().iterator().next().getContent(recipient));
            if (!Arrays.constantTimeAreEqual(rand.getSender().getEncoded(), pKIHeader.getSender().getEncoded())) {
                throw new CMPChallengeFailedException("incorrect sender found");
            }
            OutputStream outputStream = this.owfCalc.getOutputStream();
            outputStream.write(rand.getInt().getEncoded());
            outputStream.close();
            if (Arrays.constantTimeAreEqual(this.challenge.getWitness(), this.owfCalc.getDigest())) {
                return rand.getInt().getValue().toByteArray();
            }
            throw new CMPChallengeFailedException("corrupted challenge found");
        } catch (IOException e15) {
            throw new CMPException(e15.getMessage(), e15);
        } catch (CMSException e16) {
            throw new CMPException(e16.getMessage(), e16);
        }
    }
}
