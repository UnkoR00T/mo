package ib3;

import ba3.ContactDetails;
import fr.q0;
import java.util.Iterator;
import java.util.Map;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import xw.PhoneNumber;
import z93.TravelContactDetails;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030)8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lib3/a0;", "Ll00/g;", "Lib3/l;", "", "Lib3/m;", "Lyy/a;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Lx93/a;", "travelAbroadCitizenInteractor", "Lkb3/e;", "mapper", "Lca3/a;", "validateContactDetailsUC", "Ljb3/a;", "contract", "<init>", "(Lyy/a;Lac4/a;Lx93/a;Lkb3/e;Lca3/a;Ljb3/a;)V", "state", "Lib3/m$a;", "t9", "(Lib3/l;)Lib3/m$a;", "b", "Lac4/a;", "c", "Lx93/a;", "d", "Lkb3/e;", "e", "Lca3/a;", "f", "Lib3/l;", "initialState", "Lxw/b;", "Lib3/c;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 extends l00.g<l, Object> implements m, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x93.a travelAbroadCitizenInteractor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final kb3.e mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ca3.a validateContactDetailsUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ib3.c> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<l, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<m.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<m.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f90736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f90737b;

        /* JADX INFO: renamed from: ib3.a0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2151a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f90738a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f90739b;

            /* JADX INFO: renamed from: ib3.a0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2152a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f90740d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f90741e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f90742f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f90744h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f90745j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f90746k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f90747l;

                public C2152a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f90740d = obj;
                    this.f90741e |= PKIFailureInfo.systemUnavail;
                    return C2151a.this.F(null, this);
                }
            }

            public C2151a(mu.h hVar, a0 a0Var) {
                this.f90738a = hVar;
                this.f90739b = a0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2152a c2152a;
                if (eVar instanceof C2152a) {
                    c2152a = (C2152a) eVar;
                    int i15 = c2152a.f90741e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2152a.f90741e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2152a = new C2152a(eVar);
                    }
                } else {
                    c2152a = new C2152a(eVar);
                }
                Object obj2 = c2152a.f90740d;
                Object objE = uq.b.e();
                int i16 = c2152a.f90741e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f90738a;
                    m.a aVarT9 = this.f90739b.t9((l) obj);
                    c2152a.f90742f = vq.j.a(obj);
                    c2152a.f90744h = vq.j.a(c2152a);
                    c2152a.f90745j = vq.j.a(obj);
                    c2152a.f90746k = vq.j.a(hVar);
                    c2152a.f90747l = 0;
                    c2152a.f90741e = 1;
                    if (hVar.F(aVarT9, c2152a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, a0 a0Var) {
            this.f90736a = gVar;
            this.f90737b = a0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super m.a> hVar, tq.e eVar) {
            Object objA = this.f90736a.a(new C2151a(hVar, this.f90737b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lib3/d;", "<unused var>", "Lib3/l;", "Loq/i0;", "<anonymous>", "(Lib3/d;Lib3/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ib3.d, l, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90748e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f90748e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                ib3.c.a aVar = ib3.c.a.f90785a;
                this.f90748e = 1;
                if (a0Var.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ib3.d dVar, l lVar, tq.e<? super oq.i0> eVar) {
            return a0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lib3/e;", "<unused var>", "Lib3/l;", "Loq/i0;", "<anonymous>", "(Lib3/e;Lib3/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ib3.e, l, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90750e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f90750e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                ib3.c.b bVar = ib3.c.b.f90786a;
                this.f90750e = 1;
                if (a0Var.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ib3.e eVar, l lVar, tq.e<? super oq.i0> eVar2) {
            return a0.this.new c(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lib3/l$a;", "state", "Lk10/l;", "Lib3/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<l.a>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90753f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lib3/l$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends l.Initialized>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f90755e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a0 f90756f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<l.a> f90757g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, k10.c0<l.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f90756f = a0Var;
                this.f90757g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final l.Initialized X(l.a aVar) {
                return new l.Initialized(null, null, null, null, 15, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final l.Initialized Y(TravelContactDetails travelContactDetails, l.a aVar) {
                iy.b0 registeredEmail = travelContactDetails.getRegisteredEmail();
                String strE = registeredEmail != null ? iy.c0.e(registeredEmail) : null;
                if (strE == null) {
                    strE = "";
                }
                l.Initialized.EmailField emailField = new l.Initialized.EmailField(strE, travelContactDetails.getRegisteredEmail() != null, null, 4, null);
                PhoneNumber registeredPhoneNumber = travelContactDetails.getRegisteredPhoneNumber();
                if (registeredPhoneNumber == null) {
                    registeredPhoneNumber = PhoneNumber.INSTANCE.a();
                }
                return new l.Initialized(emailField, new l.Initialized.PhoneNumberField(registeredPhoneNumber, travelContactDetails.getRegisteredPhoneNumber() != null, null, null, 12, null), null, null, 12, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f90755e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    x93.a aVar = this.f90756f.travelAbroadCitizenInteractor;
                    this.f90755e = 1;
                    obj = aVar.a(this);
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
                k10.c0<l.a> c0Var = this.f90757g;
                if (iVar instanceof dx.i.Left) {
                    return c0Var.d(new er.l() { // from class: ib3.b0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return a0.d.a.X((l.a) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final TravelContactDetails travelContactDetails = (TravelContactDetails) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ib3.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.d.a.Y(travelContactDetails, (l.a) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f90756f, this.f90757g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<l.Initialized>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f90753f;
            Object objE = uq.b.e();
            int i15 = this.f90752e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = a0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(a0.this, c0Var, null);
            this.f90753f = vq.j.a(c0Var);
            this.f90752e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<l.a> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = a0.this.new d(eVar);
            dVar.f90753f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lib3/g;", "action", "Lk10/c0;", "Lib3/l$b;", "state", "Lk10/l;", "Lib3/l;", "<anonymous>", "(Lib3/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnEmailChecked, k10.c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90759f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90760g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized O(OnEmailChecked onEmailChecked, l.Initialized initialized) {
            return l.Initialized.b(initialized, l.Initialized.EmailField.b(initialized.getEmail(), null, onEmailChecked.getChecked(), null, 5, null), null, hz.b.d.f86848c, null, 10, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnEmailChecked onEmailChecked = (OnEmailChecked) this.f90759f;
            k10.c0 c0Var = (k10.c0) this.f90760g;
            uq.b.e();
            if (this.f90758e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ib3.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.e.O(onEmailChecked, (l.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnEmailChecked onEmailChecked, k10.c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f90759f = onEmailChecked;
            eVar2.f90760g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lib3/f;", "action", "Lk10/c0;", "Lib3/l$b;", "state", "Lk10/l;", "Lib3/l;", "<anonymous>", "(Lib3/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OnEmailChanged, k10.c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90763g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized O(OnEmailChanged onEmailChanged, l.Initialized initialized) {
            return l.Initialized.b(initialized, l.Initialized.EmailField.b(initialized.getEmail(), onEmailChanged.getEmail(), false, hz.b.d.f86848c, 2, null), null, null, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnEmailChanged onEmailChanged = (OnEmailChanged) this.f90762f;
            k10.c0 c0Var = (k10.c0) this.f90763g;
            uq.b.e();
            if (this.f90761e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ib3.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.f.O(onEmailChanged, (l.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnEmailChanged onEmailChanged, k10.c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            f fVar = new f(eVar);
            fVar.f90762f = onEmailChanged;
            fVar.f90763g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lib3/j;", "action", "Lk10/c0;", "Lib3/l$b;", "state", "Lk10/l;", "Lib3/l;", "<anonymous>", "(Lib3/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OnPhoneNumberChecked, k10.c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90766g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized O(OnPhoneNumberChecked onPhoneNumberChecked, l.Initialized initialized) {
            return l.Initialized.b(initialized, null, l.Initialized.PhoneNumberField.b(initialized.getPhoneNumber(), null, onPhoneNumberChecked.getChecked(), null, null, 13, null), hz.b.d.f86848c, null, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPhoneNumberChecked onPhoneNumberChecked = (OnPhoneNumberChecked) this.f90765f;
            k10.c0 c0Var = (k10.c0) this.f90766g;
            uq.b.e();
            if (this.f90764e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ib3.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.g.O(onPhoneNumberChecked, (l.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPhoneNumberChecked onPhoneNumberChecked, k10.c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            g gVar = new g(eVar);
            gVar.f90765f = onPhoneNumberChecked;
            gVar.f90766g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lib3/i;", "action", "Lk10/c0;", "Lib3/l$b;", "state", "Lk10/l;", "Lib3/l;", "<anonymous>", "(Lib3/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<OnPhoneNumberChanged, k10.c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90768f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f90769g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized O(OnPhoneNumberChanged onPhoneNumberChanged, l.Initialized initialized) {
            l.Initialized.PhoneNumberField phoneNumber = initialized.getPhoneNumber();
            PhoneNumber phoneNumber2 = onPhoneNumberChanged.getPhoneNumber();
            hz.b.d dVar = hz.b.d.f86848c;
            return l.Initialized.b(initialized, null, l.Initialized.PhoneNumberField.b(phoneNumber, phoneNumber2, false, dVar, dVar, 2, null), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPhoneNumberChanged onPhoneNumberChanged = (OnPhoneNumberChanged) this.f90768f;
            k10.c0 c0Var = (k10.c0) this.f90769g;
            uq.b.e();
            if (this.f90767e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ib3.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.h.O(onPhoneNumberChanged, (l.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPhoneNumberChanged onPhoneNumberChanged, k10.c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            h hVar = new h(eVar);
            hVar.f90768f = onPhoneNumberChanged;
            hVar.f90769g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lib3/k;", "<unused var>", "Lk10/c0;", "Lib3/l$b;", "state", "Lk10/l;", "Lib3/l;", "<anonymous>", "(Lib3/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<k, k10.c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90771f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized O(l.Initialized initialized) {
            return l.Initialized.b(initialized, null, null, null, null, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f90771f;
            uq.b.e();
            if (this.f90770e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ib3.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.i.O((l.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(k kVar, k10.c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            i iVar = new i(eVar);
            iVar.f90771f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lib3/h;", "<unused var>", "Lk10/c0;", "Lib3/l$b;", "state", "Lk10/l;", "Lib3/l;", "<anonymous>", "(Lib3/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ib3.h, k10.c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f90772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f90773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f90774g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f90775h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f90776j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f90777k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f90778l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ jb3.a f90780n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(jb3.a aVar, tq.e<? super j> eVar) {
            super(3, eVar);
            this.f90780n = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized O(Map map, Map.Entry entry, l.Initialized initialized) {
            l.Initialized.EmailField email = initialized.getEmail();
            hz.b validationState = (hz.b) map.get(lb3.a.Email);
            if (validationState == null) {
                validationState = initialized.getEmail().getValidationState();
            }
            l.Initialized.EmailField emailFieldB = l.Initialized.EmailField.b(email, null, false, validationState, 3, null);
            l.Initialized.PhoneNumberField phoneNumber = initialized.getPhoneNumber();
            hz.b prefixValidationState = (hz.b) map.get(lb3.a.PhonePrefix);
            if (prefixValidationState == null) {
                prefixValidationState = initialized.getPhoneNumber().getPrefixValidationState();
            }
            hz.b bVar = prefixValidationState;
            hz.b numberValidationState = (hz.b) map.get(lb3.a.PhoneNumber);
            if (numberValidationState == null) {
                numberValidationState = initialized.getPhoneNumber().getNumberValidationState();
            }
            l.Initialized.PhoneNumberField phoneNumberFieldB = l.Initialized.PhoneNumberField.b(phoneNumber, null, false, bVar, numberValidationState, 3, null);
            hz.b groupValidationState = (hz.b) map.get(lb3.a.Group);
            if (groupValidationState == null) {
                groupValidationState = initialized.getGroupValidationState();
            }
            return initialized.a(emailFieldB, phoneNumberFieldB, groupValidationState, (lb3.a) entry.getKey());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object next;
            k10.l lVarB;
            k10.c0 c0Var = (k10.c0) this.f90778l;
            Object objE = uq.b.e();
            int i15 = this.f90777k;
            if (i15 == 0) {
                oq.u.b(obj);
                ca3.a aVar = a0.this.validateContactDetailsUC;
                l.Initialized initialized = (l.Initialized) c0Var.a();
                ca3.a.Params params = new ca3.a.Params(initialized.getEmail().getValue(), initialized.getEmail().getIsChecked(), initialized.getPhoneNumber().getValue(), initialized.getPhoneNumber().getIsChecked());
                this.f90778l = c0Var;
                this.f90777k = 1;
                obj = aVar.h(params, this);
                if (obj != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f90773f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            jb3.a aVar2 = this.f90780n;
            a0 a0Var = a0.this;
            final Map map = (Map) obj;
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Map.Entry) next).getValue() instanceof hz.b.Invalid));
            final Map.Entry entry = (Map.Entry) next;
            if (entry != null && (lVarB = c0Var.b(new er.l() { // from class: ib3.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.j.O(map, entry, (l.Initialized) obj2);
                }
            })) != null) {
                return lVarB;
            }
            k10.l lVarC = c0Var.c();
            l.Initialized initialized2 = (l.Initialized) c0Var.a();
            aVar2.W(new ContactDetails(initialized2.getEmail().getValue(), initialized2.getEmail().getIsChecked(), initialized2.getPhoneNumber().getValue(), initialized2.getPhoneNumber().getIsChecked()));
            ib3.c.C2153c c2153c = ib3.c.C2153c.f90787a;
            this.f90778l = vq.j.a(c0Var);
            this.f90772e = vq.j.a(map);
            this.f90773f = lVarC;
            this.f90774g = vq.j.a(lVarC);
            this.f90775h = 0;
            this.f90776j = 0;
            this.f90777k = 2;
            return a0Var.F(c2153c, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ib3.h hVar, k10.c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            j jVar = a0.this.new j(this.f90780n, eVar);
            jVar.f90778l = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    public a0(yy.a aVar, ac4.a aVar2, x93.a aVar3, kb3.e eVar, ca3.a aVar4, final jb3.a aVar5) {
        this.callActionWithLoaderUseCase = aVar2;
        this.travelAbroadCitizenInteractor = aVar3;
        this.mapper = eVar;
        this.validateContactDetailsUC = aVar4;
        ContactDetails contactDetailsV = aVar5.V();
        l initialized = contactDetailsV != null ? new l.Initialized(new l.Initialized.EmailField(contactDetailsV.getEmail(), contactDetailsV.getIsEmailChecked(), null, 4, null), new l.Initialized.PhoneNumberField(contactDetailsV.getPhoneNumber(), contactDetailsV.getIsPhoneNumberChecked(), null, null, 12, null), null, null, 12, null) : l.a.f90805a;
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: ib3.z
            @Override // er.l
            public final Object b(Object obj) {
                return a0.z9(this.f90848a, aVar5, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), t9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(a0 a0Var, k10.z zVar) {
        b bVar = a0Var.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ib3.d.class), oVar, bVar);
        zVar.x(q0.c(ib3.e.class), oVar, a0Var.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(a0 a0Var, k10.z zVar) {
        zVar.A(a0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(a0 a0Var, jb3.a aVar, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnEmailChecked.class), oVar, eVar);
        zVar.v(q0.c(OnEmailChanged.class), oVar, new f(null));
        zVar.v(q0.c(OnPhoneNumberChecked.class), oVar, new g(null));
        zVar.v(q0.c(OnPhoneNumberChanged.class), oVar, new h(null));
        zVar.v(q0.c(k.class), oVar, new i(null));
        zVar.v(q0.c(ib3.h.class), oVar, a0Var.new j(aVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m.a t9(l state) {
        return this.mapper.b(new kb3.e.Params(state, new er.l() { // from class: ib3.v
            @Override // er.l
            public final Object b(Object obj) {
                return a0.u9(this.f90844a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: ib3.w
            @Override // er.l
            public final Object b(Object obj) {
                return a0.v9(this.f90845a, (String) obj);
            }
        }, new er.l() { // from class: ib3.x
            @Override // er.l
            public final Object b(Object obj) {
                return a0.w9(this.f90846a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: ib3.y
            @Override // er.l
            public final Object b(Object obj) {
                return a0.x9(this.f90847a, (PhoneNumber) obj);
            }
        }, b9(k.f90803a), b9(ib3.d.f90789a), b9(ib3.e.f90791a), b9(ib3.h.f90797a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u9(a0 a0Var, boolean z15) {
        a0Var.d9(new OnEmailChecked(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v9(a0 a0Var, String str) {
        a0Var.d9(new OnEmailChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w9(a0 a0Var, boolean z15) {
        a0Var.d9(new OnPhoneNumberChecked(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(a0 a0Var, PhoneNumber phoneNumber) {
        a0Var.d9(new OnPhoneNumberChanged(phoneNumber));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(final a0 a0Var, final jb3.a aVar, k10.v vVar) {
        vVar.c(q0.c(l.class), new er.l() { // from class: ib3.s
            @Override // er.l
            public final Object b(Object obj) {
                return a0.A9(this.f90840a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(l.a.class), new er.l() { // from class: ib3.t
            @Override // er.l
            public final Object b(Object obj) {
                return a0.B9(this.f90841a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(l.Initialized.class), new er.l() { // from class: ib3.u
            @Override // er.l
            public final Object b(Object obj) {
                return a0.C9(this.f90842a, aVar, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ib3.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<l, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<m.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ib3.c cVar, tq.e<? super oq.i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(jb3.a aVar) {
        super.P5(aVar);
    }
}
