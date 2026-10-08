package kj1;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vi1.ChosenTrainingUnitAndDate;
import zp0.AvailableDefenceTrainings;
import zp0.DefenceTraining;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R&\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lkj1/o;", "Ll00/g;", "Lkj1/c;", "Lkj1/a;", "Lkj1/d;", "", "Lyy/a;", "stateMachineFactory", "Llj1/b;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lmx/c;", "labelProvider", "Lkj1/e;", "setupContract", "<init>", "(Lyy/a;Llj1/b;Lhb4/d;Lib4/c;Lmx/c;Lkj1/e;)V", "state", "Lkj1/d$a;", "r9", "(Lkj1/c;)Lkj1/d$a;", "b", "Llj1/b;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Lmx/c;", "f", "Lkj1/e;", "Lkj1/c$c;", "g", "Lkj1/c$c;", "initialState", "Lxw/b;", "Lkj1/a$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<kj1.c, kj1.a> implements kj1.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lj1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final kj1.e setupContract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final kj1.c.C2675c initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<kj1.a.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<kj1.c, kj1.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<kj1.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<kj1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f111180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f111181b;

        /* JADX INFO: renamed from: kj1.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2678a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f111182a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f111183b;

            /* JADX INFO: renamed from: kj1.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2679a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f111184d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f111185e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f111186f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f111188h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f111189j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f111190k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f111191l;

                public C2679a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f111184d = obj;
                    this.f111185e |= PKIFailureInfo.systemUnavail;
                    return C2678a.this.F(null, this);
                }
            }

            public C2678a(mu.h hVar, o oVar) {
                this.f111182a = hVar;
                this.f111183b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2679a c2679a;
                if (eVar instanceof C2679a) {
                    c2679a = (C2679a) eVar;
                    int i15 = c2679a.f111185e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2679a.f111185e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2679a = new C2679a(eVar);
                    }
                } else {
                    c2679a = new C2679a(eVar);
                }
                Object obj2 = c2679a.f111184d;
                Object objE = uq.b.e();
                int i16 = c2679a.f111185e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f111182a;
                    kj1.d.a aVarR9 = this.f111183b.r9((kj1.c) obj);
                    c2679a.f111186f = vq.j.a(obj);
                    c2679a.f111188h = vq.j.a(c2679a);
                    c2679a.f111189j = vq.j.a(obj);
                    c2679a.f111190k = vq.j.a(hVar);
                    c2679a.f111191l = 0;
                    c2679a.f111185e = 1;
                    if (hVar.F(aVarR9, c2679a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f111180a = gVar;
            this.f111181b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super kj1.d.a> hVar, tq.e eVar) {
            Object objA = this.f111180a.a(new C2678a(hVar, this.f111181b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lkj1/c;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<c0<kj1.c>, tq.e<? super k10.l<? extends kj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111193f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kj1.c.Error X(final o oVar, dx.b bVar, kj1.c cVar) {
            return new kj1.c.Error(oVar.errorVMSFactory.a(oVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: kj1.r
                @Override // er.l
                public final Object b(Object obj) {
                    return o.b.Y(oVar, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Y(o oVar, ib4.c.b bVar) {
            oVar.d9(kj1.a.C2672a.f111128a);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        public static final kj1.c.Content Z(AvailableDefenceTrainings availableDefenceTrainings, o oVar, kj1.c cVar) {
            DefenceTraining trainingDate;
            if (oVar.setupContract.K4() != null) {
                ChosenTrainingUnitAndDate chosenTrainingUnitAndDateK4 = oVar.setupContract.K4();
                if (chosenTrainingUnitAndDateK4 != null) {
                    trainingDate = chosenTrainingUnitAndDateK4.getTrainingDate();
                } else {
                    trainingDate = null;
                }
            } else if (availableDefenceTrainings.a().size() == 1) {
                trainingDate = (DefenceTraining) pq.v.n0(availableDefenceTrainings.a());
            } else {
                ChosenTrainingUnitAndDate chosenTrainingUnitAndDateK5 = oVar.setupContract.K4();
                if (chosenTrainingUnitAndDateK5 != null) {
                    trainingDate = chosenTrainingUnitAndDateK5.getTrainingDate();
                } else {
                    trainingDate = null;
                }
            }
            return new kj1.c.Content(availableDefenceTrainings, trainingDate, hz.b.C2039b.f86846c, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f111193f;
            uq.b.e();
            if (this.f111192e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<dx.b, AvailableDefenceTrainings> iVarY0 = o.this.setupContract.Y0();
            final o oVar = o.this;
            if (iVarY0 instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVarY0).b();
                return c0Var.d(new er.l() { // from class: kj1.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o.b.X(oVar, bVar, (c) obj2);
                    }
                });
            }
            if (!(iVarY0 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final AvailableDefenceTrainings availableDefenceTrainings = (AvailableDefenceTrainings) ((dx.i.Right) iVarY0).b();
            return c0Var.d(new er.l() { // from class: kj1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.b.Z(availableDefenceTrainings, oVar, (c) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<kj1.c> c0Var, tq.e<? super k10.l<? extends kj1.c>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = o.this.new b(eVar);
            bVar.f111193f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkj1/a$a;", "<unused var>", "Lkj1/c;", "Loq/i0;", "<anonymous>", "(Lkj1/a$a;Lkj1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<kj1.a.C2672a, kj1.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111195e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111195e;
            if (i15 == 0) {
                oq.u.b(obj);
                o oVar = o.this;
                kj1.a.c.C2673a c2673a = kj1.a.c.C2673a.f111130a;
                this.f111195e = 1;
                if (oVar.F(c2673a, this) == objE) {
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
        public final Object w(kj1.a.C2672a c2672a, kj1.c cVar, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkj1/a$e;", "<unused var>", "Lk10/c0;", "Lkj1/c$a;", "state", "Lk10/l;", "Lkj1/c;", "<anonymous>", "(Lkj1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<kj1.a.e, c0<kj1.c.Content>, tq.e<? super k10.l<? extends kj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f111198f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f111199g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kj1.c.Content O(o oVar, kj1.c.Content content) {
            return kj1.c.Content.b(content, null, null, new hz.b.Invalid(oVar.labelProvider.c(ri1.b.f174347a0)), new d60.j(kj1.b.DateSelection), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f111199g;
            Object objE = uq.b.e();
            int i15 = this.f111198f;
            if (i15 == 0) {
                oq.u.b(obj);
                DefenceTraining selectedDate = ((kj1.c.Content) c0Var.a()).getSelectedDate();
                if (selectedDate == null) {
                    final o oVar = o.this;
                    return c0Var.b(new er.l() { // from class: kj1.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o.d.O(oVar, (c.Content) obj2);
                        }
                    });
                }
                o.this.setupContract.o4(new ChosenTrainingUnitAndDate(selectedDate, ((kj1.c.Content) c0Var.a()).getTrainingPlace().getUnit()));
                o oVar2 = o.this;
                kj1.a.c.C2674c c2674c = kj1.a.c.C2674c.f111132a;
                this.f111199g = c0Var;
                this.f111197e = vq.j.a(selectedDate);
                this.f111198f = 1;
                if (oVar2.F(c2674c, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kj1.a.e eVar, c0<kj1.c.Content> c0Var, tq.e<? super k10.l<? extends kj1.c>> eVar2) {
            d dVar = o.this.new d(eVar2);
            dVar.f111199g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkj1/a$d;", "action", "Lk10/c0;", "Lkj1/c$a;", "state", "Lk10/l;", "Lkj1/c;", "<anonymous>", "(Lkj1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<kj1.a.OnSelectedDate, c0<kj1.c.Content>, tq.e<? super k10.l<? extends kj1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f111203g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kj1.c.Content O(kj1.a.OnSelectedDate onSelectedDate, kj1.c.Content content) {
            return kj1.c.Content.b(content, null, onSelectedDate.getSelectedDate(), hz.b.d.f86848c, null, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final kj1.a.OnSelectedDate onSelectedDate = (kj1.a.OnSelectedDate) this.f111202f;
            c0 c0Var = (c0) this.f111203g;
            uq.b.e();
            if (this.f111201e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: kj1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.e.O(onSelectedDate, (c.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kj1.a.OnSelectedDate onSelectedDate, c0<kj1.c.Content> c0Var, tq.e<? super k10.l<? extends kj1.c>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f111202f = onSelectedDate;
            eVar2.f111203g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkj1/a$b;", "<unused var>", "Lkj1/c$a;", "Loq/i0;", "<anonymous>", "(Lkj1/a$b;Lkj1/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<kj1.a.b, kj1.c.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111204e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111204e;
            if (i15 == 0) {
                oq.u.b(obj);
                o oVar = o.this;
                kj1.a.c.b bVar = kj1.a.c.b.f111131a;
                this.f111204e = 1;
                if (oVar.F(bVar, this) == objE) {
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
        public final Object w(kj1.a.b bVar, kj1.c.Content content, tq.e<? super i0> eVar) {
            return o.this.new f(eVar).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, lj1.b bVar, hb4.d dVar, ib4.c cVar, mx.c cVar2, kj1.e eVar) {
        this.mapper = bVar;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.labelProvider = cVar2;
        this.setupContract = eVar;
        kj1.c.C2675c c2675c = kj1.c.C2675c.f111143a;
        this.initialState = c2675c;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(c2675c, new er.l() { // from class: kj1.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.u9(this.f111170a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), r9(c2675c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kj1.d.a r9(kj1.c state) {
        return this.mapper.b(new lj1.b.Params(state, b9(kj1.a.C2672a.f111128a), b9(kj1.a.e.f111134a), b9(kj1.a.b.f111129a), new er.l() { // from class: kj1.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9(this.f111169a, (DefenceTraining) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(o oVar, DefenceTraining defenceTraining) {
        oVar.d9(new kj1.a.OnSelectedDate(defenceTraining));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final o oVar, k10.v vVar) {
        vVar.c(q0.c(kj1.c.class), new er.l() { // from class: kj1.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(this.f111167a, (z) obj);
            }
        });
        vVar.c(q0.c(kj1.c.Content.class), new er.l() { // from class: kj1.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.w9(this.f111168a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(o oVar, z zVar) {
        zVar.A(oVar.new b(null));
        c cVar = oVar.new c(null);
        zVar.x(q0.c(kj1.a.C2672a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(o oVar, z zVar) {
        d dVar = oVar.new d(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(kj1.a.e.class), oVar2, dVar);
        zVar.v(q0.c(kj1.a.OnSelectedDate.class), oVar2, new e(null));
        zVar.x(q0.c(kj1.a.b.class), oVar2, oVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<kj1.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<kj1.c, kj1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<kj1.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(kj1.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(kj1.e eVar) {
        super.P5(eVar);
    }
}
