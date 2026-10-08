package ph;

import ea.NavEntry;
import java.util.List;
import java.util.ListIterator;
import nb.WindowSizeClass;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements fa.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowSizeClass f157545a;

    public c(WindowSizeClass windowSizeClass) {
        this.f157545a = windowSizeClass;
    }

    @Override // fa.s
    public final fa.h a(fa.t tVar, List list) {
        NavEntry navEntry;
        Object objPrevious;
        if (this.f157545a.a(600) && (navEntry = (NavEntry) pq.v.z0(list)) != null) {
            if (true != navEntry.e().containsKey("ListDetailScene-Detail")) {
                navEntry = null;
            }
            if (navEntry != null) {
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!((NavEntry) objPrevious).e().containsKey("ListDetailScene-List"));
                NavEntry navEntry2 = (NavEntry) objPrevious;
                if (navEntry2 != null) {
                    return new c1(navEntry2.getContentKey(), pq.v.g0(list, 1), navEntry2, navEntry);
                }
            }
        }
        return null;
    }
}
