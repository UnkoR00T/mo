package xl0;

import al0.ChildData;
import al0.ParentOrGuardData;
import gm0.ApplicantDataResponse;
import gm0.ChildDataDto;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0002*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "Lgm0/l1;", "Lal0/u;", "c", "(Ljava/util/List;)Ljava/util/List;", "a", "(Lgm0/l1;)Lal0/u;", "Lgm0/b;", "Lal0/j0;", "b", "(Lgm0/b;)Lal0/j0;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final ChildData a(ChildDataDto childDataDto) {
        return new ChildData(childDataDto.getId(), childDataDto.getFirstName(), xw.g.c(c0.g(childDataDto.getPesel())), childDataDto.getSurname(), childDataDto.getSecondName(), null);
    }

    public static final ParentOrGuardData b(ApplicantDataResponse applicantDataResponse) {
        return new ParentOrGuardData(applicantDataResponse.getFirstName(), c0.g(applicantDataResponse.getSeriesAndNumber()), applicantDataResponse.getSurname(), applicantDataResponse.getSecondName());
    }

    public static final List<ChildData> c(List<ChildDataDto> list) {
        List<ChildDataDto> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ChildDataDto) it.next()));
        }
        return arrayList;
    }
}
