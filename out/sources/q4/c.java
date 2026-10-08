package q4;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0004\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0004\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001f\u001a\u00020\u0002*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010\u0004¨\u0006 "}, d2 = {"Lb5/j;", "align", "", "m", "(I)I", "Lb5/e;", "hyphens", "o", "Lb5/f$b;", "breakStrategy", "n", "Lb5/f$c;", "lineBreakStrictness", "p", "Lb5/f$d;", "lineBreakWordStyle", "q", "Lr4/j0;", "maxHeight", "k", "(Lr4/j0;I)I", "Lq4/b4;", "textStyle", "", "ellipsis", "l", "(Lq4/b4;Z)Z", "", "j", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Lq4/m3;", "r", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence j(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!r4.x.a(spannableString, t4.c.class)) {
            z4.d.y(spannableString, new t4.c(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(r4.j0 j0Var, int i15) {
        int lineCount = j0Var.getLineCount();
        for (int i16 = 0; i16 < lineCount; i16++) {
            if (j0Var.l(i16) > i15) {
                return i16;
            }
        }
        return j0Var.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(TextStyle textStyle, boolean z15) {
        if (z15 && !c5.v.e(textStyle.s(), c5.w.g(0)) && !c5.v.e(textStyle.s(), c5.v.INSTANCE.a())) {
            int iB = textStyle.B();
            b5.j.Companion companion = b5.j.INSTANCE;
            if (!b5.j.k(iB, companion.g()) && !b5.j.k(textStyle.B(), companion.f()) && !b5.j.k(textStyle.B(), companion.c())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i15) {
        b5.j.Companion companion = b5.j.INSTANCE;
        if (b5.j.k(i15, companion.d())) {
            return 3;
        }
        if (b5.j.k(i15, companion.e())) {
            return 4;
        }
        if (b5.j.k(i15, companion.a())) {
            return 2;
        }
        return (!b5.j.k(i15, companion.f()) && b5.j.k(i15, companion.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i15) {
        b5.f.b.Companion companion = b5.f.b.INSTANCE;
        if (b5.f.b.e(i15, companion.c())) {
            return 0;
        }
        if (b5.f.b.e(i15, companion.b())) {
            return 1;
        }
        return b5.f.b.e(i15, companion.a()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i15) {
        b5.e.Companion companion = b5.e.INSTANCE;
        if (b5.e.g(i15, companion.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        b5.e.g(i15, companion.b());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int i15) {
        b5.f.c.Companion companion = b5.f.c.INSTANCE;
        if (b5.f.c.f(i15, companion.a())) {
            return 0;
        }
        if (b5.f.c.f(i15, companion.b())) {
            return 1;
        }
        if (b5.f.c.f(i15, companion.c())) {
            return 2;
        }
        return b5.f.c.f(i15, companion.d()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(int i15) {
        b5.f.d.Companion companion = b5.f.d.INSTANCE;
        return (!b5.f.d.d(i15, companion.a()) && b5.f.d.d(i15, companion.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int i15) {
        m3.Companion companion = m3.INSTANCE;
        return (!m3.d(i15, companion.a()) && m3.d(i15, companion.b())) ? 1 : 0;
    }
}
