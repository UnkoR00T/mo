package me1;

import de1.KrusData;
import f00.j0;
import fr.q0;
import java.util.List;
import ld1.KrusOfficeModel;
import ld1.SearchModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001LBK\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R&\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030A8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lme1/u;", "Ll00/g;", "Lme1/j;", "Lme1/i;", "Lme1/k;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lne1/d;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lla1/a;", "interactor", "Lib4/c;", "genericDomainErrorMapper", "La14/w;", "openUrlUseCase", "globalSnackBarManager", "Lce1/a;", "contract", "<init>", "(Lyy/a;Lne1/d;Lac4/a;Lla1/a;Lib4/c;La14/w;Li70/e;Lce1/a;)V", "state", "Lme1/k$a;", "z9", "(Lme1/j;)Lme1/k$a;", "Ldx/b;", "domainError", "Ljb4/b;", "x9", "(Ldx/b;)Ljb4/b;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lne1/d;", "c", "Lac4/a;", "d", "Lla1/a;", "e", "Lib4/c;", "f", "La14/w;", "g", "Li70/e;", "h", "Lce1/a;", "Lme1/j$c;", "j", "Lme1/j$c;", "initialState", "Lxw/b;", "Lme1/i$f;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<me1.j, me1.i> implements me1.k, zx.b, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ne1.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final la1.a interactor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ce1.a contract;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final me1.j.c initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<me1.i.f> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<me1.j, me1.i> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<me1.k.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lme1/u$a;", "Lf00/j0;", "Lce1/a;", "Lme1/u;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<ce1.a, u> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<me1.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f126039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f126040b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f126041a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f126042b;

            /* JADX INFO: renamed from: me1.u$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3096a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f126043d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f126044e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f126045f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f126047h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f126048j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f126049k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f126050l;

                public C3096a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f126043d = obj;
                    this.f126044e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f126041a = hVar;
                this.f126042b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3096a c3096a;
                if (eVar instanceof C3096a) {
                    c3096a = (C3096a) eVar;
                    int i15 = c3096a.f126044e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3096a.f126044e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3096a = new C3096a(eVar);
                    }
                } else {
                    c3096a = new C3096a(eVar);
                }
                Object obj2 = c3096a.f126043d;
                Object objE = uq.b.e();
                int i16 = c3096a.f126044e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f126041a;
                    me1.k.a aVarZ9 = this.f126042b.z9((me1.j) obj);
                    c3096a.f126045f = vq.j.a(obj);
                    c3096a.f126047h = vq.j.a(c3096a);
                    c3096a.f126048j = vq.j.a(obj);
                    c3096a.f126049k = vq.j.a(hVar);
                    c3096a.f126050l = 0;
                    c3096a.f126044e = 1;
                    if (hVar.F(aVarZ9, c3096a) == objE) {
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

        public b(mu.g gVar, u uVar) {
            this.f126039a = gVar;
            this.f126040b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super me1.k.a> hVar, tq.e eVar) {
            Object objA = this.f126039a.a(new a(hVar, this.f126040b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lme1/i$b;", "<unused var>", "Lme1/j;", "Loq/i0;", "<anonymous>", "(Lme1/i$b;Lme1/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<me1.i.b, me1.j, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126051e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f126051e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<me1.i.f> bVarY1 = u.this.Y1();
                me1.i.f.b bVar = me1.i.f.b.f125987a;
                this.f126051e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(me1.i.b bVar, me1.j jVar, tq.e<? super i0> eVar) {
            return u.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lme1/j$c;", "it", "Loq/i0;", "<anonymous>", "(Lme1/j$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<me1.j.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126053e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f126053e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(me1.i.c.f125983a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(me1.j.c cVar, tq.e<? super i0> eVar) {
            return ((d) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lme1/i$c;", "<unused var>", "Lk10/c0;", "Lme1/j$c;", "state", "Lk10/l;", "Lme1/j;", "<anonymous>", "(Lme1/i$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<me1.i.c, k10.c0<me1.j.c>, tq.e<? super k10.l<? extends me1.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126055e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126056f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lme1/j;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends me1.j>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f126058e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f126059f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f126060g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f126061h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f126062j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f126063k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ u f126064l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<me1.j.c> f126065m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, k10.c0<me1.j.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f126064l = uVar;
                this.f126065m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final me1.j.b.Initialized V(u uVar, List list, me1.j.c cVar) {
                KrusData krusDataM3 = uVar.contract.m3();
                return new me1.j.b.Initialized(new me1.j.FormData(list, krusDataM3 != null ? krusDataM3.getKrusOffice() : null, false, true, 4, null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<me1.j.c> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f126063k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    la1.a aVar = this.f126064l.interactor;
                    this.f126063k = 1;
                    obj = aVar.e(this);
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
                    c0Var = (k10.c0) this.f126059f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final u uVar = this.f126064l;
                k10.c0<me1.j.c> c0Var2 = this.f126065m;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final List list = (List) ((dx.i.Right) iVar).b();
                    return c0Var2.d(new er.l() { // from class: me1.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.e.a.V(uVar, list, (j.c) obj2);
                        }
                    });
                }
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                xw.b<me1.i.f> bVarY1 = uVar.Y1();
                me1.i.f.Error error = new me1.i.f.Error(uVar.x9(bVar));
                this.f126058e = vq.j.a(iVar);
                this.f126059f = c0Var2;
                this.f126060g = vq.j.a(bVar);
                this.f126061h = 0;
                this.f126062j = 0;
                this.f126063k = 2;
                if (bVarY1.F(error, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f126064l, this.f126065m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends me1.j>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f126056f;
            Object objE = uq.b.e();
            int i15 = this.f126055e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = u.this.callActionWithLoaderUseCase;
            a aVar2 = new a(u.this, c0Var, null);
            this.f126056f = vq.j.a(c0Var);
            this.f126055e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(me1.i.c cVar, k10.c0<me1.j.c> c0Var, tq.e<? super k10.l<? extends me1.j>> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f126056f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lme1/i$a;", "<unused var>", "Lme1/j$c;", "Loq/i0;", "<anonymous>", "(Lme1/i$a;Lme1/j$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<me1.i.a, me1.j.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126066e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f126066e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<me1.i.f> bVarY1 = u.this.Y1();
                me1.i.f.a aVar = me1.i.f.a.f125986a;
                this.f126066e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(me1.i.a aVar, me1.j.c cVar, tq.e<? super i0> eVar) {
            return u.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lme1/i$a;", "<unused var>", "Lme1/j$b$b;", "Loq/i0;", "<anonymous>", "(Lme1/i$a;Lme1/j$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<me1.i.a, me1.j.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126068e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f126068e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<me1.i.f> bVarY1 = u.this.Y1();
                me1.i.f.a aVar = me1.i.f.a.f125986a;
                this.f126068e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(me1.i.a aVar, me1.j.b.Initialized initialized, tq.e<? super i0> eVar) {
            return u.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lme1/i$d;", "action", "Lme1/j$b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lme1/i$d;Lme1/j$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<me1.i.GoToSearch, me1.j.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126070e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126071f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            me1.i.GoToSearch goToSearch = (me1.i.GoToSearch) this.f126071f;
            Object objE = uq.b.e();
            int i15 = this.f126070e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                me1.i.f.GoToSearch goToSearch2 = new me1.i.f.GoToSearch(goToSearch.getModel());
                this.f126071f = vq.j.a(goToSearch);
                this.f126070e = 1;
                if (uVar.F(goToSearch2, this) == objE) {
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
        public final Object w(me1.i.GoToSearch goToSearch, me1.j.b.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = u.this.new h(eVar);
            hVar.f126071f = goToSearch;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lme1/i$e;", "<unused var>", "Lk10/c0;", "Lme1/j$b$b;", "state", "Lk10/l;", "Lme1/j;", "<anonymous>", "(Lme1/i$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<me1.i.e, k10.c0<me1.j.b.Initialized>, tq.e<? super k10.l<? extends me1.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126073e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126074f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final me1.j.b.InfoPage O(k10.c0 c0Var, me1.j.b.Initialized initialized) {
            return new me1.j.b.InfoPage(((me1.j.b.Initialized) c0Var.a()).getFormData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f126074f;
            uq.b.e();
            if (this.f126073e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: me1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.i.O(c0Var, (j.b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(me1.i.e eVar, k10.c0<me1.j.b.Initialized> c0Var, tq.e<? super k10.l<? extends me1.j>> eVar2) {
            i iVar = new i(eVar2);
            iVar.f126074f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lme1/i$h;", "action", "Lk10/c0;", "Lme1/j$b$b;", "state", "Lk10/l;", "Lme1/j;", "<anonymous>", "(Lme1/i$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<me1.i.OnOfficeSelected, k10.c0<me1.j.b.Initialized>, tq.e<? super k10.l<? extends me1.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126076f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126077g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final me1.j.b.Initialized O(k10.c0 c0Var, me1.i.OnOfficeSelected onOfficeSelected, me1.j.b.Initialized initialized) {
            return initialized.a(me1.j.FormData.b(((me1.j.b.Initialized) c0Var.a()).getFormData(), null, onOfficeSelected.getOffice(), true, false, 9, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final me1.i.OnOfficeSelected onOfficeSelected = (me1.i.OnOfficeSelected) this.f126076f;
            final k10.c0 c0Var = (k10.c0) this.f126077g;
            uq.b.e();
            if (this.f126075e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: me1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.j.O(c0Var, onOfficeSelected, (j.b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(me1.i.OnOfficeSelected onOfficeSelected, k10.c0<me1.j.b.Initialized> c0Var, tq.e<? super k10.l<? extends me1.j>> eVar) {
            j jVar = new j(eVar);
            jVar.f126076f = onOfficeSelected;
            jVar.f126077g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lme1/i$g;", "<unused var>", "Lk10/c0;", "Lme1/j$b$b;", "state", "Lk10/l;", "Lme1/j;", "<anonymous>", "(Lme1/i$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<me1.i.g, k10.c0<me1.j.b.Initialized>, tq.e<? super k10.l<? extends me1.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f126078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f126079f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f126080g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f126081h;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final me1.j.b.Initialized O(me1.j.b.Initialized initialized) {
            return initialized.a(me1.j.FormData.b(initialized.getFormData(), null, null, false, false, 11, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f126081h;
            Object objE = uq.b.e();
            int i15 = this.f126080g;
            if (i15 == 0) {
                oq.u.b(obj);
                KrusOfficeModel selectedKrusOfficeSelection = ((me1.j.b.Initialized) c0Var.a()).getFormData().getSelectedKrusOfficeSelection();
                if (selectedKrusOfficeSelection != null) {
                    u uVar = u.this;
                    uVar.contract.c8(selectedKrusOfficeSelection);
                    me1.i.f.e eVar = me1.i.f.e.f125990a;
                    this.f126081h = c0Var;
                    this.f126078e = vq.j.a(selectedKrusOfficeSelection);
                    this.f126079f = 0;
                    this.f126080g = 1;
                    if (uVar.F(eVar, this) == objE) {
                        return objE;
                    }
                }
                return c0Var.b(new er.l() { // from class: me1.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.k.O((j.b.Initialized) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k10.l lVarC = c0Var.c();
            if (lVarC != null) {
                return lVarC;
            }
            return c0Var.b(new er.l() { // from class: me1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.k.O((j.b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(me1.i.g gVar, k10.c0<me1.j.b.Initialized> c0Var, tq.e<? super k10.l<? extends me1.j>> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f126081h = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lme1/i$i;", "action", "Lme1/j$b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lme1/i$i;Lme1/j$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<me1.i.OpenUrl, me1.j.b.InfoPage, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126084f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            me1.i.OpenUrl openUrl = (me1.i.OpenUrl) this.f126084f;
            Object objE = uq.b.e();
            int i15 = this.f126083e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = u.this.openUrlUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f126084f = vq.j.a(openUrl);
                this.f126083e = 1;
                obj = wVar.c(params, this);
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
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                uVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(me1.i.OpenUrl openUrl, me1.j.b.InfoPage infoPage, tq.e<? super i0> eVar) {
            l lVar = u.this.new l(eVar);
            lVar.f126084f = openUrl;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lme1/i$a;", "<unused var>", "Lk10/c0;", "Lme1/j$b$a;", "state", "Lk10/l;", "Lme1/j;", "<anonymous>", "(Lme1/i$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<me1.i.a, k10.c0<me1.j.b.InfoPage>, tq.e<? super k10.l<? extends me1.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126087f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final me1.j.b.Initialized O(k10.c0 c0Var, me1.j.b.InfoPage infoPage) {
            return new me1.j.b.Initialized(((me1.j.b.InfoPage) c0Var.a()).getFormData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f126087f;
            uq.b.e();
            if (this.f126086e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: me1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.m.O(c0Var, (j.b.InfoPage) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(me1.i.a aVar, k10.c0<me1.j.b.InfoPage> c0Var, tq.e<? super k10.l<? extends me1.j>> eVar) {
            m mVar = new m(eVar);
            mVar.f126087f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, ne1.d dVar, ac4.a aVar2, la1.a aVar3, ib4.c cVar, a14.w wVar, i70.e eVar, ce1.a aVar4) {
        this.mapper = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.interactor = aVar3;
        this.genericDomainErrorMapper = cVar;
        this.openUrlUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.contract = aVar4;
        me1.j.c cVar2 = me1.j.c.f126001a;
        this.initialState = cVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: me1.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.E9(this.f126027a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), z9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(u uVar, SearchModel searchModel) {
        uVar.d9(new me1.i.GoToSearch(searchModel));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(u uVar, KrusOfficeModel krusOfficeModel) {
        uVar.d9(new me1.i.OnOfficeSelected(krusOfficeModel));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(u uVar, String str) {
        uVar.d9(new me1.i.OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(me1.j.class), new er.l() { // from class: me1.l
            @Override // er.l
            public final Object b(Object obj) {
                return u.F9(this.f126019a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(me1.j.c.class), new er.l() { // from class: me1.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.G9(this.f126020a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(me1.j.b.Initialized.class), new er.l() { // from class: me1.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.H9(this.f126021a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(me1.j.b.InfoPage.class), new er.l() { // from class: me1.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.I9(this.f126022a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(u uVar, k10.z zVar) {
        c cVar = uVar.new c(null);
        zVar.x(q0.c(me1.i.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(u uVar, k10.z zVar) {
        zVar.C(uVar.new d(null));
        e eVar = uVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(me1.i.c.class), oVar, eVar);
        zVar.x(q0.c(me1.i.a.class), oVar, uVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(u uVar, k10.z zVar) {
        g gVar = uVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(me1.i.a.class), oVar, gVar);
        zVar.x(q0.c(me1.i.GoToSearch.class), oVar, uVar.new h(null));
        zVar.v(q0.c(me1.i.e.class), oVar, new i(null));
        zVar.v(q0.c(me1.i.OnOfficeSelected.class), oVar, new j(null));
        zVar.v(q0.c(me1.i.g.class), oVar, uVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(u uVar, k10.z zVar) {
        l lVar = uVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(me1.i.OpenUrl.class), oVar, lVar);
        zVar.v(q0.c(me1.i.a.class), oVar, new m(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b x9(dx.b domainError) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: me1.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.y9(this.f126026a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(u uVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            uVar.d9(me1.i.a.f125981a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            uVar.d9(me1.i.c.f125983a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final me1.k.a z9(me1.j state) {
        return this.mapper.b(new ne1.d.Params(state, new er.l() { // from class: me1.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.A9(this.f126023a, (SearchModel) obj);
            }
        }, new er.l() { // from class: me1.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.B9(this.f126024a, (KrusOfficeModel) obj);
            }
        }, b9(me1.i.e.f125985a), b9(me1.i.g.f125991a), new er.l() { // from class: me1.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.C9(this.f126025a, (String) obj);
            }
        }, b9(me1.i.a.f125981a), b9(me1.i.b.f125982a)));
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<me1.i.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<me1.j, me1.i> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<me1.k.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(me1.i.f fVar, tq.e<? super i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
