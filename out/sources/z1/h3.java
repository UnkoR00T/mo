package z1;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import q4.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lq4/t3;", "textLayoutResult", "", "offset", "", "isStart", "areHandlesCrossed", "Lm3/e;", "b", "(Lq4/t3;IZZ)J", "", "a", "(Lq4/t3;IZZ)F", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h3 {
    public static final float a(TextLayoutResult textLayoutResult, int i15, boolean z15, boolean z16) {
        return textLayoutResult.j(i15, textLayoutResult.c(((!z15 || z16) && (z15 || !z16)) ? Math.max(i15 + (-1), 0) : i15) == textLayoutResult.y(i15));
    }

    public static final long b(TextLayoutResult textLayoutResult, int i15, boolean z15, boolean z16) {
        int iQ = textLayoutResult.q(i15);
        if (iQ >= textLayoutResult.n()) {
            return m3.e.INSTANCE.b();
        }
        return m3.e.e((((long) Float.floatToRawIntBits(lr.m.m(a(textLayoutResult, i15, z15, z16), 0.0f, (int) (textLayoutResult.getSize() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(lr.m.m(textLayoutResult.m(iQ), 0.0f, (int) (textLayoutResult.getSize() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
    }
}
