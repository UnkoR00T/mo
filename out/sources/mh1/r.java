package mh1;

import cb4.DialogData;
import fr.q0;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BQ\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003098\u0014X\u0094\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lmh1/r;", "Ll00/g;", "Lmh1/j;", "Lmh1/i;", "Lmh1/k;", "", "Lyy/a;", "stateMachineFactory", "Lmh1/b;", "mapper", "Lch1/x;", "getDocumentsOrderUseCase", "Lyg1/a;", "dashboardContainersInteractor", "Lcb4/j;", "dialogVMSFactory", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUC", "Lmz3/g;", "cleanupDocumentDownloadDataUC", "<init>", "(Lyy/a;Lmh1/b;Lch1/x;Lyg1/a;Lcb4/j;Lhb4/d;Lib4/c;Lac4/a;Lmz3/g;)V", "state", "Lmh1/k$a;", "x9", "(Lmh1/j;)Lmh1/k$a;", "b", "Lmh1/b;", "c", "Lch1/x;", "d", "Lyg1/a;", "e", "Lcb4/j;", "f", "Lhb4/d;", "g", "Lib4/c;", "h", "Lac4/a;", "j", "Lmz3/g;", "Lmh1/j$a;", "k", "Lmh1/j$a;", "initialState", "Lxw/b;", "Lmh1/i$e;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<j, i> implements k, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mh1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ch1.x getDocumentsOrderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yg1.a dashboardContainersInteractor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mz3.g cleanupDocumentDownloadDataUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final j.Content initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i.e> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<j, i> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<k.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f126575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f126576b;

        /* JADX INFO: renamed from: mh1.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3112a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f126577a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f126578b;

            /* JADX INFO: renamed from: mh1.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3113a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f126579d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f126580e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f126581f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f126583h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f126584j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f126585k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f126586l;

                public C3113a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f126579d = obj;
                    this.f126580e |= PKIFailureInfo.systemUnavail;
                    return C3112a.this.F(null, this);
                }
            }

            public C3112a(mu.h hVar, r rVar) {
                this.f126577a = hVar;
                this.f126578b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3113a c3113a;
                if (eVar instanceof C3113a) {
                    c3113a = (C3113a) eVar;
                    int i15 = c3113a.f126580e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3113a.f126580e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3113a = new C3113a(eVar);
                    }
                } else {
                    c3113a = new C3113a(eVar);
                }
                Object obj2 = c3113a.f126579d;
                Object objE = uq.b.e();
                int i16 = c3113a.f126580e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f126577a;
                    k.a aVarX9 = this.f126578b.x9((j) obj);
                    c3113a.f126581f = vq.j.a(obj);
                    c3113a.f126583h = vq.j.a(c3113a);
                    c3113a.f126584j = vq.j.a(obj);
                    c3113a.f126585k = vq.j.a(hVar);
                    c3113a.f126586l = 0;
                    c3113a.f126580e = 1;
                    if (hVar.F(aVarX9, c3113a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, r rVar) {
            this.f126575a = gVar;
            this.f126576b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super k.a> hVar, tq.e eVar) {
            Object objA = this.f126575a.a(new C3112a(hVar, this.f126576b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmh1/i$e;", "action", "Lmh1/j;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmh1/i$e;Lmh1/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<i.e, j, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126588f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i.e eVar = (i.e) this.f126588f;
            Object objE = uq.b.e();
            int i15 = this.f126587e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<i.e> bVarY1 = r.this.Y1();
                this.f126588f = vq.j.a(eVar);
                this.f126587e = 1;
                if (bVarY1.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i.e eVar, j jVar, tq.e<? super i0> eVar2) {
            b bVar = r.this.new b(eVar2);
            bVar.f126588f = eVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmh1/j$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmh1/j$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<j.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126590e;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lk34/g;", "documents", "Loq/i0;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<List<? extends k34.g>, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f126592e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f126593f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ r f126594g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f126594g = rVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                List list = (List) this.f126593f;
                uq.b.e();
                if (this.f126592e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f126594g.d9(new i.LoadDocuments(list));
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(List<? extends k34.g> list, tq.e<? super i0> eVar) {
                return ((a) v(list, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f126594g, eVar);
                aVar.f126593f = obj;
                return aVar;
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f126590e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g<List<k34.g>> gVarH = r.this.getDocumentsOrderUseCase.h(gz.b.a.C1792a.f78542a);
                a aVar = new a(r.this, null);
                this.f126590e = 1;
                if (mu.i.j(gVarH, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(j.Content content, tq.e<? super i0> eVar) {
            return ((c) v(content, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return r.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmh1/i$d;", "action", "Lk10/c0;", "Lmh1/j$a;", "state", "Lk10/l;", "Lmh1/j;", "<anonymous>", "(Lmh1/i$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<i.LoadDocuments, k10.c0<j.Content>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126597g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j.Content O(i.LoadDocuments loadDocuments, j.Content content) {
            return content.b(loadDocuments.a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i.LoadDocuments loadDocuments = (i.LoadDocuments) this.f126596f;
            k10.c0 c0Var = (k10.c0) this.f126597g;
            uq.b.e();
            if (this.f126595e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (loadDocuments.a().isEmpty()) {
                r.this.d9(i.e.b.f126545a);
            }
            return c0Var.b(new er.l() { // from class: mh1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.d.O(loadDocuments, (j.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i.LoadDocuments loadDocuments, k10.c0<j.Content> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            d dVar = r.this.new d(eVar);
            dVar.f126596f = loadDocuments;
            dVar.f126597g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmh1/i$f;", "action", "Lk10/c0;", "Lmh1/j$a;", "state", "Lk10/l;", "Lmh1/j;", "<anonymous>", "(Lmh1/i$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<i.ShowDeletionDialog, k10.c0<j.Content>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126601g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j.DocumentDeletionError X(final r rVar, dx.b bVar, j.Content content) {
            return new j.DocumentDeletionError(content.a(), rVar.errorVMSFactory.a(rVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: mh1.v
                @Override // er.l
                public final Object b(Object obj) {
                    return r.e.Y(rVar, (ib4.c.b) obj);
                }
            }))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Y(r rVar, ib4.c.b bVar) {
            rVar.d9(i.c.f126542a);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j.DocumentDeletionDialog Z(i.ShowDeletionDialog showDeletionDialog, r rVar, DialogData dialogData, j.Content content) {
            return new j.DocumentDeletionDialog(content.a(), showDeletionDialog.getDocument(), rVar.dialogVMSFactory.a(dialogData));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i.ShowDeletionDialog showDeletionDialog = (i.ShowDeletionDialog) this.f126600f;
            k10.c0 c0Var = (k10.c0) this.f126601g;
            Object objE = uq.b.e();
            int i15 = this.f126599e;
            if (i15 == 0) {
                oq.u.b(obj);
                yg1.a aVar = r.this.dashboardContainersInteractor;
                rq0.b type = showDeletionDialog.getDocument().getType();
                er.a<i0> aVarB9 = r.this.b9(i.b.f126541a);
                er.a<i0> aVarB10 = r.this.b9(i.a.f126540a);
                this.f126600f = showDeletionDialog;
                this.f126601g = c0Var;
                this.f126599e = 1;
                obj = aVar.f(type, aVarB9, aVarB10, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            final r rVar = r.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: mh1.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.e.X(rVar, bVar, (j.Content) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final DialogData dialogData = (DialogData) ((dx.i.Right) iVar).b();
            final r rVar2 = r.this;
            return c0Var.d(new er.l() { // from class: mh1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.e.Z(showDeletionDialog, rVar2, dialogData, (j.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(i.ShowDeletionDialog showDeletionDialog, k10.c0<j.Content> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            e eVar2 = r.this.new e(eVar);
            eVar2.f126600f = showDeletionDialog;
            eVar2.f126601g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmh1/i$c;", "<unused var>", "Lk10/c0;", "Lmh1/j$c;", "state", "Lk10/l;", "Lmh1/j;", "<anonymous>", "(Lmh1/i$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<i.c, k10.c0<j.DocumentDeletionError>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126604f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j.Content O(j.DocumentDeletionError documentDeletionError) {
            return new j.Content(documentDeletionError.a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f126604f;
            uq.b.e();
            if (this.f126603e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mh1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.f.O((j.DocumentDeletionError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i.c cVar, k10.c0<j.DocumentDeletionError> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            f fVar = new f(eVar);
            fVar.f126604f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmh1/i$a;", "<unused var>", "Lk10/c0;", "Lmh1/j$b;", "state", "Lk10/l;", "Lmh1/j;", "<anonymous>", "(Lmh1/i$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<i.a, k10.c0<j.DocumentDeletionDialog>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126606f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j.Content O(j.DocumentDeletionDialog documentDeletionDialog) {
            return new j.Content(documentDeletionDialog.a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f126606f;
            uq.b.e();
            if (this.f126605e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mh1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.g.O((j.DocumentDeletionDialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i.a aVar, k10.c0<j.DocumentDeletionDialog> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            g gVar = new g(eVar);
            gVar.f126606f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmh1/i$b;", "<unused var>", "Lk10/c0;", "Lmh1/j$b;", "state", "Lk10/l;", "Lmh1/j;", "<anonymous>", "(Lmh1/i$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<i.b, k10.c0<j.DocumentDeletionDialog>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126607e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126608f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lmh1/j;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends j>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f126610e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f126611f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<j.DocumentDeletionDialog> f126612g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, k10.c0<j.DocumentDeletionDialog> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f126611f = rVar;
                this.f126612g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final j.DocumentDeletionError Y(final r rVar, dx.b bVar, j.DocumentDeletionDialog documentDeletionDialog) {
                return new j.DocumentDeletionError(documentDeletionDialog.a(), rVar.errorVMSFactory.a(rVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: mh1.a0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.h.a.Z(rVar, (ib4.c.b) obj);
                    }
                }))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(r rVar, ib4.c.b bVar) {
                rVar.d9(i.c.f126542a);
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final j.Content a0(r rVar, j.DocumentDeletionDialog documentDeletionDialog) {
                return rVar.initialState;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
            
                if (r7.c(r4, r6) == r0) goto L21;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
                /*
                    r6 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r6.f126610e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    oq.u.b(r7)
                    goto L8b
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    oq.u.b(r7)
                    goto L41
                L1f:
                    oq.u.b(r7)
                    mh1.r r7 = r6.f126611f
                    yg1.a r7 = mh1.r.q9(r7)
                    k10.c0<mh1.j$b> r1 = r6.f126612g
                    java.lang.Object r1 = r1.a()
                    mh1.j$b r1 = (mh1.j.DocumentDeletionDialog) r1
                    k34.g r1 = r1.getDocumentToDelete()
                    rq0.b r1 = r1.getType()
                    r6.f126610e = r3
                    java.lang.Object r7 = r7.b(r1, r6)
                    if (r7 != r0) goto L41
                    goto L8a
                L41:
                    dx.i r7 = (dx.i) r7
                    k10.c0<mh1.j$b> r1 = r6.f126612g
                    mh1.r r4 = r6.f126611f
                    boolean r5 = r7 instanceof dx.i.Left
                    if (r5 == 0) goto L5d
                    dx.i$b r7 = (dx.i.Left) r7
                    java.lang.Object r7 = r7.b()
                    dx.b r7 = (dx.b) r7
                    mh1.y r0 = new mh1.y
                    r0.<init>()
                    k10.l r7 = r1.d(r0)
                    return r7
                L5d:
                    boolean r1 = r7 instanceof dx.i.Right
                    if (r1 == 0) goto L99
                    dx.i$c r7 = (dx.i.Right) r7
                    r7.b()
                    mh1.r r7 = r6.f126611f
                    mz3.g r7 = mh1.r.p9(r7)
                    k10.c0<mh1.j$b> r1 = r6.f126612g
                    java.lang.Object r1 = r1.a()
                    mh1.j$b r1 = (mh1.j.DocumentDeletionDialog) r1
                    k34.g r1 = r1.getDocumentToDelete()
                    rq0.b r1 = r1.getType()
                    mz3.g$a r4 = new mz3.g$a
                    r5 = 0
                    r4.<init>(r1, r5, r3)
                    r6.f126610e = r2
                    java.lang.Object r7 = r7.c(r4, r6)
                    if (r7 != r0) goto L8b
                L8a:
                    return r0
                L8b:
                    k10.c0<mh1.j$b> r7 = r6.f126612g
                    mh1.r r0 = r6.f126611f
                    mh1.z r1 = new mh1.z
                    r1.<init>()
                    k10.l r7 = r7.d(r1)
                    return r7
                L99:
                    oq.p r7 = new oq.p
                    r7.<init>()
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: mh1.r.h.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f126611f, this.f126612g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends j>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f126608f;
            Object objE = uq.b.e();
            int i15 = this.f126607e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUC;
            a aVar2 = new a(r.this, c0Var, null);
            this.f126608f = vq.j.a(c0Var);
            this.f126607e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i.b bVar, k10.c0<j.DocumentDeletionDialog> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            h hVar = r.this.new h(eVar);
            hVar.f126608f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, mh1.b bVar, ch1.x xVar, yg1.a aVar2, cb4.j jVar, hb4.d dVar, ib4.c cVar, ac4.a aVar3, mz3.g gVar) {
        this.mapper = bVar;
        this.getDocumentsOrderUseCase = xVar;
        this.dashboardContainersInteractor = aVar2;
        this.dialogVMSFactory = jVar;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUC = aVar3;
        this.cleanupDocumentDownloadDataUC = gVar;
        j.Content content = new j.Content(pq.v.n());
        this.initialState = content;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(content, new er.l() { // from class: mh1.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.A9(this.f126558a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), x9(content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(j.class), new er.l() { // from class: mh1.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f126559a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(j.Content.class), new er.l() { // from class: mh1.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.C9(this.f126560a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(j.DocumentDeletionError.class), new er.l() { // from class: mh1.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.D9((k10.z) obj);
            }
        });
        vVar.c(q0.c(j.DocumentDeletionDialog.class), new er.l() { // from class: mh1.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.E9(this.f126561a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, k10.z zVar) {
        b bVar = rVar.new b(null);
        zVar.x(q0.c(i.e.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(r rVar, k10.z zVar) {
        zVar.C(rVar.new c(null));
        d dVar = rVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(i.LoadDocuments.class), oVar, dVar);
        zVar.v(q0.c(i.ShowDeletionDialog.class), oVar, rVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(k10.z zVar) {
        f fVar = new f(null);
        zVar.v(q0.c(i.c.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(r rVar, k10.z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(i.a.class), oVar, gVar);
        zVar.v(q0.c(i.b.class), oVar, rVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k.a x9(j state) {
        return this.mapper.b(new mh1.b.Params(state, b9(i.e.a.f126544a), new er.l() { // from class: mh1.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f126562a, (k34.g) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(r rVar, k34.g gVar) {
        rVar.d9(new i.ShowDeletionDialog(gVar));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<i.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<j, i> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<k.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(k.a aVar) {
        super.P5(aVar);
    }
}
