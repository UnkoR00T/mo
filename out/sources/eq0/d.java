package eq0;

import ay.h;
import ay.j;
import dq0.ReportIncidentRequestDto;
import dq0.ReportIncidentTypesResponse;
import dq0.ReportedIncidentsResponse;
import dx.i;
import er.l;
import ge4.x;
import java.time.OffsetDateTime;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.HttpServiceParameters;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.serializer.ZonedDateTimeSerializer;
import pl.gov.coi.common.network.w;
import pl.gov.coi.common.network.y;
import zp0.BEReportIncidentRequest;
import zp0.BEReportIncidentTypes;
import zp0.BEReportedIncidents;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0014J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Leq0/d;", "Lgq0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lez/a;", "currentTimeProvider", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lez/c;", "dateConverter", "Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;", "zonedDateTimeSerializer", "Lay/h;", "jsonFactory", "<init>", "(Lpl/gov/coi/common/network/w;Lez/a;Lpl/gov/coi/common/network/g0;Lez/c;Lpl/gov/coi/common/network/serializer/ZonedDateTimeSerializer;Lay/h;)V", "Ldx/i;", "Ldx/b;", "Lzp0/n;", "c", "(Ltq/e;)Ljava/lang/Object;", "Lzp0/q;", "a", "Lzp0/l;", "request", "Loq/i0;", "b", "(Lzp0/l;Ltq/e;)Ljava/lang/Object;", "Lez/a;", "Lpl/gov/coi/common/network/g0;", "Lez/c;", "Lay/j;", "d", "Lay/j;", "offsetDateTimeSerialize", "Lbq0/b;", "e", "Loq/k;", "h", "()Lbq0/b;", "client", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j offsetDateTimeSerialize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f52736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f52738f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f52739g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f52740h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f52741j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f52742k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f52743l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f52744m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f52745n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f52747q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f52745n = obj;
            this.f52747q |= PKIFailureInfo.systemUnavail;
            return d.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ldq0/c0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<ReportIncidentTypesResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52748e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f52748e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            bq0.b bVarH = d.this.h();
            this.f52748e = 1;
            Object objB = bVarH.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ReportIncidentTypesResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f52750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f52752f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f52753g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f52754h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f52755j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f52756k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f52757l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f52758m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f52759n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f52761q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f52759n = obj;
            this.f52761q |= PKIFailureInfo.systemUnavail;
            return d.this.a(this);
        }
    }

    /* JADX INFO: renamed from: eq0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ldq0/h0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C1242d extends vq.k implements l<tq.e<? super x<ReportedIncidentsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52762e;

        C1242d(tq.e<? super C1242d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f52762e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            bq0.b bVarH = d.this.h();
            this.f52762e = 1;
            Object objA = bVarH.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new C1242d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ReportedIncidentsResponse>> eVar) {
            return ((C1242d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f52764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f52765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f52766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f52767g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f52768h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f52769j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f52770k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f52771l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f52772m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52773n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f52774p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f52776r;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f52774p = obj;
            this.f52776r |= PKIFailureInfo.systemUnavail;
            return d.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52777e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f52779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BEReportIncidentRequest f52780h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ex.b<? super dx.b> bVar, BEReportIncidentRequest bEReportIncidentRequest, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f52779g = bVar;
            this.f52780h = bEReportIncidentRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f52777e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            bq0.b bVarH = d.this.h();
            ReportIncidentRequestDto reportIncidentRequestDto = (ReportIncidentRequestDto) this.f52779g.a(cq0.a.D(this.f52780h, d.this.dateConverter));
            this.f52777e = 1;
            Object objC = bVarH.c(reportIncidentRequestDto, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new f(this.f52779g, this.f52780h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, ez.a aVar, g0 g0Var, ez.c cVar, ZonedDateTimeSerializer zonedDateTimeSerializer, h hVar) {
        this.currentTimeProvider = aVar;
        this.networkCallMediator = g0Var;
        this.dateConverter = cVar;
        this.offsetDateTimeSerialize = hVar.c(OffsetDateTime.class, zonedDateTimeSerializer);
        this.client = oq.l.a(new er.a() { // from class: eq0.c
            @Override // er.a
            public final Object a() {
                return d.g(this.f52729a, wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bq0.b g(d dVar, w wVar) {
        return (bq0.b) wVar.a(new y.Backend(new y.b.C3925b(new HttpServiceParameters(null, dVar.offsetDateTimeSerialize, 1, null))), bq0.b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bq0.b h() {
        return (bq0.b) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0084, B:33:0x00a7, B:30:0x008b, B:32:0x008f, B:34:0x00b3, B:35:0x00b8, B:42:0x00c8, B:45:0x00d6), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008f A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0084, B:33:0x00a7, B:30:0x008b, B:32:0x008f, B:34:0x00b3, B:35:0x00b8, B:42:0x00c8, B:45:0x00d6), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0084, B:33:0x00a7, B:30:0x008b, B:32:0x008f, B:34:0x00b3, B:35:0x00b8, B:42:0x00c8, B:45:0x00d6), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [eq0.d$c, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // gq0.b
    public Object a(tq.e<? super i<? extends dx.b, BEReportedIncidents>> eVar) throws Throwable {
        ?? cVar;
        Object objB;
        ex.c e15;
        ex.b aVar;
        ex.b bVar;
        i right;
        if (eVar instanceof c) {
            c cVar2 = (c) eVar;
            int i15 = cVar2.f52761q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f52761q = i15 - PKIFailureInfo.systemUnavail;
                cVar = cVar2;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f52759n;
        Object objE = uq.b.e();
        int i16 = cVar.f52761q;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) cVar.f52758m;
                    aVar = (ex.b) cVar.f52757l;
                    try {
                        u.b(obj);
                        right = (i) obj;
                        if (!(right instanceof i.Left)) {
                            if (right instanceof i.Right) {
                                throw new p();
                            }
                            right = new i.Right((BEReportedIncidents) aVar.a(cq0.a.n((ReportedIncidentsResponse) ((i.Right) right).b())));
                        }
                        return new i.Right((BEReportedIncidents) bVar.a(right));
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    aVar = new ex.a();
                    g0 g0Var = this.networkCallMediator;
                    C1242d c1242d = new C1242d(null);
                    cVar.f52755j = jVarA;
                    cVar.f52756k = vq.j.a(aVar);
                    cVar.f52757l = aVar;
                    cVar.f52758m = aVar;
                    cVar.f52750d = 0;
                    cVar.f52751e = 0;
                    cVar.f52752f = 0;
                    cVar.f52753g = 0;
                    cVar.f52754h = 0;
                    cVar.f52761q = 1;
                    Object objB2 = g0Var.b(c1242d, cVar);
                    if (objB2 == objE) {
                        return objE;
                    }
                    obj = objB2;
                    bVar = aVar;
                    right = (i) obj;
                    if (!(right instanceof i.Left)) {
                        if (right instanceof i.Right) {
                            throw new p();
                        }
                        right = new i.Right((BEReportedIncidents) aVar.a(cq0.a.n((ReportedIncidentsResponse) ((i.Right) right).b())));
                    }
                    return new i.Right((BEReportedIncidents) bVar.a(right));
                } catch (ex.c e18) {
                    e15 = e18;
                    return new i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e19) {
                    throw e19;
                } catch (Exception e25) {
                    cVar = jVarA;
                    e = e25;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(cVar));
                    i iVarA = cVar.a(e);
                    if (iVarA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) iVarA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gq0.b
    public Object b(BEReportIncidentRequest bEReportIncidentRequest, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        e eVar2;
        Object objB;
        ex.b bVar;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f52776r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f52776r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f52774p;
        ?? E = uq.b.e();
        int i16 = eVar2.f52776r;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        g0 g0Var = this.networkCallMediator;
                        f fVar = new f(aVar, bEReportIncidentRequest, null);
                        eVar2.f52764d = vq.j.a(bEReportIncidentRequest);
                        eVar2.f52765e = jVarA;
                        eVar2.f52766f = vq.j.a(aVar);
                        eVar2.f52767g = vq.j.a(aVar);
                        eVar2.f52768h = aVar;
                        eVar2.f52769j = 0;
                        eVar2.f52770k = 0;
                        eVar2.f52771l = 0;
                        eVar2.f52772m = 0;
                        eVar2.f52773n = 0;
                        eVar2.f52776r = 1;
                        Object objB2 = g0Var.b(fVar, eVar2);
                        if (objB2 == E) {
                            return E;
                        }
                        obj = objB2;
                        bVar = aVar;
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar2 = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(E));
                        i iVarA = E.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) eVar2.f52768h;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                bVar.a((i) obj);
                return new i.Right(i0.f148189a);
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0084, B:33:0x00a9, B:30:0x008b, B:32:0x008f, B:34:0x00b5, B:35:0x00ba, B:42:0x00ca, B:45:0x00d8), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008f A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0084, B:33:0x00a9, B:30:0x008b, B:32:0x008f, B:34:0x00b5, B:35:0x00ba, B:42:0x00ca, B:45:0x00d8), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0084, B:33:0x00a9, B:30:0x008b, B:32:0x008f, B:34:0x00b5, B:35:0x00ba, B:42:0x00ca, B:45:0x00d8), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [eq0.d$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // gq0.b
    public Object c(tq.e<? super i<? extends dx.b, BEReportIncidentTypes>> eVar) throws Throwable {
        ?? aVar;
        Object objB;
        ex.c e15;
        ex.b aVar2;
        ex.b bVar;
        i right;
        if (eVar instanceof a) {
            a aVar3 = (a) eVar;
            int i15 = aVar3.f52747q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar3.f52747q = i15 - PKIFailureInfo.systemUnavail;
                aVar = aVar3;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f52745n;
        Object objE = uq.b.e();
        int i16 = aVar.f52747q;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar.f52744m;
                    aVar2 = (ex.b) aVar.f52743l;
                    try {
                        u.b(obj);
                        right = (i) obj;
                        if (!(right instanceof i.Left)) {
                            if (right instanceof i.Right) {
                                throw new p();
                            }
                            right = new i.Right((BEReportIncidentTypes) aVar2.a(cq0.a.j((ReportIncidentTypesResponse) ((i.Right) right).b(), this.currentTimeProvider)));
                        }
                        return new i.Right((BEReportIncidentTypes) bVar.a(right));
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    aVar2 = new ex.a();
                    g0 g0Var = this.networkCallMediator;
                    b bVar2 = new b(null);
                    aVar.f52741j = jVarA;
                    aVar.f52742k = vq.j.a(aVar2);
                    aVar.f52743l = aVar2;
                    aVar.f52744m = aVar2;
                    aVar.f52736d = 0;
                    aVar.f52737e = 0;
                    aVar.f52738f = 0;
                    aVar.f52739g = 0;
                    aVar.f52740h = 0;
                    aVar.f52747q = 1;
                    Object objB2 = g0Var.b(bVar2, aVar);
                    if (objB2 == objE) {
                        return objE;
                    }
                    obj = objB2;
                    bVar = aVar2;
                    right = (i) obj;
                    if (!(right instanceof i.Left)) {
                        if (right instanceof i.Right) {
                            throw new p();
                        }
                        right = new i.Right((BEReportIncidentTypes) aVar2.a(cq0.a.j((ReportIncidentTypesResponse) ((i.Right) right).b(), this.currentTimeProvider)));
                    }
                    return new i.Right((BEReportIncidentTypes) bVar.a(right));
                } catch (ex.c e18) {
                    e15 = e18;
                    return new i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e19) {
                    throw e19;
                } catch (Exception e25) {
                    aVar = jVarA;
                    e = e25;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(aVar));
                    i iVarA = aVar.a(e);
                    if (iVarA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) iVarA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }
}
