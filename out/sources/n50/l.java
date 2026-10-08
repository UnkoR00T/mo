package n50;

import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmx/a;", "Lj70/a;", "accessibilityReadMode", "contentDescription", "Ln50/i0;", "a", "(Lmx/a;Lj70/a;Lmx/a;)Ln50/i0;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final SingleCardLabel a(Label label, j70.a aVar, Label label2) {
        return new SingleCardLabel(label, label2, null, 0, 0, aVar, 28, null);
    }

    public static /* synthetic */ SingleCardLabel b(Label label, j70.a aVar, Label label2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = j70.a.LOWER_CASE;
        }
        if ((i15 & 2) != 0) {
            label2 = null;
        }
        return a(label, aVar, label2);
    }
}
