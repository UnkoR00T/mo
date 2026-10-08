package yn;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends l implements Iterable<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<l> f228068a = new ArrayList<>();

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof i) && ((i) obj).f228068a.equals(this.f228068a);
        }
        return true;
    }

    public int hashCode() {
        return this.f228068a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<l> iterator() {
        return this.f228068a.iterator();
    }

    public void l(l lVar) {
        if (lVar == null) {
            lVar = n.f228069a;
        }
        this.f228068a.add(lVar);
    }
}
