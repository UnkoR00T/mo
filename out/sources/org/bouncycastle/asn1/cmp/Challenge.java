package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes3.dex */
public class Challenge extends ASN1Object {
    private final ASN1OctetString challenge;
    private final EnvelopedData encryptedRand;
    private final AlgorithmIdentifier owf;
    private final ASN1OctetString witness;

    public static class Rand extends ASN1Object {
        private final ASN1Integer integer;
        private final GeneralName sender;

        public Rand(ASN1Integer aSN1Integer, GeneralName generalName) {
            this.integer = aSN1Integer;
            this.sender = generalName;
        }

        public static Rand getInstance(Object obj) {
            if (obj instanceof Rand) {
                return (Rand) obj;
            }
            if (obj != null) {
                return new Rand(ASN1Sequence.getInstance(obj));
            }
            return null;
        }

        public ASN1Integer getInt() {
            return this.integer;
        }

        public GeneralName getSender() {
            return this.sender;
        }

        @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
        public ASN1Primitive toASN1Primitive() {
            return new DERSequence(new ASN1Encodable[]{this.integer, this.sender});
        }

        private Rand(ASN1Sequence aSN1Sequence) {
            if (aSN1Sequence.size() != 2) {
                throw new IllegalArgumentException("expected sequence size of 2");
            }
            this.integer = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
            this.sender = GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
        }

        public Rand(byte[] bArr, GeneralName generalName) {
            this(new ASN1Integer(bArr), generalName);
        }
    }

    private Challenge(ASN1Sequence aSN1Sequence) {
        int i15 = 0;
        if (aSN1Sequence.getObjectAt(0).toASN1Primitive() instanceof ASN1Sequence) {
            this.owf = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            i15 = 1;
        } else {
            this.owf = null;
        }
        int i16 = i15 + 1;
        this.witness = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i15));
        int i17 = i15 + 2;
        ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i16));
        this.challenge = aSN1OctetString;
        if (aSN1Sequence.size() <= i17) {
            this.encryptedRand = null;
        } else {
            if (aSN1OctetString.getOctets().length != 0) {
                throw new IllegalArgumentException("ambigous challenge");
            }
            this.encryptedRand = EnvelopedData.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i17)), true);
        }
    }

    public static Challenge getInstance(Object obj) {
        if (obj instanceof Challenge) {
            return (Challenge) obj;
        }
        if (obj != null) {
            return new Challenge(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getChallenge() {
        return this.challenge.getOctets();
    }

    public EnvelopedData getEncryptedRand() {
        return this.encryptedRand;
    }

    public AlgorithmIdentifier getOwf() {
        return this.owf;
    }

    public byte[] getWitness() {
        return this.witness.getOctets();
    }

    public boolean isEncryptedRand() {
        return this.encryptedRand != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.addOptional(this.owf);
        aSN1EncodableVector.add(this.witness);
        aSN1EncodableVector.add(this.challenge);
        EnvelopedData envelopedData = this.encryptedRand;
        if (envelopedData != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, envelopedData));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public Challenge(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, EnvelopedData envelopedData) {
        this.owf = algorithmIdentifier;
        this.witness = new DEROctetString(bArr);
        this.challenge = new DEROctetString(new byte[0]);
        this.encryptedRand = envelopedData;
    }

    public Challenge(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2) {
        this.owf = algorithmIdentifier;
        this.witness = new DEROctetString(bArr);
        this.challenge = new DEROctetString(bArr2);
        this.encryptedRand = null;
    }

    public Challenge(byte[] bArr, EnvelopedData envelopedData) {
        this((AlgorithmIdentifier) null, bArr, envelopedData);
    }

    public Challenge(byte[] bArr, byte[] bArr2) {
        this((AlgorithmIdentifier) null, bArr, bArr2);
    }
}
