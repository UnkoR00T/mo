package q4;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lq4/e$d;", "Lq4/g0;", "", "start", "end", "b", "(Ljava/util/List;II)Ljava/util/List;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<e.Range<Placeholder>> b(List<e.Range<Placeholder>> list, int i15, int i16) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            e.Range<Placeholder> range = list.get(i17);
            if (g.j(i15, i16, range.h(), range.f())) {
                if (!(i15 <= range.h() && range.f() <= i16)) {
                    w4.a.a("placeholder can not overlap with paragraph.");
                }
                arrayList.add(new e.Range(range.g(), range.h() - i15, range.f() - i15));
            }
        }
        return arrayList;
    }
}
