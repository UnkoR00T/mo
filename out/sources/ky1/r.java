package ky1;

import f00.j0;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pw1.ChangePinData;
import py1.ResetPinData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00014B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030)8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lky1/r;", "Ll00/g;", "Lky1/b;", "Lky1/a;", "Lky1/c;", "", "Lyy/a;", "stateMachineFactory", "Lly1/f;", "mapper", "Ljy1/a;", "faqScreenMapper", "Liy1/b;", "errorMapper", "Lhb4/d;", "errorVMSFactory", "Lky1/d;", "setupContract", "<init>", "(Lyy/a;Lly1/f;Ljy1/a;Liy1/b;Lhb4/d;Lky1/d;)V", "state", "Lky1/c$a;", "t9", "(Lky1/b;)Lky1/c$a;", "b", "Lly1/f;", "c", "Ljy1/a;", "d", "Liy1/b;", "e", "Lhb4/d;", "f", "Lky1/d;", "Lxw/b;", "Lky1/a$h;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<ky1.b, ky1.a> implements ky1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ly1.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jy1.a faqScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy1.b errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ky1.d setupContract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ky1.a.h> navAction = new xw.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ky1.b, ky1.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<ky1.c.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lky1/r$a;", "Lf00/j0;", "Lky1/d;", "Lky1/r;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<ky1.d, r> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ky1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f113179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f113180b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f113181a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f113182b;

            /* JADX INFO: renamed from: ky1.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2747a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f113183d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f113184e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f113185f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f113187h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f113188j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f113189k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f113190l;

                public C2747a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f113183d = obj;
                    this.f113184e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f113181a = hVar;
                this.f113182b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2747a c2747a;
                if (eVar instanceof C2747a) {
                    c2747a = (C2747a) eVar;
                    int i15 = c2747a.f113184e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2747a.f113184e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2747a = new C2747a(eVar);
                    }
                } else {
                    c2747a = new C2747a(eVar);
                }
                Object obj2 = c2747a.f113183d;
                Object objE = uq.b.e();
                int i16 = c2747a.f113184e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f113181a;
                    ky1.c.a aVarT9 = this.f113182b.t9((ky1.b) obj);
                    c2747a.f113185f = vq.j.a(obj);
                    c2747a.f113187h = vq.j.a(c2747a);
                    c2747a.f113188j = vq.j.a(obj);
                    c2747a.f113189k = vq.j.a(hVar);
                    c2747a.f113190l = 0;
                    c2747a.f113184e = 1;
                    if (hVar.F(aVarT9, c2747a) == objE) {
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
            this.f113179a = gVar;
            this.f113180b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ky1.c.a> hVar, tq.e eVar) {
            Object objA = this.f113179a.a(new a(hVar, this.f113180b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lky1/b$b;", "state", "Lk10/l;", "Lky1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<ky1.b.C2744b>, tq.e<? super k10.l<? extends ky1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113191e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113192f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ky1.b.Initialized O(r rVar, ky1.b.C2744b c2744b) {
            return new ky1.b.Initialized(rVar.setupContract.A0());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f113192f;
            uq.b.e();
            if (this.f113191e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final r rVar = r.this;
            return c0Var.d(new er.l() { // from class: ky1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.c.O(rVar, (b.C2744b) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<ky1.b.C2744b> c0Var, tq.e<? super k10.l<? extends ky1.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = r.this.new c(eVar);
            cVar.f113192f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky1/a$f;", "<unused var>", "Lky1/b$c;", "Loq/i0;", "<anonymous>", "(Lky1/a$f;Lky1/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ky1.a.f, ky1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113194e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113194e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ky1.a.h> bVarY1 = r.this.Y1();
                ky1.a.h.GoToFaq goToFaq = new ky1.a.h.GoToFaq(r.this.faqScreenMapper.b(i0.f148189a));
                this.f113194e = 1;
                if (bVarY1.F(goToFaq, this) == objE) {
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
        public final Object w(ky1.a.f fVar, ky1.b.Initialized initialized, tq.e<? super i0> eVar) {
            return r.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lky1/a$e;", "action", "Lky1/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lky1/a$e;Lky1/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ky1.a.GoToChangePin, ky1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113197f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ky1.a.GoToChangePin goToChangePin = (ky1.a.GoToChangePin) this.f113197f;
            Object objE = uq.b.e();
            int i15 = this.f113196e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ky1.a.h> bVarY1 = r.this.Y1();
                ky1.a.h.GoToChangePin goToChangePin2 = new ky1.a.h.GoToChangePin(new ChangePinData(r.this.setupContract.O(), goToChangePin.getCertType(), lw1.a.g.d.f120641b, lw1.a.AbstractC2944a.d.f120623b, goToChangePin.getResetPinAvailable()));
                this.f113197f = vq.j.a(goToChangePin);
                this.f113196e = 1;
                if (bVarY1.F(goToChangePin2, this) == objE) {
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
        public final Object w(ky1.a.GoToChangePin goToChangePin, ky1.b.Initialized initialized, tq.e<? super i0> eVar) {
            e eVar2 = r.this.new e(eVar);
            eVar2.f113197f = goToChangePin;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lky1/a$g;", "action", "Lky1/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lky1/a$g;Lky1/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ky1.a.GoToResetPin, ky1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113199e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113200f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ky1.a.GoToResetPin goToResetPin = (ky1.a.GoToResetPin) this.f113200f;
            Object objE = uq.b.e();
            int i15 = this.f113199e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ky1.a.h> bVarY1 = r.this.Y1();
                ky1.a.h.GoToResetPin goToResetPin2 = new ky1.a.h.GoToResetPin(new ResetPinData(r.this.setupContract.O(), goToResetPin.getCertType(), null, lw1.a.j.c.f120649b));
                this.f113200f = vq.j.a(goToResetPin);
                this.f113199e = 1;
                if (bVarY1.F(goToResetPin2, this) == objE) {
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
        public final Object w(ky1.a.GoToResetPin goToResetPin, ky1.b.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f113200f = goToResetPin;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lky1/a$c;", "action", "Lk10/c0;", "Lky1/b$c;", "state", "Lk10/l;", "Lky1/b;", "<anonymous>", "(Lky1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ky1.a.DisplayError, c0<ky1.b.Initialized>, tq.e<? super k10.l<? extends ky1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f113203f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f113204g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ky1.b.Error X(c0 c0Var, r rVar, ky1.a.DisplayError displayError, ky1.b.Initialized initialized) {
            return new ky1.b.Error(rVar.errorVMSFactory.a(rVar.errorMapper.b(new iy1.b.Params(displayError.getError(), new er.a() { // from class: ky1.u
                @Override // er.a
                public final Object a() {
                    return r.g.Y();
                }
            }, rVar.b9(ky1.a.C2742a.f113131a), rVar.b9(ky1.a.b.f113132a), new er.a() { // from class: ky1.v
                @Override // er.a
                public final Object a() {
                    return r.g.Z();
                }
            }))), ((ky1.b.Initialized) c0Var.a()).getELayerData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Y() {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Z() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ky1.a.DisplayError displayError = (ky1.a.DisplayError) this.f113203f;
            final c0 c0Var = (c0) this.f113204g;
            uq.b.e();
            if (this.f113202e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final r rVar = r.this;
            return c0Var.d(new er.l() { // from class: ky1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.g.X(c0Var, rVar, displayError, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(ky1.a.DisplayError displayError, c0<ky1.b.Initialized> c0Var, tq.e<? super k10.l<? extends ky1.b>> eVar) {
            g gVar = r.this.new g(eVar);
            gVar.f113203f = displayError;
            gVar.f113204g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky1/a$a;", "<unused var>", "Lky1/b;", "Loq/i0;", "<anonymous>", "(Lky1/a$a;Lky1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ky1.a.C2742a, ky1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113206e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113206e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ky1.a.h> bVarY1 = r.this.Y1();
                ky1.a.h.C2743a c2743a = ky1.a.h.C2743a.f113139a;
                this.f113206e = 1;
                if (bVarY1.F(c2743a, this) == objE) {
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
        public final Object w(ky1.a.C2742a c2742a, ky1.b bVar, tq.e<? super i0> eVar) {
            return r.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky1/a$b;", "<unused var>", "Lky1/b;", "Loq/i0;", "<anonymous>", "(Lky1/a$b;Lky1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ky1.a.b, ky1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113208e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113208e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ky1.a.h> bVarY1 = r.this.Y1();
                ky1.a.h.b bVar = ky1.a.h.b.f113140a;
                this.f113208e = 1;
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
        public final Object w(ky1.a.b bVar, ky1.b bVar2, tq.e<? super i0> eVar) {
            return r.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky1/a$d;", "<unused var>", "Lky1/b;", "Loq/i0;", "<anonymous>", "(Lky1/a$d;Lky1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ky1.a.d, ky1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113210e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113210e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ky1.a.h> bVarY1 = r.this.Y1();
                ky1.a.h.c cVar = ky1.a.h.c.f113141a;
                this.f113210e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(ky1.a.d dVar, ky1.b bVar, tq.e<? super i0> eVar) {
            return r.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lky1/a$f;", "<unused var>", "Lky1/b;", "Loq/i0;", "<anonymous>", "(Lky1/a$f;Lky1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ky1.a.f, ky1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113212e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113212e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ky1.a.h> bVarY1 = r.this.Y1();
                ky1.a.h.GoToFaq goToFaq = new ky1.a.h.GoToFaq(r.this.faqScreenMapper.b(i0.f148189a));
                this.f113212e = 1;
                if (bVarY1.F(goToFaq, this) == objE) {
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
        public final Object w(ky1.a.f fVar, ky1.b bVar, tq.e<? super i0> eVar) {
            return r.this.new k(eVar).J(i0.f148189a);
        }
    }

    public r(yy.a aVar, ly1.f fVar, jy1.a aVar2, iy1.b bVar, hb4.d dVar, ky1.d dVar2) {
        this.mapper = fVar;
        this.faqScreenMapper = aVar2;
        this.errorMapper = bVar;
        this.errorVMSFactory = dVar;
        this.setupContract = dVar2;
        ky1.b.C2744b c2744b = ky1.b.C2744b.f113149a;
        this.stateMachine = aVar.a(c2744b, new er.l() { // from class: ky1.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f113170a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), t9(c2744b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(r rVar, z zVar) {
        d dVar = rVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ky1.a.f.class), oVar, dVar);
        zVar.x(q0.c(ky1.a.GoToChangePin.class), oVar, rVar.new e(null));
        zVar.x(q0.c(ky1.a.GoToResetPin.class), oVar, rVar.new f(null));
        zVar.v(q0.c(ky1.a.DisplayError.class), oVar, rVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, z zVar) {
        h hVar = rVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ky1.a.C2742a.class), oVar, hVar);
        zVar.x(q0.c(ky1.a.b.class), oVar, rVar.new i(null));
        zVar.x(q0.c(ky1.a.d.class), oVar, rVar.new j(null));
        zVar.x(q0.c(ky1.a.f.class), oVar, rVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ky1.c.a t9(ky1.b state) {
        return this.mapper.b(new ly1.f.Params(state, b9(ky1.a.f.f113137a), b9(ky1.a.C2742a.f113131a), b9(ky1.a.b.f113132a), new er.p() { // from class: ky1.n
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return r.u9(this.f113167a, (yw1.a) obj, ((Boolean) obj2).booleanValue());
            }
        }, new er.l() { // from class: ky1.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.v9(this.f113168a, (yw1.a) obj);
            }
        }, new er.l() { // from class: ky1.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.w9(this.f113169a, (iy1.c) obj);
            }
        }, b9(ky1.a.d.f113134a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(r rVar, yw1.a aVar, boolean z15) {
        rVar.d9(new ky1.a.GoToChangePin(aVar, z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(r rVar, yw1.a aVar) {
        rVar.d9(new ky1.a.GoToResetPin(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(r rVar, iy1.c cVar) {
        rVar.d9(new ky1.a.DisplayError(cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(ky1.b.C2744b.class), new er.l() { // from class: ky1.k
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(this.f113164a, (z) obj);
            }
        });
        vVar.c(q0.c(ky1.b.Initialized.class), new er.l() { // from class: ky1.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.A9(this.f113165a, (z) obj);
            }
        });
        vVar.c(q0.c(ky1.b.class), new er.l() { // from class: ky1.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f113166a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(r rVar, z zVar) {
        zVar.A(rVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ky1.a.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ky1.b, ky1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ky1.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ky1.c.a aVar) {
        super.P5(aVar);
    }
}
