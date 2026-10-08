package f64;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import r54.LocalDocumentNotification;
import y54.DocumentNotificationConfigItem;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf64/o;", "Ls54/m;", "Le64/b;", "localNotificationsRepository", "<init>", "(Le64/b;)V", "Ls54/m$a;", "params", "Loq/i0;", "d", "(Ls54/m$a;Ltq/e;)Ljava/lang/Object;", "a", "Le64/b;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements s54.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e64.b localNotificationsRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f59647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f59648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f59649f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f59650g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f59651h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f59652j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f59653k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f59654l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f59655m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f59656n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f59658q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f59656n = obj;
            this.f59658q |= PKIFailureInfo.systemUnavail;
            return o.this.c(null, this);
        }
    }

    public o(e64.b bVar) {
        this.localNotificationsRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(s54.m.Params params, tq.e<? super i0> eVar) throws Throwable {
        a aVar;
        List<DocumentNotificationConfigItem> listE;
        List<DocumentNotificationConfigItem> list;
        Iterable iterable;
        Iterable iterable2;
        s54.m.Params params2;
        Iterator it;
        int i15;
        String strName;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i16 = aVar.f59658q;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f59658q = i16 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f59656n;
        Object objE = uq.b.e();
        int i17 = aVar.f59658q;
        if (i17 == 0) {
            u.b(obj);
            rq0.b documentType = params.getDocumentType();
            ArrayList arrayList = null;
            if (documentType == rq0.b.d.ID_CARD) {
                listE = t54.a.f187954a.c();
            } else if (documentType == rq0.b.d.FAMILY_CARD) {
                listE = t54.a.f187954a.b();
            } else if (documentType == rq0.b.d.RAILWAY_CARD) {
                listE = t54.a.f187954a.h();
            } else if (documentType == rq0.b.d.DRIVING_LICENCE) {
                t54.a aVar2 = t54.a.f187954a;
                List<DocumentNotificationConfigItem> listG = aVar2.g();
                if (params.getDocumentSubType() != r54.b.TEMPORARY_DRIVING_LICENCE) {
                    listG = null;
                }
                listE = listG == null ? aVar2.a() : listG;
            } else if (documentType == rq0.b.d.STUDENT_CARD) {
                listE = t54.a.f187954a.f();
            } else {
                listE = documentType == rq0.b.EnumC4479b.SOLIDARITY_CARD ? t54.a.f187954a.e() : null;
            }
            if (listE != null) {
                List<DocumentNotificationConfigItem> list2 = listE;
                arrayList = new ArrayList(v.y(list2, 10));
                for (DocumentNotificationConfigItem documentNotificationConfigItem : list2) {
                    String strB = documentNotificationConfigItem.b();
                    String string = params.getDocumentType().toString();
                    r54.b documentSubType = params.getDocumentSubType();
                    if (documentSubType == null || (strName = documentSubType.name()) == null) {
                        strName = "";
                    }
                    arrayList.add(new LocalDocumentNotification(strB, string, strName, params.getExpirationDate(), y54.e.a(params.getExpirationDate(), documentNotificationConfigItem.getReminderPeriod()), r54.e.SCHEDULED));
                }
            }
            if (arrayList != null) {
                list = listE;
                iterable = arrayList;
                iterable2 = iterable;
                params2 = params;
                it = arrayList.iterator();
                i15 = 0;
            } else {
                px.f.e(px.f.f163100a, "No notification configuration for the document " + params.getDocumentType(), null, px.c.a(this), 2, null);
            }
            return i0.f148189a;
        }
        if (i17 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i15 = aVar.f59654l;
        it = (Iterator) aVar.f59651h;
        iterable = (Iterable) aVar.f59650g;
        iterable2 = (List) aVar.f59649f;
        list = (List) aVar.f59648e;
        s54.m.Params params3 = (s54.m.Params) aVar.f59647d;
        u.b(obj);
        params2 = params3;
        while (it.hasNext()) {
            Object next = it.next();
            LocalDocumentNotification localDocumentNotification = (LocalDocumentNotification) next;
            e64.b bVar = this.localNotificationsRepository;
            aVar.f59647d = params2;
            aVar.f59648e = vq.j.a(list);
            aVar.f59649f = vq.j.a(iterable2);
            aVar.f59650g = vq.j.a(iterable);
            aVar.f59651h = it;
            aVar.f59652j = vq.j.a(next);
            aVar.f59653k = vq.j.a(localDocumentNotification);
            aVar.f59654l = i15;
            aVar.f59655m = 0;
            aVar.f59658q = 1;
            if (bVar.n(localDocumentNotification, aVar) == objE) {
                return objE;
            }
        }
        return i0.f148189a;
    }
}
