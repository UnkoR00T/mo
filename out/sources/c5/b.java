package c5;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010!\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u001a\u0010&\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0019\u001a\u0004\b$\u0010 R\u001a\u0010)\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0019\u001a\u0004\b'\u0010 R\u001a\u0010,\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0019\u001a\u0004\b*\u0010 \u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006-"}, d2 = {"Lc5/b;", "", "", "value", "b", "(J)J", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "c", "(JIIII)J", "", "q", "(J)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getValue$annotations", "()V", "n", "(J)I", "l", "m", "k", "h", "(J)Z", "hasBoundedWidth", "g", "hasBoundedHeight", "j", "getHasFixedWidth$annotations", "hasFixedWidth", "i", "getHasFixedHeight$annotations", "hasFixedHeight", "p", "isZero$annotations", "isZero", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long value;

    /* JADX INFO: renamed from: c5.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lc5/b$a;", "", "<init>", "()V", "", "width", "height", "Lc5/b;", "c", "(II)J", "e", "(I)J", "d", "minWidth", "maxWidth", "minHeight", "maxHeight", "b", "(IIII)J", "a", "Infinity", "I", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final long a(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int i15 = 262142;
            int iMin = Math.min(minHeight, 262142);
            int iMin2 = maxHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxHeight, 262142);
            int i16 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i16 >= 8191) {
                if (i16 < 32767) {
                    i15 = 65534;
                } else if (i16 < 65535) {
                    i15 = 32766;
                } else {
                    if (i16 >= 262143) {
                        c.l(i16);
                        throw new oq.g();
                    }
                    i15 = 8190;
                }
            }
            return c.a(Math.min(i15, minWidth), maxWidth != Integer.MAX_VALUE ? Math.min(i15, maxWidth) : Integer.MAX_VALUE, iMin, iMin2);
        }

        public final long b(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int i15 = 262142;
            int iMin = Math.min(minWidth, 262142);
            int iMin2 = maxWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxWidth, 262142);
            int i16 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i16 >= 8191) {
                if (i16 < 32767) {
                    i15 = 65534;
                } else if (i16 < 65535) {
                    i15 = 32766;
                } else {
                    if (i16 >= 262143) {
                        c.l(i16);
                        throw new oq.g();
                    }
                    i15 = 8190;
                }
            }
            return c.a(iMin, iMin2, Math.min(i15, minHeight), maxHeight != Integer.MAX_VALUE ? Math.min(i15, maxHeight) : Integer.MAX_VALUE);
        }

        public final long c(int width, int height) {
            if (!((height >= 0) & (width >= 0))) {
                m.a("width and height must be >= 0");
            }
            return c.h(width, width, height, height);
        }

        public final long d(int height) {
            if (!(height >= 0)) {
                m.a("height must be >= 0");
            }
            return c.h(0, Integer.MAX_VALUE, height, height);
        }

        public final long e(int width) {
            if (!(width >= 0)) {
                m.a("width must be >= 0");
            }
            return c.h(width, width, 0, Integer.MAX_VALUE);
        }

        private Companion() {
        }
    }

    private /* synthetic */ b(long j15) {
        this.value = j15;
    }

    public static final /* synthetic */ b a(long j15) {
        return new b(j15);
    }

    public static long b(long j15) {
        return j15;
    }

    public static final long c(long j15, int i15, int i16, int i17, int i18) {
        if (!(i16 >= i15 && i18 >= i17 && i15 >= 0 && i17 >= 0)) {
            m.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return c.h(i15, i16, i17, i18);
    }

    public static /* synthetic */ long d(long j15, int i15, int i16, int i17, int i18, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            i15 = n(j15);
        }
        int i25 = i15;
        if ((i19 & 2) != 0) {
            i16 = l(j15);
        }
        int i26 = i16;
        if ((i19 & 4) != 0) {
            i17 = m(j15);
        }
        int i27 = i17;
        if ((i19 & 8) != 0) {
            i18 = k(j15);
        }
        return c(j15, i25, i26, i27, i18);
    }

    public static boolean e(long j15, Object obj) {
        return (obj instanceof b) && j15 == ((b) obj).getValue();
    }

    public static final boolean f(long j15, long j16) {
        return j15 == j16;
    }

    public static final boolean g(long j15) {
        int i15 = (int) (3 & j15);
        int i16 = ((i15 & 1) << 1) + (((i15 & 2) >> 1) * 3);
        return (((int) (j15 >> (i16 + 46))) & ((1 << (18 - i16)) - 1)) != 0;
    }

    public static final boolean h(long j15) {
        int i15 = (int) (3 & j15);
        return (((int) (j15 >> 33)) & ((1 << ((((i15 & 1) << 1) + (((i15 & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static final boolean i(long j15) {
        int i15 = (int) (3 & j15);
        int i16 = ((i15 & 1) << 1) + (((i15 & 2) >> 1) * 3);
        int i17 = (1 << (18 - i16)) - 1;
        int i18 = ((int) (j15 >> (i16 + 15))) & i17;
        int i19 = ((int) (j15 >> (i16 + 46))) & i17;
        return i18 == (i19 == 0 ? Integer.MAX_VALUE : i19 - 1);
    }

    public static final boolean j(long j15) {
        int i15 = (int) (3 & j15);
        int i16 = (1 << ((((i15 & 1) << 1) + (((i15 & 2) >> 1) * 3)) + 13)) - 1;
        int i17 = ((int) (j15 >> 2)) & i16;
        int i18 = ((int) (j15 >> 33)) & i16;
        return i17 == (i18 == 0 ? Integer.MAX_VALUE : i18 - 1);
    }

    public static final int k(long j15) {
        int i15 = (int) (3 & j15);
        int i16 = ((i15 & 1) << 1) + (((i15 & 2) >> 1) * 3);
        int i17 = ((int) (j15 >> (i16 + 46))) & ((1 << (18 - i16)) - 1);
        if (i17 == 0) {
            return Integer.MAX_VALUE;
        }
        return i17 - 1;
    }

    public static final int l(long j15) {
        int i15 = (int) (3 & j15);
        int i16 = ((int) (j15 >> 33)) & ((1 << ((((i15 & 1) << 1) + (((i15 & 2) >> 1) * 3)) + 13)) - 1);
        if (i16 == 0) {
            return Integer.MAX_VALUE;
        }
        return i16 - 1;
    }

    public static final int m(long j15) {
        int i15 = (int) (3 & j15);
        int i16 = ((i15 & 1) << 1) + (((i15 & 2) >> 1) * 3);
        return ((int) (j15 >> (i16 + 15))) & ((1 << (18 - i16)) - 1);
    }

    public static final int n(long j15) {
        int i15 = (int) (3 & j15);
        return ((int) (j15 >> 2)) & ((1 << ((((i15 & 1) << 1) + (((i15 & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static int o(long j15) {
        return Long.hashCode(j15);
    }

    public static final boolean p(long j15) {
        int i15 = (int) (3 & j15);
        int i16 = ((i15 & 1) << 1) + (((i15 & 2) >> 1) * 3);
        return ((((int) (j15 >> 33)) & ((1 << (i16 + 13)) - 1)) - 1 == 0) | ((((int) (j15 >> (i16 + 46))) & ((1 << (18 - i16)) - 1)) - 1 == 0);
    }

    public static String q(long j15) {
        int iL = l(j15);
        String strValueOf = iL == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iL);
        int iK = k(j15);
        return "Constraints(minWidth = " + n(j15) + ", maxWidth = " + strValueOf + ", minHeight = " + m(j15) + ", maxHeight = " + (iK != Integer.MAX_VALUE ? String.valueOf(iK) : "Infinity") + ')';
    }

    public boolean equals(Object other) {
        return e(this.value, other);
    }

    public int hashCode() {
        return o(this.value);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public String toString() {
        return q(this.value);
    }
}
