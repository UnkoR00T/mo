package p079n1;

import p071kotlin.Metadata;
import q4.e;
import v4.TransformedText;
import v4.e1;
import v4.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000f\"\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lv4/e1;", "Lq4/e;", "text", "Lv4/c1;", "c", "(Lv4/e1;Lq4/e;)Lv4/c1;", "", "originalLength", "limit", "Loq/i0;", "e", "(Lv4/c1;II)V", "originalOffset", "offset", "h", "(III)V", "transformedOffset", "transformedLength", "g", "Lv4/i0;", "a", "Lv4/i0;", "d", "()Lv4/i0;", "ValidatingEmptyOffsetMappingIdentity", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i0 f130220a = new l7(i0.INSTANCE.a(), 0, 0);

    public static final TransformedText c(e1 e1Var, e eVar) {
        TransformedText transformedTextA = e1Var.a(eVar);
        f(transformedTextA, eVar.length(), 0, 2, null);
        return new TransformedText(transformedTextA.getText(), new l7(transformedTextA.getOffsetMapping(), eVar.length(), transformedTextA.getText().length()));
    }

    public static final i0 d() {
        return f130220a;
    }

    public static final void e(TransformedText transformedText, int i15, int i16) {
        int length = transformedText.getText().length();
        int iMin = Math.min(i15, i16);
        for (int i17 = 0; i17 < iMin; i17++) {
            g(transformedText.getOffsetMapping().e(i17), length, i17);
        }
        g(transformedText.getOffsetMapping().e(i15), length, i15);
        int iMin2 = Math.min(length, i16);
        for (int i18 = 0; i18 < iMin2; i18++) {
            h(transformedText.getOffsetMapping().b(i18), i15, i18);
        }
        h(transformedText.getOffsetMapping().b(length), i15, length);
    }

    public static /* synthetic */ void f(TransformedText transformedText, int i15, int i16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i16 = 100;
        }
        e(transformedText, i15, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(int i15, int i16, int i17) {
        boolean z15 = false;
        if (i15 >= 0 && i15 <= i16) {
            z15 = true;
        }
        if (z15) {
            return;
        }
        c1.e.c("OffsetMapping.originalToTransformed returned invalid mapping: " + i17 + " -> " + i15 + " is not in range of transformed text [0, " + i16 + ']');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i15, int i16, int i17) {
        boolean z15 = false;
        if (i15 >= 0 && i15 <= i16) {
            z15 = true;
        }
        if (z15) {
            return;
        }
        c1.e.c("OffsetMapping.transformedToOriginal returned invalid mapping: " + i17 + " -> " + i15 + " is not in range of original text [0, " + i16 + ']');
    }
}
