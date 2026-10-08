package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jcajce.spec.ContextParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.SpecUtil;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseDeterministicOrRandomSignature extends SignatureSpi {
    protected AlgorithmParameters engineParams;
    protected AsymmetricKeyParameter keyParams;
    protected ContextParameterSpec paramSpec;
    private final JcaJceHelper helper = new BCJcaJceHelper();
    protected boolean isInitState = true;
    private final AlgorithmParameterSpec originalSpec = ContextParameterSpec.EMPTY_CONTEXT_SPEC;

    protected BaseDeterministicOrRandomSignature(String str) {
    }

    private void reInit() {
        CipherParameters parametersWithContext;
        boolean z15;
        CipherParameters cipherParameters;
        CipherParameters parametersWithRandom;
        AsymmetricKeyParameter asymmetricKeyParameter = this.keyParams;
        if (asymmetricKeyParameter.isPrivate()) {
            SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
            if (secureRandom != null) {
                parametersWithRandom = asymmetricKeyParameter;
                parametersWithRandom = new ParametersWithRandom(asymmetricKeyParameter, secureRandom);
            }
            parametersWithRandom = asymmetricKeyParameter;
            ContextParameterSpec contextParameterSpec = this.paramSpec;
            CipherParameters parametersWithContext2 = parametersWithRandom;
            if (contextParameterSpec != null) {
                parametersWithContext2 = new ParametersWithContext(parametersWithRandom, contextParameterSpec.getContext());
            }
            z15 = true;
            cipherParameters = parametersWithContext2;
        } else {
            ContextParameterSpec contextParameterSpec2 = this.paramSpec;
            if (contextParameterSpec2 != null) {
                parametersWithContext = asymmetricKeyParameter;
                parametersWithContext = new ParametersWithContext(asymmetricKeyParameter, contextParameterSpec2.getContext());
            }
            parametersWithContext = asymmetricKeyParameter;
            z15 = false;
            cipherParameters = parametersWithContext;
        }
        reInitialize(z15, cipherParameters);
    }

    @Override // java.security.SignatureSpi
    protected final Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("GetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected final AlgorithmParameters engineGetParameters() {
        ContextParameterSpec contextParameterSpec;
        if (this.engineParams == null && (contextParameterSpec = this.paramSpec) != null && contextParameterSpec != ContextParameterSpec.EMPTY_CONTEXT_SPEC) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("CONTEXT");
                this.engineParams = algorithmParametersCreateAlgorithmParameters;
                algorithmParametersCreateAlgorithmParameters.init(this.paramSpec);
            } catch (Exception e15) {
                throw Exceptions.illegalStateException(e15.toString(), e15);
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    protected final void engineInitSign(PrivateKey privateKey) {
        signInit(privateKey, null);
        this.paramSpec = ContextParameterSpec.EMPTY_CONTEXT_SPEC;
        this.isInitState = true;
        reInit();
    }

    @Override // java.security.SignatureSpi
    protected final void engineInitVerify(PublicKey publicKey) {
        verifyInit(publicKey);
        this.paramSpec = ContextParameterSpec.EMPTY_CONTEXT_SPEC;
        this.isInitState = true;
        reInit();
    }

    @Override // java.security.SignatureSpi
    protected final void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("SetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected final void engineUpdate(byte b15) {
        this.isInitState = false;
        updateEngine(b15);
    }

    protected abstract void reInitialize(boolean z15, CipherParameters cipherParameters);

    protected abstract void signInit(PrivateKey privateKey, SecureRandom secureRandom);

    protected abstract void updateEngine(byte b15);

    protected abstract void updateEngine(byte[] bArr, int i15, int i16);

    protected abstract void verifyInit(PublicKey publicKey);

    @Override // java.security.SignatureSpi
    protected final void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        signInit(privateKey, secureRandom);
        this.paramSpec = ContextParameterSpec.EMPTY_CONTEXT_SPEC;
        this.isInitState = true;
        reInit();
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null && (algorithmParameterSpec = this.originalSpec) == null) {
            return;
        }
        if (!this.isInitState) {
            throw new ProviderException("cannot call setParameter in the middle of update");
        }
        if (algorithmParameterSpec instanceof ContextParameterSpec) {
            this.paramSpec = (ContextParameterSpec) algorithmParameterSpec;
        } else {
            byte[] contextFrom = SpecUtil.getContextFrom(algorithmParameterSpec);
            if (contextFrom == null) {
                throw new InvalidAlgorithmParameterException("unknown AlgorithmParameterSpec in signature");
            }
            this.paramSpec = new ContextParameterSpec(contextFrom);
        }
        reInit();
    }

    @Override // java.security.SignatureSpi
    protected final void engineUpdate(byte[] bArr, int i15, int i16) {
        this.isInitState = false;
        updateEngine(bArr, i15, i16);
    }
}
