package org.bouncycastle.cms;

/* JADX INFO: loaded from: classes5.dex */
public interface SignerInformationVerifierProvider {
    SignerInformationVerifier get(SignerId signerId);
}
