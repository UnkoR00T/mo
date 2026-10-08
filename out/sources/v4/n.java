package v4;

import p071kotlin.Metadata;
import q4.a4;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0080\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R*\u0010)\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010,\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R$\u0010/\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R$\u00101\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b0\u0010&R\u0016\u00103\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u00102R\u0014\u0010\u0005\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R$\u00106\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\u0014\u0010:\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010&¨\u0006;"}, d2 = {"Lv4/n;", "", "Lq4/e;", "text", "Lq4/z3;", "selection", "<init>", "(Lq4/e;JLfr/k;)V", "", "l", "()Z", "", "index", "", "c", "(I)C", "start", "end", "", "Loq/i0;", "m", "(IILjava/lang/String;)V", "b", "(II)V", "p", "n", "a", "()V", "toString", "()Ljava/lang/String;", "s", "()Lq4/e;", "Lv4/j0;", "Lv4/j0;", "gapBuffer", "value", "I", "k", "()I", "r", "(I)V", "selectionStart", "j", "q", "selectionEnd", "d", "f", "compositionStart", "e", "compositionEnd", "()Lq4/z3;", "composition", "i", "()J", "cursor", "g", "o", "h", "length", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f203677g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0 gapBuffer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int selectionStart;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int selectionEnd;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int compositionStart;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int compositionEnd;

    public /* synthetic */ n(q4.e eVar, long j15, fr.k kVar) {
        this(eVar, j15);
    }

    private final void q(int i15) {
        if (!(i15 >= 0)) {
            w4.a.a("Cannot set selectionEnd to a negative value: " + i15);
        }
        this.selectionEnd = i15;
    }

    private final void r(int i15) {
        if (!(i15 >= 0)) {
            w4.a.a("Cannot set selectionStart to a negative value: " + i15);
        }
        this.selectionStart = i15;
    }

    public final void a() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void b(int start, int end) {
        long jB = a4.b(start, end);
        this.gapBuffer.c(start, end, "");
        long jA = o.a(a4.b(this.selectionStart, this.selectionEnd), jB);
        r(z3.l(jA));
        q(z3.k(jA));
        if (l()) {
            long jA2 = o.a(a4.b(this.compositionStart, this.compositionEnd), jB);
            if (z3.h(jA2)) {
                a();
            } else {
                this.compositionStart = z3.l(jA2);
                this.compositionEnd = z3.k(jA2);
            }
        }
    }

    public final char c(int index) {
        return this.gapBuffer.a(index);
    }

    public final z3 d() {
        if (l()) {
            return z3.b(a4.b(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int g() {
        int i15 = this.selectionStart;
        int i16 = this.selectionEnd;
        if (i15 == i16) {
            return i16;
        }
        return -1;
    }

    public final int h() {
        return this.gapBuffer.b();
    }

    public final long i() {
        return a4.b(this.selectionStart, this.selectionEnd);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean l() {
        return this.compositionStart != -1;
    }

    public final void m(int start, int end, String text) {
        if (start < 0 || start > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (start <= end) {
            this.gapBuffer.c(start, end, text);
            r(text.length() + start);
            q(start + text.length());
            this.compositionStart = -1;
            this.compositionEnd = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
    }

    public final void n(int start, int end) {
        if (start < 0 || start > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (start < end) {
            this.compositionStart = start;
            this.compositionEnd = end;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
    }

    public final void o(int i15) {
        p(i15, i15);
    }

    public final void p(int start, int end) {
        if (start < 0 || start > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (start <= end) {
            r(start);
            q(end);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q4.e s() {
        return new q4.e(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    private n(q4.e eVar, long j15) {
        this.gapBuffer = new j0(eVar.getText());
        this.selectionStart = z3.l(j15);
        this.selectionEnd = z3.k(j15);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iL = z3.l(j15);
        int iK = z3.k(j15);
        if (iL < 0 || iL > eVar.length()) {
            throw new IndexOutOfBoundsException("start (" + iL + ") offset is outside of text region " + eVar.length());
        }
        if (iK < 0 || iK > eVar.length()) {
            throw new IndexOutOfBoundsException("end (" + iK + ") offset is outside of text region " + eVar.length());
        }
        if (iL <= iK) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + iL + " > " + iK);
    }
}
