package pc4;

import er0.BEDocumentStatus;
import i34.IdentityDeactivateData;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v04.ShowSnackbarEvent;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jw\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lpc4/q2;", "", "<init>", "()V", "Lbh1/b;", "documentsSettingsDataStoreRepository", "Lv64/f;", "clearSessionDataUC", "La84/b;", "clearNotificationDeviceTokenUseCase", "Lmz3/t;", "removeAllDocumentsDownloadStatusesUC", "Lh64/u;", "refreshServicesUseCase", "Lby0/a;", "clearAirQualityCacheUC", "Lu34/b;", "documentsSummaryLocalRepository", "Lmz3/h;", "clearTaskDataUC", "Lgx/d;", "globalEventManager", "Lmx/c;", "labelProvider", "Lmz3/z;", "updateDocumentAsyncUC", "Lq34/u1;", "onDocumentContainerChangedEventUC", "Ld14/b;", "removeFileFromStorageUseCase", "Ls24/b;", "a", "(Lbh1/b;Lv64/f;La84/b;Lmz3/t;Lh64/u;Lby0/a;Lu34/b;Lmz3/h;Lgx/d;Lmx/c;Lmz3/z;Lq34/u1;Ld14/b;)Ls24/b;", "Ls24/a;", "c", "(Lmx/c;)Ls24/a;", "Lac4/d;", "getCurrentServerTimeUseCase", "Ls24/d;", "d", "(Lac4/d;)Ls24/d;", "Ls54/g;", "removeNotificationsForDocumentUseCase", "Ls24/c;", "b", "(Ls54/g;)Ls24/c;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q2 f155476a = new q2();

    @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\u000f\u0010\u000eJ,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u000eJ@\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u001f\u0010\fJ,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b \u0010\u0012¨\u0006!"}, d2 = {"pc4/q2$a", "Ls24/b;", "", "fileName", "Ldx/i;", "Ldx/b;", "Loq/i0;", "g", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lf24/i;", "documentType", "h", "(Lf24/i;Ltq/e;)Ljava/lang/Object;", "d", "(Ltq/e;)Ljava/lang/Object;", "e", "documentId", "i", "(Lf24/i;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "f", "Lfz/b$c;", "expirationDate", "", "saveNewDocument", "c", "(Lf24/i;Ljava/lang/String;Lfz/b$c;ZLtq/e;)Ljava/lang/Object;", "isCertRevoked", "Ler0/c;", "status", "b", "(Lf24/i;ZLer0/c;Ltq/e;)Ljava/lang/Object;", "j", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements s24.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d14.b f155477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bh1.b f155478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u34.b f155479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v64.f f155480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a84.b f155481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ mz3.t f155482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h64.u f155483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ by0.a f155484h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ mz3.h f155485i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ mz3.z f155486j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ mx.c f155487k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ gx.d f155488l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ q34.u1 f155489m;

        /* JADX INFO: renamed from: pc4.q2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3856a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155490d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155491e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155492f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155493g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155494h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155495j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155496k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155497l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155498m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155499n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155500p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155501q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f155502r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f155503s;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f155505v;

            C3856a(tq.e<? super C3856a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155503s = obj;
                this.f155505v |= PKIFailureInfo.systemUnavail;
                return a.this.d(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155506d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155507e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155508f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155509g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155510h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155511j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155512k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155513l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155514m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155515n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155517q;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155515n = obj;
                this.f155517q |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155518d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155519e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155520f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155521g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155522h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155523j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            boolean f155524k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155525l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155526m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155527n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155528p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155529q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f155530r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f155532t;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155530r = obj;
                this.f155532t |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, null, null, false, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155533d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155534e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155535f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155536g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155537h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155538j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155539k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155540l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155541m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155542n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155544q;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155542n = obj;
                this.f155544q |= PKIFailureInfo.systemUnavail;
                return a.this.j(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155545d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155546e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155547f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155548g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155549h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155550j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155551k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155552l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155553m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155554n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f155555p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f155557r;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155555p = obj;
                this.f155557r |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class f extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155558d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155559e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155560f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155561g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155562h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            boolean f155563j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155564k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155565l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155566m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155567n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155568p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f155569q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f155571s;

            f(tq.e<? super f> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155569q = obj;
                this.f155571s |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, false, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class g extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155572d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155573e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155574f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155575g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155576h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155577j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155578k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155579l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155580m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155581n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155583q;

            g(tq.e<? super g> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155581n = obj;
                this.f155583q |= PKIFailureInfo.systemUnavail;
                return a.this.h(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class h extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155584d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155585e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155586f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155587g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155588h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155589j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155590k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155591l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155592m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155593n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155594p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f155595q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f155597s;

            h(tq.e<? super h> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155595q = obj;
                this.f155597s |= PKIFailureInfo.systemUnavail;
                return a.this.i(null, null, this);
            }
        }

        a(d14.b bVar, bh1.b bVar2, u34.b bVar3, v64.f fVar, a84.b bVar4, mz3.t tVar, h64.u uVar, by0.a aVar, mz3.h hVar, mz3.z zVar, mx.c cVar, gx.d dVar, q34.u1 u1Var) {
            this.f155477a = bVar;
            this.f155478b = bVar2;
            this.f155479c = bVar3;
            this.f155480d = fVar;
            this.f155481e = bVar4;
            this.f155482f = tVar;
            this.f155483g = uVar;
            this.f155484h = aVar;
            this.f155485i = hVar;
            this.f155486j = zVar;
            this.f155487k = cVar;
            this.f155488l = dVar;
            this.f155489m = u1Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [f24.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // s24.b
        public Object a(f24.i iVar, String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            e eVar2;
            Object objB;
            if (eVar instanceof e) {
                eVar2 = (e) eVar;
                int i15 = eVar2.f155557r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    eVar2.f155557r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    eVar2 = new e(eVar);
                }
            } else {
                eVar2 = new e(eVar);
            }
            Object obj = eVar2.f155555p;
            Object objE = uq.b.e();
            int i16 = eVar2.f155557r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        q34.u1 u1Var = this.f155489m;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            q34.u1.Params params = new q34.u1.Params(new k34.i.DeletedSingleById(r2.a(iVar), str));
                            eVar2.f155545d = vq.j.a(iVar);
                            eVar2.f155546e = vq.j.a(str);
                            eVar2.f155547f = jVarA;
                            eVar2.f155548g = vq.j.a(aVar);
                            eVar2.f155549h = vq.j.a(aVar);
                            eVar2.f155550j = 0;
                            eVar2.f155551k = 0;
                            eVar2.f155552l = 0;
                            eVar2.f155553m = 0;
                            eVar2.f155554n = 0;
                            eVar2.f155557r = 1;
                            if (u1Var.c(params, eVar2) == objE) {
                                return objE;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            iVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(iVar));
                            dx.i iVarA = iVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v2 */
        @Override // s24.b
        public Object b(f24.i iVar, boolean z15, BEDocumentStatus bEDocumentStatus, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            f fVar;
            Object objB;
            if (eVar instanceof f) {
                fVar = (f) eVar;
                int i15 = fVar.f155571s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    fVar.f155571s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    fVar = new f(eVar);
                }
            } else {
                fVar = new f(eVar);
            }
            Object obj = fVar.f155569q;
            ?? E = uq.b.e();
            int i16 = fVar.f155571s;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        q34.u1 u1Var = this.f155489m;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            q34.u1.Params params = new q34.u1.Params(new k34.i.ContainerStatus(r2.a(iVar), pq.v.e(BEDocumentStatus.b(bEDocumentStatus, null, z15 ? er0.h.INACTIVE : bEDocumentStatus.getStatus(), false, 5, null))));
                            fVar.f155558d = vq.j.a(iVar);
                            fVar.f155559e = vq.j.a(bEDocumentStatus);
                            fVar.f155560f = jVarA;
                            fVar.f155561g = vq.j.a(aVar);
                            fVar.f155562h = vq.j.a(aVar);
                            fVar.f155563j = z15;
                            fVar.f155564k = 0;
                            fVar.f155565l = 0;
                            fVar.f155566m = 0;
                            fVar.f155567n = 0;
                            fVar.f155568p = 0;
                            fVar.f155571s = 1;
                            if (u1Var.c(params, fVar) == E) {
                                return E;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
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
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [f24.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // s24.b
        public Object c(f24.i iVar, String str, fz.b.LocalDate localDate, boolean z15, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            c cVar;
            Object objB;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f155532t;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f155532t = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object obj = cVar.f155530r;
            Object objE = uq.b.e();
            int i16 = cVar.f155532t;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        q34.u1 u1Var = this.f155489m;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            q34.u1.Params params = new q34.u1.Params(new k34.i.Added(r2.a(iVar), str, localDate, z15));
                            cVar.f155518d = vq.j.a(iVar);
                            cVar.f155519e = vq.j.a(str);
                            cVar.f155520f = vq.j.a(localDate);
                            cVar.f155521g = jVarA;
                            cVar.f155522h = vq.j.a(aVar);
                            cVar.f155523j = vq.j.a(aVar);
                            cVar.f155524k = z15;
                            cVar.f155525l = 0;
                            cVar.f155526m = 0;
                            cVar.f155527n = 0;
                            cVar.f155528p = 0;
                            cVar.f155529q = 0;
                            cVar.f155532t = 1;
                            if (u1Var.c(params, cVar) == objE) {
                                return objE;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            iVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(iVar));
                            dx.i iVarA = iVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x02ee  */
        /* JADX WARN: Code duplicated, block: B:62:0x01dc  */
        /* JADX WARN: Code duplicated, block: B:63:0x01de  */
        /* JADX WARN: Code duplicated, block: B:66:0x020f  */
        /* JADX WARN: Code duplicated, block: B:67:0x0211  */
        /* JADX WARN: Code duplicated, block: B:70:0x023d  */
        /* JADX WARN: Code duplicated, block: B:71:0x023e  */
        /* JADX WARN: Code duplicated, block: B:74:0x026d  */
        /* JADX WARN: Code duplicated, block: B:75:0x026e A[Catch: Exception -> 0x029e, c -> 0x02a1, CancellationException -> 0x02a4, PHI: r4 r6 r7 r8 r9 r10 r11 r12 r13
          0x026e: PHI (r4v12 int) = (r4v10 int), (r4v13 int) binds: [B:73:0x026b, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]
          0x026e: PHI (r6v20 int) = (r6v18 int), (r6v21 int) binds: [B:73:0x026b, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]
          0x026e: PHI (r7v17 dx.j<dx.b>) = (r7v11 dx.j<dx.b>), (r7v19 dx.j<dx.b>) binds: [B:73:0x026b, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]
          0x026e: PHI (r8v15 int) = (r8v13 int), (r8v17 int) binds: [B:73:0x026b, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]
          0x026e: PHI (r9v13 int) = (r9v11 int), (r9v15 int) binds: [B:73:0x026b, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]
          0x026e: PHI (r10v13 int) = (r10v11 int), (r10v16 int) binds: [B:73:0x026b, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]
          0x026e: PHI (r11v15 ex.b) = (r11v12 ex.b), (r11v18 ex.b) binds: [B:73:0x026b, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]
          0x026e: PHI (r12v19 ex.b) = (r12v16 ex.b), (r12v22 ex.b) binds: [B:73:0x026b, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]
          0x026e: PHI (r13v16 by0.a) = (r13v13 by0.a), (r13v18 by0.a) binds: [B:73:0x026b, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #8 {c -> 0x02a1, CancellationException -> 0x02a4, Exception -> 0x029e, blocks: (B:75:0x026e, B:72:0x0241, B:68:0x0213, B:64:0x01e3, B:60:0x01ac, B:56:0x016e), top: B:110:0x016e }] */
        /* JADX WARN: Code duplicated, block: B:78:0x0295  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:93:0x02be  */
        /* JADX WARN: Code duplicated, block: B:96:0x02cf  */
        /* JADX WARN: Code duplicated, block: B:97:0x02dd  */
        /* JADX WARN: Code duplicated, block: B:99:0x02e1  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x0072: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:25:0x0072 */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x0076: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:27:0x0076 */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x007a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:29:0x007a */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x00a4: MOVE (r2 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:35:0x00a4 */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x00a8: MOVE (r2 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:37:0x00a8 */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x00ac: MOVE (r2 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:39:0x00ac */
        /* JADX WARN: Type inference failed for: r0v21, types: [u34.b] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v2, types: [pc4.q2$a$a, tq.e] */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v9, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v10, types: [a84.b] */
        /* JADX WARN: Type inference failed for: r6v22 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // s24.b
        public Object d(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            ?? c3856a;
            Object obj;
            Object obj2;
            String message;
            dx.i iVarA;
            Object objB;
            mz3.t tVar;
            dx.j<dx.b> jVarA;
            v64.f fVar;
            h64.u uVar;
            ex.b bVar;
            by0.a aVar;
            int i15;
            int i16;
            int i17;
            a84.b bVar2;
            ex.b bVar3;
            int i18;
            int i19;
            gz.b.a.C1792a c1792a;
            a84.b bVar4;
            int i25;
            mz3.t tVar2;
            h64.u uVar2;
            ?? r15;
            gz.b.a.C1792a c1792a2;
            h64.u uVar3;
            by0.a aVar2;
            gz.b.a.C1792a c1792a3;
            int i26;
            by0.a aVar3;
            h64.u.Params params;
            gz.b.a.C1792a c1792a4;
            if (eVar instanceof C3856a) {
                C3856a c3856a2 = (C3856a) eVar;
                int i27 = c3856a2.f155505v;
                if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                    c3856a2.f155505v = i27 - PKIFailureInfo.systemUnavail;
                    c3856a = c3856a2;
                } else {
                    c3856a = new C3856a(eVar);
                }
            } else {
                c3856a = new C3856a(eVar);
            }
            Object obj3 = c3856a.f155503s;
            Object objE = uq.b.e();
            try {
                try {
                    try {
                        try {
                            switch (c3856a.f155505v) {
                                case 0:
                                    oq.u.b(obj3);
                                    ?? r16 = this.f155479c;
                                    v64.f fVar2 = this.f155480d;
                                    a84.b bVar5 = this.f155481e;
                                    tVar = this.f155482f;
                                    h64.u uVar4 = this.f155483g;
                                    by0.a aVar4 = this.f155484h;
                                    jVarA = xw.c.f221622a.a();
                                    try {
                                        ex.a aVar5 = new ex.a();
                                        c3856a.f155490d = fVar2;
                                        c3856a.f155491e = bVar5;
                                        c3856a.f155492f = tVar;
                                        c3856a.f155493g = uVar4;
                                        c3856a.f155494h = aVar4;
                                        c3856a.f155495j = jVarA;
                                        c3856a.f155496k = vq.j.a(aVar5);
                                        c3856a.f155497l = vq.j.a(aVar5);
                                        c3856a.f155498m = 0;
                                        c3856a.f155499n = 0;
                                        c3856a.f155500p = 0;
                                        c3856a.f155501q = 0;
                                        c3856a.f155502r = 0;
                                        c3856a.f155505v = 1;
                                        if (r16.a(c3856a) != objE) {
                                            fVar = fVar2;
                                            uVar = uVar4;
                                            bVar = aVar5;
                                            aVar = aVar4;
                                            i15 = 0;
                                            i16 = 0;
                                            i17 = 0;
                                            bVar2 = bVar5;
                                            bVar3 = bVar;
                                            i18 = 0;
                                            i19 = 0;
                                            c1792a = gz.b.a.C1792a.f78542a;
                                            c3856a.f155490d = bVar2;
                                            c3856a.f155491e = tVar;
                                            c3856a.f155492f = uVar;
                                            c3856a.f155493g = aVar;
                                            c3856a.f155494h = jVarA;
                                            bVar4 = bVar2;
                                            c3856a.f155495j = vq.j.a(bVar3);
                                            c3856a.f155496k = vq.j.a(bVar);
                                            c3856a.f155497l = null;
                                            c3856a.f155498m = i17;
                                            c3856a.f155499n = i19;
                                            c3856a.f155500p = i16;
                                            c3856a.f155501q = i18;
                                            c3856a.f155502r = i15;
                                            c3856a.f155505v = 2;
                                            if (fVar.c(c1792a, c3856a) == objE) {
                                                i25 = i18;
                                                tVar2 = tVar;
                                                uVar2 = uVar;
                                                r15 = bVar4;
                                                c1792a2 = gz.b.a.C1792a.f78542a;
                                                c3856a.f155490d = tVar2;
                                                c3856a.f155491e = uVar2;
                                                c3856a.f155492f = aVar;
                                                c3856a.f155493g = jVarA;
                                                c3856a.f155494h = vq.j.a(bVar3);
                                                c3856a.f155495j = vq.j.a(bVar);
                                                c3856a.f155496k = null;
                                                c3856a.f155498m = i17;
                                                c3856a.f155499n = i19;
                                                c3856a.f155500p = i16;
                                                c3856a.f155501q = i25;
                                                c3856a.f155502r = i15;
                                                c3856a.f155505v = 3;
                                                if (r15.a(c1792a2, c3856a) != objE) {
                                                    uVar3 = uVar2;
                                                    aVar2 = aVar;
                                                    c1792a3 = gz.b.a.C1792a.f78542a;
                                                    c3856a.f155490d = uVar3;
                                                    c3856a.f155491e = aVar2;
                                                    c3856a.f155492f = jVarA;
                                                    c3856a.f155493g = vq.j.a(bVar3);
                                                    c3856a.f155494h = vq.j.a(bVar);
                                                    c3856a.f155495j = null;
                                                    c3856a.f155498m = i17;
                                                    c3856a.f155499n = i19;
                                                    c3856a.f155500p = i16;
                                                    c3856a.f155501q = i25;
                                                    c3856a.f155502r = i15;
                                                    c3856a.f155505v = 4;
                                                    if (tVar2.c(c1792a3, c3856a) == objE) {
                                                        i26 = i25;
                                                        aVar3 = aVar2;
                                                        params = new h64.u.Params(false);
                                                        c3856a.f155490d = aVar3;
                                                        c3856a.f155491e = jVarA;
                                                        c3856a.f155492f = vq.j.a(bVar3);
                                                        c3856a.f155493g = vq.j.a(bVar);
                                                        c3856a.f155494h = null;
                                                        c3856a.f155498m = i17;
                                                        c3856a.f155499n = i19;
                                                        c3856a.f155500p = i16;
                                                        c3856a.f155501q = i26;
                                                        c3856a.f155502r = i15;
                                                        c3856a.f155505v = 5;
                                                        if (uVar3.c(params, c3856a) != objE) {
                                                            c1792a4 = gz.b.a.C1792a.f78542a;
                                                            c3856a.f155490d = jVarA;
                                                            c3856a.f155491e = vq.j.a(bVar3);
                                                            c3856a.f155492f = vq.j.a(bVar);
                                                            c3856a.f155493g = null;
                                                            c3856a.f155498m = i17;
                                                            c3856a.f155499n = i19;
                                                            c3856a.f155500p = i16;
                                                            c3856a.f155501q = i26;
                                                            c3856a.f155502r = i15;
                                                            c3856a.f155505v = 6;
                                                            if (aVar3.c(c1792a4, c3856a) != objE) {
                                                                return new dx.i.Right(oq.i0.f148189a);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return objE;
                                    } catch (ex.c e15) {
                                        e = e15;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e16) {
                                        throw e16;
                                    } catch (Exception e17) {
                                        e = e17;
                                        c3856a = jVarA;
                                        px.f fVar3 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar3.d(message, e, px.c.a(c3856a));
                                        iVarA = c3856a.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                case 1:
                                    i15 = c3856a.f155502r;
                                    i18 = c3856a.f155501q;
                                    int i28 = c3856a.f155500p;
                                    int i29 = c3856a.f155499n;
                                    int i35 = c3856a.f155498m;
                                    ex.b bVar6 = (ex.b) c3856a.f155497l;
                                    ex.b bVar7 = (ex.b) c3856a.f155496k;
                                    dx.j<dx.b> jVar = (dx.j) c3856a.f155495j;
                                    by0.a aVar6 = (by0.a) c3856a.f155494h;
                                    h64.u uVar5 = (h64.u) c3856a.f155493g;
                                    tVar = (mz3.t) c3856a.f155492f;
                                    a84.b bVar8 = (a84.b) c3856a.f155491e;
                                    fVar = (v64.f) c3856a.f155490d;
                                    try {
                                        oq.u.b(obj3);
                                        i16 = i28;
                                        bVar2 = bVar8;
                                        uVar = uVar5;
                                        aVar = aVar6;
                                        bVar3 = bVar7;
                                        i17 = i35;
                                        i19 = i29;
                                        jVarA = jVar;
                                        bVar = bVar6;
                                        c1792a = gz.b.a.C1792a.f78542a;
                                        c3856a.f155490d = bVar2;
                                        c3856a.f155491e = tVar;
                                        c3856a.f155492f = uVar;
                                        c3856a.f155493g = aVar;
                                        c3856a.f155494h = jVarA;
                                        bVar4 = bVar2;
                                        c3856a.f155495j = vq.j.a(bVar3);
                                        c3856a.f155496k = vq.j.a(bVar);
                                        c3856a.f155497l = null;
                                        c3856a.f155498m = i17;
                                        c3856a.f155499n = i19;
                                        c3856a.f155500p = i16;
                                        c3856a.f155501q = i18;
                                        c3856a.f155502r = i15;
                                        c3856a.f155505v = 2;
                                        if (fVar.c(c1792a, c3856a) == objE) {
                                            i25 = i18;
                                            tVar2 = tVar;
                                            uVar2 = uVar;
                                            r15 = bVar4;
                                            c1792a2 = gz.b.a.C1792a.f78542a;
                                            c3856a.f155490d = tVar2;
                                            c3856a.f155491e = uVar2;
                                            c3856a.f155492f = aVar;
                                            c3856a.f155493g = jVarA;
                                            c3856a.f155494h = vq.j.a(bVar3);
                                            c3856a.f155495j = vq.j.a(bVar);
                                            c3856a.f155496k = null;
                                            c3856a.f155498m = i17;
                                            c3856a.f155499n = i19;
                                            c3856a.f155500p = i16;
                                            c3856a.f155501q = i25;
                                            c3856a.f155502r = i15;
                                            c3856a.f155505v = 3;
                                            if (r15.a(c1792a2, c3856a) != objE) {
                                                uVar3 = uVar2;
                                                aVar2 = aVar;
                                                c1792a3 = gz.b.a.C1792a.f78542a;
                                                c3856a.f155490d = uVar3;
                                                c3856a.f155491e = aVar2;
                                                c3856a.f155492f = jVarA;
                                                c3856a.f155493g = vq.j.a(bVar3);
                                                c3856a.f155494h = vq.j.a(bVar);
                                                c3856a.f155495j = null;
                                                c3856a.f155498m = i17;
                                                c3856a.f155499n = i19;
                                                c3856a.f155500p = i16;
                                                c3856a.f155501q = i25;
                                                c3856a.f155502r = i15;
                                                c3856a.f155505v = 4;
                                                if (tVar2.c(c1792a3, c3856a) == objE) {
                                                    i26 = i25;
                                                    aVar3 = aVar2;
                                                    params = new h64.u.Params(false);
                                                    c3856a.f155490d = aVar3;
                                                    c3856a.f155491e = jVarA;
                                                    c3856a.f155492f = vq.j.a(bVar3);
                                                    c3856a.f155493g = vq.j.a(bVar);
                                                    c3856a.f155494h = null;
                                                    c3856a.f155498m = i17;
                                                    c3856a.f155499n = i19;
                                                    c3856a.f155500p = i16;
                                                    c3856a.f155501q = i26;
                                                    c3856a.f155502r = i15;
                                                    c3856a.f155505v = 5;
                                                    if (uVar3.c(params, c3856a) != objE) {
                                                        c1792a4 = gz.b.a.C1792a.f78542a;
                                                        c3856a.f155490d = jVarA;
                                                        c3856a.f155491e = vq.j.a(bVar3);
                                                        c3856a.f155492f = vq.j.a(bVar);
                                                        c3856a.f155493g = null;
                                                        c3856a.f155498m = i17;
                                                        c3856a.f155499n = i19;
                                                        c3856a.f155500p = i16;
                                                        c3856a.f155501q = i26;
                                                        c3856a.f155502r = i15;
                                                        c3856a.f155505v = 6;
                                                        if (aVar3.c(c1792a4, c3856a) != objE) {
                                                            return new dx.i.Right(oq.i0.f148189a);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return objE;
                                    } catch (ex.c e18) {
                                        e = e18;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e19) {
                                        throw e19;
                                    } catch (Exception e25) {
                                        e = e25;
                                        c3856a = jVar;
                                        px.f fVar4 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar4.d(message, e, px.c.a(c3856a));
                                        iVarA = c3856a.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                case 2:
                                    i15 = c3856a.f155502r;
                                    int i36 = c3856a.f155501q;
                                    int i37 = c3856a.f155500p;
                                    int i38 = c3856a.f155499n;
                                    int i39 = c3856a.f155498m;
                                    ex.b bVar9 = (ex.b) c3856a.f155496k;
                                    ex.b bVar10 = (ex.b) c3856a.f155495j;
                                    dx.j<dx.b> jVar2 = (dx.j) c3856a.f155494h;
                                    aVar = (by0.a) c3856a.f155493g;
                                    uVar2 = (h64.u) c3856a.f155492f;
                                    mz3.t tVar3 = (mz3.t) c3856a.f155491e;
                                    a84.b bVar11 = (a84.b) c3856a.f155490d;
                                    oq.u.b(obj3);
                                    i16 = i37;
                                    jVarA = jVar2;
                                    bVar3 = bVar10;
                                    bVar = bVar9;
                                    i17 = i39;
                                    i19 = i38;
                                    i25 = i36;
                                    tVar2 = tVar3;
                                    r15 = bVar11;
                                    c1792a2 = gz.b.a.C1792a.f78542a;
                                    c3856a.f155490d = tVar2;
                                    c3856a.f155491e = uVar2;
                                    c3856a.f155492f = aVar;
                                    c3856a.f155493g = jVarA;
                                    c3856a.f155494h = vq.j.a(bVar3);
                                    c3856a.f155495j = vq.j.a(bVar);
                                    c3856a.f155496k = null;
                                    c3856a.f155498m = i17;
                                    c3856a.f155499n = i19;
                                    c3856a.f155500p = i16;
                                    c3856a.f155501q = i25;
                                    c3856a.f155502r = i15;
                                    c3856a.f155505v = 3;
                                    if (r15.a(c1792a2, c3856a) != objE) {
                                        uVar3 = uVar2;
                                        aVar2 = aVar;
                                        c1792a3 = gz.b.a.C1792a.f78542a;
                                        c3856a.f155490d = uVar3;
                                        c3856a.f155491e = aVar2;
                                        c3856a.f155492f = jVarA;
                                        c3856a.f155493g = vq.j.a(bVar3);
                                        c3856a.f155494h = vq.j.a(bVar);
                                        c3856a.f155495j = null;
                                        c3856a.f155498m = i17;
                                        c3856a.f155499n = i19;
                                        c3856a.f155500p = i16;
                                        c3856a.f155501q = i25;
                                        c3856a.f155502r = i15;
                                        c3856a.f155505v = 4;
                                        if (tVar2.c(c1792a3, c3856a) == objE) {
                                            i26 = i25;
                                            aVar3 = aVar2;
                                            params = new h64.u.Params(false);
                                            c3856a.f155490d = aVar3;
                                            c3856a.f155491e = jVarA;
                                            c3856a.f155492f = vq.j.a(bVar3);
                                            c3856a.f155493g = vq.j.a(bVar);
                                            c3856a.f155494h = null;
                                            c3856a.f155498m = i17;
                                            c3856a.f155499n = i19;
                                            c3856a.f155500p = i16;
                                            c3856a.f155501q = i26;
                                            c3856a.f155502r = i15;
                                            c3856a.f155505v = 5;
                                            if (uVar3.c(params, c3856a) != objE) {
                                                c1792a4 = gz.b.a.C1792a.f78542a;
                                                c3856a.f155490d = jVarA;
                                                c3856a.f155491e = vq.j.a(bVar3);
                                                c3856a.f155492f = vq.j.a(bVar);
                                                c3856a.f155493g = null;
                                                c3856a.f155498m = i17;
                                                c3856a.f155499n = i19;
                                                c3856a.f155500p = i16;
                                                c3856a.f155501q = i26;
                                                c3856a.f155502r = i15;
                                                c3856a.f155505v = 6;
                                                if (aVar3.c(c1792a4, c3856a) != objE) {
                                                    return new dx.i.Right(oq.i0.f148189a);
                                                }
                                            }
                                        }
                                    }
                                    return objE;
                                case 3:
                                    i15 = c3856a.f155502r;
                                    int i45 = c3856a.f155501q;
                                    i16 = c3856a.f155500p;
                                    i19 = c3856a.f155499n;
                                    i17 = c3856a.f155498m;
                                    bVar = (ex.b) c3856a.f155495j;
                                    bVar3 = (ex.b) c3856a.f155494h;
                                    dx.j<dx.b> jVar3 = (dx.j) c3856a.f155493g;
                                    aVar2 = (by0.a) c3856a.f155492f;
                                    uVar3 = (h64.u) c3856a.f155491e;
                                    tVar2 = (mz3.t) c3856a.f155490d;
                                    oq.u.b(obj3);
                                    i25 = i45;
                                    jVarA = jVar3;
                                    c1792a3 = gz.b.a.C1792a.f78542a;
                                    c3856a.f155490d = uVar3;
                                    c3856a.f155491e = aVar2;
                                    c3856a.f155492f = jVarA;
                                    c3856a.f155493g = vq.j.a(bVar3);
                                    c3856a.f155494h = vq.j.a(bVar);
                                    c3856a.f155495j = null;
                                    c3856a.f155498m = i17;
                                    c3856a.f155499n = i19;
                                    c3856a.f155500p = i16;
                                    c3856a.f155501q = i25;
                                    c3856a.f155502r = i15;
                                    c3856a.f155505v = 4;
                                    if (tVar2.c(c1792a3, c3856a) == objE) {
                                        i26 = i25;
                                        aVar3 = aVar2;
                                        params = new h64.u.Params(false);
                                        c3856a.f155490d = aVar3;
                                        c3856a.f155491e = jVarA;
                                        c3856a.f155492f = vq.j.a(bVar3);
                                        c3856a.f155493g = vq.j.a(bVar);
                                        c3856a.f155494h = null;
                                        c3856a.f155498m = i17;
                                        c3856a.f155499n = i19;
                                        c3856a.f155500p = i16;
                                        c3856a.f155501q = i26;
                                        c3856a.f155502r = i15;
                                        c3856a.f155505v = 5;
                                        if (uVar3.c(params, c3856a) != objE) {
                                            c1792a4 = gz.b.a.C1792a.f78542a;
                                            c3856a.f155490d = jVarA;
                                            c3856a.f155491e = vq.j.a(bVar3);
                                            c3856a.f155492f = vq.j.a(bVar);
                                            c3856a.f155493g = null;
                                            c3856a.f155498m = i17;
                                            c3856a.f155499n = i19;
                                            c3856a.f155500p = i16;
                                            c3856a.f155501q = i26;
                                            c3856a.f155502r = i15;
                                            c3856a.f155505v = 6;
                                            if (aVar3.c(c1792a4, c3856a) != objE) {
                                                return new dx.i.Right(oq.i0.f148189a);
                                            }
                                        }
                                    }
                                    return objE;
                                case 4:
                                    i15 = c3856a.f155502r;
                                    int i46 = c3856a.f155501q;
                                    i16 = c3856a.f155500p;
                                    i19 = c3856a.f155499n;
                                    i17 = c3856a.f155498m;
                                    bVar = (ex.b) c3856a.f155494h;
                                    bVar3 = (ex.b) c3856a.f155493g;
                                    dx.j<dx.b> jVar4 = (dx.j) c3856a.f155492f;
                                    aVar2 = (by0.a) c3856a.f155491e;
                                    uVar3 = (h64.u) c3856a.f155490d;
                                    oq.u.b(obj3);
                                    i26 = i46;
                                    jVarA = jVar4;
                                    aVar3 = aVar2;
                                    params = new h64.u.Params(false);
                                    c3856a.f155490d = aVar3;
                                    c3856a.f155491e = jVarA;
                                    c3856a.f155492f = vq.j.a(bVar3);
                                    c3856a.f155493g = vq.j.a(bVar);
                                    c3856a.f155494h = null;
                                    c3856a.f155498m = i17;
                                    c3856a.f155499n = i19;
                                    c3856a.f155500p = i16;
                                    c3856a.f155501q = i26;
                                    c3856a.f155502r = i15;
                                    c3856a.f155505v = 5;
                                    if (uVar3.c(params, c3856a) != objE) {
                                        c1792a4 = gz.b.a.C1792a.f78542a;
                                        c3856a.f155490d = jVarA;
                                        c3856a.f155491e = vq.j.a(bVar3);
                                        c3856a.f155492f = vq.j.a(bVar);
                                        c3856a.f155493g = null;
                                        c3856a.f155498m = i17;
                                        c3856a.f155499n = i19;
                                        c3856a.f155500p = i16;
                                        c3856a.f155501q = i26;
                                        c3856a.f155502r = i15;
                                        c3856a.f155505v = 6;
                                        if (aVar3.c(c1792a4, c3856a) != objE) {
                                            return new dx.i.Right(oq.i0.f148189a);
                                        }
                                    }
                                    return objE;
                                case 5:
                                    i15 = c3856a.f155502r;
                                    i26 = c3856a.f155501q;
                                    int i47 = c3856a.f155500p;
                                    int i48 = c3856a.f155499n;
                                    int i49 = c3856a.f155498m;
                                    ex.b bVar12 = (ex.b) c3856a.f155493g;
                                    ex.b bVar13 = (ex.b) c3856a.f155492f;
                                    dx.j<dx.b> jVar5 = (dx.j) c3856a.f155491e;
                                    aVar3 = (by0.a) c3856a.f155490d;
                                    oq.u.b(obj3);
                                    i16 = i47;
                                    jVarA = jVar5;
                                    bVar3 = bVar13;
                                    bVar = bVar12;
                                    i17 = i49;
                                    i19 = i48;
                                    c1792a4 = gz.b.a.C1792a.f78542a;
                                    c3856a.f155490d = jVarA;
                                    c3856a.f155491e = vq.j.a(bVar3);
                                    c3856a.f155492f = vq.j.a(bVar);
                                    c3856a.f155493g = null;
                                    c3856a.f155498m = i17;
                                    c3856a.f155499n = i19;
                                    c3856a.f155500p = i16;
                                    c3856a.f155501q = i26;
                                    c3856a.f155502r = i15;
                                    c3856a.f155505v = 6;
                                    if (aVar3.c(c1792a4, c3856a) != objE) {
                                        return new dx.i.Right(oq.i0.f148189a);
                                    }
                                    return objE;
                                case 6:
                                    try {
                                        oq.u.b(obj3);
                                        return new dx.i.Right(oq.i0.f148189a);
                                    } catch (ex.c e26) {
                                        e = e26;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e27) {
                                        throw e27;
                                    }
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (CancellationException e28) {
                            throw e28;
                        }
                    } catch (Exception e29) {
                        e = e29;
                    }
                } catch (ex.c e35) {
                    e = e35;
                } catch (CancellationException e36) {
                    throw e36;
                } catch (Exception e37) {
                    e = e37;
                    c3856a = obj2;
                }
            } catch (ex.c e38) {
                e = e38;
            } catch (CancellationException e39) {
                throw e39;
            } catch (Exception e45) {
                e = e45;
                c3856a = obj;
            }
        }

        /* JADX WARN: Code duplicated, block: B:55:0x0103  */
        /* JADX WARN: Code duplicated, block: B:58:0x0114  */
        /* JADX WARN: Code duplicated, block: B:59:0x0122  */
        /* JADX WARN: Code duplicated, block: B:61:0x0126  */
        /* JADX WARN: Code duplicated, block: B:64:0x0132  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.q2$a$b, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // s24.b
        public Object e(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            ?? bVar;
            String message;
            dx.i iVarA;
            Object objB;
            mz3.h hVar;
            dx.j<dx.b> jVarA;
            ex.b aVar;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            ex.b bVar2;
            if (eVar instanceof b) {
                b bVar3 = (b) eVar;
                int i25 = bVar3.f155517q;
                if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar3.f155517q = i25 - PKIFailureInfo.systemUnavail;
                    bVar = bVar3;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object obj = bVar.f155515n;
            Object objE = uq.b.e();
            int i26 = bVar.f155517q;
            try {
                try {
                    if (i26 == 0) {
                        oq.u.b(obj);
                        mz3.t tVar = this.f155482f;
                        hVar = this.f155485i;
                        jVarA = xw.c.f221622a.a();
                        try {
                            aVar = new ex.a();
                            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                            bVar.f155506d = hVar;
                            bVar.f155507e = jVarA;
                            bVar.f155508f = vq.j.a(aVar);
                            bVar.f155509g = vq.j.a(aVar);
                            i15 = 0;
                            bVar.f155510h = 0;
                            bVar.f155511j = 0;
                            bVar.f155512k = 0;
                            bVar.f155513l = 0;
                            bVar.f155514m = 0;
                            bVar.f155517q = 1;
                            if (tVar.c(c1792a, bVar) != objE) {
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                bVar2 = aVar;
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            bVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(bVar));
                            iVarA = bVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i26 != 1) {
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(obj);
                            return new dx.i.Right(oq.i0.f148189a);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    int i27 = bVar.f155514m;
                    i17 = bVar.f155513l;
                    i18 = bVar.f155512k;
                    int i28 = bVar.f155511j;
                    i19 = bVar.f155510h;
                    aVar = (ex.b) bVar.f155509g;
                    bVar2 = (ex.b) bVar.f155508f;
                    dx.j<dx.b> jVar = (dx.j) bVar.f155507e;
                    hVar = (mz3.h) bVar.f155506d;
                    try {
                        oq.u.b(obj);
                        i16 = i28;
                        i15 = i27;
                        jVarA = jVar;
                    } catch (ex.c e25) {
                        e = e25;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e26) {
                        throw e26;
                    } catch (Exception e27) {
                        e = e27;
                        bVar = jVar;
                        px.f fVar2 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(bVar));
                        iVarA = bVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                    bVar.f155506d = jVarA;
                    bVar.f155507e = vq.j.a(bVar2);
                    bVar.f155508f = vq.j.a(aVar);
                    bVar.f155509g = null;
                    bVar.f155510h = i19;
                    bVar.f155511j = i16;
                    bVar.f155512k = i18;
                    bVar.f155513l = i17;
                    bVar.f155514m = i15;
                    bVar.f155517q = 2;
                    if (hVar.c(c1792a2, bVar) != objE) {
                        return new dx.i.Right(oq.i0.f148189a);
                    }
                    return objE;
                } catch (Exception e28) {
                    e = e28;
                }
            } catch (CancellationException e29) {
                throw e29;
            }
        }

        @Override // s24.b
        public Object f(tq.e<? super oq.i0> eVar) {
            this.f155488l.c(new ShowSnackbarEvent(this.f155487k.c(f34.a.f59008d)));
            return oq.i0.f148189a;
        }

        @Override // s24.b
        public Object g(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return this.f155477a.c(new d14.b.Params(str), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [f24.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // s24.b
        public Object h(f24.i iVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            g gVar;
            Object objB;
            if (eVar instanceof g) {
                gVar = (g) eVar;
                int i15 = gVar.f155583q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    gVar.f155583q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    gVar = new g(eVar);
                }
            } else {
                gVar = new g(eVar);
            }
            Object obj = gVar.f155581n;
            Object objE = uq.b.e();
            int i16 = gVar.f155583q;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        bh1.b bVar = this.f155478b;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            String referenceName = r2.a(iVar).getReferenceName();
                            gVar.f155572d = vq.j.a(iVar);
                            gVar.f155573e = jVarA;
                            gVar.f155574f = vq.j.a(aVar);
                            gVar.f155575g = vq.j.a(aVar);
                            gVar.f155576h = 0;
                            gVar.f155577j = 0;
                            gVar.f155578k = 0;
                            gVar.f155579l = 0;
                            gVar.f155580m = 0;
                            gVar.f155583q = 1;
                            if (bVar.b(referenceName, gVar) == objE) {
                                return objE;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            iVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(iVar));
                            dx.i iVarA = iVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        @Override // s24.b
        public Object i(f24.i iVar, String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            h hVar;
            Object objB;
            ex.b bVar;
            if (eVar instanceof h) {
                hVar = (h) eVar;
                int i15 = hVar.f155597s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    hVar.f155597s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    hVar = new h(eVar);
                }
            } else {
                hVar = new h(eVar);
            }
            Object objC = hVar.f155595q;
            Object objE = uq.b.e();
            int i16 = hVar.f155597s;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        mz3.z zVar = this.f155486j;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            mz3.z.Params params = new mz3.z.Params(r2.a(iVar), mz3.z.b.UPDATE, str, true);
                            hVar.f155584d = vq.j.a(iVar);
                            hVar.f155585e = vq.j.a(str);
                            hVar.f155586f = jVarA;
                            hVar.f155587g = vq.j.a(aVar);
                            hVar.f155588h = vq.j.a(aVar);
                            hVar.f155589j = aVar;
                            hVar.f155590k = 0;
                            hVar.f155591l = 0;
                            hVar.f155592m = 0;
                            hVar.f155593n = 0;
                            hVar.f155594p = 0;
                            hVar.f155597s = 1;
                            objC = zVar.c(params, hVar);
                            if (objC == objE) {
                                return objE;
                            }
                            bVar = aVar;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            str = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(str));
                            dx.i iVarA = str.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) hVar.f155589j;
                        try {
                            oq.u.b(objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    bVar.a((dx.i) objC);
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [f24.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // s24.b
        public Object j(f24.i iVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            d dVar;
            Object objB;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i15 = dVar.f155544q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.f155544q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object obj = dVar.f155542n;
            Object objE = uq.b.e();
            int i16 = dVar.f155544q;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        q34.u1 u1Var = this.f155489m;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            q34.u1.Params params = new q34.u1.Params(new k34.i.DeletedByType(r2.a(iVar)));
                            dVar.f155533d = vq.j.a(iVar);
                            dVar.f155534e = jVarA;
                            dVar.f155535f = vq.j.a(aVar);
                            dVar.f155536g = vq.j.a(aVar);
                            dVar.f155537h = 0;
                            dVar.f155538j = 0;
                            dVar.f155539k = 0;
                            dVar.f155540l = 0;
                            dVar.f155541m = 0;
                            dVar.f155544q = 1;
                            if (u1Var.c(params, dVar) == objE) {
                                return objE;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            iVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(iVar));
                            dx.i iVarA = iVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"pc4/q2$b", "Ls24/c;", "", "documentId", "Lf24/i;", "documentType", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Ljava/lang/String;Lf24/i;Ltq/e;)Ljava/lang/Object;", "b", "(Lf24/i;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements s24.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s54.g f155598a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155599d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155600e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155601f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155602g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155603h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155604j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155605k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155606l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155607m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155608n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155610q;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155608n = obj;
                this.f155610q |= PKIFailureInfo.systemUnavail;
                return b.this.b(null, this);
            }
        }

        /* JADX INFO: renamed from: pc4.q2$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3857b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155611d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155612e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155613f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155614g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155615h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155616j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155617k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155618l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155619m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155620n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f155621p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f155623r;

            C3857b(tq.e<? super C3857b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155621p = obj;
                this.f155623r |= PKIFailureInfo.systemUnavail;
                return b.this.a(null, null, this);
            }
        }

        b(s54.g gVar) {
            this.f155598a = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // s24.c
        public Object a(String str, f24.i iVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3857b c3857b;
            Object objB;
            if (eVar instanceof C3857b) {
                c3857b = (C3857b) eVar;
                int i15 = c3857b.f155623r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3857b.f155623r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3857b = new C3857b(eVar);
                }
            } else {
                c3857b = new C3857b(eVar);
            }
            Object obj = c3857b.f155621p;
            Object objE = uq.b.e();
            int i16 = c3857b.f155623r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        s54.g gVar = this.f155598a;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            s54.g.Params params = new s54.g.Params(new s54.g.b.ByContainerId(r2.a(iVar), str));
                            c3857b.f155611d = vq.j.a(str);
                            c3857b.f155612e = vq.j.a(iVar);
                            c3857b.f155613f = jVarA;
                            c3857b.f155614g = vq.j.a(aVar);
                            c3857b.f155615h = vq.j.a(aVar);
                            c3857b.f155616j = 0;
                            c3857b.f155617k = 0;
                            c3857b.f155618l = 0;
                            c3857b.f155619m = 0;
                            c3857b.f155620n = 0;
                            c3857b.f155623r = 1;
                            if (gVar.c(params, c3857b) == objE) {
                                return objE;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            str = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(str));
                            dx.i iVarA = str.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [f24.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // s24.c
        public Object b(f24.i iVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            a aVar;
            Object objB;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f155610q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f155610q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object obj = aVar.f155608n;
            Object objE = uq.b.e();
            int i16 = aVar.f155610q;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        s54.g gVar = this.f155598a;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            s54.g.Params params = new s54.g.Params(new s54.g.b.ByDocumentType(r2.a(iVar)));
                            aVar.f155599d = vq.j.a(iVar);
                            aVar.f155600e = jVarA;
                            aVar.f155601f = vq.j.a(aVar2);
                            aVar.f155602g = vq.j.a(aVar2);
                            aVar.f155603h = 0;
                            aVar.f155604j = 0;
                            aVar.f155605k = 0;
                            aVar.f155606l = 0;
                            aVar.f155607m = 0;
                            aVar.f155610q = 1;
                            if (gVar.c(params, aVar) == objE) {
                                return objE;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            iVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(iVar));
                            dx.i iVarA = iVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pc4/q2$c", "Ls24/a;", "Lf24/c;", "mainCertificateType", "", "clearData", "hasAnyActiveCert", "Ldx/b;", "a", "(Lf24/c;ZZ)Ldx/b;", "b", "()Ldx/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements s24.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mx.c f155624a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f155625a;

            static {
                int[] iArr = new int[f24.c.values().length];
                try {
                    iArr[f24.c.CITIZEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f24.c.REFUGEE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f24.c.UNIVERSITY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f155625a = iArr;
            }
        }

        c(mx.c cVar) {
            this.f155624a = cVar;
        }

        @Override // s24.a
        public dx.b a(f24.c mainCertificateType, boolean clearData, boolean hasAnyActiveCert) {
            k34.u uVar;
            int i15 = a.f155625a[mainCertificateType.ordinal()];
            if (i15 == 1) {
                uVar = k34.u.MOBYWATEL;
            } else if (i15 == 2) {
                uVar = k34.u.DIIA;
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                uVar = k34.u.STUDENT;
            }
            return new dx.b.Deactivate(new IdentityDeactivateData(uVar, clearData, hasAnyActiveCert));
        }

        @Override // s24.a
        public dx.b b() {
            return new dx.b.Business(o73.e.DIFFERENT_REFRESHED_PESEL, null, this.f155624a.c(rh2.f.f173880c), this.f155624a.c(rh2.f.f173879b), null, this.f155624a.c(rh2.f.f173878a), null, 82, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pc4/q2$d", "Ls24/d;", "Lfz/b$f;", "a", "()Lfz/b$f;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements s24.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ac4.d f155626a;

        d(ac4.d dVar) {
            this.f155626a = dVar;
        }

        @Override // s24.d
        public fz.b.OffsetDateTime a() {
            return new fz.b.OffsetDateTime(this.f155626a.a(gz.b.a.C1792a.f78542a));
        }
    }

    private q2() {
    }

    public final s24.b a(bh1.b documentsSettingsDataStoreRepository, v64.f clearSessionDataUC, a84.b clearNotificationDeviceTokenUseCase, mz3.t removeAllDocumentsDownloadStatusesUC, h64.u refreshServicesUseCase, by0.a clearAirQualityCacheUC, u34.b documentsSummaryLocalRepository, mz3.h clearTaskDataUC, gx.d globalEventManager, mx.c labelProvider, mz3.z updateDocumentAsyncUC, q34.u1 onDocumentContainerChangedEventUC, d14.b removeFileFromStorageUseCase) {
        return new a(removeFileFromStorageUseCase, documentsSettingsDataStoreRepository, documentsSummaryLocalRepository, clearSessionDataUC, clearNotificationDeviceTokenUseCase, removeAllDocumentsDownloadStatusesUC, refreshServicesUseCase, clearAirQualityCacheUC, clearTaskDataUC, updateDocumentAsyncUC, labelProvider, globalEventManager, onDocumentContainerChangedEventUC);
    }

    public final s24.c b(s54.g removeNotificationsForDocumentUseCase) {
        return new b(removeNotificationsForDocumentUseCase);
    }

    public final s24.a c(mx.c labelProvider) {
        return new c(labelProvider);
    }

    public final s24.d d(ac4.d getCurrentServerTimeUseCase) {
        return new d(getCurrentServerTimeUseCase);
    }
}
