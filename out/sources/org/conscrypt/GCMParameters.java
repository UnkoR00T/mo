package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* JADX INFO: loaded from: classes5.dex */
public final class GCMParameters extends AlgorithmParametersSpi {
    private static final int DEFAULT_TLEN = 96;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f149625iv;
    private int tLen;

    public GCMParameters() {
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() throws Throwable {
        long jAsn1_write_init;
        long j15;
        long jAsn1_write_sequence = 0;
        try {
            jAsn1_write_init = NativeCrypto.asn1_write_init();
            try {
                jAsn1_write_sequence = NativeCrypto.asn1_write_sequence(jAsn1_write_init);
                NativeCrypto.asn1_write_octetstring(jAsn1_write_sequence, this.f149625iv);
                int i15 = this.tLen;
                if (i15 != DEFAULT_TLEN) {
                    NativeCrypto.asn1_write_uint64(jAsn1_write_sequence, i15 / 8);
                }
                byte[] bArrAsn1_write_finish = NativeCrypto.asn1_write_finish(jAsn1_write_init);
                NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                NativeCrypto.asn1_write_free(jAsn1_write_init);
                return bArrAsn1_write_finish;
            } catch (IOException e15) {
                e = e15;
                j15 = jAsn1_write_sequence;
                jAsn1_write_sequence = jAsn1_write_init;
                try {
                    NativeCrypto.asn1_write_cleanup(jAsn1_write_sequence);
                    throw e;
                } catch (Throwable th4) {
                    th = th4;
                    long j16 = j15;
                    jAsn1_write_init = jAsn1_write_sequence;
                    jAsn1_write_sequence = j16;
                    NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                    NativeCrypto.asn1_write_free(jAsn1_write_init);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                NativeCrypto.asn1_write_free(jAsn1_write_init);
                throw th;
            }
        } catch (IOException e16) {
            e = e16;
            j15 = 0;
        } catch (Throwable th6) {
            th = th6;
            jAsn1_write_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls != null && cls.getName().equals("javax.crypto.spec.GCMParameterSpec")) {
            return cls.cast(Platform.toGCMParameterSpec(this.tLen, this.f149625iv));
        }
        throw new InvalidParameterSpecException("Unsupported class: " + cls);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        GCMParameters gCMParametersFromGCMParameterSpec = Platform.fromGCMParameterSpec(algorithmParameterSpec);
        if (gCMParametersFromGCMParameterSpec == null) {
            throw new InvalidParameterSpecException("Only GCMParameterSpec is supported");
        }
        this.tLen = gCMParametersFromGCMParameterSpec.tLen;
        this.f149625iv = gCMParametersFromGCMParameterSpec.f149625iv;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Conscrypt GCM AlgorithmParameters";
    }

    byte[] getIV() {
        return this.f149625iv;
    }

    int getTLen() {
        return this.tLen;
    }

    GCMParameters(int i15, byte[] bArr) {
        this.tLen = i15;
        this.f149625iv = bArr;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws Throwable {
        long jAsn1_read_init;
        try {
            jAsn1_read_init = NativeCrypto.asn1_read_init(bArr);
            try {
                long jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(jAsn1_read_init);
                byte[] bArrAsn1_read_octetstring = NativeCrypto.asn1_read_octetstring(jAsn1_read_sequence);
                int iAsn1_read_uint64 = !NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence) ? ((int) NativeCrypto.asn1_read_uint64(jAsn1_read_sequence)) * 8 : DEFAULT_TLEN;
                if (NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence) && NativeCrypto.asn1_read_is_empty(jAsn1_read_init)) {
                    this.f149625iv = bArrAsn1_read_octetstring;
                    this.tLen = iAsn1_read_uint64;
                    NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                    NativeCrypto.asn1_read_free(jAsn1_read_init);
                    return;
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th4) {
                th = th4;
                NativeCrypto.asn1_read_free(0L);
                NativeCrypto.asn1_read_free(jAsn1_read_init);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            jAsn1_read_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) throws IOException {
        if (str != null && !str.equals("ASN.1")) {
            throw new IOException("Unsupported format: " + str);
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws Throwable {
        if (str != null && !str.equals("ASN.1")) {
            throw new IOException("Unsupported format: " + str);
        }
        engineInit(bArr);
    }
}
