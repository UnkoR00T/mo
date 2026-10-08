package pu2;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00158\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lpu2/o;", "Ll00/g;", "Lpu2/e;", "", "Lpu2/f;", "Lyy/a;", "stateMachineFactory", "Lqu2/a;", "mapper", "<init>", "(Lyy/a;Lqu2/a;)V", "state", "Lpu2/f$a$a;", "k9", "(Lpu2/e;)Lpu2/f$a$a;", "b", "Lqu2/a;", "Lpu2/e$a;", "c", "Lpu2/e$a;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lpu2/f$a;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lpu2/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qu2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e.a initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<f.a> state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<pu2.b> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.a.Initialized> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f162770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f162771b;

        /* JADX INFO: renamed from: pu2.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4014a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f162772a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f162773b;

            /* JADX INFO: renamed from: pu2.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4015a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f162774d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f162775e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f162776f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f162778h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f162779j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f162780k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f162781l;

                public C4015a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f162774d = obj;
                    this.f162775e |= PKIFailureInfo.systemUnavail;
                    return C4014a.this.F(null, this);
                }
            }

            public C4014a(mu.h hVar, o oVar) {
                this.f162772a = hVar;
                this.f162773b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4015a c4015a;
                if (eVar instanceof C4015a) {
                    c4015a = (C4015a) eVar;
                    int i15 = c4015a.f162775e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4015a.f162775e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4015a = new C4015a(eVar);
                    }
                } else {
                    c4015a = new C4015a(eVar);
                }
                Object obj2 = c4015a.f162774d;
                Object objE = uq.b.e();
                int i16 = c4015a.f162775e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f162772a;
                    f.a.Initialized initializedK9 = this.f162773b.k9((e) obj);
                    c4015a.f162776f = vq.j.a(obj);
                    c4015a.f162778h = vq.j.a(c4015a);
                    c4015a.f162779j = vq.j.a(obj);
                    c4015a.f162780k = vq.j.a(hVar);
                    c4015a.f162781l = 0;
                    c4015a.f162775e = 1;
                    if (hVar.F(initializedK9, c4015a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, o oVar) {
            this.f162770a = gVar;
            this.f162771b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.a.Initialized> hVar, tq.e eVar) {
            Object objA = this.f162770a.a(new C4014a(hVar, this.f162771b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpu2/a;", "<unused var>", "Lpu2/e;", "Loq/i0;", "<anonymous>", "(Lpu2/a;Lpu2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<pu2.a, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162782e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162782e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<pu2.b> bVarY1 = o.this.Y1();
                pu2.b.a aVar = pu2.b.a.f162745a;
                this.f162782e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pu2.a aVar, e eVar, tq.e<? super i0> eVar2) {
            return o.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpu2/d;", "<unused var>", "Lpu2/e$a;", "Loq/i0;", "<anonymous>", "(Lpu2/d;Lpu2/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<pu2.d, e.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162784e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162784e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<pu2.b> bVarY1 = o.this.Y1();
                pu2.b.c cVar = pu2.b.c.f162747a;
                this.f162784e = 1;
                if (bVarY1.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pu2.d dVar, e.a aVar, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpu2/c;", "<unused var>", "Lpu2/e$a;", "Loq/i0;", "<anonymous>", "(Lpu2/c;Lpu2/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<pu2.c, e.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162786e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162786e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<pu2.b> bVarY1 = o.this.Y1();
                pu2.b.C4012b c4012b = pu2.b.C4012b.f162746a;
                this.f162786e = 1;
                if (bVarY1.F(c4012b, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pu2.c cVar, e.a aVar, tq.e<? super i0> eVar) {
            return o.this.new d(eVar).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, qu2.a aVar2) {
        this.mapper = aVar2;
        e.a aVar3 = e.a.f162750a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: pu2.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.m9(this.f162762a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(aVar3));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.a.Initialized k9(e state) {
        return this.mapper.b(new qu2.a.Params(state, b9(pu2.c.f162748a), b9(pu2.d.f162749a), b9(pu2.a.f162744a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final o oVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: pu2.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.n9(this.f162763a, (z) obj);
            }
        });
        vVar.c(q0.c(e.a.class), new er.l() { // from class: pu2.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.o9(this.f162764a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        zVar.x(q0.c(pu2.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(o oVar, z zVar) {
        c cVar = oVar.new c(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(pu2.d.class), oVar2, cVar);
        zVar.x(q0.c(pu2.c.class), oVar2, oVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<pu2.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
