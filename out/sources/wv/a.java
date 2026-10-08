package wv;

import java.io.EOFException;
import p071kotlin.Metadata;
import vv.g0;
import vv.o0;
import vv.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u001d\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%¨\u0006'"}, d2 = {"Lvv/g0;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "f", "(Lvv/g0;I[BII)Z", "Lvv/e;", "", "newline", "", "g", "(Lvv/e;J)Ljava/lang/String;", "Lvv/z;", "options", "selectTruncated", "h", "(Lvv/e;Lvv/z;Z)I", "v", "d", "(J)I", "Lvv/h;", "fromIndex", "toIndex", "byteCount", "b", "(Lvv/e;Lvv/h;JJII)J", "a", "[B", "e", "()[B", "HEX_DIGIT_BYTES", "", "[J", "DigitCountToLargestValue", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f215226a = o0.a("0123456789abcdef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long[] f215227b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final long b(vv.e eVar, vv.h hVar, long j15, long j16, int i15, int i16) {
        g0 g0Var;
        int i17;
        long j17 = j15;
        long size = j16;
        long j18 = i16;
        vv.b.b(hVar.Q(), i15, j18);
        if (i16 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long size2 = 0;
        if (j17 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j17).toString());
        }
        if (j17 > size) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j17 + " > " + size).toString());
        }
        if (size > eVar.getSize()) {
            size = eVar.getSize();
        }
        long j19 = -1;
        if (j17 == size || (g0Var = eVar.head) == null) {
            return -1L;
        }
        if (eVar.getSize() - j17 >= j17) {
            while (true) {
                long j25 = ((long) (g0Var.limit - g0Var.pos)) + size2;
                if (j25 > j17) {
                    break;
                }
                g0Var = g0Var.next;
                size2 = j25;
            }
            byte[] bArrA = hVar.A();
            byte b15 = bArrA[i15];
            long jMin = Math.min(size, (eVar.getSize() - j18) + 1);
            while (size2 < jMin) {
                byte[] bArr = g0Var.data;
                int iMin = (int) Math.min(g0Var.limit, (((long) g0Var.pos) + jMin) - size2);
                i17 = (int) ((((long) g0Var.pos) + j17) - size2);
                while (i17 < iMin) {
                    if (bArr[i17] != b15 || !f(g0Var, i17 + 1, bArrA, i15 + 1, i16)) {
                        i17++;
                    }
                }
                size2 += (long) (g0Var.limit - g0Var.pos);
                g0Var = g0Var.next;
                j17 = size2;
            }
            return -1L;
        }
        size2 = eVar.getSize();
        while (size2 > j17) {
            g0Var = g0Var.prev;
            size2 -= (long) (g0Var.limit - g0Var.pos);
            j19 = j19;
        }
        long j26 = j19;
        byte[] bArrA2 = hVar.A();
        byte b16 = bArrA2[i15];
        long jMin2 = Math.min(size, (eVar.getSize() - j18) + 1);
        while (size2 < jMin2) {
            byte[] bArr2 = g0Var.data;
            int iMin2 = (int) Math.min(g0Var.limit, (((long) g0Var.pos) + jMin2) - size2);
            i17 = (int) ((((long) g0Var.pos) + j17) - size2);
            while (i17 < iMin2) {
                if (bArr2[i17] != b16 || !f(g0Var, i17 + 1, bArrA2, i15 + 1, i16)) {
                    i17++;
                }
            }
            size2 += (long) (g0Var.limit - g0Var.pos);
            g0Var = g0Var.next;
            j17 = size2;
        }
        return j26;
        return ((long) (i17 - g0Var.pos)) + size2;
    }

    public static /* synthetic */ long c(vv.e eVar, vv.h hVar, long j15, long j16, int i15, int i16, int i17, Object obj) {
        if ((i17 & 4) != 0) {
            j16 = Long.MAX_VALUE;
        }
        return b(eVar, hVar, j15, j16, (i17 & 8) != 0 ? 0 : i15, (i17 & 16) != 0 ? hVar.Q() : i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(long j15) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j15)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j15 > f215227b[iNumberOfLeadingZeros] ? 1 : 0);
    }

    public static final byte[] e() {
        return f215226a;
    }

    public static final boolean f(g0 g0Var, int i15, byte[] bArr, int i16, int i17) {
        int i18 = g0Var.limit;
        byte[] bArr2 = g0Var.data;
        while (i16 < i17) {
            if (i15 == i18) {
                g0Var = g0Var.next;
                byte[] bArr3 = g0Var.data;
                bArr2 = bArr3;
                i15 = g0Var.pos;
                i18 = g0Var.limit;
            }
            if (bArr2[i15] != bArr[i16]) {
                return false;
            }
            i15++;
            i16++;
        }
        return true;
    }

    public static final String g(vv.e eVar, long j15) throws EOFException {
        if (j15 > 0) {
            long j16 = j15 - 1;
            if (eVar.I(j16) == 13) {
                String strN2 = eVar.n2(j16);
                eVar.skip(2L);
                return strN2;
            }
        }
        String strN3 = eVar.n2(j15);
        eVar.skip(1L);
        return strN3;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0090 A[LOOP:0: B:8:0x001a->B:46:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x008f A[SYNTHETIC] */
    public static final int h(vv.e eVar, z zVar, boolean z15) {
        int i15;
        int i16;
        g0 g0Var;
        int i17;
        int i18;
        g0 g0Var2 = eVar.head;
        if (g0Var2 == null) {
            return z15 ? -2 : -1;
        }
        byte[] bArr = g0Var2.data;
        int i19 = g0Var2.pos;
        int i25 = g0Var2.limit;
        int[] iArrN = zVar.getTrie();
        g0 g0Var3 = g0Var2;
        int i26 = -1;
        int i27 = 0;
        loop0: while (true) {
            int i28 = i27 + 1;
            int i29 = iArrN[i27];
            int i35 = i27 + 2;
            int i36 = iArrN[i28];
            if (i36 != -1) {
                i26 = i36;
            }
            if (g0Var3 == null) {
                break;
            }
            if (i29 >= 0) {
                i15 = i19 + 1;
                int i37 = bArr[i19] & 255;
                int i38 = i35 + i29;
                while (i35 != i38) {
                    if (i37 == iArrN[i35]) {
                        i16 = iArrN[i35 + i29];
                        if (i15 == i25) {
                            g0Var3 = g0Var3.next;
                            i15 = g0Var3.pos;
                            bArr = g0Var3.data;
                            i25 = g0Var3.limit;
                            if (g0Var3 == g0Var2) {
                                g0Var3 = null;
                            }
                        }
                        if (i16 >= 0) {
                            return i16;
                        }
                        i27 = -i16;
                        i19 = i15;
                    } else {
                        i35++;
                    }
                }
                return i26;
            }
            int i39 = i35 + (i29 * (-1));
            while (true) {
                int i45 = i19 + 1;
                int i46 = i35 + 1;
                if ((bArr[i19] & 255) == iArrN[i35]) {
                    boolean z16 = i46 == i39;
                    if (i45 == i25) {
                        g0 g0Var4 = g0Var3.next;
                        i18 = g0Var4.pos;
                        byte[] bArr2 = g0Var4.data;
                        i17 = g0Var4.limit;
                        if (g0Var4 != g0Var2) {
                            g0Var = g0Var4;
                            bArr = bArr2;
                        } else {
                            if (!z16) {
                                break loop0;
                            }
                            bArr = bArr2;
                            g0Var = null;
                        }
                    } else {
                        g0Var = g0Var3;
                        i17 = i25;
                        i18 = i45;
                    }
                    if (z16) {
                        i16 = iArrN[i46];
                        i15 = i18;
                        i25 = i17;
                        g0Var3 = g0Var;
                        break;
                    }
                    i19 = i18;
                    i25 = i17;
                    g0Var3 = g0Var;
                    i35 = i46;
                }
                return i26;
            }
            if (i16 >= 0) {
                return i16;
            }
            i27 = -i16;
            i19 = i15;
        }
        if (z15) {
            return -2;
        }
        return i26;
    }

    public static /* synthetic */ int i(vv.e eVar, z zVar, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return h(eVar, zVar, z15);
    }
}
