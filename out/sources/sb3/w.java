package sb3;

import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vb3.ChosenParticipantsData;
import vb3.ParticipantUIData;
import z93.TravelPersonalData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lsb3/w;", "Ll00/g;", "Lsb3/f;", "Lsb3/c;", "Lsb3/g;", "", "Lyy/a;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUC", "Lx93/b;", "documentManagementInteractor", "Lub3/b;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericErrorMapper", "Ltb3/a;", "contract", "<init>", "(Lyy/a;Lac4/a;Lx93/b;Lub3/b;Lhb4/d;Lib4/c;Ltb3/a;)V", "Lk10/c0;", "Lsb3/e;", "Ldx/b;", "domainError", "Lk10/l;", "Lsb3/d;", "t9", "(Lk10/c0;Ldx/b;)Lk10/l;", "state", "Lsb3/g$a;", "w9", "(Lsb3/f;)Lsb3/g$a;", "b", "Lac4/a;", "c", "Lx93/b;", "d", "Lub3/b;", "e", "Lhb4/d;", "f", "Lib4/c;", "g", "Lsb3/e;", "initialState", "Lxw/b;", "Lsb3/c$a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<sb3.f, sb3.c> implements sb3.g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x93.b documentManagementInteractor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ub3.b mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final sb3.e initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sb3.c.a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<sb3.f, sb3.c> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<sb3.g.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.l<xw.g, i0> {
        a() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(xw.g gVar) {
            c(gVar.getValue());
            return i0.f148189a;
        }

        public final void c(iy.b0 b0Var) {
            w.this.d9(new sb3.c.OnChildParticipantClick(b0Var, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<sb3.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f179985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f179986b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f179987a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f179988b;

            /* JADX INFO: renamed from: sb3.w$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4636a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f179989d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f179990e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f179991f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f179993h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f179994j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f179995k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f179996l;

                public C4636a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f179989d = obj;
                    this.f179990e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, w wVar) {
                this.f179987a = hVar;
                this.f179988b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4636a c4636a;
                if (eVar instanceof C4636a) {
                    c4636a = (C4636a) eVar;
                    int i15 = c4636a.f179990e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4636a.f179990e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4636a = new C4636a(eVar);
                    }
                } else {
                    c4636a = new C4636a(eVar);
                }
                Object obj2 = c4636a.f179989d;
                Object objE = uq.b.e();
                int i16 = c4636a.f179990e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f179987a;
                    sb3.g.a aVarW9 = this.f179988b.w9((sb3.f) obj);
                    c4636a.f179991f = vq.j.a(obj);
                    c4636a.f179993h = vq.j.a(c4636a);
                    c4636a.f179994j = vq.j.a(obj);
                    c4636a.f179995k = vq.j.a(hVar);
                    c4636a.f179996l = 0;
                    c4636a.f179990e = 1;
                    if (hVar.F(aVarW9, c4636a) == objE) {
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

        public b(mu.g gVar, w wVar) {
            this.f179985a = gVar;
            this.f179986b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super sb3.g.a> hVar, tq.e eVar) {
            Object objA = this.f179985a.a(new a(hVar, this.f179986b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsb3/c$b;", "<unused var>", "Lsb3/f;", "Loq/i0;", "<anonymous>", "(Lsb3/c$b;Lsb3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sb3.c.b, sb3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179997e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179997e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                sb3.c.a.C4632a c4632a = sb3.c.a.C4632a.f179908a;
                this.f179997e = 1;
                if (wVar.F(c4632a, this) == objE) {
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
        public final Object w(sb3.c.b bVar, sb3.f fVar, tq.e<? super i0> eVar) {
            return w.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsb3/c$d;", "<unused var>", "Lsb3/f;", "Loq/i0;", "<anonymous>", "(Lsb3/c$d;Lsb3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sb3.c.d, sb3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179999e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179999e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                sb3.c.a.b bVar = sb3.c.a.b.f179909a;
                this.f179999e = 1;
                if (wVar.F(bVar, this) == objE) {
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
        public final Object w(sb3.c.d dVar, sb3.f fVar, tq.e<? super i0> eVar) {
            return w.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsb3/e;", "state", "Lk10/l;", "Lsb3/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<sb3.e>, tq.e<? super k10.l<? extends sb3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180002f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ tb3.a f180004h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lsb3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends sb3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f180005e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f180006f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f180007g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f180008h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f180009j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f180010k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f180011l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f180012m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ w f180013n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<sb3.e> f180014p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ tb3.a f180015q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, k10.c0<sb3.e> c0Var, tb3.a aVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f180013n = wVar;
                this.f180014p = c0Var;
                this.f180015q = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sb3.f.Initialized V(tb3.a aVar, ChosenParticipantsData chosenParticipantsData, List list, sb3.e eVar) {
                return new sb3.f.Initialized(vb3.b.b(aVar.getPersonalData(), chosenParticipantsData.getIsUserParticipant()), list, null, false, 12, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f180012m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    x93.b bVar = this.f180013n.documentManagementInteractor;
                    this.f180012m = 1;
                    obj = bVar.a(this);
                    if (obj != objE) {
                    }
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10.l lVar = (k10.l) this.f180007g;
                    oq.u.b(obj);
                    return lVar;
                }
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                w wVar = this.f180013n;
                k10.c0<sb3.e> c0Var = this.f180014p;
                final tb3.a aVar = this.f180015q;
                if (iVar instanceof dx.i.Left) {
                    return wVar.t9(c0Var, (dx.b) ((dx.i.Left) iVar).b());
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                List list = (List) ((dx.i.Right) iVar).b();
                if (!list.isEmpty()) {
                    final ChosenParticipantsData chosenParticipantsDataA = aVar.a();
                    List<TravelPersonalData> listB = chosenParticipantsDataA.b();
                    ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((TravelPersonalData) it.next()).getPesel());
                    }
                    final List<ParticipantUIData> listC = vb3.b.c(list, arrayList);
                    return c0Var.d(new er.l() { // from class: sb3.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return w.e.a.V(aVar, chosenParticipantsDataA, listC, (e) obj2);
                        }
                    });
                }
                Object objC = c0Var.c();
                aVar.b(ChosenParticipantsData.INSTANCE.a());
                sb3.c.a.Next next = new sb3.c.a.Next(true);
                this.f180005e = vq.j.a(iVar);
                this.f180006f = vq.j.a(list);
                this.f180007g = objC;
                this.f180008h = vq.j.a(objC);
                this.f180009j = 0;
                this.f180010k = 0;
                this.f180011l = 0;
                this.f180012m = 2;
                return wVar.F(next, this) == objE ? objE : objC;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f180013n, this.f180014p, this.f180015q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends sb3.f>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(tb3.a aVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f180004h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f180002f;
            Object objE = uq.b.e();
            int i15 = this.f180001e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = w.this.callActionWithLoaderUC;
            a aVar2 = new a(w.this, c0Var, this.f180004h, null);
            this.f180002f = vq.j.a(c0Var);
            this.f180001e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sb3.e> c0Var, tq.e<? super k10.l<? extends sb3.f>> eVar) {
            return ((e) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = w.this.new e(this.f180004h, eVar);
            eVar2.f180002f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsb3/b;", "<unused var>", "Lk10/c0;", "Lsb3/d;", "state", "Lk10/l;", "Lsb3/f;", "<anonymous>", "(Lsb3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sb3.b, k10.c0<Error>, tq.e<? super k10.l<? extends sb3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180017f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sb3.e O(Error error) {
            return sb3.e.f179919a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f180017f;
            uq.b.e();
            if (this.f180016e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sb3.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.f.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sb3.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends sb3.f>> eVar) {
            f fVar = new f(eVar);
            fVar.f180017f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsb3/a;", "<unused var>", "Lsb3/d;", "Loq/i0;", "<anonymous>", "(Lsb3/a;Lsb3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<sb3.a, Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180018e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f180018e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                sb3.c.a.C4632a c4632a = sb3.c.a.C4632a.f179908a;
                this.f180018e = 1;
                if (wVar.F(c4632a, this) == objE) {
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
        public final Object w(sb3.a aVar, Error error, tq.e<? super i0> eVar) {
            return w.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsb3/c$e;", "<unused var>", "Lk10/c0;", "Lsb3/f$a;", "state", "Lk10/l;", "Lsb3/f;", "<anonymous>", "(Lsb3/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sb3.c.e, k10.c0<sb3.f.Initialized>, tq.e<? super k10.l<? extends sb3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f180020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f180021f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f180022g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f180023h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f180024j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f180025k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f180026l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ tb3.a f180027m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w f180028n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(tb3.a aVar, w wVar, tq.e<? super h> eVar) {
            super(3, eVar);
            this.f180027m = aVar;
            this.f180028n = wVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sb3.f.Initialized O(sb3.f.Initialized initialized) {
            return sb3.f.Initialized.b(initialized, null, null, new hz.b.Invalid(null, 1, null), true, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f180026l;
            Object objE = uq.b.e();
            int i15 = this.f180025k;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f180021f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            List<ParticipantUIData> listC = ((sb3.f.Initialized) c0Var.a()).c();
            ArrayList arrayList = new ArrayList(listC.size());
            int size = listC.size();
            for (int i16 = 0; i16 < size; i16++) {
                ParticipantUIData participantUIData = listC.get(i16);
                if (participantUIData.getIsChecked()) {
                    arrayList.add(participantUIData.getData());
                }
            }
            boolean isChecked = ((sb3.f.Initialized) c0Var.a()).getUserData().getIsChecked();
            boolean z15 = arrayList.isEmpty() && !isChecked;
            if (z15) {
                return c0Var.b(new er.l() { // from class: sb3.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return w.h.O((f.Initialized) obj2);
                    }
                });
            }
            if (z15) {
                throw new oq.p();
            }
            k10.l lVarC = c0Var.c();
            tb3.a aVar = this.f180027m;
            w wVar = this.f180028n;
            aVar.b(new ChosenParticipantsData(isChecked, arrayList));
            sb3.c.a.Next next = new sb3.c.a.Next(false, 1, null);
            this.f180026l = vq.j.a(c0Var);
            this.f180020e = vq.j.a(arrayList);
            this.f180021f = lVarC;
            this.f180022g = vq.j.a(lVarC);
            this.f180023h = isChecked;
            this.f180024j = 0;
            this.f180025k = 1;
            return wVar.F(next, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sb3.c.e eVar, k10.c0<sb3.f.Initialized> c0Var, tq.e<? super k10.l<? extends sb3.f>> eVar2) {
            h hVar = new h(this.f180027m, this.f180028n, eVar2);
            hVar.f180026l = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsb3/c$f;", "<unused var>", "Lk10/c0;", "Lsb3/f$a;", "state", "Lk10/l;", "Lsb3/f;", "<anonymous>", "(Lsb3/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<sb3.c.f, k10.c0<sb3.f.Initialized>, tq.e<? super k10.l<? extends sb3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180030f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sb3.f.Initialized O(sb3.f.Initialized initialized) {
            return sb3.f.Initialized.b(initialized, null, null, null, false, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f180030f;
            uq.b.e();
            if (this.f180029e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sb3.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.i.O((f.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sb3.c.f fVar, k10.c0<sb3.f.Initialized> c0Var, tq.e<? super k10.l<? extends sb3.f>> eVar) {
            i iVar = new i(eVar);
            iVar.f180030f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsb3/c$c;", "action", "Lk10/c0;", "Lsb3/f$a;", "state", "Lk10/l;", "Lsb3/f;", "<anonymous>", "(Lsb3/c$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sb3.c.OnChildParticipantClick, k10.c0<sb3.f.Initialized>, tq.e<? super k10.l<? extends sb3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f180033g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sb3.f.Initialized O(sb3.c.OnChildParticipantClick onChildParticipantClick, sb3.f.Initialized initialized) {
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            List<ParticipantUIData> listC = initialized.c();
            ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
            for (ParticipantUIData participantUIData : listC) {
                ParticipantUIData participantUIDataB = !xw.g.f(participantUIData.getData().getPesel(), onChildParticipantClick.getPesel()) ? participantUIData : null;
                if (participantUIDataB == null) {
                    participantUIDataB = ParticipantUIData.b(participantUIData, !participantUIData.getIsChecked(), null, 2, null);
                }
                arrayList.add(participantUIDataB);
            }
            return sb3.f.Initialized.b(initialized, null, arrayList, c2039b, false, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sb3.c.OnChildParticipantClick onChildParticipantClick = (sb3.c.OnChildParticipantClick) this.f180032f;
            k10.c0 c0Var = (k10.c0) this.f180033g;
            uq.b.e();
            if (this.f180031e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sb3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.j.O(onChildParticipantClick, (f.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sb3.c.OnChildParticipantClick onChildParticipantClick, k10.c0<sb3.f.Initialized> c0Var, tq.e<? super k10.l<? extends sb3.f>> eVar) {
            j jVar = new j(eVar);
            jVar.f180032f = onChildParticipantClick;
            jVar.f180033g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsb3/c$g;", "<unused var>", "Lk10/c0;", "Lsb3/f$a;", "state", "Lk10/l;", "Lsb3/f;", "<anonymous>", "(Lsb3/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<sb3.c.g, k10.c0<sb3.f.Initialized>, tq.e<? super k10.l<? extends sb3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180035f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sb3.f.Initialized O(sb3.f.Initialized initialized) {
            return sb3.f.Initialized.b(initialized, ParticipantUIData.b(initialized.getUserData(), !initialized.getUserData().getIsChecked(), null, 2, null), null, hz.b.C2039b.f86846c, false, 10, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f180035f;
            uq.b.e();
            if (this.f180034e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sb3.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.k.O((f.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sb3.c.g gVar, k10.c0<sb3.f.Initialized> c0Var, tq.e<? super k10.l<? extends sb3.f>> eVar) {
            k kVar = new k(eVar);
            kVar.f180035f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    public w(yy.a aVar, ac4.a aVar2, x93.b bVar, ub3.b bVar2, hb4.d dVar, ib4.c cVar, final tb3.a aVar3) {
        this.callActionWithLoaderUC = aVar2;
        this.documentManagementInteractor = bVar;
        this.mapper = bVar2;
        this.errorVMSFactory = dVar;
        this.genericErrorMapper = cVar;
        sb3.e eVar = sb3.e.f179919a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: sb3.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.y9(this.f179973a, aVar3, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), w9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(w wVar, tb3.a aVar, k10.z zVar) {
        zVar.A(wVar.new e(aVar, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(w wVar, k10.z zVar) {
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(sb3.b.class), oVar, fVar);
        zVar.x(q0.c(sb3.a.class), oVar, wVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(tb3.a aVar, w wVar, k10.z zVar) {
        h hVar = new h(aVar, wVar, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(sb3.c.e.class), oVar, hVar);
        zVar.v(q0.c(sb3.c.f.class), oVar, new i(null));
        zVar.v(q0.c(sb3.c.OnChildParticipantClick.class), oVar, new j(null));
        zVar.v(q0.c(sb3.c.g.class), oVar, new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<Error> t9(k10.c0<sb3.e> c0Var, final dx.b bVar) {
        return c0Var.d(new er.l() { // from class: sb3.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.u9(this.f179970a, bVar, (e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Error u9(final w wVar, dx.b bVar, sb3.e eVar) {
        return new Error(wVar.errorVMSFactory.a(wVar.genericErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: sb3.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.v9(this.f179972a, (ib4.c.b) obj);
            }
        }, 2, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(w wVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            wVar.d9(sb3.a.f179905a);
        } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            wVar.d9(sb3.b.f179906a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sb3.g.a w9(sb3.f state) {
        return this.mapper.b(new ub3.b.Params(state, b9(sb3.c.b.f179911a), b9(sb3.c.d.f179914a), b9(sb3.c.e.f179915a), b9(sb3.c.f.f179916a), b9(sb3.c.g.f179917a), new a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final w wVar, final tb3.a aVar, k10.v vVar) {
        vVar.c(q0.c(sb3.f.class), new er.l() { // from class: sb3.p
            @Override // er.l
            public final Object b(Object obj) {
                return w.z9(this.f179964a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(sb3.e.class), new er.l() { // from class: sb3.q
            @Override // er.l
            public final Object b(Object obj) {
                return w.A9(this.f179965a, aVar, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: sb3.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.B9(this.f179967a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(sb3.f.Initialized.class), new er.l() { // from class: sb3.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.C9(aVar, wVar, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(w wVar, k10.z zVar) {
        c cVar = wVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sb3.c.b.class), oVar, cVar);
        zVar.x(q0.c(sb3.c.d.class), oVar, wVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<sb3.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<sb3.f, sb3.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<sb3.g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(sb3.c.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(tb3.a aVar) {
        super.P5(aVar);
    }
}
