package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w70 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BitSet f34126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34127e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f34130c;

    static {
        BitSet bitSet = new BitSet(CertificateBody.profileType);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c15 = '0'; c15 <= '9'; c15 = (char) (c15 + 1)) {
            bitSet.set(c15);
        }
        for (char c16 = 'a'; c16 <= 'z'; c16 = (char) (c16 + 1)) {
            bitSet.set(c16);
        }
        f34126d = bitSet;
    }

    /* synthetic */ w70(String str, boolean z15, Object obj, byte[] bArr) {
        String str2 = (String) zj.p.r(str, "name");
        this.f34128a = str2;
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        zj.p.r(lowerCase, "name");
        zj.p.e(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            v70 v70Var = a80.f31574d;
            a80.f31573c.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        int i15 = 0;
        while (i15 < lowerCase.length()) {
            char cCharAt = lowerCase.charAt(i15);
            if (!z15 || cCharAt != ':') {
                zj.p.g(f34126d.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, lowerCase);
            } else if (i15 == 0) {
                i15 = 0;
            } else {
                cCharAt = ':';
                zj.p.g(f34126d.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, lowerCase);
            }
            i15++;
        }
        this.f34129b = lowerCase;
        this.f34130c = lowerCase.getBytes(StandardCharsets.US_ASCII);
    }

    public static w70 c(String str, v70 v70Var) {
        return new u70(str, false, v70Var, null);
    }

    abstract byte[] a(Object obj);

    abstract Object b(byte[] bArr);

    public final String d() {
        return this.f34129b;
    }

    final byte[] e() {
        return this.f34130c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f34129b.equals(((w70) obj).f34129b);
    }

    public final int hashCode() {
        return this.f34129b.hashCode();
    }

    public final String toString() {
        String str = this.f34129b;
        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 12);
        sb5.append("Key{name='");
        sb5.append(str);
        sb5.append("'}");
        return sb5.toString();
    }
}
