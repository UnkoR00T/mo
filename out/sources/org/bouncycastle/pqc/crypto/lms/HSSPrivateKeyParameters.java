package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
public class HSSPrivateKeyParameters extends LMSKeyParameters implements LMSContextBasedSigner {
    private long index;
    private final long indexLimit;
    private final boolean isShard;
    private List<LMSPrivateKeyParameters> keys;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f149478l;
    private HSSPublicKeyParameters publicKey;
    private List<LMSSignature> sig;

    public HSSPrivateKeyParameters(int i15, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j15, long j16) {
        super(true);
        this.index = 0L;
        this.f149478l = i15;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j15;
        this.indexLimit = j16;
        this.isShard = false;
        resetKeyToIndex();
    }

    public static HSSPrivateKeyParameters getInstance(Object obj) throws Throwable {
        Throwable th4;
        if (obj instanceof HSSPrivateKeyParameters) {
            return (HSSPrivateKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int i15 = dataInputStream.readInt();
            long j15 = dataInputStream.readLong();
            long j16 = dataInputStream.readLong();
            boolean z15 = dataInputStream.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i16 = 0; i16 < i15; i16++) {
                arrayList.add(LMSPrivateKeyParameters.getInstance(obj));
            }
            for (int i17 = 0; i17 < i15 - 1; i17++) {
                arrayList2.add(LMSSignature.getInstance(obj));
            }
            return new HSSPrivateKeyParameters(i15, arrayList, arrayList2, j15, j16, z15);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                try {
                    HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(dataInputStream3);
                    dataInputStream3.close();
                    return hSSPrivateKeyParameters;
                } catch (Exception unused) {
                    LMSPrivateKeyParameters lMSPrivateKeyParameters = LMSPrivateKeyParameters.getInstance(obj);
                    HSSPrivateKeyParameters hSSPrivateKeyParameters2 = new HSSPrivateKeyParameters(lMSPrivateKeyParameters, lMSPrivateKeyParameters.getIndex(), lMSPrivateKeyParameters.getIndexLimit());
                    dataInputStream3.close();
                    return hSSPrivateKeyParameters2;
                }
            } catch (Throwable th5) {
                th4 = th5;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 == null) {
                    throw th4;
                }
                dataInputStream2.close();
                throw th4;
            }
        } catch (Throwable th6) {
            th4 = th6;
        }
    }

    private static HSSPrivateKeyParameters makeCopy(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        try {
            return getInstance(hSSPrivateKeyParameters.getEncoded());
        } catch (Exception e15) {
            throw new RuntimeException(e15.getMessage(), e15);
        }
    }

    protected Object clone() {
        return makeCopy(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) obj;
        if (this.f149478l == hSSPrivateKeyParameters.f149478l && this.isShard == hSSPrivateKeyParameters.isShard && this.indexLimit == hSSPrivateKeyParameters.indexLimit && this.index == hSSPrivateKeyParameters.index && this.keys.equals(hSSPrivateKeyParameters.keys)) {
            return this.sig.equals(hSSPrivateKeyParameters.sig);
        }
        return false;
    }

    public HSSPrivateKeyParameters extractKeyShard(int i15) {
        HSSPrivateKeyParameters hSSPrivateKeyParametersMakeCopy;
        synchronized (this) {
            try {
                if (i15 < 0) {
                    throw new IllegalArgumentException("usageCount cannot be negative");
                }
                long j15 = i15;
                long j16 = this.indexLimit;
                long j17 = this.index;
                if (j15 > j16 - j17) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining in current leaf");
                }
                long j18 = j17 + j15;
                this.index = j18;
                hSSPrivateKeyParametersMakeCopy = makeCopy(new HSSPrivateKeyParameters(this.f149478l, new ArrayList(getKeys()), new ArrayList(getSig()), j17, j18, true));
                resetKeyToIndex();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return hSSPrivateKeyParametersMakeCopy;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public LMSContext generateLMSContext() {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        LMSSignedPubKey[] lMSSignedPubKeyArr;
        int l15 = getL();
        synchronized (this) {
            try {
                HSS.rangeTestKeys(this);
                List<LMSPrivateKeyParameters> keys = getKeys();
                List<LMSSignature> sig = getSig();
                int i15 = l15 - 1;
                lMSPrivateKeyParameters = getKeys().get(i15);
                lMSSignedPubKeyArr = new LMSSignedPubKey[i15];
                int i16 = 0;
                while (i16 < i15) {
                    int i17 = i16 + 1;
                    lMSSignedPubKeyArr[i16] = new LMSSignedPubKey(sig.get(i16), keys.get(i17).getPublicKey());
                    i16 = i17;
                }
                incIndex();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return lMSPrivateKeyParameters.generateLMSContext().withSignedPublicKeys(lMSSignedPubKeyArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(LMSContext lMSContext) {
        try {
            return HSS.generateSignature(getL(), lMSContext).getEncoded();
        } catch (IOException e15) {
            throw new IllegalStateException("unable to encode signature: " + e15.getMessage(), e15);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public synchronized byte[] getEncoded() {
        Composer composerBool;
        try {
            composerBool = Composer.compose().u32str(0).u32str(this.f149478l).u64str(this.index).u64str(this.indexLimit).bool(this.isShard);
            Iterator<LMSPrivateKeyParameters> it = this.keys.iterator();
            while (it.hasNext()) {
                composerBool.bytes(it.next());
            }
            Iterator<LMSSignature> it4 = this.sig.iterator();
            while (it4.hasNext()) {
                composerBool.bytes(it4.next());
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return composerBool.build();
    }

    public synchronized long getIndex() {
        return this.index;
    }

    long getIndexLimit() {
        return this.indexLimit;
    }

    synchronized List<LMSPrivateKeyParameters> getKeys() {
        return this.keys;
    }

    public int getL() {
        return this.f149478l;
    }

    public synchronized LMSParameters[] getLMSParameters() {
        LMSParameters[] lMSParametersArr;
        int size = this.keys.size();
        lMSParametersArr = new LMSParameters[size];
        for (int i15 = 0; i15 < size; i15++) {
            LMSPrivateKeyParameters lMSPrivateKeyParameters = this.keys.get(i15);
            lMSParametersArr[i15] = new LMSParameters(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters());
        }
        return lMSParametersArr;
    }

    public synchronized HSSPublicKeyParameters getPublicKey() {
        return new HSSPublicKeyParameters(this.f149478l, getRootKey().getPublicKey());
    }

    LMSPrivateKeyParameters getRootKey() {
        return this.keys.get(0);
    }

    synchronized List<LMSSignature> getSig() {
        return this.sig;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return getIndexLimit() - getIndex();
    }

    public int hashCode() {
        int iHashCode = ((((((this.f149478l * 31) + (this.isShard ? 1 : 0)) * 31) + this.keys.hashCode()) * 31) + this.sig.hashCode()) * 31;
        long j15 = this.indexLimit;
        int i15 = (iHashCode + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.index;
        return i15 + ((int) (j16 ^ (j16 >>> 32)));
    }

    synchronized void incIndex() {
        this.index++;
    }

    boolean isShard() {
        return this.isShard;
    }

    void replaceConsumedKey(int i15) {
        int i16 = i15 - 1;
        LMOtsPrivateKey currentOTSKey = this.keys.get(i16).getCurrentOTSKey();
        int n15 = currentOTSKey.getParameter().getN();
        SeedDerive derivationFunction = currentOTSKey.getDerivationFunction();
        derivationFunction.setJ(-2);
        byte[] bArr = new byte[n15];
        derivationFunction.deriveSeed(bArr, true);
        byte[] bArr2 = new byte[n15];
        derivationFunction.deriveSeed(bArr2, false);
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        ArrayList arrayList = new ArrayList(this.keys);
        LMSPrivateKeyParameters lMSPrivateKeyParameters = this.keys.get(i15);
        arrayList.set(i15, LMS.generateKeys(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters(), 0, bArr3, bArr));
        ArrayList arrayList2 = new ArrayList(this.sig);
        arrayList2.set(i16, LMS.generateSign((LMSPrivateKeyParameters) arrayList.get(i16), ((LMSPrivateKeyParameters) arrayList.get(i15)).getPublicKey().toByteArray()));
        this.keys = Collections.unmodifiableList(arrayList);
        this.sig = Collections.unmodifiableList(arrayList2);
    }

    void resetKeyToIndex() {
        boolean z15;
        List<LMSPrivateKeyParameters> keys = getKeys();
        int size = keys.size();
        long[] jArr = new long[size];
        long index = getIndex();
        for (int size2 = keys.size() - 1; size2 >= 0; size2--) {
            LMSigParameters sigParameters = keys.get(size2).getSigParameters();
            jArr[size2] = ((long) ((1 << sigParameters.getH()) - 1)) & index;
            index >>>= sigParameters.getH();
        }
        LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = (LMSPrivateKeyParameters[]) keys.toArray(new LMSPrivateKeyParameters[keys.size()]);
        List<LMSSignature> list = this.sig;
        LMSSignature[] lMSSignatureArr = (LMSSignature[]) list.toArray(new LMSSignature[list.size()]);
        LMSPrivateKeyParameters rootKey = getRootKey();
        if (lMSPrivateKeyParametersArr[0].getIndex() - 1 != jArr[0]) {
            lMSPrivateKeyParametersArr[0] = LMS.generateKeys(rootKey.getSigParameters(), rootKey.getOtsParameters(), (int) jArr[0], rootKey.getI(), rootKey.getMasterSecret());
            z15 = true;
        } else {
            z15 = false;
        }
        int i15 = 1;
        while (i15 < size) {
            int i16 = i15 - 1;
            LMSPrivateKeyParameters lMSPrivateKeyParameters = lMSPrivateKeyParametersArr[i16];
            int n15 = lMSPrivateKeyParameters.getOtsParameters().getN();
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[n15];
            SeedDerive seedDerive = new SeedDerive(lMSPrivateKeyParameters.getI(), lMSPrivateKeyParameters.getMasterSecret(), DigestUtil.getDigest(lMSPrivateKeyParameters.getOtsParameters()));
            seedDerive.setQ((int) jArr[i16]);
            seedDerive.setJ(-2);
            seedDerive.deriveSeed(bArr2, true);
            byte[] bArr3 = new byte[n15];
            seedDerive.deriveSeed(bArr3, false);
            System.arraycopy(bArr3, 0, bArr, 0, 16);
            boolean z16 = i15 >= size + (-1) ? jArr[i15] == ((long) lMSPrivateKeyParametersArr[i15].getIndex()) : jArr[i15] == ((long) (lMSPrivateKeyParametersArr[i15].getIndex() - 1));
            if (Arrays.areEqual(bArr, lMSPrivateKeyParametersArr[i15].getI()) && Arrays.areEqual(bArr2, lMSPrivateKeyParametersArr[i15].getMasterSecret())) {
                if (!z16) {
                    lMSPrivateKeyParametersArr[i15] = LMS.generateKeys(keys.get(i15).getSigParameters(), keys.get(i15).getOtsParameters(), (int) jArr[i15], bArr, bArr2);
                }
                i15++;
            } else {
                LMSPrivateKeyParameters lMSPrivateKeyParametersGenerateKeys = LMS.generateKeys(keys.get(i15).getSigParameters(), keys.get(i15).getOtsParameters(), (int) jArr[i15], bArr, bArr2);
                lMSPrivateKeyParametersArr[i15] = lMSPrivateKeyParametersGenerateKeys;
                lMSSignatureArr[i16] = LMS.generateSign(lMSPrivateKeyParametersArr[i16], lMSPrivateKeyParametersGenerateKeys.getPublicKey().toByteArray());
            }
            z15 = true;
            i15++;
        }
        if (z15) {
            updateHierarchy(lMSPrivateKeyParametersArr, lMSSignatureArr);
        }
    }

    protected void updateHierarchy(LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr, LMSSignature[] lMSSignatureArr) {
        synchronized (this) {
            this.keys = Collections.unmodifiableList(java.util.Arrays.asList(lMSPrivateKeyParametersArr));
            this.sig = Collections.unmodifiableList(java.util.Arrays.asList(lMSSignatureArr));
        }
    }

    private HSSPrivateKeyParameters(int i15, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j15, long j16, boolean z15) {
        super(true);
        this.index = 0L;
        this.f149478l = i15;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j15;
        this.indexLimit = j16;
        this.isShard = z15;
    }

    public static HSSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) throws Throwable {
        HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(bArr);
        hSSPrivateKeyParameters.publicKey = HSSPublicKeyParameters.getInstance(bArr2);
        return hSSPrivateKeyParameters;
    }

    public HSSPrivateKeyParameters(LMSPrivateKeyParameters lMSPrivateKeyParameters, long j15, long j16) {
        super(true);
        this.index = 0L;
        this.f149478l = 1;
        this.keys = Collections.singletonList(lMSPrivateKeyParameters);
        this.sig = Collections.EMPTY_LIST;
        this.index = j15;
        this.indexLimit = j16;
        this.isShard = false;
        resetKeyToIndex();
    }
}
