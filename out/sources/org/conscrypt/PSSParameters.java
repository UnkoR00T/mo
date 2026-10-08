package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public class PSSParameters extends AlgorithmParametersSpi {
    private PSSParameterSpec spec = PSSParameterSpec.DEFAULT;

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() throws Throwable {
        long j15;
        Throwable th4;
        long jAsn1_write_init;
        IOException e15;
        long jAsn1_write_tag = 0;
        try {
            try {
                jAsn1_write_init = NativeCrypto.asn1_write_init();
                try {
                    long jAsn1_write_sequence = NativeCrypto.asn1_write_sequence(jAsn1_write_init);
                    try {
                        OAEPParameters.writeHashAndMgfHash(jAsn1_write_sequence, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                        if (this.spec.getSaltLength() != 20) {
                            try {
                                jAsn1_write_tag = NativeCrypto.asn1_write_tag(jAsn1_write_sequence, 2);
                                NativeCrypto.asn1_write_uint64(jAsn1_write_tag, this.spec.getSaltLength());
                                NativeCrypto.asn1_write_flush(jAsn1_write_sequence);
                                NativeCrypto.asn1_write_free(jAsn1_write_tag);
                            } catch (Throwable th5) {
                                NativeCrypto.asn1_write_flush(jAsn1_write_sequence);
                                NativeCrypto.asn1_write_free(jAsn1_write_tag);
                                throw th5;
                            }
                        }
                        byte[] bArrAsn1_write_finish = NativeCrypto.asn1_write_finish(jAsn1_write_init);
                        NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                        NativeCrypto.asn1_write_free(jAsn1_write_init);
                        return bArrAsn1_write_finish;
                    } catch (IOException e16) {
                        e15 = e16;
                        NativeCrypto.asn1_write_cleanup(jAsn1_write_init);
                        throw e15;
                    }
                } catch (IOException e17) {
                    e15 = e17;
                } catch (Throwable th6) {
                    th4 = th6;
                    j15 = 0;
                    NativeCrypto.asn1_write_free(j15);
                    NativeCrypto.asn1_write_free(jAsn1_write_init);
                    throw th4;
                }
            } catch (Throwable th7) {
                th4 = th7;
            }
        } catch (IOException e18) {
            e15 = e18;
            jAsn1_write_init = 0;
        } catch (Throwable th8) {
            j15 = 0;
            th4 = th8;
            jAsn1_write_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls != null && cls == PSSParameterSpec.class) {
            return this.spec;
        }
        throw new InvalidParameterSpecException("Unsupported class: " + cls);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
            throw new InvalidParameterSpecException("Only PSSParameterSpec is supported");
        }
        this.spec = (PSSParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Conscrypt PSS AlgorithmParameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws Throwable {
        Throwable th4;
        long jAsn1_read_init;
        int iAsn1_read_uint64;
        long jAsn1_read_tagged = 0;
        try {
            jAsn1_read_init = NativeCrypto.asn1_read_init(bArr);
            try {
                long jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(jAsn1_read_init);
                try {
                    String hash = OAEPParameters.readHash(jAsn1_read_sequence);
                    String mgfHash = OAEPParameters.readMgfHash(jAsn1_read_sequence);
                    if (NativeCrypto.asn1_read_next_tag_is(jAsn1_read_sequence, 2)) {
                        try {
                            long jAsn1_read_tagged2 = NativeCrypto.asn1_read_tagged(jAsn1_read_sequence);
                            try {
                                iAsn1_read_uint64 = (int) NativeCrypto.asn1_read_uint64(jAsn1_read_tagged2);
                                NativeCrypto.asn1_read_free(jAsn1_read_tagged2);
                            } catch (Throwable th5) {
                                th = th5;
                                jAsn1_read_tagged = jAsn1_read_tagged2;
                                Throwable th6 = th;
                                NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                                throw th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    } else {
                        iAsn1_read_uint64 = 20;
                    }
                    int i15 = iAsn1_read_uint64;
                    if (NativeCrypto.asn1_read_next_tag_is(jAsn1_read_sequence, 3)) {
                        try {
                            jAsn1_read_tagged = NativeCrypto.asn1_read_tagged(jAsn1_read_sequence);
                            long jAsn1_read_uint64 = (int) NativeCrypto.asn1_read_uint64(jAsn1_read_tagged);
                            NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                            if (jAsn1_read_uint64 != 1) {
                                throw new IOException("Error reading ASN.1 encoding");
                            }
                        } catch (Throwable th8) {
                            NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                            throw th8;
                        }
                    }
                    if (NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence) && NativeCrypto.asn1_read_is_empty(jAsn1_read_init)) {
                        this.spec = new PSSParameterSpec(hash, "MGF1", new MGF1ParameterSpec(mgfHash), i15, 1);
                        NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                        NativeCrypto.asn1_read_free(jAsn1_read_init);
                        return;
                    }
                    throw new IOException("Error reading ASN.1 encoding");
                } catch (Throwable th9) {
                    th4 = th9;
                    jAsn1_read_tagged = jAsn1_read_sequence;
                    NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                    NativeCrypto.asn1_read_free(jAsn1_read_init);
                    throw th4;
                }
            } catch (Throwable th10) {
                th4 = th10;
            }
        } catch (Throwable th11) {
            th4 = th11;
            jAsn1_read_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) throws IOException {
        if (str != null && !str.equals("ASN.1") && !str.equals("X.509")) {
            throw new IOException("Unsupported format: " + str);
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws Throwable {
        if (str != null && !str.equals("ASN.1") && !str.equals("X.509")) {
            throw new IOException("Unsupported format: " + str);
        }
        engineInit(bArr);
    }
}
