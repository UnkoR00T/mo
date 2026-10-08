package j64;

import ay.DomainCertificates;
import er.l;
import fr.t;
import iq0.TrustedCertificates;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import px.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 ¨\u0006\""}, d2 = {"Lj64/c;", "Lq64/c;", "Lez/a;", "currentTimeProvider", "<init>", "(Lez/a;)V", "", "Lay/f;", "domains", "Loq/i0;", "g", "(Ljava/util/List;)V", "", "f", "()Z", "Liq0/h0;", "d", "()Liq0/h0;", "certificates", "c", "(Liq0/h0;)V", "", "domain", "b", "(Ljava/lang/String;)Lay/f;", "domainCertificates", "a", "(Lay/f;)V", "Lez/a;", "", "Ljava/util/List;", "", "J", "cacheTime", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements q64.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<DomainCertificates> certificates = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long cacheTime;

    public c(ez.a aVar) {
        this.currentTimeProvider = aVar;
    }

    private final boolean f() {
        return this.cacheTime + ((long) 3600000) > this.currentTimeProvider.a();
    }

    private final void g(final List<DomainCertificates> domains) {
        f.f163100a.b("update: " + domains, px.c.a(this));
        v.J(this.certificates, new l() { // from class: j64.b
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(c.h(domains, (DomainCertificates) obj));
            }
        });
        this.certificates.addAll(domains);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(List list, DomainCertificates domainCertificates) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (t.c(domainCertificates.getDomain(), ((DomainCertificates) it.next()).getDomain())) {
                return true;
            }
        }
        return false;
    }

    @Override // q64.c
    public void a(DomainCertificates domainCertificates) {
        g(v.e(domainCertificates));
    }

    @Override // q64.c
    public DomainCertificates b(String domain) {
        List<DomainCertificates> list = this.certificates;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (t.c(((DomainCertificates) obj).getDomain(), domain)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v.D(arrayList2, ((DomainCertificates) it.next()).a());
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new DomainCertificates(domain, arrayList2);
    }

    @Override // q64.c
    public void c(TrustedCertificates certificates) {
        this.cacheTime = this.currentTimeProvider.a();
        g(certificates.a());
    }

    @Override // q64.c
    public TrustedCertificates d() {
        TrustedCertificates trustedCertificates = new TrustedCertificates(this.certificates);
        if (f()) {
            return trustedCertificates;
        }
        return null;
    }
}
