package org.bouncycastle.cms;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequenceGenerator;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;

/* JADX INFO: loaded from: classes5.dex */
public class CMSSignedDataStreamGenerator extends CMSSignedGenerator {
    private int _bufferSize;

    private class CmsSignedDataOutputStream extends OutputStream {
        private ASN1ObjectIdentifier _contentOID;
        private BERSequenceGenerator _eiGen;
        private OutputStream _out;
        private BERSequenceGenerator _sGen;
        private BERSequenceGenerator _sigGen;

        public CmsSignedDataOutputStream(OutputStream outputStream, ASN1ObjectIdentifier aSN1ObjectIdentifier, BERSequenceGenerator bERSequenceGenerator, BERSequenceGenerator bERSequenceGenerator2, BERSequenceGenerator bERSequenceGenerator3) {
            this._out = outputStream;
            this._contentOID = aSN1ObjectIdentifier;
            this._sGen = bERSequenceGenerator;
            this._sigGen = bERSequenceGenerator2;
            this._eiGen = bERSequenceGenerator3;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this._out.close();
            this._eiGen.close();
            CMSSignedDataStreamGenerator.this.digests.clear();
            if (CMSSignedDataStreamGenerator.this.certs.size() != 0) {
                this._sigGen.getRawOutputStream().write(new BERTaggedObject(false, 0, (ASN1Encodable) CMSUtils.createBerSetFromList(CMSSignedDataStreamGenerator.this.certs)).getEncoded());
            }
            if (CMSSignedDataStreamGenerator.this.crls.size() != 0) {
                this._sigGen.getRawOutputStream().write(new BERTaggedObject(false, 1, (ASN1Encodable) CMSUtils.createBerSetFromList(CMSSignedDataStreamGenerator.this.crls)).getEncoded());
            }
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            for (SignerInfoGenerator signerInfoGenerator : CMSSignedDataStreamGenerator.this.signerGens) {
                try {
                    aSN1EncodableVector.add(signerInfoGenerator.generate(this._contentOID));
                    CMSSignedDataStreamGenerator.this.digests.put(signerInfoGenerator.getDigestAlgorithm().getAlgorithm().getId(), signerInfoGenerator.getCalculatedDigest());
                } catch (CMSException e15) {
                    throw new CMSStreamException("exception generating signers: " + e15.getMessage(), e15);
                }
            }
            Iterator it = CMSSignedDataStreamGenerator.this._signers.iterator();
            while (it.hasNext()) {
                aSN1EncodableVector.add(((SignerInformation) it.next()).toASN1Structure());
            }
            this._sigGen.getRawOutputStream().write(new DERSet(aSN1EncodableVector).getEncoded());
            this._sigGen.close();
            this._sGen.close();
        }

        @Override // java.io.OutputStream
        public void write(int i15) throws IOException {
            this._out.write(i15);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this._out.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i15, int i16) throws IOException {
            this._out.write(bArr, i15, i16);
        }
    }

    public CMSSignedDataStreamGenerator() {
    }

    private ASN1Integer calculateVersion(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        boolean z15;
        boolean z16;
        boolean z17;
        List list = this.certs;
        boolean z18 = false;
        if (list != null) {
            z15 = false;
            z16 = false;
            z17 = false;
            for (Object obj : list) {
                if (obj instanceof ASN1TaggedObject) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
                    if (aSN1TaggedObject.getTagNo() == 1) {
                        z16 = true;
                    } else if (aSN1TaggedObject.getTagNo() == 2) {
                        z17 = true;
                    } else if (aSN1TaggedObject.getTagNo() == 3) {
                        z15 = true;
                    }
                }
            }
        } else {
            z15 = false;
            z16 = false;
            z17 = false;
        }
        if (z15) {
            return new ASN1Integer(5L);
        }
        List list2 = this.crls;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof ASN1TaggedObject) {
                    z18 = true;
                }
            }
        }
        if (z18) {
            return new ASN1Integer(5L);
        }
        if (z17) {
            return new ASN1Integer(4L);
        }
        if (!z16 && !checkForVersion3(this._signers, this.signerGens) && CMSObjectIdentifiers.data.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return new ASN1Integer(1L);
        }
        return new ASN1Integer(3L);
    }

    private static boolean checkForVersion3(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((SignerInformation) it.next()).toASN1Structure().getVersion().hasValue(3)) {
                return true;
            }
        }
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            if (((SignerInfoGenerator) it4.next()).getGeneratedVersion() == 3) {
                return true;
            }
        }
        return false;
    }

    public List<AlgorithmIdentifier> getDigestAlgorithms() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this._signers.iterator();
        while (it.hasNext()) {
            arrayList.add(CMSSignedHelper.INSTANCE.fixDigestAlgID(((SignerInformation) it.next()).getDigestAlgorithmID(), this.digestAlgIdFinder));
        }
        Iterator it4 = this.signerGens.iterator();
        while (it4.hasNext()) {
            arrayList.add(((SignerInfoGenerator) it4.next()).getDigestAlgorithm());
        }
        return arrayList;
    }

    public OutputStream open(OutputStream outputStream) {
        return open(outputStream, false);
    }

    public void setBufferSize(int i15) {
        this._bufferSize = i15;
    }

    public CMSSignedDataStreamGenerator(DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        super(digestAlgorithmIdentifierFinder);
    }

    public OutputStream open(OutputStream outputStream, boolean z15) {
        return open(CMSObjectIdentifiers.data, outputStream, z15);
    }

    public OutputStream open(OutputStream outputStream, boolean z15, OutputStream outputStream2) {
        return open(CMSObjectIdentifiers.data, outputStream, z15, outputStream2);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, boolean z15) {
        return open(aSN1ObjectIdentifier, outputStream, z15, null);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, boolean z15, OutputStream outputStream2) throws IOException {
        BERSequenceGenerator bERSequenceGenerator = new BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject((ASN1Primitive) CMSObjectIdentifiers.signedData);
        BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        bERSequenceGenerator2.addObject((ASN1Primitive) calculateVersion(aSN1ObjectIdentifier));
        HashSet hashSet = new HashSet();
        Iterator it = this._signers.iterator();
        while (it.hasNext()) {
            CMSUtils.addDigestAlgs(hashSet, (SignerInformation) it.next(), this.digestAlgIdFinder);
        }
        Iterator it4 = this.signerGens.iterator();
        while (it4.hasNext()) {
            hashSet.add(((SignerInfoGenerator) it4.next()).getDigestAlgorithm());
        }
        bERSequenceGenerator2.getRawOutputStream().write(CMSUtils.convertToDlSet(hashSet).getEncoded());
        BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject((ASN1Primitive) aSN1ObjectIdentifier);
        return new CmsSignedDataOutputStream(CMSUtils.attachSignersToOutputStream(this.signerGens, CMSUtils.getSafeTeeOutputStream(outputStream2, z15 ? CMSUtils.createBEROctetOutputStream(bERSequenceGenerator3.getRawOutputStream(), 0, true, this._bufferSize) : null)), aSN1ObjectIdentifier, bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
    }
}
