package cr2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import iy.b0;
import java.util.ArrayList;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import uq2.PassportVisualization;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R&\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010>\u001a\b\u0012\u0004\u0012\u000209088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010D\u001a\b\u0012\u0004\u0012\u00020\u001f0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcr2/t;", "Ll00/g;", "Lcr2/c;", "Lcr2/a;", "Lcr2/d;", "", "Lyy/a;", "stateMachineFactory", "Ler2/c;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lmx/c;", "labelProvider", "Ltq2/a;", "passportInvalidationUserDataInteractor", "Lcr2/b;", "setupData", "<init>", "(Lyy/a;Ler2/c;Lib4/c;Lac4/a;Lmx/c;Ltq2/a;Lcr2/b;)V", "Lcb4/d;", "A9", "()Lcb4/d;", "Ldx/b;", "domainError", "retryAction", "Loq/i0;", "w9", "(Ldx/b;Lcr2/a;Ltq/e;)Ljava/lang/Object;", "Lcr2/d$a;", "y9", "(Lcr2/c;)Lcr2/d$a;", "b", "Ler2/c;", "c", "Lib4/c;", "d", "Lac4/a;", "e", "Lmx/c;", "f", "Ltq2/a;", "g", "Lcr2/b;", "Lcr2/c$b;", "h", "Lcr2/c$b;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lcr2/a$e;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<cr2.c, cr2.a> implements cr2.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final tq2.a passportInvalidationUserDataInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final cr2.c.b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<cr2.c, cr2.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cr2.a.e> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<cr2.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<cr2.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f37406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f37407b;

        /* JADX INFO: renamed from: cr2.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0785a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f37408a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f37409b;

            /* JADX INFO: renamed from: cr2.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0786a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f37410d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f37411e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f37412f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f37414h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f37415j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f37416k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f37417l;

                public C0786a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f37410d = obj;
                    this.f37411e |= PKIFailureInfo.systemUnavail;
                    return C0785a.this.F(null, this);
                }
            }

            public C0785a(mu.h hVar, t tVar) {
                this.f37408a = hVar;
                this.f37409b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0786a c0786a;
                if (eVar instanceof C0786a) {
                    c0786a = (C0786a) eVar;
                    int i15 = c0786a.f37411e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0786a.f37411e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0786a = new C0786a(eVar);
                    }
                } else {
                    c0786a = new C0786a(eVar);
                }
                Object obj2 = c0786a.f37410d;
                Object objE = uq.b.e();
                int i16 = c0786a.f37411e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f37408a;
                    cr2.d.a aVarY9 = this.f37409b.y9((cr2.c) obj);
                    c0786a.f37412f = vq.j.a(obj);
                    c0786a.f37414h = vq.j.a(c0786a);
                    c0786a.f37415j = vq.j.a(obj);
                    c0786a.f37416k = vq.j.a(hVar);
                    c0786a.f37417l = 0;
                    c0786a.f37411e = 1;
                    if (hVar.F(aVarY9, c0786a) == objE) {
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
            this.f37406a = gVar;
            this.f37407b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super cr2.d.a> hVar, tq.e eVar) {
            Object objA = this.f37406a.a(new C0785a(hVar, this.f37407b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcr2/a$a;", "<unused var>", "Lcr2/c;", "Loq/i0;", "<anonymous>", "(Lcr2/a$a;Lcr2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<cr2.a.C0780a, cr2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37418e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f37418e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cr2.a.e> bVarY1 = t.this.Y1();
                cr2.a.e.C0781a c0781a = cr2.a.e.C0781a.f37359a;
                this.f37418e = 1;
                if (bVarY1.F(c0781a, this) == objE) {
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
        public final Object w(cr2.a.C0780a c0780a, cr2.c cVar, tq.e<? super i0> eVar) {
            return t.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcr2/a$f;", "action", "Lcr2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcr2/a$f;Lcr2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<cr2.a.ShowDialog, cr2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37421f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cr2.a.ShowDialog showDialog = (cr2.a.ShowDialog) this.f37421f;
            Object objE = uq.b.e();
            int i15 = this.f37420e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cr2.a.e> bVarY1 = t.this.Y1();
                cr2.a.e.ShowDialog showDialog2 = new cr2.a.e.ShowDialog(showDialog.getDialogData());
                this.f37421f = vq.j.a(showDialog);
                this.f37420e = 1;
                if (bVarY1.F(showDialog2, this) == objE) {
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
        public final Object w(cr2.a.ShowDialog showDialog, cr2.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = t.this.new c(eVar);
            cVar2.f37421f = showDialog;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcr2/c$b;", "it", "Loq/i0;", "<anonymous>", "(Lcr2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<cr2.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37423e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f37423e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0 passportNumber = t.this.setupData.getPassportNumber();
            if (passportNumber == null) {
                px.f.f163100a.b("No passport number passed, fetching passports.", px.c.a(t.this));
                t.this.d9(cr2.a.c.f37356a);
            } else {
                px.f.f163100a.b("Setting up screen via passport number.", px.c.a(t.this));
                t.this.d9(new cr2.a.GetPassportFromStorage(passportNumber));
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(cr2.c.b bVar, tq.e<? super i0> eVar) {
            return ((d) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return t.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcr2/a$d;", "action", "Lcr2/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcr2/a$d;Lcr2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<cr2.a.GetPassportFromStorage, cr2.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37426f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f37428e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f37429f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f37430g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f37431h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f37432j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ t f37433k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ cr2.a.GetPassportFromStorage f37434l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, cr2.a.GetPassportFromStorage getPassportFromStorage, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f37433k = tVar;
                this.f37434l = getPassportFromStorage;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
            
                if (r1.w9(r2, r4, r7) == r0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
            
                if (r1.F(r4, r7) == r0) goto L25;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r7.f37432j
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r4) goto L2b
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r7.f37429f
                    uq2.g r0 = (uq2.PassportVisualization) r0
                    goto L22
                L16:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1e:
                    java.lang.Object r0 = r7.f37429f
                    dx.b r0 = (dx.b) r0
                L22:
                    java.lang.Object r0 = r7.f37428e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r8)
                    goto Lac
                L2b:
                    oq.u.b(r8)
                    goto L47
                L2f:
                    oq.u.b(r8)
                    cr2.t r8 = r7.f37433k
                    tq2.a r8 = cr2.t.q9(r8)
                    cr2.a$d r1 = r7.f37434l
                    iy.b0 r1 = r1.getPassportNumber()
                    r7.f37432j = r4
                    java.lang.Object r8 = r8.b(r1, r7)
                    if (r8 != r0) goto L47
                    goto Lab
                L47:
                    dx.i r8 = (dx.i) r8
                    cr2.t r1 = r7.f37433k
                    cr2.a$d r4 = r7.f37434l
                    boolean r5 = r8 instanceof dx.i.Left
                    r6 = 0
                    if (r5 == 0) goto L74
                    r2 = r8
                    dx.i$b r2 = (dx.i.Left) r2
                    java.lang.Object r2 = r2.b()
                    dx.b r2 = (dx.b) r2
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f37428e = r8
                    java.lang.Object r8 = vq.j.a(r2)
                    r7.f37429f = r8
                    r7.f37430g = r6
                    r7.f37431h = r6
                    r7.f37432j = r3
                    java.lang.Object r8 = cr2.t.s9(r1, r2, r4, r7)
                    if (r8 != r0) goto Lac
                    goto Lab
                L74:
                    boolean r3 = r8 instanceof dx.i.Right
                    if (r3 == 0) goto Laf
                    r3 = r8
                    dx.i$c r3 = (dx.i.Right) r3
                    java.lang.Object r3 = r3.b()
                    uq2.g r3 = (uq2.PassportVisualization) r3
                    cr2.b r4 = cr2.t.r9(r1)
                    dr2.a r4 = r4.getContract()
                    dr2.a$a r5 = new dr2.a$a
                    r5.<init>(r3)
                    r4.N1(r5)
                    cr2.a$e$d r4 = cr2.a.e.d.f37362a
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f37428e = r8
                    java.lang.Object r8 = vq.j.a(r3)
                    r7.f37429f = r8
                    r7.f37430g = r6
                    r7.f37431h = r6
                    r7.f37432j = r2
                    java.lang.Object r8 = r1.F(r4, r7)
                    if (r8 != r0) goto Lac
                Lab:
                    return r0
                Lac:
                    oq.i0 r8 = oq.i0.f148189a
                    return r8
                Laf:
                    oq.p r8 = new oq.p
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: cr2.t.e.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f37433k, this.f37434l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cr2.a.GetPassportFromStorage getPassportFromStorage = (cr2.a.GetPassportFromStorage) this.f37426f;
            Object objE = uq.b.e();
            int i15 = this.f37425e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = t.this.callActionWithLoaderUseCase;
                a aVar2 = new a(t.this, getPassportFromStorage, null);
                this.f37426f = vq.j.a(getPassportFromStorage);
                this.f37425e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(cr2.a.GetPassportFromStorage getPassportFromStorage, cr2.c.b bVar, tq.e<? super i0> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f37426f = getPassportFromStorage;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcr2/a$c;", "action", "Lk10/c0;", "Lcr2/c$b;", "state", "Lk10/l;", "Lcr2/c;", "<anonymous>", "(Lcr2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<cr2.a.c, c0<cr2.c.b>, tq.e<? super k10.l<? extends cr2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37436f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f37437g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lcr2/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends cr2.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f37439e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f37440f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f37441g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f37442h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f37443j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f37444k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ t f37445l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ cr2.a.c f37446m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ c0<cr2.c.b> f37447n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, cr2.a.c cVar, c0<cr2.c.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f37445l = tVar;
                this.f37446m = cVar;
                this.f37447n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final cr2.c.a X(cr2.c.b bVar) {
                return cr2.c.a.f37368a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final cr2.c.Initialized Y(List list, cr2.c.b bVar) {
                return new cr2.c.Initialized(list);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                c0<cr2.c.b> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f37444k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    tq2.a aVar = this.f37445l.passportInvalidationUserDataInteractor;
                    this.f37444k = 1;
                    obj = aVar.a(this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (c0) this.f37440f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                t tVar = this.f37445l;
                cr2.a.c cVar = this.f37446m;
                c0<cr2.c.b> c0Var2 = this.f37447n;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    List list = (List) ((dx.i.Right) iVar).b();
                    final ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((PassportVisualization) obj2).getStatus() == uq2.e.ISSUED_TO_CITIZEN) {
                            arrayList.add(obj2);
                        }
                    }
                    return arrayList.isEmpty() ? c0Var2.d(new er.l() { // from class: cr2.u
                        @Override // er.l
                        public final Object b(Object obj3) {
                            return t.f.a.X((c.b) obj3);
                        }
                    }) : c0Var2.d(new er.l() { // from class: cr2.v
                        @Override // er.l
                        public final Object b(Object obj3) {
                            return t.f.a.Y(arrayList, (c.b) obj3);
                        }
                    });
                }
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                this.f37439e = vq.j.a(iVar);
                this.f37440f = c0Var2;
                this.f37441g = vq.j.a(bVar);
                this.f37442h = 0;
                this.f37443j = 0;
                this.f37444k = 2;
                if (tVar.w9(bVar, cVar, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f37445l, this.f37446m, this.f37447n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends cr2.c>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cr2.a.c cVar = (cr2.a.c) this.f37436f;
            c0 c0Var = (c0) this.f37437g;
            Object objE = uq.b.e();
            int i15 = this.f37435e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = t.this.callActionWithLoaderUseCase;
            a aVar2 = new a(t.this, cVar, c0Var, null);
            this.f37436f = vq.j.a(cVar);
            this.f37437g = vq.j.a(c0Var);
            this.f37435e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cr2.a.c cVar, c0<cr2.c.b> c0Var, tq.e<? super k10.l<? extends cr2.c>> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f37436f = cVar;
            fVar.f37437g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcr2/a$b;", "action", "Lcr2/c$c;", "state", "Loq/i0;", "<anonymous>", "(Lcr2/a$b;Lcr2/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<cr2.a.ChoosePassport, cr2.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f37448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f37449f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f37450g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f37451h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f37452j;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cr2.a.ChoosePassport choosePassport = (cr2.a.ChoosePassport) this.f37451h;
            cr2.c.Initialized initialized = (cr2.c.Initialized) this.f37452j;
            Object objE = uq.b.e();
            int i15 = this.f37450g;
            if (i15 == 0) {
                oq.u.b(obj);
                PassportVisualization passportVisualization = initialized.a().get(choosePassport.getListIndex());
                List listQ = pq.v.q(uq2.f.DIPLOMATIC, uq2.f.BUSINESS);
                if (listQ.contains(passportVisualization.getType())) {
                    t.this.d9(new cr2.a.ShowDialog(t.this.A9()));
                    return i0.f148189a;
                }
                t.this.setupData.getContract().N1(new dr2.a.Data(passportVisualization));
                xw.b<cr2.a.e> bVarY1 = t.this.Y1();
                cr2.a.e.c cVar = cr2.a.e.c.f37361a;
                this.f37451h = vq.j.a(choosePassport);
                this.f37452j = vq.j.a(initialized);
                this.f37448e = vq.j.a(passportVisualization);
                this.f37449f = vq.j.a(listQ);
                this.f37450g = 1;
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
        public final Object w(cr2.a.ChoosePassport choosePassport, cr2.c.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = t.this.new g(eVar);
            gVar.f37451h = choosePassport;
            gVar.f37452j = initialized;
            return gVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, er2.c cVar, ib4.c cVar2, ac4.a aVar2, mx.c cVar3, tq2.a aVar3, SetupData setupData) {
        this.mapper = cVar;
        this.genericDomainErrorMapper = cVar2;
        this.callActionWithLoaderUseCase = aVar2;
        this.labelProvider = cVar3;
        this.passportInvalidationUserDataInteractor = aVar3;
        this.setupData = setupData;
        cr2.c.b bVar = cr2.c.b.f37369a;
        this.initialState = bVar;
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: cr2.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.E9(this.f37395a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), y9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData A9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(qq2.a.f168116g0), this.labelProvider.c(qq2.a.f168114f0), new DialogButtonTextData(this.labelProvider.c(qq2.a.f168113f), null, new er.a() { // from class: cr2.q
            @Override // er.a
            public final Object a() {
                return t.B9();
            }
        }, 2, null), null, null, new er.a() { // from class: cr2.r
            @Override // er.a
            public final Object a() {
                return t.C9();
            }
        }, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(cr2.c.class), new er.l() { // from class: cr2.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.F9(this.f37390a, (z) obj);
            }
        });
        vVar.c(q0.c(cr2.c.b.class), new er.l() { // from class: cr2.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.G9(this.f37391a, (z) obj);
            }
        });
        vVar.c(q0.c(cr2.c.Initialized.class), new er.l() { // from class: cr2.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.H9(this.f37392a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(t tVar, z zVar) {
        b bVar = tVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(cr2.a.C0780a.class), oVar, bVar);
        zVar.x(q0.c(cr2.a.ShowDialog.class), oVar, tVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(t tVar, z zVar) {
        zVar.C(tVar.new d(null));
        e eVar = tVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(cr2.a.GetPassportFromStorage.class), oVar, eVar);
        zVar.v(q0.c(cr2.a.c.class), oVar, tVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(t tVar, z zVar) {
        g gVar = tVar.new g(null);
        zVar.x(q0.c(cr2.a.ChoosePassport.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w9(dx.b bVar, final cr2.a aVar, tq.e<? super i0> eVar) {
        Object objF = F(new cr2.a.e.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: cr2.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.x9(this.f37393a, aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(t tVar, cr2.a aVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            tVar.d9(cr2.a.C0780a.f37354a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            tVar.d9(aVar);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cr2.d.a y9(cr2.c cVar) {
        return this.mapper.b(new er2.c.Params(cVar, new er.l() { // from class: cr2.l
            @Override // er.l
            public final Object b(Object obj) {
                return t.z9(this.f37389a, ((Integer) obj).intValue());
            }
        }, b9(cr2.a.C0780a.f37354a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(t tVar, int i15) {
        tVar.d9(new cr2.a.ChoosePassport(i15));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<cr2.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<cr2.c, cr2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<cr2.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(cr2.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }
}
