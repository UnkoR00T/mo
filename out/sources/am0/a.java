package am0;

import al0.CommunityOffice;
import gm0.CommunityOfficesDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0002*\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Lgm0/r1;", "Lal0/v;", "b", "(Ljava/util/List;)Ljava/util/List;", "a", "(Lgm0/r1;)Lal0/v;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    private static final CommunityOffice a(CommunityOfficesDto communityOfficesDto) {
        return new CommunityOffice(CommunityOffice.a.a(communityOfficesDto.getId()), communityOfficesDto.getName(), null);
    }

    public static final List<CommunityOffice> b(List<CommunityOfficesDto> list) {
        List<CommunityOfficesDto> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((CommunityOfficesDto) it.next()));
        }
        return arrayList;
    }
}
