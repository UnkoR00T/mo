package org.bouncycastle.jcajce;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.crypto.util.PrivateKeyFactory;
import org.bouncycastle.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.internal.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes5.dex */
public class CompositePrivateKey implements PrivateKey {
    private AlgorithmIdentifier algorithmIdentifier;
    private final List<PrivateKey> keys;
    private final List<Provider> providers;

    public static class Builder {
        private final AlgorithmIdentifier algorithmIdentifier;
        private int count;
        private final PrivateKey[] keys;
        private final Provider[] providers;

        private Builder(AlgorithmIdentifier algorithmIdentifier) {
            this.keys = new PrivateKey[2];
            this.providers = new Provider[2];
            this.count = 0;
            this.algorithmIdentifier = algorithmIdentifier;
        }

        public Builder addPrivateKey(PrivateKey privateKey) {
            return addPrivateKey(privateKey, (Provider) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CompositePrivateKey build() {
            Provider[] providerArr = this.providers;
            return (providerArr[0] == null && providerArr[1] == null) ? new CompositePrivateKey(this.algorithmIdentifier, this.keys, null) : new CompositePrivateKey(this.algorithmIdentifier, this.keys, providerArr);
        }

        public Builder addPrivateKey(PrivateKey privateKey, String str) {
            return addPrivateKey(privateKey, Security.getProvider(str));
        }

        public Builder addPrivateKey(PrivateKey privateKey, Provider provider) {
            int i15 = this.count;
            PrivateKey[] privateKeyArr = this.keys;
            if (i15 != privateKeyArr.length) {
                privateKeyArr[i15] = privateKey;
                Provider[] providerArr = this.providers;
                this.count = i15 + 1;
                providerArr[i15] = provider;
                return this;
            }
            throw new IllegalStateException("only " + this.keys.length + " allowed in composite");
        }
    }

    public CompositePrivateKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, PrivateKey... privateKeyArr) {
        this(new AlgorithmIdentifier(aSN1ObjectIdentifier), privateKeyArr);
    }

    public static Builder builder(String str) {
        return builder(CompositeUtil.getOid(str));
    }

