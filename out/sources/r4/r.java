package r4;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0019J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020%¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00101R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00104R\u0017\u00109\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lr4/r;", "", "Landroid/text/Layout;", "layout", "<init>", "(Landroid/text/Layout;)V", "", "offset", "", "primary", "", "b", "(IZ)F", "lineEnd", "lineStart", "k", "(II)I", "paragraphIndex", "Ljava/text/Bidi;", "a", "(I)Ljava/text/Bidi;", "upstream", "f", "(IZ)I", "h", "(I)I", "j", "(I)Z", "usePrimaryDirection", "c", "(IZZ)F", "lineIndex", "e", "", "Lr4/r$a;", "d", "(I)[Lr4/r$a;", "", "i", "(C)Z", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "", "Ljava/util/List;", "paragraphEnds", "", "paragraphBidi", "", "[Z", "bidiProcessedParagraphs", "", "[C", "tmpBuffer", "I", "getParagraphCount", "()I", "paragraphCount", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Layout layout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> paragraphEnds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Bidi> paragraphBidi;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean[] bidiProcessedParagraphs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private char[] tmpBuffer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int paragraphCount;

    /* JADX INFO: renamed from: r4.r$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lr4/r$a;", "", "", "start", "end", "", "isRtl", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Z", "()Z", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BidiRun {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRtl;

        public BidiRun(int i15, int i16, boolean z15) {
            this.start = i15;
            this.end = i16;
            this.isRtl = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsRtl() {
            return this.isRtl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) other;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Boolean.hashCode(this.isRtl);
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public r(Layout layout) {
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iQ0 = fu.r.q0(this.layout.getText(), '\n', length, false, 4, null);
            length = iQ0 < 0 ? this.layout.getText().length() : iQ0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float b(int offset, boolean primary) {
        int iJ = lr.m.j(offset, this.layout.getLineEnd(this.layout.getLineForOffset(offset)));
        return primary ? this.layout.getPrimaryHorizontal(iJ) : this.layout.getSecondaryHorizontal(iJ);
    }

    public static /* synthetic */ int g(r rVar, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            z15 = false;
        }
        return rVar.f(i15, z15);
    }

    private final int k(int lineEnd, int lineStart) {
        while (lineEnd > lineStart && i(this.layout.getText().charAt(lineEnd - 1))) {
            lineEnd--;
        }
        return lineEnd;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    public final Bidi a(int paragraphIndex) {
        Bidi bidi;
        if (this.bidiProcessedParagraphs[paragraphIndex]) {
            return this.paragraphBidi.get(paragraphIndex);
        }
        int iIntValue = paragraphIndex == 0 ? 0 : this.paragraphEnds.get(paragraphIndex - 1).intValue();
        int iIntValue2 = this.paragraphEnds.get(paragraphIndex).intValue();
        int i15 = iIntValue2 - iIntValue;
        char[] cArr = this.tmpBuffer;
        if (cArr == null || cArr.length < i15) {
            cArr = new char[i15];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i15)) {
            bidi = new Bidi(cArr2, 0, null, 0, i15, j(paragraphIndex) ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        this.paragraphBidi.set(paragraphIndex, bidi);
        this.bidiProcessedParagraphs[paragraphIndex] = true;
        if (bidi != null) {
            char[] cArr3 = this.tmpBuffer;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.tmpBuffer = cArr2;
        return bidi;
    }

    public final float c(int offset, boolean usePrimaryDirection, boolean upstream) {
        int iK = offset;
        if (!upstream) {
            return b(offset, usePrimaryDirection);
        }
        int iA = q.a(this.layout, iK, upstream);
        int lineStart = this.layout.getLineStart(iA);
        int lineEnd = this.layout.getLineEnd(iA);
        if (iK != lineStart && iK != lineEnd) {
            return b(offset, usePrimaryDirection);
        }
        if (iK == 0 || iK == this.layout.getText().length()) {
            return b(offset, usePrimaryDirection);
        }
        int iF = f(iK, upstream);
        boolean zJ = j(iF);
        int iK2 = k(lineEnd, lineStart);
        int iH = h(iF);
        int i15 = lineStart - iH;
        int i16 = iK2 - iH;
        Bidi bidiA = a(iF);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i15, i16) : null;
        boolean z15 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (usePrimaryDirection || zJ == zIsRtlCharAt) {
                zJ = !zJ;
            }
            if (iK == lineStart) {
                z15 = zJ;
            } else if (!zJ) {
                z15 = true;
            }
            Layout layout = this.layout;
            return z15 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i17 = 0; i17 < runCount; i17++) {
            bidiRunArr[i17] = new BidiRun(bidiCreateLineBidi.getRunStart(i17) + lineStart, bidiCreateLineBidi.getRunLimit(i17) + lineStart, bidiCreateLineBidi.getRunLevel(i17) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i18 = 0; i18 < runCount2; i18++) {
            bArr[i18] = (byte) bidiCreateLineBidi.getRunLevel(i18);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i19 = -1;
        if (iK == lineStart) {
            for (int i25 = 0; i25 < runCount; i25++) {
                if (bidiRunArr[i25].getStart() == iK) {
                    i19 = i25;
                    break;
                }
            }
            BidiRun bidiRun = bidiRunArr[i19];
            if (usePrimaryDirection || zJ == bidiRun.getIsRtl()) {
                zJ = !zJ;
            }
            if (i19 == 0 && zJ) {
                return this.layout.getLineLeft(iA);
            }
            if (i19 != pq.n.v0(bidiRunArr) || zJ) {
                return zJ ? this.layout.getPrimaryHorizontal(bidiRunArr[i19 - 1].getStart()) : this.layout.getPrimaryHorizontal(bidiRunArr[i19 + 1].getStart());
            }
            return this.layout.getLineRight(iA);
        }
        if (iK > iK2) {
            iK = k(iK, lineStart);
        }
        for (int i26 = 0; i26 < runCount; i26++) {
            if (bidiRunArr[i26].getEnd() == iK) {
                i19 = i26;
                break;
            }
        }
        BidiRun bidiRun2 = bidiRunArr[i19];
        if (!usePrimaryDirection && zJ != bidiRun2.getIsRtl()) {
            zJ = !zJ;
        }
        if (i19 == 0 && zJ) {
            return this.layout.getLineLeft(iA);
        }
        if (i19 != pq.n.v0(bidiRunArr) || zJ) {
            return zJ ? this.layout.getPrimaryHorizontal(bidiRunArr[i19 - 1].getEnd()) : this.layout.getPrimaryHorizontal(bidiRunArr[i19 + 1].getEnd());
        }
        return this.layout.getLineRight(iA);
    }

    public final BidiRun[] d(int lineIndex) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.layout.getLineStart(lineIndex);
        int lineEnd = this.layout.getLineEnd(lineIndex);
        int iG = g(this, lineStart, false, 2, null);
        int iH = h(iG);
        int i15 = lineStart - iH;
        int i16 = lineEnd - iH;
        Bidi bidiA = a(iG);
        if (bidiA == null || (bidiCreateLineBidi = bidiA.createLineBidi(i15, i16)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i17 = 0; i17 < runCount; i17++) {
            int runStart = bidiCreateLineBidi.getRunStart(i17) + lineStart;
            int runLimit = bidiCreateLineBidi.getRunLimit(i17) + lineStart;
            boolean z15 = true;
            if (bidiCreateLineBidi.getRunLevel(i17) % 2 != 1) {
                z15 = false;
            }
            bidiRunArr[i17] = new BidiRun(runStart, runLimit, z15);
        }
        return bidiRunArr;
    }

    public final int e(int lineIndex) {
        return k(this.layout.getLineEnd(lineIndex), this.layout.getLineStart(lineIndex));
    }

    public final int f(int offset, boolean upstream) {
        int iM = pq.v.m(this.paragraphEnds, Integer.valueOf(offset), 0, 0, 6, null);
        int i15 = iM < 0 ? -(iM + 1) : iM + 1;
        if (upstream && i15 > 0) {
            int i16 = i15 - 1;
            if (offset == this.paragraphEnds.get(i16).intValue()) {
                return i16;
            }
        }
        return i15;
    }

    public final int h(int paragraphIndex) {
        if (paragraphIndex == 0) {
            return 0;
        }
        return this.paragraphEnds.get(paragraphIndex - 1).intValue();
    }

    public final boolean i(char c15) {
        if (c15 == ' ' || c15 == '\n' || c15 == 5760) {
            return true;
        }
        return (fr.t.d(c15, PKIFailureInfo.certRevoked) >= 0 && fr.t.d(c15, 8202) <= 0 && c15 != 8199) || c15 == 8287 || c15 == 12288;
    }

    public final boolean j(int paragraphIndex) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(h(paragraphIndex))) == -1;
    }
}
