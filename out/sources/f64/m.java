package f64;

import java.time.LocalDate;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import r54.VehicleReminderNotification;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010 \u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0082@¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0096B¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lf64/m;", "Ls54/k;", "Ls54/m;", "setNotificationsForDocumentUseCase", "Ls54/n;", "setNotificationsForVehiclesUseCase", "Ls54/g;", "removeNotificationsForDocumentUseCase", "Ls54/h;", "removeNotificationsForSubDocumentUseCase", "Ls54/d;", "provideVehiclesToLocalNotificationUseCase", "Lpx/d;", "remoteLogger", "Lc64/a;", "localNotificationsContainersInteractor", "<init>", "(Ls54/m;Ls54/n;Ls54/g;Ls54/h;Ls54/d;Lpx/d;Lc64/a;)V", "Lrq0/b;", "documentType", "Lr54/b;", "documentSubType", "", "containerId", "Ljava/time/LocalDate;", "expirationDate", "Loq/i0;", "f", "(Lrq0/b;Lr54/b;Ljava/lang/String;Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "", "Lr54/g;", "notifications", "h", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Ls54/k$a;", "params", "e", "(Ls54/k$a;Ltq/e;)Ljava/lang/Object;", "a", "Ls54/m;", "b", "Ls54/n;", "c", "Ls54/g;", "d", "Ls54/h;", "Ls54/d;", "Lpx/d;", "g", "Lc64/a;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements s54.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s54.m setNotificationsForDocumentUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s54.n setNotificationsForVehiclesUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s54.g removeNotificationsForDocumentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s54.h removeNotificationsForSubDocumentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s54.d provideVehiclesToLocalNotificationUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c64.a localNotificationsContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f59626d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f59627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f59628f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f59629g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f59630h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f59631j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f59632k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f59633l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f59635n;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f59633l = obj;
            this.f59635n |= PKIFailureInfo.systemUnavail;
            return m.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f59636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f59637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f59638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f59639g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f59640h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f59641j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f59642k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f59644m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f59642k = obj;
            this.f59644m |= PKIFailureInfo.systemUnavail;
            return m.this.f(null, null, null, null, this);
        }
    }

    public m(s54.m mVar, s54.n nVar, s54.g gVar, s54.h hVar, s54.d dVar, px.d dVar2, c64.a aVar) {
        this.setNotificationsForDocumentUseCase = mVar;
        this.setNotificationsForVehiclesUseCase = nVar;
        this.removeNotificationsForDocumentUseCase = gVar;
        this.removeNotificationsForSubDocumentUseCase = hVar;
        this.provideVehiclesToLocalNotificationUseCase = dVar;
        this.remoteLogger = dVar2;
        this.localNotificationsContainersInteractor = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r2.c(r3, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
    
        if (r2.c(r3, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        if (r11.c(r2, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(rq0.b r7, r54.b r8, java.lang.String r9, java.time.LocalDate r10, tq.e<? super oq.i0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f64.m.f(rq0.b, r54.b, java.lang.String, java.time.LocalDate, tq.e):java.lang.Object");
    }

    static /* synthetic */ Object g(m mVar, rq0.b bVar, r54.b bVar2, String str, LocalDate localDate, tq.e eVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            bVar2 = null;
        }
        if ((i15 & 4) != 0) {
            str = null;
        }
        return mVar.f(bVar, bVar2, str, localDate, eVar);
    }

    private final Object h(List<VehicleReminderNotification> list, tq.e<? super i0> eVar) {
        Object objC = this.setNotificationsForVehiclesUseCase.c(new s54.n.Params(list), eVar);
        return objC == uq.b.e() ? objC : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0359  */
    /* JADX WARN: Code duplicated, block: B:112:0x0379  */
    /* JADX WARN: Code duplicated, block: B:113:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:117:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:121:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:130:0x040c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0440  */
    /* JADX WARN: Code duplicated, block: B:133:0x0444  */
    /* JADX WARN: Code duplicated, block: B:135:0x0454  */
    /* JADX WARN: Code duplicated, block: B:139:0x047e  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x0113  */
    /* JADX WARN: Code duplicated, block: B:36:0x0117  */
    /* JADX WARN: Code duplicated, block: B:38:0x0127  */
    /* JADX WARN: Code duplicated, block: B:42:0x0151  */
    /* JADX WARN: Code duplicated, block: B:51:0x0173  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x028c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:94:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:95:0x031a  */
    /* JADX WARN: Code duplicated, block: B:97:0x031e  */
    /* JADX WARN: Code duplicated, block: B:99:0x032e  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0355, code lost:
    
        if (g(r1, r2, null, null, r4, r6, 6, null) == r0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03e8, code lost:
    
        if (g(r1, r2, null, null, r4, r6, 6, null) == r0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x047b, code lost:
    
        if (g(r1, r2, null, null, r4, r6, 6, null) == r0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04b4, code lost:
    
        if (r12.h((java.util.List) r2, r6) == r0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014d, code lost:
    
        if (g(r11, r2, null, null, r4, r6, 6, null) == r0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e1, code lost:
    
        if (g(r1, r2, null, null, r4, r6, 6, null) == r0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fa, code lost:
    
        if (r13 == r0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02c2, code lost:
    
        if (g(r11, r2, r3, null, r5, r6, 4, null) == r0) goto L149;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:112:0x0379, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:130:0x040c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00e0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0173, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x02e6, please report this as an issue */
    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(s54.k.Params r12, tq.e<? super oq.i0> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f64.m.c(s54.k$a, tq.e):java.lang.Object");
    }
}
