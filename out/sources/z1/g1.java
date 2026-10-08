package z1;

import p071kotlin.Metadata;
import q4.TextLayoutResult;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\b*\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lq4/t3;", "layoutResult", "", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Lq4/z3;", "previousSelectionRange", "", "isStartOfSelection", "isStartHandle", "Lz1/e1;", "b", "(Lq4/t3;IIIJZZ)Lz1/e1;", "Lz1/j0;", "layout", "c", "(Lz1/j0;Lz1/e1;)Z", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g1 {
    public static final e1 b(TextLayoutResult textLayoutResult, int i15, int i16, int i17, long j15, boolean z15, boolean z16) {
        return new SingleSelectionLayout(z16, 1, 1, z15 ? null : new Selection(new Selection.AnchorInfo(d1.a(textLayoutResult, z3.n(j15)), z3.n(j15), 1L), new Selection.AnchorInfo(d1.a(textLayoutResult, z3.i(j15)), z3.i(j15), 1L), z3.m(j15)), new h0(1L, 1, i15, i16, i17, textLayoutResult));
    }

    public static final boolean c(Selection selection, e1 e1Var) {
        if (selection == null || e1Var == null) {
            return true;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return selection.getStart().getOffset() == selection.getEnd().getOffset();
        }
        if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
            return false;
        }
        if (e1Var.c().l() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
            return false;
        }
        final fr.l0 l0Var = new fr.l0();
        l0Var.f66404a = true;
        e1Var.f(new er.l() { // from class: z1.f1
            @Override // er.l
            public final Object b(Object obj) {
                return g1.d(l0Var, (h0) obj);
            }
        });
        return l0Var.f66404a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(fr.l0 l0Var, h0 h0Var) {
        if (h0Var.c().length() > 0) {
            l0Var.f66404a = false;
        }
        return oq.i0.f148189a;
    }
}
