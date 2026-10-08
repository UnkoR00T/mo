package q4;

import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: q4.t3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\rJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b%\u0010$J\u0015\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b0\u0010,J\u001d\u00104\u001a\u0002032\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n¢\u0006\u0004\b4\u00105J!\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010M\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b+\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010O\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b0\u0010J\u001a\u0004\bN\u0010LR\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bQ\u0010VR\u0011\u0010Y\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0011\u0010[\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bZ\u0010VR\u0011\u0010]\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\\\u0010<¨\u0006^"}, d2 = {"Lq4/t3;", "", "Lq4/s3;", "layoutInput", "Lq4/q;", "multiParagraph", "Lc5/r;", "size", "<init>", "(Lq4/s3;Lq4/q;JLfr/k;)V", "", "lineIndex", "u", "(I)I", "", "visibleEnd", "o", "(IZ)I", ip.a.f96138c, "(I)Z", "", "v", "(I)F", "m", "s", "t", "offset", "q", "vertical", "r", "(F)I", "usePrimaryDirection", "j", "(IZ)F", "Lb5/i;", "y", "(I)Lb5/i;", "c", "Lm3/e;", "position", "x", "(J)I", "Lm3/g;", "d", "(I)Lm3/g;", "Lq4/z3;", "C", "(I)J", "e", "start", "end", "Ln3/m2;", "z", "(II)Ln3/m2;", "a", "(Lq4/s3;J)Lq4/t3;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lq4/s3;", "l", "()Lq4/s3;", "b", "Lq4/q;", "w", "()Lq4/q;", "J", "B", "()J", "F", "h", "()F", "firstBaseline", "k", "lastBaseline", "", "f", "Ljava/util/List;", "A", "()Ljava/util/List;", "placeholderRects", "()Z", "didOverflowHeight", "g", "didOverflowWidth", "i", "hasVisualOverflow", "n", "lineCount", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextLayoutResult {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f164599g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextLayoutInput layoutInput;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q multiParagraph;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long size;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float firstBaseline;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float lastBaseline;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<m3.g> placeholderRects;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, q qVar, long j15, fr.k kVar) {
        this(textLayoutInput, qVar, j15);
    }

    public static /* synthetic */ TextLayoutResult b(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i15 & 2) != 0) {
            j15 = textLayoutResult.size;
        }
        return textLayoutResult.a(textLayoutInput, j15);
    }

    public static /* synthetic */ int p(TextLayoutResult textLayoutResult, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            z15 = false;
        }
        return textLayoutResult.o(i15, z15);
    }

    public final List<m3.g> A() {
        return this.placeholderRects;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final long C(int offset) {
        return this.multiParagraph.I(offset);
    }

    public final boolean D(int lineIndex) {
        return this.multiParagraph.J(lineIndex);
    }

    public final TextLayoutResult a(TextLayoutInput layoutInput, long size) {
        return new TextLayoutResult(layoutInput, this.multiParagraph, size, null);
    }

    public final b5.i c(int offset) {
        return this.multiParagraph.f(offset);
    }

    public final m3.g d(int offset) {
        return this.multiParagraph.g(offset);
    }

    public final m3.g e(int offset) {
        return this.multiParagraph.h(offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) other;
        return fr.t.c(this.layoutInput, textLayoutResult.layoutInput) && fr.t.c(this.multiParagraph, textLayoutResult.multiParagraph) && c5.r.e(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && fr.t.c(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    public final boolean f() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) ((int) (this.size & BodyPartID.bodyIdMax))) < this.multiParagraph.getHeight();
    }

    public final boolean g() {
        return ((float) ((int) (this.size >> 32))) < this.multiParagraph.getWidth();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + c5.r.h(this.size)) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int offset, boolean usePrimaryDirection) {
        return this.multiParagraph.l(offset, usePrimaryDirection);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float m(int lineIndex) {
        return this.multiParagraph.o(lineIndex);
    }

    public final int n() {
        return this.multiParagraph.getLineCount();
    }

    public final int o(int lineIndex, boolean visibleEnd) {
        return this.multiParagraph.q(lineIndex, visibleEnd);
    }

    public final int q(int offset) {
        return this.multiParagraph.s(offset);
    }

    public final int r(float vertical) {
        return this.multiParagraph.t(vertical);
    }

    public final float s(int lineIndex) {
        return this.multiParagraph.v(lineIndex);
    }

    public final float t(int lineIndex) {
        return this.multiParagraph.w(lineIndex);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) c5.r.i(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    public final int u(int lineIndex) {
        return this.multiParagraph.x(lineIndex);
    }

    public final float v(int lineIndex) {
        return this.multiParagraph.y(lineIndex);
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final q getMultiParagraph() {
        return this.multiParagraph;
    }

    public final int x(long position) {
        return this.multiParagraph.A(position);
    }

    public final b5.i y(int offset) {
        return this.multiParagraph.B(offset);
    }

    public final n3.m2 z(int start, int end) {
        return this.multiParagraph.D(start, end);
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, q qVar, long j15) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = qVar;
        this.size = j15;
        this.firstBaseline = qVar.j();
        this.lastBaseline = qVar.n();
        this.placeholderRects = qVar.F();
    }
}
