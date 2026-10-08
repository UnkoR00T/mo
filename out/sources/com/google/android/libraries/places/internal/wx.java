package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class wx extends xx {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InputStream f34207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f34208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f34211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34214n;

    /* synthetic */ wx(InputStream inputStream, int i15, byte[] bArr) {
        super(null);
        this.f34214n = Integer.MAX_VALUE;
        this.f34207g = inputStream;
        this.f34208h = new byte[PKIFailureInfo.certConfirmed];
        this.f34209i = 0;
        this.f34211k = 0;
        this.f34213m = 0;
    }

    private final void I() {
        int i15 = this.f34209i + this.f34210j;
        this.f34209i = i15;
        int i16 = this.f34213m + i15;
        int i17 = this.f34214n;
        if (i16 <= i17) {
            this.f34210j = 0;
            return;
        }
        int i18 = i16 - i17;
        this.f34210j = i18;
        this.f34209i = i15 - i18;
    }

    private final void J(int i15) throws lz {
        if (K(i15)) {
            return;
        }
        if (i15 <= (this.f34319d - this.f34213m) - this.f34211k) {
            throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new lz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean K(int i15) throws IOException {
        int i16 = this.f34211k;
        int i17 = i16 + i15;
        int i18 = this.f34209i;
        if (i17 <= i18) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 66);
            sb5.append("refillBuffer() called when ");
            sb5.append(i15);
            sb5.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb5.toString());
        }
        int i19 = this.f34319d;
        int i25 = this.f34213m;
        if (i15 > (i19 - i25) - i16 || i25 + i16 + i15 > this.f34214n) {
            return false;
        }
        if (i16 > 0) {
            if (i18 > i16) {
                byte[] bArr = this.f34208h;
                System.arraycopy(bArr, i16, bArr, 0, i18 - i16);
            }
            i25 = this.f34213m + i16;
            this.f34213m = i25;
            i18 = this.f34209i - i16;
            this.f34209i = i18;
            this.f34211k = 0;
        }
        try {
            int i26 = this.f34207g.read(this.f34208h, i18, Math.min(4096 - i18, (this.f34319d - i25) - i18));
            if (i26 != 0 && i26 >= -1 && i26 <= 4096) {
                if (i26 <= 0) {
                    return false;
                }
                this.f34209i += i26;
                I();
                return this.f34209i >= i15 || K(i15);
            }
            String strValueOf = String.valueOf(this.f34207g.getClass());
            StringBuilder sb6 = new StringBuilder(strValueOf.length() + 39 + String.valueOf(i26).length() + 41);
            sb6.append(strValueOf);
            sb6.append("#read(byte[]) returned invalid result: ");
            sb6.append(i26);
            sb6.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb6.toString());
        } catch (lz e15) {
            e15.a();
            throw e15;
        }
    }

    private final byte[] L(int i15, boolean z15) throws IOException {
        byte[] bArrM = M(i15);
        if (bArrM != null) {
            return bArrM;
        }
        int i16 = this.f34211k;
        int i17 = this.f34209i;
        int i18 = i17 - i16;
        this.f34213m += i17;
        this.f34211k = 0;
        this.f34209i = 0;
        List<byte[]> listN = N(i15 - i18);
        byte[] bArr = new byte[i15];
        System.arraycopy(this.f34208h, i16, bArr, 0, i18);
        for (byte[] bArr2 : listN) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i18, length);
            i18 += length;
        }
        return bArr;
    }

    private final byte[] M(int i15) throws IOException {
        if (i15 == 0) {
            return jz.f32680a;
        }
        int i16 = this.f34213m;
        int i17 = this.f34211k;
        int i18 = i16 + i17 + i15;
        if (i18 - this.f34319d > 0) {
            throw new lz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i19 = this.f34214n;
        if (i18 > i19) {
            H((i19 - i16) - i17);
            throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i25 = this.f34209i - i17;
        int i26 = i15 - i25;
        if (i26 >= 4096) {
            try {
                if (i26 > this.f34207g.available()) {
                    return null;
                }
            } catch (lz e15) {
                e15.a();
                throw e15;
            }
        }
        byte[] bArr = new byte[i15];
        System.arraycopy(this.f34208h, this.f34211k, bArr, 0, i25);
        this.f34213m += this.f34209i;
        this.f34211k = 0;
        this.f34209i = 0;
        while (i25 < i15) {
            try {
                int i27 = this.f34207g.read(bArr, i25, i15 - i25);
                if (i27 == -1) {
                    throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f34213m += i27;
                i25 += i27;
            } catch (lz e16) {
                e16.a();
                throw e16;
            }
        }
        return bArr;
    }

    private final List N(int i15) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i15 > 0) {
            int iMin = Math.min(i15, PKIFailureInfo.certConfirmed);
            byte[] bArr = new byte[iMin];
            int i16 = 0;
            while (i16 < iMin) {
                try {
                    int i17 = this.f34207g.read(bArr, i16, iMin - i16);
                    if (i17 == -1) {
                        throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.f34213m += i17;
                    i16 += i17;
                } catch (lz e15) {
                    e15.a();
                    throw e15;
                }
            }
            i15 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final tx A() throws IOException {
        int iO = O();
        int i15 = this.f34209i;
        int i16 = this.f34211k;
        if (iO <= i15 - i16 && iO > 0) {
            tx txVarO = tx.o(this.f34208h, i16, iO, false);
            this.f34211k += iO;
            return txVarO;
        }
        if (iO == 0) {
            return tx.f33820b;
        }
        if (iO < 0) {
            throw new lz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrM = M(iO);
        if (bArrM != null) {
            return tx.o(bArrM, 0, bArrM.length, false);
        }
        int i17 = this.f34211k;
        int i18 = this.f34209i;
        int i19 = i18 - i17;
        this.f34213m += i18;
        this.f34211k = 0;
        this.f34209i = 0;
        List<byte[]> listN = N(iO - i19);
        byte[] bArr = new byte[iO];
        System.arraycopy(this.f34208h, i17, bArr, 0, i19);
        for (byte[] bArr2 : listN) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i19, length);
            i19 += length;
        }
        try {
            return tx.s(bArr, false);
        } catch (lz e15) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int B() {
        return O();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int C() {
        return O();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int D() {
        return R();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final long E() {
        return S();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int F() {
        return xx.l(O());
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final long G() {
        return xx.m(P());
    }

    public final void H(int i15) throws lz {
        int i16 = this.f34209i;
        int i17 = this.f34211k;
        int i18 = i16 - i17;
        if (i15 <= i18 && i15 >= 0) {
            this.f34211k = i17 + i15;
            return;
        }
        if (i15 < 0) {
            throw new lz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i19 = this.f34213m;
        int i25 = i19 + i17;
        int i26 = this.f34214n;
        if (i25 + i15 > i26) {
            H((i26 - i19) - i17);
            throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f34213m = i25;
        this.f34209i = 0;
        this.f34211k = 0;
        while (i18 < i15) {
            try {
                long j15 = i15 - i18;
                try {
                    long jSkip = this.f34207g.skip(j15);
                    if (jSkip < 0 || jSkip > j15) {
                        String strValueOf = String.valueOf(this.f34207g.getClass());
                        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb5.append(strValueOf);
                        sb5.append("#skip returned invalid result: ");
                        sb5.append(jSkip);
                        sb5.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb5.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i18 += (int) jSkip;
                    }
                } catch (lz e15) {
                    e15.a();
                    throw e15;
                }
            } catch (Throwable th4) {
                this.f34213m += i18;
                I();
                throw th4;
            }
        }
        this.f34213m += i18;
        I();
        if (i18 >= i15) {
            return;
        }
        int i27 = this.f34209i;
        int i28 = i27 - this.f34211k;
        this.f34211k = i27;
        J(1);
        while (true) {
            int i29 = i15 - i28;
            int i35 = this.f34209i;
            if (i29 <= i35) {
                this.f34211k = i29;
                return;
            } else {
                i28 += i35;
                this.f34211k = i35;
                J(1);
            }
        }
    }

    public final int O() {
        int i15;
        int i16 = this.f34211k;
        int i17 = this.f34209i;
        if (i17 != i16) {
            byte[] bArr = this.f34208h;
            int i18 = i16 + 1;
            byte b15 = bArr[i16];
            if (b15 >= 0) {
                this.f34211k = i18;
                return b15;
            }
            if (i17 - i18 >= 9) {
                int i19 = i16 + 2;
                int i25 = (bArr[i18] << 7) ^ b15;
                if (i25 < 0) {
                    i15 = i25 ^ (-128);
                } else {
                    int i26 = i16 + 3;
                    int i27 = (bArr[i19] << 14) ^ i25;
                    if (i27 >= 0) {
                        i15 = i27 ^ 16256;
                    } else {
                        int i28 = i16 + 4;
                        int i29 = i27 ^ (bArr[i26] << 21);
                        if (i29 < 0) {
                            i15 = (-2080896) ^ i29;
                        } else {
                            i26 = i16 + 5;
                            byte b16 = bArr[i28];
                            int i35 = (i29 ^ (b16 << 28)) ^ 266354560;
                            if (b16 < 0) {
                                i28 = i16 + 6;
                                if (bArr[i26] < 0) {
                                    i26 = i16 + 7;
                                    if (bArr[i28] < 0) {
                                        i28 = i16 + 8;
                                        if (bArr[i26] < 0) {
                                            i26 = i16 + 9;
                                            if (bArr[i28] < 0) {
                                                int i36 = i16 + 10;
                                                if (bArr[i26] >= 0) {
                                                    i19 = i36;
                                                    i15 = i35;
                                                }
                                            }
                                        }
                                    }
                                }
                                i15 = i35;
                            }
                            i15 = i35;
                        }
                        i19 = i28;
                    }
                    i19 = i26;
                }
                this.f34211k = i19;
                return i15;
            }
        }
        return (int) Q();
    }

    public final long P() {
        long j15;
        long j16;
        long j17;
        int i15 = this.f34211k;
        int i16 = this.f34209i;
        if (i16 != i15) {
            byte[] bArr = this.f34208h;
            int i17 = i15 + 1;
            byte b15 = bArr[i15];
            if (b15 >= 0) {
                this.f34211k = i17;
                return b15;
            }
            if (i16 - i17 >= 9) {
                int i18 = i15 + 2;
                int i19 = (bArr[i17] << 7) ^ b15;
                if (i19 < 0) {
                    j15 = i19 ^ (-128);
                } else {
                    int i25 = i15 + 3;
                    int i26 = (bArr[i18] << 14) ^ i19;
                    if (i26 >= 0) {
                        j15 = i26 ^ 16256;
                    } else {
                        int i27 = i15 + 4;
                        int i28 = i26 ^ (bArr[i25] << 21);
                        if (i28 < 0) {
                            long j18 = (-2080896) ^ i28;
                            i18 = i27;
                            j15 = j18;
                        } else {
                            i25 = i15 + 5;
                            long j19 = (((long) bArr[i27]) << 28) ^ ((long) i28);
                            if (j19 >= 0) {
                                j15 = j19 ^ 266354560;
                            } else {
                                i18 = i15 + 6;
                                long j25 = (((long) bArr[i25]) << 35) ^ j19;
                                if (j25 < 0) {
                                    j17 = -34093383808L;
                                } else {
                                    int i29 = i15 + 7;
                                    long j26 = j25 ^ (((long) bArr[i18]) << 42);
                                    if (j26 >= 0) {
                                        j16 = 4363953127296L;
                                    } else {
                                        i18 = i15 + 8;
                                        j25 = j26 ^ (((long) bArr[i29]) << 49);
                                        if (j25 < 0) {
                                            j17 = -558586000294016L;
                                        } else {
                                            i29 = i15 + 9;
                                            j26 = j25 ^ (((long) bArr[i18]) << 56);
                                            if (j26 >= 0) {
                                                j16 = 71499008037633920L;
                                            } else {
                                                i18 = i15 + 10;
                                                long j27 = j26 ^ (((long) bArr[i29]) << 63);
                                                if (j27 >= 0) {
                                                    j15 = j27 ^ (-9151873028817141888L);
                                                }
                                            }
                                        }
                                    }
                                    j15 = j26 ^ j16;
                                    i18 = i29;
                                }
                                j15 = j25 ^ j17;
                            }
                        }
                    }
                    i18 = i25;
                }
                this.f34211k = i18;
                return j15;
            }
        }
        return Q();
    }

    final long Q() throws lz {
        long j15 = 0;
        for (int i15 = 0; i15 < 64; i15 += 7) {
            byte bT = T();
            j15 |= ((long) (bT & 127)) << i15;
            if ((bT & 128) == 0) {
                return j15;
            }
        }
        throw new lz("CodedInputStream encountered a malformed varint.");
    }

    public final int R() throws lz {
        int i15 = this.f34211k;
        if (this.f34209i - i15 < 4) {
            J(4);
            i15 = this.f34211k;
        }
        byte[] bArr = this.f34208h;
        this.f34211k = i15 + 4;
        int i16 = bArr[i15] & 255;
        int i17 = bArr[i15 + 1] & 255;
        int i18 = bArr[i15 + 2] & 255;
        return ((bArr[i15 + 3] & 255) << 24) | (i17 << 8) | i16 | (i18 << 16);
    }

    public final long S() throws lz {
        int i15 = this.f34211k;
        if (this.f34209i - i15 < 8) {
            J(8);
            i15 = this.f34211k;
        }
        byte[] bArr = this.f34208h;
        this.f34211k = i15 + 8;
        long j15 = bArr[i15];
        long j16 = (((long) bArr[i15 + 1]) & 255) << 8;
        long j17 = bArr[i15 + 2];
        long j18 = bArr[i15 + 3];
        return ((((long) bArr[i15 + 6]) & 255) << 48) | (j15 & 255) | j16 | ((j17 & 255) << 16) | ((j18 & 255) << 24) | ((bArr[i15 + 4] & 255) << 32) | ((bArr[i15 + 5] & 255) << 40) | ((((long) bArr[i15 + 7]) & 255) << 56);
    }

    public final byte T() throws lz {
        if (this.f34211k == this.f34209i) {
            J(1);
        }
        byte[] bArr = this.f34208h;
        int i15 = this.f34211k;
        this.f34211k = i15 + 1;
        return bArr[i15];
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int a(int i15) throws lz {
        if (i15 < 0) {
            throw new lz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i16 = i15 + this.f34213m + this.f34211k;
        if (i16 < 0) {
            throw new lz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i17 = this.f34214n;
        if (i16 > i17) {
            throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f34214n = i16;
        I();
        return i17;
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final void b(int i15) {
        this.f34214n = i15;
        I();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final boolean c() {
        return this.f34211k == this.f34209i && !K(1);
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int d() {
        return this.f34213m + this.f34211k;
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int n() throws lz {
        if (c()) {
            this.f34212l = 0;
            return 0;
        }
        int iO = O();
        this.f34212l = iO;
        if ((iO >>> 3) != 0) {
            return iO;
        }
        throw new lz("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final void o(int i15) throws lz {
        if (this.f34212l != i15) {
            throw new lz("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final boolean p(int i15) throws lz {
        int i16 = i15 & 7;
        int i17 = 0;
        if (i16 == 0) {
            if (this.f34209i - this.f34211k < 10) {
                while (i17 < 10) {
                    if (T() < 0) {
                        i17++;
                    }
                }
                throw new lz("CodedInputStream encountered a malformed varint.");
            }
            while (i17 < 10) {
                byte[] bArr = this.f34208h;
                int i18 = this.f34211k;
                this.f34211k = i18 + 1;
                if (bArr[i18] < 0) {
                    i17++;
                }
            }
            throw new lz("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i16 == 1) {
            H(8);
            return true;
        }
        if (i16 == 2) {
            H(O());
            return true;
        }
        if (i16 == 3) {
            j();
            o(((i15 >>> 3) << 3) | 4);
            return true;
        }
        if (i16 == 4) {
            i();
            return false;
        }
        if (i16 != 5) {
            throw new kz("Protocol message tag had invalid wire type.");
        }
        H(4);
        return true;
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final double q() {
        return Double.longBitsToDouble(S());
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final float r() {
        return Float.intBitsToFloat(R());
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final long s() {
        return P();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final long t() {
        return P();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int u() {
        return O();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final long v() {
        return S();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int w() {
        return R();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final boolean x() {
        return P() != 0;
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final String y() throws lz {
        int iO = O();
        if (iO > 0) {
            int i15 = this.f34209i;
            int i16 = this.f34211k;
            if (iO <= i15 - i16) {
                String str = new String(this.f34208h, i16, iO, StandardCharsets.UTF_8);
                this.f34211k += iO;
                return str;
            }
        }
        if (iO == 0) {
            return "";
        }
        if (iO < 0) {
            throw new lz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iO > this.f34209i) {
            return new String(L(iO, false), StandardCharsets.UTF_8);
        }
        J(iO);
        String str2 = new String(this.f34208h, this.f34211k, iO, StandardCharsets.UTF_8);
        this.f34211k += iO;
        return str2;
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final String z() throws IOException {
        byte[] bArrL;
        int iO = O();
        int i15 = this.f34211k;
        int i16 = this.f34209i;
        if (iO <= i16 - i15 && iO > 0) {
            bArrL = this.f34208h;
            this.f34211k = i15 + iO;
        } else {
            if (iO == 0) {
                return "";
            }
            if (iO < 0) {
                throw new lz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i15 = 0;
            if (iO <= i16) {
                J(iO);
                bArrL = this.f34208h;
                this.f34211k = iO;
            } else {
                bArrL = L(iO, false);
            }
        }
        return t10.c(bArrL, i15, iO);
    }
}
