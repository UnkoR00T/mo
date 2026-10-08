package xk1;

import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmx/c;", "", "titleResId", "Lmx/a;", "body", "", "testTag", "Ln50/g;", "a", "(Lmx/c;Ljava/lang/Integer;Lmx/a;Ljava/lang/String;)Ln50/g;", "dependentidinvalidation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final DefaultSingleCardData a(c cVar, Integer num, Label label, String str) {
        return new DefaultSingleCardData(str, null, false, null, null, false, null, null, new BodySection(num != null ? new SingleCardLabel(cVar.c(num.intValue()), null, null, 0, 0, null, 62, null) : null, new n50.b.Title(new SingleCardLabel(label, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
    }

    public static /* synthetic */ DefaultSingleCardData b(c cVar, Integer num, Label label, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            num = null;
        }
        if ((i15 & 4) != 0) {
            str = label.getTag() + "Card";
        }
        return a(cVar, num, label, str);
    }
}
