package q4;

import java.util.ArrayList;
import java.util.List;
import n3.Shadow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJM\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 JU\u0010%\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020#¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J%\u0010:\u001a\u0002092\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u0002032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b<\u0010=J'\u0010B\u001a\u00020?2\u0006\u0010>\u001a\u0002092\u0006\u0010@\u001a\u00020?2\b\b\u0001\u0010A\u001a\u00020\u0006¢\u0006\u0004\bB\u0010CJ\u001d\u0010F\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020H2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020H2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bK\u0010JJ\u0015\u0010L\u001a\u0002092\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u0002032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bN\u0010=J\u0015\u0010O\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bS\u0010RJ\u0015\u0010T\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bT\u0010RJ\u0015\u0010U\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bU\u0010RJ\u0015\u0010V\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bV\u0010RJ\u0015\u0010W\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bW\u0010PJ\u001f\u0010Y\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020D¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\u00020D2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b[\u0010\\R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\ba\u0010L\u001a\u0004\bb\u0010cR\u0017\u0010g\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bB\u0010d\u001a\u0004\be\u0010fR\u0017\u0010l\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010o\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bm\u0010i\u001a\u0004\bn\u0010kR\u0017\u0010q\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bp\u0010cR\u001f\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030r8\u0006¢\u0006\f\n\u0004\b<\u0010s\u001a\u0004\bi\u0010tR \u0010x\u001a\b\u0012\u0004\u0012\u00020v0r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010s\u001a\u0004\bw\u0010tR\u0014\u0010{\u001a\u00020y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010zR\u0011\u0010}\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b|\u0010kR\u0011\u0010\u007f\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b~\u0010k¨\u0006\u0080\u0001"}, d2 = {"Lq4/q;", "", "Lq4/t;", "intrinsics", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "", "maxLines", "Lb5/v;", "overflow", "<init>", "(Lq4/t;JIILfr/k;)V", "offset", "Loq/i0;", "O", "(I)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "lineIndex", "Q", "Ln3/h1;", "canvas", "Landroidx/compose/ui/graphics/Color;", "color", "Ln3/w2;", "shadow", "Lb5/k;", "decoration", "Lp3/g;", "drawStyle", "Ln3/a1;", "blendMode", "K", "(Ln3/h1;JLn3/w2;Lb5/k;Lp3/g;I)V", "Landroidx/compose/ui/graphics/c;", "brush", "", "alpha", "M", "(Ln3/h1;Landroidx/compose/ui/graphics/c;FLn3/w2;Lb5/k;Lp3/g;I)V", "start", "end", "Ln3/m2;", ip.a.f96138c, "(II)Ln3/m2;", "vertical", "t", "(F)I", "Lm3/e;", "position", "A", "(J)I", "Lm3/g;", "rect", "Lq4/m3;", "granularity", "Lq4/q3;", "inclusionStrategy", "Lq4/z3;", "G", "(Lm3/g;ILq4/q3;)J", "g", "(I)Lm3/g;", "range", "", "array", "arrayStart", "c", "(J[FI)[F", "", "usePrimaryDirection", "l", "(IZ)F", "Lb5/i;", "B", "(I)Lb5/i;", "f", "I", "(I)J", "h", "s", "(I)I", "v", "(I)F", "w", "y", "o", "u", "x", "visibleEnd", "q", "(IZ)I", "J", "(I)Z", "a", "Lq4/t;", "m", "()Lq4/t;", "b", "z", "()I", "Z", "i", "()Z", "didExceedMaxLines", "d", "F", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()F", "width", "e", "k", "height", "p", "lineCount", "", "Ljava/util/List;", "()Ljava/util/List;", "placeholderRects", "Lq4/z;", "C", "paragraphInfoList", "Lq4/e;", "()Lq4/e;", "annotatedString", "j", "firstBaseline", "n", "lastBaseline", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t intrinsics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int lineCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<m3.g> placeholderRects;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<ParagraphInfo> paragraphInfoList;

    public /* synthetic */ q(t tVar, long j15, int i15, int i16, fr.k kVar) {
        this(tVar, j15, i15, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(n3.m2 m2Var, int i15, int i16, ParagraphInfo paragraphInfo) {
        n3.m2.g(m2Var, paragraphInfo.j(paragraphInfo.getParagraph().t(paragraphInfo.r(i15), paragraphInfo.r(i16))), 0L, 2, null);
        return oq.i0.f148189a;
    }

    public static /* synthetic */ void N(q qVar, n3.h1 h1Var, androidx.compose.ui.graphics.c cVar, float f15, Shadow w2Var, b5.k kVar, p3.g gVar, int i15, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            f15 = Float.NaN;
        }
        qVar.M(h1Var, cVar, f15, (i16 & 8) != 0 ? null : w2Var, (i16 & 16) != 0 ? null : kVar, (i16 & 32) != 0 ? null : gVar, (i16 & 64) != 0 ? p3.f.INSTANCE.a() : i15);
    }

    private final void O(int offset) {
        boolean z15 = false;
        if (offset >= 0 && offset < e().getText().length()) {
            z15 = true;
        }
        if (z15) {
            return;
        }
        w4.a.a("offset(" + offset + ") is out of bounds [0, " + e().length() + ')');
    }

    private final void P(int offset) {
        boolean z15 = false;
        if (offset >= 0 && offset <= e().getText().length()) {
            z15 = true;
        }
        if (z15) {
            return;
        }
        w4.a.a("offset(" + offset + ") is out of bounds [0, " + e().length() + ']');
    }

    private final void Q(int lineIndex) {
        boolean z15 = false;
        if (lineIndex >= 0 && lineIndex < this.lineCount) {
            z15 = true;
        }
        if (z15) {
            return;
        }
        w4.a.a("lineIndex(" + lineIndex + ") is out of bounds [0, " + this.lineCount + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(long j15, float[] fArr, fr.n0 n0Var, fr.m0 m0Var, ParagraphInfo paragraphInfo) {
        long jB = a4.b(paragraphInfo.r(paragraphInfo.getStartIndex() > z3.l(j15) ? paragraphInfo.getStartIndex() : z3.l(j15)), paragraphInfo.r(paragraphInfo.getEndIndex() < z3.k(j15) ? paragraphInfo.getEndIndex() : z3.k(j15)));
        paragraphInfo.getParagraph().x(jB, fArr, n0Var.f66407a);
        int iJ = n0Var.f66407a + (z3.j(jB) * 4);
        for (int i15 = n0Var.f66407a; i15 < iJ; i15 += 4) {
            int i16 = i15 + 1;
            float f15 = fArr[i16];
            float f16 = m0Var.f66406a;
            fArr[i16] = f15 + f16;
            int i17 = i15 + 3;
            fArr[i17] = fArr[i17] + f16;
        }
        n0Var.f66407a = iJ;
        m0Var.f66406a += paragraphInfo.getParagraph().getHeight();
        return oq.i0.f148189a;
    }

    private final e e() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int r(q qVar, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            z15 = false;
        }
        return qVar.q(i15, z15);
    }

    public final int A(long position) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(w.e(this.paragraphInfoList, Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & position))));
        return paragraphInfo.d() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.m(paragraphInfo.getParagraph().k(paragraphInfo.q(position)));
    }

    public final b5.i B(int offset) {
        P(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == e().length() ? pq.v.p(this.paragraphInfoList) : w.b(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().g(paragraphInfo.r(offset));
    }

    public final List<ParagraphInfo> C() {
        return this.paragraphInfoList;
    }

    public final n3.m2 D(final int start, final int end) {
        if (!(start >= 0 && start <= end && end <= e().getText().length())) {
            w4.a.a("Start(" + start + ") or End(" + end + ") is out of range [0.." + e().getText().length() + "), or start > end!");
        }
        if (start == end) {
            return n3.u0.a();
        }
        final n3.m2 m2VarA = n3.u0.a();
        w.f(this.paragraphInfoList, a4.b(start, end), new er.l() { // from class: q4.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.E(m2VarA, start, end, (ParagraphInfo) obj);
            }
        });
        return m2VarA;
    }

    public final List<m3.g> F() {
        return this.placeholderRects;
    }

    public final long G(m3.g rect, int granularity, q3 inclusionStrategy) {
        z3.Companion companion;
        z3.Companion companion2;
        int iE = w.e(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(iE).getBottom() >= rect.getBottom() || iE == pq.v.p(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iE);
            return ParagraphInfo.l(paragraphInfo, paragraphInfo.getParagraph().q(paragraphInfo.p(rect), granularity, inclusionStrategy), false, 1, null);
        }
        int iE2 = w.e(this.paragraphInfoList, rect.getBottom());
        long jA = z3.INSTANCE.a();
        while (true) {
            companion = z3.INSTANCE;
            if (!z3.g(jA, companion.a()) || iE > iE2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iE);
            jA = ParagraphInfo.l(paragraphInfo2, paragraphInfo2.getParagraph().q(paragraphInfo2.p(rect), granularity, inclusionStrategy), false, 1, null);
            iE++;
        }
        if (z3.g(jA, companion.a())) {
            return companion.a();
        }
        long jA2 = companion.a();
        while (true) {
            companion2 = z3.INSTANCE;
            if (!z3.g(jA2, companion2.a()) || iE > iE2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iE2);
            jA2 = ParagraphInfo.l(paragraphInfo3, paragraphInfo3.getParagraph().q(paragraphInfo3.p(rect), granularity, inclusionStrategy), false, 1, null);
            iE2--;
        }
        return z3.g(jA2, companion2.a()) ? jA : a4.b(z3.n(jA), z3.i(jA2));
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final long I(int offset) {
        P(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == e().length() ? pq.v.p(this.paragraphInfoList) : w.b(this.paragraphInfoList, offset));
        return paragraphInfo.k(paragraphInfo.getParagraph().i(paragraphInfo.r(offset)), false);
    }

    public final boolean J(int lineIndex) {
        Q(lineIndex);
        return this.paragraphInfoList.get(w.d(this.paragraphInfoList, lineIndex)).getParagraph().m(lineIndex);
    }

    public final void K(n3.h1 canvas, long color, Shadow shadow, b5.k decoration, p3.g drawStyle, int blendMode) {
        canvas.q();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            ParagraphInfo paragraphInfo = list.get(i15);
            paragraphInfo.getParagraph().w(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.d(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.j();
    }

    public final void M(n3.h1 canvas, androidx.compose.ui.graphics.c brush, float alpha, Shadow shadow, b5.k decoration, p3.g drawStyle, int blendMode) {
        y4.b.a(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public final float[] c(final long range, final float[] array, int arrayStart) {
        O(z3.l(range));
        P(z3.k(range));
        final fr.n0 n0Var = new fr.n0();
        n0Var.f66407a = arrayStart;
        final fr.m0 m0Var = new fr.m0();
        w.f(this.paragraphInfoList, range, new er.l() { // from class: q4.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.d(range, array, n0Var, m0Var, (ParagraphInfo) obj);
            }
        });
        return array;
    }

    public final b5.i f(int offset) {
        P(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == e().length() ? pq.v.p(this.paragraphInfoList) : w.b(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().B(paragraphInfo.r(offset));
    }

    public final m3.g g(int offset) {
        O(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(w.b(this.paragraphInfoList, offset));
        return paragraphInfo.i(paragraphInfo.getParagraph().C(paragraphInfo.r(offset)));
    }

    public final m3.g h(int offset) {
        P(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == e().length() ? pq.v.p(this.paragraphInfoList) : w.b(this.paragraphInfoList, offset));
        return paragraphInfo.i(paragraphInfo.getParagraph().h(paragraphInfo.r(offset)));
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float j() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().j();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    public final float l(int offset, boolean usePrimaryDirection) {
        P(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == e().length() ? pq.v.p(this.paragraphInfoList) : w.b(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().u(paragraphInfo.r(offset), usePrimaryDirection);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final t getIntrinsics() {
        return this.intrinsics;
    }

    public final float n() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) pq.v.x0(this.paragraphInfoList);
        return paragraphInfo.o(paragraphInfo.getParagraph().y());
    }

    public final float o(int lineIndex) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(w.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.o(paragraphInfo.getParagraph().e(paragraphInfo.s(lineIndex)));
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int q(int lineIndex, boolean visibleEnd) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(w.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.m(paragraphInfo.getParagraph().n(paragraphInfo.s(lineIndex), visibleEnd));
    }

    public final int s(int offset) {
        int iB;
        if (offset >= e().length()) {
            iB = pq.v.p(this.paragraphInfoList);
        } else {
            iB = offset < 0 ? 0 : w.b(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iB);
        return paragraphInfo.n(paragraphInfo.getParagraph().z(paragraphInfo.r(offset)));
    }

    public final int t(float vertical) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(w.e(this.paragraphInfoList, vertical));
        return paragraphInfo.d() == 0 ? paragraphInfo.getStartLineIndex() : paragraphInfo.n(paragraphInfo.getParagraph().s(paragraphInfo.t(vertical)));
    }

    public final float u(int lineIndex) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(w.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().p(paragraphInfo.s(lineIndex));
    }

    public final float v(int lineIndex) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(w.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().v(paragraphInfo.s(lineIndex));
    }

    public final float w(int lineIndex) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(w.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().o(paragraphInfo.s(lineIndex));
    }

    public final int x(int lineIndex) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(w.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.m(paragraphInfo.getParagraph().b(paragraphInfo.s(lineIndex)));
    }

    public final float y(int lineIndex) {
        Q(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(w.d(this.paragraphInfoList, lineIndex));
        return paragraphInfo.o(paragraphInfo.getParagraph().a(paragraphInfo.s(lineIndex)));
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    private q(t tVar, long j15, int i15, int i16) {
        this.intrinsics = tVar;
        this.maxLines = i15;
        boolean z15 = true;
        if (!(c5.b.n(j15) == 0 && c5.b.m(j15) == 0)) {
            w4.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> listH = tVar.h();
        int size = listH.size();
        int i17 = 0;
        float f15 = 0.0f;
        int i18 = 0;
        while (true) {
            if (i18 >= size) {
                z15 = false;
                break;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = listH.get(i18);
            y yVarC = d0.c(paragraphIntrinsicInfo.getIntrinsics(), c5.c.b(0, c5.b.l(j15), 0, c5.b.g(j15) ? lr.m.e(c5.b.k(j15) - d0.d(f15), 0) : c5.b.k(j15), 5, null), this.maxLines - i17, i16);
            float height = f15 + yVarC.getHeight();
            int iC = i17 + yVarC.c();
            arrayList.add(new ParagraphInfo(yVarC, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i17, iC, f15, height));
            if (yVarC.r() || (iC == this.maxLines && i18 != pq.v.p(this.intrinsics.h()))) {
                i17 = iC;
                f15 = height;
                break;
            } else {
                i18++;
                i17 = iC;
                f15 = height;
            }
        }
        this.height = f15;
        this.lineCount = i17;
        this.didExceedMaxLines = z15;
        this.paragraphInfoList = arrayList;
        this.width = c5.b.l(j15);
        List<m3.g> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        for (int i19 = 0; i19 < size2; i19++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i19);
            List<m3.g> listD = paragraphInfo.getParagraph().D();
            ArrayList arrayList3 = new ArrayList(listD.size());
            int size3 = listD.size();
            for (int i25 = 0; i25 < size3; i25++) {
                m3.g gVar = listD.get(i25);
                arrayList3.add(gVar != null ? paragraphInfo.i(gVar) : null);
            }
            pq.v.D(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.i().size()) {
            int size4 = this.intrinsics.i().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i26 = 0; i26 < size4; i26++) {
                arrayList4.add(null);
            }
            arrayList2 = pq.v.L0(arrayList2, arrayList4);
        }
        this.placeholderRects = arrayList2;
    }
}
