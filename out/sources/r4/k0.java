package r4;

import android.graphics.RectF;
import android.text.Layout;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\r\u001aO\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001am\u0010\u001e\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001am\u0010 \u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b \u0010\u001f\u001a'\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#\u001a'\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010#\u001a#\u0010'\u001a\u00020\n*\u00020\u00052\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lr4/j0;", "Landroid/text/Layout;", "layout", "Lr4/r;", "layoutHelper", "Landroid/graphics/RectF;", "rect", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "d", "(Lr4/j0;Landroid/text/Layout;Lr4/r;Landroid/graphics/RectF;ILer/p;)[I", "lineIndex", "Ls4/e;", "segmentFinder", "getStart", "f", "(Lr4/j0;Landroid/text/Layout;Lr4/r;ILandroid/graphics/RectF;Ls4/e;Ler/p;Z)I", "Lr4/r$a;", "lineStart", "lineTop", "lineBottom", "", "runLeft", "runRight", "", "horizontalBounds", "e", "(Lr4/r$a;Landroid/graphics/RectF;IIIFF[FLs4/e;Ler/p;)I", "c", "offset", "a", "(II[F)F", "b", "left", "right", "g", "(Landroid/graphics/RectF;FF)Z", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k0 {
    private static final float a(int i15, int i16, float[] fArr) {
        return fArr[(i15 - i16) * 2];
    }

    private static final float b(int i15, int i16, float[] fArr) {
        return fArr[((i15 - i16) * 2) + 1];
    }

    private static final int c(r.BidiRun aVar, RectF rectF, int i15, int i16, int i17, float f15, float f16, float[] fArr, s4.e eVar, er.p<? super RectF, ? super RectF, Boolean> pVar) {
        int iB;
        int iC;
        if (!g(rectF, f15, f16)) {
            return -1;
        }
        if ((aVar.getIsRtl() || rectF.right < f16) && (!aVar.getIsRtl() || rectF.left > f15)) {
            iB = aVar.getStart();
            int iA = aVar.getEnd();
            while (iA - iB > 1) {
                int i18 = (iA + iB) / 2;
                float fA = a(i18, i15, fArr);
                if ((aVar.getIsRtl() || fA <= rectF.right) && (!aVar.getIsRtl() || fA >= rectF.left)) {
                    iB = i18;
                } else {
                    iA = i18;
                }
            }
            if (aVar.getIsRtl()) {
                iB = iA;
            }
        } else {
            iB = aVar.getEnd() - 1;
        }
        int iB2 = eVar.b(iB + 1);
        if (iB2 == -1 || (iC = eVar.c(iB2)) <= aVar.getStart()) {
            return -1;
        }
        int iE = lr.m.e(iB2, aVar.getStart());
        int iJ = lr.m.j(iC, aVar.getEnd());
        RectF rectF2 = new RectF(0.0f, i16, 0.0f, i17);
        while (true) {
            rectF2.left = aVar.getIsRtl() ? a(iJ - 1, i15, fArr) : a(iE, i15, fArr);
            rectF2.right = aVar.getIsRtl() ? b(iE, i15, fArr) : b(iJ - 1, i15, fArr);
            if (pVar.B(rectF2, rectF).booleanValue()) {
                return iJ;
            }
            iJ = eVar.d(iJ);
            if (iJ == -1 || iJ <= aVar.getStart()) {
                return -1;
            }
            iE = lr.m.e(eVar.b(iJ), aVar.getStart());
        }
    }

    public static final int[] d(j0 j0Var, Layout layout, r rVar, RectF rectF, int i15, er.p<? super RectF, ? super RectF, Boolean> pVar) {
        int i16;
        s4.e iVar = i15 == 1 ? new s4.i(j0Var.G(), j0Var.I()) : s4.f.a(j0Var.G(), j0Var.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > j0Var.l(lineForVertical) && (lineForVertical = lineForVertical + 1) >= j0Var.getLineCount()) {
            return null;
        }
        int i17 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < j0Var.w(0)) {
            return null;
        }
        int iF = f(j0Var, layout, rVar, i17, rectF, iVar, pVar, true);
        while (true) {
            i16 = i17;
            if (iF != -1 || i16 >= lineForVertical2) {
                break;
            }
            i17 = i16 + 1;
            iF = f(j0Var, layout, rVar, i17, rectF, iVar, pVar, true);
        }
        if (iF == -1) {
            return null;
        }
        int iF2 = f(j0Var, layout, rVar, lineForVertical2, rectF, iVar, pVar, false);
        while (iF2 == -1 && i16 < lineForVertical2) {
            int i18 = lineForVertical2 - 1;
            iF2 = f(j0Var, layout, rVar, i18, rectF, iVar, pVar, false);
            lineForVertical2 = i18;
        }
        if (iF2 == -1) {
            return null;
        }
        return new int[]{iVar.b(iF + 1), iVar.c(iF2 - 1)};
    }

    private static final int e(r.BidiRun aVar, RectF rectF, int i15, int i16, int i17, float f15, float f16, float[] fArr, s4.e eVar, er.p<? super RectF, ? super RectF, Boolean> pVar) {
        int iB;
        int iB2;
        if (!g(rectF, f15, f16)) {
            return -1;
        }
        if ((aVar.getIsRtl() || rectF.left > f15) && (!aVar.getIsRtl() || rectF.right < f16)) {
            iB = aVar.getStart();
            int iA = aVar.getEnd();
            while (iA - iB > 1) {
                int i18 = (iA + iB) / 2;
                float fA = a(i18, i15, fArr);
                if ((aVar.getIsRtl() || fA <= rectF.left) && (!aVar.getIsRtl() || fA >= rectF.right)) {
                    iB = i18;
                } else {
                    iA = i18;
                }
            }
            if (aVar.getIsRtl()) {
                iB = iA;
            }
        } else {
            iB = aVar.getStart();
        }
        int iC = eVar.c(iB);
        if (iC == -1 || (iB2 = eVar.b(iC)) >= aVar.getEnd()) {
            return -1;
        }
        int iE = lr.m.e(iB2, aVar.getStart());
        int iJ = lr.m.j(iC, aVar.getEnd());
        RectF rectF2 = new RectF(0.0f, i16, 0.0f, i17);
        while (true) {
            rectF2.left = aVar.getIsRtl() ? a(iJ - 1, i15, fArr) : a(iE, i15, fArr);
            rectF2.right = aVar.getIsRtl() ? b(iE, i15, fArr) : b(iJ - 1, i15, fArr);
            if (pVar.B(rectF2, rectF).booleanValue()) {
                return iE;
            }
            iE = eVar.a(iE);
            if (iE == -1 || iE >= aVar.getEnd()) {
                return -1;
            }
            iJ = lr.m.j(eVar.c(iE), aVar.getEnd());
        }
    }

    private static final int f(j0 j0Var, Layout layout, r rVar, int i15, RectF rectF, s4.e eVar, er.p<? super RectF, ? super RectF, Boolean> pVar, boolean z15) {
        int lineTop = layout.getLineTop(i15);
        int lineBottom = layout.getLineBottom(i15);
        int lineStart = layout.getLineStart(i15);
        int lineEnd = layout.getLineEnd(i15);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        j0Var.b(i15, fArr);
        r.BidiRun[] aVarArrD = rVar.d(i15);
        lr.g gVarR0 = z15 ? pq.n.r0(aVarArrD) : lr.m.r(pq.n.v0(aVarArrD), 0);
        int first = gVarR0.getFirst();
        int last = gVarR0.getLast();
        int step = gVarR0.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            int i16 = first;
            while (true) {
                r.BidiRun aVar = aVarArrD[i16];
                float fA = aVar.getIsRtl() ? a(aVar.getEnd() - 1, lineStart, fArr) : a(aVar.getStart(), lineStart, fArr);
                float fB = aVar.getIsRtl() ? b(aVar.getStart(), lineStart, fArr) : b(aVar.getEnd() - 1, lineStart, fArr);
                int iE = z15 ? e(aVar, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, eVar, pVar) : c(aVar, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, eVar, pVar);
                if (iE >= 0) {
                    return iE;
                }
                if (i16 != last) {
                    i16 += step;
                }
            }
        }
        return -1;
    }

    private static final boolean g(RectF rectF, float f15, float f16) {
        return f16 >= rectF.left && f15 <= rectF.right;
    }
}
