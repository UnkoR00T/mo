package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
abstract class ux extends xx {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f33984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33989l;

    /* synthetic */ ux(byte[] bArr, int i15, int i16, boolean z15, byte[] bArr2) {
        super(null);
        this.f33989l = Integer.MAX_VALUE;
        this.f33984g = bArr;
        this.f33985h = i16;
        this.f33987j = 0;
    }

    private final void K() {
        int i15 = this.f33985h + this.f33986i;
        this.f33985h = i15;
        int i16 = this.f33989l;
        if (i15 <= i16) {
            this.f33986i = 0;
            return;
        }
        int i17 = i15 - i16;
        this.f33986i = i17;
        this.f33985h = i15 - i17;
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final tx A() throws lz {
        int iL = L();
        if (iL > 0) {
            int i15 = this.f33985h;
            int i16 = this.f33987j;
            if (iL <= i15 - i16) {
                tx txVarO = tx.o(this.f33984g, i16, iL, false);
                this.f33987j += iL;
                return txVarO;
            }
        }
        if (iL == 0) {
            return tx.f33820b;
        }
        if (iL > 0) {
            int i17 = this.f33985h;
            int i18 = this.f33987j;
            if (iL <= i17 - i18) {
                int i19 = iL + i18;
                this.f33987j = i19;
                return tx.s(Arrays.copyOfRange(this.f33984g, i18, i19), false);
            }
        }
        if (iL <= 0) {
            throw new lz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int B() {
        return L();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int C() {
        return M();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int D() {
        return Q();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final long E() {
        return H();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int F() {
        return xx.l(L());
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final long G() {
        return xx.m(O());
    }

    public final long H() throws lz {
        int i15 = this.f33987j;
        if (this.f33985h - i15 < 8) {
            throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f33984g;
        this.f33987j = i15 + 8;
        long j15 = bArr[i15];
        long j16 = (((long) bArr[i15 + 1]) & 255) << 8;
        long j17 = bArr[i15 + 2];
        long j18 = bArr[i15 + 3];
        return ((((long) bArr[i15 + 6]) & 255) << 48) | (j15 & 255) | j16 | ((j17 & 255) << 16) | ((j18 & 255) << 24) | ((bArr[i15 + 4] & 255) << 32) | ((bArr[i15 + 5] & 255) << 40) | ((((long) bArr[i15 + 7]) & 255) << 56);
    }

    public final byte I() throws lz {
        int i15 = this.f33987j;
        if (i15 == this.f33985h) {
            throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f33984g;
        this.f33987j = i15 + 1;
        return bArr[i15];
    }

    public final void J(int i15) throws lz {
        if (i15 >= 0) {
            int i16 = this.f33985h;
            int i17 = this.f33987j;
            if (i15 <= i16 - i17) {
                this.f33987j = i17 + i15;
                return;
            }
        }
        if (i15 >= 0) {
            throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new lz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    protected abstract int L();

    protected abstract int M();

    protected final int N() {
        int i15;
        int i16 = this.f33987j;
        int i17 = this.f33985h;
        if (i17 != i16) {
            byte[] bArr = this.f33984g;
            int i18 = i16 + 1;
            byte b15 = bArr[i16];
            if (b15 >= 0) {
                this.f33987j = i18;
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
                this.f33987j = i19;
                return i15;
            }
        }
        return (int) P();
    }

    public final long O() {
        long j15;
        long j16;
        long j17;
        int i15 = this.f33987j;
        int i16 = this.f33985h;
        if (i16 != i15) {
            byte[] bArr = this.f33984g;
            int i17 = i15 + 1;
            byte b15 = bArr[i15];
            if (b15 >= 0) {
                this.f33987j = i17;
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
                this.f33987j = i18;
                return j15;
            }
        }
        return P();
    }

    final long P() throws lz {
        long j15 = 0;
        for (int i15 = 0; i15 < 64; i15 += 7) {
            byte bI = I();
            j15 |= ((long) (bI & 127)) << i15;
            if ((bI & 128) == 0) {
                return j15;
            }
        }
        throw new lz("CodedInputStream encountered a malformed varint.");
    }

    public final int Q() throws lz {
        int i15 = this.f33987j;
        if (this.f33985h - i15 < 4) {
            throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f33984g;
        this.f33987j = i15 + 4;
        int i16 = bArr[i15] & 255;
        int i17 = bArr[i15 + 1] & 255;
        int i18 = bArr[i15 + 2] & 255;
        return ((bArr[i15 + 3] & 255) << 24) | (i17 << 8) | i16 | (i18 << 16);
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int a(int i15) {
        if (i15 < 0) {
            throw new lz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i16 = i15 + this.f33987j;
        if (i16 < 0) {
            throw new lz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i17 = this.f33989l;
        if (i16 > i17) {
            throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f33989l = i16;
        K();
        return i17;
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final void b(int i15) {
        this.f33989l = i15;
        K();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final boolean c() {
        return this.f33987j == this.f33985h;
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int d() {
        return this.f33987j;
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int n() throws lz {
        if (c()) {
            this.f33988k = 0;
            return 0;
        }
        int iL = L();
        this.f33988k = iL;
        if ((iL >>> 3) != 0) {
            return iL;
        }
        throw new lz("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final void o(int i15) throws lz {
        if (this.f33988k != i15) {
            throw new lz("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final boolean p(int i15) throws lz {
        int i16 = i15 & 7;
        int i17 = 0;
        if (i16 == 0) {
            if (this.f33985h - this.f33987j < 10) {
                while (i17 < 10) {
                    if (I() < 0) {
                        i17++;
                    }
                }
                throw new lz("CodedInputStream encountered a malformed varint.");
            }
            while (i17 < 10) {
                byte[] bArr = this.f33984g;
                int i18 = this.f33987j;
                this.f33987j = i18 + 1;
                if (bArr[i18] < 0) {
                    i17++;
                }
            }
            throw new lz("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i16 == 1) {
            J(8);
            return true;
        }
        if (i16 == 2) {
            J(L());
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
        J(4);
        return true;
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final double q() {
        return Double.longBitsToDouble(H());
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final float r() {
        return Float.intBitsToFloat(Q());
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final long s() {
        return O();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final long t() {
        return O();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int u() {
        return M();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final long v() {
        return H();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final int w() {
        return Q();
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final boolean x() {
        return O() != 0;
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final String y() throws lz {
        int iL = L();
        if (iL > 0) {
            int i15 = this.f33985h;
            int i16 = this.f33987j;
            if (iL <= i15 - i16) {
                String str = new String(this.f33984g, i16, iL, StandardCharsets.UTF_8);
                this.f33987j += iL;
                return str;
            }
        }
        if (iL == 0) {
            return "";
        }
        if (iL < 0) {
            throw new lz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.libraries.places.internal.xx
    public final String z() throws lz {
        int iL = L();
        if (iL > 0) {
            int i15 = this.f33985h;
            int i16 = this.f33987j;
            if (iL <= i15 - i16) {
                String strC = t10.c(this.f33984g, i16, iL);
                this.f33987j += iL;
                return strC;
            }
        }
        if (iL == 0) {
            return "";
        }
        if (iL <= 0) {
            throw new lz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
