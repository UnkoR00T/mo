package a32;

import cb4.DialogData;
import d12.OAuthWebViewData;
import eo0.Recipient;
import eo0.b1;
import fr.q0;
import java.util.List;
import ju.z0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p02.g0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 M2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001NBS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!J$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0082@¢\u0006\u0004\b\"\u0010!J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010A\u001a\b\u0012\u0004\u0012\u00020<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030B8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006O"}, d2 = {"La32/v;", "Ll00/g;", "La32/b;", "La32/a;", "La32/c;", "", "Lyy/a;", "stateMachineFactory", "Lb32/e;", "mapper", "Lb32/c;", "dialogMapper", "Lib4/c;", "genericDomainErrorMapper", "Lp02/l;", "fetchRecipientsUC", "Lx02/b;", "addRecipientWithServiceTypeValidationUC", "Lc12/j;", "resultWarningDialogMapper", "Lp02/g0;", "hasActiveEdorInboxUC", "Lm22/h;", "setupData", "<init>", "(Lyy/a;Lb32/e;Lb32/c;Lib4/c;Lp02/l;Lx02/b;Lc12/j;Lp02/g0;Lm22/h;)V", "state", "La32/c$a;", "F9", "(La32/b;)La32/c$a;", "Lk10/c0;", "Lk10/l;", "J9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "B9", "Ldx/b;", "domainError", "Loq/i0;", "E9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "b", "Lb32/e;", "c", "Lb32/c;", "d", "Lib4/c;", "e", "Lp02/l;", "f", "Lx02/b;", "g", "Lc12/j;", "h", "Lp02/g0;", "j", "Lm22/h;", "k", "La32/b;", "initialState", "Lxw/b;", "La32/a$j;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "p", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<State, a32.a> implements a32.c, zx.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f2436p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f2437q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f2438r = gu.d.q(300, gu.e.MILLISECONDS);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b32.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b32.c dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p02.l fetchRecipientsUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final x02.b addRecipientWithServiceTypeValidationUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c12.j resultWarningDialogMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g0 hasActiveEdorInboxUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final m22.h setupData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a32.a.j> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, a32.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<a32.c.Data> state;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La32/v$a;", "", "<init>", "()V", "Lgu/b;", "DEFAULT_SEARCH_DEBOUNCE_DURATION", "J", "", "MIN_QUERY_CHAR_NUMBER", "I", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2452e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2454g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2452e = obj;
            this.f2454g |= PKIFailureInfo.systemUnavail;
            return v.this.B9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2456e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2458g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2456e = obj;
            this.f2458g |= PKIFailureInfo.systemUnavail;
            return v.this.J9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<a32.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f2459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f2460b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f2461a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f2462b;

            /* JADX INFO: renamed from: a32.v$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0035a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f2463d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f2464e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f2465f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f2467h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f2468j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f2469k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f2470l;

                public C0035a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f2463d = obj;
                    this.f2464e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f2461a = hVar;
                this.f2462b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0035a c0035a;
                if (eVar instanceof C0035a) {
                    c0035a = (C0035a) eVar;
                    int i15 = c0035a.f2464e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0035a.f2464e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0035a = new C0035a(eVar);
                    }
                } else {
                    c0035a = new C0035a(eVar);
                }
                Object obj2 = c0035a.f2463d;
                Object objE = uq.b.e();
                int i16 = c0035a.f2464e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f2461a;
                    a32.c.Data dataF9 = this.f2462b.F9((State) obj);
                    c0035a.f2465f = vq.j.a(obj);
                    c0035a.f2467h = vq.j.a(c0035a);
                    c0035a.f2468j = vq.j.a(obj);
                    c0035a.f2469k = vq.j.a(hVar);
                    c0035a.f2470l = 0;
                    c0035a.f2464e = 1;
                    if (hVar.F(dataF9, c0035a) == objE) {
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

        public d(mu.g gVar, v vVar) {
            this.f2459a = gVar;
            this.f2460b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super a32.c.Data> hVar, tq.e eVar) {
            Object objA = this.f2459a.a(new a(hVar, this.f2460b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La32/a$l;", "action", "La32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(La32/a$l;La32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a32.a.ShowErrorDialog, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f2473g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a32.a.ShowErrorDialog showErrorDialog = (a32.a.ShowErrorDialog) this.f2473g;
            Object objE = uq.b.e();
            int i15 = this.f2472f;
            if (i15 == 0) {
                oq.u.b(obj);
                DialogData dialogDataB = v.this.dialogMapper.b(new b32.c.Params(showErrorDialog.getDomainError()));
                xw.b<a32.a.j> bVarY1 = v.this.Y1();
                a32.a.j.ShowDialog showDialog = new a32.a.j.ShowDialog(dialogDataB);
                this.f2473g = vq.j.a(showErrorDialog);
                this.f2471e = vq.j.a(dialogDataB);
                this.f2472f = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        public final Object w(a32.a.ShowErrorDialog showErrorDialog, State state, tq.e<? super i0> eVar) {
            e eVar2 = v.this.new e(eVar);
            eVar2.f2473g = showErrorDialog;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La32/a$g;", "action", "La32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(La32/a$g;La32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a32.a.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2476f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f2477g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(ib4.c.b bVar) {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a32.a.Error error = (a32.a.Error) this.f2477g;
            Object objE = uq.b.e();
            int i15 = this.f2476f;
            if (i15 == 0) {
                oq.u.b(obj);
                jb4.b bVarB = v.this.genericDomainErrorMapper.b(new ib4.c.Params(error.getDomainError(), false, new er.l() { // from class: a32.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.f.O((ib4.c.b) obj2);
                    }
                }, 2, null));
                xw.b<a32.a.j> bVarY1 = v.this.Y1();
                a32.a.j.Error error2 = new a32.a.j.Error(bVarB);
                this.f2477g = vq.j.a(error);
                this.f2475e = vq.j.a(bVarB);
                this.f2476f = 1;
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
        public final Object w(a32.a.Error error, State state, tq.e<? super i0> eVar) {
            f fVar = v.this.new f(eVar);
            fVar.f2477g = error;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La32/a$h;", "<unused var>", "Lk10/c0;", "La32/b;", "state", "Lk10/l;", "<anonymous>", "(La32/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a32.a.h, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2480f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f2480f;
            Object objE = uq.b.e();
            int i15 = this.f2479e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            v vVar = v.this;
            this.f2480f = vq.j.a(c0Var);
            this.f2479e = 1;
            Object objB9 = vVar.B9(c0Var, this);
            return objB9 == objE ? objE : objB9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a32.a.h hVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = v.this.new g(eVar);
            gVar.f2480f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La32/a$b;", "<unused var>", "La32/b;", "Loq/i0;", "<anonymous>", "(La32/a$b;La32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a32.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2482e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f2482e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a32.a.j> bVarY1 = v.this.Y1();
                a32.a.j.d dVar = a32.a.j.d.f2394a;
                this.f2482e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(a32.a.b bVar, State state, tq.e<? super i0> eVar) {
            return v.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La32/a$f;", "<unused var>", "La32/b;", "state", "Loq/i0;", "<anonymous>", "(La32/a$f;La32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a32.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2485f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f2485f;
            Object objE = uq.b.e();
            int i15 = this.f2484e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (state.getIsSearchActive()) {
                    v.this.d9(new a32.a.ChangeActiveState(false));
                } else {
                    xw.b<a32.a.j> bVarY1 = v.this.Y1();
                    a32.a.j.C0034a c0034a = a32.a.j.C0034a.f2391a;
                    this.f2485f = vq.j.a(state);
                    this.f2484e = 1;
                    if (bVarY1.F(c0034a, this) == objE) {
                        return objE;
                    }
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
        public final Object w(a32.a.f fVar, State state, tq.e<? super i0> eVar) {
            i iVar = v.this.new i(eVar);
            iVar.f2485f = state;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La32/a$c;", "action", "Lk10/c0;", "La32/b;", "state", "Lk10/l;", "<anonymous>", "(La32/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a32.a.ChangeActiveState, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f2489g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a32.a.ChangeActiveState changeActiveState, State state) {
            return State.b(state, changeActiveState.getIsActive(), null, null, null, false, 30, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a32.a.ChangeActiveState changeActiveState = (a32.a.ChangeActiveState) this.f2488f;
            k10.c0 c0Var = (k10.c0) this.f2489g;
            uq.b.e();
            if (this.f2487e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a32.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.j.O(changeActiveState, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a32.a.ChangeActiveState changeActiveState, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = new j(eVar);
            jVar.f2488f = changeActiveState;
            jVar.f2489g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La32/a$d;", "action", "Lk10/c0;", "La32/b;", "state", "Lk10/l;", "<anonymous>", "(La32/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<a32.a.ChangeQuery, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2491f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f2492g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a32.a.ChangeQuery changeQuery, State state) {
            return State.b(state, false, changeQuery.getQuery(), null, null, false, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a32.a.ChangeQuery changeQuery = (a32.a.ChangeQuery) this.f2491f;
            k10.c0 c0Var = (k10.c0) this.f2492g;
            uq.b.e();
            if (this.f2490e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a32.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.k.O(changeQuery, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a32.a.ChangeQuery changeQuery, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = new k(eVar);
            kVar.f2491f = changeQuery;
            kVar.f2492g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"La32/a$e;", "<unused var>", "Lk10/c0;", "La32/b;", "state", "Lk10/l;", "<anonymous>", "(La32/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a32.a.e, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2494f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, false, "", null, null, false, 17, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f2494f;
            uq.b.e();
            if (this.f2493e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a32.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.l.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a32.a.e eVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            l lVar = new l(eVar2);
            lVar.f2494f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "La32/b;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2496f;

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f2496f;
            Object objE = uq.b.e();
            int i15 = this.f2495e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            v vVar = v.this;
            this.f2496f = vq.j.a(c0Var);
            this.f2495e = 1;
            Object objJ9 = vVar.J9(c0Var, this);
            return objJ9 == objE ? objE : objJ9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((m) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            m mVar = v.this.new m(eVar);
            mVar.f2496f = obj;
            return mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La32/a$i;", "<unused var>", "La32/b;", "Loq/i0;", "<anonymous>", "(La32/a$i;La32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<a32.a.i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2498e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(v vVar) {
            vVar.d9(a32.a.h.f2389a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f2498e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a32.a.j> bVarY1 = v.this.Y1();
                final v vVar = v.this;
                a32.a.j.GoToAuthorization goToAuthorization = new a32.a.j.GoToAuthorization(new OAuthWebViewData(new er.a() { // from class: a32.a0
                    @Override // er.a
                    public final Object a() {
                        return v.n.O(vVar);
                    }
                }));
                this.f2498e = 1;
                if (bVarY1.F(goToAuthorization, this) == objE) {
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
        public final Object w(a32.a.i iVar, State state, tq.e<? super i0> eVar) {
            return v.this.new n(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La32/a$a;", "action", "La32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(La32/a$a;La32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<a32.a.AddRecipient, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f2501f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2502g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f2503h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f2504j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f2505k;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
        
            if (r2.E9(r3, r9) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
        
            if (r2.F(r3, r9) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
        
            if (r2.F(r4, r9) == r1) goto L34;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a32.v.o.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a32.a.AddRecipient addRecipient, State state, tq.e<? super i0> eVar) {
            o oVar = v.this.new o(eVar);
            oVar.f2505k = addRecipient;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La32/a$k;", "action", "La32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(La32/a$k;La32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a32.a.RecipientClick, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f2507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f2510h;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a32.a.RecipientClick recipientClick = (a32.a.RecipientClick) this.f2510h;
            Object objE = uq.b.e();
            int i15 = this.f2509g;
            if (i15 == 0) {
                oq.u.b(obj);
                b1 warningType = recipientClick.getRecipient().getWarningType();
                if (warningType != null) {
                    v vVar = v.this;
                    xw.b<a32.a.j> bVarY1 = vVar.Y1();
                    a32.a.j.ShowDialog showDialog = new a32.a.j.ShowDialog(vVar.resultWarningDialogMapper.b(new c12.j.Params(warningType, vVar.b9(new a32.a.AddRecipient(recipientClick.getRecipient())))));
                    this.f2510h = recipientClick;
                    this.f2507e = vq.j.a(warningType);
                    this.f2508f = 0;
                    this.f2509g = 1;
                    if (bVarY1.F(showDialog, this) == objE) {
                        return objE;
                    }
                } else {
                    v.this.d9(new a32.a.AddRecipient(recipientClick.getRecipient()));
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
        public final Object w(a32.a.RecipientClick recipientClick, State state, tq.e<? super i0> eVar) {
            p pVar = v.this.new p(eVar);
            pVar.f2510h = recipientClick;
            return pVar.J(i0.f148189a);
        }
    }

    public v(yy.a aVar, b32.e eVar, b32.c cVar, ib4.c cVar2, p02.l lVar, x02.b bVar, c12.j jVar, g0 g0Var, m22.h hVar) {
        this.mapper = eVar;
        this.dialogMapper = cVar;
        this.genericDomainErrorMapper = cVar2;
        this.fetchRecipientsUC = lVar;
        this.addRecipientWithServiceTypeValidationUC = bVar;
        this.resultWarningDialogMapper = jVar;
        this.hasActiveEdorInboxUC = g0Var;
        this.setupData = hVar;
        State state = new State(false, null, null, null, g0Var.b(gz.b.a.C1792a.f78542a).booleanValue(), 15, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: a32.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.M9(this.f2435a, (k10.v) obj);
            }
        });
        this.state = a9(new d(e9().getState(), this), F9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B9(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f2454g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f2454g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objG = bVar.f2452e;
        Object objE = uq.b.e();
        int i16 = bVar.f2454g;
        if (i16 == 0) {
            oq.u.b(objG);
            p02.l lVar = this.fetchRecipientsUC;
            p02.l.Params params = new p02.l.Params(c0Var.a().getQuery());
            bVar.f2451d = c0Var;
            bVar.f2454g = 1;
            objG = lVar.g(params, bVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) bVar.f2451d;
            oq.u.b(objG);
        }
        dx.i iVar = (dx.i) objG;
        if (!(iVar instanceof dx.i.Left)) {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final List list = (List) ((dx.i.Right) iVar).b();
            return c0Var.b(new er.l() { // from class: a32.s
                @Override // er.l
                public final Object b(Object obj) {
                    return v.D9(list, (State) obj);
                }
            });
        }
        final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
        if (!(bVar2 instanceof dx.b.Business) || ((dx.b.Business) bVar2).getType() != n02.a.REFRESH_TOKEN_EXPIRED) {
            return c0Var.b(new er.l() { // from class: a32.r
                @Override // er.l
                public final Object b(Object obj) {
                    return v.C9(bVar2, (State) obj);
                }
            });
        }
        d9(a32.a.i.f2390a);
        return c0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State C9(dx.b bVar, State state) {
        return State.b(state, false, null, null, bVar, false, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State D9(List list, State state) {
        return State.b(state, false, null, list, null, false, 19, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    public final Object E9(dx.b bVar, tq.e<? super i0> eVar) {
        boolean z15 = bVar instanceof dx.b.Business;
        if (z15) {
            dx.b.Business business = (dx.b.Business) bVar;
            if (business.getType() == n02.a.ADD_RECIPIENT_NO_EDOR_ADDRESS || business.getType() == n02.a.ADD_RECIPIENT_NO_EPUAP_ADDRESS || business.getType() == n02.a.ADD_RECIPIENT_E_PUAP || business.getType() == n02.a.ADD_RECIPIENT_EDOR_INBOX_INACTIVE) {
                d9(new a32.a.ShowErrorDialog(business));
            } else {
                if (!z15 && ((dx.b.Business) bVar).getType() == n02.a.ADD_RECIPIENT_EXISTS) {
                    Object objF = Y1().F(a32.a.j.c.f2393a, eVar);
                    return objF == uq.b.e() ? objF : i0.f148189a;
                }
                d9(new a32.a.Error(bVar));
            }
        } else {
            if (!z15) {
            }
            d9(new a32.a.Error(bVar));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a32.c.Data F9(State state) {
        return this.mapper.b(new b32.e.Params(state, new er.l() { // from class: a32.m
            @Override // er.l
            public final Object b(Object obj) {
                return v.G9(this.f2429a, (String) obj);
            }
        }, new er.l() { // from class: a32.n
            @Override // er.l
            public final Object b(Object obj) {
                return v.H9(this.f2430a, ((Boolean) obj).booleanValue());
            }
        }, b9(a32.a.e.f2386a), b9(a32.a.f.f2387a), new er.l() { // from class: a32.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.I9(this.f2431a, (Recipient) obj);
            }
        }, b9(a32.a.b.f2383a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(v vVar, String str) {
        vVar.d9(new a32.a.ChangeQuery(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(v vVar, boolean z15) {
        vVar.d9(new a32.a.ChangeActiveState(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(v vVar, Recipient recipient) {
        vVar.d9(new a32.a.RecipientClick(recipient));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J9(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f2458g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f2458g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f2456e;
        Object objE = uq.b.e();
        int i16 = cVar.f2458g;
        if (i16 == 0) {
            oq.u.b(obj);
            if (c0Var.a().getQuery().length() < 3) {
                return c0Var.a().getQuery().length() == 0 ? c0Var.b(new er.l() { // from class: a32.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.K9((State) obj2);
                    }
                }) : c0Var.c();
            }
            long j15 = f2438r;
            cVar.f2455d = c0Var;
            cVar.f2458g = 1;
            if (z0.c(j15, cVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) cVar.f2455d;
            oq.u.b(obj);
        }
        d9(a32.a.h.f2389a);
        return c0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State K9(State state) {
        return State.b(state, false, null, null, null, false, 19, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(State.class), new er.l() { // from class: a32.l
            @Override // er.l
            public final Object b(Object obj) {
                return v.N9(this.f2428a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(final v vVar, k10.z zVar) {
        i iVar = vVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a32.a.f.class), oVar, iVar);
        zVar.v(q0.c(a32.a.ChangeActiveState.class), oVar, new j(null));
        zVar.v(q0.c(a32.a.ChangeQuery.class), oVar, new k(null));
        zVar.v(q0.c(a32.a.e.class), oVar, new l(null));
        zVar.N(new er.l() { // from class: a32.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.O9((State) obj);
            }
        }, new er.l() { // from class: a32.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.P9(this.f2432a, (k10.x) obj);
            }
        });
        zVar.x(q0.c(a32.a.i.class), oVar, vVar.new n(null));
        zVar.x(q0.c(a32.a.AddRecipient.class), oVar, vVar.new o(null));
        zVar.x(q0.c(a32.a.RecipientClick.class), oVar, vVar.new p(null));
        zVar.x(q0.c(a32.a.ShowErrorDialog.class), oVar, vVar.new e(null));
        zVar.x(q0.c(a32.a.Error.class), oVar, vVar.new f(null));
        zVar.v(q0.c(a32.a.h.class), oVar, vVar.new g(null));
        zVar.x(q0.c(a32.a.b.class), oVar, vVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object O9(State state) {
        return state.getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(v vVar, k10.x xVar) {
        xVar.A(vVar.new m(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: L9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(m22.h hVar) {
        super.P5(hVar);
    }

    @Override // zx.b
    public xw.b<a32.a.j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, a32.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<a32.c.Data> getState() {
        return this.state;
    }
}
