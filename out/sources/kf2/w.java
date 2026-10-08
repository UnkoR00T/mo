package kf2;

import f00.j0;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import xi0.ContactDetails;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001;BC\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010/\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003008\u0014X\u0094\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u0016068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lkf2/w;", "Ll00/g;", "Lkf2/h;", "", "Lkf2/i;", "Lyy/a;", "stateMachineFactory", "Llf2/a;", "mapper", "Lj14/n;", "checkPhoneNumberCorrectUC", "Lj14/a;", "checkEmailCorrectUC", "Lfj0/g;", "getContactDetailsUseCase", "Lmx/c;", "labelProvider", "Lkf2/j;", "setupContract", "<init>", "(Lyy/a;Llf2/a;Lj14/n;Lj14/a;Lfj0/g;Lmx/c;Lkf2/j;)V", "state", "Lkf2/i$a;", "r9", "(Lkf2/h;)Lkf2/i$a;", "b", "Llf2/a;", "c", "Lj14/n;", "d", "Lj14/a;", "e", "Lfj0/g;", "f", "Lmx/c;", "g", "Lkf2/j;", "Lkf2/h$b;", "h", "Lkf2/h$b;", "initialState", "Lxw/b;", "Lkf2/c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<kf2.h, Object> implements kf2.i, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lf2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j14.n checkPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fj0.g getContactDetailsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j setupContract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final kf2.h.Initialized initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<kf2.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<kf2.h, Object> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<kf2.i.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lkf2/w$a;", "Lf00/j0;", "Lkf2/j;", "Lkf2/w;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<j, w> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<kf2.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f110623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f110624b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f110625a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f110626b;

            /* JADX INFO: renamed from: kf2.w$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2654a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f110627d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f110628e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f110629f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f110631h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f110632j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f110633k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f110634l;

                public C2654a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f110627d = obj;
                    this.f110628e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, w wVar) {
                this.f110625a = hVar;
                this.f110626b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2654a c2654a;
                if (eVar instanceof C2654a) {
                    c2654a = (C2654a) eVar;
                    int i15 = c2654a.f110628e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2654a.f110628e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2654a = new C2654a(eVar);
                    }
                } else {
                    c2654a = new C2654a(eVar);
                }
                Object obj2 = c2654a.f110627d;
                Object objE = uq.b.e();
                int i16 = c2654a.f110628e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f110625a;
                    kf2.i.a aVarR9 = this.f110626b.r9((kf2.h) obj);
                    c2654a.f110629f = vq.j.a(obj);
                    c2654a.f110631h = vq.j.a(c2654a);
                    c2654a.f110632j = vq.j.a(obj);
                    c2654a.f110633k = vq.j.a(hVar);
                    c2654a.f110634l = 0;
                    c2654a.f110628e = 1;
                    if (hVar.F(aVarR9, c2654a) == objE) {
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
            this.f110623a = gVar;
            this.f110624b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super kf2.i.a> hVar, tq.e eVar) {
            Object objA = this.f110623a.a(new a(hVar, this.f110624b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkf2/h$b;", "state", "Lk10/l;", "Lkf2/h;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<kf2.h.Initialized>, tq.e<? super k10.l<? extends kf2.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110636f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kf2.h.Initialized O(ContactDetails contactDetails, kf2.h.Initialized initialized) {
            iy.b0 b0VarG;
            iy.b0 b0VarH;
            iy.b0 registeredEmail = contactDetails.getRegisteredEmail();
            if (registeredEmail == null) {
                registeredEmail = iy.c0.g("");
            }
            kf2.h.Field field = new kf2.h.Field(null, registeredEmail, 1, null);
            PhoneNumber registeredPhoneNumber = contactDetails.getRegisteredPhoneNumber();
            if (registeredPhoneNumber == null || (b0VarG = registeredPhoneNumber.g()) == null) {
                b0VarG = iy.c0.g("");
            }
            kf2.h.Field field2 = new kf2.h.Field(null, b0VarG, 1, null);
            PhoneNumber registeredPhoneNumber2 = contactDetails.getRegisteredPhoneNumber();
            if (registeredPhoneNumber2 == null || (b0VarH = registeredPhoneNumber2.h()) == null) {
                b0VarH = PhoneNumber.INSTANCE.a().h();
            }
            return kf2.h.Initialized.b(initialized, field, field2, new kf2.h.Field(null, b0VarH, 1, null), null, 8, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f110636f;
            Object objE = uq.b.e();
            int i15 = this.f110635e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (w.this.setupContract.B6() != null) {
                    return c0Var.c();
                }
                fj0.g gVar = w.this.getContactDetailsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f110636f = c0Var;
                this.f110635e = 1;
                obj = gVar.c(c1792a, this);
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
            if (iVar instanceof dx.i.Left) {
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final ContactDetails contactDetails = (ContactDetails) ((dx.i.Right) iVar).b();
            return c0Var.b(new er.l() { // from class: kf2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.c.O(contactDetails, (h.Initialized) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<kf2.h.Initialized> c0Var, tq.e<? super k10.l<? extends kf2.h>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = w.this.new c(eVar);
            cVar.f110636f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkf2/a;", "<unused var>", "Lkf2/h$b;", "Loq/i0;", "<anonymous>", "(Lkf2/a;Lkf2/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<kf2.a, kf2.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110638e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f110638e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kf2.c> bVarY1 = w.this.Y1();
                kf2.c.a aVar = kf2.c.a.f110569a;
                this.f110638e = 1;
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
        public final Object w(kf2.a aVar, kf2.h.Initialized initialized, tq.e<? super i0> eVar) {
            return w.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkf2/b;", "<unused var>", "Lkf2/h$b;", "Loq/i0;", "<anonymous>", "(Lkf2/b;Lkf2/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<kf2.b, kf2.h.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110640e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f110640e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kf2.c> bVarY1 = w.this.Y1();
                kf2.c.b bVar = kf2.c.b.f110570a;
                this.f110640e = 1;
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
        public final Object w(kf2.b bVar, kf2.h.Initialized initialized, tq.e<? super i0> eVar) {
            return w.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkf2/f;", "action", "Lk10/c0;", "Lkf2/h$b;", "state", "Lk10/l;", "Lkf2/h;", "<anonymous>", "(Lkf2/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OnEmailChanged, k10.c0<kf2.h.Initialized>, tq.e<? super k10.l<? extends kf2.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110643f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110644g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kf2.h.Initialized O(OnEmailChanged onEmailChanged, kf2.h.Initialized initialized) {
            return kf2.h.Initialized.b(initialized, new kf2.h.Field(null, iy.c0.g(onEmailChanged.getEmail()), 1, null), null, null, hz.b.C2039b.f86846c, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnEmailChanged onEmailChanged = (OnEmailChanged) this.f110643f;
            k10.c0 c0Var = (k10.c0) this.f110644g;
            uq.b.e();
            if (this.f110642e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: kf2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.f.O(onEmailChanged, (h.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnEmailChanged onEmailChanged, k10.c0<kf2.h.Initialized> c0Var, tq.e<? super k10.l<? extends kf2.h>> eVar) {
            f fVar = new f(eVar);
            fVar.f110643f = onEmailChanged;
            fVar.f110644g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkf2/g;", "action", "Lk10/c0;", "Lkf2/h$b;", "state", "Lk10/l;", "Lkf2/h;", "<anonymous>", "(Lkf2/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OnPhoneChanged, k10.c0<kf2.h.Initialized>, tq.e<? super k10.l<? extends kf2.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110647g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kf2.h.Initialized O(OnPhoneChanged onPhoneChanged, kf2.h.Initialized initialized) {
            return kf2.h.Initialized.b(initialized, null, new kf2.h.Field(null, iy.c0.g(onPhoneChanged.getPhone()), 1, null), null, hz.b.C2039b.f86846c, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPhoneChanged onPhoneChanged = (OnPhoneChanged) this.f110646f;
            k10.c0 c0Var = (k10.c0) this.f110647g;
            uq.b.e();
            if (this.f110645e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: kf2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.g.O(onPhoneChanged, (h.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPhoneChanged onPhoneChanged, k10.c0<kf2.h.Initialized> c0Var, tq.e<? super k10.l<? extends kf2.h>> eVar) {
            g gVar = new g(eVar);
            gVar.f110646f = onPhoneChanged;
            gVar.f110647g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkf2/e;", "action", "Lk10/c0;", "Lkf2/h$b;", "state", "Lk10/l;", "Lkf2/h;", "<anonymous>", "(Lkf2/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<OnCountryCodeChanged, k10.c0<kf2.h.Initialized>, tq.e<? super k10.l<? extends kf2.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110649f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110650g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kf2.h.Initialized O(OnCountryCodeChanged onCountryCodeChanged, kf2.h.Initialized initialized) {
            return kf2.h.Initialized.b(initialized, null, null, new kf2.h.Field(null, iy.c0.g(onCountryCodeChanged.getCode()), 1, null), null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCountryCodeChanged onCountryCodeChanged = (OnCountryCodeChanged) this.f110649f;
            k10.c0 c0Var = (k10.c0) this.f110650g;
            uq.b.e();
            if (this.f110648e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: kf2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.h.O(onCountryCodeChanged, (h.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCountryCodeChanged onCountryCodeChanged, k10.c0<kf2.h.Initialized> c0Var, tq.e<? super k10.l<? extends kf2.h>> eVar) {
            h hVar = new h(eVar);
            hVar.f110649f = onCountryCodeChanged;
            hVar.f110650g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkf2/d;", "<unused var>", "Lk10/c0;", "Lkf2/h$b;", "state", "Lk10/l;", "Lkf2/h;", "<anonymous>", "(Lkf2/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<kf2.d, k10.c0<kf2.h.Initialized>, tq.e<? super k10.l<? extends kf2.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f110651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f110652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f110653g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f110654h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f110655j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f110656k;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kf2.h.Initialized V(w wVar, kf2.h.Initialized initialized) {
            return kf2.h.Initialized.b(initialized, null, null, null, new hz.b.Invalid(wVar.labelProvider.c(df2.a.K)), 7, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kf2.h.Initialized X(hz.g gVar, hz.g gVar2, hz.g gVar3, kf2.h.Initialized initialized) {
            return kf2.h.Initialized.b(initialized, kf2.h.Field.b(initialized.getEmail(), gVar.a(), null, 2, null), kf2.h.Field.b(initialized.getPhoneNumber(), gVar3.a(), null, 2, null), kf2.h.Field.b(initialized.getCountryCode(), gVar2.a(), null, 2, null), null, 8, null);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0130  */
        /* JADX WARN: Code duplicated, block: B:35:0x014a  */
        /* JADX WARN: Code duplicated, block: B:38:0x0167  */
        /* JADX WARN: Code duplicated, block: B:44:0x0199  */
        /* JADX WARN: Code duplicated, block: B:47:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:50:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:60:0x01b7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:? A[LOOP:0: B:48:0x01a7->B:61:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0221, code lost:
        
            if (r7.F(r8, r16) == r2) goto L56;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 553
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kf2.w.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(kf2.d dVar, k10.c0<kf2.h.Initialized> c0Var, tq.e<? super k10.l<? extends kf2.h>> eVar) {
            i iVar = w.this.new i(eVar);
            iVar.f110656k = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    public w(yy.a aVar, lf2.a aVar2, j14.n nVar, j14.a aVar3, fj0.g gVar, mx.c cVar, j jVar) {
        iy.b0 countryCode;
        iy.b0 phoneNumber;
        iy.b0 email;
        this.mapper = aVar2;
        this.checkPhoneNumberCorrectUC = nVar;
        this.checkEmailCorrectUC = aVar3;
        this.getContactDetailsUseCase = gVar;
        this.labelProvider = cVar;
        this.setupContract = jVar;
        InternetContactInfoData internetContactInfoDataB6 = jVar.B6();
        kf2.h.Field field = new kf2.h.Field(null, (internetContactInfoDataB6 == null || (email = internetContactInfoDataB6.getEmail()) == null) ? iy.c0.g("") : email, 1, null);
        InternetContactInfoData internetContactInfoDataB7 = jVar.B6();
        kf2.h.Field field2 = new kf2.h.Field(null, (internetContactInfoDataB7 == null || (phoneNumber = internetContactInfoDataB7.getPhoneNumber()) == null) ? iy.c0.g("") : phoneNumber, 1, null);
        InternetContactInfoData internetContactInfoDataB8 = jVar.B6();
        kf2.h.Initialized initialized = new kf2.h.Initialized(field, field2, new kf2.h.Field(null, (internetContactInfoDataB8 == null || (countryCode = internetContactInfoDataB8.getCountryCode()) == null) ? PhoneNumber.INSTANCE.a().h() : countryCode, 1, null), null, 8, null);
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: kf2.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.v9(this.f110612a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), r9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kf2.i.a r9(kf2.h state) {
        lf2.a aVar = this.mapper;
        er.a<i0> aVarB9 = b9(kf2.d.f110575a);
        er.a<i0> aVarB10 = b9(kf2.a.f110565a);
        return aVar.b(new lf2.a.Params(state, new er.l() { // from class: kf2.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.s9(this.f110609a, (String) obj);
            }
        }, new er.l() { // from class: kf2.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.t9(this.f110610a, (String) obj);
            }
        }, new er.l() { // from class: kf2.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.u9(this.f110611a, (String) obj);
            }
        }, b9(kf2.b.f110567a), aVarB9, aVarB10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(w wVar, String str) {
        wVar.d9(new OnEmailChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(w wVar, String str) {
        wVar.d9(new OnPhoneChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(w wVar, String str) {
        wVar.d9(new OnCountryCodeChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(kf2.h.Initialized.class), new er.l() { // from class: kf2.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.w9(this.f110608a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(w wVar, k10.z zVar) {
        zVar.A(wVar.new c(null));
        d dVar = wVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(kf2.a.class), oVar, dVar);
        zVar.x(q0.c(kf2.b.class), oVar, wVar.new e(null));
        zVar.v(q0.c(OnEmailChanged.class), oVar, new f(null));
        zVar.v(q0.c(OnPhoneChanged.class), oVar, new g(null));
        zVar.v(q0.c(OnCountryCodeChanged.class), oVar, new h(null));
        zVar.v(q0.c(kf2.d.class), oVar, wVar.new i(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public /* bridge */ void P5(Object obj) {
        super.P5(obj);
    }

    @Override // zx.b
    public xw.b<kf2.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<kf2.h, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<kf2.i.a> getState() {
        return this.state;
    }
}
