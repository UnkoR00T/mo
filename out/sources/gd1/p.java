package gd1;

import h30.ButtonData;
import ld1.CompanyApplicationCitizenData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aC\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lld1/e;", "data", "", "d", "(Lld1/e;)Ljava/lang/String;", "Lmx/a;", "title", "info", "description", "Lh30/a;", "buttonData", "Lj70/a;", "accessibilityReadMode", "Ln50/g;", "b", "(Lmx/a;Lmx/a;Lmx/a;Lh30/a;Lj70/a;)Ln50/g;", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {
    public static final DefaultSingleCardData b(Label label, Label label2, Label label3, ButtonData buttonData, j70.a aVar) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(label2 != null ? new SingleCardLabel(label2, null, null, 0, 0, null, 62, null) : null, new n50.b.Title(new SingleCardLabel(label, null, null, 0, 0, aVar, 30, null)), label3 != null ? new SingleCardLabel(label3, null, null, 0, 0, null, 62, null) : null), null, buttonData != null ? new x0.Button(buttonData) : null, null, 2815, null);
    }

    public static /* synthetic */ DefaultSingleCardData c(Label label, Label label2, Label label3, ButtonData buttonData, j70.a aVar, int i15, Object obj) {
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
        return b(label, label2, label3, buttonData, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(CompanyApplicationCitizenData companyApplicationCitizenData) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(companyApplicationCitizenData.getFirstName());
        sb5.append(" ");
        String secondName = companyApplicationCitizenData.getSecondName();
        if (secondName != null) {
            sb5.append(secondName);
            sb5.append(" ");
        }
        sb5.append(companyApplicationCitizenData.getSurname());
        return sb5.toString();
    }
}
