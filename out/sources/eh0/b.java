package eh0;

import bh0.BETerytDetail;
import fh0.TerytDetailDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0002*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Lfh0/e;", "Lbh0/a;", "b", "(Ljava/util/List;)Ljava/util/List;", "a", "(Lfh0/e;)Lbh0/a;", "addressservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final BETerytDetail a(TerytDetailDto terytDetailDto) {
        return new BETerytDetail(BETerytDetail.b.a(terytDetailDto.getId()), terytDetailDto.getName(), terytDetailDto.getDescription(), null);
    }

    public static final List<BETerytDetail> b(List<TerytDetailDto> list) {
        List<TerytDetailDto> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((TerytDetailDto) it.next()));
        }
        return arrayList;
    }
}
