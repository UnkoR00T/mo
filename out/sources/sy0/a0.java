package sy0;

import mx.Label;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln50/g;", "Lmx/a;", "a", "(Ln50/g;)Lmx/a;", "airquality_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a0 {
    public static final Label a(DefaultSingleCardData defaultSingleCardData) {
        SingleCardLabel singleCardLabel;
        Label label;
        n50.b title = defaultSingleCardData.getBodySection().getTitle();
        n50.b.Title title2 = title instanceof n50.b.Title ? (n50.b.Title) title : null;
        return (title2 == null || (singleCardLabel = title2.getSingleCardLabel()) == null || (label = singleCardLabel.getLabel()) == null) ? Label.INSTANCE.c() : label;
    }
}
