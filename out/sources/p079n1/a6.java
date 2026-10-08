package p079n1;

import b3.b;
import b3.b0;
import b3.x;
import er.l;
import er.p;
import fr.k;
import java.util.List;
import lr.m;
import m3.g;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.m5;
import p076m2.x2;
import p076m2.x3;
import p076m2.x5;
import p076m2.y2;
import p143z0.a2;
import pq.v;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R+\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R+\u0010,\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00106\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R+\u0010\t\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Ln1/a6;", "", "Lz0/a2;", "initialOrientation", "", "initial", "<init>", "(Lz0/a2;F)V", "()V", "orientation", "Lm3/g;", "cursorRect", "", "containerSize", "textFieldSize", "Loq/i0;", "o", "(Lz0/a2;Lm3/g;II)V", "cursorStart", "cursorEnd", "f", "(FFI)V", "Lq4/z3;", "selection", "i", "(J)I", "<set-?>", "a", "Lm2/x2;", "h", "()F", "l", "(F)V", "offset", "b", "g", "k", "maximum", "c", "Lm2/y2;", "getViewportSize", "()I", "n", "(I)V", "viewportSize", "d", "Lm3/g;", "previousCursorRect", "e", "J", "getPreviousSelection-d9O1mEE", "()J", "m", "(J)V", "previousSelection", "Lm2/a3;", "j", "()Lz0/a2;", "setOrientation", "(Lz0/a2;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final x<a6, Object> f129901h = b.b(new p() { // from class: n1.y5
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return a6.c((b0) obj, (a6) obj2);
        }
    }, new l() { // from class: n1.z5
        @Override // er.l
        public final Object b(Object obj) {
            return a6.d((List) obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x2 offset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x2 maximum;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y2 viewportSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private g previousCursorRect;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long previousSelection;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3 orientation;

    /* JADX INFO: renamed from: n1.a6$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln1/a6$a;", "", "<init>", "()V", "Lb3/x;", "Ln1/a6;", "Saver", "Lb3/x;", "a", "()Lb3/x;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final x<a6, Object> a() {
            return a6.f129901h;
        }

        private Companion() {
        }
    }

    public a6(a2 a2Var, float f15) {
        this.offset = x3.a(f15);
        this.maximum = x3.a(0.0f);
        this.viewportSize = m5.a(0);
        this.previousCursorRect = g.INSTANCE.a();
        this.previousSelection = z3.INSTANCE.a();
        this.orientation = x5.i(a2Var, x5.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(b0 b0Var, a6 a6Var) {
        return v.q(Float.valueOf(a6Var.h()), Boolean.valueOf(a6Var.j() == a2.Vertical));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a6 d(List list) {
        return new a6(((Boolean) list.get(1)).booleanValue() ? a2.Vertical : a2.Horizontal, ((Float) list.get(0)).floatValue());
    }

    private final void k(float f15) {
        this.maximum.p(f15);
    }

    private final void n(int i15) {
        this.viewportSize.g(i15);
    }

    public final void f(float cursorStart, float cursorEnd, int containerSize) {
        float f15;
        float fH = h();
        float f16 = containerSize;
        float f17 = fH + f16;
        if (cursorEnd <= f17 && (cursorStart >= fH || cursorEnd - cursorStart <= f16)) {
            f15 = (cursorStart >= fH || cursorEnd - cursorStart > f16) ? 0.0f : cursorStart - fH;
        } else {
            f15 = cursorEnd - f17;
        }
        l(h() + f15);
    }

    public final float g() {
        return this.maximum.a();
    }

    public final float h() {
        return this.offset.a();
    }

    public final int i(long selection) {
        if (z3.n(selection) != z3.n(this.previousSelection)) {
            return z3.n(selection);
        }
        return z3.i(selection) != z3.i(this.previousSelection) ? z3.i(selection) : z3.l(selection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a2 j() {
        return (a2) this.orientation.getValue();
    }

    public final void l(float f15) {
        this.offset.p(f15);
    }

    public final void m(long j15) {
        this.previousSelection = j15;
    }

    public final void o(a2 orientation, g cursorRect, int containerSize, int textFieldSize) {
        float f15 = textFieldSize - containerSize;
        k(f15);
        if (cursorRect.getLeft() != this.previousCursorRect.getLeft() || cursorRect.getTop() != this.previousCursorRect.getTop()) {
            boolean z15 = orientation == a2.Vertical;
            f(z15 ? cursorRect.getTop() : cursorRect.getLeft(), z15 ? cursorRect.getBottom() : cursorRect.getRight(), containerSize);
            this.previousCursorRect = cursorRect;
        }
        l(m.m(h(), 0.0f, f15));
        n(containerSize);
    }

    public /* synthetic */ a6(a2 a2Var, float f15, int i15, k kVar) {
        this(a2Var, (i15 & 2) != 0 ? 0.0f : f15);
    }

    public a6() {
        this(a2.Vertical, 0.0f, 2, null);
    }
}
