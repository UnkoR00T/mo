package y4;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import p071kotlin.Metadata;
import q4.SpanStyle;
import q4.UrlAnnotation;
import q4.d4;
import u4.FontWeight;
import u4.h0;
import u4.y;
import u4.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0010\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lq4/e;", "Lc5/d;", "density", "Lu4/l$b;", "fontFamilyResolver", "Ly4/v;", "urlSpanCache", "Landroid/text/SpannableString;", "b", "(Lq4/e;Lc5/d;Lu4/l$b;Ly4/v;)Landroid/text/SpannableString;", "Lq4/h3;", "spanStyle", "", "start", "end", "Loq/i0;", "a", "(Landroid/text/SpannableString;Lq4/h3;IILc5/d;Lu4/l$b;)V", "Lq4/e$d;", "Lq4/m;", "Lq4/m$b;", "c", "(Lq4/e$d;)Lq4/e$d;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    private static final void a(SpannableString spannableString, SpanStyle spanStyle, int i15, int i16, c5.d dVar, u4.l.b bVar) {
        z4.d.n(spannableString, spanStyle.g(), i15, i16);
        z4.d.s(spannableString, spanStyle.getFontSize(), dVar, i15, i16);
        if (spanStyle.getFontWeight() != null || spanStyle.getFontStyle() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.d();
            }
            y fontStyle = spanStyle.getFontStyle();
            spannableString.setSpan(new StyleSpan(u4.f.c(fontWeight, fontStyle != null ? fontStyle.getValue() : y.INSTANCE.b())), i15, i16, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof h0) {
                spannableString.setSpan(new TypefaceSpan(((h0) spanStyle.getFontFamily()).getName()), i15, i16, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                u4.l fontFamily = spanStyle.getFontFamily();
                z fontSynthesis = spanStyle.getFontSynthesis();
                spannableString.setSpan(l.f223824a.a((Typeface) u4.l.b.b(bVar, fontFamily, null, 0, fontSynthesis != null ? fontSynthesis.getValue() : z.INSTANCE.a(), 6, null).getValue()), i15, i16, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            b5.k textDecoration = spanStyle.getTextDecoration();
            b5.k.Companion companion = b5.k.INSTANCE;
            if (textDecoration.d(companion.d())) {
                spannableString.setSpan(new UnderlineSpan(), i15, i16, 33);
            }
            if (spanStyle.getTextDecoration().d(companion.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i15, i16, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i15, i16, 33);
        }
        z4.d.w(spannableString, spanStyle.getLocaleList(), i15, i16);
        z4.d.j(spannableString, spanStyle.getBackground(), i15, i16);
    }

    public static final SpannableString b(q4.e eVar, c5.d dVar, u4.l.b bVar, v vVar) {
        SpannableString spannableString = new SpannableString(eVar.getText());
        List<q4.e.Range<SpanStyle>> listH = eVar.h();
        if (listH != null) {
            int size = listH.size();
            for (int i15 = 0; i15 < size; i15++) {
                q4.e.Range<SpanStyle> range = listH.get(i15);
                a(spannableString, SpanStyle.b(range.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), range.getStart(), range.getEnd(), dVar, bVar);
            }
        }
        List<q4.e.Range<d4>> listL = eVar.l(0, eVar.length());
        int size2 = listL.size();
        for (int i16 = 0; i16 < size2; i16++) {
            q4.e.Range<d4> range2 = listL.get(i16);
            spannableString.setSpan(z4.f.a(range2.a()), range2.getStart(), range2.getEnd(), 33);
        }
        List<q4.e.Range<UrlAnnotation>> listM = eVar.m(0, eVar.length());
        int size3 = listM.size();
        for (int i17 = 0; i17 < size3; i17++) {
            q4.e.Range<UrlAnnotation> range3 = listM.get(i17);
            spannableString.setSpan(vVar.c(range3.a()), range3.getStart(), range3.getEnd(), 33);
        }
        List<q4.e.Range<q4.m>> listE = eVar.e(0, eVar.length());
        int size4 = listE.size();
        for (int i18 = 0; i18 < size4; i18++) {
            q4.e.Range<q4.m> range4 = listE.get(i18);
            if (range4.h() != range4.f()) {
                q4.m mVarG = range4.g();
                if ((mVarG instanceof q4.m.b) && ((q4.m.b) mVarG).getLinkInteractionListener() == null) {
                    spannableString.setSpan(vVar.b(c(range4)), range4.h(), range4.f(), 33);
                } else {
                    spannableString.setSpan(vVar.a(range4), range4.h(), range4.f(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final q4.e.Range<q4.m.b> c(q4.e.Range<q4.m> range) {
        return new q4.e.Range<>((q4.m.b) range.g(), range.h(), range.f());
    }
}
