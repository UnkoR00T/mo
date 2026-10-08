package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi;

/* JADX INFO: loaded from: classes5.dex */
public class Falcon {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.falcon.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.FALCON", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.falcon_512;
            addKeyFactoryAlgorithm(configurableProvider, "FALCON-512", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi$Falcon512", aSN1ObjectIdentifier, new FalconKeyFactorySpi.Falcon512());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.falcon_1024;
            addKeyFactoryAlgorithm(configurableProvider, "FALCON-1024", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi$Falcon1024", aSN1ObjectIdentifier2, new FalconKeyFactorySpi.Falcon1024());
            configurableProvider.addAlgorithm("KeyPairGenerator.FALCON", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyPairGeneratorSpi");
            addKeyPairGeneratorAlgorithm(configurableProvider, "FALCON-512", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyPairGeneratorSpi$Falcon512", aSN1ObjectIdentifier);
            addKeyPairGeneratorAlgorithm(configurableProvider, "FALCON-1024", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyPairGeneratorSpi$Falcon1024", aSN1ObjectIdentifier2);
            addSignatureAlgorithm(configurableProvider, "FALCON", "org.bouncycastle.pqc.jcajce.provider.falcon.SignatureSpi$Base", BCObjectIdentifiers.falcon);
            addSignatureAlgorithm(configurableProvider, "FALCON-512", "org.bouncycastle.pqc.jcajce.provider.falcon.SignatureSpi$Falcon512", aSN1ObjectIdentifier);
            addSignatureAlgorithm(configurableProvider, "FALCON-1024", "org.bouncycastle.pqc.jcajce.provider.falcon.SignatureSpi$Falcon1024", aSN1ObjectIdentifier2);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.old_falcon_512;
            sb5.append(aSN1ObjectIdentifier3);
            configurableProvider.addAlgorithm(sb5.toString(), "FALCON-512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.OID." + aSN1ObjectIdentifier3, "FALCON-512");
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.old_falcon_1024;
            sb6.append(aSN1ObjectIdentifier4);
            configurableProvider.addAlgorithm(sb6.toString(), "FALCON-1024");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.OID." + aSN1ObjectIdentifier4, "FALCON-1024");
        }
    }
}
