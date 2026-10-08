package r33;

import fr.q0;
import k23.ProductData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010/\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0014008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lr33/u;", "Ll00/g;", "Lr33/d;", "Lr33/a;", "Lr33/e;", "", "Lyy/a;", "stateMachineFactory", "Ls33/b;", "mapper", "Lcb4/j;", "dialogVMSFactory", "Lp23/b;", "newReportExitDialogMapper", "Lm23/h;", "validateProductDataUC", "Lr33/f;", "contract", "<init>", "(Lyy/a;Ls33/b;Lcb4/j;Lp23/b;Lm23/h;Lr33/f;)V", "Lr33/e$a;", "t9", "(Lr33/d;)Lr33/e$a;", "b", "Ls33/b;", "c", "Lcb4/j;", "d", "Lp23/b;", "e", "Lm23/h;", "Lr33/d$b;", "f", "Lr33/d$b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lr33/a$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<r33.d, r33.a> implements r33.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s33.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p23.b newReportExitDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m23.h validateProductDataUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final r33.d.Screen initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<r33.d, r33.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<r33.a.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<r33.e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<r33.e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f171413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f171414b;

        /* JADX INFO: renamed from: r33.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4353a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f171415a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f171416b;

            /* JADX INFO: renamed from: r33.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4354a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f171417d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f171418e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f171419f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f171421h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f171422j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f171423k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f171424l;

                public C4354a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f171417d = obj;
                    this.f171418e |= PKIFailureInfo.systemUnavail;
                    return C4353a.this.F(null, this);
                }
            }

            public C4353a(mu.h hVar, u uVar) {
                this.f171415a = hVar;
                this.f171416b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4354a c4354a;
                if (eVar instanceof C4354a) {
                    c4354a = (C4354a) eVar;
                    int i15 = c4354a.f171418e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4354a.f171418e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4354a = new C4354a(eVar);
                    }
                } else {
                    c4354a = new C4354a(eVar);
                }
                Object obj2 = c4354a.f171417d;
                Object objE = uq.b.e();
                int i16 = c4354a.f171418e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f171415a;
                    r33.e.Data dataT9 = this.f171416b.t9((r33.d) obj);
                    c4354a.f171419f = vq.j.a(obj);
                    c4354a.f171421h = vq.j.a(c4354a);
                    c4354a.f171422j = vq.j.a(obj);
                    c4354a.f171423k = vq.j.a(hVar);
                    c4354a.f171424l = 0;
                    c4354a.f171418e = 1;
                    if (hVar.F(dataT9, c4354a) == objE) {
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

        public a(mu.g gVar, u uVar) {
            this.f171413a = gVar;
            this.f171414b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super r33.e.Data> hVar, tq.e eVar) {
            Object objA = this.f171413a.a(new C4353a(hVar, this.f171414b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr33/a$c;", "action", "Lr33/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr33/a$c;Lr33/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<r33.a.c, r33.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171426f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r33.a.c cVar = (r33.a.c) this.f171426f;
            Object objE = uq.b.e();
            int i15 = this.f171425e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<r33.a.c> bVarY1 = u.this.Y1();
                this.f171426f = vq.j.a(cVar);
                this.f171425e = 1;
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
        public final Object w(r33.a.c cVar, r33.d dVar, tq.e<? super i0> eVar) {
            b bVar = u.this.new b(eVar);
            bVar.f171426f = cVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr33/a$e;", "action", "Lk10/c0;", "Lr33/d$b;", "state", "Lk10/l;", "Lr33/d;", "<anonymous>", "(Lr33/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<r33.a.OnChangeProductExpiryDate, k10.c0<r33.d.Screen>, tq.e<? super k10.l<? extends r33.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171429f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171430g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r33.d.Screen O(r33.a.OnChangeProductExpiryDate onChangeProductExpiryDate, r33.d.Screen screen) {
            return r33.d.Screen.c(screen, Form.b(screen.getForm(), null, null, null, null, onChangeProductExpiryDate.getDate(), hz.b.C2039b.f86846c, 15, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r33.a.OnChangeProductExpiryDate onChangeProductExpiryDate = (r33.a.OnChangeProductExpiryDate) this.f171429f;
            k10.c0 c0Var = (k10.c0) this.f171430g;
            uq.b.e();
            if (this.f171428e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r33.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.c.O(onChangeProductExpiryDate, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r33.a.OnChangeProductExpiryDate onChangeProductExpiryDate, k10.c0<r33.d.Screen> c0Var, tq.e<? super k10.l<? extends r33.d>> eVar) {
            c cVar = new c(eVar);
            cVar.f171429f = onChangeProductExpiryDate;
            cVar.f171430g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr33/a$f;", "action", "Lk10/c0;", "Lr33/d$b;", "state", "Lk10/l;", "Lr33/d;", "<anonymous>", "(Lr33/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<r33.a.OnChangeProductName, k10.c0<r33.d.Screen>, tq.e<? super k10.l<? extends r33.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171433g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r33.d.Screen O(r33.a.OnChangeProductName onChangeProductName, r33.d.Screen screen) {
            return r33.d.Screen.c(screen, Form.b(screen.getForm(), onChangeProductName.getName(), hz.b.C2039b.f86846c, null, null, null, null, 60, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r33.a.OnChangeProductName onChangeProductName = (r33.a.OnChangeProductName) this.f171432f;
            k10.c0 c0Var = (k10.c0) this.f171433g;
            uq.b.e();
            if (this.f171431e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r33.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.d.O(onChangeProductName, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r33.a.OnChangeProductName onChangeProductName, k10.c0<r33.d.Screen> c0Var, tq.e<? super k10.l<? extends r33.d>> eVar) {
            d dVar = new d(eVar);
            dVar.f171432f = onChangeProductName;
            dVar.f171433g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr33/a$d;", "action", "Lk10/c0;", "Lr33/d$b;", "state", "Lk10/l;", "Lr33/d;", "<anonymous>", "(Lr33/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<r33.a.OnChangeBatchNumber, k10.c0<r33.d.Screen>, tq.e<? super k10.l<? extends r33.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171434e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171435f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171436g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r33.d.Screen O(r33.a.OnChangeBatchNumber onChangeBatchNumber, r33.d.Screen screen) {
            return r33.d.Screen.c(screen, Form.b(screen.getForm(), null, null, onChangeBatchNumber.getNumber(), hz.b.C2039b.f86846c, null, null, 51, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r33.a.OnChangeBatchNumber onChangeBatchNumber = (r33.a.OnChangeBatchNumber) this.f171435f;
            k10.c0 c0Var = (k10.c0) this.f171436g;
            uq.b.e();
            if (this.f171434e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r33.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(onChangeBatchNumber, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r33.a.OnChangeBatchNumber onChangeBatchNumber, k10.c0<r33.d.Screen> c0Var, tq.e<? super k10.l<? extends r33.d>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f171435f = onChangeBatchNumber;
            eVar2.f171436g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr33/a$a;", "<unused var>", "Lk10/c0;", "Lr33/d$b;", "state", "Lk10/l;", "Lr33/d;", "<anonymous>", "(Lr33/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<r33.a.C4350a, k10.c0<r33.d.Screen>, tq.e<? super k10.l<? extends r33.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f171437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f171438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f171439g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f171440h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f171441j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ r33.f f171443l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(r33.f fVar, tq.e<? super f> eVar) {
            super(3, eVar);
            this.f171443l = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r33.d.Screen V(r33.b bVar, Form form, hz.b bVar2, hz.b bVar3, hz.b bVar4, r33.d.Screen screen) {
            return screen.b(Form.b(form, null, bVar2, null, bVar3, null, bVar4, 21, null), new d60.j<>(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r33.d.Screen X(Form form, r33.d.Screen screen) {
            return screen.b(form, null);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0107  */
        /* JADX WARN: Code duplicated, block: B:26:0x0117  */
        /* JADX WARN: Code duplicated, block: B:28:0x011b  */
        /* JADX WARN: Code duplicated, block: B:30:0x0121  */
        /* JADX WARN: Code duplicated, block: B:31:0x0124  */
        /* JADX WARN: Code duplicated, block: B:33:0x012a  */
        /* JADX WARN: Code duplicated, block: B:34:0x012d  */
        /* JADX WARN: Code duplicated, block: B:36:0x0131  */
        /* JADX WARN: Code duplicated, block: B:38:0x013b  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Form formB;
            Object objF;
            Object objF2;
            Form form;
            hz.b bVar;
            hz.b bVarA;
            Object objF3;
            final hz.b bVar2;
            final Form form2;
            final hz.b bVar3;
            final hz.b bVarA2;
            r33.b bVar4;
            final r33.b bVar5;
            k10.c0 c0Var = (k10.c0) this.f171441j;
            Object objE = uq.b.e();
            int i15 = this.f171440h;
            if (i15 == 0) {
                oq.u.b(obj);
                formB = Form.b(((r33.d.Screen) c0Var.a()).getForm(), dz.e.e(((r33.d.Screen) c0Var.a()).getForm().getProductName()), null, dz.e.e(((r33.d.Screen) c0Var.a()).getForm().getBatchNumber()), null, dz.e.e(((r33.d.Screen) c0Var.a()).getForm().getProductExpiryDate()), null, 42, null);
                m23.h hVar = u.this.validateProductDataUC;
                m23.h.b.ProductName productName = new m23.h.b.ProductName(formB.getProductName());
                this.f171441j = c0Var;
                this.f171437e = formB;
                this.f171440h = 1;
                objF = hVar.f(productName, this);
                if (objF != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                formB = (Form) this.f171437e;
                oq.u.b(obj);
                objF = obj;
            } else {
                if (i15 == 2) {
                    bVar = (hz.b) this.f171438f;
                    Form form3 = (Form) this.f171437e;
                    oq.u.b(obj);
                    form = form3;
                    objF2 = obj;
                    bVarA = ((hz.g) objF2).a();
                    m23.h hVar2 = u.this.validateProductDataUC;
                    m23.h.b.Date date = new m23.h.b.Date(form.getProductExpiryDate());
                    this.f171441j = c0Var;
                    this.f171437e = form;
                    this.f171438f = bVar;
                    this.f171439g = bVarA;
                    this.f171440h = 3;
                    objF3 = hVar2.f(date, this);
                    if (objF3 != objE) {
                        bVar2 = bVarA;
                        form2 = form;
                    }
                    return objE;
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hz.b bVar6 = (hz.b) this.f171439g;
                bVar = (hz.b) this.f171438f;
                Form form4 = (Form) this.f171437e;
                oq.u.b(obj);
                bVar2 = bVar6;
                form2 = form4;
                objF3 = obj;
            }
            bVar3 = bVar;
            bVarA2 = ((hz.g) objF3).a();
            if (!bVar3.a()) {
                bVar4 = r33.b.PRODUCT_NAME;
            } else if (!bVar2.a()) {
                bVar4 = r33.b.BATCH_NUMBER;
            } else if (bVarA2.a()) {
                bVar4 = null;
            } else {
                bVar4 = r33.b.EXPIRY_DATE;
            }
            bVar5 = bVar4;
            if (bVar5 != null) {
                return c0Var.b(new er.l() { // from class: r33.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.f.V(bVar5, form2, bVar3, bVar2, bVarA2, (d.Screen) obj2);
                    }
                });
            }
            this.f171443l.u3(new ProductData(form2.getProductName(), form2.getBatchNumber(), form2.getProductExpiryDate()));
            u.this.d9(r33.a.c.C4352c.f171356a);
            return c0Var.b(new er.l() { // from class: r33.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.X(form2, (d.Screen) obj2);
                }
            });
            hz.b bVarA3 = ((hz.g) objF).a();
            m23.h hVar3 = u.this.validateProductDataUC;
            m23.h.b.BatchNumber batchNumber = new m23.h.b.BatchNumber(formB.getBatchNumber());
            this.f171441j = c0Var;
            this.f171437e = formB;
            this.f171438f = bVarA3;
            this.f171440h = 2;
            objF2 = hVar3.f(batchNumber, this);
            if (objF2 != objE) {
                form = formB;
                bVar = bVarA3;
                bVarA = ((hz.g) objF2).a();
                m23.h hVar4 = u.this.validateProductDataUC;
                m23.h.b.Date date2 = new m23.h.b.Date(form.getProductExpiryDate());
                this.f171441j = c0Var;
                this.f171437e = form;
                this.f171438f = bVar;
                this.f171439g = bVarA;
                this.f171440h = 3;
                objF3 = hVar4.f(date2, this);
                if (objF3 != objE) {
                    bVar2 = bVarA;
                    form2 = form;
                    bVar3 = bVar;
                    bVarA2 = ((hz.g) objF3).a();
                    if (!bVar3.a()) {
                        bVar4 = r33.b.PRODUCT_NAME;
                    } else if (!bVar2.a()) {
                        bVar4 = r33.b.BATCH_NUMBER;
                    } else if (bVarA2.a()) {
                        bVar4 = r33.b.EXPIRY_DATE;
                    } else {
                        bVar4 = null;
                    }
                    bVar5 = bVar4;
                    if (bVar5 != null) {
                        return c0Var.b(new er.l() { // from class: r33.y
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return u.f.V(bVar5, form2, bVar3, bVar2, bVarA2, (d.Screen) obj2);
                            }
                        });
                    }
                    this.f171443l.u3(new ProductData(form2.getProductName(), form2.getBatchNumber(), form2.getProductExpiryDate()));
                    u.this.d9(r33.a.c.C4352c.f171356a);
                    return c0Var.b(new er.l() { // from class: r33.z
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.f.X(form2, (d.Screen) obj2);
                        }
                    });
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(r33.a.C4350a c4350a, k10.c0<r33.d.Screen> c0Var, tq.e<? super k10.l<? extends r33.d>> eVar) {
            f fVar = u.this.new f(this.f171443l, eVar);
            fVar.f171441j = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr33/a$g;", "<unused var>", "Lk10/c0;", "Lr33/d$b;", "state", "Lk10/l;", "Lr33/d;", "<anonymous>", "(Lr33/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<r33.a.g, k10.c0<r33.d.Screen>, tq.e<? super k10.l<? extends r33.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171445f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r33.d.Dialog O(u uVar, r33.d.Screen screen) {
            return new r33.d.Dialog(screen.getForm(), uVar.dialogVMSFactory.a(uVar.newReportExitDialogMapper.b(new p23.b.Params(uVar.b9(r33.a.c.b.f171355a), uVar.b9(r33.a.b.f171353a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f171445f;
            uq.b.e();
            if (this.f171444e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final u uVar = u.this;
            return c0Var.d(new er.l() { // from class: r33.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O(uVar, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r33.a.g gVar, k10.c0<r33.d.Screen> c0Var, tq.e<? super k10.l<? extends r33.d>> eVar) {
            g gVar2 = u.this.new g(eVar);
            gVar2.f171445f = c0Var;
            return gVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr33/a$b;", "<unused var>", "Lk10/c0;", "Lr33/d$a;", "state", "Lk10/l;", "Lr33/d;", "<anonymous>", "(Lr33/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<r33.a.b, k10.c0<r33.d.Dialog>, tq.e<? super k10.l<? extends r33.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171448f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r33.d.Screen O(r33.d.Dialog dialog) {
            return new r33.d.Screen(dialog.getForm(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f171448f;
            uq.b.e();
            if (this.f171447e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: r33.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O((d.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r33.a.b bVar, k10.c0<r33.d.Dialog> c0Var, tq.e<? super k10.l<? extends r33.d>> eVar) {
            h hVar = new h(eVar);
            hVar.f171448f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, s33.b bVar, cb4.j jVar, p23.b bVar2, m23.h hVar, final r33.f fVar) {
        String expiryDate;
        String batchNumber;
        String name;
        this.mapper = bVar;
        this.dialogVMSFactory = jVar;
        this.newReportExitDialogMapper = bVar2;
        this.validateProductDataUC = hVar;
        ProductData productDataG0 = fVar.G0();
        r33.d.Screen screen = new r33.d.Screen(new Form((productDataG0 == null || (name = productDataG0.getName()) == null) ? "" : name, null, (productDataG0 == null || (batchNumber = productDataG0.getBatchNumber()) == null) ? "" : batchNumber, null, (productDataG0 == null || (expiryDate = productDataG0.getExpiryDate()) == null) ? "" : expiryDate, null, 42, null), null, 2, null);
        this.initialState = screen;
        this.stateMachine = aVar.a(screen, new er.l() { // from class: r33.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.y9(this.f171403a, fVar, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), t9(screen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(u uVar, r33.f fVar, k10.z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(r33.a.OnChangeProductExpiryDate.class), oVar, cVar);
        zVar.v(q0.c(r33.a.OnChangeProductName.class), oVar, new d(null));
        zVar.v(q0.c(r33.a.OnChangeBatchNumber.class), oVar, new e(null));
        zVar.v(q0.c(r33.a.C4350a.class), oVar, uVar.new f(fVar, null));
        zVar.v(q0.c(r33.a.g.class), oVar, uVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(k10.z zVar) {
        h hVar = new h(null);
        zVar.v(q0.c(r33.a.b.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r33.e.Data t9(r33.d dVar) {
        return this.mapper.b(new s33.b.Params(dVar, b9(r33.a.C4350a.f171352a), b9(r33.a.c.C4351a.f171354a), b9(r33.a.g.f171360a), new er.l() { // from class: r33.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.u9(this.f171397a, (String) obj);
            }
        }, new er.l() { // from class: r33.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.v9(this.f171398a, (String) obj);
            }
        }, new er.l() { // from class: r33.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.w9(this.f171399a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(u uVar, String str) {
        uVar.d9(new r33.a.OnChangeBatchNumber(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(u uVar, String str) {
        uVar.d9(new r33.a.OnChangeProductName(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(u uVar, String str) {
        uVar.d9(new r33.a.OnChangeProductExpiryDate(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final u uVar, final r33.f fVar, k10.v vVar) {
        vVar.c(q0.c(r33.d.class), new er.l() { // from class: r33.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.z9(this.f171400a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(r33.d.Screen.class), new er.l() { // from class: r33.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.A9(this.f171401a, fVar, (k10.z) obj);
            }
        });
        vVar.c(q0.c(r33.d.Dialog.class), new er.l() { // from class: r33.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.B9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(u uVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        zVar.x(q0.c(r33.a.c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<r33.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<r33.d, r33.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<r33.e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(r33.f fVar) {
        super.P5(fVar);
    }
}
