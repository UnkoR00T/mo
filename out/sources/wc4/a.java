package wc4;

import dx.i;
import j84.NotificationsHistoryData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kt0.NotificationRecord;
import kt0.NotificationsHistoryModel;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lwc4/a;", "Li84/a;", "Llt0/c;", "loadNotificationsHistoryUseCase", "<init>", "(Llt0/c;)V", "Ldx/i;", "Ldx/b;", "Lj84/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "Llt0/c;", "Lw74/a;", "b", "Lw74/a;", "()Lw74/a;", "featureConfig", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements i84.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lt0.c loadNotificationsHistoryUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w74.a featureConfig = w74.a.MOBYWATEL;

    /* JADX INFO: renamed from: wc4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5591a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f212170d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f212172f;

        C5591a(e<? super C5591a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212170d = obj;
            this.f212172f |= PKIFailureInfo.systemUnavail;
            return a.this.a(this);
        }
    }

    public a(lt0.c cVar) {
        this.loadNotificationsHistoryUseCase = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // i84.a
    public Object a(e<? super i<? extends dx.b, NotificationsHistoryData>> eVar) throws Throwable {
        C5591a c5591a;
        ArrayList arrayList;
        if (eVar instanceof C5591a) {
            c5591a = (C5591a) eVar;
            int i15 = c5591a.f212172f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5591a.f212172f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c5591a = new C5591a(eVar);
            }
        } else {
            c5591a = new C5591a(eVar);
        }
        Object objC = c5591a.f212170d;
        Object objE = uq.b.e();
        int i16 = c5591a.f212172f;
        if (i16 == 0) {
            u.b(objC);
            lt0.c cVar = this.loadNotificationsHistoryUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            c5591a.f212172f = 1;
            objC = cVar.c(c1792a, c5591a);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List<NotificationRecord> listA = ((NotificationsHistoryModel) ((i.Right) iVar).b()).a();
        if (listA != null) {
            List<NotificationRecord> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b.d((NotificationRecord) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new i.Right(new NotificationsHistoryData(arrayList));
    }

    @Override // i84.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public w74.a getFeatureConfig() {
        return this.featureConfig;
    }
}
