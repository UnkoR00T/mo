package fa;

import ea.NavEntry;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "T", "Lfa/s;", "Lfa/t;", "scope", "", "Lea/m;", "entries", "Lfa/h;", "a", "(Lfa/s;Lfa/t;Ljava/util/List;)Lfa/h;", "navigation3-ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class z {
    public static final <T> h<T> a(s<T> sVar, t<T> tVar, List<NavEntry<T>> list) {
        h<T> hVarA = sVar.a(tVar, list);
        return hVarA == null ? new a0().a(tVar, list) : hVarA;
    }
}
