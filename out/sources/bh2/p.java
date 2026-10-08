package bh2;

import cb4.DialogData;
import fr.q0;
import hh2.SetupData;
import jb4.ErrorActionData;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0083\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0001\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010)H\u0082@¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\u00020,*\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.J\u0018\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u000201H\u0096\u0001¢\u0006\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR&\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030V8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR \u0010b\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR \u0010h\u001a\b\u0012\u0004\u0012\u00020,0c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g¨\u0006i"}, d2 = {"Lbh2/p;", "Ll00/g;", "Lbh2/c;", "Lbh2/a;", "Lbh2/d;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lch2/c;", "mapper", "Lbg2/b;", "downloadOrderedDocumentUC", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lac4/n;", "openUriIntentUseCase", "Lac4/a;", "loaderUseCase", "Lmx/c;", "labelProvider", "La14/y;", "requestPermissionUseCase", "Lag2/c;", "storagePermissionNotGrantedDialogMapper", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lcb4/j;", "dialogVMSFactory", "globalSnackBarManager", "Lpx/d;", "remoteLogger", "Lbh2/b;", "setupData", "<init>", "(Lyy/a;Lch2/c;Lbg2/b;Lhb4/d;Lib4/c;Lac4/n;Lac4/a;Lmx/c;La14/y;Lag2/c;La14/m;Lcb4/j;Li70/e;Lpx/d;Lbh2/b;)V", "Ljb4/b$b;", "B9", "()Ljb4/b$b;", "Lcb4/d;", "C9", "(Ltq/e;)Ljava/lang/Object;", "Lbh2/d$a;", "D9", "(Lbh2/c;)Lbh2/d$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lch2/c;", "c", "Lbg2/b;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lac4/n;", "g", "Lac4/a;", "h", "Lmx/c;", "j", "La14/y;", "k", "Lag2/c;", "l", "La14/m;", "m", "Lcb4/j;", "n", "Li70/e;", "p", "Lpx/d;", "q", "Lbh2/b;", "Lbh2/c$a;", "r", "Lbh2/c$a;", "initialState", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lbh2/a$c;", "t", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<bh2.c, bh2.a> implements bh2.d, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ch2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bg2.b downloadOrderedDocumentUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.n openUriIntentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.y requestPermissionUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ag2.c storagePermissionNotGrantedDialogMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final bh2.c.Content initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<bh2.c, bh2.a> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bh2.a.c> navAction;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final p0<bh2.d.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f19564d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f19566f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f19564d = obj;
            this.f19566f |= PKIFailureInfo.systemUnavail;
            return p.this.C9(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<bh2.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f19567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f19568b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f19569a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f19570b;

            /* JADX INFO: renamed from: bh2.p$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0503a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f19571d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f19572e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f19573f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f19575h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f19576j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f19577k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f19578l;

                public C0503a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f19571d = obj;
                    this.f19572e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f19569a = hVar;
                this.f19570b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0503a c0503a;
                if (eVar instanceof C0503a) {
                    c0503a = (C0503a) eVar;
                    int i15 = c0503a.f19572e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0503a.f19572e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0503a = new C0503a(eVar);
                    }
                } else {
                    c0503a = new C0503a(eVar);
                }
                Object obj2 = c0503a.f19571d;
                Object objE = uq.b.e();
                int i16 = c0503a.f19572e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f19569a;
                    bh2.d.a aVarD9 = this.f19570b.D9((bh2.c) obj);
                    c0503a.f19573f = vq.j.a(obj);
                    c0503a.f19575h = vq.j.a(c0503a);
                    c0503a.f19576j = vq.j.a(obj);
                    c0503a.f19577k = vq.j.a(hVar);
                    c0503a.f19578l = 0;
                    c0503a.f19572e = 1;
                    if (hVar.F(aVarD9, c0503a) == objE) {
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

        public b(mu.g gVar, p pVar) {
            this.f19567a = gVar;
            this.f19568b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super bh2.d.a> hVar, tq.e eVar) {
            Object objA = this.f19567a.a(new a(hVar, this.f19568b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbh2/a$c;", "action", "Lbh2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbh2/a$c;Lbh2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<bh2.a.c, bh2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19580f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bh2.a.c cVar = (bh2.a.c) this.f19580f;
            Object objE = uq.b.e();
            int i15 = this.f19579e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<bh2.a.c> bVarY1 = p.this.Y1();
                this.f19580f = vq.j.a(cVar);
                this.f19579e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(bh2.a.c cVar, bh2.c cVar2, tq.e<? super i0> eVar) {
            c cVar3 = p.this.new c(eVar);
            cVar3.f19580f = cVar;
            return cVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbh2/a$a;", "action", "Lk10/c0;", "Lbh2/c;", "state", "Lk10/l;", "<anonymous>", "(Lbh2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<bh2.a.DownloadDocument, c0<bh2.c>, tq.e<? super k10.l<? extends bh2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f19584g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bh2.c.Downloading O(bh2.a.DownloadDocument downloadDocument, p pVar, bh2.c cVar) {
            return new bh2.c.Downloading(downloadDocument.getDocumentToDownload(), pVar.setupData.getOrderedDocument());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final bh2.a.DownloadDocument downloadDocument = (bh2.a.DownloadDocument) this.f19583f;
            c0 c0Var = (c0) this.f19584g;
            uq.b.e();
            if (this.f19582e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p pVar = p.this;
            return c0Var.d(new er.l() { // from class: bh2.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(downloadDocument, pVar, (c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bh2.a.DownloadDocument downloadDocument, c0<bh2.c> c0Var, tq.e<? super k10.l<? extends bh2.c>> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f19583f = downloadDocument;
            dVar.f19584g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbh2/a$f;", "<unused var>", "Lk10/c0;", "Lbh2/c;", "state", "Lk10/l;", "<anonymous>", "(Lbh2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<bh2.a.f, c0<bh2.c>, tq.e<? super k10.l<? extends bh2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19587f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bh2.c.Content O(p pVar, bh2.c cVar) {
            return new bh2.c.Content(pVar.setupData.getOrderedDocument());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f19587f;
            uq.b.e();
            if (this.f19586e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p pVar = p.this;
            return c0Var.d(new er.l() { // from class: bh2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O(pVar, (c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bh2.a.f fVar, c0<bh2.c> c0Var, tq.e<? super k10.l<? extends bh2.c>> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f19587f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbh2/a$h;", "action", "Lbh2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbh2/a$h;Lbh2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<bh2.a.ShowSnackBar, bh2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19590f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bh2.a.ShowSnackBar showSnackBar = (bh2.a.ShowSnackBar) this.f19590f;
            uq.b.e();
            if (this.f19589e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.y(new p50.a.DefaultWithIcon(showSnackBar.getMessageLabel(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bh2.a.ShowSnackBar showSnackBar, bh2.c cVar, tq.e<? super i0> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f19590f = showSnackBar;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lbh2/c$b;", "state", "Lk10/l;", "Lbh2/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<c0<bh2.c.Downloading>, tq.e<? super k10.l<? extends bh2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19593f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lbh2/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends bh2.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f19595e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f19596f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f19597g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f19598h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f19599j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f19600k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ p f19601l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ c0<bh2.c.Downloading> f19602m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, c0<bh2.c.Downloading> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f19601l = pVar;
                this.f19602m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final bh2.c.Error Y(final c0 c0Var, final p pVar, dx.b bVar, bh2.c.Downloading downloading) {
                return new bh2.c.Error(((bh2.c.Downloading) c0Var.a()).getOrderedDocument(), pVar.errorVMSFactory.a(bVar instanceof dx.b.g.Http ? pVar.B9() : pVar.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: bh2.u
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.g.a.Z(pVar, c0Var, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(p pVar, c0 c0Var, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    pVar.d9(new bh2.a.DownloadDocument(((bh2.c.Downloading) c0Var.a()).getDocumentToDownload()));
                } else {
                    pVar.d9(bh2.a.f.f19513a);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final bh2.c.Content a0(p pVar, bh2.c.Downloading downloading) {
                return new bh2.c.Content(pVar.setupData.getOrderedDocument());
            }

            /* JADX WARN: Code duplicated, block: B:25:0x00c8  */
            /* JADX WARN: Code duplicated, block: B:27:0x00f6  */
            /* JADX WARN: Code duplicated, block: B:29:0x00fa  */
            /* JADX WARN: Code duplicated, block: B:31:0x012f  */
            /* JADX WARN: Instruction removed from duplicated block: B:25:0x00c8, please report this as an issue */
            /* JADX WARN: Instruction removed from duplicated block: B:29:0x00fa, please report this as an issue */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                p pVar;
                final p pVar2;
                final c0<bh2.c.Downloading> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f19600k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    bg2.b bVar = this.f19601l.downloadOrderedDocumentUC;
                    bg2.b.Params params = new bg2.b.Params(this.f19602m.a().getDocumentToDownload());
                    this.f19600k = 1;
                    obj = bVar.d(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (p) this.f19596f;
                    oq.u.b(obj);
                }
                iVar = (dx.i) obj;
                pVar.remoteLogger.F8("OrderDetailsVM downloadOrderedDocumentUC2 result: " + iVar, px.d.a.GENERAL);
                pVar2 = this.f19601l;
                c0Var = this.f19602m;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    px.b.y5(pVar2.remoteLogger, "Error downloading error: " + bVar2, null, null, 6, null);
                    return c0Var.d(new er.l() { // from class: bh2.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.g.a.Y(c0Var, pVar2, bVar2, (c.Downloading) obj2);
                        }
                    });
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                px.b.E7(pVar2.remoteLogger, "Document downloaded successfully: " + c0Var.a().getDocumentToDownload(), null, 2, null);
                return c0Var.d(new er.l() { // from class: bh2.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.g.a.a0(pVar2, (c.Downloading) obj2);
                    }
                });
                iVar = (dx.i) obj;
                p pVar3 = this.f19601l;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    String str = (String) ((dx.i.Right) iVar).b();
                    pVar3.remoteLogger.F8("OrderDetailsVM downloadOrderedDocumentUC1 uri: " + str, px.d.a.GENERAL);
                    ac4.n nVar = pVar3.openUriIntentUseCase;
                    ac4.n.Params params2 = new ac4.n.Params(str);
                    this.f19595e = vq.j.a(iVar);
                    this.f19596f = pVar3;
                    this.f19597g = vq.j.a(str);
                    this.f19598h = 0;
                    this.f19599j = 0;
                    this.f19600k = 2;
                    obj = nVar.c(params2, this);
                    if (obj != objE) {
                        pVar = pVar3;
                        iVar = (dx.i) obj;
                        pVar.remoteLogger.F8("OrderDetailsVM downloadOrderedDocumentUC2 result: " + iVar, px.d.a.GENERAL);
                    }
                    return objE;
                }
                pVar2 = this.f19601l;
                c0Var = this.f19602m;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar3 = (dx.b) ((dx.i.Left) iVar).b();
                    px.b.y5(pVar2.remoteLogger, "Error downloading error: " + bVar3, null, null, 6, null);
                    return c0Var.d(new er.l() { // from class: bh2.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.g.a.Y(c0Var, pVar2, bVar3, (c.Downloading) obj2);
                        }
                    });
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                px.b.E7(pVar2.remoteLogger, "Document downloaded successfully: " + c0Var.a().getDocumentToDownload(), null, 2, null);
                return c0Var.d(new er.l() { // from class: bh2.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.g.a.a0(pVar2, (c.Downloading) obj2);
                    }
                });
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f19601l, this.f19602m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends bh2.c>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f19593f;
            Object objE = uq.b.e();
            int i15 = this.f19592e;
            if (i15 == 0) {
                oq.u.b(obj);
                p.this.remoteLogger.F8("OrderDetailsVM Downloading orderedDocument: " + ((bh2.c.Downloading) c0Var.a()).getOrderedDocument(), px.d.a.GENERAL);
                p pVar = p.this;
                this.f19593f = c0Var;
                this.f19592e = 1;
                obj = pVar.C9(this);
                if (obj != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            DialogData dialogData = (DialogData) obj;
            if (dialogData != null) {
                p pVar2 = p.this;
                pVar2.remoteLogger.F8("OrderDetailsVM ensureStoragePermission1", px.d.a.GENERAL);
                pVar2.d9(new bh2.a.ShowDialog(dialogData));
                return c0Var.c();
            }
            p.this.remoteLogger.F8("OrderDetailsVM ensureStoragePermission2 is null", px.d.a.GENERAL);
            ac4.a aVar = p.this.loaderUseCase;
            a aVar2 = new a(p.this, c0Var, null);
            this.f19593f = vq.j.a(c0Var);
            this.f19592e = 2;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<bh2.c.Downloading> c0Var, tq.e<? super k10.l<? extends bh2.c>> eVar) {
            return ((g) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f19593f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbh2/a$g;", "action", "Lk10/c0;", "Lbh2/c$b;", "state", "Lk10/l;", "Lbh2/c;", "<anonymous>", "(Lbh2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<bh2.a.ShowDialog, c0<bh2.c.Downloading>, tq.e<? super k10.l<? extends bh2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19604f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f19605g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bh2.c.PermissionDialog O(c0 c0Var, p pVar, bh2.a.ShowDialog showDialog, bh2.c.Downloading downloading) {
            return new bh2.c.PermissionDialog(((bh2.c.Downloading) c0Var.a()).getOrderedDocument(), pVar.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final bh2.a.ShowDialog showDialog = (bh2.a.ShowDialog) this.f19604f;
            final c0 c0Var = (c0) this.f19605g;
            uq.b.e();
            if (this.f19603e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p pVar = p.this;
            return c0Var.d(new er.l() { // from class: bh2.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.h.O(c0Var, pVar, showDialog, (c.Downloading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bh2.a.ShowDialog showDialog, c0<bh2.c.Downloading> c0Var, tq.e<? super k10.l<? extends bh2.c>> eVar) {
            h hVar = p.this.new h(eVar);
            hVar.f19604f = showDialog;
            hVar.f19605g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbh2/a$b;", "<unused var>", "Lbh2/c$d;", "Loq/i0;", "<anonymous>", "(Lbh2/a$b;Lbh2/c$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<bh2.a.b, bh2.c.PermissionDialog, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19607e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f19607e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = p.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            p pVar = p.this;
            if (iVarA instanceof dx.i.Left) {
                pVar.d9(new bh2.a.ShowSnackBar(pVar.labelProvider.c(xf2.a.R1)));
            }
            p.this.d9(bh2.a.f.f19513a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bh2.a.b bVar, bh2.c.PermissionDialog permissionDialog, tq.e<? super i0> eVar) {
            return p.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbh2/a$e;", "<unused var>", "Lbh2/c$a;", "state", "Loq/i0;", "<anonymous>", "(Lbh2/a$e;Lbh2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<bh2.a.e, bh2.c.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19610f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bh2.c.Content content = (bh2.c.Content) this.f19610f;
            uq.b.e();
            if (this.f19609e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(new bh2.a.c.ToShowQr(new SetupData(content.getOrderedDocument())));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bh2.a.e eVar, bh2.c.Content content, tq.e<? super i0> eVar2) {
            j jVar = p.this.new j(eVar2);
            jVar.f19610f = content;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbh2/a$d;", "<unused var>", "Lbh2/c$a;", "state", "Loq/i0;", "<anonymous>", "(Lbh2/a$d;Lbh2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<bh2.a.d, bh2.c.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19613f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bh2.c.Content content = (bh2.c.Content) this.f19613f;
            uq.b.e();
            if (this.f19612e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(new bh2.a.c.ToCheckDocumentStatus(content.getOrderedDocument().getVerificationCode(), null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bh2.a.d dVar, bh2.c.Content content, tq.e<? super i0> eVar) {
            k kVar = p.this.new k(eVar);
            kVar.f19613f = content;
            return kVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ch2.c cVar, bg2.b bVar, hb4.d dVar, ib4.c cVar2, ac4.n nVar, ac4.a aVar2, mx.c cVar3, a14.y yVar, ag2.c cVar4, a14.m mVar, cb4.j jVar, i70.e eVar, px.d dVar2, SetupData setupData) {
        this.mapper = cVar;
        this.downloadOrderedDocumentUC = bVar;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar2;
        this.openUriIntentUseCase = nVar;
        this.loaderUseCase = aVar2;
        this.labelProvider = cVar3;
        this.requestPermissionUseCase = yVar;
        this.storagePermissionNotGrantedDialogMapper = cVar4;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.dialogVMSFactory = jVar;
        this.globalSnackBarManager = eVar;
        this.remoteLogger = dVar2;
        this.setupData = setupData;
        bh2.c.Content content = new bh2.c.Content(setupData.getOrderedDocument());
        this.initialState = content;
        this.stateMachine = aVar.a(content, new er.l() { // from class: bh2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.H9(this.f19545a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), D9(content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b.Failure B9() {
        return new jb4.b.Failure(this.labelProvider.c(xf2.a.f218365h0), this.labelProvider.c(xf2.a.f218362g0), null, new ErrorActionData(this.labelProvider.c(xf2.a.f218361g), b9(bh2.a.f.f19513a)), null, null, null, 116, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C9(tq.e<? super DialogData> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f19566f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f19566f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f19564d;
        Object objE = uq.b.e();
        int i16 = aVar.f19566f;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.y yVar = this.requestPermissionUseCase;
            a14.y.Params params = new a14.y.Params(gy.d.EXTERNAL_STORAGE);
            aVar.f19566f = 1;
            objC = yVar.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        u04.c cVar = (u04.c) objC;
        if (cVar instanceof u04.c.b) {
            return this.storagePermissionNotGrantedDialogMapper.b(new ag2.c.Params(b9(bh2.a.f.f19513a), b9(bh2.a.b.f19507a)));
        }
        if (cVar instanceof u04.c.a) {
            return null;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bh2.d.a D9(bh2.c cVar) {
        return this.mapper.b(new ch2.c.Params(cVar, b9(bh2.a.c.C0499a.f19508a), new er.l() { // from class: bh2.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.E9(this.f19543a, (tq0.b) obj);
            }
        }, new er.l() { // from class: bh2.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.F9(this.f19544a, (tq0.b) obj);
            }
        }, b9(bh2.a.d.f19511a), b9(bh2.a.e.f19512a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(p pVar, tq0.b bVar) {
        pVar.d9(new bh2.a.DownloadDocument(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(p pVar, tq0.b bVar) {
        pVar.d9(new bh2.a.DownloadDocument(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(bh2.c.class), new er.l() { // from class: bh2.i
            @Override // er.l
            public final Object b(Object obj) {
                return p.I9(this.f19539a, (z) obj);
            }
        });
        vVar.c(q0.c(bh2.c.Downloading.class), new er.l() { // from class: bh2.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.J9(this.f19540a, (z) obj);
            }
        });
        vVar.c(q0.c(bh2.c.PermissionDialog.class), new er.l() { // from class: bh2.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.K9(this.f19541a, (z) obj);
            }
        });
        vVar.c(q0.c(bh2.c.Content.class), new er.l() { // from class: bh2.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.L9(this.f19542a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(p pVar, z zVar) {
        c cVar = pVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bh2.a.c.class), oVar, cVar);
        zVar.v(q0.c(bh2.a.DownloadDocument.class), oVar, pVar.new d(null));
        zVar.v(q0.c(bh2.a.f.class), oVar, pVar.new e(null));
        zVar.x(q0.c(bh2.a.ShowSnackBar.class), oVar, pVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(p pVar, z zVar) {
        zVar.A(pVar.new g(null));
        h hVar = pVar.new h(null);
        zVar.v(q0.c(bh2.a.ShowDialog.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(p pVar, z zVar) {
        i iVar = pVar.new i(null);
        zVar.x(q0.c(bh2.a.b.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(p pVar, z zVar) {
        j jVar = pVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bh2.a.e.class), oVar, jVar);
        zVar.x(q0.c(bh2.a.d.class), oVar, pVar.new k(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<bh2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<bh2.c, bh2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bh2.d.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
