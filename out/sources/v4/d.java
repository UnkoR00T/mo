package v4;

import android.view.inputmethod.CursorAnchorInfo;
import p071kotlin.Metadata;
import q4.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lv4/d;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Lq4/t3;", "textLayoutResult", "Lm3/g;", "innerTextFieldBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lq4/t3;Lm3/g;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f203632a = new d();

    private d() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, m3.g innerTextFieldBounds) {
        int iE;
        int iN;
        int iN2;
        if (!innerTextFieldBounds.r() && (iN = lr.m.n(textLayoutResult.r(innerTextFieldBounds.getTop()), 0, (iE = lr.m.e(textLayoutResult.n() - 1, 0)))) <= (iN2 = lr.m.n(textLayoutResult.r(innerTextFieldBounds.getBottom()), 0, iE))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.s(iN), textLayoutResult.v(iN), textLayoutResult.t(iN), textLayoutResult.m(iN));
                if (iN == iN2) {
                    break;
                }
                iN++;
            }
        }
        return builder;
    }
}
