package pv1;

import java.util.List;
import lv1.DynamicDocument;
import mz3.s;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d¨\u0006\u001e"}, d2 = {"Lpv1/i;", "Lpv1/h;", "Lmz3/s;", "monitorDocumentsDownloadStatusUC", "Lkv1/a;", "dynamicDocumentContainersInteractor", "Lpv1/c;", "getByIdDynamicDocumentsListDataUC", "Lpv1/f;", "getDynamicListSingleDocumentStatusUC", "Lxw/d;", "dispatcherProvider", "<init>", "(Lmz3/s;Lkv1/a;Lpv1/c;Lpv1/f;Lxw/d;)V", "Lgz/b$a$a;", "params", "Lmu/g;", "", "Llv1/c;", "e", "(Lgz/b$a$a;)Lmu/g;", "a", "Lmz3/s;", "b", "Lkv1/a;", "c", "Lpv1/c;", "d", "Lpv1/f;", "Lxw/d;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s monitorDocumentsDownloadStatusUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kv1.a dynamicDocumentContainersInteractor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pv1.c getByIdDynamicDocumentsListDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f getDynamicListSingleDocumentStatusUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<rq0.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f162907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f162908b;

        /* JADX INFO: renamed from: pv1.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4026a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f162909a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f162910b;

            /* JADX INFO: renamed from: pv1.i$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4027a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f162911d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f162912e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f162913f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f162914g;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f162916j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f162917k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                Object f162918l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                Object f162919m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f162920n;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                int f162921p;

                public C4027a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f162911d = obj;
                    this.f162912e |= PKIFailureInfo.systemUnavail;
                    return C4026a.this.F(null, this);
                }
            }

            public C4026a(mu.h hVar, i iVar) {
                this.f162909a = hVar;
                this.f162910b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00f9, code lost:
            
                if (r7.F(r6, r0) == r1) goto L39;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(java.lang.Object r12, tq.e r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 255
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: pv1.i.a.C4026a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        public a(mu.g gVar, i iVar) {
            this.f162907a = gVar;
            this.f162908b = iVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super rq0.b> hVar, tq.e eVar) {
            Object objA = this.f162907a.a(new C4026a(hVar, this.f162908b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<rq0.b.EnumC4479b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f162922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f162923b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f162924a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f162925b;

            /* JADX INFO: renamed from: pv1.i$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4028a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f162926d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f162927e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f162928f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f162930h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f162931j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f162932k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                Object f162933l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                Object f162934m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f162935n;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                int f162936p;

                public C4028a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f162926d = obj;
                    this.f162927e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, i iVar) {
                this.f162924a = hVar;
                this.f162925b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
            
                if (r7.F(r2, r0) == r1) goto L33;
             */
            @Override // mu.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(java.lang.Object r12, tq.e r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 251
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: pv1.i.b.a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        public b(mu.g gVar, i iVar) {
            this.f162922a = gVar;
            this.f162923b = iVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super rq0.b.EnumC4479b> hVar, tq.e eVar) {
            Object objA = this.f162922a.a(new a(hVar, this.f162923b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<List<? extends DynamicDocument>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f162937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f162938b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f162939a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f162940b;

            /* JADX INFO: renamed from: pv1.i$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4029a extends vq.d {
                int A;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f162941d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f162942e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f162943f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f162945h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f162946j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f162947k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                Object f162948l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                Object f162949m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f162950n;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                Object f162951p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                Object f162952q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f162953r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f162954s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Object f162955t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                Object f162956v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                int f162957w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                int f162958x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                int f162959y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                int f162960z;

                public C4029a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f162941d = obj;
                    this.f162942e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, i iVar) {
                this.f162939a = hVar;
                this.f162940b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0141  */
            /* JADX WARN: Code duplicated, block: B:31:0x01ae  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x01ae -> B:32:0x01bf). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // mu.h
            public final java.lang.Object F(java.lang.Object r22, tq.e r23) {
                /*
                    Method dump skipped, instruction units count: 546
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: pv1.i.c.a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        public c(mu.g gVar, i iVar) {
            this.f162937a = gVar;
            this.f162938b = iVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends DynamicDocument>> hVar, tq.e eVar) {
            Object objA = this.f162937a.a(new a(hVar, this.f162938b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public i(s sVar, kv1.a aVar, pv1.c cVar, f fVar, xw.d dVar) {
        this.monitorDocumentsDownloadStatusUC = sVar;
        this.dynamicDocumentContainersInteractor = aVar;
        this.getByIdDynamicDocumentsListDataUC = cVar;
        this.getDynamicListSingleDocumentStatusUC = fVar;
        this.dispatcherProvider = dVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public mu.g<List<DynamicDocument>> a(gz.b.a.C1792a params) {
        return mu.i.M(new c(mu.i.Q(new a((mu.g) this.monitorDocumentsDownloadStatusUC.a(gz.b.a.C1792a.f78542a), this), new b(this.dynamicDocumentContainersInteractor.j(), this)), this), this.dispatcherProvider.getDefault());
    }
}
