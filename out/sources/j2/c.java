package j2;

import n3.m2;
import n3.q2;
import n3.u0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ln3/m2;", "targetPath", "Lm3/i;", "roundedRect", "", "strokeWidth", "insetWidth", "", "fillArea", "d", "(Ln3/m2;Lm3/i;FFZ)Ln3/m2;", "widthPx", "c", "(FLm3/i;)Lm3/i;", "Lm3/a;", "value", "e", "(JF)J", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    private static final m3.i c(float f15, m3.i iVar) {
        return new m3.i(f15, f15, iVar.l() - f15, iVar.f() - f15, e(iVar.getTopLeftCornerRadius(), f15), e(iVar.getTopRightCornerRadius(), f15), e(iVar.getBottomRightCornerRadius(), f15), e(iVar.getBottomLeftCornerRadius(), f15), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m2 d(m2 m2Var, m3.i iVar, float f15, float f16, boolean z15) {
        m2Var.reset();
        m2.o(m2Var, c(f16, iVar), null, 2, null);
        if (!z15) {
            m2 m2VarA = u0.a();
            m2.o(m2VarA, c(f15 + f16, iVar), null, 2, null);
            m2Var.e(m2Var, m2VarA, q2.INSTANCE.a());
        }
        return m2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j15, float f15) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j15 >> 32)) - f15);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) - f15);
        return m3.a.b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & BodyPartID.bodyIdMax));
    }
}
