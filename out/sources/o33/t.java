package o33;

import fr.q0;
import java.util.Set;
import k23.PlaceOfPurchaseData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030)8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010;\u001a\b\u0012\u0004\u0012\u00020\u0016068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lo33/t;", "Ll00/g;", "Lo33/c;", "Lo33/a;", "Lo33/d;", "", "Lyy/a;", "stateMachineFactory", "Lq33/e;", "mapper", "Lm23/g;", "validatePlaceOfPurchaseUC", "Lcb4/j;", "dialogVMSFactory", "Lp23/b;", "newReportExitDialogMapper", "Lmx/c;", "labelProvider", "Lo33/e;", "contract", "<init>", "(Lyy/a;Lq33/e;Lm23/g;Lcb4/j;Lp23/b;Lmx/c;Lo33/e;)V", "Lo33/d$a;", "v9", "(Lo33/c;)Lo33/d$a;", "b", "Lq33/e;", "c", "Lm23/g;", "d", "Lcb4/j;", "e", "Lp23/b;", "f", "Lmx/c;", "g", "Lo33/e;", "Lo33/c$c;", "h", "Lo33/c$c;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lo33/a$b;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<o33.c, o33.a> implements o33.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q33.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m23.g validatePlaceOfPurchaseUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p23.b newReportExitDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final o33.e contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final o33.c.Screen initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<o33.c, o33.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<o33.a.b> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<o33.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<o33.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f142117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f142118b;

        /* JADX INFO: renamed from: o33.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3505a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f142119a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f142120b;

            /* JADX INFO: renamed from: o33.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3506a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f142121d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f142122e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f142123f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f142125h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f142126j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f142127k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f142128l;

                public C3506a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f142121d = obj;
                    this.f142122e |= PKIFailureInfo.systemUnavail;
                    return C3505a.this.F(null, this);
                }
            }

            public C3505a(mu.h hVar, t tVar) {
                this.f142119a = hVar;
                this.f142120b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3506a c3506a;
                if (eVar instanceof C3506a) {
                    c3506a = (C3506a) eVar;
                    int i15 = c3506a.f142122e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3506a.f142122e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3506a = new C3506a(eVar);
                    }
                } else {
                    c3506a = new C3506a(eVar);
                }
                Object obj2 = c3506a.f142121d;
                Object objE = uq.b.e();
                int i16 = c3506a.f142122e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f142119a;
                    o33.d.Data dataV9 = this.f142120b.v9((o33.c) obj);
                    c3506a.f142123f = vq.j.a(obj);
                    c3506a.f142125h = vq.j.a(c3506a);
                    c3506a.f142126j = vq.j.a(obj);
                    c3506a.f142127k = vq.j.a(hVar);
                    c3506a.f142128l = 0;
                    c3506a.f142122e = 1;
                    if (hVar.F(dataV9, c3506a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f142117a = gVar;
            this.f142118b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super o33.d.Data> hVar, tq.e eVar) {
            Object objA = this.f142117a.a(new C3505a(hVar, this.f142118b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo33/a$b;", "action", "Lo33/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo33/a$b;Lo33/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<o33.a.b, o33.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142130f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o33.a.b bVar = (o33.a.b) this.f142130f;
            Object objE = uq.b.e();
            int i15 = this.f142129e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<o33.a.b> bVarY1 = t.this.Y1();
                this.f142130f = vq.j.a(bVar);
                this.f142129e = 1;
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
        public final Object w(o33.a.b bVar, o33.c cVar, tq.e<? super i0> eVar) {
            b bVar2 = t.this.new b(eVar);
            bVar2.f142130f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo33/a$e;", "action", "Lk10/c0;", "Lo33/c$c;", "state", "Lk10/l;", "Lo33/c;", "<anonymous>", "(Lo33/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<o33.a.OnWebAddressAnswerChanged, k10.c0<o33.c.Screen>, tq.e<? super k10.l<? extends o33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f142134g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o33.c.Screen O(o33.a.OnWebAddressAnswerChanged onWebAddressAnswerChanged, o33.c.Screen screen) {
            return screen.b(Form.b(screen.getForm(), onWebAddressAnswerChanged.getAnswer(), hz.b.C2039b.f86846c, null, null, null, null, null, 60, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o33.a.OnWebAddressAnswerChanged onWebAddressAnswerChanged = (o33.a.OnWebAddressAnswerChanged) this.f142133f;
            k10.c0 c0Var = (k10.c0) this.f142134g;
            uq.b.e();
            if (this.f142132e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: o33.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.c.O(onWebAddressAnswerChanged, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o33.a.OnWebAddressAnswerChanged onWebAddressAnswerChanged, k10.c0<o33.c.Screen> c0Var, tq.e<? super k10.l<? extends o33.c>> eVar) {
            c cVar = new c(eVar);
            cVar.f142133f = onWebAddressAnswerChanged;
            cVar.f142134g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo33/a$f;", "action", "Lk10/c0;", "Lo33/c$c;", "state", "Lk10/l;", "Lo33/c;", "<anonymous>", "(Lo33/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<o33.a.OnWebAddressChanged, k10.c0<o33.c.Screen>, tq.e<? super k10.l<? extends o33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f142137g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o33.c.Screen O(o33.a.OnWebAddressChanged onWebAddressChanged, o33.c.Screen screen) {
            return screen.b(Form.b(screen.getForm(), null, null, onWebAddressChanged.getWebAddress(), hz.b.C2039b.f86846c, null, null, null, 51, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o33.a.OnWebAddressChanged onWebAddressChanged = (o33.a.OnWebAddressChanged) this.f142136f;
            k10.c0 c0Var = (k10.c0) this.f142137g;
            uq.b.e();
            if (this.f142135e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: o33.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d.O(onWebAddressChanged, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o33.a.OnWebAddressChanged onWebAddressChanged, k10.c0<o33.c.Screen> c0Var, tq.e<? super k10.l<? extends o33.c>> eVar) {
            d dVar = new d(eVar);
            dVar.f142136f = onWebAddressChanged;
            dVar.f142137g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo33/a$c;", "action", "Lk10/c0;", "Lo33/c$c;", "state", "Lk10/l;", "Lo33/c;", "<anonymous>", "(Lo33/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<o33.a.OnBusinessChanged, k10.c0<o33.c.Screen>, tq.e<? super k10.l<? extends o33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f142140g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o33.c.Screen O(o33.a.OnBusinessChanged onBusinessChanged, o33.c.Screen screen) {
            Form form = screen.getForm();
            Set setJ1 = pq.v.j1(screen.getForm().c());
            if (onBusinessChanged.getValue()) {
                setJ1.add(onBusinessChanged.getSelection());
            } else {
                setJ1.remove(onBusinessChanged.getSelection());
            }
            i0 i0Var = i0.f148189a;
            return screen.b(Form.b(form, null, null, null, null, setJ1, hz.b.C2039b.f86846c, null, 15, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o33.a.OnBusinessChanged onBusinessChanged = (o33.a.OnBusinessChanged) this.f142139f;
            k10.c0 c0Var = (k10.c0) this.f142140g;
            uq.b.e();
            if (this.f142138e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: o33.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(onBusinessChanged, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o33.a.OnBusinessChanged onBusinessChanged, k10.c0<o33.c.Screen> c0Var, tq.e<? super k10.l<? extends o33.c>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f142139f = onBusinessChanged;
            eVar2.f142140g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo33/a$d;", "<unused var>", "Lk10/c0;", "Lo33/c$c;", "state", "Lk10/l;", "Lo33/c;", "<anonymous>", "(Lo33/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<o33.a.d, k10.c0<o33.c.Screen>, tq.e<? super k10.l<? extends o33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f142141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f142142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f142143g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f142144h;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o33.c.Screen X(Form form, t tVar, o33.c.Screen screen) {
            return screen.b(Form.b(form, null, new hz.b.Invalid(tVar.labelProvider.c(h23.b.f80142h)), null, null, null, null, new d60.j(o33.c.b.WEB_ADDRESS_ANSWER), 61, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o33.c.Screen Y(Form form, hz.b bVar, o33.c.Screen screen) {
            return screen.b(Form.b(form, null, null, null, bVar, null, null, new d60.j(o33.c.b.WEB_ADDRESS_ANSWER), 55, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o33.c.Screen Z(Form form, t tVar, o33.c.Screen screen) {
            return screen.b(Form.b(form, null, null, null, null, null, new hz.b.Invalid(tVar.labelProvider.c(h23.b.f80139g)), new d60.j(o33.c.b.BUSINESS_DETAILS), 31, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Form formB;
            hz.b.Companion companion;
            k10.c0 c0Var = (k10.c0) this.f142144h;
            Object objE = uq.b.e();
            int i15 = this.f142143g;
            if (i15 == 0) {
                oq.u.b(obj);
                formB = Form.b(((o33.c.Screen) c0Var.a()).getForm(), null, null, dz.e.e(((o33.c.Screen) c0Var.a()).getForm().getWebAddress()), null, null, null, null, 123, null);
                if (formB.getWebAddressAnswer() == null) {
                    final t tVar = t.this;
                    return c0Var.b(new er.l() { // from class: o33.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.f.X(formB, tVar, (c.Screen) obj2);
                        }
                    });
                }
                hz.b.Companion companion2 = hz.b.INSTANCE;
                m23.g gVar = t.this.validatePlaceOfPurchaseUC;
                m23.g.Params params = new m23.g.Params(formB.getWebAddress(), formB.getWebAddressAnswer());
                this.f142144h = c0Var;
                this.f142141e = formB;
                this.f142142f = companion2;
                this.f142143g = 1;
                Object objD = gVar.d(params, this);
                if (objD == objE) {
                    return objE;
                }
                companion = companion2;
                obj = objD;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (hz.b.Companion) this.f142142f;
                formB = (Form) this.f142141e;
                oq.u.b(obj);
            }
            final hz.b bVarA = companion.a((hz.g) obj);
            if (bVarA instanceof hz.b.Invalid) {
                return c0Var.b(new er.l() { // from class: o33.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.f.Y(formB, bVarA, (c.Screen) obj2);
                    }
                });
            }
            if (((o33.c.Screen) c0Var.a()).getForm().c().isEmpty()) {
                final t tVar2 = t.this;
                return c0Var.b(new er.l() { // from class: o33.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.f.Z(formB, tVar2, (c.Screen) obj2);
                    }
                });
            }
            t.this.contract.T5(new PlaceOfPurchaseData(formB.getWebAddressAnswer(), ((o33.c.Screen) c0Var.a()).getForm().getWebAddress(), ((o33.c.Screen) c0Var.a()).getForm().c()));
            Set<k23.c> setC = ((o33.c.Screen) c0Var.a()).getForm().c();
            k23.c cVar = k23.c.SELLER;
            if (setC.contains(cVar)) {
                t.this.d9(new o33.a.b.GoToNextScreen(cVar));
            } else {
                t.this.d9(new o33.a.b.GoToNextScreen(k23.c.SUPPLIER));
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(o33.a.d dVar, k10.c0<o33.c.Screen> c0Var, tq.e<? super k10.l<? extends o33.c>> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f142144h = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo33/a$g;", "<unused var>", "Lk10/c0;", "Lo33/c$c;", "state", "Lk10/l;", "Lo33/c;", "<anonymous>", "(Lo33/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<o33.a.g, k10.c0<o33.c.Screen>, tq.e<? super k10.l<? extends o33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142147f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o33.c.Dialog O(t tVar, o33.c.Screen screen) {
            return new o33.c.Dialog(screen.getForm(), tVar.dialogVMSFactory.a(tVar.newReportExitDialogMapper.b(new p23.b.Params(tVar.b9(o33.a.b.C3503b.f142059a), tVar.b9(o33.a.C3501a.f142057a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f142147f;
            uq.b.e();
            if (this.f142146e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final t tVar = t.this;
            return c0Var.d(new er.l() { // from class: o33.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g.O(tVar, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o33.a.g gVar, k10.c0<o33.c.Screen> c0Var, tq.e<? super k10.l<? extends o33.c>> eVar) {
            g gVar2 = t.this.new g(eVar);
            gVar2.f142147f = c0Var;
            return gVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo33/a$a;", "<unused var>", "Lk10/c0;", "Lo33/c$a;", "state", "Lk10/l;", "Lo33/c;", "<anonymous>", "(Lo33/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<o33.a.C3501a, k10.c0<o33.c.Dialog>, tq.e<? super k10.l<? extends o33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142150f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o33.c.Screen O(o33.c.Dialog dialog) {
            return new o33.c.Screen(dialog.getForm());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f142150f;
            uq.b.e();
            if (this.f142149e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: o33.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.h.O((c.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o33.a.C3501a c3501a, k10.c0<o33.c.Dialog> c0Var, tq.e<? super k10.l<? extends o33.c>> eVar) {
            h hVar = new h(eVar);
            hVar.f142150f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, q33.e eVar, m23.g gVar, cb4.j jVar, p23.b bVar, mx.c cVar, o33.e eVar2) {
        this.mapper = eVar;
        this.validatePlaceOfPurchaseUC = gVar;
        this.dialogVMSFactory = jVar;
        this.newReportExitDialogMapper = bVar;
        this.labelProvider = cVar;
        this.contract = eVar2;
        PlaceOfPurchaseData placeOfPurchaseDataN = eVar2.N();
        o33.c.Screen screen = placeOfPurchaseDataN == null ? new o33.c.Screen(new Form(null, null, null, null, null, null, null, CertificateBody.profileType, null)) : new o33.c.Screen(new Form(placeOfPurchaseDataN.getWebAddressAnswer(), null, placeOfPurchaseDataN.getWebAddress(), null, placeOfPurchaseDataN.a(), null, null, 106, null));
        this.initialState = screen;
        this.stateMachine = aVar.a(screen, new er.l() { // from class: o33.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.A9(this.f142106a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), v9(screen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(o33.c.class), new er.l() { // from class: o33.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.B9(this.f142104a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o33.c.Screen.class), new er.l() { // from class: o33.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.C9(this.f142105a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o33.c.Dialog.class), new er.l() { // from class: o33.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.D9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        zVar.x(q0.c(o33.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(t tVar, k10.z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(o33.a.OnWebAddressAnswerChanged.class), oVar, cVar);
        zVar.v(q0.c(o33.a.OnWebAddressChanged.class), oVar, new d(null));
        zVar.v(q0.c(o33.a.OnBusinessChanged.class), oVar, new e(null));
        zVar.v(q0.c(o33.a.d.class), oVar, tVar.new f(null));
        zVar.v(q0.c(o33.a.g.class), oVar, tVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(k10.z zVar) {
        h hVar = new h(null);
        zVar.v(q0.c(o33.a.C3501a.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o33.d.Data v9(o33.c cVar) {
        return this.mapper.b(new q33.e.Params(cVar, b9(o33.a.d.f142063a), new er.l() { // from class: o33.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.w9(this.f142101a, (k23.o) obj);
            }
        }, new er.l() { // from class: o33.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.x9(this.f142102a, (String) obj);
            }
        }, new er.p() { // from class: o33.o
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return t.y9(this.f142103a, (k23.c) obj, ((Boolean) obj2).booleanValue());
            }
        }, b9(o33.a.b.C3502a.f142058a), b9(o33.a.g.f142066a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(t tVar, k23.o oVar) {
        tVar.d9(new o33.a.OnWebAddressAnswerChanged(oVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(t tVar, String str) {
        tVar.d9(new o33.a.OnWebAddressChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(t tVar, k23.c cVar, boolean z15) {
        tVar.d9(new o33.a.OnBusinessChanged(cVar, z15));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<o33.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<o33.c, o33.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<o33.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(o33.e eVar) {
        super.P5(eVar);
    }
}
