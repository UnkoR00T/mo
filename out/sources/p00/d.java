package p00;

import fu.r;
import fv.b0;
import fv.d0;
import fv.v;
import fv.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lp00/d;", "Lfv/w;", "Lpl/gov/coi/common/network/k;", "dynamicBaseUrlProvider", "<init>", "(Lpl/gov/coi/common/network/k;)V", "Lfv/w$a;", "chain", "Lfv/d0;", "a", "(Lfv/w$a;)Lfv/d0;", "Lpl/gov/coi/common/network/k;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k dynamicBaseUrlProvider;

    public d(k kVar) {
        this.dynamicBaseUrlProvider = kVar;
    }

    @Override // fv.w
    public d0 a(w.a chain) {
        b0 b0VarC = chain.C();
        v url = b0VarC.getUrl();
        v vVarA = this.dynamicBaseUrlProvider.a();
        v.a aVarI = b0VarC.getUrl().k().s(vVarA.getScheme()).i(vVarA.getHost());
        aVarI.f("/");
        List<String> listM = vVarA.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (!r.t0((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVarI.b((String) it.next());
        }
        List<String> listM2 = url.m();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM2) {
            if (!r.t0((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            aVarI.b((String) it4.next());
        }
        return chain.a(b0VarC.i().j(aVarI.o(vVarA.getPort()).d()).b());
    }
}
