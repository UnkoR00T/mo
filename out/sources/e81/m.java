package e81;

import fr.q0;
import i61.DataSplit;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001?B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u00102\u001a\b\u0012\u0004\u0012\u00020-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003038\u0014X\u0094\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Le81/m;", "Ll00/g;", "Le81/c;", "Le81/a;", "Le81/d;", "", "Lyy/a;", "stateMachineFactory", "Lf81/c;", "mapper", "Lf81/b;", "dialogMapper", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "Le81/b;", "setupData", "<init>", "(Lyy/a;Lf81/c;Lf81/b;Lib4/c;Lhb4/d;Le81/b;)V", "state", "Le81/d$a;", "r9", "(Le81/c;)Le81/d$a;", "o9", "(Le81/b;)Le81/c;", "Ldx/b;", "domainError", "Lhb4/c;", "p9", "(Ldx/b;)Lhb4/c;", "b", "Lf81/c;", "c", "Lf81/b;", "d", "Lib4/c;", "e", "Lhb4/d;", "f", "Le81/b;", "g", "Le81/c;", "initialState", "Lxw/b;", "Le81/a$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "l", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<e81.c, a> implements e81.d, zx.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f48379m = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f81.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f81.b dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e81.c initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<e81.c, a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<e81.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<e81.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f48389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f48390b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f48391a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f48392b;

            /* JADX INFO: renamed from: e81.m$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1124a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f48393d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f48394e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f48395f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f48397h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f48398j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f48399k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f48400l;

                public C1124a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f48393d = obj;
                    this.f48394e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f48391a = hVar;
                this.f48392b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1124a c1124a;
                if (eVar instanceof C1124a) {
                    c1124a = (C1124a) eVar;
                    int i15 = c1124a.f48394e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1124a.f48394e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1124a = new C1124a(eVar);
                    }
                } else {
                    c1124a = new C1124a(eVar);
                }
                Object obj2 = c1124a.f48393d;
                Object objE = uq.b.e();
                int i16 = c1124a.f48394e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f48391a;
                    e81.d.a aVarR9 = this.f48392b.r9((e81.c) obj);
                    c1124a.f48395f = vq.j.a(obj);
                    c1124a.f48397h = vq.j.a(c1124a);
                    c1124a.f48398j = vq.j.a(obj);
                    c1124a.f48399k = vq.j.a(hVar);
                    c1124a.f48400l = 0;
                    c1124a.f48394e = 1;
                    if (hVar.F(aVarR9, c1124a) == objE) {
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

        public b(mu.g gVar, m mVar) {
            this.f48389a = gVar;
            this.f48390b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e81.d.a> hVar, tq.e eVar) {
            Object objA = this.f48389a.a(new a(hVar, this.f48390b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le81/a$c;", "action", "Le81/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Le81/a$c;Le81/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<a.c, e81.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48402f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.c cVar = (a.c) this.f48402f;
            Object objE = uq.b.e();
            int i15 = this.f48401e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a.c> bVarY1 = m.this.Y1();
                this.f48402f = vq.j.a(cVar);
                this.f48401e = 1;
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
        public final Object w(a.c cVar, e81.c cVar2, tq.e<? super i0> eVar) {
            c cVar3 = m.this.new c(eVar);
            cVar3.f48402f = cVar;
            return cVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le81/a$b;", "<unused var>", "Lk10/c0;", "Le81/c$b;", "state", "Lk10/l;", "Le81/c;", "<anonymous>", "(Le81/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<a.b, c0<e81.c.Presenting>, tq.e<? super k10.l<? extends e81.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48405f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e81.c.Presenting O(DataSplit dataSplit, e81.c.Presenting presenting) {
            return e81.c.Presenting.b(presenting, null, dataSplit.a(dataSplit.getFirstLine().b(dataSplit.getSecondLine().h()), dataSplit.getSecondLine().d(1)), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f48405f;
            uq.b.e();
            if (this.f48404e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final DataSplit dataSplit = ((e81.c.Presenting) c0Var.a()).getDataSplit();
            m mVar = m.this;
            if (dataSplit.getFirstLine().q() >= 63) {
                mVar.d9(new a.c.ShowDialog(mVar.dialogMapper.e()));
                return c0Var.c();
            }
            if (dataSplit.getSecondLine().q() > 1) {
                return c0Var.b(new er.l() { // from class: e81.n
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.d.O(dataSplit, (c.Presenting) obj2);
                    }
                });
            }
            mVar.d9(new a.c.ShowDialog(mVar.dialogMapper.h()));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, c0<e81.c.Presenting> c0Var, tq.e<? super k10.l<? extends e81.c>> eVar) {
            d dVar = m.this.new d(eVar);
            dVar.f48405f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le81/a$a;", "<unused var>", "Lk10/c0;", "Le81/c$b;", "state", "Lk10/l;", "Le81/c;", "<anonymous>", "(Le81/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a.C1120a, c0<e81.c.Presenting>, tq.e<? super k10.l<? extends e81.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48408f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e81.c.Presenting O(DataSplit dataSplit, e81.c.Presenting presenting) {
            return e81.c.Presenting.b(presenting, null, new DataSplit(dataSplit.getFirstLine().f(1), iy.c0.g(dataSplit.getFirstLine().m() + iy.c0.e(dataSplit.getSecondLine()))), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f48408f;
            uq.b.e();
            if (this.f48407e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final DataSplit dataSplit = ((e81.c.Presenting) c0Var.a()).getDataSplit();
            m mVar = m.this;
            if (dataSplit.getSecondLine().q() >= 63) {
                mVar.d9(new a.c.ShowDialog(mVar.dialogMapper.f()));
                return c0Var.c();
            }
            if (dataSplit.getFirstLine().q() > 1) {
                return c0Var.b(new er.l() { // from class: e81.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.e.O(dataSplit, (c.Presenting) obj2);
                    }
                });
            }
            mVar.d9(new a.c.ShowDialog(mVar.dialogMapper.h()));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.C1120a c1120a, c0<e81.c.Presenting> c0Var, tq.e<? super k10.l<? extends e81.c>> eVar) {
            e eVar2 = m.this.new e(eVar);
            eVar2.f48408f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le81/a$d;", "<unused var>", "Le81/c$b;", "state", "Loq/i0;", "<anonymous>", "(Le81/a$d;Le81/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a.d, e81.c.Presenting, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48411f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e81.c.Presenting presenting = (e81.c.Presenting) this.f48411f;
            Object objE = uq.b.e();
            int i15 = this.f48410e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                a.c.Next next = new a.c.Next(presenting.getSplitType(), presenting.getDataSplit());
                this.f48411f = vq.j.a(presenting);
                this.f48410e = 1;
                if (mVar.F(next, this) == objE) {
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
        public final Object w(a.d dVar, e81.c.Presenting presenting, tq.e<? super i0> eVar) {
            f fVar = m.this.new f(eVar);
            fVar.f48411f = presenting;
            return fVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, f81.c cVar, f81.b bVar, ib4.c cVar2, hb4.d dVar, SetupData setupData) {
        this.mapper = cVar;
        this.dialogMapper = bVar;
        this.genericDomainErrorMapper = cVar2;
        this.errorVMSFactory = dVar;
        this.setupData = setupData;
        e81.c cVarO9 = o9(setupData);
        this.initialState = cVarO9;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVarO9, new er.l() { // from class: e81.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.t9(this.f48377a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), r9(cVarO9));
    }

    private final e81.c o9(SetupData setupData) {
        if (setupData.getDataSplit() != null && setupData.getSplitType() != null) {
            return new e81.c.Presenting(setupData.getSplitType(), setupData.getDataSplit());
        }
        return new e81.c.Error(p9(new dx.b.Generic(null, 1, null)));
    }

    private final hb4.c p9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: e81.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.q9(this.f48374a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(m mVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            mVar.d9(a.c.C1121a.f48345a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e81.d.a r9(e81.c state) {
        return this.mapper.b(new f81.c.Params(state, b9(a.b.f48344a), b9(a.C1120a.f48343a), b9(a.d.f48351a), b9(a.c.C1121a.f48345a), b9(a.c.b.f48346a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final m mVar, v vVar) {
        vVar.c(q0.c(e81.c.class), new er.l() { // from class: e81.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.u9(this.f48375a, (z) obj);
            }
        });
        vVar.c(q0.c(e81.c.Presenting.class), new er.l() { // from class: e81.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.v9(this.f48376a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(m mVar, z zVar) {
        c cVar = mVar.new c(null);
        zVar.x(q0.c(a.c.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(m mVar, z zVar) {
        d dVar = mVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(a.b.class), oVar, dVar);
        zVar.v(q0.c(a.C1120a.class), oVar, mVar.new e(null));
        zVar.x(q0.c(a.d.class), oVar, mVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e81.c, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e81.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
