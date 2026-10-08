package yx2;

import cb4.DialogData;
import cw3.IdentityPhotoData;
import er.p;
import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import mv2.CustomErrorData;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tt3.AddressSearchData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0017¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00172\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0017¢\u0006\u0004\b.\u0010&J\u0015\u00100\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020/¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u000202¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0017¢\u0006\u0004\b5\u0010&J\u000f\u00106\u001a\u00020\u0017H\u0016¢\u0006\u0004\b6\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010@\u001a\u00020;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR,\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030D8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010&\u001a\u0004\bG\u0010HR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR&\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00120R8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u0010&\u001a\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lyx2/h;", "Ll00/g;", "Lyx2/d;", "Lyx2/a;", "", "Lyx2/c;", "Lyy/a;", "stateMachineFactory", "Lby2/b;", "formWizardExitProcessDialogMapper", "Lf14/a;", "installDynamicModuleUC", "Lay2/a;", "contractFactory", "Lyx2/b;", "data", "<init>", "(Lyy/a;Lby2/b;Lf14/a;Lay2/a;Lyx2/b;)V", "Lyx2/e;", "u9", "()Lyx2/e;", "Ltt3/b;", "addressSearchData", "Loq/i0;", "s9", "(Ltt3/b;)V", "Lcb4/d;", "dialogData", "x9", "(Lcb4/d;)V", "Lal0/g;", "applicationOwnerWithAge", "t9", "(Lal0/g;)V", "Lmv2/a;", "p9", "(Lmv2/a;)V", "o9", "()V", "Ldx3/a;", "y9", "(Ldx3/a;)V", "Ljb4/b;", "errorData", "P6", "(Ljb4/b;)V", "p8", "Lmv3/a$b;", "q9", "(Lmv3/a$b;)V", "Lcw3/a;", "r9", "(Lcw3/a;)V", "w9", "q2", "b", "Lby2/b;", "c", "Lf14/a;", "Lzx2/c;", "d", "Lzx2/c;", "v", "()Lzx2/c;", "contract", "e", "Lyx2/d;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lyx2/a$j;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h extends l00.g<yx2.d, yx2.a> implements l00.e, zx.d, yx2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final by2.b formWizardExitProcessDialogMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f14.a installDynamicModuleUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zx2.c contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yx2.d initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<yx2.d, yx2.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yx2.a.j> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<yx2.e> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<yx2.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f230585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f230586b;

        /* JADX INFO: renamed from: yx2.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6193a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f230587a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f230588b;

            /* JADX INFO: renamed from: yx2.h$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6194a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f230589d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f230590e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f230591f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f230593h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f230594j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f230595k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f230596l;

                public C6194a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f230589d = obj;
                    this.f230590e |= PKIFailureInfo.systemUnavail;
                    return C6193a.this.F(null, this);
                }
            }

            public C6193a(mu.h hVar, h hVar2) {
                this.f230587a = hVar;
                this.f230588b = hVar2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6194a c6194a;
                if (eVar instanceof C6194a) {
                    c6194a = (C6194a) eVar;
                    int i15 = c6194a.f230590e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6194a.f230590e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6194a = new C6194a(eVar);
                    }
                } else {
                    c6194a = new C6194a(eVar);
                }
                Object obj2 = c6194a.f230589d;
                Object objE = uq.b.e();
                int i16 = c6194a.f230590e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f230587a;
                    yx2.e eVarU9 = this.f230588b.u9();
                    c6194a.f230591f = vq.j.a(obj);
                    c6194a.f230593h = vq.j.a(c6194a);
                    c6194a.f230594j = vq.j.a(obj);
                    c6194a.f230595k = vq.j.a(hVar);
                    c6194a.f230596l = 0;
                    c6194a.f230590e = 1;
                    if (hVar.F(eVarU9, c6194a) == objE) {
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

        public a(mu.g gVar, h hVar) {
            this.f230585a = gVar;
            this.f230586b = hVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super yx2.e> hVar, tq.e eVar) {
            Object objA = this.f230585a.a(new C6193a(hVar, this.f230586b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyx2/a$a;", "<unused var>", "Lyx2/d;", "Loq/i0;", "<anonymous>", "(Lyx2/a$a;Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<yx2.a.C6190a, yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230597e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f230597e;
            if (i15 == 0) {
                u.b(obj);
                h hVar = h.this;
                yx2.a.j.C6191a c6191a = yx2.a.j.C6191a.f230557a;
                this.f230597e = 1;
                if (hVar.F(c6191a, this) == objE) {
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
        public final Object w(yx2.a.C6190a c6190a, yx2.d dVar, tq.e<? super i0> eVar) {
            return h.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyx2/a$b;", "<unused var>", "Lyx2/d;", "Loq/i0;", "<anonymous>", "(Lyx2/a$b;Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<yx2.a.b, yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230599e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f230599e;
            if (i15 == 0) {
                u.b(obj);
                h hVar = h.this;
                yx2.a.j.b bVar = yx2.a.j.b.f230558a;
                this.f230599e = 1;
                if (hVar.F(bVar, this) == objE) {
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
        public final Object w(yx2.a.b bVar, yx2.d dVar, tq.e<? super i0> eVar) {
            return h.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx2/a$d;", "action", "Lyx2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyx2/a$d;Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<yx2.a.GoToEdorAuth, yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230601e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230602f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx2.a.GoToEdorAuth goToEdorAuth = (yx2.a.GoToEdorAuth) this.f230602f;
            Object objE = uq.b.e();
            int i15 = this.f230601e;
            if (i15 == 0) {
                u.b(obj);
                h hVar = h.this;
                yx2.a.j.GoToEdorAuth goToEdorAuth2 = new yx2.a.j.GoToEdorAuth(new mv3.a.EdorAddressRequired(goToEdorAuth.getData().b(), null, 2, null));
                this.f230602f = vq.j.a(goToEdorAuth);
                this.f230601e = 1;
                if (hVar.F(goToEdorAuth2, this) == objE) {
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
        public final Object w(yx2.a.GoToEdorAuth goToEdorAuth, yx2.d dVar, tq.e<? super i0> eVar) {
            d dVar2 = h.this.new d(eVar);
            dVar2.f230602f = goToEdorAuth;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx2/a$f;", "action", "Lyx2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyx2/a$f;Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<yx2.a.GoToPhoto, yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230605f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx2.a.GoToPhoto goToPhoto = (yx2.a.GoToPhoto) this.f230605f;
            Object objE = uq.b.e();
            int i15 = this.f230604e;
            if (i15 == 0) {
                u.b(obj);
                h hVar = h.this;
                yx2.a.j.GoToIdentityPhoto goToIdentityPhoto = new yx2.a.j.GoToIdentityPhoto(goToPhoto.getData());
                this.f230605f = vq.j.a(goToPhoto);
                this.f230604e = 1;
                if (hVar.F(goToIdentityPhoto, this) == objE) {
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
        public final Object w(yx2.a.GoToPhoto goToPhoto, yx2.d dVar, tq.e<? super i0> eVar) {
            e eVar2 = h.this.new e(eVar);
            eVar2.f230605f = goToPhoto;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyx2/d;", "it", "Loq/i0;", "<anonymous>", "(Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements p<yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230607e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f230607e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (h.this.getContract().getIsFaceDetectionFeatureEnabled()) {
                h.this.d9(yx2.a.i.f230556a);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(yx2.d dVar, tq.e<? super i0> eVar) {
            return ((f) v(dVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return h.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyx2/a$i;", "<unused var>", "Lyx2/d;", "Loq/i0;", "<anonymous>", "(Lyx2/a$i;Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<yx2.a.i, yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f230610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f230611g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zx2.c cVar;
            Object objE = uq.b.e();
            int i15 = this.f230611g;
            if (i15 == 0) {
                u.b(obj);
                zx2.c contract = h.this.getContract();
                h hVar = h.this;
                contract.y(zx2.a.EnumC6438a.IN_PROGRESS);
                f14.a aVar = hVar.installDynamicModuleUC;
                f14.a.Params params = new f14.a.Params(tx.a.FACE_DETECTION);
                this.f230609e = contract;
                this.f230610f = 0;
                this.f230611g = 1;
                Object objC = aVar.c(params, this);
                if (objC == objE) {
                    return objE;
                }
                cVar = contract;
                obj = objC;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (zx2.c) this.f230609e;
                u.b(obj);
            }
            tx.b.a aVar2 = (tx.b.a) obj;
            if (fr.t.c(aVar2, tx.b.a.C5033a.f192525a)) {
                cVar.y(zx2.a.EnumC6438a.FAILURE);
            } else {
                if (!fr.t.c(aVar2, tx.b.a.C5034b.f192526a)) {
                    throw new oq.p();
                }
                cVar.y(zx2.a.EnumC6438a.SUCCESS);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yx2.a.i iVar, yx2.d dVar, tq.e<? super i0> eVar) {
            return h.this.new g(eVar).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: yx2.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyx2/a$l;", "<unused var>", "Lyx2/d;", "Loq/i0;", "<anonymous>", "(Lyx2/a$l;Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class C6195h extends vq.k implements q<yx2.a.l, yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230613e;

        C6195h(tq.e<? super C6195h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f230613e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            h hVar = h.this;
            hVar.x9(hVar.formWizardExitProcessDialogMapper.b(new by2.b.Params(h.this.b9(yx2.a.C6190a.f230548a))));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yx2.a.l lVar, yx2.d dVar, tq.e<? super i0> eVar) {
            return h.this.new C6195h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx2/a$g;", "action", "Lyx2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyx2/a$g;Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements q<yx2.a.GoToSearch, yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230616f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx2.a.GoToSearch goToSearch = (yx2.a.GoToSearch) this.f230616f;
            Object objE = uq.b.e();
            int i15 = this.f230615e;
            if (i15 == 0) {
                u.b(obj);
                h hVar = h.this;
                yx2.a.j.GoToSearch goToSearch2 = new yx2.a.j.GoToSearch(goToSearch.getData());
                this.f230616f = vq.j.a(goToSearch);
                this.f230615e = 1;
                if (hVar.F(goToSearch2, this) == objE) {
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
        public final Object w(yx2.a.GoToSearch goToSearch, yx2.d dVar, tq.e<? super i0> eVar) {
            i iVar = h.this.new i(eVar);
            iVar.f230616f = goToSearch;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx2/a$k;", "action", "Lyx2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyx2/a$k;Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements q<yx2.a.ShowDialog, yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230619f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx2.a.ShowDialog showDialog = (yx2.a.ShowDialog) this.f230619f;
            Object objE = uq.b.e();
            int i15 = this.f230618e;
            if (i15 == 0) {
                u.b(obj);
                h hVar = h.this;
                yx2.a.j.ShowDialog showDialog2 = new yx2.a.j.ShowDialog(showDialog.getDialogData());
                this.f230619f = vq.j.a(showDialog);
                this.f230618e = 1;
                if (hVar.F(showDialog2, this) == objE) {
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
        public final Object w(yx2.a.ShowDialog showDialog, yx2.d dVar, tq.e<? super i0> eVar) {
            j jVar = h.this.new j(eVar);
            jVar.f230619f = showDialog;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx2/a$h;", "action", "Lyx2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyx2/a$h;Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements q<yx2.a.GoToSuccess, yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230622f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx2.a.GoToSuccess goToSuccess = (yx2.a.GoToSuccess) this.f230622f;
            Object objE = uq.b.e();
            int i15 = this.f230621e;
            if (i15 == 0) {
                u.b(obj);
                h hVar = h.this;
                yx2.a.j.GoToSuccess goToSuccess2 = new yx2.a.j.GoToSuccess(goToSuccess.getApplicationOwnerWithAge());
                this.f230622f = vq.j.a(goToSuccess);
                this.f230621e = 1;
                if (hVar.F(goToSuccess2, this) == objE) {
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
        public final Object w(yx2.a.GoToSuccess goToSuccess, yx2.d dVar, tq.e<? super i0> eVar) {
            k kVar = h.this.new k(eVar);
            kVar.f230622f = goToSuccess;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx2/a$c;", "action", "Lyx2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyx2/a$c;Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements q<yx2.a.GoToCustomError, yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230625f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx2.a.GoToCustomError goToCustomError = (yx2.a.GoToCustomError) this.f230625f;
            Object objE = uq.b.e();
            int i15 = this.f230624e;
            if (i15 == 0) {
                u.b(obj);
                h hVar = h.this;
                yx2.a.j.GoToCustomError goToCustomError2 = new yx2.a.j.GoToCustomError(goToCustomError.getData());
                this.f230625f = vq.j.a(goToCustomError);
                this.f230624e = 1;
                if (hVar.F(goToCustomError2, this) == objE) {
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
        public final Object w(yx2.a.GoToCustomError goToCustomError, yx2.d dVar, tq.e<? super i0> eVar) {
            l lVar = h.this.new l(eVar);
            lVar.f230625f = goToCustomError;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx2/a$m;", "action", "Lyx2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyx2/a$m;Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements q<yx2.a.ShowImagePreview, yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230628f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx2.a.ShowImagePreview showImagePreview = (yx2.a.ShowImagePreview) this.f230628f;
            Object objE = uq.b.e();
            int i15 = this.f230627e;
            if (i15 == 0) {
                u.b(obj);
                h hVar = h.this;
                yx2.a.j.ShowImagePreview showImagePreview2 = new yx2.a.j.ShowImagePreview(showImagePreview.getData());
                this.f230628f = vq.j.a(showImagePreview);
                this.f230627e = 1;
                if (hVar.F(showImagePreview2, this) == objE) {
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
        public final Object w(yx2.a.ShowImagePreview showImagePreview, yx2.d dVar, tq.e<? super i0> eVar) {
            m mVar = h.this.new m(eVar);
            mVar.f230628f = showImagePreview;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx2/a$e;", "action", "Lyx2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyx2/a$e;Lyx2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements q<yx2.a.GoToError, yx2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230631f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yx2.a.GoToError goToError = (yx2.a.GoToError) this.f230631f;
            Object objE = uq.b.e();
            int i15 = this.f230630e;
            if (i15 == 0) {
                u.b(obj);
                h hVar = h.this;
                yx2.a.j.GoToError goToError2 = new yx2.a.j.GoToError(goToError.getErrorData());
                this.f230631f = vq.j.a(goToError);
                this.f230630e = 1;
                if (hVar.F(goToError2, this) == objE) {
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
        public final Object w(yx2.a.GoToError goToError, yx2.d dVar, tq.e<? super i0> eVar) {
            n nVar = h.this.new n(eVar);
            nVar.f230631f = goToError;
            return nVar.J(i0.f148189a);
        }
    }

    public h(yy.a aVar, by2.b bVar, f14.a aVar2, ay2.a aVar3, SetupData setupData) {
        this.formWizardExitProcessDialogMapper = bVar;
        this.installDynamicModuleUC = aVar2;
        this.contract = aVar3.a(setupData.getApplicationOwner(), setupData.getIsIdentityPhotoFeatureEnabled(), setupData.getUserEdorAddress());
        yx2.d dVar = yx2.d.f230574a;
        this.initialState = dVar;
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: yx2.g
            @Override // er.l
            public final Object b(Object obj) {
                return h.z9(this.f230577a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), u9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(h hVar, z zVar) {
        zVar.C(hVar.new f(null));
        g gVar = hVar.new g(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(yx2.a.i.class), oVar, gVar);
        zVar.x(q0.c(yx2.a.l.class), oVar, hVar.new C6195h(null));
        zVar.x(q0.c(yx2.a.GoToSearch.class), oVar, hVar.new i(null));
        zVar.x(q0.c(yx2.a.ShowDialog.class), oVar, hVar.new j(null));
        zVar.x(q0.c(yx2.a.GoToSuccess.class), oVar, hVar.new k(null));
        zVar.x(q0.c(yx2.a.GoToCustomError.class), oVar, hVar.new l(null));
        zVar.x(q0.c(yx2.a.ShowImagePreview.class), oVar, hVar.new m(null));
        zVar.x(q0.c(yx2.a.GoToError.class), oVar, hVar.new n(null));
        zVar.x(q0.c(yx2.a.C6190a.class), oVar, hVar.new b(null));
        zVar.x(q0.c(yx2.a.b.class), oVar, hVar.new c(null));
        zVar.x(q0.c(yx2.a.GoToEdorAuth.class), oVar, hVar.new d(null));
        zVar.x(q0.c(yx2.a.GoToPhoto.class), oVar, hVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yx2.e u9() {
        return yx2.e.f230575a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final h hVar, v vVar) {
        vVar.c(q0.c(yx2.d.class), new er.l() { // from class: yx2.f
            @Override // er.l
            public final Object b(Object obj) {
                return h.A9(this.f230576a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    public final void P6(jb4.b errorData) {
        d9(new yx2.a.GoToError(errorData));
    }

    @Override // zx.b
    public xw.b<yx2.a.j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<yx2.d, yx2.a> e9() {
        return this.stateMachine;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(yx2.a.j jVar, tq.e<? super i0> eVar) {
        return super.F(jVar, eVar);
    }

    public final void o9() {
        d9(yx2.a.C6190a.f230548a);
    }

    public final void p8() {
        d9(yx2.a.b.f230549a);
    }

    public final void p9(CustomErrorData data) {
        d9(new yx2.a.GoToCustomError(data));
    }

    @Override // yx2.c
    public void q2() {
        d9(yx2.a.i.f230556a);
    }

    public final void q9(mv3.a.EdorAddressRequired data) {
        d9(new yx2.a.GoToEdorAuth(data));
    }

    public final void r9(IdentityPhotoData data) {
        d9(new yx2.a.GoToPhoto(data));
    }

    public void s9(AddressSearchData addressSearchData) {
        d9(new yx2.a.GoToSearch(addressSearchData));
    }

    public final void t9(al0.g applicationOwnerWithAge) {
        d9(new yx2.a.GoToSuccess(applicationOwnerWithAge));
    }

    @Override // yx2.c
    /* JADX INFO: renamed from: v, reason: from getter */
    public zx2.c getContract() {
        return this.contract;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    public final void w9() {
        d9(yx2.a.l.f230568a);
    }

    public void x9(DialogData dialogData) {
        d9(new yx2.a.ShowDialog(dialogData));
    }

    public final void y9(dx3.a data) {
        d9(new yx2.a.ShowImagePreview(data));
    }
}
