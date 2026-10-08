package f64;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import r54.LocalDocumentNotification;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0012*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0096B¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lf64/q;", "Ls54/o;", "Lq54/a;", "localNotificationManager", "Le64/b;", "localNotificationsRepository", "Ls54/a;", "areDocumentNotificationSettingsEnabledUseCase", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "Lpx/d;", "remoteLogger", "Lmx/c;", "labelProvider", "<init>", "(Lq54/a;Le64/b;Ls54/a;Lez/e;Lez/a;Lpx/d;Lmx/c;)V", "", "message", "", "Lpx/a;", "tags", "Loq/i0;", "f", "(Ljava/lang/String;Ljava/util/List;)V", "Lr54/a;", "d", "(Lr54/a;)Ljava/lang/String;", "Ls54/o$a;", "params", "e", "(Ls54/o$a;Ltq/e;)Ljava/lang/Object;", "a", "Lq54/a;", "b", "Le64/b;", "c", "Ls54/a;", "Lez/e;", "Lez/a;", "Lpx/d;", "g", "Lmx/c;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements s54.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q54.a localNotificationManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e64.b localNotificationsRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s54.a areDocumentNotificationSettingsEnabledUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f59681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f59682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f59683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f59684g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f59686j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f59684g = obj;
            this.f59686j |= PKIFailureInfo.systemUnavail;
            return q.this.c(null, this);
        }
    }

    public q(q54.a aVar, e64.b bVar, s54.a aVar2, ez.e eVar, ez.a aVar3, px.d dVar, mx.c cVar) {
        this.localNotificationManager = aVar;
        this.localNotificationsRepository = bVar;
        this.areDocumentNotificationSettingsEnabledUseCase = aVar2;
        this.dateFormatter = eVar;
        this.currentTimeProvider = aVar3;
        this.remoteLogger = dVar;
        this.labelProvider = cVar;
    }

    private final String d(LocalDocumentNotification localDocumentNotification) {
        String documentSubType = localDocumentNotification.getDocumentSubType();
        if (documentSubType.length() <= 0) {
            documentSubType = null;
        }
        if (documentSubType != null) {
            String str = localDocumentNotification.getDocumentType() + '/' + documentSubType;
            if (str != null) {
                return str;
            }
        }
        return localDocumentNotification.getDocumentType();
    }

    private final void f(String message, List<? extends px.a> tags) {
        this.remoteLogger.u6(message + " at: " + this.dateFormatter.d(new fz.b.OffsetDateTime(this.currentTimeProvider.f()), fz.c.DOTTED_PLUS_HOUR_WITH_SEC), v.L0(v.e(new px.a.Feature("LocalNotifications")), tags));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
    
        if (r13.c(r5, r7, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016a, code lost:
    
        if (r13.c(r2, r6, r0) == r1) goto L41;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(s54.o.Params r12, tq.e<? super oq.i0> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f64.q.c(s54.o$a, tq.e):java.lang.Object");
    }
}
