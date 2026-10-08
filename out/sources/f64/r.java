package f64;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0096B¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lf64/r;", "Ls54/p;", "Lq54/a;", "localNotificationManager", "Le64/b;", "localNotificationsRepository", "Ls54/a;", "areDocumentNotificationSettingsEnabledUseCase", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "Lpx/d;", "remoteLogger", "Lmx/c;", "labelProvider", "<init>", "(Lq54/a;Le64/b;Ls54/a;Lez/e;Lez/a;Lpx/d;Lmx/c;)V", "", "message", "", "Lpx/a;", "tags", "Loq/i0;", "e", "(Ljava/lang/String;Ljava/util/List;)V", "Ls54/p$a;", "params", "d", "(Ls54/p$a;Ltq/e;)Ljava/lang/Object;", "a", "Lq54/a;", "b", "Le64/b;", "c", "Ls54/a;", "Lez/e;", "Lez/a;", "f", "Lpx/d;", "g", "Lmx/c;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements s54.p {

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
        Object f59694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f59695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f59696f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f59697g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f59699j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f59697g = obj;
            this.f59699j |= PKIFailureInfo.systemUnavail;
            return r.this.c(null, this);
        }
    }

    public r(q54.a aVar, e64.b bVar, s54.a aVar2, ez.e eVar, ez.a aVar3, px.d dVar, mx.c cVar) {
        this.localNotificationManager = aVar;
        this.localNotificationsRepository = bVar;
        this.areDocumentNotificationSettingsEnabledUseCase = aVar2;
        this.dateFormatter = eVar;
        this.currentTimeProvider = aVar3;
        this.remoteLogger = dVar;
        this.labelProvider = cVar;
    }

    private final void e(String message, List<? extends px.a> tags) {
        this.remoteLogger.u6(message + " at: " + this.dateFormatter.d(new fz.b.OffsetDateTime(this.currentTimeProvider.f()), fz.c.DOTTED_PLUS_HOUR_WITH_SEC), v.L0(v.e(new px.a.Feature("LocalNotifications")), tags));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        if (r13.g(r5, r7, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0165, code lost:
    
        if (r13.g(r2, r6, r0) == r1) goto L37;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(s54.p.Params r12, tq.e<? super oq.i0> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f64.r.c(s54.p$a, tq.e):java.lang.Object");
    }
}
