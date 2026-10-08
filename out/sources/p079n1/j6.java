package p079n1;

import b5.v;
import c5.b;
import c5.d;
import c5.t;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import q4.Placeholder;
import q4.TextLayoutInput;
import q4.TextLayoutResult;
import q4.TextStyle;
import q4.e;
import q4.q;
import u4.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001ao\u0010\u0017\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lq4/t3;", "Lq4/e;", "text", "Lq4/b4;", "style", "", "Lq4/e$d;", "Lq4/g0;", "placeholders", "", "maxLines", "", "softWrap", "Lb5/v;", "overflow", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "Lu4/l$b;", "fontFamilyResolver", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "a", "(Lq4/t3;Lq4/e;Lq4/b4;Ljava/util/List;IZILc5/d;Lc5/t;Lu4/l$b;J)Z", "offset", "", "b", "(Lq4/t3;I)F", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j6 {
    public static final boolean a(TextLayoutResult textLayoutResult, e eVar, TextStyle textStyle, List<e.Range<Placeholder>> list, int i15, boolean z15, int i16, d dVar, t tVar, l.b bVar, long j15) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().a() || !fr.t.c(layoutInput.getText(), eVar) || !layoutInput.getStyle().I(textStyle) || !fr.t.c(layoutInput.g(), list) || layoutInput.getMaxLines() != i15 || layoutInput.getSoftWrap() != z15 || !v.g(layoutInput.getOverflow(), i16) || !fr.t.c(layoutInput.getDensity(), dVar) || layoutInput.getLayoutDirection() != tVar || !fr.t.c(layoutInput.getFontFamilyResolver(), bVar) || b.n(j15) != b.n(layoutInput.getConstraints())) {
            return false;
        }
        if (z15 || v.g(i16, v.INSTANCE.b())) {
            return b.l(j15) == b.l(layoutInput.getConstraints()) && b.k(j15) == b.k(layoutInput.getConstraints());
        }
        return true;
    }

    public static final float b(TextLayoutResult textLayoutResult, int i15) {
        if (i15 < 0 || textLayoutResult.getLayoutInput().getText().length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(textLayoutResult.getMultiParagraph().s(i15), Math.min(textLayoutResult.getMultiParagraph().getMaxLines() - 1, textLayoutResult.getMultiParagraph().getLineCount() - 1));
        if (i15 > q.r(textLayoutResult.getMultiParagraph(), iMin, false, 2, null)) {
            return 0.0f;
        }
        return textLayoutResult.getMultiParagraph().u(iMin);
    }
}
