package p079n1;

import c5.c;
import c5.d;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.a;
import fu.r;
import m3.e;
import m3.g;
import m3.h;
import m3.k;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p036e4.b0;
import p071kotlin.Metadata;
import pq.v;
import q4.TextLayoutResult;
import q4.TextStyle;
import q4.d0;
import q4.y;
import u4.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lq4/b4;", "style", "Lc5/d;", "density", "Lu4/l$b;", "fontFamilyResolver", "", "text", "", "maxLines", "Lc5/r;", "a", "(Lq4/b4;Lc5/d;Lu4/l$b;Ljava/lang/String;I)J", "Lq4/t3;", "layoutResult", "Le4/b0;", "layoutCoordinates", "focusOffset", "Lkotlin/Function0;", "sizeForDefaultText", "Lm3/g;", "c", "(Lq4/t3;Le4/b0;ILer/a;)Lm3/g;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "EmptyTextReplacement", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f130455a = r.L(i.f37087n, 10);

    public static final long a(TextStyle textStyle, d dVar, l.b bVar, String str, int i15) {
        y yVarA = d0.a(str, textStyle, c.b(0, 0, 0, 0, 15, null), dVar, bVar, (64 & 32) != 0 ? v.n() : v.n(), (64 & 64) != 0 ? v.n() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i15, (64 & 256) != 0 ? b5.v.INSTANCE.a() : b5.v.INSTANCE.a());
        return c5.r.c((((long) k4.a(yVarA.f())) << 32) | (((long) k4.a(yVarA.getHeight())) & BodyPartID.bodyIdMax));
    }

    public static /* synthetic */ long b(TextStyle textStyle, d dVar, l.b bVar, String str, int i15, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            str = f130455a;
        }
        if ((i16 & 16) != 0) {
            i15 = 1;
        }
        return a(textStyle, dVar, bVar, str, i15);
    }

    public static final g c(TextLayoutResult textLayoutResult, b0 b0Var, int i15, a<c5.r> aVar) {
        g gVarD;
        if (i15 < textLayoutResult.getLayoutInput().getText().length()) {
            gVarD = textLayoutResult.d(i15);
        } else {
            gVarD = i15 != 0 ? textLayoutResult.d(i15 - 1) : new g(0.0f, 0.0f, 1.0f, (int) (aVar.a().getPackedValue() & BodyPartID.bodyIdMax));
        }
        long jA0 = b0Var.A0(e.e((((long) Float.floatToRawIntBits(gVarD.getTop())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(gVarD.getLeft())) << 32)));
        return h.c(e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jA0 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jA0 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax)), k.d((((long) Float.floatToRawIntBits(gVarD.getBottom() - gVarD.getTop())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(gVarD.getRight() - gVarD.getLeft())) << 32)));
    }

    public static final String d() {
        return f130455a;
    }
}
