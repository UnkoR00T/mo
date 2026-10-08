package q4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lq4/b4;", "start", "stop", "", "fraction", "c", "(Lq4/b4;Lq4/b4;F)Lq4/b4;", "style", "Lc5/t;", "direction", "d", "(Lq4/b4;Lc5/t;)Lq4/b4;", "layoutDirection", "Lb5/l;", "textDirection", "e", "(Lc5/t;I)I", "Lq4/j0;", "platformSpanStyle", "Lq4/i0;", "platformParagraphStyle", "Lq4/k0;", "b", "(Lq4/j0;Lq4/i0;)Lq4/k0;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c4 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f164449a;

        static {
            int[] iArr = new int[c5.t.values().length];
            try {
                iArr[c5.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c5.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f164449a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformTextStyle b(j0 j0Var, PlatformParagraphStyle platformParagraphStyle) {
        if (j0Var == null && platformParagraphStyle == null) {
            return null;
        }
        return d.a(j0Var, platformParagraphStyle);
    }

    public static final TextStyle c(TextStyle textStyle, TextStyle textStyle2, float f15) {
        return new TextStyle(j3.d(textStyle.P(), textStyle2.P(), f15), f0.b(textStyle.getParagraphStyle(), textStyle2.getParagraphStyle(), f15));
    }

    public static final TextStyle d(TextStyle textStyle, c5.t tVar) {
        return new TextStyle(j3.j(textStyle.getSpanStyle()), f0.e(textStyle.x(), tVar), textStyle.getPlatformStyle());
    }

    public static final int e(c5.t tVar, int i15) {
        b5.l.Companion companion = b5.l.INSTANCE;
        if (b5.l.j(i15, companion.a())) {
            int i16 = a.f164449a[tVar.ordinal()];
            if (i16 == 1) {
                return companion.b();
            }
            if (i16 == 2) {
                return companion.c();
            }
            throw new oq.p();
        }
        if (!b5.l.j(i15, companion.f())) {
            return i15;
        }
        int i17 = a.f164449a[tVar.ordinal()];
        if (i17 == 1) {
            return companion.d();
        }
        if (i17 == 2) {
            return companion.e();
        }
        throw new oq.p();
    }
}
