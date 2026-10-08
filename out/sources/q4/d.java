package q4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq4/j0;", "spanStyle", "Lq4/i0;", "paragraphStyle", "Lq4/k0;", "a", "(Lq4/j0;Lq4/i0;)Lq4/k0;", "start", "stop", "", "fraction", "b", "(Lq4/i0;Lq4/i0;F)Lq4/i0;", "c", "(Lq4/j0;Lq4/j0;F)Lq4/j0;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final PlatformTextStyle a(j0 j0Var, PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(j0Var, platformParagraphStyle);
    }

    public static final PlatformParagraphStyle b(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f15) {
        return platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding() ? platformParagraphStyle : new PlatformParagraphStyle(((l) j3.e(l.d(platformParagraphStyle.getEmojiSupportMatch()), l.d(platformParagraphStyle2.getEmojiSupportMatch()), f15)).getValue(), ((Boolean) j3.e(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f15)).booleanValue(), null);
    }

    public static final j0 c(j0 j0Var, j0 j0Var2, float f15) {
        return j0Var;
    }
}
