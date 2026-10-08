package org.bouncycastle.operator;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes5.dex */
public interface ExtendedContentSigner extends ContentSigner {
    AlgorithmIdentifier getDigestAlgorithmIdentifier();
}
