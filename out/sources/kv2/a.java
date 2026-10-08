package kv2;

import al0.ChildData;
import al0.CommunityOffice;
import al0.DMSTerytDetail;
import al0.w0;
import fr.t;
import iy.b0;
import iy.c0;
import ju3.e;
import oq.p;
import p071kotlin.Metadata;
import py3.OfficeSelectionData;
import st3.AddressTerytDetail;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lst3/l;", "Lal0/w;", "d", "(Lst3/l;)Lal0/w;", "Lju3/e;", "Lal0/w0;", "c", "(Lju3/e;)Lal0/w0;", "Lju3/a;", "Lal0/u;", "a", "(Lju3/a;)Lal0/u;", "Lpy3/b$b;", "Lal0/v;", "b", "(Lpy3/b$b;)Lal0/v;", "physicalidcardapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final ChildData a(ju3.ChildData childData) {
        String childId = childData.getChildId();
        String strE = c0.e(childData.getFirstName());
        b0 pesel = childData.getPesel();
        String strE2 = c0.e(childData.getSurname());
        b0 secondName = childData.getSecondName();
        return new ChildData(childId, strE, pesel, strE2, secondName != null ? c0.e(secondName) : null, null);
    }

    public static final CommunityOffice b(OfficeSelectionData.Office office) {
        return new CommunityOffice(CommunityOffice.a.a(office.getId()), office.getName(), null);
    }

    public static final w0 c(e eVar) {
        if (t.c(eVar, e.a.f106016a)) {
            return w0.a.f7557a;
        }
        if (t.c(eVar, e.b.f106017a)) {
            return w0.b.f7558a;
        }
        if (!(eVar instanceof e.Specific)) {
            throw new p();
        }
        ju3.ChildData childData = ((e.Specific) eVar).getChildData();
        String childId = childData.getChildId();
        String strE = c0.e(childData.getFirstName());
        b0 pesel = childData.getPesel();
        String strE2 = c0.e(childData.getSurname());
        b0 secondName = childData.getSecondName();
        return new w0.Specific(new ChildData(childId, strE, pesel, strE2, secondName != null ? c0.e(secondName) : null, null));
    }

    public static final DMSTerytDetail d(AddressTerytDetail addressTerytDetail) {
        return new DMSTerytDetail(DMSTerytDetail.a.a(addressTerytDetail.getId()), addressTerytDetail.getName(), addressTerytDetail.getDescription(), null);
    }
}
