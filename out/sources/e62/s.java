package e62;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import m42.DeleteCardsRequiredData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BC\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020G0F8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010H¨\u0006J"}, d2 = {"Le62/s;", "Ll00/g;", "Le62/c;", "Le62/a;", "Le62/d;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Le62/e;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "snackBarManagerStateHolder", "Lac4/a;", "callActionWithLoaderUseCase", "Lcs0/f;", "getCardsUseCase", "Le62/b;", "setupData", "<init>", "(Lyy/a;Le62/e;Lib4/c;Li70/n;Lac4/a;Lcs0/f;Le62/b;)V", "state", "Le62/d$a;", "r9", "(Le62/c;)Le62/d$a;", "data", "Loq/i0;", "s9", "(Le62/b;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Le62/e;", "c", "Lib4/c;", "d", "Li70/n;", "e", "Lac4/a;", "f", "Lcs0/f;", "g", "Le62/b;", "Le62/c$b;", "h", "Le62/c$b;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Le62/a$f;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<e62.c, e62.a> implements e62.d, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e62.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final cs0.f getCardsUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private PaymentsYourCardsSetupData setupData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final e62.c.b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<e62.c, e62.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e62.a.f> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<e62.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e62.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f47803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f47804b;

        /* JADX INFO: renamed from: e62.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1105a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f47805a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f47806b;

            /* JADX INFO: renamed from: e62.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1106a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f47807d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f47808e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f47809f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f47811h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f47812j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f47813k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f47814l;

                public C1106a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f47807d = obj;
                    this.f47808e |= PKIFailureInfo.systemUnavail;
                    return C1105a.this.F(null, this);
                }
            }

            public C1105a(mu.h hVar, s sVar) {
                this.f47805a = hVar;
                this.f47806b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1106a c1106a;
                if (eVar instanceof C1106a) {
                    c1106a = (C1106a) eVar;
                    int i15 = c1106a.f47808e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1106a.f47808e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1106a = new C1106a(eVar);
                    }
                } else {
                    c1106a = new C1106a(eVar);
                }
                Object obj2 = c1106a.f47807d;
                Object objE = uq.b.e();
                int i16 = c1106a.f47808e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f47805a;
                    e62.d.a aVarR9 = this.f47806b.r9((e62.c) obj);
                    c1106a.f47809f = vq.j.a(obj);
                    c1106a.f47811h = vq.j.a(c1106a);
                    c1106a.f47812j = vq.j.a(obj);
                    c1106a.f47813k = vq.j.a(hVar);
                    c1106a.f47814l = 0;
                    c1106a.f47808e = 1;
                    if (hVar.F(aVarR9, c1106a) == objE) {
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

        public a(mu.g gVar, s sVar) {
            this.f47803a = gVar;
            this.f47804b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e62.d.a> hVar, tq.e eVar) {
            Object objA = this.f47803a.a(new C1105a(hVar, this.f47804b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le62/a$g;", "action", "Le62/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Le62/a$g;Le62/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<e62.a.OnReturn, e62.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47816f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f47818a;

            static {
                int[] iArr = new int[u42.a.values().length];
                try {
                    iArr[u42.a.ADD_CARD_SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[u42.a.ADD_CARD_LIMIT_EXCEEDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[u42.a.ADD_CARD_FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[u42.a.DELETE_CARD_LAST_CARD_REMOVED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f47818a = iArr;
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e62.a.OnReturn onReturn = (e62.a.OnReturn) this.f47816f;
            uq.b.e();
            if (this.f47815e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u42.a cardOperationReturnResult = onReturn.getCardOperationReturnResult();
            s sVar = s.this;
            int i15 = a.f47818a[cardOperationReturnResult.ordinal()];
            if (i15 == 1) {
                sVar.d9(e62.a.c.f47731a);
                sVar.d9(new e62.a.ShowSnackBarNoIcon(sVar.mapper.i()));
            } else if (i15 == 2) {
                sVar.d9(new e62.a.ShowSnackBarWithCloseIcon(sVar.mapper.f()));
            } else if (i15 == 3) {
                sVar.d9(new e62.a.ShowSnackBarWithCloseIcon(sVar.mapper.h()));
            } else {
                if (i15 != 4) {
                    throw new oq.p();
                }
                sVar.d9(new e62.a.ShowSnackBarNoIcon(sVar.mapper.e()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(e62.a.OnReturn onReturn, e62.c cVar, tq.e<? super i0> eVar) {
            b bVar = s.this.new b(eVar);
            bVar.f47816f = onReturn;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le62/a$a;", "<unused var>", "Le62/c;", "Loq/i0;", "<anonymous>", "(Le62/a$a;Le62/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<e62.a.C1101a, e62.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47819e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f47819e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<e62.a.f> bVarY1 = s.this.Y1();
                e62.a.f.C1102a c1102a = e62.a.f.C1102a.f47734a;
                this.f47819e = 1;
                if (bVarY1.F(c1102a, this) == objE) {
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
        public final Object w(e62.a.C1101a c1101a, e62.c cVar, tq.e<? super i0> eVar) {
            return s.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le62/a$d;", "<unused var>", "Le62/c;", "Loq/i0;", "<anonymous>", "(Le62/a$d;Le62/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<e62.a.d, e62.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47821e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f47821e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<e62.a.f> bVarY1 = s.this.Y1();
                e62.a.f.c cVar = e62.a.f.c.f47736a;
                this.f47821e = 1;
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
        public final Object w(e62.a.d dVar, e62.c cVar, tq.e<? super i0> eVar) {
            return s.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le62/a$i;", "action", "Le62/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Le62/a$i;Le62/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<e62.a.ShowSnackBarWithCloseIcon, e62.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47824f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e62.a.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon = (e62.a.ShowSnackBarWithCloseIcon) this.f47824f;
            uq.b.e();
            if (this.f47823e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.y(new p50.a.DefaultWithIcon(showSnackBarWithCloseIcon.getMessageLabel(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(e62.a.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon, e62.c cVar, tq.e<? super i0> eVar) {
            e eVar2 = s.this.new e(eVar);
            eVar2.f47824f = showSnackBarWithCloseIcon;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le62/a$h;", "action", "Le62/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Le62/a$h;Le62/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<e62.a.ShowSnackBarNoIcon, e62.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47826e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47827f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e62.a.ShowSnackBarNoIcon showSnackBarNoIcon = (e62.a.ShowSnackBarNoIcon) this.f47827f;
            uq.b.e();
            if (this.f47826e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.y(new p50.a.Default(showSnackBarNoIcon.getMessageLabel(), false, null, 6, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(e62.a.ShowSnackBarNoIcon showSnackBarNoIcon, e62.c cVar, tq.e<? super i0> eVar) {
            f fVar = s.this.new f(eVar);
            fVar.f47827f = showSnackBarNoIcon;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le62/a$e;", "<unused var>", "Le62/c;", "Loq/i0;", "<anonymous>", "(Le62/a$e;Le62/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<e62.a.e, e62.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47829e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f47829e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.B0();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(e62.a.e eVar, e62.c cVar, tq.e<? super i0> eVar2) {
            return s.this.new g(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le62/a$b;", "action", "Le62/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Le62/a$b;Le62/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<e62.a.Error, e62.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47832f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(s sVar, e62.a.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    sVar.d9(e62.a.C1101a.f47728a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    error.b().a();
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final e62.a.Error error = (e62.a.Error) this.f47832f;
            Object objE = uq.b.e();
            int i15 = this.f47831e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<e62.a.f> bVarY1 = s.this.Y1();
                ib4.c cVar = s.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final s sVar = s.this;
                e62.a.f.Error error2 = new e62.a.f.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: e62.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.h.O(sVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f47832f = vq.j.a(error);
                this.f47831e = 1;
                if (bVarY1.F(error2, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e62.a.Error error, e62.c cVar, tq.e<? super i0> eVar) {
            h hVar = s.this.new h(eVar);
            hVar.f47832f = error;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le62/a$c;", "<unused var>", "Lk10/c0;", "Le62/c;", "state", "Lk10/l;", "<anonymous>", "(Le62/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<e62.a.c, c0<e62.c>, tq.e<? super k10.l<? extends e62.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47835f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Le62/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends e62.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f47837e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ s f47838f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<e62.c> f47839g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, c0<e62.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f47838f = sVar;
                this.f47839g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final e62.c V(List list, e62.c cVar) {
                return !list.isEmpty() ? new e62.c.Initialized(list) : e62.c.a.f47743a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f47837e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    cs0.f fVar = this.f47838f.getCardsUseCase;
                    cs0.f.Params params = new cs0.f.Params(false);
                    this.f47837e = 1;
                    obj = fVar.c(params, this);
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
                s sVar = this.f47838f;
                c0<e62.c> c0Var = this.f47839g;
                if (iVar instanceof dx.i.Left) {
                    sVar.d9(new e62.a.Error((dx.b) ((dx.i.Left) iVar).b(), sVar.b9(e62.a.c.f47731a)));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: e62.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.i.a.V(list, (c) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f47838f, this.f47839g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends e62.c>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f47835f;
            Object objE = uq.b.e();
            int i15 = this.f47834e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = s.this.callActionWithLoaderUseCase;
            a aVar2 = new a(s.this, c0Var, null);
            this.f47835f = vq.j.a(c0Var);
            this.f47834e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(e62.a.c cVar, c0<e62.c> c0Var, tq.e<? super k10.l<? extends e62.c>> eVar) {
            i iVar = s.this.new i(eVar);
            iVar.f47835f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le62/c$b;", "it", "Loq/i0;", "<anonymous>", "(Le62/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<e62.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47840e;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f47840e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.d9(e62.a.c.f47731a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(e62.c.b bVar, tq.e<? super i0> eVar) {
            return ((j) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return s.this.new j(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le62/a$j;", "<unused var>", "Le62/c$c;", "state", "Loq/i0;", "<anonymous>", "(Le62/a$j;Le62/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<e62.a.j, e62.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47843f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e62.c.Initialized initialized = (e62.c.Initialized) this.f47843f;
            Object objE = uq.b.e();
            int i15 = this.f47842e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<e62.a.f> bVarY1 = s.this.Y1();
                e62.a.f.ToDeleteCards toDeleteCards = new e62.a.f.ToDeleteCards(new DeleteCardsRequiredData(m42.b.C3026b.f123756a, initialized.a()));
                this.f47843f = vq.j.a(initialized);
                this.f47842e = 1;
                if (bVarY1.F(toDeleteCards, this) == objE) {
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
        public final Object w(e62.a.j jVar, e62.c.Initialized initialized, tq.e<? super i0> eVar) {
            k kVar = s.this.new k(eVar);
            kVar.f47843f = initialized;
            return kVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, e62.e eVar, ib4.c cVar, i70.n nVar, ac4.a aVar2, cs0.f fVar, PaymentsYourCardsSetupData paymentsYourCardsSetupData) {
        this.mapper = eVar;
        this.genericDomainErrorMapper = cVar;
        this.snackBarManagerStateHolder = nVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getCardsUseCase = fVar;
        this.setupData = paymentsYourCardsSetupData;
        e62.c.b bVar = e62.c.b.f47744a;
        this.initialState = bVar;
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: e62.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.t9(this.f47792a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), r9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e62.d.a r9(e62.c state) {
        return this.mapper.b(new e62.e.Params(state, b9(e62.a.e.f47733a), b9(e62.a.C1101a.f47728a), b9(e62.a.j.f47741a), b9(e62.a.d.f47732a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(e62.c.class), new er.l() { // from class: e62.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.u9(this.f47789a, (z) obj);
            }
        });
        vVar.c(q0.c(e62.c.b.class), new er.l() { // from class: e62.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.v9(this.f47790a, (z) obj);
            }
        });
        vVar.c(q0.c(e62.c.Initialized.class), new er.l() { // from class: e62.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.w9(this.f47791a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(s sVar, z zVar) {
        b bVar = sVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(e62.a.OnReturn.class), oVar, bVar);
        zVar.x(q0.c(e62.a.C1101a.class), oVar, sVar.new c(null));
        zVar.x(q0.c(e62.a.d.class), oVar, sVar.new d(null));
        zVar.x(q0.c(e62.a.ShowSnackBarWithCloseIcon.class), oVar, sVar.new e(null));
        zVar.x(q0.c(e62.a.ShowSnackBarNoIcon.class), oVar, sVar.new f(null));
        zVar.x(q0.c(e62.a.e.class), oVar, sVar.new g(null));
        zVar.x(q0.c(e62.a.Error.class), oVar, sVar.new h(null));
        zVar.v(q0.c(e62.a.c.class), oVar, sVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(s sVar, z zVar) {
        zVar.C(sVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(s sVar, z zVar) {
        k kVar = sVar.new k(null);
        zVar.x(q0.c(e62.a.j.class), k10.o.CANCEL_PREVIOUS, kVar);
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<e62.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<e62.c, e62.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e62.d.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public void P5(PaymentsYourCardsSetupData data) {
        this.setupData = data;
        u42.a data2 = data.getData();
        if (data2 != null) {
            d9(new e62.a.OnReturn(data2));
        }
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
