package androidx.compose.ui.graphics;

import n3.o1;
import n3.w1;
import oq.d0;
import oq.k0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087@\u0018\u0000 82\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\rR\u001a\u0010\u001a\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\rR\u001a\u0010\u001b\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\rR\u001a\u0010\u0018\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010\r\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006:"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Loq/d0;", "value", "constructor-impl", "(J)J", "Lo3/c;", "colorSpace", "convert-vNxB06k", "(JLo3/c;)J", "convert", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "component3-impl", "component3", "component4-impl", "component4", "component5-impl", "(J)Lo3/c;", "component5", "alpha", "red", "green", "blue", "copy-wmQWz5c", "(JFFFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getValue-s-VKNKU", "()J", "getColorSpace-impl", "getColorSpace$annotations", "()V", "getRed-impl", "getRed$annotations", "getGreen-impl", "getGreen$annotations", "getBlue-impl", "getBlue$annotations", "getAlpha-impl", "getAlpha$annotations", "Companion", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Color {
    private final long value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Black = o1.d(4278190080L);
    private static final long DarkGray = o1.d(4282664004L);
    private static final long Gray = o1.d(4287137928L);
    private static final long LightGray = o1.d(4291611852L);
    private static final long White = o1.d(BodyPartID.bodyIdMax);
    private static final long Red = o1.d(4294901760L);
    private static final long Green = o1.d(4278255360L);
    private static final long Blue = o1.d(4278190335L);
    private static final long Yellow = o1.d(4294967040L);
    private static final long Cyan = o1.d(4278255615L);
    private static final long Magenta = o1.d(4294902015L);
    private static final long Transparent = o1.b(0);
    private static final long Unspecified = o1.a(0.0f, 0.0f, 0.0f, 0.0f, o3.k.f141750a.I());

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.Color$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR \u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\b¨\u0006%"}, d2 = {"Landroidx/compose/ui/graphics/Color$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "Black", "J", "a", "()J", "getBlack-0d7_KjU$annotations", "LightGray", "e", "getLightGray-0d7_KjU$annotations", "White", "i", "getWhite-0d7_KjU$annotations", "Red", "f", "getRed-0d7_KjU$annotations", "Green", "d", "getGreen-0d7_KjU$annotations", "Blue", "b", "getBlue-0d7_KjU$annotations", "Yellow", "j", "getYellow-0d7_KjU$annotations", "Cyan", "c", "getCyan-0d7_KjU$annotations", "Transparent", "g", "getTransparent-0d7_KjU$annotations", "Unspecified", "h", "getUnspecified-0d7_KjU$annotations", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final long a() {
            return Color.Black;
        }

        public final long b() {
            return Color.Blue;
        }

        public final long c() {
            return Color.Cyan;
        }

        public final long d() {
            return Color.Green;
        }

        public final long e() {
            return Color.LightGray;
        }

        public final long f() {
            return Color.Red;
        }

        public final long g() {
            return Color.Transparent;
        }

        public final long h() {
            return Color.Unspecified;
        }

        public final long i() {
            return Color.White;
        }

        public final long j() {
            return Color.Yellow;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Color(long j15) {
        this.value = j15;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m0boximpl(long j15) {
        return new Color(j15);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m1component1impl(long j15) {
        return m16getRedimpl(j15);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m2component2impl(long j15) {
        return m15getGreenimpl(j15);
    }

    /* JADX INFO: renamed from: component3-impl, reason: not valid java name */
    public static final float m3component3impl(long j15) {
        return m13getBlueimpl(j15);
    }

    /* JADX INFO: renamed from: component4-impl, reason: not valid java name */
    public static final float m4component4impl(long j15) {
        return m12getAlphaimpl(j15);
    }

    /* JADX INFO: renamed from: component5-impl, reason: not valid java name */
    public static final o3.c m5component5impl(long j15) {
        return m14getColorSpaceimpl(j15);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m6constructorimpl(long j15) {
        return j15;
    }

    /* JADX INFO: renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m7convertvNxB06k(long j15, o3.c cVar) {
        return o3.d.i(m14getColorSpaceimpl(j15), cVar, 0, 2, null).a(j15);
    }

    /* JADX INFO: renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m8copywmQWz5c(long j15, float f15, float f16, float f17, float f18) {
        return o1.a(f16, f17, f18, f15, m14getColorSpaceimpl(j15));
    }

    /* JADX INFO: renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m9copywmQWz5c$default(long j15, float f15, float f16, float f17, float f18, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = m12getAlphaimpl(j15);
        }
        float f19 = f15;
        if ((i15 & 2) != 0) {
            f16 = m16getRedimpl(j15);
        }
        float f25 = f16;
        if ((i15 & 4) != 0) {
            f17 = m15getGreenimpl(j15);
        }
        float f26 = f17;
        if ((i15 & 8) != 0) {
            f18 = m13getBlueimpl(j15);
        }
        return m8copywmQWz5c(j15, f19, f25, f26, f18);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m10equalsimpl(long j15, Object obj) {
        return (obj instanceof Color) && j15 == ((Color) obj).m20unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11equalsimpl0(long j15, long j16) {
        return d0.j(j15, j16);
    }

    public static /* synthetic */ void getAlpha$annotations() {
    }

    /* JADX INFO: renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m12getAlphaimpl(long j15) {
        float fC;
        float f15;
        if (d0.e(63 & j15) == 0) {
            fC = (float) k0.c(d0.e(d0.e(j15 >>> 56) & 255));
            f15 = 255.0f;
        } else {
            fC = (float) k0.c(d0.e(d0.e(j15 >>> 6) & 1023));
            f15 = 1023.0f;
        }
        return fC / f15;
    }

    public static /* synthetic */ void getBlue$annotations() {
    }

    /* JADX INFO: renamed from: getBlue-impl, reason: not valid java name */
    public static final float m13getBlueimpl(long j15) {
        int i15;
        int i16;
        int i17;
        if (d0.e(63 & j15) == 0) {
            return ((float) k0.c(d0.e(d0.e(j15 >>> 32) & 255))) / 255.0f;
        }
        short sE = (short) d0.e(d0.e(j15 >>> 16) & 65535);
        int i18 = Short.MIN_VALUE & sE;
        int i19 = ((65535 & sE) >>> 10) & 31;
        int i25 = sE & 1023;
        if (i19 != 0) {
            int i26 = i25 << 13;
            if (i19 == 31) {
                i15 = GF2Field.MASK;
                if (i26 != 0) {
                    i26 |= 4194304;
                }
            } else {
                i15 = i19 + 112;
            }
            int i27 = i15;
            i16 = i26;
            i17 = i27;
        } else {
            if (i25 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i25 + 1056964608) - w1.f131098a;
                return i18 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i17 = 0;
            i16 = 0;
        }
        return Float.intBitsToFloat((i17 << 23) | (i18 << 16) | i16);
    }

    public static /* synthetic */ void getColorSpace$annotations() {
    }

    /* JADX INFO: renamed from: getColorSpace-impl, reason: not valid java name */
    public static final o3.c m14getColorSpaceimpl(long j15) {
        o3.k kVar = o3.k.f141750a;
        return kVar.v()[(int) d0.e(j15 & 63)];
    }

    public static /* synthetic */ void getGreen$annotations() {
    }

    /* JADX INFO: renamed from: getGreen-impl, reason: not valid java name */
    public static final float m15getGreenimpl(long j15) {
        int i15;
        int i16;
        int i17;
        if (d0.e(63 & j15) == 0) {
            return ((float) k0.c(d0.e(d0.e(j15 >>> 40) & 255))) / 255.0f;
        }
        short sE = (short) d0.e(d0.e(j15 >>> 32) & 65535);
        int i18 = Short.MIN_VALUE & sE;
        int i19 = ((65535 & sE) >>> 10) & 31;
        int i25 = sE & 1023;
        if (i19 != 0) {
            int i26 = i25 << 13;
            if (i19 == 31) {
                i15 = GF2Field.MASK;
                if (i26 != 0) {
                    i26 |= 4194304;
                }
            } else {
                i15 = i19 + 112;
            }
            int i27 = i15;
            i16 = i26;
            i17 = i27;
        } else {
            if (i25 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i25 + 1056964608) - w1.f131098a;
                return i18 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i17 = 0;
            i16 = 0;
        }
        return Float.intBitsToFloat((i17 << 23) | (i18 << 16) | i16);
    }

    public static /* synthetic */ void getRed$annotations() {
    }

    /* JADX INFO: renamed from: getRed-impl, reason: not valid java name */
    public static final float m16getRedimpl(long j15) {
        int i15;
        int i16;
        int i17;
        if (d0.e(63 & j15) == 0) {
            return ((float) k0.c(d0.e(d0.e(j15 >>> 48) & 255))) / 255.0f;
        }
        short sE = (short) d0.e(d0.e(j15 >>> 48) & 65535);
        int i18 = Short.MIN_VALUE & sE;
        int i19 = ((65535 & sE) >>> 10) & 31;
        int i25 = sE & 1023;
        if (i19 != 0) {
            int i26 = i25 << 13;
            if (i19 == 31) {
                i15 = GF2Field.MASK;
                if (i26 != 0) {
                    i26 |= 4194304;
                }
            } else {
                i15 = i19 + 112;
            }
            int i27 = i15;
            i16 = i26;
            i17 = i27;
        } else {
            if (i25 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i25 + 1056964608) - w1.f131098a;
                return i18 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i17 = 0;
            i16 = 0;
        }
        return Float.intBitsToFloat((i17 << 23) | (i18 << 16) | i16);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m17hashCodeimpl(long j15) {
        return d0.k(j15);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m18toStringimpl(long j15) {
        return "Color(" + m16getRedimpl(j15) + ", " + m15getGreenimpl(j15) + ", " + m13getBlueimpl(j15) + ", " + m12getAlphaimpl(j15) + ", " + m14getColorSpaceimpl(j15).getName() + ')';
    }

    public boolean equals(Object other) {
        return m10equalsimpl(this.value, other);
    }

    /* JADX INFO: renamed from: getValue-s-VKNKU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m17hashCodeimpl(this.value);
    }

    public String toString() {
        return m18toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m20unboximpl() {
        return this.value;
    }
}
