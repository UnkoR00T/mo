package gg1;

import h30.ButtonData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmx/a;", "title", "info", "description", "Lh30/a;", "buttonData", "Lj70/a;", "accessibilityReadMode", "Ln50/g;", "a", "(Lmx/a;Lmx/a;Lmx/a;Lh30/a;Lj70/a;)Ln50/g;", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final DefaultSingleCardData a(Label label, Label label2, Label label3, ButtonData buttonData, j70.a aVar) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(label2 != null ? new SingleCardLabel(label2, null, null, 0, 0, null, 62, null) : null, new n50.b.Title(new SingleCardLabel(label, null, null, 0, 0, aVar, 30, null)), label3 != null ? new SingleCardLabel(label3, null, null, 0, 0, null, 62, null) : null), null, buttonData != null ? new x0.Button(buttonData) : null, null, 2815, null);
    }

    public static /* synthetic */ DefaultSingleCardData b(Label label, Label label2, Label label3, ButtonData buttonData, j70.a aVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            label2 = null;
        }
        if ((i15 & 4) != 0) {
            label3 = null;
        }
        if ((i15 & 8) != 0) {
            buttonData = null;
        }
        if ((i15 & 16) != 0) {
            aVar = j70.a.LOWER_CASE;
        }
        return a(label, label2, label3, buttonData, aVar);
    }
}
