package y4;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import b5.LineHeightStyle;
import b5.TextIndent;
import java.util.List;
import p071kotlin.Metadata;
import q4.Placeholder;
import q4.PlatformParagraphStyle;
import q4.PlatformTextStyle;
import q4.TextStyle;
import u4.FontWeight;
import u4.y;
import u4.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000[\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u001c\u001a\u0089\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\f2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0015*\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"", "text", "", "contextFontSize", "Lq4/b4;", "contextTextStyle", "", "Lq4/e$d;", "Lq4/e$a;", "annotations", "Lq4/g0;", "placeholders", "Lc5/d;", "density", "Lkotlin/Function4;", "Lu4/l;", "Lu4/d0;", "Lu4/y;", "Lu4/z;", "Landroid/graphics/Typeface;", "resolveTypeface", "", "useEmojiCompat", "", "a", "(Ljava/lang/String;FLq4/b4;Ljava/util/List;Ljava/util/List;Lc5/d;Ler/r;Z)Ljava/lang/CharSequence;", "b", "(Lq4/b4;)Z", "y4/c$a", "Ly4/c$a;", "NoopSpan", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f223799a = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"y4/c$a", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "p0", "Loq/i0;", "updateDrawState", "(Landroid/text/TextPaint;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint p15) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.emoji2.text.e] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final CharSequence a(String str, float f15, TextStyle textStyle, List<? extends q4.e.Range<? extends q4.e.a>> list, List<q4.e.Range<Placeholder>> list2, c5.d dVar, er.r<? super u4.l, ? super FontWeight, ? super y, ? super z, ? extends Typeface> rVar, boolean z15) {
        String str2;
        CharSequence charSequenceU;
        float f16;
        c5.d dVar2;
        PlatformParagraphStyle paragraphSyle;
        if (z15 && androidx.emoji2.text.e.k()) {
            PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            q4.l lVarD = (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : q4.l.d(paragraphSyle.getEmojiSupportMatch());
            str2 = str;
            charSequenceU = androidx.emoji2.text.e.c().u(str2, 0, str.length(), Integer.MAX_VALUE, lVarD == null ? 0 : q4.l.g(lVarD.getValue(), q4.l.INSTANCE.a()));
        } else {
            str2 = str;
            charSequenceU = str2;
        }
        if (list.isEmpty() && list2.isEmpty() && fr.t.c(textStyle.F(), TextIndent.INSTANCE.a()) && c5.v.f(textStyle.u()) == 0) {
            return charSequenceU;
        }
        Spannable spannableString = charSequenceU instanceof Spannable ? (Spannable) charSequenceU : new SpannableString(charSequenceU);
        if (fr.t.c(textStyle.C(), b5.k.INSTANCE.d())) {
            z4.d.y(spannableString, f223799a, 0, str2.length());
        }
        if (b(textStyle) && textStyle.v() == null) {
            z4.d.v(spannableString, textStyle.u(), f15, dVar);
            f16 = f15;
            dVar2 = dVar;
        } else {
            LineHeightStyle lineHeightStyleV = textStyle.v();
            if (lineHeightStyleV == null) {
                lineHeightStyleV = LineHeightStyle.INSTANCE.a();
            }
            f16 = f15;
            dVar2 = dVar;
            z4.d.u(spannableString, textStyle.u(), f16, dVar2, lineHeightStyleV);
        }
        z4.d.C(spannableString, textStyle.F(), f16, dVar2);
        z4.d.A(spannableString, textStyle, list, dVar2, rVar);
        z4.d.m(spannableString, list, f16, dVar2, textStyle.F());
        z4.b.d(spannableString, list2, dVar2);
        return spannableString;
    }

    public static final boolean b(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) {
            return false;
        }
        return paragraphSyle.getIncludeFontPadding();
    }
}
