package h2;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh7/i;", "Ln3/g2;", "matrix", "a", "(Lh7/i;[F)Lh7/i;", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements h7.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float[] f80034a;

        a(float[] fArr) {
            this.f80034a = fArr;
        }

        @Override // h7.g
        public final long a(float f15, float f16) {
            long jG = n3.g2.g(this.f80034a, m3.e.e((((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f15) << 32)));
            return r0.g.b(Float.intBitsToFloat((int) (jG >> 32)), Float.intBitsToFloat((int) (jG & BodyPartID.bodyIdMax)));
        }
    }

    public static final h7.i a(h7.i iVar, float[] fArr) {
        return iVar.d(new a(fArr));
    }
}
