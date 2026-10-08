package i43;

import f00.j0;
import f43.ChildStudent;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00017B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Li43/r;", "Ll00/g;", "Li43/b;", "Li43/a;", "Li43/c;", "", "Lyy/a;", "stateMachineFactory", "Lk43/f;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lc54/b;", "isFeatureEnabledUseCase", "Lj43/a;", "data", "<init>", "(Lyy/a;Lk43/f;Lhb4/d;Lib4/c;Lc54/b;Lj43/a;)V", "state", "Li43/c$a;", "v9", "(Li43/b;)Li43/c$a;", "b", "Lk43/f;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Lc54/b;", "f", "Lj43/a;", "g", "Li43/b;", "initialState", "Lxw/b;", "Li43/a$b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<i43.b, i43.a> implements i43.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k43.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j43.a data;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i43.b initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i43.a.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<i43.b, i43.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<i43.c.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Li43/r$a;", "Lf00/j0;", "Lj43/a;", "Li43/r;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<j43.a, r> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<i43.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f89264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f89265b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f89266a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f89267b;

            /* JADX INFO: renamed from: i43.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2110a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f89268d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f89269e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f89270f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f89272h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f89273j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f89274k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f89275l;

                public C2110a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f89268d = obj;
                    this.f89269e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f89266a = hVar;
                this.f89267b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2110a c2110a;
                if (eVar instanceof C2110a) {
                    c2110a = (C2110a) eVar;
                    int i15 = c2110a.f89269e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2110a.f89269e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2110a = new C2110a(eVar);
                    }
                } else {
                    c2110a = new C2110a(eVar);
                }
                Object obj2 = c2110a.f89268d;
                Object objE = uq.b.e();
                int i16 = c2110a.f89269e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f89266a;
                    i43.c.a aVarV9 = this.f89267b.v9((i43.b) obj);
                    c2110a.f89270f = vq.j.a(obj);
                    c2110a.f89272h = vq.j.a(c2110a);
                    c2110a.f89273j = vq.j.a(obj);
                    c2110a.f89274k = vq.j.a(hVar);
                    c2110a.f89275l = 0;
                    c2110a.f89269e = 1;
                    if (hVar.F(aVarV9, c2110a) == objE) {
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

        public b(mu.g gVar, r rVar) {
            this.f89264a = gVar;
            this.f89265b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i43.c.a> hVar, tq.e eVar) {
            Object objA = this.f89264a.a(new a(hVar, this.f89265b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Li43/b$c;", "state", "Lk10/l;", "Li43/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<i43.b.c>, tq.e<? super k10.l<? extends i43.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89277f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i43.b.DisplayingChildDashboard X(ChildStudent childStudent, boolean z15, i43.b.c cVar) {
            return new i43.b.DisplayingChildDashboard(childStudent, z15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i43.b.ErrorChildDashboard Y(final r rVar, i43.b.c cVar) {
            return new i43.b.ErrorChildDashboard(rVar.errorVMSFactory.a(rVar.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: i43.u
                @Override // er.l
                public final Object b(Object obj) {
                    return r.c.Z(rVar, (ib4.c.b) obj);
                }
            }))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Z(r rVar, ib4.c.b bVar) {
            rVar.d9(i43.a.e.f89215a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f89277f;
            uq.b.e();
            if (this.f89276e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final ChildStudent childStudentY2 = r.this.data.y2();
            final boolean zBooleanValue = r.this.isFeatureEnabledUseCase.a(b54.c.SCHOOL_INFO).booleanValue();
            if (childStudentY2 != null) {
                return c0Var.d(new er.l() { // from class: i43.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.c.X(childStudentY2, zBooleanValue, (b.c) obj2);
                    }
                });
            }
            final r rVar = r.this;
            return c0Var.d(new er.l() { // from class: i43.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.c.Y(rVar, (b.c) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<i43.b.c> c0Var, tq.e<? super k10.l<? extends i43.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = r.this.new c(eVar);
            cVar.f89277f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li43/a$e;", "<unused var>", "Li43/b$a;", "Loq/i0;", "<anonymous>", "(Li43/a$e;Li43/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<i43.a.e, i43.b.DisplayingChildDashboard, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89279e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89279e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                i43.a.b.C2105a c2105a = i43.a.b.C2105a.f89199a;
                this.f89279e = 1;
                if (rVar.F(c2105a, this) == objE) {
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
        public final Object w(i43.a.e eVar, i43.b.DisplayingChildDashboard displayingChildDashboard, tq.e<? super i0> eVar2) {
            return r.this.new d(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li43/a$h;", "<unused var>", "Li43/b$a;", "state", "Loq/i0;", "<anonymous>", "(Li43/a$h;Li43/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<i43.a.h, i43.b.DisplayingChildDashboard, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89282f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i43.b.DisplayingChildDashboard displayingChildDashboard = (i43.b.DisplayingChildDashboard) this.f89282f;
            Object objE = uq.b.e();
            int i15 = this.f89281e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                i43.a.b.ToGrades toGrades = new i43.a.b.ToGrades(displayingChildDashboard.getChild().getId());
                this.f89282f = vq.j.a(displayingChildDashboard);
                this.f89281e = 1;
                if (rVar.F(toGrades, this) == objE) {
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
        public final Object w(i43.a.h hVar, i43.b.DisplayingChildDashboard displayingChildDashboard, tq.e<? super i0> eVar) {
            e eVar2 = r.this.new e(eVar);
            eVar2.f89282f = displayingChildDashboard;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li43/a$j;", "<unused var>", "Li43/b$a;", "state", "Loq/i0;", "<anonymous>", "(Li43/a$j;Li43/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<i43.a.j, i43.b.DisplayingChildDashboard, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89285f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i43.b.DisplayingChildDashboard displayingChildDashboard = (i43.b.DisplayingChildDashboard) this.f89285f;
            Object objE = uq.b.e();
            int i15 = this.f89284e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                i43.a.b.ToSchedule toSchedule = new i43.a.b.ToSchedule(displayingChildDashboard.getChild().getId());
                this.f89285f = vq.j.a(displayingChildDashboard);
                this.f89284e = 1;
                if (rVar.F(toSchedule, this) == objE) {
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
        public final Object w(i43.a.j jVar, i43.b.DisplayingChildDashboard displayingChildDashboard, tq.e<? super i0> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f89285f = displayingChildDashboard;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li43/a$d;", "<unused var>", "Li43/b$a;", "state", "Loq/i0;", "<anonymous>", "(Li43/a$d;Li43/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<i43.a.d, i43.b.DisplayingChildDashboard, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89288f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i43.b.DisplayingChildDashboard displayingChildDashboard = (i43.b.DisplayingChildDashboard) this.f89288f;
            Object objE = uq.b.e();
            int i15 = this.f89287e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                i43.a.b.ToAttendance toAttendance = new i43.a.b.ToAttendance(displayingChildDashboard.getChild().getId());
                this.f89288f = vq.j.a(displayingChildDashboard);
                this.f89287e = 1;
                if (rVar.F(toAttendance, this) == objE) {
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
        public final Object w(i43.a.d dVar, i43.b.DisplayingChildDashboard displayingChildDashboard, tq.e<? super i0> eVar) {
            g gVar = r.this.new g(eVar);
            gVar.f89288f = displayingChildDashboard;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li43/a$f;", "<unused var>", "Li43/b$a;", "state", "Loq/i0;", "<anonymous>", "(Li43/a$f;Li43/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<i43.a.f, i43.b.DisplayingChildDashboard, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89291f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i43.b.DisplayingChildDashboard displayingChildDashboard = (i43.b.DisplayingChildDashboard) this.f89291f;
            Object objE = uq.b.e();
            int i15 = this.f89290e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                i43.a.b.ToBehavior toBehavior = new i43.a.b.ToBehavior(displayingChildDashboard.getChild().getId());
                this.f89291f = vq.j.a(displayingChildDashboard);
                this.f89290e = 1;
                if (rVar.F(toBehavior, this) == objE) {
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
        public final Object w(i43.a.f fVar, i43.b.DisplayingChildDashboard displayingChildDashboard, tq.e<? super i0> eVar) {
            h hVar = r.this.new h(eVar);
            hVar.f89291f = displayingChildDashboard;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li43/a$g;", "action", "Li43/b$a;", "state", "Loq/i0;", "<anonymous>", "(Li43/a$g;Li43/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<i43.a.OnGradeCardClick, i43.b.DisplayingChildDashboard, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89293e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89294f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f89295g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i43.a.OnGradeCardClick onGradeCardClick = (i43.a.OnGradeCardClick) this.f89294f;
            i43.b.DisplayingChildDashboard displayingChildDashboard = (i43.b.DisplayingChildDashboard) this.f89295g;
            Object objE = uq.b.e();
            int i15 = this.f89293e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                i43.a.b.ToGradeDetails toGradeDetails = new i43.a.b.ToGradeDetails(onGradeCardClick.getGradeId(), displayingChildDashboard.getChild().getId());
                this.f89294f = vq.j.a(onGradeCardClick);
                this.f89295g = vq.j.a(displayingChildDashboard);
                this.f89293e = 1;
                if (rVar.F(toGradeDetails, this) == objE) {
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
        public final Object w(i43.a.OnGradeCardClick onGradeCardClick, i43.b.DisplayingChildDashboard displayingChildDashboard, tq.e<? super i0> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f89294f = onGradeCardClick;
            iVar.f89295g = displayingChildDashboard;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li43/a$c;", "action", "Li43/b$a;", "state", "Loq/i0;", "<anonymous>", "(Li43/a$c;Li43/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<i43.a.OnAbsenceCardClick, i43.b.DisplayingChildDashboard, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f89299g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i43.a.OnAbsenceCardClick onAbsenceCardClick = (i43.a.OnAbsenceCardClick) this.f89298f;
            i43.b.DisplayingChildDashboard displayingChildDashboard = (i43.b.DisplayingChildDashboard) this.f89299g;
            Object objE = uq.b.e();
            int i15 = this.f89297e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                i43.a.b.ToAbsenceDetails toAbsenceDetails = new i43.a.b.ToAbsenceDetails(displayingChildDashboard.getChild().getId(), onAbsenceCardClick.getSemesterId(), onAbsenceCardClick.getAbsenceType());
                this.f89298f = vq.j.a(onAbsenceCardClick);
                this.f89299g = vq.j.a(displayingChildDashboard);
                this.f89297e = 1;
                if (rVar.F(toAbsenceDetails, this) == objE) {
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
        public final Object w(i43.a.OnAbsenceCardClick onAbsenceCardClick, i43.b.DisplayingChildDashboard displayingChildDashboard, tq.e<? super i0> eVar) {
            j jVar = r.this.new j(eVar);
            jVar.f89298f = onAbsenceCardClick;
            jVar.f89299g = displayingChildDashboard;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li43/a$i;", "action", "Li43/b$a;", "state", "Loq/i0;", "<anonymous>", "(Li43/a$i;Li43/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<i43.a.OnLessonCardClick, i43.b.DisplayingChildDashboard, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f89303g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i43.a.OnLessonCardClick onLessonCardClick = (i43.a.OnLessonCardClick) this.f89302f;
            i43.b.DisplayingChildDashboard displayingChildDashboard = (i43.b.DisplayingChildDashboard) this.f89303g;
            Object objE = uq.b.e();
            int i15 = this.f89301e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                i43.a.b.ToLessonDetails toLessonDetails = new i43.a.b.ToLessonDetails(displayingChildDashboard.getChild().getId(), onLessonCardClick.getLessonId());
                this.f89302f = vq.j.a(onLessonCardClick);
                this.f89303g = vq.j.a(displayingChildDashboard);
                this.f89301e = 1;
                if (rVar.F(toLessonDetails, this) == objE) {
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
        public final Object w(i43.a.OnLessonCardClick onLessonCardClick, i43.b.DisplayingChildDashboard displayingChildDashboard, tq.e<? super i0> eVar) {
            k kVar = r.this.new k(eVar);
            kVar.f89302f = onLessonCardClick;
            kVar.f89303g = displayingChildDashboard;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li43/a$a;", "action", "Li43/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Li43/a$a;Li43/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<i43.a.GoToMoreShortcuts, i43.b.DisplayingChildDashboard, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89306f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i43.a.GoToMoreShortcuts goToMoreShortcuts = (i43.a.GoToMoreShortcuts) this.f89306f;
            Object objE = uq.b.e();
            int i15 = this.f89305e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                i43.a.b.GoToMoreShortcuts goToMoreShortcuts2 = new i43.a.b.GoToMoreShortcuts(goToMoreShortcuts.a());
                this.f89306f = vq.j.a(goToMoreShortcuts);
                this.f89305e = 1;
                if (rVar.F(goToMoreShortcuts2, this) == objE) {
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
        public final Object w(i43.a.GoToMoreShortcuts goToMoreShortcuts, i43.b.DisplayingChildDashboard displayingChildDashboard, tq.e<? super i0> eVar) {
            l lVar = r.this.new l(eVar);
            lVar.f89306f = goToMoreShortcuts;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li43/a$e;", "<unused var>", "Li43/b$b;", "Loq/i0;", "<anonymous>", "(Li43/a$e;Li43/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<i43.a.e, i43.b.ErrorChildDashboard, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89308e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89308e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                i43.a.b.C2105a c2105a = i43.a.b.C2105a.f89199a;
                this.f89308e = 1;
                if (rVar.F(c2105a, this) == objE) {
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
        public final Object w(i43.a.e eVar, i43.b.ErrorChildDashboard errorChildDashboard, tq.e<? super i0> eVar2) {
            return r.this.new m(eVar2).J(i0.f148189a);
        }
    }

    public r(yy.a aVar, k43.f fVar, hb4.d dVar, ib4.c cVar, c54.b bVar, j43.a aVar2) {
        this.mapper = fVar;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.isFeatureEnabledUseCase = bVar;
        this.data = aVar2;
        i43.b.c cVar2 = i43.b.c.f89224a;
        this.initialState = cVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: i43.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f89254a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), v9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(i43.b.c.class), new er.l() { // from class: i43.j
            @Override // er.l
            public final Object b(Object obj) {
                return r.C9(this.f89247a, (z) obj);
            }
        });
        vVar.c(q0.c(i43.b.DisplayingChildDashboard.class), new er.l() { // from class: i43.k
            @Override // er.l
            public final Object b(Object obj) {
                return r.D9(this.f89248a, (z) obj);
            }
        });
        vVar.c(q0.c(i43.b.ErrorChildDashboard.class), new er.l() { // from class: i43.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.E9(this.f89249a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(r rVar, z zVar) {
        zVar.A(rVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(r rVar, z zVar) {
        d dVar = rVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(i43.a.e.class), oVar, dVar);
        zVar.x(q0.c(i43.a.h.class), oVar, rVar.new e(null));
        zVar.x(q0.c(i43.a.j.class), oVar, rVar.new f(null));
        zVar.x(q0.c(i43.a.d.class), oVar, rVar.new g(null));
        zVar.x(q0.c(i43.a.f.class), oVar, rVar.new h(null));
        zVar.x(q0.c(i43.a.OnGradeCardClick.class), oVar, rVar.new i(null));
        zVar.x(q0.c(i43.a.OnAbsenceCardClick.class), oVar, rVar.new j(null));
        zVar.x(q0.c(i43.a.OnLessonCardClick.class), oVar, rVar.new k(null));
        zVar.x(q0.c(i43.a.GoToMoreShortcuts.class), oVar, rVar.new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(r rVar, z zVar) {
        m mVar = rVar.new m(null);
        zVar.x(q0.c(i43.a.e.class), k10.o.CANCEL_PREVIOUS, mVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i43.c.a v9(i43.b state) {
        return this.mapper.b(new k43.f.Params(state, b9(i43.a.e.f89215a), b9(i43.a.h.f89218a), b9(i43.a.j.f89220a), b9(i43.a.d.f89214a), b9(i43.a.f.f89216a), new er.l() { // from class: i43.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.w9(this.f89250a, (String) obj);
            }
        }, new er.p() { // from class: i43.n
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return r.x9(this.f89251a, (String) obj, (f43.e) obj2);
            }
        }, new er.l() { // from class: i43.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f89252a, (String) obj);
            }
        }, new er.l() { // from class: i43.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(this.f89253a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(r rVar, String str) {
        rVar.d9(new i43.a.OnGradeCardClick(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(r rVar, String str, f43.e eVar) {
        rVar.d9(new i43.a.OnAbsenceCardClick(str, eVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(r rVar, String str) {
        rVar.d9(new i43.a.OnLessonCardClick(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(r rVar, List list) {
        rVar.d9(new i43.a.GoToMoreShortcuts(list));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<i43.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<i43.b, i43.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i43.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(i43.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }
}
