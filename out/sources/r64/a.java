package r64;

import dx.b;
import dx.i;
import g64.GlobalSearchEntry;
import g64.GlobalSearchResult;
import g64.c;
import g64.d;
import iq0.BESearchSections;
import iq0.SearchTags;
import java.util.List;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0006J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u0006J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0014\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rH¦@¢\u0006\u0004\b$\u0010\u0006¨\u0006%À\u0006\u0003"}, d2 = {"Lr64/a;", "", "Ldx/i;", "Ldx/b;", "", "d", "(Ltq/e;)Ljava/lang/Object;", "query", "Lg64/e;", "f", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Liq0/b0;", "searchTags", "Loq/i0;", "i", "(Liq0/b0;Ltq/e;)Ljava/lang/Object;", "", "b", "Liq0/n;", "e", "sections", "g", "(Liq0/n;Ltq/e;)Ljava/lang/Object;", "Lg64/c;", "mainType", "Lg64/d;", "entryType", "h", "(Lg64/c;Lg64/d;Ltq/e;)Ljava/lang/Object;", "", "limit", "Lmu/g;", "", "Lg64/b;", "c", "(I)Lmu/g;", "a", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(e<? super i0> eVar);

    Object b(e<? super i<? extends b, Boolean>> eVar);

    g<List<GlobalSearchEntry>> c(int limit);

    Object d(e<? super i<? extends b, String>> eVar);

    Object e(e<? super i<? extends b, BESearchSections>> eVar);

    Object f(String str, e<? super i<? extends b, GlobalSearchResult>> eVar);

    Object g(BESearchSections bESearchSections, e<? super i<? extends b, i0>> eVar);

    Object h(c cVar, d dVar, e<? super i<? extends b, i0>> eVar);

    Object i(SearchTags searchTags, e<? super i<? extends b, i0>> eVar);
}
