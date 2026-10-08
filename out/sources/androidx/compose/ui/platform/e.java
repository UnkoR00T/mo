package androidx.compose.ui.platform;

import p071kotlin.Metadata;
import q4.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/e;", "Landroidx/compose/ui/platform/c;", "<init>", "()V", "", "lineNumber", "Lb5/i;", "direction", "i", "(ILb5/i;)I", "", "text", "Lq4/t3;", "layoutResult", "Loq/i0;", "j", "(Ljava/lang/String;Lq4/t3;)V", "current", "", "a", "(I)[I", "b", "c", "Lq4/t3;", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static e f10452f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f10451e = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b5.i f10453g = b5.i.Rtl;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b5.i f10454h = b5.i.Ltr;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/e$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/e;", "a", "()Landroidx/compose/ui/platform/e;", "lineInstance", "Landroidx/compose/ui/platform/e;", "Lb5/i;", "DirectionStart", "Lb5/i;", "DirectionEnd", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final e a() {
            if (e.f10452f == null) {
                e.f10452f = new e(null);
            }
            return e.f10452f;
        }

        private Companion() {
        }
    }

    public /* synthetic */ e(fr.k kVar) {
        this();
    }

    private final int i(int lineNumber, b5.i direction) {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            textLayoutResult = null;
        }
        int iU = textLayoutResult.u(lineNumber);
        TextLayoutResult textLayoutResult2 = this.layoutResult;
        if (textLayoutResult2 == null) {
            textLayoutResult2 = null;
        }
        if (direction != textLayoutResult2.y(iU)) {
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            return (textLayoutResult3 != null ? textLayoutResult3 : null).u(lineNumber);
        }
        TextLayoutResult textLayoutResult4 = this.layoutResult;
        if (textLayoutResult4 == null) {
            textLayoutResult4 = null;
        }
        return TextLayoutResult.p(textLayoutResult4, lineNumber, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.h
    public int[] a(int current) {
        int iQ;
        if (d().length() <= 0 || current >= d().length()) {
            return null;
        }
        if (current < 0) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                textLayoutResult = null;
            }
            iQ = textLayoutResult.q(0);
        } else {
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                textLayoutResult2 = null;
            }
            int iQ2 = textLayoutResult2.q(current);
            iQ = i(iQ2, f10453g) == current ? iQ2 : iQ2 + 1;
        }
        TextLayoutResult textLayoutResult3 = this.layoutResult;
        if (textLayoutResult3 == null) {
            textLayoutResult3 = null;
        }
        if (iQ >= textLayoutResult3.n()) {
            return null;
        }
        return c(i(iQ, f10453g), i(iQ, f10454h) + 1);
    }

    @Override // androidx.compose.ui.platform.h
    public int[] b(int current) {
        int iQ;
        if (d().length() <= 0 || current <= 0) {
            return null;
        }
        if (current > d().length()) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                textLayoutResult = null;
            }
            iQ = textLayoutResult.q(d().length());
        } else {
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                textLayoutResult2 = null;
            }
            int iQ2 = textLayoutResult2.q(current);
            iQ = i(iQ2, f10454h) + 1 == current ? iQ2 : iQ2 - 1;
        }
        if (iQ < 0) {
            return null;
        }
        return c(i(iQ, f10453g), i(iQ, f10454h) + 1);
    }

    public final void j(String text, TextLayoutResult layoutResult) {
        f(text);
        this.layoutResult = layoutResult;
    }

    private e() {
    }
}
