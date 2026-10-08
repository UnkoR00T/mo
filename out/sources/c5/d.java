package c5;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0003*\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0006*\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0002*\u00020\u0006H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\u0003H\u0017¢\u0006\u0004\b\u0010\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\t*\u00020\u0003H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0013*\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lc5/d;", "Lc5/l;", "Lc5/h;", "", "l2", "(F)F", "", "X0", "(F)I", "Lc5/v;", "e1", "(J)F", "q2", "(J)I", "b2", "(I)F", "d2", "y0", "(F)J", "Lc5/k;", "Lm3/k;", "B2", "(J)J", "a0", "getDensity", "()F", "getDensity$annotations", "()V", "density", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d extends l {
    default long B2(long j15) {
        if (j15 == 9205357640488583168L) {
            return m3.k.INSTANCE.a();
        }
        float fL2 = l2(k.j(j15));
        return m3.k.d((((long) Float.floatToRawIntBits(l2(k.i(j15)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fL2) << 32));
    }

    default int X0(float f15) {
        float fL2 = l2(f15);
        if (Float.isInfinite(fL2)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fL2);
    }

    default long a0(long j15) {
        return j15 != 9205357640488583168L ? i.a(d2(Float.intBitsToFloat((int) (j15 >> 32))), d2(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)))) : k.INSTANCE.a();
    }

    default float b2(int i15) {
        return h.n(i15 / getDensity());
    }

    default float d2(float f15) {
        return h.n(f15 / getDensity());
    }

    default float e1(long j15) {
        if (!x.g(v.g(j15), x.INSTANCE.b())) {
            m.b("Only Sp can convert to Px");
        }
        return l2(h0(j15));
    }

    float getDensity();

    default float l2(float f15) {
        return f15 * getDensity();
    }

    default int q2(long j15) {
        return Math.round(e1(j15));
    }

    default long y0(float f15) {
        return Z(d2(f15));
    }
}
