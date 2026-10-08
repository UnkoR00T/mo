package o4;

import er.r;
import java.util.Arrays;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011Jg\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJU\u0010\"\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J5\u0010&\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J5\u0010,\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J=\u0010.\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b0\u00101J;\u00104\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00042$\u00103\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t02¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b6\u00107J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0003J\r\u00108\u001a\u00020\t¢\u0006\u0004\b8\u0010\u0003R\u0016\u0010:\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0015\u00109R\u0016\u0010>\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0011\u0010@\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010?¨\u0006A"}, d2 = {"Lo4/b;", "", "<init>", "()V", "", "actualSize", "currentSize", "", "currentItems", "Loq/i0;", "l", "(II[J)V", "", "stackMeta", "deltaX", "deltaY", "p", "(JII)V", "value", "t", "r", "b", "parentId", "", "focusable", "gesturable", "hasCallbacks", "parentIndexInRectList", "e", "(IIIIIIZZZI)V", "offsetFromParentX", "offsetFromParentY", "width", "height", "g", "(IIIIIIZZZ)V", "k", "(I)Z", "m", "(IIIII)Z", "n", "(IZZ)Z", "o", "(IZ)Z", "i", "(IIIII)V", "j", "(IIIIII)V", "h", "(I)V", "Lkotlin/Function4;", "block", "q", "(ILer/r;)Z", "d", "(I)J", "a", "[J", "items", "stack", "c", "I", "itemsSize", "()I", "size", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long[] items = new long[192];

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public long[] stack = new long[192];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int itemsSize;

    public static /* synthetic */ void f(b bVar, int i15, int i16, int i17, int i18, int i19, int i25, boolean z15, boolean z16, boolean z17, int i26, int i27, Object obj) {
        if ((i27 & 32) != 0) {
            i25 = -1;
        }
        if ((i27 & 64) != 0) {
            z15 = false;
        }
        if ((i27 & 128) != 0) {
            z16 = false;
        }
        if ((i27 & 256) != 0) {
            z17 = false;
        }
        if ((i27 & 512) != 0) {
            i26 = -1;
        }
        bVar.e(i15, i16, i17, i18, i19, i25, z15, z16, z17, i26);
    }

    private final void l(int actualSize, int currentSize, long[] currentItems) {
        int iMax = Math.max(actualSize * 2, currentSize + 3);
        this.items = Arrays.copyOf(currentItems, iMax);
        this.stack = Arrays.copyOf(this.stack, iMax);
    }

    private final void p(long stackMeta, int deltaX, int deltaY) {
        int i15;
        char c15;
        char c16;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        c();
        jArr2[0] = stackMeta;
        int i16 = 1;
        while (i16 > 0) {
            i16--;
            long j15 = jArr2[i16];
            int i17 = 33554431;
            int i18 = ((int) j15) & 33554431;
            char c17 = 25;
            int i19 = ((int) (j15 >> 25)) & 33554431;
            char c18 = '2';
            int i25 = ((int) (j15 >> 50)) & 1023;
            int i26 = i25 == 1023 ? this.itemsSize : (i25 * 3) + i19;
            if (i19 < 0) {
                return;
            }
            while (i19 < jArr.length - 2 && i19 < i26) {
                int i27 = i19 + 2;
                long j16 = jArr[i27];
                if ((((int) (j16 >> c17)) & i17) == i18) {
                    long j17 = jArr[i19];
                    int i28 = i19 + 1;
                    i15 = i17;
                    c15 = c17;
                    long j18 = jArr[i28];
                    c16 = c18;
                    jArr[i19] = (((long) (((int) j17) + deltaY)) & BodyPartID.bodyIdMax) | (((long) (((int) (j17 >> 32)) + deltaX)) << 32);
                    jArr[i28] = (((long) (((int) j18) + deltaY)) & BodyPartID.bodyIdMax) | (((long) (((int) (j18 >> 32)) + deltaX)) << 32);
                    jArr[i27] = (((j16 >> 63) & 1) << 60) | j16;
                    if ((((int) (j16 >> c16)) & 1023) > 0) {
                        jArr2[i16] = (c.b() & j16) | (((long) ((i19 + 3) & i15)) << c15);
                        i16++;
                    }
                } else {
                    i15 = i17;
                    c15 = c17;
                    c16 = c18;
                }
                i19 += 3;
                i17 = i15;
                c17 = c15;
                c18 = c16;
            }
        }
    }

    public final void a() {
        long[] jArr = this.items;
        int i15 = this.itemsSize;
        for (int i16 = 0; i16 < jArr.length - 2 && i16 < i15; i16 += 3) {
            int i17 = i16 + 2;
            jArr[i17] = jArr[i17] & (-1152921504606846977L);
        }
    }

    public final void b() {
        long[] jArr = this.items;
        int i15 = this.itemsSize;
        long[] jArr2 = this.stack;
        int i16 = 0;
        for (int i17 = 0; i17 < jArr.length - 2 && i16 < jArr2.length - 2 && i17 < i15; i17 += 3) {
            int i18 = i17 + 2;
            if (jArr[i18] != c.c()) {
                jArr2[i16] = jArr[i17];
                jArr2[i16 + 1] = jArr[i17 + 1];
                jArr2[i16 + 2] = jArr[i18];
                i16 += 3;
            }
        }
        this.itemsSize = i16;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final int c() {
        return this.itemsSize / 3;
    }

    public final long d(int value) {
        int i15 = value & 33554431;
        long[] jArr = this.items;
        int i16 = this.itemsSize;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            if ((((int) jArr[i17 + 2]) & 33554431) == i15) {
                return jArr[i17];
            }
        }
        return Long.MAX_VALUE;
    }

    public final void e(int value, int l15, int t15, int r15, int b15, int parentId, boolean focusable, boolean gesturable, boolean hasCallbacks, int parentIndexInRectList) {
        long[] jArr = this.items;
        int i15 = this.itemsSize;
        int i16 = i15 + 3;
        this.itemsSize = i16;
        int length = jArr.length;
        if (length <= i16) {
            l(length, i15, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i15] = (((long) l15) << 32) | (((long) t15) & BodyPartID.bodyIdMax);
        jArr2[i15 + 1] = (((long) r15) << 32) | (((long) b15) & BodyPartID.bodyIdMax);
        int i17 = parentId & 33554431;
        jArr2[i15 + 2] = ((hasCallbacks ? 1L : 0L) << 63) | ((gesturable ? 1L : 0L) << 62) | ((focusable ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i17) << 25) | ((long) (value & 33554431));
        if (parentId < 0) {
            return;
        }
        for (int i18 = parentIndexInRectList != -1 ? parentIndexInRectList : i15 - 3; i18 >= 0; i18 -= 3) {
            int i19 = i18 + 2;
            long j15 = jArr2[i19];
            if ((((int) j15) & 33554431) == i17) {
                jArr2[i19] = (j15 & c.a()) | (((long) Math.min((i15 - i18) / 3, 1023)) << 50);
                return;
            }
        }
    }

    public final void g(int value, int parentId, int offsetFromParentX, int offsetFromParentY, int width, int height, boolean focusable, boolean gesturable, boolean hasCallbacks) {
        int i15 = value & 33554431;
        long[] jArr = this.items;
        for (int i16 = this.itemsSize - 3; i16 >= 0; i16 -= 3) {
            if ((((int) jArr[i16 + 2]) & 33554431) == parentId) {
                long j15 = jArr[i16];
                int i17 = ((int) (j15 >> 32)) + offsetFromParentX;
                int i18 = ((int) j15) + offsetFromParentY;
                e(i15, i17, i18, i17 + width, i18 + height, parentId, focusable, gesturable, hasCallbacks, i16);
                return;
            }
        }
    }

    public final void h(int value) {
        int i15 = value & 33554431;
        long[] jArr = this.items;
        int i16 = this.itemsSize;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j15 = jArr[i18];
            if ((((int) j15) & 33554431) == i15) {
                jArr[i18] = (((j15 >> 63) & 1) << 60) | j15;
                return;
            }
        }
    }

    public final void i(int value, int l15, int t15, int r15, int b15) {
        int i15 = value & 33554431;
        long[] jArr = this.items;
        int i16 = this.itemsSize;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j15 = jArr[i18];
            if ((((int) j15) & 33554431) == i15) {
                long j16 = jArr[i17];
                jArr[i17] = (((long) t15) & BodyPartID.bodyIdMax) | (((long) l15) << 32);
                int i19 = i17;
                jArr[i17 + 1] = (((long) b15) & BodyPartID.bodyIdMax) | (((long) r15) << 32);
                jArr[i18] = (((j15 >> 63) & 1) << 60) | j15;
                int i25 = l15 - ((int) (j16 >> 32));
                int i26 = t15 - ((int) j16);
                if ((i25 != 0) || (i26 != 0)) {
                    p((c.b() & j15) | (((long) ((i19 + 3) & 33554431)) << 25), i25, i26);
                    return;
                }
                return;
            }
        }
    }

    public final void j(int value, int parentId, int offsetFromParentX, int offsetFromParentY, int width, int height) {
        int i15 = 33554431;
        int i16 = value & 33554431;
        int i17 = this.itemsSize;
        int i18 = 0;
        for (long[] jArr = this.items; i18 < jArr.length - 2 && i18 < i17; jArr = jArr) {
            if ((((int) jArr[i18 + 2]) & i15) == parentId) {
                long j15 = jArr[i18];
                int i19 = ((int) (j15 >> 32)) + offsetFromParentX;
                int i25 = ((int) j15) + offsetFromParentY;
                int i26 = i19 + width;
                int i27 = i25 + height;
                while (true) {
                    i18 += 3;
                    if (i18 >= jArr.length - 2 || i18 >= i17) {
                        break;
                    }
                    int i28 = i18 + 2;
                    long j16 = jArr[i28];
                    if ((((int) j16) & i15) == i16) {
                        int i29 = i15;
                        long j17 = jArr[i18];
                        int i35 = i19 - ((int) (j17 >> 32));
                        int i36 = i25 - ((int) j17);
                        long[] jArr2 = jArr;
                        jArr2[i18] = (((long) i25) & BodyPartID.bodyIdMax) | (((long) i19) << 32);
                        jArr2[i18 + 1] = (((long) i26) << 32) | (((long) i27) & BodyPartID.bodyIdMax);
                        jArr2[i28] = (((j16 >> 63) & 1) << 60) | j16;
                        if (i35 == 0 && i36 == 0) {
                            return;
                        }
                        p((c.b() & j16) | (((long) ((i18 + 3) & i29)) << 25), i35, i36);
                        return;
                    }
                }
            }
            i18 += 3;
            i15 = i15;
        }
    }

    public final boolean k(int value) {
        int i15 = value & 33554431;
        long[] jArr = this.items;
        int i16 = this.itemsSize;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            if ((((int) jArr[i18]) & 33554431) == i15) {
                jArr[i17] = -1;
                jArr[i17 + 1] = -1;
                jArr[i18] = c.c();
                return true;
            }
        }
        return false;
    }

    public final boolean m(int value, int l15, int t15, int r15, int b15) {
        int i15 = value & 33554431;
        long[] jArr = this.items;
        int i16 = this.itemsSize;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j15 = jArr[i18];
            if ((((int) j15) & 33554431) == i15) {
                jArr[i17] = (((long) l15) << 32) | (((long) t15) & BodyPartID.bodyIdMax);
                jArr[i17 + 1] = (((long) r15) << 32) | (((long) b15) & BodyPartID.bodyIdMax);
                jArr[i18] = (((j15 >> 63) & 1) << 60) | j15;
                return true;
            }
        }
        return false;
    }

    public final boolean n(int value, boolean focusable, boolean gesturable) {
        int i15 = value & 33554431;
        long[] jArr = this.items;
        int i16 = this.itemsSize;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j15 = jArr[i18];
            if ((((int) j15) & 33554431) == i15) {
                jArr[i18] = ((focusable ? 1L : 0L) * 2305843009213693952L) | ((-6917529027641081857L) & j15) | ((gesturable ? 1L : 0L) * 4611686018427387904L);
                return true;
            }
        }
        return false;
    }

    public final boolean o(int value, boolean hasCallbacks) {
        int i15 = value & 33554431;
        long[] jArr = this.items;
        int i16 = this.itemsSize;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j15 = jArr[i18];
            if ((((int) j15) & 33554431) == i15) {
                jArr[i18] = ((hasCallbacks ? 1L : 0L) * Long.MIN_VALUE) | (8070450532247928831L & j15) | ((hasCallbacks ? 1L : 0L) * 1152921504606846976L);
                return true;
            }
        }
        return false;
    }

    public final boolean q(int value, r<? super Integer, ? super Integer, ? super Integer, ? super Integer, i0> block) {
        int i15 = value & 33554431;
        long[] jArr = this.items;
        int i16 = this.itemsSize;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            if ((((int) jArr[i17 + 2]) & 33554431) == i15) {
                long j15 = jArr[i17];
                long j16 = jArr[i17 + 1];
                block.g(Integer.valueOf((int) (j15 >> 32)), Integer.valueOf((int) j15), Integer.valueOf((int) (j16 >> 32)), Integer.valueOf((int) j16));
                return true;
            }
        }
        return false;
    }
}
