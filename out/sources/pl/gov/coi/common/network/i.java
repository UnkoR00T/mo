package pl.gov.coi.common.network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpl/gov/coi/common/network/i;", "Lfv/q;", "", "Lpl/gov/coi/common/network/g;", "customDns", "Lpx/d;", "remoteLogger", "<init>", "(Ljava/util/List;Lpx/d;)V", "", "hostname", "Ljava/net/InetAddress;", "a", "(Ljava/lang/String;)Ljava/util/List;", "c", "Ljava/util/List;", "d", "Lpx/d;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements fv.q {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<CustomDns> customDns;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    public i(List<CustomDns> list, px.d dVar) {
        this.customDns = list;
        this.remoteLogger = dVar;
    }

    @Override // fv.q
    public List<InetAddress> a(String hostname) {
        InetAddress byName;
        px.f.f163100a.b("Resolving DNS, lookup for hostname: " + hostname, px.c.a(this));
        List<CustomDns> list = this.customDns;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (fu.r.b0(hostname, ((CustomDns) obj).getHostname(), true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<String> listB = ((CustomDns) it.next()).b();
            ArrayList arrayList3 = new ArrayList();
            for (String str : listB) {
                try {
                    byName = InetAddress.getByName(str);
                    this.remoteLogger.F8("Resolved custom DNS: " + hostname + ", IP: " + str + '}', px.d.a.NETWORK);
                } catch (UnknownHostException e15) {
                    this.remoteLogger.F8("Failed to resolve custom DNS: " + hostname + ", IP: " + str + ", error: " + e15.getMessage(), px.d.a.NETWORK);
                    byName = null;
                }
                if (byName != null) {
                    arrayList3.add(byName);
                }
            }
            pq.v.D(arrayList2, arrayList3);
        }
        return !arrayList2.isEmpty() ? arrayList2 : fv.q.f67483b.a(hostname);
    }
}
