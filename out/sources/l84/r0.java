package l84;

import j84.NotificationsHistoryData;
import j84.NotificationsHistoryRecord;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001`B[\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\"2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J$\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\"2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0082@¢\u0006\u0004\b%\u0010&J+\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\"2\u0006\u0010!\u001a\u00020'2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+H\u0082@¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020706H\u0096\u0001¢\u0006\u0004\b8\u00109J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020:06H\u0096\u0001¢\u0006\u0004\b;\u00109R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010P\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010b\u001a\u00020]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR,\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030c8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bd\u0010e\u0012\u0004\bh\u0010i\u001a\u0004\bf\u0010gR \u0010q\u001a\b\u0012\u0004\u0012\u00020l0k8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020.0r8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bs\u0010t\u0012\u0004\bw\u0010i\u001a\u0004\bu\u0010v¨\u0006x"}, d2 = {"Ll84/r0;", "Ll00/g;", "Ll84/e;", "Ll84/d;", "Ll84/f;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lib4/c;", "errorMapper", "Lh84/a;", "interactorFactory", "Lh84/b;", "systemInteractorFactory", "Lm84/a;", "notificationsHistoryMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lk84/b;", "goToNotificationSettingsUseCase", "Lk84/a;", "goToNotificationChannelsSettingsUseCase", "Loz/q;", "ownerViewLifecycleManager", "Lw74/a;", "featureConfig", "<init>", "(Lyy/a;Lib4/c;Lh84/a;Lh84/b;Lm84/a;Lac4/a;Lk84/b;Lk84/a;Loz/q;Lw74/a;)V", "Lk10/c0;", "Ll84/e$a;", "state", "Ll84/d$h;", "action", "Lk10/l;", "H9", "(Lk10/c0;Ll84/d$h;Ltq/e;)Ljava/lang/Object;", "E9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Ll84/d$g;", "Ll84/e$b;", "N9", "(Ll84/d$g;Lk10/c0;)Lk10/l;", "Loq/i0;", "J9", "(Ltq/e;)Ljava/lang/Object;", "Ll84/f$a;", "F9", "(Ll84/e;)Ll84/f$a;", "Ldx/b;", "domainError", "Ljb4/b;", "C9", "(Ldx/b;)Ljb4/b;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lib4/c;", "c", "Lh84/a;", "d", "Lh84/b;", "e", "Lm84/a;", "f", "Lac4/a;", "g", "Lk84/b;", "h", "Lk84/a;", "j", "Loz/q;", "k", "Lw74/a;", "Li84/a;", "l", "Loq/k;", "A9", "()Li84/a;", "notificationsHistoryDataInteractor", "Li84/b;", "m", "B9", "()Li84/b;", "notificationsHistorySystemInteractor", "Ll84/e$c;", "n", "Ll84/e$c;", "initialState", "Loz/j;", "p", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Ll84/d$e;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r0 extends l00.g<l84.e, l84.d> implements l84.f, zx.b, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h84.a interactorFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h84.b systemInteractorFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m84.a notificationsHistoryMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k84.b goToNotificationSettingsUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k84.a goToNotificationChannelsSettingsUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final w74.a featureConfig;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oq.k notificationsHistoryDataInteractor = oq.l.a(new er.a() { // from class: l84.p0
        @Override // er.a
        public final Object a() {
            return r0.K9(this.f117113a);
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oq.k notificationsHistorySystemInteractor = oq.l.a(new er.a() { // from class: l84.q0
        @Override // er.a
        public final Object a() {
            return r0.L9(this.f117115a);
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final l84.e.c initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<l84.e, l84.d> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l84.d.e> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<l84.f.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ll84/r0$a;", "Lf00/j0;", "Lw74/a;", "Ll84/r0;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<w74.a, r0> {
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f117132a;

        static {
            int[] iArr = new int[NotificationsHistoryRecord.a.values().length];
            try {
                iArr[NotificationsHistoryRecord.a.EXTERNAL_QUALIFIED_SIGNATURE_AUTHORIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationsHistoryRecord.a.TRUSTED_PROFILE_AUTHORIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationsHistoryRecord.a.NEW_PAYMENT_IN_OFFICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NotificationsHistoryRecord.a.COUNTRY_TRAVEL_ADVISORY_UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NotificationsHistoryRecord.a.NOT_MAPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f117132a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ll84/e$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super k10.l<? extends l84.e.DataLoaded>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f117133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f117134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f117135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f117136h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f117137j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f117138k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f117139l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ k10.c0<l84.e> f117141n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k10.c0<l84.e> c0Var, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f117141n = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l84.e.DataLoaded V(NotificationsHistoryData notificationsHistoryData, boolean z15, l84.e eVar) {
            return new l84.e.DataLoaded(notificationsHistoryData, z15, true);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0083  */
        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
        /* JADX WARN: Code duplicated, block: B:26:0x0099  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:61:0x0157  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            boolean z15;
            dx.i iVar;
            r0 r0Var;
            k10.c0<l84.e> c0Var;
            List<NotificationsHistoryRecord> listB;
            int i15;
            final boolean z16;
            final NotificationsHistoryData notificationsHistoryData;
            k10.c0<l84.e> c0Var2;
            dx.b bVar;
            xw.b<l84.d.e> bVarY1;
            l84.d.e.Error error;
            k10.c0<l84.e> c0Var3;
            Object objE = uq.b.e();
            int i16 = this.f117139l;
            if (i16 == 0) {
                oq.u.b(obj);
                i84.b bVarB9 = r0.this.B9();
                this.f117139l = 1;
                obj = bVarB9.a(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        c0Var3 = (k10.c0) this.f117135g;
                        oq.u.b(obj);
                        c0Var = c0Var3;
                        return c0Var.c();
                    }
                    if (i16 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z16 = this.f117133e;
                    notificationsHistoryData = (NotificationsHistoryData) this.f117136h;
                    c0Var2 = (k10.c0) this.f117135g;
                    oq.u.b(obj);
                    return c0Var2.d(new er.l() { // from class: l84.s0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r0.c.V(notificationsHistoryData, z16, (e) obj2);
                        }
                    });
                }
                z15 = this.f117133e;
                oq.u.b(obj);
                iVar = (dx.i) obj;
                r0Var = r0.this;
                c0Var = this.f117141n;
                if (!(iVar instanceof dx.i.Left)) {
                    bVar = (dx.b) ((dx.i.Left) iVar).b();
                    if (bVar instanceof dx.b.Deactivate) {
                        r0Var.d9(new l84.d.ShowEmptyState(z15));
                    } else {
                        bVarY1 = r0Var.Y1();
                        error = new l84.d.e.Error(r0Var.C9(bVar));
                        this.f117134f = vq.j.a(iVar);
                        this.f117135g = c0Var;
                        this.f117136h = vq.j.a(bVar);
                        this.f117133e = z15;
                        this.f117137j = 0;
                        this.f117138k = 0;
                        this.f117139l = 3;
                        if (bVarY1.F(error, this) != objE) {
                            c0Var3 = c0Var;
                            c0Var = c0Var3;
                        }
                    }
                    return c0Var.c();
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                NotificationsHistoryData notificationsHistoryData2 = (NotificationsHistoryData) ((dx.i.Right) iVar).b();
                listB = notificationsHistoryData2.b();
                if (listB != null || listB.isEmpty()) {
                    r0Var.d9(new l84.d.ShowEmptyState(z15));
                    return c0Var.c();
                }
                i84.b bVarB10 = r0Var.B9();
                List<NotificationsHistoryRecord> listB2 = notificationsHistoryData2.b();
                if ((listB2 instanceof Collection) && listB2.isEmpty()) {
                    i15 = 0;
                } else {
                    Iterator<T> it = listB2.iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        if (!((NotificationsHistoryRecord) it.next()).getDisplayed() && (i15 = i15 + 1) < 0) {
                            pq.v.w();
                        }
                    }
                }
                i84.b.a.Overwrite overwrite = new i84.b.a.Overwrite(i15);
                this.f117134f = vq.j.a(iVar);
                this.f117135g = c0Var;
                this.f117136h = notificationsHistoryData2;
                this.f117133e = z15;
                this.f117137j = 0;
                this.f117138k = 0;
                this.f117139l = 4;
                if (bVarB10.c(overwrite, this) != objE) {
                    z16 = z15;
                    notificationsHistoryData = notificationsHistoryData2;
                    c0Var2 = c0Var;
                    return c0Var2.d(new er.l() { // from class: l84.s0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r0.c.V(notificationsHistoryData, z16, (e) obj2);
                        }
                    });
                }
                return objE;
            }
            oq.u.b(obj);
            boolean zIsEnabled = ((i84.b.InterfaceC2143b) obj).isEnabled();
            i84.a aVarA9 = r0.this.A9();
            this.f117133e = zIsEnabled;
            this.f117139l = 2;
            Object objA = aVarA9.a(this);
            if (objA != objE) {
                z15 = zIsEnabled;
                obj = objA;
                iVar = (dx.i) obj;
                r0Var = r0.this;
                c0Var = this.f117141n;
                if (!(iVar instanceof dx.i.Left)) {
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    NotificationsHistoryData notificationsHistoryData3 = (NotificationsHistoryData) ((dx.i.Right) iVar).b();
                    listB = notificationsHistoryData3.b();
                    if (listB != null) {
                    }
                    r0Var.d9(new l84.d.ShowEmptyState(z15));
                    return c0Var.c();
                }
                bVar = (dx.b) ((dx.i.Left) iVar).b();
                if (bVar instanceof dx.b.Deactivate) {
                    r0Var.d9(new l84.d.ShowEmptyState(z15));
                } else {
                    bVarY1 = r0Var.Y1();
                    error = new l84.d.e.Error(r0Var.C9(bVar));
                    this.f117134f = vq.j.a(iVar);
                    this.f117135g = c0Var;
                    this.f117136h = vq.j.a(bVar);
                    this.f117133e = z15;
                    this.f117137j = 0;
                    this.f117138k = 0;
                    this.f117139l = 3;
                    if (bVarY1.F(error, this) != objE) {
                        c0Var3 = c0Var;
                        c0Var = c0Var3;
                    }
                }
                return c0Var.c();
            }
            return objE;
        }

        public final tq.e<oq.i0> N(tq.e<?> eVar) {
            return r0.this.new c(this.f117141n, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<l84.e.DataLoaded>> eVar) {
            return ((c) N(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f117142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f117143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f117144f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f117145g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f117146h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f117148k;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f117146h = obj;
            this.f117148k |= PKIFailureInfo.systemUnavail;
            return r0.this.H9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f117149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f117150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f117151f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f117152g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f117153h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f117155k;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f117153h = obj;
            this.f117155k |= PKIFailureInfo.systemUnavail;
            return r0.this.J9(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<l84.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f117156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f117157b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f117158a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r0 f117159b;

            /* JADX INFO: renamed from: l84.r0$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2837a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f117160d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f117161e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f117162f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f117164h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f117165j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f117166k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f117167l;

                public C2837a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f117160d = obj;
                    this.f117161e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r0 r0Var) {
                this.f117158a = hVar;
                this.f117159b = r0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2837a c2837a;
                if (eVar instanceof C2837a) {
                    c2837a = (C2837a) eVar;
                    int i15 = c2837a.f117161e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2837a.f117161e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2837a = new C2837a(eVar);
                    }
                } else {
                    c2837a = new C2837a(eVar);
                }
                Object obj2 = c2837a.f117160d;
                Object objE = uq.b.e();
                int i16 = c2837a.f117161e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f117158a;
                    l84.f.a aVarF9 = this.f117159b.F9((l84.e) obj);
                    c2837a.f117162f = vq.j.a(obj);
                    c2837a.f117164h = vq.j.a(c2837a);
                    c2837a.f117165j = vq.j.a(obj);
                    c2837a.f117166k = vq.j.a(hVar);
                    c2837a.f117167l = 0;
                    c2837a.f117161e = 1;
                    if (hVar.F(aVarF9, c2837a) == objE) {
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

        public f(mu.g gVar, r0 r0Var) {
            this.f117156a = gVar;
            this.f117157b = r0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super l84.f.a> hVar, tq.e eVar) {
            Object objA = this.f117156a.a(new a(hVar, this.f117157b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Ll84/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Ll84/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<nx.a, l84.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117169f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f117169f;
            uq.b.e();
            if (this.f117168e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == nx.a.RESUMED) {
                r0.this.d9(l84.d.f.f117041a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, l84.e eVar, tq.e<? super oq.i0> eVar2) {
            g gVar = r0.this.new g(eVar2);
            gVar.f117169f = aVar;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll84/d$a;", "<unused var>", "Ll84/e;", "Loq/i0;", "<anonymous>", "(Ll84/d$a;Ll84/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<l84.d.a, l84.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117171e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f117171e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<l84.d.e> bVarY1 = r0.this.Y1();
                l84.d.e.a aVar = l84.d.e.a.f117034a;
                this.f117171e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(l84.d.a aVar, l84.e eVar, tq.e<? super oq.i0> eVar2) {
            return r0.this.new h(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll84/d$d;", "<unused var>", "Lk10/c0;", "Ll84/e;", "state", "Lk10/l;", "<anonymous>", "(Ll84/d$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<l84.d.C2830d, k10.c0<l84.e>, tq.e<? super k10.l<? extends l84.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117174f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f117174f;
            Object objE = uq.b.e();
            int i15 = this.f117173e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            r0 r0Var = r0.this;
            this.f117174f = vq.j.a(c0Var);
            this.f117173e = 1;
            Object objE9 = r0Var.E9(c0Var, this);
            return objE9 == objE ? objE : objE9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l84.d.C2830d c2830d, k10.c0<l84.e> c0Var, tq.e<? super k10.l<? extends l84.e>> eVar) {
            i iVar = r0.this.new i(eVar);
            iVar.f117174f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll84/d$g;", "action", "Lk10/c0;", "Ll84/e;", "state", "Lk10/l;", "<anonymous>", "(Ll84/d$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<l84.d.ShowEmptyState, k10.c0<l84.e>, tq.e<? super k10.l<? extends l84.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117177f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f117178g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l84.d.ShowEmptyState showEmptyState = (l84.d.ShowEmptyState) this.f117177f;
            k10.c0 c0Var = (k10.c0) this.f117178g;
            uq.b.e();
            if (this.f117176e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return r0.this.N9(showEmptyState, c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l84.d.ShowEmptyState showEmptyState, k10.c0<l84.e> c0Var, tq.e<? super k10.l<? extends l84.e>> eVar) {
            j jVar = r0.this.new j(eVar);
            jVar.f117177f = showEmptyState;
            jVar.f117178g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll84/d$c;", "<unused var>", "Ll84/e;", "Loq/i0;", "<anonymous>", "(Ll84/d$c;Ll84/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<l84.d.c, l84.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117180e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f117180e;
            if (i15 == 0) {
                oq.u.b(obj);
                r0 r0Var = r0.this;
                this.f117180e = 1;
                if (r0Var.J9(this) == objE) {
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
        public final Object w(l84.d.c cVar, l84.e eVar, tq.e<? super oq.i0> eVar2) {
            return r0.this.new k(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll84/e$c;", "it", "Loq/i0;", "<anonymous>", "(Ll84/e$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<l84.e.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117182e;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f117182e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r0.this.d9(l84.d.C2830d.f117033a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(l84.e.c cVar, tq.e<? super oq.i0> eVar) {
            return ((l) v(cVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return r0.this.new l(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll84/d$f;", "<unused var>", "Lk10/c0;", "Ll84/e$b;", "state", "Lk10/l;", "Ll84/e;", "<anonymous>", "(Ll84/d$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<l84.d.f, k10.c0<l84.e.b>, tq.e<? super k10.l<? extends l84.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117184e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117185f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l84.e.b O(i84.b.InterfaceC2143b interfaceC2143b, l84.e.b bVar) {
            if (fr.t.c(interfaceC2143b, i84.b.InterfaceC2143b.C2144b.f90328a)) {
                return l84.e.b.a.f117048a;
            }
            if (fr.t.c(interfaceC2143b, i84.b.InterfaceC2143b.a.f90327a) || fr.t.c(interfaceC2143b, i84.b.InterfaceC2143b.c.f90329a)) {
                return l84.e.b.C2833b.f117049a;
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f117185f;
            Object objE = uq.b.e();
            int i15 = this.f117184e;
            if (i15 == 0) {
                oq.u.b(obj);
                i84.b bVarB9 = r0.this.B9();
                this.f117185f = c0Var;
                this.f117184e = 1;
                obj = bVarB9.a(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final i84.b.InterfaceC2143b interfaceC2143b = (i84.b.InterfaceC2143b) obj;
            return c0Var.d(new er.l() { // from class: l84.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.m.O(interfaceC2143b, (e.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l84.d.f fVar, k10.c0<l84.e.b> c0Var, tq.e<? super k10.l<? extends l84.e>> eVar) {
            m mVar = r0.this.new m(eVar);
            mVar.f117185f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll84/e$a;", "it", "Loq/i0;", "<anonymous>", "(Ll84/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<l84.e.DataLoaded, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117187e;

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f117187e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r0.this.d9(l84.d.f.f117041a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(l84.e.DataLoaded dataLoaded, tq.e<? super oq.i0> eVar) {
            return ((n) v(dataLoaded, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return r0.this.new n(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll84/d$b;", "<unused var>", "Lk10/c0;", "Ll84/e$a;", "state", "Lk10/l;", "Ll84/e;", "<anonymous>", "(Ll84/d$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<l84.d.b, k10.c0<l84.e.DataLoaded>, tq.e<? super k10.l<? extends l84.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117190f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l84.e.DataLoaded O(l84.e.DataLoaded dataLoaded) {
            return l84.e.DataLoaded.b(dataLoaded, null, false, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f117190f;
            uq.b.e();
            if (this.f117189e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: l84.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.o.O((e.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l84.d.b bVar, k10.c0<l84.e.DataLoaded> c0Var, tq.e<? super k10.l<? extends l84.e>> eVar) {
            o oVar = new o(eVar);
            oVar.f117190f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll84/d$f;", "<unused var>", "Lk10/c0;", "Ll84/e$a;", "state", "Lk10/l;", "Ll84/e;", "<anonymous>", "(Ll84/d$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<l84.d.f, k10.c0<l84.e.DataLoaded>, tq.e<? super k10.l<? extends l84.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117191e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117192f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l84.e.DataLoaded O(i84.b.InterfaceC2143b interfaceC2143b, l84.e.DataLoaded dataLoaded) {
            return l84.e.DataLoaded.b(dataLoaded, null, interfaceC2143b.isEnabled(), false, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f117192f;
            Object objE = uq.b.e();
            int i15 = this.f117191e;
            if (i15 == 0) {
                oq.u.b(obj);
                i84.b bVarB9 = r0.this.B9();
                this.f117192f = c0Var;
                this.f117191e = 1;
                obj = bVarB9.a(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final i84.b.InterfaceC2143b interfaceC2143b = (i84.b.InterfaceC2143b) obj;
            return c0Var.b(new er.l() { // from class: l84.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return r0.p.O(interfaceC2143b, (e.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l84.d.f fVar, k10.c0<l84.e.DataLoaded> c0Var, tq.e<? super k10.l<? extends l84.e>> eVar) {
            p pVar = r0.this.new p(eVar);
            pVar.f117192f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll84/d$h;", "action", "Lk10/c0;", "Ll84/e$a;", "state", "Lk10/l;", "Ll84/e;", "<anonymous>", "(Ll84/d$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<l84.d.ShowNotificationDetails, k10.c0<l84.e.DataLoaded>, tq.e<? super k10.l<? extends l84.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f117196g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l84.d.ShowNotificationDetails showNotificationDetails = (l84.d.ShowNotificationDetails) this.f117195f;
            k10.c0 c0Var = (k10.c0) this.f117196g;
            Object objE = uq.b.e();
            int i15 = this.f117194e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            r0 r0Var = r0.this;
            this.f117195f = vq.j.a(showNotificationDetails);
            this.f117196g = vq.j.a(c0Var);
            this.f117194e = 1;
            Object objH9 = r0Var.H9(c0Var, showNotificationDetails, this);
            return objH9 == objE ? objE : objH9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l84.d.ShowNotificationDetails showNotificationDetails, k10.c0<l84.e.DataLoaded> c0Var, tq.e<? super k10.l<? extends l84.e>> eVar) {
            q qVar = r0.this.new q(eVar);
            qVar.f117195f = showNotificationDetails;
            qVar.f117196g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    public r0(yy.a aVar, ib4.c cVar, h84.a aVar2, h84.b bVar, m84.a aVar3, ac4.a aVar4, k84.b bVar2, k84.a aVar5, oz.q qVar, w74.a aVar6) {
        this.errorMapper = cVar;
        this.interactorFactory = aVar2;
        this.systemInteractorFactory = bVar;
        this.notificationsHistoryMapper = aVar3;
        this.callActionWithLoaderUseCase = aVar4;
        this.goToNotificationSettingsUseCase = bVar2;
        this.goToNotificationChannelsSettingsUseCase = aVar5;
        this.ownerViewLifecycleManager = qVar;
        this.featureConfig = aVar6;
        l84.e.c cVar2 = l84.e.c.f117050a;
        this.initialState = cVar2;
        this.lifecycleConnector = qVar;
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: l84.h0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.P9(this.f117085a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new f(e9().getState(), this), F9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i84.a A9() {
        return (i84.a) this.notificationsHistoryDataInteractor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i84.b B9() {
        return (i84.b) this.notificationsHistorySystemInteractor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b C9(dx.b domainError) {
        return this.errorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: l84.o0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.D9(this.f117109a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(r0 r0Var, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            r0Var.d9(l84.d.a.f117030a);
        } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            r0Var.d9(l84.d.C2830d.f117033a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E9(k10.c0<l84.e> c0Var, tq.e<? super k10.l<l84.e.DataLoaded>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new c(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l84.f.a F9(l84.e state) {
        return this.notificationsHistoryMapper.b(new m84.a.Params(state, b9(l84.d.C2830d.f117033a), new er.l() { // from class: l84.l0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.G9(this.f117103a, (String) obj);
            }
        }, b9(l84.d.c.f117032a), b9(l84.d.b.f117031a), b9(l84.d.a.f117030a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(r0 r0Var, String str) {
        r0Var.d9(new l84.d.ShowNotificationDetails(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x008c  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x0151  */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v18 java.lang.Object, still in use, count: 2, list:
          (r2v18 java.lang.Object) from 0x0087: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v18 java.lang.Object) binds: [B:22:0x0086, B:80:0x0087] A[DONT_GENERATE, DONT_INLINE]
          (r2v18 java.lang.Object) from 0x0075: CHECK_CAST (j84.c) (r2v18 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object H9(k10.c0<l84.e.DataLoaded> r9, l84.d.ShowNotificationDetails r10, tq.e<? super k10.l<l84.e.DataLoaded>> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l84.r0.H9(k10.c0, l84.d$h, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l84.e.DataLoaded I9(l84.d.ShowNotificationDetails showNotificationDetails, l84.e.DataLoaded dataLoaded) {
        return l84.e.DataLoaded.b(dataLoaded, j84.b.a(dataLoaded.getHistory(), showNotificationDetails.getMessageId()), false, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (r3.F(r6, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d6, code lost:
    
        if (r4.F(r6, r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J9(tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l84.r0.J9(tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i84.a K9(r0 r0Var) {
        return r0Var.interactorFactory.a(r0Var.featureConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i84.b L9(r0 r0Var) {
        return r0Var.systemInteractorFactory.a(r0Var.featureConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<l84.e.b> N9(final l84.d.ShowEmptyState action, k10.c0<l84.e> state) {
        return state.d(new er.l() { // from class: l84.n0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.O9(action, (e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l84.e.b O9(l84.d.ShowEmptyState showEmptyState, l84.e eVar) {
        return showEmptyState.getNotificationsEnabled() ? l84.e.b.a.f117048a : l84.e.b.C2833b.f117049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(final r0 r0Var, k10.v vVar) {
        vVar.c(fr.q0.c(l84.e.class), new er.l() { // from class: l84.g0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.Q9(this.f117082a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(l84.e.c.class), new er.l() { // from class: l84.i0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.R9(this.f117088a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(l84.e.b.class), new er.l() { // from class: l84.j0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.S9(this.f117093a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(l84.e.DataLoaded.class), new er.l() { // from class: l84.k0
            @Override // er.l
            public final Object b(Object obj) {
                return r0.T9(this.f117098a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(r0 r0Var, k10.z zVar) {
        k10.k.s(zVar, r0Var.x8(), null, r0Var.new g(null), 2, null);
        h hVar = r0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(l84.d.a.class), oVar, hVar);
        zVar.v(fr.q0.c(l84.d.C2830d.class), oVar, r0Var.new i(null));
        zVar.v(fr.q0.c(l84.d.ShowEmptyState.class), oVar, r0Var.new j(null));
        zVar.x(fr.q0.c(l84.d.c.class), oVar, r0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(r0 r0Var, k10.z zVar) {
        zVar.C(r0Var.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(r0 r0Var, k10.z zVar) {
        m mVar = r0Var.new m(null);
        zVar.v(fr.q0.c(l84.d.f.class), k10.o.CANCEL_PREVIOUS, mVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(r0 r0Var, k10.z zVar) {
        zVar.C(r0Var.new n(null));
        o oVar = new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(l84.d.b.class), oVar2, oVar);
        zVar.v(fr.q0.c(l84.d.f.class), oVar2, r0Var.new p(null));
        zVar.v(fr.q0.c(l84.d.ShowNotificationDetails.class), oVar2, r0Var.new q(null));
        return oq.i0.f148189a;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<l84.d.e> Y1() {
        return this.navAction;
    }

    @Override // l84.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<l84.e, l84.d> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<l84.f.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
