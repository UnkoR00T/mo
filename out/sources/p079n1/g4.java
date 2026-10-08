package p079n1;

import b5.TextGeometricTransform;
import b5.a;
import b5.k;
import fr.l0;
import fr.t;
import n3.Shadow;
import p071kotlin.Metadata;
import p3.g;
import q4.SpanStyle;
import q4.e;
import q4.j0;
import q4.m;
import u4.FontWeight;
import u4.l;
import u4.y;
import u4.z;
import x4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005¨\u0006\u0014"}, d2 = {"Ln1/g4;", "", "Lq4/e;", "initialText", "<init>", "(Lq4/e;)V", "Lq4/e$d;", "Lq4/m;", "linkRange", "Lq4/h3;", "newStyle", "Loq/i0;", "c", "(Lq4/e$d;Lq4/h3;)V", "a", "Lq4/e;", "b", "()Lq4/e;", "setStyledText", "styledText", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e initialText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private e styledText;

    public g4(e eVar) {
        this.initialText = eVar;
        this.styledText = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.Range d(l0 l0Var, e.Range range, SpanStyle spanStyle, e.Range range2) {
        e.Range range3;
        e.Range range4;
        if (l0Var.f66404a && (range2.g() instanceof SpanStyle) && range2.h() == range.h() && range2.f() == range.f()) {
            range3 = new e.Range(spanStyle == null ? new SpanStyle(0L, 0L, (FontWeight) null, (y) null, (z) null, (l) null, (String) null, 0L, (a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (j0) null, (g) null, 65535, (fr.k) null) : spanStyle, range2.h(), range2.f());
            range4 = range2;
        } else {
            range3 = range2;
            range4 = range3;
        }
        l0Var.f66404a = t.c(range, range4);
        return range3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getStyledText() {
        return this.styledText;
    }

    public final void c(final e.Range<m> linkRange, final SpanStyle newStyle) {
        final l0 l0Var = new l0();
        this.styledText = this.initialText.q(new er.l() { // from class: n1.f4
            @Override // er.l
            public final Object b(Object obj) {
                return g4.d(l0Var, linkRange, newStyle, (e.Range) obj);
            }
        });
    }
}
