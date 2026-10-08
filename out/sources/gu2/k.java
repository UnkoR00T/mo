package gu2;

import er.q;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lgu2/k;", "Ll00/g;", "Lgu2/b;", "Lgu2/a;", "Lgu2/c;", "", "Lyy/a;", "stateMachineFactory", "Lhu2/a;", "peselRestrictionVerificationDispatcherMapper", "Lzt2/p;", "isUserUnderageUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorHandler", "<init>", "(Lyy/a;Lhu2/a;Lzt2/p;Lac4/a;Lib4/c;)V", "Loq/i0;", "q9", "()V", "r9", "b", "Lhu2/a;", "c", "Lzt2/p;", "d", "Lac4/a;", "e", "Lib4/c;", "Lgu2/b$a;", "f", "Lgu2/b$a;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lgu2/a$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lgu2/c$a;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<gu2.b, gu2.a> implements gu2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hu2.a peselRestrictionVerificationDispatcherMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zt2.p isUserUnderageUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final gu2.b.a initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<gu2.b, gu2.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gu2.a.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<gu2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<gu2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f77029a;

        /* JADX INFO: renamed from: gu2.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1749a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f77030a;

            /* JADX INFO: renamed from: gu2.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1750a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f77031d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f77032e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f77033f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f77035h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f77036j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f77037k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f77038l;

                public C1750a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f77031d = obj;
                    this.f77032e |= PKIFailureInfo.systemUnavail;
                    return C1749a.this.F(null, this);
                }
            }

            public C1749a(mu.h hVar) {
                this.f77030a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1750a c1750a;
                if (eVar instanceof C1750a) {
                    c1750a = (C1750a) eVar;
                    int i15 = c1750a.f77032e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1750a.f77032e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1750a = new C1750a(eVar);
                    }
                } else {
                    c1750a = new C1750a(eVar);
                }
                Object obj2 = c1750a.f77031d;
                Object objE = uq.b.e();
                int i16 = c1750a.f77032e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f77030a;
                    gu2.c.a data = ((gu2.b) obj).getData();
                    c1750a.f77033f = vq.j.a(obj);
                    c1750a.f77035h = vq.j.a(c1750a);
                    c1750a.f77036j = vq.j.a(obj);
                    c1750a.f77037k = vq.j.a(hVar);
                    c1750a.f77038l = 0;
                    c1750a.f77032e = 1;
                    if (hVar.F(data, c1750a) == objE) {
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

        public a(mu.g gVar) {
            this.f77029a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super gu2.c.a> hVar, tq.e eVar) {
            Object objA = this.f77029a.a(new C1749a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgu2/a$b;", "<unused var>", "Lgu2/b;", "Loq/i0;", "<anonymous>", "(Lgu2/a$b;Lgu2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<gu2.a.b, gu2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77039e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77039e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<gu2.a.c> bVarY1 = k.this.Y1();
                gu2.a.c.C1745a c1745a = gu2.a.c.C1745a.f77001a;
                this.f77039e = 1;
                if (bVarY1.F(c1745a, this) == objE) {
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
        public final Object w(gu2.a.b bVar, gu2.b bVar2, tq.e<? super i0> eVar) {
            return k.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgu2/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lgu2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<gu2.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77041e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f77041e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            k.this.d9(gu2.a.C1744a.f76999a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(gu2.b.a aVar, tq.e<? super i0> eVar) {
            return ((c) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return k.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgu2/a$a;", "<unused var>", "Lk10/c0;", "Lgu2/b$a;", "state", "Lk10/l;", "Lgu2/b;", "<anonymous>", "(Lgu2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<gu2.a.C1744a, c0<gu2.b.a>, tq.e<? super k10.l<? extends gu2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f77044f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lgu2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends gu2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f77046e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f77047f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f77048g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f77049h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f77050j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            boolean f77051k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f77052l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k f77053m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ c0<gu2.b.a> f77054n;

            /* JADX INFO: renamed from: gu2.k$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final /* synthetic */ class C1751a extends fr.q implements er.a<i0> {
                C1751a(Object obj) {
                    super(0, obj, k.class, "closeAction", "closeAction()V", 0);
                }

                public final void E() {
                    ((k) this.f66391b).r9();
                }

                @Override // er.a
                public /* bridge */ /* synthetic */ i0 a() {
                    E();
                    return i0.f148189a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, c0<gu2.b.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f77053m = kVar;
                this.f77054n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 X(k kVar, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary)) {
                    kVar.r9();
                } else {
                    if (!(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    kVar.q9();
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final gu2.b.Underage Y(k kVar, gu2.b.a aVar) {
                return new gu2.b.Underage(kVar.peselRestrictionVerificationDispatcherMapper.b(new hu2.a.Params(new C1751a(kVar))));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                c0<gu2.b.a> c0Var;
                c0<gu2.b.a> c0Var2;
                Object objE = uq.b.e();
                int i15 = this.f77052l;
                if (i15 == 0) {
                    u.b(obj);
                    zt2.p pVar = this.f77053m.isUserUnderageUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f77052l = 1;
                    obj = pVar.a(c1792a, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        c0Var2 = (c0) this.f77047f;
                        u.b(obj);
                        return c0Var2.c();
                    }
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (c0) this.f77047f;
                    u.b(obj);
                    return c0Var.c();
                }
                u.b(obj);
                dx.i iVar = (dx.i) obj;
                final k kVar = this.f77053m;
                c0<gu2.b.a> c0Var3 = this.f77054n;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    xw.b<gu2.a.c> bVarY1 = kVar.Y1();
                    gu2.a.c.GoToErrorScreen goToErrorScreen = new gu2.a.c.GoToErrorScreen(kVar.genericDomainErrorHandler.b(new ib4.c.Params(bVar, false, new er.l() { // from class: gu2.l
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return k.d.a.X(kVar, (ib4.c.b) obj2);
                        }
                    }, 2, null)));
                    this.f77046e = vq.j.a(iVar);
                    this.f77047f = c0Var3;
                    this.f77048g = vq.j.a(bVar);
                    this.f77049h = 0;
                    this.f77050j = 0;
                    this.f77052l = 2;
                    if (bVarY1.F(goToErrorScreen, this) != objE) {
                        c0Var2 = c0Var3;
                        return c0Var2.c();
                    }
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    boolean zBooleanValue = ((Boolean) ((dx.i.Right) iVar).b()).booleanValue();
                    if (zBooleanValue) {
                        return c0Var3.d(new er.l() { // from class: gu2.m
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return k.d.a.Y(kVar, (b.a) obj2);
                            }
                        });
                    }
                    xw.b<gu2.a.c> bVarY2 = kVar.Y1();
                    gu2.a.c.C1746c c1746c = gu2.a.c.C1746c.f77003a;
                    this.f77046e = vq.j.a(iVar);
                    this.f77047f = c0Var3;
                    this.f77049h = 0;
                    this.f77051k = zBooleanValue;
                    this.f77050j = 0;
                    this.f77052l = 3;
                    if (bVarY2.F(c1746c, this) != objE) {
                        c0Var = c0Var3;
                        return c0Var.c();
                    }
                }
                return objE;
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f77053m, this.f77054n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends gu2.b>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f77044f;
            Object objE = uq.b.e();
            int i15 = this.f77043e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ac4.a aVar = k.this.callActionWithLoaderUseCase;
            a aVar2 = new a(k.this, c0Var, null);
            this.f77044f = vq.j.a(c0Var);
            this.f77043e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gu2.a.C1744a c1744a, c0<gu2.b.a> c0Var, tq.e<? super k10.l<? extends gu2.b>> eVar) {
            d dVar = k.this.new d(eVar);
            dVar.f77044f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, hu2.a aVar2, zt2.p pVar, ac4.a aVar3, ib4.c cVar) {
        this.peselRestrictionVerificationDispatcherMapper = aVar2;
        this.isUserUnderageUseCase = pVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.genericDomainErrorHandler = cVar;
        gu2.b.a aVar4 = gu2.b.a.f77005b;
        this.initialState = aVar4;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: gu2.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.t9(this.f77018a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState()), aVar4.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q9() {
        d9(gu2.a.C1744a.f76999a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r9() {
        d9(gu2.a.b.f77000a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final k kVar, v vVar) {
        vVar.c(q0.c(gu2.b.class), new er.l() { // from class: gu2.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.u9(this.f77019a, (z) obj);
            }
        });
        vVar.c(q0.c(gu2.b.a.class), new er.l() { // from class: gu2.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.v9(this.f77020a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        zVar.x(q0.c(gu2.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(k kVar, z zVar) {
        zVar.C(kVar.new c(null));
        d dVar = kVar.new d(null);
        zVar.v(q0.c(gu2.a.C1744a.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<gu2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<gu2.b, gu2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<gu2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
