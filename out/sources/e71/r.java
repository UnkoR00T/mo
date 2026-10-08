package e71;

import cl0.PassportChildApplicationGetChildData;
import fr.q0;
import i61.ChildDataResult;
import k81.FieldItem;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u0010>\u001a\b\u0012\u0004\u0012\u000209088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R&\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030?8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010 \u001a\b\u0012\u0004\u0012\u00020!0E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Le71/r;", "Ll00/g;", "Le71/b;", "Le71/a;", "Le71/c;", "", "Lyy/a;", "stateMachineFactory", "Lf71/b;", "mapper", "La14/w;", "openUrlIntentUseCase", "Lm61/c;", "childPassportApplicationValidateBirthPlaceInputUC", "Lol0/f;", "getChildPassportApplicationChildDataUC", "Lib4/c;", "genericErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lhb4/d;", "errorVMSFactory", "Lg71/a;", "dataContract", "<init>", "(Lyy/a;Lf71/b;La14/w;Lm61/c;Lol0/f;Lib4/c;Lac4/a;Lhb4/d;Lg71/a;)V", "Ldx/b;", "domainError", "retryAction", "Lhb4/c;", "y9", "(Ldx/b;Le71/a;)Lhb4/c;", "state", "Le71/c$a;", "A9", "(Le71/b;)Le71/c$a;", "b", "Lf71/b;", "c", "La14/w;", "d", "Lm61/c;", "e", "Lol0/f;", "f", "Lib4/c;", "g", "Lac4/a;", "h", "Lhb4/d;", "j", "Lg71/a;", "Le71/b$b;", "k", "Le71/b$b;", "initialState", "Lxw/b;", "Le71/a$e;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<e71.b, e71.a> implements e71.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f71.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m61.c childPassportApplicationValidateBirthPlaceInputUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ol0.f getChildPassportApplicationChildDataUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g71.a dataContract;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final e71.b.C1114b initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e71.a.e> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<e71.b, e71.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<e71.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e71.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f47991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f47992b;

        /* JADX INFO: renamed from: e71.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1117a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f47993a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f47994b;

            /* JADX INFO: renamed from: e71.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1118a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f47995d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f47996e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f47997f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f47999h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f48000j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f48001k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f48002l;

                public C1118a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f47995d = obj;
                    this.f47996e |= PKIFailureInfo.systemUnavail;
                    return C1117a.this.F(null, this);
                }
            }

            public C1117a(mu.h hVar, r rVar) {
                this.f47993a = hVar;
                this.f47994b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1118a c1118a;
                if (eVar instanceof C1118a) {
                    c1118a = (C1118a) eVar;
                    int i15 = c1118a.f47996e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1118a.f47996e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1118a = new C1118a(eVar);
                    }
                } else {
                    c1118a = new C1118a(eVar);
                }
                Object obj2 = c1118a.f47995d;
                Object objE = uq.b.e();
                int i16 = c1118a.f47996e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f47993a;
                    e71.c.a aVarA9 = this.f47994b.A9((e71.b) obj);
                    c1118a.f47997f = vq.j.a(obj);
                    c1118a.f47999h = vq.j.a(c1118a);
                    c1118a.f48000j = vq.j.a(obj);
                    c1118a.f48001k = vq.j.a(hVar);
                    c1118a.f48002l = 0;
                    c1118a.f47996e = 1;
                    if (hVar.F(aVarA9, c1118a) == objE) {
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
            this.f47991a = gVar;
            this.f47992b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e71.c.a> hVar, tq.e eVar) {
            Object objA = this.f47991a.a(new C1117a(hVar, this.f47992b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le71/a$c;", "<unused var>", "Le71/b;", "Loq/i0;", "<anonymous>", "(Le71/a$c;Le71/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<e71.a.c, e71.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48003e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f48003e;
            if (i15 == 0) {
                oq.u.b(obj);
                r.this.d9(e71.a.k.f47934a);
                r rVar = r.this;
                e71.a.e.b bVar = e71.a.e.b.f47927a;
                this.f48003e = 1;
                if (rVar.F(bVar, this) == objE) {
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
        public final Object w(e71.a.c cVar, e71.b bVar, tq.e<? super i0> eVar) {
            return r.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le71/b$b;", "it", "Loq/i0;", "<anonymous>", "(Le71/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<e71.b.C1114b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48005e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f48005e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.d9(e71.a.d.f47925a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(e71.b.C1114b c1114b, tq.e<? super i0> eVar) {
            return ((c) v(c1114b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return r.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le71/a$d;", "<unused var>", "Lk10/c0;", "Le71/b$b;", "state", "Lk10/l;", "Le71/b;", "<anonymous>", "(Le71/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<e71.a.d, k10.c0<e71.b.C1114b>, tq.e<? super k10.l<? extends e71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f48007e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f48008f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f48009g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f48010h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Le71/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends e71.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f48012e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f48013f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ g71.a.Input f48014g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<e71.b.C1114b> f48015h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, g71.a.Input input, k10.c0<e71.b.C1114b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f48013f = rVar;
                this.f48014g = input;
                this.f48015h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final e71.b.Error X(r rVar, dx.b bVar, e71.b.C1114b c1114b) {
                return new e71.b.Error(rVar.y9(bVar, e71.a.d.f47925a));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final e71.b.Initialized Y(PassportChildApplicationGetChildData passportChildApplicationGetChildData, g71.a.Input input, r rVar, e71.b.C1114b c1114b) {
                iy.b0 birthPlaceInput = input.getBirthPlaceInput();
                String strE = birthPlaceInput != null ? iy.c0.e(birthPlaceInput) : null;
                hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
                ChildDataResult childDataResultL6 = rVar.dataContract.l6();
                return new e71.b.Initialized(passportChildApplicationGetChildData, strE, c2039b, new FieldItem(null, Boolean.valueOf(childDataResultL6 != null ? childDataResultL6.getCitizenshipCheckBoxChecked() : false), 1, null), false);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f48012e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ol0.f fVar = this.f48013f.getChildPassportApplicationChildDataUC;
                    ol0.f.Params params = new ol0.f.Params(this.f48014g.getChildId(), this.f48014g.getPassportType());
                    this.f48012e = 1;
                    obj = fVar.c(params, this);
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
                k10.c0<e71.b.C1114b> c0Var = this.f48015h;
                final r rVar = this.f48013f;
                final g71.a.Input input = this.f48014g;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: e71.t
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.d.a.X(rVar, bVar, (b.C1114b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final PassportChildApplicationGetChildData passportChildApplicationGetChildData = (PassportChildApplicationGetChildData) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: e71.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.d.a.Y(passportChildApplicationGetChildData, input, rVar, (b.C1114b) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f48013f, this.f48014g, this.f48015h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends e71.b>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e71.b.Error O(r rVar, e71.b.C1114b c1114b) {
            return new e71.b.Error(rVar.y9(new dx.b.Generic(null, 1, null), null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d dVar;
            k10.c0 c0Var = (k10.c0) this.f48010h;
            Object objE = uq.b.e();
            int i15 = this.f48009g;
            if (i15 == 0) {
                oq.u.b(obj);
                g71.a.Input inputS3 = r.this.dataContract.S3();
                if (inputS3 != null) {
                    r rVar = r.this;
                    ac4.a aVar = rVar.callActionWithLoaderUseCase;
                    a aVar2 = new a(rVar, inputS3, c0Var, null);
                    this.f48010h = c0Var;
                    this.f48007e = vq.j.a(inputS3);
                    this.f48008f = 0;
                    this.f48009g = 1;
                    dVar = this;
                    obj = ac4.a.a(aVar, null, aVar2, dVar, 1, null);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    dVar = this;
                }
                final r rVar2 = r.this;
                return c0Var.d(new er.l() { // from class: e71.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.d.O(rVar2, (b.C1114b) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dVar = this;
            k10.l lVar = (k10.l) obj;
            if (lVar != null) {
                return lVar;
            }
            final r rVar3 = r.this;
            return c0Var.d(new er.l() { // from class: e71.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.d.O(rVar3, (b.C1114b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e71.a.d dVar, k10.c0<e71.b.C1114b> c0Var, tq.e<? super k10.l<? extends e71.b>> eVar) {
            d dVar2 = r.this.new d(eVar);
            dVar2.f48010h = c0Var;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le71/a$b;", "action", "Lk10/c0;", "Le71/b$c;", "state", "Lk10/l;", "Le71/b;", "<anonymous>", "(Le71/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<e71.a.BirthPlaceInputChanged, k10.c0<e71.b.Initialized>, tq.e<? super k10.l<? extends e71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f48018g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e71.b.Initialized O(e71.a.BirthPlaceInputChanged birthPlaceInputChanged, e71.b.Initialized initialized) {
            return e71.b.Initialized.b(initialized, null, birthPlaceInputChanged.getValue(), null, null, false, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final e71.a.BirthPlaceInputChanged birthPlaceInputChanged = (e71.a.BirthPlaceInputChanged) this.f48017f;
            k10.c0 c0Var = (k10.c0) this.f48018g;
            uq.b.e();
            if (this.f48016e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: e71.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.e.O(birthPlaceInputChanged, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e71.a.BirthPlaceInputChanged birthPlaceInputChanged, k10.c0<e71.b.Initialized> c0Var, tq.e<? super k10.l<? extends e71.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f48017f = birthPlaceInputChanged;
            eVar2.f48018g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le71/a$i;", "action", "Le71/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Le71/a$i;Le71/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<e71.a.OpenUrl, e71.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48019e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48020f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e71.a.OpenUrl openUrl = (e71.a.OpenUrl) this.f48020f;
            Object objE = uq.b.e();
            int i15 = this.f48019e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = r.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f48020f = vq.j.a(openUrl);
                this.f48019e = 1;
                if (wVar.c(params, this) == objE) {
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
        public final Object w(e71.a.OpenUrl openUrl, e71.b.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f48020f = openUrl;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le71/a$f;", "<unused var>", "Lk10/c0;", "Le71/b$c;", "state", "Lk10/l;", "Le71/b;", "<anonymous>", "(Le71/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<e71.a.f, k10.c0<e71.b.Initialized>, tq.e<? super k10.l<? extends e71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f48022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f48023f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f48024g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f48025h;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e71.b.Initialized O(hz.b bVar, hz.b bVar2, e71.b.Initialized initialized) {
            return e71.b.Initialized.b(initialized, null, null, bVar, FieldItem.b(initialized.f(), bVar2, null, 2, null), !bVar2.a(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hz.b bVarA;
            final hz.b bVar;
            final hz.b invalid;
            hz.b bVar2;
            char[] data;
            k10.c0 c0Var = (k10.c0) this.f48025h;
            Object objE = uq.b.e();
            int i15 = this.f48024g;
            if (i15 == 0) {
                oq.u.b(obj);
                m61.c cVar = r.this.childPassportApplicationValidateBirthPlaceInputUC;
                String birthPlaceInput = ((e71.b.Initialized) c0Var.a()).getBirthPlaceInput();
                if (birthPlaceInput == null) {
                    birthPlaceInput = "";
                }
                hz.g gVarB = cVar.b(new m61.c.Params(birthPlaceInput));
                iy.b0 birthPlace = ((e71.b.Initialized) c0Var.a()).getChildData().getBirthPlace();
                String string = (birthPlace == null || (data = birthPlace.getData()) == null) ? null : data.toString();
                if (string != null && !fu.r.t0(string)) {
                    gVarB = null;
                }
                if (gVarB == null || (bVarA = hz.b.INSTANCE.a(gVarB)) == null) {
                    bVarA = hz.b.d.f86848c;
                }
                bVar = bVarA;
                boolean zBooleanValue = ((e71.b.Initialized) c0Var.a()).f().d().booleanValue();
                if (zBooleanValue) {
                    invalid = hz.b.d.f86848c;
                } else {
                    if (zBooleanValue) {
                        throw new oq.p();
                    }
                    invalid = new hz.b.Invalid(null, 1, null);
                }
                if (fr.t.c(bVar, hz.b.d.f86848c) && invalid.a()) {
                    r.this.d9(e71.a.k.f47934a);
                    r rVar = r.this;
                    e71.a.e.c cVar2 = e71.a.e.c.f47928a;
                    this.f48025h = c0Var;
                    this.f48022e = bVar;
                    this.f48023f = invalid;
                    this.f48024g = 1;
                    if (rVar.F(cVar2, this) == objE) {
                        return objE;
                    }
                    bVar2 = invalid;
                }
                return c0Var.b(new er.l() { // from class: e71.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.g.O(bVar, invalid, (b.Initialized) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = (hz.b) this.f48023f;
            bVar = (hz.b) this.f48022e;
            oq.u.b(obj);
            invalid = bVar2;
            return c0Var.b(new er.l() { // from class: e71.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.g.O(bVar, invalid, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e71.a.f fVar, k10.c0<e71.b.Initialized> c0Var, tq.e<? super k10.l<? extends e71.b>> eVar) {
            g gVar = r.this.new g(eVar);
            gVar.f48025h = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le71/a$a;", "<unused var>", "Le71/b$c;", "Loq/i0;", "<anonymous>", "(Le71/a$a;Le71/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<e71.a.C1112a, e71.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48027e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f48027e;
            if (i15 == 0) {
                oq.u.b(obj);
                r.this.d9(e71.a.k.f47934a);
                r rVar = r.this;
                e71.a.e.C1113a c1113a = e71.a.e.C1113a.f47926a;
                this.f48027e = 1;
                if (rVar.F(c1113a, this) == objE) {
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
        public final Object w(e71.a.C1112a c1112a, e71.b.Initialized initialized, tq.e<? super i0> eVar) {
            return r.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le71/a$k;", "<unused var>", "Le71/b$c;", "state", "Loq/i0;", "<anonymous>", "(Le71/a$k;Le71/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<e71.a.k, e71.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48030f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e71.b.Initialized initialized = (e71.b.Initialized) this.f48030f;
            uq.b.e();
            if (this.f48029e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            g71.a aVar = r.this.dataContract;
            PassportChildApplicationGetChildData childData = initialized.getChildData();
            String birthPlaceInput = initialized.getBirthPlaceInput();
            aVar.S6(new ChildDataResult(childData, birthPlaceInput != null ? iy.c0.g(birthPlaceInput) : null, initialized.f().d().booleanValue()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(e71.a.k kVar, e71.b.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f48030f = initialized;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le71/a$g;", "action", "Lk10/c0;", "Le71/b$c;", "state", "Lk10/l;", "Le71/b;", "<anonymous>", "(Le71/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<e71.a.OnCitizenshipCheckBoxChanged, k10.c0<e71.b.Initialized>, tq.e<? super k10.l<? extends e71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f48034g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e71.b.Initialized O(e71.a.OnCitizenshipCheckBoxChanged onCitizenshipCheckBoxChanged, e71.b.Initialized initialized) {
            return e71.b.Initialized.b(initialized, null, null, null, new FieldItem(null, Boolean.valueOf(onCitizenshipCheckBoxChanged.getChecked()), 1, null), false, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final e71.a.OnCitizenshipCheckBoxChanged onCitizenshipCheckBoxChanged = (e71.a.OnCitizenshipCheckBoxChanged) this.f48033f;
            k10.c0 c0Var = (k10.c0) this.f48034g;
            uq.b.e();
            if (this.f48032e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: e71.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.j.O(onCitizenshipCheckBoxChanged, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e71.a.OnCitizenshipCheckBoxChanged onCitizenshipCheckBoxChanged, k10.c0<e71.b.Initialized> c0Var, tq.e<? super k10.l<? extends e71.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f48033f = onCitizenshipCheckBoxChanged;
            jVar.f48034g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le71/a$h;", "<unused var>", "Lk10/c0;", "Le71/b$c;", "state", "Lk10/l;", "Le71/b;", "<anonymous>", "(Le71/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<e71.a.h, k10.c0<e71.b.Initialized>, tq.e<? super k10.l<? extends e71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48036f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e71.b.Initialized O(e71.b.Initialized initialized) {
            return e71.b.Initialized.b(initialized, null, null, null, null, false, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f48036f;
            uq.b.e();
            if (this.f48035e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: e71.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.k.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e71.a.h hVar, k10.c0<e71.b.Initialized> c0Var, tq.e<? super k10.l<? extends e71.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f48036f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le71/a$j;", "<unused var>", "Lk10/c0;", "Le71/b$a;", "state", "Lk10/l;", "Le71/b;", "<anonymous>", "(Le71/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<e71.a.j, k10.c0<e71.b.Error>, tq.e<? super k10.l<? extends e71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48038f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e71.b.C1114b O(e71.b.Error error) {
            return e71.b.C1114b.f47936a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f48038f;
            uq.b.e();
            if (this.f48037e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: e71.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.l.O((b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e71.a.j jVar, k10.c0<e71.b.Error> c0Var, tq.e<? super k10.l<? extends e71.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f48038f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le71/a$a;", "<unused var>", "Le71/b$a;", "Loq/i0;", "<anonymous>", "(Le71/a$a;Le71/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<e71.a.C1112a, e71.b.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48039e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f48039e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                e71.a.e.C1113a c1113a = e71.a.e.C1113a.f47926a;
                this.f48039e = 1;
                if (rVar.F(c1113a, this) == objE) {
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
        public final Object w(e71.a.C1112a c1112a, e71.b.Error error, tq.e<? super i0> eVar) {
            return r.this.new m(eVar).J(i0.f148189a);
        }
    }

    public r(yy.a aVar, f71.b bVar, a14.w wVar, m61.c cVar, ol0.f fVar, ib4.c cVar2, ac4.a aVar2, hb4.d dVar, g71.a aVar3) {
        this.mapper = bVar;
        this.openUrlIntentUseCase = wVar;
        this.childPassportApplicationValidateBirthPlaceInputUC = cVar;
        this.getChildPassportApplicationChildDataUC = fVar;
        this.genericErrorMapper = cVar2;
        this.callActionWithLoaderUseCase = aVar2;
        this.errorVMSFactory = dVar;
        this.dataContract = aVar3;
        e71.b.C1114b c1114b = e71.b.C1114b.f47936a;
        this.initialState = c1114b;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(c1114b, new er.l() { // from class: e71.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.F9(this.f47978a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), A9(c1114b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e71.c.a A9(e71.b state) {
        return this.mapper.b(new f71.b.Params(state, new er.l() { // from class: e71.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f47973a, (String) obj);
            }
        }, new er.l() { // from class: e71.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.C9(this.f47974a, (String) obj);
            }
        }, b9(e71.a.f.f47929a), b9(e71.a.C1112a.f47922a), b9(e71.a.c.f47924a), new er.l() { // from class: e71.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.D9(this.f47975a, ((Boolean) obj).booleanValue());
            }
        }, b9(e71.a.h.f47931a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, String str) {
        rVar.d9(new e71.a.BirthPlaceInputChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(r rVar, String str) {
        rVar.d9(new e71.a.OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(r rVar, boolean z15) {
        rVar.d9(new e71.a.OnCitizenshipCheckBoxChanged(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(e71.b.class), new er.l() { // from class: e71.i
            @Override // er.l
            public final Object b(Object obj) {
                return r.G9(this.f47969a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(e71.b.C1114b.class), new er.l() { // from class: e71.j
            @Override // er.l
            public final Object b(Object obj) {
                return r.H9(this.f47970a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(e71.b.Initialized.class), new er.l() { // from class: e71.k
            @Override // er.l
            public final Object b(Object obj) {
                return r.I9(this.f47971a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(e71.b.Error.class), new er.l() { // from class: e71.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.J9(this.f47972a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(r rVar, k10.z zVar) {
        b bVar = rVar.new b(null);
        zVar.x(q0.c(e71.a.c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(r rVar, k10.z zVar) {
        zVar.C(rVar.new c(null));
        d dVar = rVar.new d(null);
        zVar.v(q0.c(e71.a.d.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(r rVar, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(e71.a.BirthPlaceInputChanged.class), oVar, eVar);
        zVar.x(q0.c(e71.a.OpenUrl.class), oVar, rVar.new f(null));
        zVar.v(q0.c(e71.a.f.class), oVar, rVar.new g(null));
        zVar.x(q0.c(e71.a.C1112a.class), oVar, rVar.new h(null));
        zVar.x(q0.c(e71.a.k.class), oVar, rVar.new i(null));
        zVar.v(q0.c(e71.a.OnCitizenshipCheckBoxChanged.class), oVar, new j(null));
        zVar.v(q0.c(e71.a.h.class), oVar, new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(r rVar, k10.z zVar) {
        l lVar = new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(e71.a.j.class), oVar, lVar);
        zVar.x(q0.c(e71.a.C1112a.class), oVar, rVar.new m(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c y9(dx.b domainError, final e71.a retryAction) {
        return this.errorVMSFactory.a(this.genericErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: e71.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(retryAction, this, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(e71.a aVar, r rVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                if (aVar != null) {
                    rVar.d9(aVar);
                }
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                rVar.d9(e71.a.C1112a.f47922a);
            }
        }
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(g71.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<e71.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<e71.b, e71.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e71.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(e71.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }
}
