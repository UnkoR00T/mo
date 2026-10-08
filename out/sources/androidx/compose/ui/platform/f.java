package androidx.compose.ui.platform;

import android.graphics.Rect;
import p071kotlin.Metadata;
import q4.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/f;", "Landroidx/compose/ui/platform/c;", "<init>", "()V", "", "lineNumber", "Lb5/i;", "direction", "i", "(ILb5/i;)I", "", "text", "Lq4/t3;", "layoutResult", "Ln4/w;", "node", "Loq/i0;", "j", "(Ljava/lang/String;Lq4/t3;Ln4/w;)V", "current", "", "a", "(I)[I", "b", "c", "Lq4/t3;", "d", "Ln4/w;", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "tempRect", "f", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static f f10500h;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private n4.w node;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Rect tempRect;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f10499g = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final b5.i f10501i = b5.i.Rtl;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final b5.i f10502j = b5.i.Ltr;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/f$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/f;", "a", "()Landroidx/compose/ui/platform/f;", "pageInstance", "Landroidx/compose/ui/platform/f;", "Lb5/i;", "DirectionStart", "Lb5/i;", "DirectionEnd", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final f a() {
            if (f.f10500h == null) {
                f.f10500h = new f(null);
            }
            return f.f10500h;
        }

        private Companion() {
        }
    }

    public /* synthetic */ f(fr.k kVar) {
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
        int iN;
        if (d().length() <= 0 || current >= d().length()) {
            return null;
        }
        try {
            n4.w wVar = this.node;
            if (wVar == null) {
                wVar = null;
            }
            m3.g gVarK = wVar.k();
            int iRound = Math.round(gVarK.getBottom() - gVarK.getTop());
            int iE = lr.m.e(0, current);
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                textLayoutResult = null;
            }
            int iQ = textLayoutResult.q(iE);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                textLayoutResult2 = null;
            }
            float fV = textLayoutResult2.v(iQ) + iRound;
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            TextLayoutResult textLayoutResult4 = textLayoutResult3 == null ? null : textLayoutResult3;
            if (textLayoutResult3 == null) {
                textLayoutResult3 = null;
            }
            if (fV < textLayoutResult4.v(textLayoutResult3.n() - 1)) {
                TextLayoutResult textLayoutResult5 = this.layoutResult;
                iN = (textLayoutResult5 != null ? textLayoutResult5 : null).r(fV);
            } else {
                TextLayoutResult textLayoutResult6 = this.layoutResult;
                iN = (textLayoutResult6 != null ? textLayoutResult6 : null).n();
            }
            return c(iE, i(iN - 1, f10502j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.h
    public int[] b(int current) {
        int iR;
        if (d().length() <= 0 || current <= 0) {
            return null;
        }
        try {
            n4.w wVar = this.node;
            if (wVar == null) {
                wVar = null;
            }
            m3.g gVarK = wVar.k();
            int iRound = Math.round(gVarK.getBottom() - gVarK.getTop());
            int iJ = lr.m.j(d().length(), current);
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                textLayoutResult = null;
            }
            int iQ = textLayoutResult.q(iJ);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                textLayoutResult2 = null;
            }
            float fV = textLayoutResult2.v(iQ) - iRound;
            if (fV > 0.0f) {
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                iR = (textLayoutResult3 != null ? textLayoutResult3 : null).r(fV);
            } else {
                iR = 0;
            }
            if (iJ == d().length() && iR < iQ) {
                iR++;
            }
            return c(i(iR, f10501i), iJ);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String text, TextLayoutResult layoutResult, n4.w node) {
        f(text);
        this.layoutResult = layoutResult;
        this.node = node;
    }

    private f() {
        this.tempRect = new Rect();
    }
}
