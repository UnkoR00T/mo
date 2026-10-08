package y4;

import java.util.List;
import java.util.Locale;
import p071kotlin.Metadata;
import q4.Placeholder;
import q4.PlatformParagraphStyle;
import q4.PlatformTextStyle;
import q4.TextStyle;
import q4.b0;
import x4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aY\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lb5/l;", "textDirection", "Lx4/d;", "localeList", "", "d", "(ILx4/d;)I", "", "text", "Lq4/b4;", "style", "", "Lq4/e$d;", "Lq4/e$a;", "annotations", "Lq4/g0;", "placeholders", "Lc5/d;", "density", "Lu4/l$b;", "fontFamilyResolver", "Lq4/b0;", "a", "(Ljava/lang/String;Lq4/b4;Ljava/util/List;Ljava/util/List;Lc5/d;Lu4/l$b;)Lq4/b0;", "", "c", "(Lq4/b4;)Z", "hasEmojiCompat", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final b0 a(String str, TextStyle textStyle, List<? extends q4.e.Range<? extends q4.e.a>> list, List<q4.e.Range<Placeholder>> list2, c5.d dVar, u4.l.b bVar) {
        return new e(str, textStyle, list, list2, bVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        q4.l lVarD = (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : q4.l.d(paragraphSyle.getEmojiSupportMatch());
        return !(lVarD == null ? false : q4.l.g(lVarD.getValue(), q4.l.INSTANCE.c()));
    }

    public static final int d(int i15, LocaleList localeList) {
        Locale platformLocale;
        b5.l.Companion companion = b5.l.INSTANCE;
        if (b5.l.j(i15, companion.b())) {
            return 2;
        }
        if (b5.l.j(i15, companion.c())) {
            return 3;
        }
        if (b5.l.j(i15, companion.d())) {
            return 0;
        }
        if (b5.l.j(i15, companion.e())) {
            return 1;
        }
        if (!b5.l.j(i15, companion.a()) && !b5.l.j(i15, companion.f())) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (localeList == null || (platformLocale = localeList.g(0).getPlatformLocale()) == null) {
            platformLocale = Locale.getDefault();
        }
        int iA = h6.i.a(platformLocale);
        return (iA == 0 || iA != 1) ? 2 : 3;
    }
}
