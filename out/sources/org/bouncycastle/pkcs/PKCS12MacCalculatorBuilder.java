package org.bouncycastle.pkcs;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.MacCalculator;

/* JADX INFO: loaded from: classes5.dex */
public interface PKCS12MacCalculatorBuilder {
    MacCalculator build(char[] cArr);

    AlgorithmIdentifier getDigestAlgorithmIdentifier();
}
