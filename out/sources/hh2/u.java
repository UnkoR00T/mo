package hh2;

import android.graphics.Bitmap;
import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R&\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030.8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010:\u001a\b\u0012\u0004\u0012\u000205048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u001b0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lhh2/u;", "Ll00/g;", "Lhh2/c;", "Lhh2/a;", "Lhh2/e;", "", "Lyy/a;", "stateMachineFactory", "Lih2/a;", "screenMapper", "Lwz/a;", "barcodeGenerator", "Lac4/a;", "callActionWithLoaderUC", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lhh2/b;", "contract", "<init>", "(Lyy/a;Lih2/a;Lwz/a;Lac4/a;Lhb4/d;Lib4/c;Lhh2/b;)V", "Ldx/b;", "error", "Lhb4/c;", "s9", "(Ldx/b;)Lhb4/c;", "Lhh2/e$a;", "u9", "(Lhh2/c;)Lhh2/e$a;", "b", "Lih2/a;", "c", "Lwz/a;", "d", "Lac4/a;", "e", "Lhb4/d;", "f", "Lib4/c;", "g", "Lhh2/b;", "Lhh2/c$a;", "h", "Lhh2/c$a;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lhh2/a$c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<hh2.c, hh2.a> implements hh2.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ih2.a screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wz.a barcodeGenerator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SetupData contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hh2.c.GeneratingCode initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<hh2.c, hh2.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hh2.a.c> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<hh2.e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<hh2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f84752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f84753b;

        /* JADX INFO: renamed from: hh2.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1973a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f84754a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f84755b;

            /* JADX INFO: renamed from: hh2.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1974a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f84756d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f84757e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f84758f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f84760h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f84761j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f84762k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f84763l;

                public C1974a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f84756d = obj;
                    this.f84757e |= PKIFailureInfo.systemUnavail;
                    return C1973a.this.F(null, this);
                }
            }

            public C1973a(mu.h hVar, u uVar) {
                this.f84754a = hVar;
                this.f84755b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1974a c1974a;
                if (eVar instanceof C1974a) {
                    c1974a = (C1974a) eVar;
                    int i15 = c1974a.f84757e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1974a.f84757e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1974a = new C1974a(eVar);
                    }
                } else {
                    c1974a = new C1974a(eVar);
                }
                Object obj2 = c1974a.f84756d;
                Object objE = uq.b.e();
                int i16 = c1974a.f84757e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f84754a;
                    hh2.e.a aVarU9 = this.f84755b.u9((hh2.c) obj);
                    c1974a.f84758f = vq.j.a(obj);
                    c1974a.f84760h = vq.j.a(c1974a);
                    c1974a.f84761j = vq.j.a(obj);
                    c1974a.f84762k = vq.j.a(hVar);
                    c1974a.f84763l = 0;
                    c1974a.f84757e = 1;
                    if (hVar.F(aVarU9, c1974a) == objE) {
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

        public a(mu.g gVar, u uVar) {
            this.f84752a = gVar;
            this.f84753b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super hh2.e.a> hVar, tq.e eVar) {
            Object objA = this.f84752a.a(new C1973a(hVar, this.f84753b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhh2/a$c;", "action", "Lhh2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhh2/a$c;Lhh2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<hh2.a.c, hh2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84765f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hh2.a.c cVar = (hh2.a.c) this.f84765f;
            Object objE = uq.b.e();
            int i15 = this.f84764e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                this.f84765f = vq.j.a(cVar);
                this.f84764e = 1;
                if (uVar.F(cVar, this) == objE) {
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
        public final Object w(hh2.a.c cVar, hh2.c cVar2, tq.e<? super i0> eVar) {
            b bVar = u.this.new b(eVar);
            bVar.f84765f = cVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lhh2/c$a;", "state", "Lk10/l;", "Lhh2/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<hh2.c.GeneratingCode>, tq.e<? super k10.l<? extends hh2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84768f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lhh2/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends hh2.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f84770e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f84771f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<hh2.c.GeneratingCode> f84772g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, c0<hh2.c.GeneratingCode> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f84771f = uVar;
                this.f84772g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hh2.c.GeneratingCodeError X(u uVar, dx.b bVar, hh2.c.GeneratingCode generatingCode) {
                return new hh2.c.GeneratingCodeError(generatingCode.getCode(), uVar.s9(bVar), null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hh2.c.Initialized Y(Bitmap bitmap, hh2.c.GeneratingCode generatingCode) {
                return new hh2.c.Initialized(generatingCode.getCode(), bitmap, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f84770e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    wz.a aVar = this.f84771f.barcodeGenerator;
                    wz.b.QrCode qrCode = new wz.b.QrCode(this.f84772g.a().getCode(), 0, 2, null);
                    this.f84770e = 1;
                    obj = aVar.a(qrCode, this);
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
                c0<hh2.c.GeneratingCode> c0Var = this.f84772g;
                final u uVar = this.f84771f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: hh2.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.c.a.X(uVar, bVar, (c.GeneratingCode) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final Bitmap bitmap = (Bitmap) ((dx.i.Right) iVar).b();
                return this.f84772g.d(new er.l() { // from class: hh2.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.c.a.Y(bitmap, (c.GeneratingCode) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f84771f, this.f84772g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends hh2.c>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f84768f;
            Object objE = uq.b.e();
            int i15 = this.f84767e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = u.this.callActionWithLoaderUC;
            a aVar2 = new a(u.this, c0Var, null);
            this.f84768f = vq.j.a(c0Var);
            this.f84767e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<hh2.c.GeneratingCode> c0Var, tq.e<? super k10.l<? extends hh2.c>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = u.this.new c(eVar);
            cVar.f84768f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhh2/a$b;", "<unused var>", "Lk10/c0;", "Lhh2/c$b;", "state", "Lk10/l;", "Lhh2/c;", "<anonymous>", "(Lhh2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<hh2.a.b, c0<hh2.c.GeneratingCodeError>, tq.e<? super k10.l<? extends hh2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84774f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hh2.c.GeneratingCode O(hh2.c.GeneratingCodeError generatingCodeError) {
            return new hh2.c.GeneratingCode(generatingCodeError.getCode(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f84774f;
            uq.b.e();
            if (this.f84773e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: hh2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.d.O((c.GeneratingCodeError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hh2.a.b bVar, c0<hh2.c.GeneratingCodeError> c0Var, tq.e<? super k10.l<? extends hh2.c>> eVar) {
            d dVar = new d(eVar);
            dVar.f84774f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhh2/a$a;", "<unused var>", "Lhh2/c$b;", "Loq/i0;", "<anonymous>", "(Lhh2/a$a;Lhh2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<hh2.a.C1969a, hh2.c.GeneratingCodeError, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84775e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f84775e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(hh2.a.c.C1970a.f84702a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hh2.a.C1969a c1969a, hh2.c.GeneratingCodeError generatingCodeError, tq.e<? super i0> eVar) {
            return u.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhh2/a$d;", "<unused var>", "Lhh2/c$c;", "Loq/i0;", "<anonymous>", "(Lhh2/a$d;Lhh2/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<hh2.a.d, hh2.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84777e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84777e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                hh2.a.c.b bVar = hh2.a.c.b.f84703a;
                this.f84777e = 1;
                if (uVar.F(bVar, this) == objE) {
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
        public final Object w(hh2.a.d dVar, hh2.c.Initialized initialized, tq.e<? super i0> eVar) {
            return u.this.new f(eVar).J(i0.f148189a);
        }
    }

    public u(yy.a aVar, ih2.a aVar2, wz.a aVar3, ac4.a aVar4, hb4.d dVar, ib4.c cVar, SetupData setupData) {
        this.screenMapper = aVar2;
        this.barcodeGenerator = aVar3;
        this.callActionWithLoaderUC = aVar4;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.contract = setupData;
        hh2.c.GeneratingCode generatingCode = new hh2.c.GeneratingCode(setupData.getOrderedDocument().getVerificationCode(), null);
        this.initialState = generatingCode;
        this.stateMachine = aVar.a(generatingCode, new er.l() { // from class: hh2.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.w9(this.f84741a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), u9(generatingCode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(u uVar, k10.z zVar) {
        f fVar = uVar.new f(null);
        zVar.x(q0.c(hh2.a.d.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c s9(dx.b error) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: hh2.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.t9(this.f84740a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(u uVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
            uVar.d9(hh2.a.b.f84701a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                throw new oq.p();
            }
            uVar.d9(hh2.a.C1969a.f84700a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hh2.e.a u9(hh2.c cVar) {
        return this.screenMapper.b(new ih2.a.Params(cVar, b9(hh2.a.d.f84704a), b9(hh2.a.c.C1970a.f84702a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(hh2.c.class), new er.l() { // from class: hh2.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.x9(this.f84736a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(hh2.c.GeneratingCode.class), new er.l() { // from class: hh2.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.y9(this.f84737a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(hh2.c.GeneratingCodeError.class), new er.l() { // from class: hh2.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.z9(this.f84738a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(hh2.c.Initialized.class), new er.l() { // from class: hh2.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.A9(this.f84739a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(u uVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        zVar.x(q0.c(hh2.a.c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(u uVar, k10.z zVar) {
        zVar.A(uVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(u uVar, k10.z zVar) {
        d dVar = new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(hh2.a.b.class), oVar, dVar);
        zVar.x(q0.c(hh2.a.C1969a.class), oVar, uVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<hh2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<hh2.c, hh2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<hh2.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(hh2.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
