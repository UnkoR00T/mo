package v4;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import p071kotlin.Metadata;
import q4.TextLayoutResult;
import q4.a4;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\u001ak\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001f\u001a\u00020\f*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Lv4/t0;", "textFieldValue", "Lv4/i0;", "offsetMapping", "Lq4/t3;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Lm3/g;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "b", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lv4/t0;Lv4/i0;Lq4/t3;Landroid/graphics/Matrix;Lm3/g;Lm3/g;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "selectionStart", "d", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILv4/i0;Lq4/t3;Lm3/g;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "endOffset", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILv4/i0;Lq4/t3;Lm3/g;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "x", "y", "c", "(Lm3/g;FF)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, int i15, int i16, i0 i0Var, TextLayoutResult textLayoutResult, m3.g gVar) {
        ?? r15;
        int iE = i0Var.e(i15);
        int iE2 = i0Var.e(i16);
        float[] fArr = new float[(iE2 - iE) * 4];
        textLayoutResult.getMultiParagraph().c(a4.b(iE, iE2), fArr, 0);
        for (int i17 = i15; i17 < i16; i17++) {
            int iE3 = i0Var.e(i17);
            int i18 = (iE3 - iE) * 4;
            m3.g gVar2 = new m3.g(fArr[i18], fArr[i18 + 1], fArr[i18 + 2], fArr[i18 + 3]);
            boolean zS = gVar.s(gVar2);
            if (!c(gVar, gVar2.getLeft(), gVar2.getTop()) || !c(gVar, gVar2.getRight(), gVar2.getBottom())) {
                r15 = zS;
                r15 = (zS ? 1 : 0) | 2;
            }
            r15 = zS;
            if (textLayoutResult.c(iE3) == b5.i.Rtl) {
                r15 = (r15 == true ? 1 : 0) | 4;
            }
            builder.addCharacterBounds(i17, gVar2.getLeft(), gVar2.getTop(), gVar2.getRight(), gVar2.getBottom(), r15 == true ? 1 : 0);
        }
        return builder;
    }

    @oq.a
    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, i0 i0Var, TextLayoutResult textLayoutResult, Matrix matrix, m3.g gVar, m3.g gVar2, boolean z15, boolean z16, boolean z17, boolean z18) {
        builder.reset();
        builder.setMatrix(matrix);
        int iL = z3.l(textFieldValue.getSelection());
        builder.setSelectionRange(iL, z3.k(textFieldValue.getSelection()));
        if (z15) {
            d(builder, iL, i0Var, textLayoutResult, gVar);
        }
        if (z16) {
            z3 composition = textFieldValue.getComposition();
            int iL2 = composition != null ? z3.l(composition.getPackedValue()) : -1;
            z3 composition2 = textFieldValue.getComposition();
            int iK = composition2 != null ? z3.k(composition2.getPackedValue()) : -1;
            if (iL2 >= 0 && iL2 < iK) {
                builder.setComposingText(iL2, textFieldValue.m().subSequence(iL2, iK));
                a(builder, iL2, iK, i0Var, textLayoutResult, gVar);
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 33 && z17) {
            c.a(builder, gVar2);
        }
        if (i15 >= 34 && z18) {
            d.a(builder, textLayoutResult, gVar);
        }
        return builder.build();
    }

    private static final boolean c(m3.g gVar, float f15, float f16) {
        float left = gVar.getLeft();
        if (f15 > gVar.getRight() || left > f15) {
            return false;
        }
        return f16 <= gVar.getBottom() && gVar.getTop() <= f16;
    }

    private static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i15, i0 i0Var, TextLayoutResult textLayoutResult, m3.g gVar) {
        if (i15 < 0) {
            return builder;
        }
        int iE = i0Var.e(i15);
        m3.g gVarE = textLayoutResult.e(iE);
        float fM = lr.m.m(gVarE.getLeft(), 0.0f, (int) (textLayoutResult.getSize() >> 32));
        boolean zC = c(gVar, fM, gVarE.getTop());
        boolean zC2 = c(gVar, fM, gVarE.getBottom());
        boolean z15 = textLayoutResult.c(iE) == b5.i.Rtl;
        int i16 = (zC || zC2) ? 1 : 0;
        if (!zC || !zC2) {
            i16 |= 2;
        }
        if (z15) {
            i16 |= 4;
        }
        builder.setInsertionMarkerLocation(fM, gVarE.getTop(), gVarE.getBottom(), gVarE.getBottom(), i16);
        return builder;
    }
}
