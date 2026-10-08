package no2;

import a14.s;
import android.content.Intent;
import ez.e;
import java.io.Serializable;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import px.d;
import px.f;
import r54.c;
import vq.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lno2/b;", "Lno2/a;", "La14/s;", "launchAppUseCase", "Lpx/d;", "remoteLogger", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "<init>", "(La14/s;Lpx/d;Lez/e;Lez/a;)V", "Lr54/c;", "item", "Loq/i0;", "b", "(Lr54/c;)V", "Landroid/content/Intent;", "intent", "", "a", "(Landroid/content/Intent;Ltq/e;)Ljava/lang/Object;", "La14/s;", "Lpx/d;", "c", "Lez/e;", "d", "Lez/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements no2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s launchAppUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d remoteLogger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f137565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f137566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f137567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f137568g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f137569h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f137571k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f137569h = obj;
            this.f137571k |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    public b(s sVar, d dVar, e eVar, ez.a aVar) {
        this.launchAppUseCase = sVar;
        this.remoteLogger = dVar;
        this.dateFormatter = eVar;
        this.currentTimeProvider = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0020  */
    private final void b(c item) {
        String documentReferenceName;
        String documentSubTypeReferenceName = item.getDocumentSubTypeReferenceName();
        if (documentSubTypeReferenceName != null) {
            documentReferenceName = item.getDocumentReferenceName() + '/' + documentSubTypeReferenceName;
            if (documentReferenceName == null) {
                documentReferenceName = item.getDocumentReferenceName();
            }
        } else {
            documentReferenceName = item.getDocumentReferenceName();
        }
        this.remoteLogger.u6("Local notification clicked for " + documentReferenceName + " at: " + this.dateFormatter.d(new fz.b.OffsetDateTime(this.currentTimeProvider.f()), fz.c.DOTTED_PLUS_HOUR_WITH_SEC), v.q(new px.a.Feature("LocalNotifications"), new px.a.Custom("Type", documentReferenceName), new px.a.Custom("Event", "DISPLAYED")));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mz.k
    public Object a(Intent intent, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        c cVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f137571k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f137571k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f137569h;
        Object objE = uq.b.e();
        int i16 = aVar.f137571k;
        if (i16 == 0) {
            u.b(obj);
            Serializable serializableExtra = intent.getSerializableExtra("localNotification");
            c cVar2 = serializableExtra instanceof c ? (c) serializableExtra : null;
            if (cVar2 == null) {
                return vq.b.a(false);
            }
            f.f163100a.b("Handling intent, local notification path", px.c.a(this));
            s.Params params = new s.Params(t64.b.a.f188027a, new tj2.b.ToLogin(new tj2.b.ToLogin.AbstractC4973a.DefaultWithLocalNotificationRedirection(false, cVar2, 1, null)), new tg1.a.NavigateToNotificationDocument(cVar2));
            s sVar = this.launchAppUseCase;
            aVar.f137565d = j.a(intent);
            aVar.f137566e = cVar2;
            aVar.f137567f = j.a(params);
            aVar.f137568g = 0;
            aVar.f137571k = 1;
            if (sVar.c(params, aVar) == objE) {
                return objE;
            }
            cVar = cVar2;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) aVar.f137566e;
            u.b(obj);
        }
        b(cVar);
        return vq.b.a(true);
    }
}
