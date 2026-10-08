package bc4;

import fr.t;
import fu.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u0082\u0002\u0010\n\u000e\b\u0000\u0012\u0002\u0018\u0001\u001a\u0006\u0010\u0000\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbc4/l$a;", "", "extension", "", "Lbc4/l$a$b;", "a", "(Lbc4/l$a;Ljava/lang/String;)Z", "contract"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final boolean a(l.a aVar, String str) {
        if (t.c(aVar, l.a.C0456a.f18210a)) {
            return true;
        }
        if (!(aVar instanceof l.a.Limited)) {
            throw new oq.p();
        }
        Set<wx.d> setA = ((l.a.Limited) aVar).a();
        if ((setA instanceof Collection) && setA.isEmpty()) {
            return false;
        }
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            if (r.G(((wx.d) it.next()).getValue(), str, true)) {
                return true;
            }
        }
        return false;
    }
}
