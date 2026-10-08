package g2;

import c5.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import nb.WindowSizeClass;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lnb/a$a;", "Lc5/k;", "windowSize", "", "Lc5/h;", "supportedWidthSizeClasses", "supportedHeightSizeClasses", "Lnb/a;", "a", "(Lnb/a$a;JLjava/util/Set;Ljava/util/Set;)Lnb/a;", "c", "adaptive"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i {
    public static final WindowSizeClass a(WindowSizeClass.Companion companion, long j15, Set<c5.h> set, Set<c5.h> set2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (c5.h.l(k.j(j15), ((c5.h) obj).getValue()) >= 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float value = ((c5.h) it.next()).getValue();
        while (it.hasNext()) {
            value = Math.max(value, ((c5.h) it.next()).getValue());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (c5.h.l(k.i(j15), ((c5.h) obj2).getValue()) >= 0) {
                arrayList2.add(obj2);
            }
        }
        Iterator it4 = arrayList2.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float value2 = ((c5.h) it4.next()).getValue();
        while (it4.hasNext()) {
            value2 = Math.max(value2, ((c5.h) it4.next()).getValue());
        }
        return new WindowSizeClass(value, value2);
    }

    public static /* synthetic */ WindowSizeClass b(WindowSizeClass.Companion companion, long j15, Set set, Set set2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            set = d.f69781a.a();
        }
        if ((i15 & 4) != 0) {
            set2 = c.f69776a.a();
        }
        return a(companion, j15, set, set2);
    }

    public static final WindowSizeClass c(WindowSizeClass.Companion companion, long j15, Set<c5.h> set, Set<c5.h> set2) {
        return a(companion, j15, set, set2);
    }

    public static /* synthetic */ WindowSizeClass d(WindowSizeClass.Companion companion, long j15, Set set, Set set2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            set = d.f69781a.b();
        }
        if ((i15 & 4) != 0) {
            set2 = c.f69776a.a();
        }
        return c(companion, j15, set, set2);
    }
}
