package fh2;

import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bg\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J+\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'2\u0006\u0010#\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020-*\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010&\u001a\b\u0012\u0004\u0012\u00020-0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006W"}, d2 = {"Lfh2/y;", "Ll00/g;", "Lfh2/d;", "Lfh2/a;", "Lfh2/e;", "", "Lyy/a;", "stateMachineFactory", "La14/x;", "requestCameraPermissionUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lbg2/i;", "validInputQrCodeUseCase", "Lgh2/f;", "screenMapper", "Lib4/c;", "domainErrorMapper", "Lbg2/h;", "validCodeQrUC", "Lsz/d;", "cameraScannerPreviewViewConnector", "Lac4/r;", "", "scanCameraUseCase", "Lhb4/d;", "errorVMSFactory", "Lag2/a;", "codeMapper", "<init>", "(Lyy/a;La14/x;La14/m;Lbg2/i;Lgh2/f;Lib4/c;Lbg2/h;Lsz/d;Lac4/r;Lhb4/d;Lag2/a;)V", "Lhz/b;", "L9", "(Ljava/lang/String;)Lhz/b;", "Lfh2/a$j;", "action", "Lk10/c0;", "Lfh2/d$a$a;", "state", "Lk10/l;", "F9", "(Lfh2/a$j;Lk10/c0;)Lk10/l;", "Lhb4/c;", "x9", "(Lfh2/a$j;)Lhb4/c;", "Lfh2/e$a;", "A9", "(Lfh2/d;)Lfh2/e$a;", "b", "La14/x;", "c", "La14/m;", "d", "Lbg2/i;", "e", "Lgh2/f;", "f", "Lib4/c;", "g", "Lbg2/h;", "h", "Lac4/r;", "j", "Lhb4/d;", "k", "Lag2/a;", "l", "Lfh2/d$a$a;", "initialState", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lfh2/a$c;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y extends l00.g<fh2.d, fh2.a> implements fh2.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a14.x requestCameraPermissionUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bg2.i validInputQrCodeUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final gh2.f screenMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final bg2.h validCodeQrUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.r<String> scanCameraUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ag2.a codeMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final fh2.d.a.Scanner initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<fh2.d, fh2.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fh2.a.c> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<fh2.e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<fh2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f63907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f63908b;

        /* JADX INFO: renamed from: fh2.y$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1425a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f63909a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f63910b;

            /* JADX INFO: renamed from: fh2.y$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1426a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f63911d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f63912e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f63913f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f63915h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f63916j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f63917k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f63918l;

                public C1426a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f63911d = obj;
                    this.f63912e |= PKIFailureInfo.systemUnavail;
                    return C1425a.this.F(null, this);
                }
            }

            public C1425a(mu.h hVar, y yVar) {
                this.f63909a = hVar;
                this.f63910b = yVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1426a c1426a;
                if (eVar instanceof C1426a) {
                    c1426a = (C1426a) eVar;
                    int i15 = c1426a.f63912e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1426a.f63912e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1426a = new C1426a(eVar);
                    }
                } else {
                    c1426a = new C1426a(eVar);
                }
                Object obj2 = c1426a.f63911d;
                Object objE = uq.b.e();
                int i16 = c1426a.f63912e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f63909a;
                    fh2.e.a aVarA9 = this.f63910b.A9((fh2.d) obj);
                    c1426a.f63913f = vq.j.a(obj);
                    c1426a.f63915h = vq.j.a(c1426a);
                    c1426a.f63916j = vq.j.a(obj);
                    c1426a.f63917k = vq.j.a(hVar);
                    c1426a.f63918l = 0;
                    c1426a.f63912e = 1;
                    if (hVar.F(aVarA9, c1426a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, y yVar) {
            this.f63907a = gVar;
            this.f63908b = yVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fh2.e.a> hVar, tq.e eVar) {
            Object objA = this.f63907a.a(new C1425a(hVar, this.f63908b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfh2/a$c;", "action", "Lfh2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfh2/a$c;Lfh2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<fh2.a.c, fh2.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f63920f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fh2.a.c cVar = (fh2.a.c) this.f63920f;
            Object objE = uq.b.e();
            int i15 = this.f63919e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                this.f63920f = vq.j.a(cVar);
                this.f63919e = 1;
                if (yVar.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fh2.a.c cVar, fh2.d dVar, tq.e<? super oq.i0> eVar) {
            b bVar = y.this.new b(eVar);
            bVar.f63920f = cVar;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfh2/a$a;", "<unused var>", "Lfh2/d;", "Loq/i0;", "<anonymous>", "(Lfh2/a$a;Lfh2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<fh2.a.C1421a, fh2.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63922e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f63922e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                fh2.a.c.C1422a c1422a = fh2.a.c.C1422a.f63804a;
                this.f63922e = 1;
                if (yVar.F(c1422a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fh2.a.C1421a c1421a, fh2.d dVar, tq.e<? super oq.i0> eVar) {
            return y.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfh2/a$i;", "<unused var>", "Lk10/c0;", "Lfh2/d$b;", "state", "Lk10/l;", "Lfh2/d;", "<anonymous>", "(Lfh2/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<fh2.a.i, k10.c0<fh2.d.Error>, tq.e<? super k10.l<? extends fh2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f63925f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fh2.d.a.Scanner O(k10.c0 c0Var, fh2.d.Error error) {
            return new fh2.d.a.Scanner(((fh2.d.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f63925f;
            uq.b.e();
            if (this.f63924e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fh2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.d.O(c0Var, (d.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fh2.a.i iVar, k10.c0<fh2.d.Error> c0Var, tq.e<? super k10.l<? extends fh2.d>> eVar) {
            d dVar = new d(eVar);
            dVar.f63925f = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfh2/a$b;", "<unused var>", "Lfh2/d$a$a;", "Loq/i0;", "<anonymous>", "(Lfh2/a$b;Lfh2/d$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<fh2.a.b, fh2.d.a.Scanner, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63926e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f63926e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fh2.a.b bVar, fh2.d.a.Scanner scanner, tq.e<? super oq.i0> eVar) {
            return y.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfh2/a$j;", "action", "Lk10/c0;", "Lfh2/d$a$a;", "state", "Lk10/l;", "Lfh2/d;", "<anonymous>", "(Lfh2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<fh2.a.ShowError, k10.c0<fh2.d.a.Scanner>, tq.e<? super k10.l<? extends fh2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f63929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f63930g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fh2.a.ShowError showError = (fh2.a.ShowError) this.f63929f;
            k10.c0 c0Var = (k10.c0) this.f63930g;
            uq.b.e();
            if (this.f63928e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return y.this.F9(showError, c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fh2.a.ShowError showError, k10.c0<fh2.d.a.Scanner> c0Var, tq.e<? super k10.l<? extends fh2.d>> eVar) {
            f fVar = y.this.new f(eVar);
            fVar.f63929f = showError;
            fVar.f63930g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfh2/d$a$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfh2/d$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<fh2.d.a.Scanner, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63932e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f63932e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.d9(fh2.a.h.f63810a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(fh2.d.a.Scanner scanner, tq.e<? super oq.i0> eVar) {
            return ((g) v(scanner, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return y.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfh2/a$h;", "<unused var>", "Lk10/c0;", "Lfh2/d$a$a;", "state", "Lk10/l;", "Lfh2/d;", "<anonymous>", "(Lfh2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<fh2.a.h, k10.c0<fh2.d.a.Scanner>, tq.e<? super k10.l<? extends fh2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f63935f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fh2.d.a.Scanner O(u04.c cVar, fh2.d.a.Scanner scanner) {
            return scanner.b(ContentModelData.b(scanner.getData(), false, null, null, false, cVar, null, null, 111, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f63935f;
            Object objE = uq.b.e();
            int i15 = this.f63934e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.x xVar = y.this.requestCameraPermissionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f63935f = c0Var;
                this.f63934e = 1;
                obj = xVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final u04.c cVar = (u04.c) obj;
            y.this.d9(fh2.a.g.f63809a);
            return c0Var.b(new er.l() { // from class: fh2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.h.O(cVar, (d.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fh2.a.h hVar, k10.c0<fh2.d.a.Scanner> c0Var, tq.e<? super k10.l<? extends fh2.d>> eVar) {
            h hVar2 = y.this.new h(eVar);
            hVar2.f63935f = c0Var;
            return hVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfh2/a$k;", "action", "Lk10/c0;", "Lfh2/d$a$a;", "state", "Lk10/l;", "Lfh2/d;", "<anonymous>", "(Lfh2/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<fh2.a.UpdateCodeBottomSheet, k10.c0<fh2.d.a.Scanner>, tq.e<? super k10.l<? extends fh2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f63938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f63939g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fh2.d.a.Scanner O(fh2.a.UpdateCodeBottomSheet updateCodeBottomSheet, fh2.d.a.Scanner scanner) {
            return scanner.b(ContentModelData.b(scanner.getData(), updateCodeBottomSheet.getShow(), null, null, false, null, null, null, 126, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fh2.a.UpdateCodeBottomSheet updateCodeBottomSheet = (fh2.a.UpdateCodeBottomSheet) this.f63938f;
            k10.c0 c0Var = (k10.c0) this.f63939g;
            uq.b.e();
            if (this.f63937e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fh2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.i.O(updateCodeBottomSheet, (d.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fh2.a.UpdateCodeBottomSheet updateCodeBottomSheet, k10.c0<fh2.d.a.Scanner> c0Var, tq.e<? super k10.l<? extends fh2.d>> eVar) {
            i iVar = new i(eVar);
            iVar.f63938f = updateCodeBottomSheet;
            iVar.f63939g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfh2/a$d;", "action", "Lk10/c0;", "Lfh2/d$a$a;", "state", "Lk10/l;", "Lfh2/d;", "<anonymous>", "(Lfh2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<fh2.a.OnCodeChange, k10.c0<fh2.d.a.Scanner>, tq.e<? super k10.l<? extends fh2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f63941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f63942g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fh2.d.a.Scanner O(fh2.a.OnCodeChange onCodeChange, fh2.d.a.Scanner scanner) {
            return scanner.b(ContentModelData.b(scanner.getData(), false, onCodeChange.getCode(), hz.b.d.f86848c, false, null, null, null, 121, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fh2.a.OnCodeChange onCodeChange = (fh2.a.OnCodeChange) this.f63941f;
            k10.c0 c0Var = (k10.c0) this.f63942g;
            uq.b.e();
            if (this.f63940e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fh2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.j.O(onCodeChange, (d.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fh2.a.OnCodeChange onCodeChange, k10.c0<fh2.d.a.Scanner> c0Var, tq.e<? super k10.l<? extends fh2.d>> eVar) {
            j jVar = new j(eVar);
            jVar.f63941f = onCodeChange;
            jVar.f63942g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfh2/a$e;", "<unused var>", "Lk10/c0;", "Lfh2/d$a$a;", "state", "Lk10/l;", "Lfh2/d;", "<anonymous>", "(Lfh2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<fh2.a.e, k10.c0<fh2.d.a.Scanner>, tq.e<? super k10.l<? extends fh2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f63944f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fh2.d.a.Scanner O(fh2.d.a.Scanner scanner, fh2.d.a.Scanner scanner2) {
            return scanner;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f63944f;
            uq.b.e();
            if (this.f63943e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            hz.b bVarL9 = y.this.L9(((fh2.d.a.Scanner) c0Var.a()).getData().getCode());
            final fh2.d.a.Scanner scannerB = ((fh2.d.a.Scanner) c0Var.a()).b(ContentModelData.b(((fh2.d.a.Scanner) c0Var.a()).getData(), false, null, bVarL9, true, null, null, null, 115, null));
            boolean zA = bVarL9.a();
            if (zA) {
                y.this.d9(new fh2.a.VerifyCode(tq0.l.b(((fh2.d.a.Scanner) c0Var.a()).getData().getCode()), false, null));
                return c0Var.c();
            }
            if (zA) {
                throw new oq.p();
            }
            return c0Var.b(new er.l() { // from class: fh2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.k.O(scannerB, (d.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fh2.a.e eVar, k10.c0<fh2.d.a.Scanner> c0Var, tq.e<? super k10.l<? extends fh2.d>> eVar2) {
            k kVar = y.this.new k(eVar2);
            kVar.f63944f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldx/i;", "Ldx/b;", "", "action", "Lfh2/d$a$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldx/i;Lfh2/d$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<dx.i<? extends dx.b, ? extends String>, fh2.d.a.Scanner, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63946e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f63947f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f63947f;
            uq.b.e();
            if (this.f63946e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y yVar = y.this;
            if (iVar instanceof dx.i.Right) {
                yVar.d9(new fh2.a.OnScannedQrCode((String) ((dx.i.Right) iVar).b()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, String> iVar, fh2.d.a.Scanner scanner, tq.e<? super oq.i0> eVar) {
            l lVar = y.this.new l(eVar);
            lVar.f63947f = iVar;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfh2/a$f;", "action", "Lk10/c0;", "Lfh2/d$a$a;", "state", "Lk10/l;", "Lfh2/d;", "<anonymous>", "(Lfh2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<fh2.a.OnScannedQrCode, k10.c0<fh2.d.a.Scanner>, tq.e<? super k10.l<? extends fh2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63949e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f63950f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f63951g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fh2.d.a.Scanner O(fh2.a.OnScannedQrCode onScannedQrCode, fh2.d.a.Scanner scanner) {
            return scanner.b(ContentModelData.b(scanner.getData(), false, null, null, false, null, null, onScannedQrCode.getCode(), 63, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fh2.a.OnScannedQrCode onScannedQrCode = (fh2.a.OnScannedQrCode) this.f63950f;
            k10.c0 c0Var = (k10.c0) this.f63951g;
            uq.b.e();
            if (this.f63949e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(onScannedQrCode.getCode(), ((fh2.d.a.Scanner) c0Var.a()).getData().getLastScannedCode())) {
                return c0Var.c();
            }
            y.this.d9(new fh2.a.VerifyCode(y.this.codeMapper.c(onScannedQrCode.getCode()), true, null));
            return c0Var.b(new er.l() { // from class: fh2.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.m.O(onScannedQrCode, (d.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fh2.a.OnScannedQrCode onScannedQrCode, k10.c0<fh2.d.a.Scanner> c0Var, tq.e<? super k10.l<? extends fh2.d>> eVar) {
            m mVar = y.this.new m(eVar);
            mVar.f63950f = onScannedQrCode;
            mVar.f63951g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfh2/a$l;", "action", "Lfh2/d$a$a;", "state", "Loq/i0;", "<anonymous>", "(Lfh2/a$l;Lfh2/d$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<fh2.a.VerifyCode, fh2.d.a.Scanner, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f63953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f63954f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f63955g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f63956h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f63957j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f63958k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f63959l;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x008d  */
        /* JADX WARN: Code duplicated, block: B:21:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i<dx.b, tq0.l> iVarB;
            y yVar;
            y yVar2;
            fh2.a.VerifyCode verifyCode = (fh2.a.VerifyCode) this.f63959l;
            Object objE = uq.b.e();
            int i15 = this.f63958k;
            if (i15 == 0) {
                oq.u.b(obj);
                iVarB = y.this.validCodeQrUC.b(new bg2.h.Params(verifyCode.getCode(), null));
                y yVar3 = y.this;
                if (!(iVarB instanceof dx.i.Left)) {
                    if (!(iVarB instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    String code = ((tq0.l) ((dx.i.Right) iVarB).b()).getCode();
                    fh2.a.c.GoToDocument goToDocument = new fh2.a.c.GoToDocument(code, null);
                    this.f63959l = verifyCode;
                    this.f63953e = vq.j.a(iVarB);
                    this.f63954f = yVar3;
                    this.f63955g = vq.j.a(code);
                    this.f63956h = 0;
                    this.f63957j = 0;
                    this.f63958k = 1;
                    if (yVar3.F(goToDocument, this) == objE) {
                        return objE;
                    }
                    yVar = yVar3;
                }
                yVar2 = y.this;
                if (iVarB instanceof dx.i.Left) {
                    yVar2.d9(new fh2.a.ShowError((dx.b) ((dx.i.Left) iVarB).b(), verifyCode.getIsFromQrScan(), verifyCode.getCode()));
                    new dx.i.Left(oq.i0.f148189a);
                } else if (!(iVarB instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = (y) this.f63954f;
            oq.u.b(obj);
            yVar.d9(fh2.a.h.f63810a);
            iVarB = new dx.i.Right(oq.i0.f148189a);
            yVar2 = y.this;
            if (iVarB instanceof dx.i.Left) {
                yVar2.d9(new fh2.a.ShowError((dx.b) ((dx.i.Left) iVarB).b(), verifyCode.getIsFromQrScan(), verifyCode.getCode()));
                new dx.i.Left(oq.i0.f148189a);
            } else if (!(iVarB instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fh2.a.VerifyCode verifyCode, fh2.d.a.Scanner scanner, tq.e<? super oq.i0> eVar) {
            n nVar = y.this.new n(eVar);
            nVar.f63959l = verifyCode;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfh2/a$g;", "<unused var>", "Lk10/c0;", "Lfh2/d$a$a;", "state", "Lk10/l;", "Lfh2/d;", "<anonymous>", "(Lfh2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<fh2.a.g, k10.c0<fh2.d.a.Scanner>, tq.e<? super k10.l<? extends fh2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f63962f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fh2.d.a.Scanner O(fh2.d.a.Scanner scanner) {
            return scanner.b(ContentModelData.b(scanner.getData(), false, null, null, false, null, null, "", 63, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f63962f;
            uq.b.e();
            if (this.f63961e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fh2.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.o.O((d.a.Scanner) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fh2.a.g gVar, k10.c0<fh2.d.a.Scanner> c0Var, tq.e<? super k10.l<? extends fh2.d>> eVar) {
            o oVar = new o(eVar);
            oVar.f63962f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    public y(yy.a aVar, a14.x xVar, a14.m mVar, bg2.i iVar, gh2.f fVar, ib4.c cVar, bg2.h hVar, sz.d dVar, ac4.r<String> rVar, hb4.d dVar2, ag2.a aVar2) {
        this.requestCameraPermissionUseCase = xVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.validInputQrCodeUseCase = iVar;
        this.screenMapper = fVar;
        this.domainErrorMapper = cVar;
        this.validCodeQrUC = hVar;
        this.scanCameraUseCase = rVar;
        this.errorVMSFactory = dVar2;
        this.codeMapper = aVar2;
        fh2.d.a.Scanner scanner = new fh2.d.a.Scanner(new ContentModelData(false, "", hz.b.d.f86848c, false, new u04.c.b(false), dVar, ""));
        this.initialState = scanner;
        this.stateMachine = aVar.a(scanner, new er.l() { // from class: fh2.p
            @Override // er.l
            public final Object b(Object obj) {
                return y.H9(this.f63883a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), A9(scanner));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fh2.e.a A9(fh2.d dVar) {
        return this.screenMapper.b(new gh2.f.Params(dVar, new er.a() { // from class: fh2.t
            @Override // er.a
            public final Object a() {
                return y.B9(this.f63886a);
            }
        }, new er.l() { // from class: fh2.u
            @Override // er.l
            public final Object b(Object obj) {
                return y.C9(this.f63887a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: fh2.v
            @Override // er.l
            public final Object b(Object obj) {
                return y.D9(this.f63888a, (String) obj);
            }
        }, b9(fh2.a.e.f63807a), b9(fh2.a.b.f63803a), b9(fh2.a.c.C1422a.f63804a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(y yVar) {
        yVar.d9(new fh2.a.UpdateCodeBottomSheet(true));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(y yVar, boolean z15) {
        yVar.d9(new fh2.a.UpdateCodeBottomSheet(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(y yVar, String str) {
        yVar.d9(new fh2.a.OnCodeChange(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<fh2.d> F9(final fh2.a.ShowError action, final k10.c0<fh2.d.a.Scanner> state) {
        return state.d(new er.l() { // from class: fh2.w
            @Override // er.l
            public final Object b(Object obj) {
                return y.G9(state, action, this, (d.a.Scanner) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fh2.d.Error G9(k10.c0 c0Var, fh2.a.ShowError showError, y yVar, fh2.d.a.Scanner scanner) {
        return new fh2.d.Error(((fh2.d.a.Scanner) c0Var.a()).getData(), showError.getIsFromQrScan(), yVar.x9(showError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(final y yVar, k10.v vVar) {
        vVar.c(q0.c(fh2.d.class), new er.l() { // from class: fh2.q
            @Override // er.l
            public final Object b(Object obj) {
                return y.I9(this.f63884a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fh2.d.Error.class), new er.l() { // from class: fh2.r
            @Override // er.l
            public final Object b(Object obj) {
                return y.J9((k10.z) obj);
            }
        });
        vVar.c(q0.c(fh2.d.a.Scanner.class), new er.l() { // from class: fh2.s
            @Override // er.l
            public final Object b(Object obj) {
                return y.K9(this.f63885a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(y yVar, k10.z zVar) {
        b bVar = yVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fh2.a.c.class), oVar, bVar);
        zVar.x(q0.c(fh2.a.C1421a.class), oVar, yVar.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(k10.z zVar) {
        d dVar = new d(null);
        zVar.v(q0.c(fh2.a.i.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(y yVar, k10.z zVar) {
        zVar.C(yVar.new g(null));
        h hVar = yVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(fh2.a.h.class), oVar, hVar);
        zVar.v(q0.c(fh2.a.UpdateCodeBottomSheet.class), oVar, new i(null));
        zVar.v(q0.c(fh2.a.OnCodeChange.class), oVar, new j(null));
        zVar.v(q0.c(fh2.a.e.class), oVar, yVar.new k(null));
        k10.k.s(zVar, (mu.g) yVar.scanCameraUseCase.a(new sx.b.Analyzer(sx.d.BACK, 0.0f, new sx.e.QrScanner(null, 1, null), 2, null)), null, yVar.new l(null), 2, null);
        zVar.v(q0.c(fh2.a.OnScannedQrCode.class), oVar, yVar.new m(null));
        zVar.x(q0.c(fh2.a.VerifyCode.class), oVar, yVar.new n(null));
        zVar.v(q0.c(fh2.a.g.class), oVar, new o(null));
        zVar.x(q0.c(fh2.a.b.class), oVar, yVar.new e(null));
        zVar.v(q0.c(fh2.a.ShowError.class), oVar, yVar.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b L9(String str) {
        return hz.b.INSTANCE.a(this.validInputQrCodeUseCase.b(new bg2.i.Param(str)));
    }

    private final hb4.c x9(final fh2.a.ShowError action) {
        return this.errorVMSFactory.a(this.domainErrorMapper.b(new ib4.c.Params(action.getError(), false, new er.l() { // from class: fh2.x
            @Override // er.l
            public final Object b(Object obj) {
                return y.y9(this.f63892a, action, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(y yVar, fh2.a.ShowError showError, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            yVar.d9(new fh2.a.VerifyCode(tq0.l.b(showError.getCode()), true, null));
        } else {
            yVar.d9(fh2.a.i.f63811a);
        }
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<fh2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<fh2.d, fh2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fh2.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(fh2.a.c cVar, tq.e<? super oq.i0> eVar) {
        return super.F(cVar, eVar);
    }
}
