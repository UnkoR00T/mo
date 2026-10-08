package sc4;

import fk0.BECompanyRepresentative;
import fk0.BECompanyRepresentatives;
import fk0.BERepresentativeRemovalStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ma1.CompanyRepresentative;
import ma1.CompanyRepresentativesResponse;
import ma1.RepresentativeRemovalStatementResponse;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfk0/g0;", "Lma1/n;", "c", "(Lfk0/g0;)Lma1/n;", "Lfk0/h0;", "Lma1/o;", "d", "(Lfk0/h0;)Lma1/o;", "Lfk0/b1;", "Lma1/t;", "e", "(Lfk0/b1;)Lma1/t;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    private static final CompanyRepresentative c(BECompanyRepresentative bECompanyRepresentative) {
        return new CompanyRepresentative(bECompanyRepresentative.getId(), bECompanyRepresentative.getRole(), bECompanyRepresentative.getName(), bECompanyRepresentative.getKrs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompanyRepresentativesResponse d(BECompanyRepresentatives bECompanyRepresentatives) {
        List<BECompanyRepresentative> listA = bECompanyRepresentatives.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((BECompanyRepresentative) it.next()));
        }
        return new CompanyRepresentativesResponse(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RepresentativeRemovalStatementResponse e(BERepresentativeRemovalStatement bERepresentativeRemovalStatement) {
        return new RepresentativeRemovalStatementResponse(bERepresentativeRemovalStatement.getStatementXml());
    }
}
