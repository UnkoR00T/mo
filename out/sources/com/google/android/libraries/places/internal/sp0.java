package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class sp0 implements kp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pr0 f33714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qp0 f33715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final np0 f33716c;

    sp0(pr0 pr0Var, int i15, boolean z15) {
        this.f33714a = pr0Var;
        qp0 qp0Var = new qp0(pr0Var);
        this.f33715b = qp0Var;
        this.f33716c = new np0(PKIFailureInfo.certConfirmed, PKIFailureInfo.certConfirmed, qp0Var);
    }

    private final List b(int i15, short s15, byte b15, int i16) throws IOException {
        qp0 qp0Var = this.f33715b;
        qp0Var.f33444e = i15;
        qp0Var.f33441b = i15;
        qp0Var.f33445f = s15;
        qp0Var.f33442c = b15;
        qp0Var.f33443d = i16;
        np0 np0Var = this.f33716c;
        np0Var.b();
        return np0Var.c();
    }

    private final void h(jp0 jp0Var, int i15) {
        pr0 pr0Var = this.f33714a;
        pr0Var.q();
        pr0Var.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.places.internal.kp0
    public final boolean E1(jp0 jp0Var) throws IOException {
        try {
            this.f33714a.c2(9L);
            pr0 pr0Var = this.f33714a;
            int iF = up0.f(pr0Var);
            if (iF > 16384) {
                throw up0.i("FRAME_SIZE_ERROR: %s", Integer.valueOf(iF));
            }
            byte bK = (byte) (pr0Var.k() & 255);
            byte bK2 = (byte) (pr0Var.k() & 255);
            int iQ = pr0Var.q() & Integer.MAX_VALUE;
            Logger logger = up0.f33965a;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                up0.f33965a.logp(level, "io.grpc.okhttp.internal.framed.Http2$Reader", "nextFrame", rp0.a(true, iQ, iF, bK, bK2));
            }
            switch (bK) {
                case 0:
                    boolean z15 = bK2 & 1;
                    if ((bK2 & 32) != 0) {
                        throw up0.i("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    }
                    int iK = (bK2 & 8) != 0 ? pr0Var.k() & 255 : 0;
                    jp0Var.X(1 == z15, iQ, pr0Var, up0.e(iF, bK2, (short) iK), iF);
                    pr0Var.e1(iK);
                    return true;
                case 1:
                    if (iQ == 0) {
                        throw up0.i("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    }
                    boolean z16 = bK2 & 32;
                    boolean z17 = bK2 & 1;
                    int iK2 = (bK2 & 8) != 0 ? pr0Var.k() & 255 : 0;
                    if (z16 != 0) {
                        h(jp0Var, iQ);
                        iF -= 5;
                    }
                    short s15 = (short) iK2;
                    jp0Var.U(false, 1 == z17, iQ, -1, b(up0.e(iF, bK2, s15), s15, bK2, iQ), 4);
                    return true;
                case 2:
                    if (iF != 5) {
                        throw up0.i("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iF));
                    }
                    if (iQ == 0) {
                        throw up0.i("TYPE_PRIORITY streamId == 0", new Object[0]);
                    }
                    h(jp0Var, iQ);
                    return true;
                case 3:
                    if (iF != 4) {
                        throw up0.i("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iF));
                    }
                    if (iQ == 0) {
                        throw up0.i("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    }
                    int iQ2 = pr0Var.q();
                    ip0 ip0VarB = ip0.b(iQ2);
                    if (ip0VarB == null) {
                        throw up0.i("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iQ2));
                    }
                    jp0Var.S(iQ, ip0VarB);
                    return true;
                case 4:
                    if (iQ != 0) {
                        throw up0.i("TYPE_SETTINGS streamId != 0", new Object[0]);
                    }
                    if ((bK2 & 1) == 0) {
                        if (iF % 6 != 0) {
                            throw up0.i("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iF));
                        }
                        xp0 xp0Var = new xp0();
                        for (int i15 = 0; i15 < iF; i15 += 6) {
                            short sA = pr0Var.A();
                            int iQ3 = pr0Var.q();
                            switch (sA) {
                                case 1:
                                case 6:
                                    break;
                                case 2:
                                    if (iQ3 != 0 && iQ3 != 1) {
                                        throw up0.i("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    }
                                    break;
                                case 3:
                                    sA = 4;
                                    break;
                                case 4:
                                    if (iQ3 < 0) {
                                        throw up0.i("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    }
                                    sA = 7;
                                    break;
                                    break;
                                case 5:
                                    if (iQ3 < 16384 || iQ3 > 16777215) {
                                        throw up0.i("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iQ3));
                                    }
                                    break;
                                default:
                                    continue;
                                    break;
                            }
                            xp0Var.a(sA, 0, iQ3);
                        }
                        jp0Var.T(false, xp0Var);
                        if (xp0Var.e() >= 0) {
                            this.f33716c.a(xp0Var.e());
                        }
                    } else if (iF != 0) {
                        throw up0.i("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    }
                    return true;
                case 5:
                    if (iQ == 0) {
                        throw up0.i("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    }
                    short sK = (short) ((bK2 & 8) != 0 ? pr0Var.k() & 255 : 0);
                    jp0Var.Y(iQ, pr0Var.q() & Integer.MAX_VALUE, b(up0.e(iF - 4, bK2, sK), sK, bK2, iQ));
                    return true;
                case 6:
                    if (iF != 8) {
                        throw up0.i("TYPE_PING length != 8: %s", Integer.valueOf(iF));
                    }
                    if (iQ != 0) {
                        throw up0.i("TYPE_PING streamId != 0", new Object[0]);
                    }
                    jp0Var.V(1 == (bK2 & 1), pr0Var.q(), pr0Var.q());
                    return true;
                case 7:
                    if (iF < 8) {
                        throw up0.i("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iF));
                    }
                    if (iQ != 0) {
                        throw up0.i("TYPE_GOAWAY streamId != 0", new Object[0]);
                    }
                    int i16 = iF - 8;
                    int iQ4 = pr0Var.q();
                    int iQ5 = pr0Var.q();
                    ip0 ip0VarB2 = ip0.b(iQ5);
                    if (ip0VarB2 == null) {
                        throw up0.i("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iQ5));
                    }
                    rr0 rr0VarC2 = rr0.f33593d;
                    if (i16 > 0) {
                        rr0VarC2 = pr0Var.C2(i16);
                    }
                    jp0Var.Z(iQ4, ip0VarB2, rr0VarC2);
                    return true;
                case 8:
                    if (iF != 4) {
                        throw up0.i("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iF));
                    }
                    long jQ = ((long) pr0Var.q()) & 2147483647L;
                    if (jQ == 0) {
                        throw up0.i("windowSizeIncrement was 0", new Object[0]);
                    }
                    jp0Var.W(iQ, jQ);
                    return true;
                default:
                    pr0Var.e1(iF);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f33714a.close();
    }
}
