package z1;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p079n1.c4;
import p079n1.d4;
import q4.TextLayoutResult;
import q4.a4;
import q4.z3;
import z1.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000e\n\u0002\b\u0005\b!\u0018\u0000 e*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001%B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082\u0010¢\u0006\u0004\b\u001b\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u001f\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0017H\u0004¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0017H\u0004¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010\u0010J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010\u0010J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\u0010J\r\u00101\u001a\u00028\u0000¢\u0006\u0004\b1\u0010\u0010J!\u00104\u001a\u00028\u00002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'02¢\u0006\u0004\b4\u00105J!\u00106\u001a\u00028\u00002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'02¢\u0006\u0004\b6\u00105J\r\u00107\u001a\u00020\u0017¢\u0006\u0004\b7\u0010!J\r\u00108\u001a\u00020\u0017¢\u0006\u0004\b8\u0010!J\r\u00109\u001a\u00020\u0017¢\u0006\u0004\b9\u0010!J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010\u0010J\r\u0010;\u001a\u00028\u0000¢\u0006\u0004\b;\u0010\u0010J\r\u0010<\u001a\u00028\u0000¢\u0006\u0004\b<\u0010\u0010J\r\u0010=\u001a\u00028\u0000¢\u0006\u0004\b=\u0010\u0010J\u000f\u0010>\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b@\u0010?J\r\u0010A\u001a\u00028\u0000¢\u0006\u0004\bA\u0010\u0010J\r\u0010B\u001a\u00028\u0000¢\u0006\u0004\bB\u0010\u0010J\r\u0010C\u001a\u00028\u0000¢\u0006\u0004\bC\u0010\u0010J\r\u0010D\u001a\u00028\u0000¢\u0006\u0004\bD\u0010\u0010J\u000f\u0010E\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bE\u0010?J\r\u0010F\u001a\u00028\u0000¢\u0006\u0004\bF\u0010\u0010J\u000f\u0010G\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bG\u0010?J\r\u0010H\u001a\u00028\u0000¢\u0006\u0004\bH\u0010\u0010J\r\u0010I\u001a\u00028\u0000¢\u0006\u0004\bI\u0010\u0010J\r\u0010J\u001a\u00028\u0000¢\u0006\u0004\bJ\u0010\u0010J\r\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0001\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\bN\u0010OR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b6\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\"\u0010]\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00101\u001a\u0004\bZ\u0010O\"\u0004\b[\u0010\\R\"\u0010`\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010K\u001a\u0004\bV\u0010M\"\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lz1/m;", "T", "", "Lq4/e;", "originalText", "Lq4/z3;", "originalSelection", "Lq4/t3;", "layoutResult", "Lv4/i0;", "offsetMapping", "Lz1/d3;", "state", "<init>", "(Lq4/e;JLq4/t3;Lv4/i0;Lz1/d3;Lfr/k;)V", "G", "()Lz1/m;", ip.a.f96138c, "F", "I", "", "y", "()Z", "", "currentOffset", "n", "(Lq4/t3;I)I", "s", "j", "g", "linesAmount", "z", "W", "()I", "Y", "X", "offset", "a", "(I)I", "Loq/i0;", "U", "(I)V", "start", "end", "V", "(II)V", ip.a.f96137b, "d", "B", "J", "Lkotlin/Function1;", "or", "b", "(Ler/l;)Lz1/m;", "c", "r", "q", "l", "M", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "C", "K", "m", "()Ljava/lang/Integer;", "u", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "E", "R", "A", "i", "Q", "f", "N", "O", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "Lq4/e;", "getOriginalText", "()Lq4/e;", "getOriginalSelection-d9O1mEE", "()J", "Lq4/t3;", "getLayoutResult", "()Lq4/t3;", "Lv4/i0;", "p", "()Lv4/i0;", "e", "Lz1/d3;", "w", "()Lz1/d3;", "v", "setSelection-5zc-tL8", "(J)V", "selection", "setAnnotatedString", "(Lq4/e;)V", "annotatedString", "", "x", "()Ljava/lang/String;", "text", "h", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m<T extends m<T>> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f232121i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q4.e originalText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long originalSelection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v4.i0 offsetMapping;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d3 state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long selection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private q4.e annotatedString;

    public /* synthetic */ m(q4.e eVar, long j15, TextLayoutResult textLayoutResult, v4.i0 i0Var, d3 d3Var, fr.k kVar) {
        this(eVar, j15, textLayoutResult, i0Var, d3Var);
    }

    private final T D() {
        int iL;
        getState().b();
        if (x().length() > 0 && (iL = l()) != -1) {
            U(iL);
        }
        return this;
    }

    private final T F() {
        Integer numM;
        getState().b();
        if (x().length() > 0 && (numM = m()) != null) {
            U(numM.intValue());
        }
        return this;
    }

    private final T G() {
        int iQ;
        getState().b();
        if (x().length() > 0 && (iQ = q()) != -1) {
            U(iQ);
        }
        return this;
    }

    private final T I() {
        Integer numU;
        getState().b();
        if (x().length() > 0 && (numU = u()) != null) {
            U(numU.intValue());
        }
        return this;
    }

    private final int W() {
        return this.offsetMapping.e(z3.i(this.selection));
    }

    private final int X() {
        return this.offsetMapping.e(z3.k(this.selection));
    }

    private final int Y() {
        return this.offsetMapping.e(z3.l(this.selection));
    }

    private final int a(int offset) {
        return lr.m.j(offset, x().length() - 1);
    }

    private final int g(TextLayoutResult textLayoutResult, int i15) {
        return this.offsetMapping.b(textLayoutResult.o(textLayoutResult.q(i15), true));
    }

    static /* synthetic */ int h(m mVar, TextLayoutResult textLayoutResult, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i16 & 1) != 0) {
            i15 = mVar.X();
        }
        return mVar.g(textLayoutResult, i15);
    }

    private final int j(TextLayoutResult textLayoutResult, int i15) {
        return this.offsetMapping.b(textLayoutResult.u(textLayoutResult.q(i15)));
    }

    static /* synthetic */ int k(m mVar, TextLayoutResult textLayoutResult, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i16 & 1) != 0) {
            i15 = mVar.Y();
        }
        return mVar.j(textLayoutResult, i15);
    }

    private final int n(TextLayoutResult textLayoutResult, int i15) {
        while (i15 < this.originalText.length()) {
            long jC = textLayoutResult.C(a(i15));
            if (z3.i(jC) > i15) {
                return this.offsetMapping.b(z3.i(jC));
            }
            i15++;
        }
        return this.originalText.length();
    }

    static /* synthetic */ int o(m mVar, TextLayoutResult textLayoutResult, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i16 & 1) != 0) {
            i15 = mVar.W();
        }
        return mVar.n(textLayoutResult, i15);
    }

    private final int s(TextLayoutResult textLayoutResult, int i15) {
        while (i15 > 0) {
            long jC = textLayoutResult.C(a(i15));
            if (z3.n(jC) < i15) {
                return this.offsetMapping.b(z3.n(jC));
            }
            i15--;
        }
        return 0;
    }

    static /* synthetic */ int t(m mVar, TextLayoutResult textLayoutResult, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i16 & 1) != 0) {
            i15 = mVar.W();
        }
        return mVar.s(textLayoutResult, i15);
    }

    private final boolean y() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.y(W()) : null) != b5.i.Rtl;
    }

    private final int z(TextLayoutResult textLayoutResult, int i15) {
        int iW = W();
        if (this.state.getCachedX() == null) {
            this.state.c(Float.valueOf(textLayoutResult.e(iW).getLeft()));
        }
        int iQ = textLayoutResult.q(iW) + i15;
        if (iQ < 0) {
            return 0;
        }
        if (iQ >= textLayoutResult.n()) {
            return x().length();
        }
        float fM = textLayoutResult.m(iQ) - 1;
        Float cachedX = this.state.getCachedX();
        float fFloatValue = cachedX.floatValue();
        if ((y() && fFloatValue >= textLayoutResult.t(iQ)) || (!y() && fFloatValue <= textLayoutResult.s(iQ))) {
            return textLayoutResult.o(iQ, true);
        }
        return this.offsetMapping.b(textLayoutResult.x(m3.e.e((((long) Float.floatToRawIntBits(cachedX.floatValue())) << 32) | (((long) Float.floatToRawIntBits(fM)) & BodyPartID.bodyIdMax))));
    }

    public final T A() {
        TextLayoutResult textLayoutResult;
        if (x().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            U(z(textLayoutResult, 1));
        }
        return this;
    }

    public final T B() {
        getState().b();
        if (x().length() > 0) {
            if (y()) {
                G();
            } else {
                D();
            }
        }
        return this;
    }

    public final T C() {
        getState().b();
        if (x().length() > 0) {
            if (y()) {
                I();
            } else {
                F();
            }
        }
        return this;
    }

    public final T E() {
        getState().b();
        if (x().length() > 0) {
            int iA = c4.a(x(), z3.k(this.selection));
            if (iA == z3.k(this.selection) && iA != x().length()) {
                iA = c4.a(x(), iA + 1);
            }
            U(iA);
        }
        return this;
    }

    public final T H() {
        getState().b();
        if (x().length() > 0) {
            int iB = c4.b(x(), z3.l(this.selection));
            if (iB == z3.l(this.selection) && iB != 0) {
                iB = c4.b(x(), iB - 1);
            }
            U(iB);
        }
        return this;
    }

    public final T J() {
        getState().b();
        if (x().length() > 0) {
            if (y()) {
                D();
            } else {
                G();
            }
        }
        return this;
    }

    public final T K() {
        getState().b();
        if (x().length() > 0) {
            if (y()) {
                F();
            } else {
                I();
            }
        }
        return this;
    }

    public final T L() {
        getState().b();
        if (x().length() > 0) {
            U(x().length());
        }
        return this;
    }

    public final T M() {
        getState().b();
        if (x().length() > 0) {
            U(0);
        }
        return this;
    }

    public final T N() {
        Integer numF;
        getState().b();
        if (x().length() > 0 && (numF = f()) != null) {
            U(numF.intValue());
        }
        return this;
    }

    public final T O() {
        getState().b();
        if (x().length() > 0) {
            if (y()) {
                Q();
            } else {
                N();
            }
        }
        return this;
    }

    public final T P() {
        getState().b();
        if (x().length() > 0) {
            if (y()) {
                N();
            } else {
                Q();
            }
        }
        return this;
    }

    public final T Q() {
        Integer numI;
        getState().b();
        if (x().length() > 0 && (numI = i()) != null) {
            U(numI.intValue());
        }
        return this;
    }

    public final T R() {
        TextLayoutResult textLayoutResult;
        if (x().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            U(z(textLayoutResult, -1));
        }
        return this;
    }

    public final T S() {
        getState().b();
        if (x().length() > 0) {
            V(0, x().length());
        }
        return this;
    }

    public final T T() {
        if (x().length() > 0) {
            this.selection = a4.b(z3.n(this.originalSelection), z3.i(this.selection));
        }
        return this;
    }

    protected final void U(int offset) {
        V(offset, offset);
    }

    protected final void V(int start, int end) {
        this.selection = a4.b(start, end);
    }

    public final T b(er.l<? super T, oq.i0> or4) {
        getState().b();
        if (x().length() > 0) {
            if (z3.h(this.selection)) {
                or4.b(this);
            } else if (y()) {
                U(z3.l(this.selection));
            } else {
                U(z3.k(this.selection));
            }
        }
        return this;
    }

    public final T c(er.l<? super T, oq.i0> or4) {
        getState().b();
        if (x().length() > 0) {
            if (z3.h(this.selection)) {
                or4.b(this);
            } else if (y()) {
                U(z3.k(this.selection));
            } else {
                U(z3.l(this.selection));
            }
        }
        return this;
    }

    public final T d() {
        getState().b();
        if (x().length() > 0) {
            U(z3.i(this.selection));
        }
        return this;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final q4.e getAnnotatedString() {
        return this.annotatedString;
    }

    public final Integer f() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(h(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer i() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(k(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final int l() {
        return d4.c(this.annotatedString.getText(), z3.i(this.selection));
    }

    public final Integer m() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(o(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final v4.i0 getOffsetMapping() {
        return this.offsetMapping;
    }

    public final int q() {
        return d4.d(this.annotatedString.getText(), z3.i(this.selection));
    }

    public final int r() {
        return d4.b(this.annotatedString.getText(), z3.i(this.selection), -1);
    }

    public final Integer u() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(t(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final d3 getState() {
        return this.state;
    }

    public final String x() {
        return this.annotatedString.getText();
    }

    private m(q4.e eVar, long j15, TextLayoutResult textLayoutResult, v4.i0 i0Var, d3 d3Var) {
        this.originalText = eVar;
        this.originalSelection = j15;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = i0Var;
        this.state = d3Var;
        this.selection = j15;
        this.annotatedString = eVar;
    }
}
