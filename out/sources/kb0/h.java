package kb0;

import er.l;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.x0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmx/a;", "info", "title", "Ln50/x0;", "trailingSection", "Ln50/g;", "d", "(Lmx/a;Lmx/a;Ln50/x0;)Ln50/g;", "", "", "b", "(Ljava/util/List;)Ljava/lang/String;", "drivinglicence_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final String b(List<String> list) {
        String strV0 = v.v0(list, null, null, null, 0, null, new l() { // from class: kb0.g
            @Override // er.l
            public final Object b(Object obj) {
                return h.c((String) obj);
            }
        }, 31, null);
        if (strV0.length() == 0) {
            return null;
        }
        return strV0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(String str) {
        return str;
    }

    public static final DefaultSingleCardData d(Label label, Label label2, x0 x0Var) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(label != null ? n50.l.b(label, null, null, 3, null) : null, new n50.b.Title(n50.l.b(label2, null, null, 3, null)), null, 4, null), null, x0Var, null, 2815, null);
    }

    public static /* synthetic */ DefaultSingleCardData e(Label label, Label label2, x0 x0Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = null;
        }
        if ((i15 & 4) != 0) {
            x0Var = null;
        }
        return d(label, label2, x0Var);
    }
}
