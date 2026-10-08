package x0;

import m3.i;
import n3.m2;
import n3.q2;
import n3.u0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ln3/m2;", "targetPath", "Lm3/i;", "roundedRect", "", "strokeWidth", "", "fillArea", "d", "(Ln3/m2;Lm3/i;FZ)Ln3/m2;", "widthPx", "c", "(FLm3/i;)Lm3/i;", "Lm3/a;", "value", "e", "(JF)J", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    private static final i c(float f15, i iVar) {
        return new i(iVar.getLeft() + f15, iVar.getTop() + f15, iVar.getRight() - f15, iVar.getBottom() - f15, e(iVar.getTopLeftCornerRadius(), f15), e(iVar.getTopRightCornerRadius(), f15), e(iVar.getBottomRightCornerRadius(), f15), e(iVar.getBottomLeftCornerRadius(), f15), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m2 d(m2 m2Var, i iVar, float f15, boolean z15) {
        m2Var.reset();
        m2.o(m2Var, iVar, null, 2, null);
        if (!z15) {
            m2 m2VarA = u0.a();
            m2.o(m2VarA, c(f15, iVar), null, 2, null);
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
