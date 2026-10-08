package z1;

import p071kotlin.Metadata;
import q4.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq4/t3;", "", "offset", "Lb5/i;", "a", "(Lq4/t3;I)Lb5/i;", "", "b", "(Lq4/t3;I)Z", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d1 {
    public static final b5.i a(TextLayoutResult textLayoutResult, int i15) {
        return b(textLayoutResult, i15) ? textLayoutResult.y(i15) : textLayoutResult.c(i15);
    }

    private static final boolean b(TextLayoutResult textLayoutResult, int i15) {
        if (textLayoutResult.getLayoutInput().getText().length() != 0) {
            int iQ = textLayoutResult.q(i15);
            if (i15 != 0 && iQ == textLayoutResult.q(i15 - 1)) {
                return false;
            }
            if (i15 != textLayoutResult.getLayoutInput().getText().length() && iQ == textLayoutResult.q(i15 + 1)) {
                return false;
            }
        }
        return true;
    }
}
