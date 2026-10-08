package wc4;

import fr.t;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Lwc4/c;", "Li84/b;", "Lho2/a;", "getSystemNotificationsStatusUseCase", "Lt74/b;", "updateNotDisplayedPushCountUC", "<init>", "(Lho2/a;Lt74/b;)V", "Li84/b$b;", "a", "(Ltq/e;)Ljava/lang/Object;", "Li84/b$a;", "operation", "Loq/i0;", "c", "(Li84/b$a;Ltq/e;)Ljava/lang/Object;", "Lho2/a;", "b", "Lt74/b;", "Lw74/a;", "Lw74/a;", "()Lw74/a;", "featureConfig", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements i84.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ho2.a getSystemNotificationsStatusUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t74.b updateNotDisplayedPushCountUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w74.a featureConfig = w74.a.MOBYWATEL;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f212177d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f212179f;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212177d = obj;
            this.f212179f |= PKIFailureInfo.systemUnavail;
            return c.this.a(this);
        }
    }

    public c(ho2.a aVar, t74.b bVar) {
        this.getSystemNotificationsStatusUseCase = aVar;
        this.updateNotDisplayedPushCountUC = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // i84.b
    public Object a(e<? super i84.b.InterfaceC2143b> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f212179f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f212179f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f212177d;
        Object objE = uq.b.e();
        int i16 = aVar.f212179f;
        if (i16 == 0) {
            u.b(objC);
            ho2.a aVar2 = this.getSystemNotificationsStatusUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f212179f = 1;
            objC = aVar2.c(c1792a, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        ho2.a.InterfaceC2001a interfaceC2001a = (ho2.a.InterfaceC2001a) objC;
        if (t.c(interfaceC2001a, ho2.a.InterfaceC2001a.b.f85987a)) {
            return i84.b.InterfaceC2143b.C2144b.f90328a;
        }
        if (t.c(interfaceC2001a, ho2.a.InterfaceC2001a.c.f85988a)) {
            return i84.b.InterfaceC2143b.c.f90329a;
        }
        if (t.c(interfaceC2001a, ho2.a.InterfaceC2001a.C2002a.f85986a)) {
            return i84.b.InterfaceC2143b.a.f90327a;
        }
        throw new p();
    }

    @Override // i84.b
    /* JADX INFO: renamed from: b, reason: from getter */
    public w74.a getFeatureConfig() {
        return this.featureConfig;
    }

    @Override // i84.b
    public Object c(i84.b.a aVar, e<? super i0> eVar) {
        t74.b.a overwrite;
        if (t.c(aVar, i84.b.a.C2142b.f90325a)) {
            overwrite = t74.b.a.C4900b.f188826a;
        } else if (t.c(aVar, i84.b.a.C2141a.f90324a)) {
            overwrite = t74.b.a.C4899a.f188825a;
        } else {
            if (!(aVar instanceof i84.b.a.Overwrite)) {
                throw new p();
            }
            overwrite = new t74.b.a.Overwrite(((i84.b.a.Overwrite) aVar).getNewValue());
        }
        this.updateNotDisplayedPushCountUC.a(new t74.b.Params(overwrite));
        return i0.f148189a;
    }
}
