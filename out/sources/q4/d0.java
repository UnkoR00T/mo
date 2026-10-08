package q4;

import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001au\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u0010*\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"", "text", "Lq4/b4;", "style", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Lc5/d;", "density", "Lu4/l$b;", "fontFamilyResolver", "", "Lq4/e$d;", "Lq4/h3;", "spanStyles", "Lq4/g0;", "placeholders", "", "maxLines", "Lb5/v;", "overflow", "Lq4/y;", "a", "(Ljava/lang/String;Lq4/b4;JLc5/d;Lu4/l$b;Ljava/util/List;Ljava/util/List;II)Lq4/y;", "Lq4/b0;", "paragraphIntrinsics", "c", "(Lq4/b0;JII)Lq4/y;", "", "d", "(F)I", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d0 {
    public static final y a(String str, TextStyle textStyle, long j15, c5.d dVar, u4.l.b bVar, List<e.Range<SpanStyle>> list, List<e.Range<Placeholder>> list2, int i15, int i16) {
        return y4.g.b(str, textStyle, list, list2, i15, i16, j15, dVar, bVar);
    }

    public static final y c(b0 b0Var, long j15, int i15, int i16) {
        return y4.g.a(b0Var, i15, i16, j15);
    }

    public static final int d(float f15) {
        return (int) Math.ceil(f15);
    }
}
