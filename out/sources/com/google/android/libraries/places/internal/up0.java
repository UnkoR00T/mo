package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class up0 implements yp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f33965a = Logger.getLogger(rp0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rr0 f33966b;

    static {
        rr0 rr0Var = rr0.f33593d;
        f33966b = qr0.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    static /* synthetic */ IllegalArgumentException c(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    static /* synthetic */ int e(int i15, byte b15, short s15) throws IOException {
        if ((b15 & 8) != 0) {
            i15--;
        }
        if (s15 <= i15) {
            return i15 - s15;
        }
        throw i("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s15), Integer.valueOf(i15));
    }

    static /* synthetic */ int f(pr0 pr0Var) {
        return (pr0Var.k() & 255) | ((pr0Var.k() & 255) << 16) | ((pr0Var.k() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException i(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    @Override // com.google.android.libraries.places.internal.yp0
    public final lp0 a(or0 or0Var, boolean z15) {
        return new tp0(or0Var, true);
    }

    @Override // com.google.android.libraries.places.internal.yp0
    public final kp0 b(pr0 pr0Var, boolean z15) {
        return new sp0(pr0Var, PKIFailureInfo.certConfirmed, true);
    }
}
