package n3;

import java.util.Arrays;
import m3.MutableRect;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u00015B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u000f\u0010\u001aJ+\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010 \u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b \u0010\u001fJ{\u0010,\u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020\u00172\b\b\u0002\u0010%\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u00172\b\b\u0002\u0010'\u001a\u00020\u00172\b\b\u0002\u0010(\u001a\u00020\u00172\b\b\u0002\u0010)\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020\u0017¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u00069"}, d2 = {"Ln3/g2;", "", "", "values", "b", "([F)[F", "Lm3/e;", "point", "g", "([FJ)J", "Lm3/c;", "rect", "Loq/i0;", "h", "([FLm3/c;)V", "m", "p", "([F[F)V", "", "q", "([F)Ljava/lang/String;", "i", "([F)V", "", "degrees", "l", "([FF)V", "x", "y", "z", "n", "([FFFF)V", "r", "pivotX", "pivotY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "scaleZ", "j", "([FFFFFFFFFFFF)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[F", "getValues", "()[F", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float[] values;

    private /* synthetic */ g2(float[] fArr) {
        this.values = fArr;
    }

    public static final /* synthetic */ g2 a(float[] fArr) {
        return new g2(fArr);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i15, fr.k kVar) {
        if ((i15 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof g2) && fr.t.c(fArr, ((g2) obj).getValues());
    }

    public static final boolean e(float[] fArr, float[] fArr2) {
        return fr.t.c(fArr, fArr2);
    }

    public static int f(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long g(float[] fArr, long j15) {
        if (fArr.length < 16) {
            return j15;
        }
        float f15 = fArr[0];
        float f16 = fArr[1];
        float f17 = fArr[3];
        float f18 = fArr[4];
        float f19 = fArr[5];
        float f25 = fArr[7];
        float f26 = fArr[12];
        float f27 = fArr[13];
        float f28 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
        float f29 = 1 / (((f17 * fIntBitsToFloat) + (f25 * fIntBitsToFloat2)) + f28);
        if ((Float.floatToRawIntBits(f29) & Integer.MAX_VALUE) >= 2139095040) {
            f29 = 0.0f;
        }
        return m3.e.e((((long) Float.floatToRawIntBits((((f15 * fIntBitsToFloat) + (f18 * fIntBitsToFloat2)) + f26) * f29)) << 32) | (((long) Float.floatToRawIntBits(f29 * ((f16 * fIntBitsToFloat) + (f19 * fIntBitsToFloat2) + f27))) & BodyPartID.bodyIdMax));
    }

    public static final void h(float[] fArr, MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f15 = fArr[0];
        float f16 = fArr[1];
        float f17 = fArr[3];
        float f18 = fArr[4];
        float f19 = fArr[5];
        float f25 = fArr[7];
        float f26 = fArr[12];
        float f27 = fArr[13];
        float f28 = fArr[15];
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        float right = mutableRect.getRight();
        float bottom = mutableRect.getBottom();
        float f29 = f17 * left;
        float f35 = f25 * top;
        float f36 = 1.0f / ((f29 + f35) + f28);
        if ((Float.floatToRawIntBits(f36) & Integer.MAX_VALUE) >= 2139095040) {
            f36 = 0.0f;
        }
        float f37 = f15 * left;
        float f38 = f18 * top;
        float f39 = f36 * (f37 + f38 + f26);
        float f45 = left * f16;
        float f46 = top * f19;
        float f47 = f36 * (f45 + f46 + f27);
        float f48 = f25 * bottom;
        float f49 = 1.0f / ((f29 + f48) + f28);
        if ((Float.floatToRawIntBits(f49) & Integer.MAX_VALUE) >= 2139095040) {
            f49 = 0.0f;
        }
        float f55 = f18 * bottom;
        float f56 = (f37 + f55 + f26) * f49;
        float f57 = f19 * bottom;
        float f58 = f49 * (f45 + f57 + f27);
        float f59 = f17 * right;
        float f65 = 1.0f / ((f35 + f59) + f28);
        if ((Float.floatToRawIntBits(f65) & Integer.MAX_VALUE) >= 2139095040) {
            f65 = 0.0f;
        }
        float f66 = f15 * right;
        float f67 = f65 * (f66 + f38 + f26);
        float f68 = right * f16;
        float f69 = f65 * (f46 + f68 + f27);
        float f75 = 1.0f / ((f59 + f48) + f28);
        float f76 = (Float.floatToRawIntBits(f75) & Integer.MAX_VALUE) < 2139095040 ? f75 : 0.0f;
        float f77 = (f66 + f55 + f26) * f76;
        float f78 = f76 * (f68 + f57 + f27);
        mutableRect.i(Math.min(f39, Math.min(f56, Math.min(f67, f77))));
        mutableRect.k(Math.min(f47, Math.min(f58, Math.min(f69, f78))));
        mutableRect.j(Math.max(f39, Math.max(f56, Math.max(f67, f77))));
        mutableRect.h(Math.max(f47, Math.max(f58, Math.max(f69, f78))));
    }

    public static final void i(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void j(float[] fArr, float f15, float f16, float f17, float f18, float f19, float f25, float f26, float f27, float f28, float f29, float f35) {
        double d15 = ((double) f25) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d15);
        float fCos = (float) Math.cos(d15);
        float f36 = -fSin;
        float f37 = (f18 * fCos) - (f19 * fSin);
        float f38 = (f18 * fSin) + (f19 * fCos);
        double d16 = ((double) f26) * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d16);
        float fCos2 = (float) Math.cos(d16);
        float f39 = -fSin2;
        float f45 = fSin * fSin2;
        float f46 = fSin * fCos2;
        float f47 = fCos * fSin2;
        float f48 = fCos * fCos2;
        float f49 = (f17 * fCos2) + (f38 * fSin2);
        float f55 = ((-f17) * fSin2) + (f38 * fCos2);
        double d17 = ((double) f27) * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d17);
        float fCos3 = (float) Math.cos(d17);
        float f56 = -fSin3;
        float f57 = (f56 * fCos2) + (fCos3 * f45);
        float f58 = fCos * fCos3;
        float f59 = (f56 * f39) + (fCos3 * f46);
        float f65 = ((fCos2 * fCos3) + (f45 * fSin3)) * f28;
        float f66 = fSin3 * fCos * f28;
        float f67 = ((fCos3 * f39) + (fSin3 * f46)) * f28;
        float f68 = f57 * f29;
        float f69 = f58 * f29;
        float f75 = f59 * f29;
        float f76 = f47 * f35;
        float f77 = f36 * f35;
        float f78 = f48 * f35;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f65;
        fArr[1] = f66;
        fArr[2] = f67;
        fArr[3] = 0.0f;
        fArr[4] = f68;
        fArr[5] = f69;
        fArr[6] = f75;
        fArr[7] = 0.0f;
        fArr[8] = f76;
        fArr[9] = f77;
        fArr[10] = f78;
        fArr[11] = 0.0f;
        float f79 = -f15;
        fArr[12] = ((f65 * f79) - (f68 * f16)) + f49 + f15;
        fArr[13] = ((f66 * f79) - (f69 * f16)) + f37 + f16;
        fArr[14] = ((f79 * f67) - (f16 * f75)) + f55;
        fArr[15] = 1.0f;
    }

    public static /* synthetic */ void k(float[] fArr, float f15, float f16, float f17, float f18, float f19, float f25, float f26, float f27, float f28, float f29, float f35, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = 0.0f;
        }
        if ((i15 & 2) != 0) {
            f16 = 0.0f;
        }
        if ((i15 & 4) != 0) {
            f17 = 0.0f;
        }
        if ((i15 & 8) != 0) {
            f18 = 0.0f;
        }
        if ((i15 & 16) != 0) {
            f19 = 0.0f;
        }
        if ((i15 & 32) != 0) {
            f25 = 0.0f;
        }
        if ((i15 & 64) != 0) {
            f26 = 0.0f;
        }
        if ((i15 & 128) != 0) {
            f27 = 0.0f;
        }
        if ((i15 & 256) != 0) {
            f28 = 1.0f;
        }
        if ((i15 & 512) != 0) {
            f29 = 1.0f;
        }
        if ((i15 & 1024) != 0) {
            f35 = 1.0f;
        }
        j(fArr, f15, f16, f17, f18, f19, f25, f26, f27, f28, f29, f35);
    }

    public static final void l(float[] fArr, float f15) {
        if (fArr.length < 16) {
            return;
        }
        double d15 = ((double) f15) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d15);
        float fCos = (float) Math.cos(d15);
        float f16 = fArr[1];
        float f17 = fArr[2];
        float f18 = fArr[5];
        float f19 = fArr[6];
        float f25 = fArr[9];
        float f26 = fArr[10];
        float f27 = fArr[13];
        float f28 = fArr[14];
        fArr[1] = (f16 * fCos) - (f17 * fSin);
        fArr[2] = (f16 * fSin) + (f17 * fCos);
        fArr[5] = (f18 * fCos) - (f19 * fSin);
        fArr[6] = (f18 * fSin) + (f19 * fCos);
        fArr[9] = (f25 * fCos) - (f26 * fSin);
        fArr[10] = (f25 * fSin) + (f26 * fCos);
        fArr[13] = (f27 * fCos) - (f28 * fSin);
        fArr[14] = (f27 * fSin) + (f28 * fCos);
    }

    public static final void m(float[] fArr, float f15) {
        if (fArr.length < 16) {
            return;
        }
        double d15 = ((double) f15) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d15);
        float fCos = (float) Math.cos(d15);
        float f16 = fArr[0];
        float f17 = fArr[4];
        float f18 = (fCos * f16) + (fSin * f17);
        float f19 = -fSin;
        float f25 = fArr[1];
        float f26 = fArr[5];
        float f27 = (fCos * f25) + (fSin * f26);
        float f28 = fArr[2];
        float f29 = fArr[6];
        float f35 = (fCos * f28) + (fSin * f29);
        float f36 = fArr[3];
        float f37 = fArr[7];
        fArr[0] = f18;
        fArr[1] = f27;
        fArr[2] = f35;
        fArr[3] = (fCos * f36) + (fSin * f37);
        fArr[4] = (f16 * f19) + (f17 * fCos);
        fArr[5] = (f25 * f19) + (f26 * fCos);
        fArr[6] = (f28 * f19) + (f29 * fCos);
        fArr[7] = (f19 * f36) + (fCos * f37);
    }

    public static final void n(float[] fArr, float f15, float f16, float f17) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f15;
        fArr[1] = fArr[1] * f15;
        fArr[2] = fArr[2] * f15;
        fArr[3] = fArr[3] * f15;
        fArr[4] = fArr[4] * f16;
        fArr[5] = fArr[5] * f16;
        fArr[6] = fArr[6] * f16;
        fArr[7] = fArr[7] * f16;
        fArr[8] = fArr[8] * f17;
        fArr[9] = fArr[9] * f17;
        fArr[10] = fArr[10] * f17;
        fArr[11] = fArr[11] * f17;
    }

    public static /* synthetic */ void o(float[] fArr, float f15, float f16, float f17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = 1.0f;
        }
        if ((i15 & 2) != 0) {
            f16 = 1.0f;
        }
        if ((i15 & 4) != 0) {
            f17 = 1.0f;
        }
        n(fArr, f15, f16, f17);
    }

    public static final void p(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f15 = fArr[0];
            float f16 = fArr2[0];
            float f17 = fArr[1];
            float f18 = fArr2[4];
            float f19 = fArr[2];
            float f25 = fArr2[8];
            float f26 = fArr[3];
            float f27 = fArr2[12];
            float f28 = (f15 * f16) + (f17 * f18) + (f19 * f25) + (f26 * f27);
            float f29 = fArr2[1];
            float f35 = fArr2[5];
            float f36 = fArr2[9];
            float f37 = fArr2[13];
            float f38 = (f15 * f29) + (f17 * f35) + (f19 * f36) + (f26 * f37);
            float f39 = fArr2[2];
            float f45 = fArr2[6];
            float f46 = fArr2[10];
            float f47 = fArr2[14];
            float f48 = (f15 * f39) + (f17 * f45) + (f19 * f46) + (f26 * f47);
            float f49 = fArr2[3];
            float f55 = fArr2[7];
            float f56 = fArr2[11];
            float f57 = fArr2[15];
            float f58 = (f15 * f49) + (f17 * f55) + (f19 * f56) + (f26 * f57);
            float f59 = fArr[4];
            float f65 = fArr[5];
            float f66 = fArr[6];
            float f67 = fArr[7];
            float f68 = (f59 * f16) + (f65 * f18) + (f66 * f25) + (f67 * f27);
            float f69 = (f59 * f29) + (f65 * f35) + (f66 * f36) + (f67 * f37);
            float f75 = (f59 * f39) + (f65 * f45) + (f66 * f46) + (f67 * f47);
            float f76 = (f59 * f49) + (f65 * f55) + (f66 * f56) + (f67 * f57);
            float f77 = fArr[8];
            float f78 = fArr[9];
            float f79 = fArr[10];
            float f85 = fArr[11];
            float f86 = (f77 * f16) + (f78 * f18) + (f79 * f25) + (f85 * f27);
            float f87 = (f77 * f29) + (f78 * f35) + (f79 * f36) + (f85 * f37);
            float f88 = (f77 * f39) + (f78 * f45) + (f79 * f46) + (f85 * f47);
            float f89 = (f77 * f49) + (f78 * f55) + (f79 * f56) + (f85 * f57);
            float f95 = fArr[12];
            float f96 = fArr[13];
            float f97 = (f16 * f95) + (f18 * f96);
            float f98 = fArr[14];
            float f99 = f97 + (f25 * f98);
            float f100 = fArr[15];
            fArr[0] = f28;
            fArr[1] = f38;
            fArr[2] = f48;
            fArr[3] = f58;
            fArr[4] = f68;
            fArr[5] = f69;
            fArr[6] = f75;
            fArr[7] = f76;
            fArr[8] = f86;
            fArr[9] = f87;
            fArr[10] = f88;
            fArr[11] = f89;
            fArr[12] = f99 + (f27 * f100);
            fArr[13] = (f29 * f95) + (f35 * f96) + (f36 * f98) + (f37 * f100);
            fArr[14] = (f39 * f95) + (f45 * f96) + (f46 * f98) + (f47 * f100);
            fArr[15] = (f95 * f49) + (f96 * f55) + (f98 * f56) + (f100 * f57);
        }
    }

    public static String q(float[] fArr) {
        return fu.r.n("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void r(float[] fArr, float f15, float f16, float f17) {
        if (fArr.length < 16) {
            return;
        }
        float f18 = (fArr[0] * f15) + (fArr[4] * f16) + (fArr[8] * f17) + fArr[12];
        float f19 = (fArr[1] * f15) + (fArr[5] * f16) + (fArr[9] * f17) + fArr[13];
        float f25 = (fArr[2] * f15) + (fArr[6] * f16) + (fArr[10] * f17) + fArr[14];
        float f26 = (fArr[3] * f15) + (fArr[7] * f16) + (fArr[11] * f17) + fArr[15];
        fArr[12] = f18;
        fArr[13] = f19;
        fArr[14] = f25;
        fArr[15] = f26;
    }

    public static /* synthetic */ void s(float[] fArr, float f15, float f16, float f17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = 0.0f;
        }
        if ((i15 & 2) != 0) {
            f16 = 0.0f;
        }
        if ((i15 & 4) != 0) {
            f17 = 0.0f;
        }
        r(fArr, f15, f16, f17);
    }

    public boolean equals(Object other) {
        return d(this.values, other);
    }

    public int hashCode() {
        return f(this.values);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final /* synthetic */ float[] getValues() {
        return this.values;
    }

    public String toString() {
        return q(this.values);
    }
}
