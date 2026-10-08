package q4;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"", "Lq4/z;", "paragraphInfoList", "", "index", "b", "(Ljava/util/List;I)I", "", "y", "e", "(Ljava/util/List;F)I", "Lq4/z3;", "range", "Lkotlin/Function1;", "Loq/i0;", "action", "f", "(Ljava/util/List;JLer/l;)V", "lineIndex", "d", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w {
    public static final int b(List<ParagraphInfo> list, int i15) {
        int i16;
        byte b15;
        int endIndex = ((ParagraphInfo) pq.v.x0(list)).getEndIndex();
        boolean z15 = false;
        if (!(i15 <= ((ParagraphInfo) pq.v.x0(list)).getEndIndex())) {
            w4.a.a("Index " + i15 + " should be less or equal than last line's end " + endIndex);
        }
        int size = list.size() - 1;
        int i17 = 0;
        while (true) {
            if (i17 > size) {
                i16 = -(i17 + 1);
                break;
            }
            i16 = (i17 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i16);
            if (paragraphInfo.getStartIndex() > i15) {
                b15 = 1;
            } else {
                b15 = paragraphInfo.getEndIndex() <= i15 ? (byte) -1 : (byte) 0;
            }
            if (b15 >= 0) {
                if (b15 <= 0) {
                    break;
                }
                size = i16 - 1;
            } else {
                i17 = i16 + 1;
            }
        }
        if (i16 >= 0 && i16 < list.size()) {
            z15 = true;
        }
        if (!z15) {
            w4.a.a("Found paragraph index " + i16 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i15 + ", paragraphs=[" + e5.b.e(list, null, null, null, 0, null, new er.l() { // from class: q4.v
                @Override // er.l
                public final Object b(Object obj) {
                    return w.c((ParagraphInfo) obj);
                }
            }, 31, null) + ']');
        }
        return i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(ParagraphInfo paragraphInfo) {
        return '[' + paragraphInfo.getStartIndex() + ", " + paragraphInfo.getEndIndex() + ')';
    }

    public static final int d(List<ParagraphInfo> list, int i15) {
        byte b15;
        int size = list.size() - 1;
        int i16 = 0;
        while (i16 <= size) {
            int i17 = (i16 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i17);
            if (paragraphInfo.getStartLineIndex() > i15) {
                b15 = 1;
            } else {
                b15 = paragraphInfo.getEndLineIndex() <= i15 ? (byte) -1 : (byte) 0;
            }
            if (b15 < 0) {
                i16 = i17 + 1;
            } else {
                if (b15 <= 0) {
                    return i17;
                }
                size = i17 - 1;
            }
        }
        return -(i16 + 1);
    }

    public static final int e(List<ParagraphInfo> list, float f15) {
        byte b15;
        if (f15 <= 0.0f) {
            return 0;
        }
        if (f15 >= ((ParagraphInfo) pq.v.x0(list)).getBottom()) {
            return pq.v.p(list);
        }
        int size = list.size() - 1;
        int i15 = 0;
        while (i15 <= size) {
            int i16 = (i15 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i16);
            if (paragraphInfo.getTop() > f15) {
                b15 = 1;
            } else {
                b15 = paragraphInfo.getBottom() <= f15 ? (byte) -1 : (byte) 0;
            }
            if (b15 < 0) {
                i15 = i16 + 1;
            } else {
                if (b15 <= 0) {
                    return i16;
                }
                size = i16 - 1;
            }
        }
        return -(i15 + 1);
    }

    public static final void f(List<ParagraphInfo> list, long j15, er.l<? super ParagraphInfo, oq.i0> lVar) {
        int size = list.size();
        for (int iB = b(list, z3.l(j15)); iB < size; iB++) {
            ParagraphInfo paragraphInfo = list.get(iB);
            if (paragraphInfo.getStartIndex() >= z3.k(j15)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                lVar.b(paragraphInfo);
            }
        }
    }
}
