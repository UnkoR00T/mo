package c1;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.b1;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import pq.n;
import q4.SpanStyle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/a1;", "Lq4/e;", "e", "(Landroidx/compose/ui/platform/a1;Ltq/e;)Ljava/lang/Object;", "f", "(Lq4/e;)Landroidx/compose/ui/platform/a1;", "Landroidx/compose/ui/platform/b1;", "", "c", "(Landroidx/compose/ui/platform/b1;)Z", "d", "", "b", "(Lq4/e;)Ljava/lang/CharSequence;", "a", "(Ljava/lang/CharSequence;)Lq4/e;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final q4.e a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new q4.e(charSequence.toString(), null, 2, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i15 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int iV0 = n.v0(annotationArr);
        if (iV0 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i15];
                if (t.c(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new q4.e.Range(new c(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i15 == iV0) {
                    break;
                }
                i15++;
            }
        }
        return new q4.e(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence b(q4.e eVar) {
        if (eVar.g().isEmpty()) {
            return eVar.getText();
        }
        SpannableString spannableString = new SpannableString(eVar.getText());
        d dVar = new d();
        List<q4.e.Range<SpanStyle>> listG = eVar.g();
        int size = listG.size();
        for (int i15 = 0; i15 < size; i15++) {
            q4.e.Range<SpanStyle> range = listG.get(i15);
            SpanStyle spanStyleA = range.a();
            int start = range.getStart();
            int end = range.getEnd();
            dVar.q();
            dVar.h(spanStyleA);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", dVar.p()), start, end, 33);
        }
        return spannableString;
    }

    public static final boolean c(b1 b1Var) {
        return true;
    }

    public static final boolean d(b1 b1Var) {
        return true;
    }

    public static final Object e(a1 a1Var, tq.e<? super q4.e> eVar) {
        return a.b(a1Var);
    }

    public static final a1 f(q4.e eVar) {
        return a.c(eVar);
    }
}