    private PrivateKey processKey(PrivateKey privateKey) {
        if (!(privateKey instanceof MLDSAPrivateKey)) {
            return privateKey;
        }
        try {
            return ((MLDSAPrivateKey) privateKey).getPrivateKey(true);
        } catch (Exception unused) {
            return privateKey;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompositePrivateKey) {
            CompositePrivateKey compositePrivateKey = (CompositePrivateKey) obj;
            if (compositePrivateKey.getAlgorithmIdentifier().equals(this.algorithmIdentifier) && this.keys.equals(compositePrivateKey.keys)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return CompositeIndex.getAlgorithmName(this.algorithmIdentifier.getAlgorithm());
    }

    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i15 = 0;
        if (this.algorithmIdentifier.getAlgorithm().on(IANAObjectIdentifiers.id_alg)) {
            try {
                byte[] seed = ((MLDSAPrivateKey) this.keys.get(0)).getSeed();
                byte[] octets = PrivateKeyInfoFactory.createPrivateKeyInfo(PrivateKeyFactory.createKey(this.keys.get(1).getEncoded())).getPrivateKey().getOctets();
                if (this.keys.get(1).getAlgorithm().contains("Ed")) {
                    octets = ASN1OctetString.getInstance(octets).getOctets();
                } else if (this.keys.get(1).getAlgorithm().contains("EC")) {
                    ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(octets);
                    octets = new ECPrivateKey(ECNamedCurveTable.getByOID(ASN1ObjectIdentifier.getInstance(eCPrivateKey.getParametersObject())).getCurve().getFieldSize(), eCPrivateKey.getKey(), eCPrivateKey.getParametersObject()).getEncoded();
                }
                return new PrivateKeyInfo(this.algorithmIdentifier, Arrays.concatenate(seed, octets)).getEncoded();
            } catch (IOException e15) {
                throw new IllegalStateException("unable to encode composite public key: " + e15.getMessage());
            }
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) MiscObjectIdentifiers.id_composite_key)) {
            while (i15 < this.keys.size()) {
                aSN1EncodableVector.add(PrivateKeyInfo.getInstance(this.keys.get(i15).getEncoded()));
                i15++;
            }
            try {
                return new PrivateKeyInfo(this.algorithmIdentifier, new DERSequence(aSN1EncodableVector)).getEncoded(ASN1Encoding.DER);
            } catch (IOException e16) {
                throw new IllegalStateException("unable to encode composite private key: " + e16.getMessage());
            }
        }
        byte[] bArrConcatenate = null;
        while (i15 < this.keys.size()) {
            bArrConcatenate = Arrays.concatenate(bArrConcatenate, PrivateKeyInfo.getInstance(this.keys.get(i15).getEncoded()).getPrivateKey().getOctets());
            i15++;
        }
        try {
            return new PrivateKeyInfo(this.algorithmIdentifier, bArrConcatenate).getEncoded(ASN1Encoding.DER);
        } catch (IOException e17) {
            throw new IllegalStateException("unable to encode composite private key: " + e17.getMessage());
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public List<PrivateKey> getPrivateKeys() {
        return this.keys;
    }

    public List<Provider> getProviders() {
        return this.providers;
    }

    public int hashCode() {
        return this.keys.hashCode();
    }

    public CompositePrivateKey(PrivateKeyInfo privateKeyInfo) {
        try {
            if (!CompositeIndex.isAlgorithmSupported(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm())) {
                throw new IllegalStateException("Unable to create CompositePrivateKey from PrivateKeyInfo");
            }
            CompositePrivateKey compositePrivateKey = (CompositePrivateKey) new KeyFactorySpi().generatePrivate(privateKeyInfo);
            if (compositePrivateKey == null) {
                throw new IllegalStateException("Unable to create CompositePrivateKey from PrivateKeyInfo");
            }
            this.keys = compositePrivateKey.getPrivateKeys();
            this.providers = null;
            this.algorithmIdentifier = compositePrivateKey.getAlgorithmIdentifier();
        } catch (IOException e15) {
            throw Exceptions.illegalStateException(e15.getMessage(), e15);
        }
    }

    public static Builder builder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new Builder(new AlgorithmIdentifier(aSN1ObjectIdentifier));
    }

    public CompositePrivateKey(AlgorithmIdentifier algorithmIdentifier, PrivateKey... privateKeyArr) {
        this.algorithmIdentifier = algorithmIdentifier;
        if (privateKeyArr == null || privateKeyArr.length == 0) {
            throw new IllegalArgumentException("at least one private key must be provided for the composite private key");
        }
        ArrayList arrayList = new ArrayList(privateKeyArr.length);
        for (PrivateKey privateKey : privateKeyArr) {
            arrayList.add(processKey(privateKey));
        }
        this.keys = Collections.unmodifiableList(arrayList);
        this.providers = null;
    }

    private CompositePrivateKey(AlgorithmIdentifier algorithmIdentifier, PrivateKey[] privateKeyArr, Provider[] providerArr) {
        List<Provider> listUnmodifiableList;
        this.algorithmIdentifier = algorithmIdentifier;
        if (privateKeyArr.length != 2) {
            throw new IllegalArgumentException("two keys required for composite private key");
        }
        ArrayList arrayList = new ArrayList(privateKeyArr.length);
        int i15 = 0;
        if (providerArr == null) {
            while (i15 < privateKeyArr.length) {
                arrayList.add(processKey(privateKeyArr[i15]));
                i15++;
            }
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(providerArr.length);
            while (i15 < privateKeyArr.length) {
                arrayList2.add(providerArr[i15]);
                arrayList.add(processKey(privateKeyArr[i15]));
                i15++;
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        this.providers = listUnmodifiableList;
        this.keys = Collections.unmodifiableList(arrayList);
    }

    public CompositePrivateKey(PrivateKey... privateKeyArr) {
        this(MiscObjectIdentifiers.id_composite_key, privateKeyArr);
    }
}
