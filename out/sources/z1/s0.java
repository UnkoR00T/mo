package z1;

import p071kotlin.Metadata;
import p079n1.d4;
import q4.TextLayoutResult;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a#\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\t*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0011\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a#\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!¨\u0006$²\u0006\f\u0010\"\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lz1/e1;", "Lz1/h0;", "info", "Lz1/j0$a;", "previousSelectionAnchor", "l", "(Lz1/e1;Lz1/h0;Lz1/j0$a;)Lz1/j0$a;", "", "currentRawOffset", "", "isStart", "j", "(Lz1/h0;IZ)Z", "currentLine", "currentOffset", "otherOffset", "crossed", "k", "(Lz1/h0;IIIZZ)Lz1/j0$a;", "layout", "Lz1/n;", "boundaryFunction", "Lz1/j0;", "e", "(Lz1/e1;Lz1/n;)Lz1/j0;", "slot", "f", "(Lz1/h0;ZZILz1/n;)Lz1/j0$a;", "h", "(Lz1/j0;Lz1/e1;)Lz1/j0;", "i", "newOffset", "g", "(Lz1/j0$a;Lz1/h0;I)Lz1/j0$a;", "currentRawLine", "anchorSnappedToWordBoundary", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection e(e1 e1Var, n nVar) {
        boolean z15 = e1Var.e() == p.CROSSED;
        return new Selection(f(e1Var.j(), z15, true, e1Var.getStartSlot(), nVar), f(e1Var.i(), z15, false, e1Var.getEndSlot(), nVar), z15);
    }

    private static final Selection.AnchorInfo f(h0 h0Var, boolean z15, boolean z16, int i15, n nVar) {
        int rawStartHandleOffset = z16 ? h0Var.getRawStartHandleOffset() : h0Var.getRawEndHandleOffset();
        if (i15 != h0Var.getSlot()) {
            return h0Var.a(rawStartHandleOffset);
        }
        long jA = nVar.a(h0Var, rawStartHandleOffset);
        return h0Var.a(z15 ^ z16 ? z3.n(jA) : z3.i(jA));
    }

    private static final Selection.AnchorInfo g(Selection.AnchorInfo anchorInfo, h0 h0Var, int i15) {
        return Selection.AnchorInfo.b(anchorInfo, h0Var.getTextLayoutResult().c(i15), i15, 0L, 4, null);
    }

    public static final Selection h(Selection selection, e1 e1Var) {
        if (g1.c(selection, e1Var)) {
            return (e1Var.getSize() > 1 || e1Var.getPreviousSelection() == null || e1Var.getInfo().c().length() == 0) ? selection : i(selection, e1Var);
        }
        return selection;
    }

    private static final Selection i(Selection selection, e1 e1Var) {
        h0 h0VarB = e1Var.getInfo();
        String strC = h0VarB.c();
        int rawStartHandleOffset = h0VarB.getRawStartHandleOffset();
        int length = strC.length();
        if (rawStartHandleOffset == 0) {
            int iC = d4.c(strC, 0);
            return e1Var.getIsStartHandle() ? Selection.b(selection, g(selection.getStart(), h0VarB, iC), null, true, 2, null) : Selection.b(selection, null, g(selection.getEnd(), h0VarB, iC), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int iD = d4.d(strC, length);
            return e1Var.getIsStartHandle() ? Selection.b(selection, g(selection.getStart(), h0VarB, iD), null, false, 2, null) : Selection.b(selection, null, g(selection.getEnd(), h0VarB, iD), true, 1, null);
        }
        Selection selectionH = e1Var.getPreviousSelection();
        boolean z15 = selectionH != null && selectionH.getHandlesCrossed();
        int iD2 = e1Var.getIsStartHandle() ^ z15 ? d4.d(strC, rawStartHandleOffset) : d4.c(strC, rawStartHandleOffset);
        return e1Var.getIsStartHandle() ? Selection.b(selection, g(selection.getStart(), h0VarB, iD2), null, z15, 2, null) : Selection.b(selection, null, g(selection.getEnd(), h0VarB, iD2), z15, 1, null);
    }

    private static final boolean j(h0 h0Var, int i15, boolean z15) {
        if (h0Var.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i15 == h0Var.getRawPreviousHandleOffset()) {
            return false;
        }
        if (z15 ^ (h0Var.d() == p.CROSSED)) {
            return i15 < h0Var.getRawPreviousHandleOffset();
        }
        return i15 > h0Var.getRawPreviousHandleOffset();
    }

    private static final Selection.AnchorInfo k(h0 h0Var, int i15, int i16, int i17, boolean z15, boolean z16) {
        int iU;
        int iP;
        long jC = h0Var.getTextLayoutResult().C(i16);
        if (h0Var.getTextLayoutResult().q(z3.n(jC)) == i15) {
            iU = z3.n(jC);
        } else {
            iU = i15 >= h0Var.getTextLayoutResult().n() ? h0Var.getTextLayoutResult().u(h0Var.getTextLayoutResult().n() - 1) : h0Var.getTextLayoutResult().u(i15);
        }
        if (h0Var.getTextLayoutResult().q(z3.i(jC)) == i15) {
            iP = z3.i(jC);
        } else {
            iP = i15 >= h0Var.getTextLayoutResult().n() ? TextLayoutResult.p(h0Var.getTextLayoutResult(), h0Var.getTextLayoutResult().n() - 1, false, 2, null) : TextLayoutResult.p(h0Var.getTextLayoutResult(), i15, false, 2, null);
        }
        if (iU == i17) {
            return h0Var.a(iP);
        }
        if (iP == i17) {
            return h0Var.a(iU);
        }
        if (!(z15 ^ z16) ? i16 >= iU : i16 > iP) {
            iU = iP;
        }
        return h0Var.a(iU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo l(final e1 e1Var, final h0 h0Var, Selection.AnchorInfo anchorInfo) {
        final int rawStartHandleOffset = e1Var.getIsStartHandle() ? h0Var.getRawStartHandleOffset() : h0Var.getRawEndHandleOffset();
        if ((e1Var.getIsStartHandle() ? e1Var.getStartSlot() : e1Var.getEndSlot()) != h0Var.getSlot()) {
            return h0Var.a(rawStartHandleOffset);
        }
        oq.o oVar = oq.o.NONE;
        final oq.k kVarB = oq.l.b(oVar, new er.a() { // from class: z1.q0
            @Override // er.a
            public final Object a() {
                return Integer.valueOf(s0.m(h0Var, rawStartHandleOffset));
            }
        });
        final int rawEndHandleOffset = e1Var.getIsStartHandle() ? h0Var.getRawEndHandleOffset() : h0Var.getRawStartHandleOffset();
        oq.k kVarB2 = oq.l.b(oVar, new er.a() { // from class: z1.r0
            @Override // er.a
            public final Object a() {
                return s0.o(h0Var, rawStartHandleOffset, rawEndHandleOffset, e1Var, kVarB);
            }
        });
        if (h0Var.getSelectableId() != anchorInfo.getSelectableId()) {
            return p(kVarB2);
        }
        int rawPreviousHandleOffset = h0Var.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (n(kVarB) != h0Var.getTextLayoutResult().q(rawPreviousHandleOffset)) {
            return p(kVarB2);
        }
        int offset = anchorInfo.getOffset();
        long jC = h0Var.getTextLayoutResult().C(offset);
        if (j(h0Var, rawStartHandleOffset, e1Var.getIsStartHandle())) {
            return (offset == z3.n(jC) || offset == z3.i(jC)) ? p(kVarB2) : h0Var.a(rawStartHandleOffset);
        }
        return h0Var.a(rawStartHandleOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(h0 h0Var, int i15) {
        return h0Var.getTextLayoutResult().q(i15);
    }

    private static final int n(oq.k<Integer> kVar) {
        return kVar.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo o(h0 h0Var, int i15, int i16, e1 e1Var, oq.k kVar) {
        return k(h0Var, n(kVar), i15, i16, e1Var.getIsStartHandle(), e1Var.e() == p.CROSSED);
    }

    private static final Selection.AnchorInfo p(oq.k<Selection.AnchorInfo> kVar) {
        return kVar.getValue();
    }
}
