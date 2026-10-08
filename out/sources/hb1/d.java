package hb1;

import ld1.CompanyApplicationCitizenAddress;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0000*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhb1/c;", "", "b", "(Lhb1/c;)Z", "c", "Lld1/d;", "d", "(Lld1/d;)Lhb1/c;", "Lhb1/a;", "a", "(Lhb1/c;)Lhb1/a;", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final a a(c cVar) {
        if (cVar.getTerytObject() != null) {
            return new a.TerytAddress(cVar.getTerytObject());
        }
        if (cVar.getBackendObject() != null) {
            return new a.BackendAddress(cVar.getBackendObject());
        }
        return null;
    }

    public static final boolean b(c cVar) {
        return (cVar.getTerytObject() == null && cVar.getBackendObject() == null) ? false : true;
    }

    public static final boolean c(c cVar) {
        return cVar != null && b(cVar);
    }

    public static final c d(CompanyApplicationCitizenAddress companyApplicationCitizenAddress) {
        return new c(null, companyApplicationCitizenAddress, 1, null);
    }
}
