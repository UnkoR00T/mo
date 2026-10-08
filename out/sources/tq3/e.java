package tq3;

import iq0.Announcements;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltq3/e;", "Lpq3/c;", "Lsq3/c;", "whatsNewDataSource", "Ltq3/c;", "getAnnouncementsToDisplayUseCase", "<init>", "(Lsq3/c;Ltq3/c;)V", "", "e", "(Ltq/e;)Ljava/lang/Object;", "Lgz/b$a$a;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lsq3/c;", "b", "Ltq3/c;", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements pq3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sq3.c whatsNewDataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c getAnnouncementsToDisplayUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191695d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191697f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f191695d = obj;
            this.f191697f |= PKIFailureInfo.systemUnavail;
            return e.this.e(this);
        }
    }

    public e(sq3.c cVar, c cVar2) {
        this.whatsNewDataSource = cVar;
        this.getAnnouncementsToDisplayUseCase = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f191697f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f191697f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f191695d;
        Object objE = uq.b.e();
        int i16 = aVar.f191697f;
        if (i16 == 0) {
            u.b(objA);
            c cVar = this.getAnnouncementsToDisplayUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f191697f = 1;
            objA = cVar.a(c1792a, aVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        return vq.b.a(!((Announcements) objA).a().isEmpty());
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) {
        return this.whatsNewDataSource.getShouldCheckWhatsNew().getAndSet(false) ? e(eVar) : vq.b.a(false);
    }
}
