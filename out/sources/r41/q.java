package r41;

import android.text.TextUtils;
import fr.q0;
import iy.b0;
import java.util.Iterator;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import u41.ContactInfoWriteFieldsData;
import xi0.ContactDetail;
import xi0.ContactDetailAdditionalValue;
import xi0.ContactDetails;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u0002*\u00020\u0002H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020%*\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003098\u0014X\u0094\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010E\u001a\b\u0012\u0004\u0012\u00020@0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020%0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lr41/q;", "Ll00/g;", "Lr41/b;", "Lr41/a;", "Lr41/c;", "", "Lyy/a;", "stateMachineFactory", "Lt41/d;", "mapper", "Lq31/c;", "exitDialogMapper", "Lcx/a;", "eventThrottler", "Lui0/a;", "contactDetailsDownloadManager", "Lj14/n;", "checkPhoneNumberCorrectUC", "Lj14/a;", "checkEmailCorrectUC", "Ls41/a;", "contract", "<init>", "(Lyy/a;Lt41/d;Lq31/c;Lcx/a;Lui0/a;Lj14/n;Lj14/a;Ls41/a;)V", "w9", "()Lr41/b;", "state", "Lbl0/m;", "u9", "(Lr41/b;)Lbl0/m;", "E9", "(Lr41/b;Ltq/e;)Ljava/lang/Object;", "Lxi0/e;", "contactDetails", "Lr41/b$b;", "x9", "(Lxi0/e;)Lr41/b$b;", "Lr41/c$a;", "y9", "(Lr41/b;)Lr41/c$a;", "b", "Lt41/d;", "c", "Lq31/c;", "d", "Lcx/a;", "e", "Lui0/a;", "f", "Lj14/n;", "g", "Lj14/a;", "h", "Ls41/a;", "j", "Lr41/b;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lr41/a$b;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<r41.b, r41.a> implements r41.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t41.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cx.a eventThrottler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ui0.a contactDetailsDownloadManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j14.n checkPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final s41.a contract;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final r41.b initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<r41.b, r41.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<r41.a.b> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<r41.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<r41.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f171618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f171619b;

        /* JADX INFO: renamed from: r41.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4361a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f171620a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f171621b;

            /* JADX INFO: renamed from: r41.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4362a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f171622d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f171623e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f171624f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f171626h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f171627j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f171628k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f171629l;

                public C4362a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f171622d = obj;
                    this.f171623e |= PKIFailureInfo.systemUnavail;
                    return C4361a.this.F(null, this);
                }
            }

            public C4361a(mu.h hVar, q qVar) {
                this.f171620a = hVar;
                this.f171621b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4362a c4362a;
                if (eVar instanceof C4362a) {
                    c4362a = (C4362a) eVar;
                    int i15 = c4362a.f171623e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4362a.f171623e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4362a = new C4362a(eVar);
                    }
                } else {
                    c4362a = new C4362a(eVar);
                }
                Object obj2 = c4362a.f171622d;
                Object objE = uq.b.e();
                int i16 = c4362a.f171623e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f171620a;
                    r41.c.Data dataY9 = this.f171621b.y9((r41.b) obj);
                    c4362a.f171624f = vq.j.a(obj);
                    c4362a.f171626h = vq.j.a(c4362a);
                    c4362a.f171627j = vq.j.a(obj);
                    c4362a.f171628k = vq.j.a(hVar);
                    c4362a.f171629l = 0;
                    c4362a.f171623e = 1;
                    if (hVar.F(dataY9, c4362a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f171618a = gVar;
            this.f171619b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super r41.c.Data> hVar, tq.e eVar) {
            Object objA = this.f171618a.a(new C4361a(hVar, this.f171619b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr41/a$b;", "action", "Lr41/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr41/a$b;Lr41/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<r41.a.b, r41.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171631f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f171633e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f171634f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ r41.a.b f171635g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, r41.a.b bVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f171634f = qVar;
                this.f171635g = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f171633e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    q qVar = this.f171634f;
                    r41.a.b bVar = this.f171635g;
                    this.f171633e = 1;
                    if (qVar.F(bVar, this) == objE) {
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

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f171634f, this.f171635g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r41.a.b bVar = (r41.a.b) this.f171631f;
            Object objE = uq.b.e();
            int i15 = this.f171630e;
            if (i15 == 0) {
                oq.u.b(obj);
                cx.a aVar = q.this.eventThrottler;
                a aVar2 = new a(q.this, bVar, null);
                this.f171631f = vq.j.a(bVar);
                this.f171630e = 1;
                if (cx.a.d(aVar, 0L, aVar2, this, 1, null) == objE) {
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
        public final Object w(r41.a.b bVar, r41.b bVar2, tq.e<? super i0> eVar) {
            b bVar3 = q.this.new b(eVar);
            bVar3.f171631f = bVar;
            return bVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr41/a$e;", "<unused var>", "Lr41/b;", "Loq/i0;", "<anonymous>", "(Lr41/a$e;Lr41/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<r41.a.e, r41.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171636e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f171636e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.d9(new r41.a.b.ShowDialog(q.this.exitDialogMapper.b(new q31.c.Params(q.this.b9(r41.a.b.C4359b.f171572a)))));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(r41.a.e eVar, r41.b bVar, tq.e<? super i0> eVar2) {
            return q.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr41/a$c;", "<unused var>", "Lk10/c0;", "Lr41/b;", "state", "Lk10/l;", "<anonymous>", "(Lr41/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<r41.a.c, c0<r41.b>, tq.e<? super k10.l<? extends r41.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171639f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r41.b V(r41.b bVar, r41.b bVar2) {
            return bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r41.b X(r41.b bVar, r41.b bVar2) {
            return bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f171639f;
            Object objE = uq.b.e();
            int i15 = this.f171638e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                r41.b bVar = (r41.b) c0Var.a();
                this.f171639f = c0Var;
                this.f171638e = 1;
                obj = qVar.E9(bVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final r41.b bVar2 = (r41.b) obj;
            if (!bVar2.isValid()) {
                return c0Var.b(new er.l() { // from class: r41.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.d.V(bVar2, (b) obj2);
                    }
                });
            }
            q.this.contract.H7(q.this.u9(bVar2));
            q.this.d9(r41.a.b.c.f171573a);
            return c0Var.b(new er.l() { // from class: r41.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.X(bVar2, (b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(r41.a.c cVar, c0<r41.b> c0Var, tq.e<? super k10.l<? extends r41.b>> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f171639f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr41/a$a;", "action", "Lk10/c0;", "Lr41/b;", "state", "Lk10/l;", "<anonymous>", "(Lr41/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<r41.a.EditFieldsData, c0<r41.b>, tq.e<? super k10.l<? extends r41.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171643g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r41.b O(r41.a.EditFieldsData editFieldsData, r41.b bVar) {
            return bVar.b(editFieldsData.getFieldsData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r41.a.EditFieldsData editFieldsData = (r41.a.EditFieldsData) this.f171642f;
            c0 c0Var = (c0) this.f171643g;
            uq.b.e();
            if (this.f171641e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r41.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(editFieldsData, (b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r41.a.EditFieldsData editFieldsData, c0<r41.b> c0Var, tq.e<? super k10.l<? extends r41.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f171642f = editFieldsData;
            eVar2.f171643g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lr41/b$a;", "state", "Lk10/l;", "Lr41/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<r41.b.Loading>, tq.e<? super k10.l<? extends r41.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171645f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r41.b.NotLoading V(q qVar, r41.b.Loading loading) {
            return new r41.b.NotLoading(loading.getFieldsData(), qVar.contract.K());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r41.b.NotLoading X(r41.b.NotLoading notLoading, r41.b.Loading loading) {
            return notLoading;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f171645f;
            Object objE = uq.b.e();
            int i15 = this.f171644e;
            if (i15 == 0) {
                oq.u.b(obj);
                ui0.a aVar = q.this.contactDetailsDownloadManager;
                this.f171645f = c0Var;
                this.f171644e = 1;
                obj = aVar.b(this);
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
            final q qVar = q.this;
            if (iVar instanceof dx.i.Left) {
                qVar.contract.H7(qVar.u9((r41.b) c0Var.a()));
                return c0Var.d(new er.l() { // from class: r41.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.f.V(qVar, (b.Loading) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final r41.b.NotLoading notLoadingX9 = qVar.x9((ContactDetails) ((dx.i.Right) iVar).b());
            qVar.contract.H7(qVar.u9(notLoadingX9));
            return c0Var.d(new er.l() { // from class: r41.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.X(notLoadingX9, (b.Loading) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<r41.b.Loading> c0Var, tq.e<? super k10.l<? extends r41.b>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f171645f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr41/a;", "action", "Lr41/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr41/a;Lr41/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<r41.a, r41.b.Loading, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171648f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r41.a aVar = (r41.a) this.f171648f;
            Object objE = uq.b.e();
            int i15 = this.f171647e;
            if (i15 == 0) {
                oq.u.b(obj);
                px.f.f163100a.b("Cancelling download by " + aVar, px.c.a(q.this));
                ui0.a aVar2 = q.this.contactDetailsDownloadManager;
                this.f171648f = vq.j.a(aVar);
                this.f171647e = 1;
                if (aVar2.a(this) == objE) {
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
        public final Object w(r41.a aVar, r41.b.Loading loading, tq.e<? super i0> eVar) {
            g gVar = q.this.new g(eVar);
            gVar.f171648f = aVar;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f171650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f171651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f171652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f171653g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f171654h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f171655j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f171656k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f171657l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f171658m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f171659n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f171660p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f171661q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f171663s;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f171661q = obj;
            this.f171663s |= PKIFailureInfo.systemUnavail;
            return q.this.E9(null, this);
        }
    }

    public q(yy.a aVar, t41.d dVar, q31.c cVar, cx.a aVar2, ui0.a aVar3, j14.n nVar, j14.a aVar4, s41.a aVar5) {
        this.mapper = dVar;
        this.exitDialogMapper = cVar;
        this.eventThrottler = aVar2;
        this.contactDetailsDownloadManager = aVar3;
        this.checkPhoneNumberCorrectUC = nVar;
        this.checkEmailCorrectUC = aVar4;
        this.contract = aVar5;
        r41.b bVarW9 = w9();
        this.initialState = bVarW9;
        this.stateMachine = aVar.a(bVarW9, new er.l() { // from class: r41.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.B9(this.f171606a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), y9(bVarW9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(r41.b.class), new er.l() { // from class: r41.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.C9(this.f171603a, (z) obj);
            }
        });
        vVar.c(q0.c(r41.b.Loading.class), new er.l() { // from class: r41.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.D9(this.f171604a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(r41.a.b.class), oVar, bVar);
        zVar.x(q0.c(r41.a.e.class), oVar, qVar.new c(null));
        zVar.v(q0.c(r41.a.c.class), oVar, qVar.new d(null));
        zVar.v(q0.c(r41.a.EditFieldsData.class), oVar, new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(q qVar, z zVar) {
        zVar.A(qVar.new f(null));
        g gVar = qVar.new g(null);
        zVar.x(q0.c(r41.a.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x014d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0157  */
    /* JADX WARN: Code duplicated, block: B:42:0x0191  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x021f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0225  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object E9(r41.b bVar, tq.e<? super r41.b> eVar) throws Throwable {
        h hVar;
        ContactInfoWriteFieldsData fieldsData;
        int i15;
        int i16;
        ContactInfoWriteFieldsData.InterfaceC5084a.TextInput emailFieldData;
        hz.b.Companion companion;
        r41.b bVar2;
        int i17;
        r41.b bVar3;
        ContactInfoWriteFieldsData contactInfoWriteFieldsData;
        hz.g gVar;
        ContactInfoWriteFieldsData contactInfoWriteFieldsData2;
        ContactInfoWriteFieldsData contactInfoWriteFieldsData3;
        int i18;
        int i19;
        ContactInfoWriteFieldsData.InterfaceC5084a.TextInput textInputB;
        ContactInfoWriteFieldsData.InterfaceC5084a.Phone phoneFieldData;
        hz.b.Companion companion2;
        r41.b bVar4;
        Object objC;
        int i25;
        ContactInfoWriteFieldsData.InterfaceC5084a.Phone phone;
        ContactInfoWriteFieldsData.InterfaceC5084a.TextInput textInput;
        r41.b bVar5;
        ContactInfoWriteFieldsData contactInfoWriteFieldsData4;
        r41.b bVar6;
        hz.b.Companion companion3;
        ContactInfoWriteFieldsData contactInfoWriteFieldsData5;
        ContactInfoWriteFieldsData contactInfoWriteFieldsData6;
        hz.g gVar2;
        hz.b bVarA;
        hz.b.Companion companion4;
        Object objC2;
        hz.b bVar7;
        hz.b.Companion companion5;
        r41.b bVar8;
        ContactInfoWriteFieldsData.InterfaceC5084a.Phone phone2;
        ContactInfoWriteFieldsData.InterfaceC5084a.TextInput textInput2;
        hz.g gVar3;
        hz.b bVar9;
        ContactInfoWriteFieldsData.InterfaceC5084a.Phone phone3;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i26 = hVar.f171663s;
            if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f171663s = i26 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objC3 = hVar.f171661q;
        Object objE = uq.b.e();
        int i27 = hVar.f171663s;
        if (i27 != 0) {
            if (i27 == 1) {
                i16 = hVar.f171660p;
                i15 = hVar.f171659n;
                i17 = hVar.f171658m;
                bVar2 = (r41.b) hVar.f171655j;
                fieldsData = (ContactInfoWriteFieldsData) hVar.f171654h;
                emailFieldData = (ContactInfoWriteFieldsData.InterfaceC5084a.TextInput) hVar.f171653g;
                companion = (hz.b.Companion) hVar.f171652f;
                contactInfoWriteFieldsData = (ContactInfoWriteFieldsData) hVar.f171651e;
                bVar3 = (r41.b) hVar.f171650d;
                oq.u.b(objC3);
            } else {
                if (i27 == 2) {
                    i16 = hVar.f171660p;
                    i18 = hVar.f171659n;
                    i25 = hVar.f171658m;
                    bVar5 = (r41.b) hVar.f171656k;
                    companion3 = (hz.b.Companion) hVar.f171655j;
                    contactInfoWriteFieldsData4 = (ContactInfoWriteFieldsData) hVar.f171654h;
                    textInput = (ContactInfoWriteFieldsData.InterfaceC5084a.TextInput) hVar.f171653g;
                    phone = (ContactInfoWriteFieldsData.InterfaceC5084a.Phone) hVar.f171652f;
                    contactInfoWriteFieldsData2 = (ContactInfoWriteFieldsData) hVar.f171651e;
                    bVar6 = (r41.b) hVar.f171650d;
                    oq.u.b(objC3);
                    hz.g gVar4 = (hz.g) objC3;
                    int i28 = i25;
                    phoneFieldData = phone;
                    i19 = i28;
                    gVar2 = gVar4;
                    contactInfoWriteFieldsData5 = contactInfoWriteFieldsData2;
                    companion2 = companion3;
                    contactInfoWriteFieldsData6 = contactInfoWriteFieldsData4;
                    bVar3 = bVar6;
                    bVar2 = bVar5;
                    bVarA = companion2.a(gVar2);
                    companion4 = hz.b.INSTANCE;
                    if (i18 != 1) {
                        if (i18 != 0) {
                            throw new oq.p();
                        }
                        j14.n nVar = this.checkPhoneNumberCorrectUC;
                        j14.n.a.CheckNumber checkNumber = new j14.n.a.CheckNumber(contactInfoWriteFieldsData5.getPhoneFieldData().getPhoneNumber(), false, 2, null);
                        hVar.f171650d = vq.j.a(bVar3);
                        hVar.f171651e = vq.j.a(contactInfoWriteFieldsData5);
                        hVar.f171652f = phoneFieldData;
                        hVar.f171653g = textInput;
                        hVar.f171654h = contactInfoWriteFieldsData6;
                        hVar.f171655j = bVarA;
                        hVar.f171656k = companion4;
                        hVar.f171657l = bVar2;
                        hVar.f171658m = i19;
                        hVar.f171659n = i18;
                        hVar.f171660p = i16;
                        hVar.f171663s = 3;
                        objC2 = nVar.c(checkNumber, hVar);
                        objE = objE;
                        if (objC2 != objE) {
                            bVar7 = bVarA;
                            companion5 = companion4;
                            bVar8 = bVar2;
                            phone2 = phoneFieldData;
                            textInput2 = textInput;
                            objC3 = objC2;
                        }
                        objE = objE;
                        return objE;
                    }
                    gVar3 = hz.g.b.f86853b;
                    bVar9 = bVarA;
                    companion5 = companion4;
                    phone3 = phoneFieldData;
                    return bVar2.b(contactInfoWriteFieldsData6.a(textInput, ContactInfoWriteFieldsData.InterfaceC5084a.Phone.b(phone3, bVar9, companion5.a(gVar3), null, 4, null)));
                }
                if (i27 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar8 = (r41.b) hVar.f171657l;
                companion5 = (hz.b.Companion) hVar.f171656k;
                bVar7 = (hz.b) hVar.f171655j;
                contactInfoWriteFieldsData6 = (ContactInfoWriteFieldsData) hVar.f171654h;
                textInput2 = (ContactInfoWriteFieldsData.InterfaceC5084a.TextInput) hVar.f171653g;
                phone2 = (ContactInfoWriteFieldsData.InterfaceC5084a.Phone) hVar.f171652f;
                oq.u.b(objC3);
            }
            gVar3 = (hz.g) objC3;
            bVar9 = bVar7;
            textInput = textInput2;
            phone3 = phone2;
            bVar2 = bVar8;
            return bVar2.b(contactInfoWriteFieldsData6.a(textInput, ContactInfoWriteFieldsData.InterfaceC5084a.Phone.b(phone3, bVar9, companion5.a(gVar3), null, 4, null)));
        }
        oq.u.b(objC3);
        fieldsData = bVar.getFieldsData();
        i15 = iy.c0.e(fieldsData.getPhoneFieldData().getPhoneNumber().g()).length() == 0 ? 1 : 0;
        i16 = iy.c0.e(fieldsData.getEmailFieldData().getValue()).length() == 0 ? 1 : 0;
        emailFieldData = fieldsData.getEmailFieldData();
        companion = hz.b.INSTANCE;
        if (i16 == 1) {
            gVar = hz.g.b.f86853b;
            bVar2 = bVar;
            bVar3 = bVar2;
            contactInfoWriteFieldsData2 = fieldsData;
            contactInfoWriteFieldsData3 = contactInfoWriteFieldsData2;
            i18 = i15;
            i19 = 0;
            textInputB = ContactInfoWriteFieldsData.InterfaceC5084a.TextInput.b(emailFieldData, companion.a(gVar), null, 2, null);
            phoneFieldData = contactInfoWriteFieldsData2.getPhoneFieldData();
            companion2 = hz.b.INSTANCE;
            if (i18 == 1) {
                textInput = textInputB;
                contactInfoWriteFieldsData5 = contactInfoWriteFieldsData2;
                contactInfoWriteFieldsData6 = contactInfoWriteFieldsData3;
                gVar2 = hz.g.b.f86853b;
                bVarA = companion2.a(gVar2);
                companion4 = hz.b.INSTANCE;
                if (i18 != 1) {
                    gVar3 = hz.g.b.f86853b;
                    bVar9 = bVarA;
                    companion5 = companion4;
                    phone3 = phoneFieldData;
                } else {
                    if (i18 != 0) {
                        throw new oq.p();
                    }
                    j14.n nVar2 = this.checkPhoneNumberCorrectUC;
                    j14.n.a.CheckNumber checkNumber2 = new j14.n.a.CheckNumber(contactInfoWriteFieldsData5.getPhoneFieldData().getPhoneNumber(), false, 2, null);
                    hVar.f171650d = vq.j.a(bVar3);
                    hVar.f171651e = vq.j.a(contactInfoWriteFieldsData5);
                    hVar.f171652f = phoneFieldData;
                    hVar.f171653g = textInput;
                    hVar.f171654h = contactInfoWriteFieldsData6;
                    hVar.f171655j = bVarA;
                    hVar.f171656k = companion4;
                    hVar.f171657l = bVar2;
                    hVar.f171658m = i19;
                    hVar.f171659n = i18;
                    hVar.f171660p = i16;
                    hVar.f171663s = 3;
                    objC2 = nVar2.c(checkNumber2, hVar);
                    objE = objE;
                    if (objC2 != objE) {
                        bVar7 = bVarA;
                        companion5 = companion4;
                        bVar8 = bVar2;
                        phone2 = phoneFieldData;
                        textInput2 = textInput;
                        objC3 = objC2;
                        gVar3 = (hz.g) objC3;
                        bVar9 = bVar7;
                        textInput = textInput2;
                        phone3 = phone2;
                        bVar2 = bVar8;
                    }
                }
                return bVar2.b(contactInfoWriteFieldsData6.a(textInput, ContactInfoWriteFieldsData.InterfaceC5084a.Phone.b(phone3, bVar9, companion5.a(gVar3), null, 4, null)));
            }
            if (i18 == 0) {
                throw new oq.p();
            }
            j14.n nVar3 = this.checkPhoneNumberCorrectUC;
            bVar4 = bVar3;
            j14.n.a.CheckPrefix checkPrefix = new j14.n.a.CheckPrefix(contactInfoWriteFieldsData2.getPhoneFieldData().getPhoneNumber(), false, 2, null);
            hVar.f171650d = vq.j.a(bVar4);
            hVar.f171651e = contactInfoWriteFieldsData2;
            hVar.f171652f = phoneFieldData;
            hVar.f171653g = textInputB;
            hVar.f171654h = contactInfoWriteFieldsData3;
            hVar.f171655j = companion2;
            hVar.f171656k = bVar2;
            hVar.f171658m = i19;
            hVar.f171659n = i18;
            hVar.f171660p = i16;
            hVar.f171663s = 2;
            objC = nVar3.c(checkPrefix, hVar);
            if (objC != objE) {
                objE = objE;
                i25 = i19;
                phone = phoneFieldData;
                textInput = textInputB;
                bVar5 = bVar2;
                contactInfoWriteFieldsData4 = contactInfoWriteFieldsData3;
                bVar6 = bVar4;
                objC3 = objC;
                companion3 = companion2;
                hz.g gVar5 = (hz.g) objC3;
                int i29 = i25;
                phoneFieldData = phone;
                i19 = i29;
                gVar2 = gVar5;
                contactInfoWriteFieldsData5 = contactInfoWriteFieldsData2;
                companion2 = companion3;
                contactInfoWriteFieldsData6 = contactInfoWriteFieldsData4;
                bVar3 = bVar6;
                bVar2 = bVar5;
                bVarA = companion2.a(gVar2);
                companion4 = hz.b.INSTANCE;
                if (i18 != 1) {
                    gVar3 = hz.g.b.f86853b;
                    bVar9 = bVarA;
                    companion5 = companion4;
                    phone3 = phoneFieldData;
                } else {
                    if (i18 != 0) {
                        throw new oq.p();
                    }
                    j14.n nVar4 = this.checkPhoneNumberCorrectUC;
                    j14.n.a.CheckNumber checkNumber3 = new j14.n.a.CheckNumber(contactInfoWriteFieldsData5.getPhoneFieldData().getPhoneNumber(), false, 2, null);
                    hVar.f171650d = vq.j.a(bVar3);
                    hVar.f171651e = vq.j.a(contactInfoWriteFieldsData5);
                    hVar.f171652f = phoneFieldData;
                    hVar.f171653g = textInput;
                    hVar.f171654h = contactInfoWriteFieldsData6;
                    hVar.f171655j = bVarA;
                    hVar.f171656k = companion4;
                    hVar.f171657l = bVar2;
                    hVar.f171658m = i19;
                    hVar.f171659n = i18;
                    hVar.f171660p = i16;
                    hVar.f171663s = 3;
                    objC2 = nVar4.c(checkNumber3, hVar);
                    objE = objE;
                    if (objC2 != objE) {
                        bVar7 = bVarA;
                        companion5 = companion4;
                        bVar8 = bVar2;
                        phone2 = phoneFieldData;
                        textInput2 = textInput;
                        objC3 = objC2;
                        gVar3 = (hz.g) objC3;
                        bVar9 = bVar7;
                        textInput = textInput2;
                        phone3 = phone2;
                        bVar2 = bVar8;
                    }
                }
                return bVar2.b(contactInfoWriteFieldsData6.a(textInput, ContactInfoWriteFieldsData.InterfaceC5084a.Phone.b(phone3, bVar9, companion5.a(gVar3), null, 4, null)));
            }
        } else {
            if (i16 != 0) {
                throw new oq.p();
            }
            j14.a aVar = this.checkEmailCorrectUC;
            j14.a.Params params = new j14.a.Params(fieldsData.getEmailFieldData().getValue(), false, vq.b.e(50), 2, null);
            hVar.f171650d = vq.j.a(bVar);
            hVar.f171651e = fieldsData;
            hVar.f171652f = companion;
            hVar.f171653g = emailFieldData;
            hVar.f171654h = fieldsData;
            bVar2 = bVar;
            hVar.f171655j = bVar2;
            hVar.f171658m = 0;
            hVar.f171659n = i15;
            hVar.f171660p = i16;
            hVar.f171663s = 1;
            objC3 = aVar.c(params, hVar);
            if (objC3 != objE) {
                i17 = 0;
                bVar3 = bVar2;
                contactInfoWriteFieldsData = fieldsData;
            }
        }
        objE = objE;
        return objE;
        gVar = (hz.g) objC3;
        ContactInfoWriteFieldsData contactInfoWriteFieldsData7 = fieldsData;
        i18 = i15;
        i19 = i17;
        contactInfoWriteFieldsData2 = contactInfoWriteFieldsData;
        contactInfoWriteFieldsData3 = contactInfoWriteFieldsData7;
        textInputB = ContactInfoWriteFieldsData.InterfaceC5084a.TextInput.b(emailFieldData, companion.a(gVar), null, 2, null);
        phoneFieldData = contactInfoWriteFieldsData2.getPhoneFieldData();
        companion2 = hz.b.INSTANCE;
        if (i18 == 1) {
            textInput = textInputB;
            contactInfoWriteFieldsData5 = contactInfoWriteFieldsData2;
            contactInfoWriteFieldsData6 = contactInfoWriteFieldsData3;
            gVar2 = hz.g.b.f86853b;
            bVarA = companion2.a(gVar2);
            companion4 = hz.b.INSTANCE;
            if (i18 != 1) {
                gVar3 = hz.g.b.f86853b;
                bVar9 = bVarA;
                companion5 = companion4;
                phone3 = phoneFieldData;
            } else {
                if (i18 != 0) {
                    throw new oq.p();
                }
                j14.n nVar5 = this.checkPhoneNumberCorrectUC;
                j14.n.a.CheckNumber checkNumber4 = new j14.n.a.CheckNumber(contactInfoWriteFieldsData5.getPhoneFieldData().getPhoneNumber(), false, 2, null);
                hVar.f171650d = vq.j.a(bVar3);
                hVar.f171651e = vq.j.a(contactInfoWriteFieldsData5);
                hVar.f171652f = phoneFieldData;
                hVar.f171653g = textInput;
                hVar.f171654h = contactInfoWriteFieldsData6;
                hVar.f171655j = bVarA;
                hVar.f171656k = companion4;
                hVar.f171657l = bVar2;
                hVar.f171658m = i19;
                hVar.f171659n = i18;
                hVar.f171660p = i16;
                hVar.f171663s = 3;
                objC2 = nVar5.c(checkNumber4, hVar);
                objE = objE;
                if (objC2 != objE) {
                    bVar7 = bVarA;
                    companion5 = companion4;
                    bVar8 = bVar2;
                    phone2 = phoneFieldData;
                    textInput2 = textInput;
                    objC3 = objC2;
                    gVar3 = (hz.g) objC3;
                    bVar9 = bVar7;
                    textInput = textInput2;
                    phone3 = phone2;
                    bVar2 = bVar8;
                }
            }
            return bVar2.b(contactInfoWriteFieldsData6.a(textInput, ContactInfoWriteFieldsData.InterfaceC5084a.Phone.b(phone3, bVar9, companion5.a(gVar3), null, 4, null)));
        }
        if (i18 == 0) {
            throw new oq.p();
        }
        j14.n nVar6 = this.checkPhoneNumberCorrectUC;
        bVar4 = bVar3;
        j14.n.a.CheckPrefix checkPrefix2 = new j14.n.a.CheckPrefix(contactInfoWriteFieldsData2.getPhoneFieldData().getPhoneNumber(), false, 2, null);
        hVar.f171650d = vq.j.a(bVar4);
        hVar.f171651e = contactInfoWriteFieldsData2;
        hVar.f171652f = phoneFieldData;
        hVar.f171653g = textInputB;
        hVar.f171654h = contactInfoWriteFieldsData3;
        hVar.f171655j = companion2;
        hVar.f171656k = bVar2;
        hVar.f171658m = i19;
        hVar.f171659n = i18;
        hVar.f171660p = i16;
        hVar.f171663s = 2;
        objC = nVar6.c(checkPrefix2, hVar);
        if (objC != objE) {
            objE = objE;
            i25 = i19;
            phone = phoneFieldData;
            textInput = textInputB;
            bVar5 = bVar2;
            contactInfoWriteFieldsData4 = contactInfoWriteFieldsData3;
            bVar6 = bVar4;
            objC3 = objC;
            companion3 = companion2;
            hz.g gVar6 = (hz.g) objC3;
            int i210 = i25;
            phoneFieldData = phone;
            i19 = i210;
            gVar2 = gVar6;
            contactInfoWriteFieldsData5 = contactInfoWriteFieldsData2;
            companion2 = companion3;
            contactInfoWriteFieldsData6 = contactInfoWriteFieldsData4;
            bVar3 = bVar6;
            bVar2 = bVar5;
            bVarA = companion2.a(gVar2);
            companion4 = hz.b.INSTANCE;
            if (i18 != 1) {
                gVar3 = hz.g.b.f86853b;
                bVar9 = bVarA;
                companion5 = companion4;
                phone3 = phoneFieldData;
            } else {
                if (i18 != 0) {
                    throw new oq.p();
                }
                j14.n nVar7 = this.checkPhoneNumberCorrectUC;
                j14.n.a.CheckNumber checkNumber5 = new j14.n.a.CheckNumber(contactInfoWriteFieldsData5.getPhoneFieldData().getPhoneNumber(), false, 2, null);
                hVar.f171650d = vq.j.a(bVar3);
                hVar.f171651e = vq.j.a(contactInfoWriteFieldsData5);
                hVar.f171652f = phoneFieldData;
                hVar.f171653g = textInput;
                hVar.f171654h = contactInfoWriteFieldsData6;
                hVar.f171655j = bVarA;
                hVar.f171656k = companion4;
                hVar.f171657l = bVar2;
                hVar.f171658m = i19;
                hVar.f171659n = i18;
                hVar.f171660p = i16;
                hVar.f171663s = 3;
                objC2 = nVar7.c(checkNumber5, hVar);
                objE = objE;
                if (objC2 != objE) {
                    bVar7 = bVarA;
                    companion5 = companion4;
                    bVar8 = bVar2;
                    phone2 = phoneFieldData;
                    textInput2 = textInput;
                    objC3 = objC2;
                    gVar3 = (hz.g) objC3;
                    bVar9 = bVar7;
                    textInput = textInput2;
                    phone3 = phone2;
                    bVar2 = bVar8;
                }
            }
            return bVar2.b(contactInfoWriteFieldsData6.a(textInput, ContactInfoWriteFieldsData.InterfaceC5084a.Phone.b(phone3, bVar9, companion5.a(gVar3), null, 4, null)));
        }
        objE = objE;
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bl0.m u9(r41.b state) {
        b0 value = state.getFieldsData().getEmailFieldData().getValue();
        PhoneNumber phoneNumber = state.getFieldsData().getPhoneFieldData().getPhoneNumber();
        boolean z15 = iy.c0.e(value).length() == 0;
        boolean z16 = iy.c0.e(phoneNumber.g()).length() == 0;
        if (z15 && z16) {
            return bl0.m.b.f20042a;
        }
        b0 value2 = state.getFieldsData().getEmailFieldData().getValue();
        if (z16) {
            phoneNumber = null;
        }
        return new bl0.m.EmailOrPhone(value2, phoneNumber);
    }

    private final r41.b w9() {
        bl0.m mVarB5 = this.contract.b5();
        if (mVarB5 == null) {
            return new r41.b.Loading(new ContactInfoWriteFieldsData(null, null, 3, null), this.contract.K());
        }
        if (fr.t.c(mVarB5, bl0.m.b.f20042a)) {
            return new r41.b.NotLoading(new ContactInfoWriteFieldsData(null, null, 3, null), this.contract.K());
        }
        if (!(mVarB5 instanceof bl0.m.EmailOrPhone)) {
            throw new oq.p();
        }
        ContactInfoWriteFieldsData contactInfoWriteFieldsData = new ContactInfoWriteFieldsData(null, null, 3, null);
        bl0.m.EmailOrPhone emailOrPhone = (bl0.m.EmailOrPhone) mVarB5;
        ContactInfoWriteFieldsData.InterfaceC5084a.TextInput textInputB = ContactInfoWriteFieldsData.InterfaceC5084a.TextInput.b(contactInfoWriteFieldsData.getEmailFieldData(), null, emailOrPhone.getEmail(), 1, null);
        ContactInfoWriteFieldsData.InterfaceC5084a.Phone phoneFieldData = contactInfoWriteFieldsData.getPhoneFieldData();
        PhoneNumber phoneNumber = emailOrPhone.getPhoneNumber();
        if (phoneNumber == null) {
            phoneNumber = PhoneNumber.INSTANCE.a();
        }
        return new r41.b.NotLoading(contactInfoWriteFieldsData.a(textInputB, ContactInfoWriteFieldsData.InterfaceC5084a.Phone.b(phoneFieldData, null, null, phoneNumber, 3, null)), this.contract.K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final r41.b.NotLoading x9(ContactDetails contactDetails) {
        b0 value;
        b0 b0VarG;
        b0 b0VarH;
        Object next;
        ContactDetail emailData = contactDetails.getEmailData();
        if (emailData != null) {
            value = emailData.getValue();
            if (emailData.getStatus() != xi0.c.IN_REGISTRY) {
                value = null;
            }
        } else {
            value = null;
        }
        ContactDetail phoneData = contactDetails.getPhoneData();
        if (phoneData != null) {
            b0VarG = phoneData.getValue();
            if (phoneData.getStatus() != xi0.c.IN_REGISTRY) {
                b0VarG = null;
            }
        } else {
            b0VarG = null;
        }
        ContactDetail phoneData2 = contactDetails.getPhoneData();
        if (phoneData2 != null) {
            Iterator<T> it = phoneData2.a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fr.t.c(((ContactDetailAdditionalValue) next).getKey(), "PREFIX"));
            ContactDetailAdditionalValue contactDetailAdditionalValue = (ContactDetailAdditionalValue) next;
            b0VarH = contactDetailAdditionalValue != null ? contactDetailAdditionalValue.getValue() : null;
            if (phoneData2.getStatus() != xi0.c.IN_REGISTRY) {
                b0VarH = null;
            }
            if (b0VarH != null) {
                String strE = iy.c0.e(b0VarH);
                if (TextUtils.isDigitsOnly(strE)) {
                    b0VarH = iy.c0.g('+' + strE);
                }
            } else {
                b0VarH = null;
            }
        } else {
            b0VarH = null;
        }
        ContactInfoWriteFieldsData contactInfoWriteFieldsData = new ContactInfoWriteFieldsData(null, null, 3, null);
        ContactInfoWriteFieldsData.InterfaceC5084a.TextInput emailFieldData = contactInfoWriteFieldsData.getEmailFieldData();
        if (value == null) {
            value = contactInfoWriteFieldsData.getEmailFieldData().getValue();
        }
        ContactInfoWriteFieldsData.InterfaceC5084a.TextInput textInputB = ContactInfoWriteFieldsData.InterfaceC5084a.TextInput.b(emailFieldData, null, value, 1, null);
        ContactInfoWriteFieldsData.InterfaceC5084a.Phone phoneFieldData = contactInfoWriteFieldsData.getPhoneFieldData();
        if (b0VarH == null) {
            b0VarH = contactInfoWriteFieldsData.getPhoneFieldData().getPhoneNumber().h();
        }
        b0 b0VarC = PhoneNumber.c.c(b0VarH);
        if (b0VarG == null) {
            b0VarG = contactInfoWriteFieldsData.getPhoneFieldData().getPhoneNumber().g();
        }
        return new r41.b.NotLoading(contactInfoWriteFieldsData.a(textInputB, ContactInfoWriteFieldsData.InterfaceC5084a.Phone.b(phoneFieldData, null, null, new PhoneNumber(b0VarC, PhoneNumber.b.c(b0VarG), null), 3, null)), this.contract.K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r41.c.Data y9(r41.b bVar) {
        t41.d dVar = this.mapper;
        er.a<i0> aVarB9 = b9(r41.a.c.f171575a);
        return dVar.b(new t41.d.Params(bVar, new er.l() { // from class: r41.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f171605a, (ContactInfoWriteFieldsData) obj);
            }
        }, b9(r41.a.d.f171576a), aVarB9, b9(r41.a.e.f171577a), b9(r41.a.b.C4358a.f171571a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(q qVar, ContactInfoWriteFieldsData contactInfoWriteFieldsData) {
        qVar.d9(new r41.a.EditFieldsData(contactInfoWriteFieldsData));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(s41.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<r41.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<r41.b, r41.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<r41.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(r41.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }
}
