package yn;

import ao.b0;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0<String, l> f228070a = new b0<>(false);

    public Set<Map.Entry<String, l>> entrySet() {
        return this.f228070a.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof o) && ((o) obj).f228070a.equals(this.f228070a);
        }
        return true;
    }

    public int hashCode() {
        return this.f228070a.hashCode();
    }

    public void l(String str, l lVar) {
        b0<String, l> b0Var = this.f228070a;
        if (lVar == null) {
            lVar = n.f228069a;
        }
        b0Var.put(str, lVar);
    }
}
