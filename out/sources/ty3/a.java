package ty3;

import al0.CommunityOffice;
import p071kotlin.Metadata;
import py3.OfficeSelectionData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpy3/b$b;", "Lsy3/d$d$a;", "a", "(Lpy3/b$b;)Lsy3/d$d$a;", "officeselection_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final sy3.d.InterfaceC4804d.SelectedOffice a(OfficeSelectionData.Office office) {
        return new sy3.d.InterfaceC4804d.SelectedOffice(new CommunityOffice(CommunityOffice.a.a(office.getId()), office.getName(), null), office.getEdorAddress());
    }
}
