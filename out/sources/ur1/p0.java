package ur1;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import java.time.LocalDate;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import r54.LocalDocumentNotification;
import r54.LocalVehicleNotification;
import r54.VehicleReminderNotification;
import vr1.DocumentListItem;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005By\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'JK\u00103\u001a\u0002022\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u001c\u0010/\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0012\u0006\u0012\u0004\u0018\u00010\u00050,2\f\u00101\u001a\b\u0012\u0004\u0012\u00020.00H\u0002¢\u0006\u0004\b3\u00104J.\u00109\u001a\u00020.2\b\u00106\u001a\u0004\u0018\u0001052\b\u0010+\u001a\u0004\u0018\u00010*2\b\u00108\u001a\u0004\u0018\u000107H\u0082@¢\u0006\u0004\b9\u0010:J,\u0010>\u001a\u00020.2\u0006\u0010;\u001a\u00020(2\b\u0010<\u001a\u0004\u0018\u00010*2\b\u0010=\u001a\u0004\u0018\u00010*H\u0082@¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\b\u0012\u0004\u0012\u0002050@H\u0002¢\u0006\u0004\bA\u0010BJ$\u0010D\u001a\u00020.2\b\u00106\u001a\u0004\u0018\u0001052\b\u0010C\u001a\u0004\u0018\u000107H\u0082@¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020.2\u0006\u0010;\u001a\u00020(H\u0082@¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020.H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020.H\u0002¢\u0006\u0004\bJ\u0010IJ\u001f\u0010N\u001a\u00020.2\u0006\u0010K\u001a\u00020*2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR,\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030j8\u0014X\u0095\u0004¢\u0006\u0012\n\u0004\bk\u0010l\u0012\u0004\bo\u0010I\u001a\u0004\bm\u0010nR \u0010w\u001a\b\u0012\u0004\u0012\u00020r0q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR&\u0010$\u001a\b\u0012\u0004\u0012\u00020%0x8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\by\u0010z\u0012\u0004\b}\u0010I\u001a\u0004\b{\u0010|¨\u0006~"}, d2 = {"Lur1/p0;", "Ll00/g;", "Lur1/b;", "Lur1/a;", "Lur1/d;", "", "Lyy/a;", "stateMachineFactory", "Lwr1/h;", "localNotificationsMapper", "Lez/a;", "currentTimeProvider", "Lcb4/j;", "dialogVMSFactory", "Ls54/m;", "setNotificationsForDocumentUseCase", "Ls54/g;", "removeNotificationsForDocumentUseCase", "Ls54/h;", "removeNotificationsForSubDocumentUseCase", "Ls54/i;", "removeNotificationsForVehicleUseCase", "Ls54/n;", "setNotificationsForVehiclesUseCase", "Ls54/b;", "getLocalDocumentNotificationsUseCase", "Ls54/c;", "getLocalVehicleNotificationsUseCase", "Lq54/a;", "localNotificationManager", "Ls54/o;", "showDocumentLocalNotificationUseCase", "Ls54/p;", "showVehicleLocalNotificationUseCase", "<init>", "(Lyy/a;Lwr1/h;Lez/a;Lcb4/j;Ls54/m;Ls54/g;Ls54/h;Ls54/i;Ls54/n;Ls54/b;Ls54/c;Lq54/a;Ls54/o;Ls54/p;)V", "state", "Lur1/d$a;", "S9", "(Lur1/b;)Lur1/d$a;", "", "description", "Ljava/time/LocalDate;", "date", "Lkotlin/Function1;", "Ltq/e;", "Loq/i0;", "onSendClick", "Lkotlin/Function0;", "onDismiss", "Lcb4/i;", "N9", "(Ljava/lang/String;Ljava/time/LocalDate;Ler/l;Ler/a;)Lcb4/i;", "Lrq0/b;", "documentType", "Lr54/b;", "documentNotificationSubType", "fa", "(Lrq0/b;Ljava/time/LocalDate;Lr54/b;Ltq/e;)Ljava/lang/Object;", "registerNo", "insuranceDate", "technicalExaminationDate", "ga", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "", "P9", "()Ljava/util/List;", "documentSubType", "da", "(Lrq0/b;Lr54/b;Ltq/e;)Ljava/lang/Object;", "ea", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Q9", "()V", "R9", "value", "Lvr1/a;", "dateField", "ha", "(Ljava/time/LocalDate;Lvr1/a;)V", "b", "Lwr1/h;", "c", "Lez/a;", "d", "Lcb4/j;", "e", "Ls54/m;", "f", "Ls54/g;", "g", "Ls54/h;", "h", "Ls54/i;", "j", "Ls54/n;", "k", "Ls54/b;", "l", "Ls54/c;", "m", "Lq54/a;", "n", "Ls54/o;", "p", "Ls54/p;", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lur1/a$g;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 extends l00.g<ur1.b, ur1.a> implements ur1.d, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wr1.h localNotificationsMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s54.m setNotificationsForDocumentUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final s54.g removeNotificationsForDocumentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final s54.h removeNotificationsForSubDocumentUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final s54.i removeNotificationsForVehicleUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final s54.n setNotificationsForVehiclesUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final s54.b getLocalDocumentNotificationsUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final s54.c getLocalVehicleNotificationsUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final q54.a localNotificationManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final s54.o showDocumentLocalNotificationUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final s54.p showVehicleLocalNotificationUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ur1.b, ur1.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ur1.a.g> navAction = new xw.b<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ur1.d.a> state = a9(new i(e9().getState(), this), ur1.d.a.b.f200202a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super oq.i0>, Object> f200254f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.l<? super tq.e<? super oq.i0>, ? extends Object> lVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f200254f = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f200253e;
            if (i15 == 0) {
                oq.u.b(obj);
                er.l<tq.e<? super oq.i0>, Object> lVar = this.f200254f;
                this.f200253e = 1;
                if (lVar.b(this) == objE) {
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

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new a(this.f200254f, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((a) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$j;", "action", "Lk10/c0;", "Lur1/b$a$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<ur1.a.SelectedItem, k10.c0<ur1.b.a.Screen>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200256f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200257g;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Screen O(ur1.a.SelectedItem selectedItem, ur1.b.a.Screen screen) {
            return screen.b(StateData.b(screen.getData(), null, null, selectedItem.getItem(), null, null, null, null, null, null, null, null, null, 4091, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ur1.a.SelectedItem selectedItem = (ur1.a.SelectedItem) this.f200256f;
            k10.c0 c0Var = (k10.c0) this.f200257g;
            uq.b.e();
            if (this.f200255e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur1.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.a0.O(selectedItem, (b.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.SelectedItem selectedItem, k10.c0<ur1.b.a.Screen> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            a0 a0Var = new a0(eVar);
            a0Var.f200256f = selectedItem;
            a0Var.f200257g = c0Var;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200258e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p0 f200260a;

            a(p0 p0Var) {
                this.f200260a = p0Var;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(List<LocalDocumentNotification> list, tq.e<? super oq.i0> eVar) {
                this.f200260a.d9(new ur1.a.LoadLocalNotifications(list));
                return oq.i0.f148189a;
            }
        }

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (((mu.g) r5).a(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f200258e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L44
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                ur1.p0 r5 = ur1.p0.this
                s54.b r5 = ur1.p0.B9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f200258e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L43
            L32:
                mu.g r5 = (mu.g) r5
                ur1.p0$b$a r1 = new ur1.p0$b$a
                ur1.p0 r3 = ur1.p0.this
                r1.<init>(r3)
                r4.f200258e = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L44
            L43:
                return r0
            L44:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ur1.p0.b.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return p0.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$e;", "action", "Lk10/c0;", "Lur1/b$a$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<ur1.a.LoadLocalNotifications, k10.c0<ur1.b.a.Screen>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200263g;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Screen O(ur1.a.LoadLocalNotifications loadLocalNotifications, ur1.b.a.Screen screen) {
            return screen.b(StateData.b(screen.getData(), null, null, null, loadLocalNotifications.a(), null, null, null, null, null, null, null, null, 4087, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ur1.a.LoadLocalNotifications loadLocalNotifications = (ur1.a.LoadLocalNotifications) this.f200262f;
            k10.c0 c0Var = (k10.c0) this.f200263g;
            uq.b.e();
            if (this.f200261e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur1.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.b0.O(loadLocalNotifications, (b.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.LoadLocalNotifications loadLocalNotifications, k10.c0<ur1.b.a.Screen> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            b0 b0Var = new b0(eVar);
            b0Var.f200262f = loadLocalNotifications;
            b0Var.f200263g = c0Var;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200264e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p0 f200266a;

            a(p0 p0Var) {
                this.f200266a = p0Var;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(List<LocalVehicleNotification> list, tq.e<? super oq.i0> eVar) {
                this.f200266a.d9(new ur1.a.LoadLocalVehicleNotifications(list));
                return oq.i0.f148189a;
            }
        }

        c(tq.e<? super c> eVar) {
            super(1, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (((mu.g) r5).a(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f200264e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L44
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                ur1.p0 r5 = ur1.p0.this
                s54.c r5 = ur1.p0.C9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f200264e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L43
            L32:
                mu.g r5 = (mu.g) r5
                ur1.p0$c$a r1 = new ur1.p0$c$a
                ur1.p0 r3 = ur1.p0.this
                r1.<init>(r3)
                r4.f200264e = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L44
            L43:
                return r0
            L44:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ur1.p0.c.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return p0.this.new c(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f200267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f200268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f200269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f200270g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f200271h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f200273k;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f200271h = obj;
            this.f200273k |= PKIFailureInfo.systemUnavail;
            return p0.this.da(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f200274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f200275e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f200277g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f200275e = obj;
            this.f200277g |= PKIFailureInfo.systemUnavail;
            return p0.this.ea(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f200278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f200279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f200280f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200281g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f200283j;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f200281g = obj;
            this.f200283j |= PKIFailureInfo.systemUnavail;
            return p0.this.fa(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f200284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f200285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f200286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f200287g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f200288h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f200290k;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f200288h = obj;
            this.f200290k |= PKIFailureInfo.systemUnavail;
            return p0.this.ga(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ vr1.a f200292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p0 f200293g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalDate f200294h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f200295a;

            static {
                int[] iArr = new int[vr1.a.values().length];
                try {
                    iArr[vr1.a.DOCUMENT_DATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[vr1.a.INSURANCE_DATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[vr1.a.TECHNICAL_EXAMINATION_DATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f200295a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(vr1.a aVar, p0 p0Var, LocalDate localDate, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f200292f = aVar;
            this.f200293g = p0Var;
            this.f200294h = localDate;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f200291e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f200295a[this.f200292f.ordinal()];
            if (i15 == 1) {
                this.f200293g.d9(new ur1.a.SetDocumentDate(this.f200294h));
            } else if (i15 == 2) {
                this.f200293g.d9(new ur1.a.SetInsuranceDate(this.f200294h));
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                this.f200293g.d9(new ur1.a.SetTechnicalExaminationDate(this.f200294h));
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new h(this.f200292f, this.f200293g, this.f200294h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((h) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i implements mu.g<ur1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f200296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f200297b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f200298a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f200299b;

            /* JADX INFO: renamed from: ur1.p0$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5213a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f200300d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f200301e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f200302f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f200304h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f200305j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f200306k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f200307l;

                public C5213a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f200300d = obj;
                    this.f200301e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p0 p0Var) {
                this.f200298a = hVar;
                this.f200299b = p0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5213a c5213a;
                if (eVar instanceof C5213a) {
                    c5213a = (C5213a) eVar;
                    int i15 = c5213a.f200301e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5213a.f200301e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5213a = new C5213a(eVar);
                    }
                } else {
                    c5213a = new C5213a(eVar);
                }
                Object obj2 = c5213a.f200300d;
                Object objE = uq.b.e();
                int i16 = c5213a.f200301e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f200298a;
                    ur1.d.a aVarS9 = this.f200299b.S9((ur1.b) obj);
                    c5213a.f200302f = vq.j.a(obj);
                    c5213a.f200304h = vq.j.a(c5213a);
                    c5213a.f200305j = vq.j.a(obj);
                    c5213a.f200306k = vq.j.a(hVar);
                    c5213a.f200307l = 0;
                    c5213a.f200301e = 1;
                    if (hVar.F(aVarS9, c5213a) == objE) {
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

        public i(mu.g gVar, p0 p0Var) {
            this.f200296a = gVar;
            this.f200297b = p0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super ur1.d.a> hVar, tq.e eVar) {
            Object objA = this.f200296a.a(new a(hVar, this.f200297b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lur1/a$b;", "<unused var>", "Lur1/b;", "Loq/i0;", "<anonymous>", "(Lur1/a$b;Lur1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ur1.a.b, ur1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200308e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f200308e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ur1.a.g> bVarY1 = p0.this.Y1();
                ur1.a.g.C5208a c5208a = ur1.a.g.C5208a.f200150a;
                this.f200308e = 1;
                if (bVarY1.F(c5208a, this) == objE) {
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
        public final Object w(ur1.a.b bVar, ur1.b bVar2, tq.e<? super oq.i0> eVar) {
            return p0.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lur1/b$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<ur1.b.C5211b>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200311f;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Screen O(p0 p0Var, String str, ur1.b.C5211b c5211b) {
            return new ur1.b.a.Screen(new StateData(null, null, null, null, null, p0Var.P9(), null, null, null, null, null, str, 2015, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f200311f;
            Object objE = uq.b.e();
            int i15 = this.f200310e;
            if (i15 == 0) {
                oq.u.b(obj);
                q54.a aVar = p0.this.localNotificationManager;
                this.f200311f = c0Var;
                this.f200310e = 1;
                obj = aVar.d(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final String str = (String) obj;
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: ur1.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.k.O(p0Var, str, (b.C5211b) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ur1.b.C5211b> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = p0.this.new k(eVar);
            kVar.f200311f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$d;", "action", "Lk10/c0;", "Lur1/b$a$a;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ur1.a.d, k10.c0<ur1.b.a.Dialog>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200314f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Screen O(k10.c0 c0Var, ur1.b.a.Dialog dialog) {
            return new ur1.b.a.Screen(((ur1.b.a.Dialog) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f200314f;
            uq.b.e();
            if (this.f200313e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ur1.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.l.O(c0Var, (b.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.d dVar, k10.c0<ur1.b.a.Dialog> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f200314f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$f;", "action", "Lk10/c0;", "Lur1/b$a$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ur1.a.LoadLocalVehicleNotifications, k10.c0<ur1.b.a.Screen>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200315e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200316f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200317g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Screen O(ur1.a.LoadLocalVehicleNotifications loadLocalVehicleNotifications, ur1.b.a.Screen screen) {
            return screen.b(StateData.b(screen.getData(), null, null, null, null, loadLocalVehicleNotifications.a(), null, null, null, null, null, null, null, 4079, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ur1.a.LoadLocalVehicleNotifications loadLocalVehicleNotifications = (ur1.a.LoadLocalVehicleNotifications) this.f200316f;
            k10.c0 c0Var = (k10.c0) this.f200317g;
            uq.b.e();
            if (this.f200315e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur1.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.m.O(loadLocalVehicleNotifications, (b.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.LoadLocalVehicleNotifications loadLocalVehicleNotifications, k10.c0<ur1.b.a.Screen> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            m mVar = new m(eVar);
            mVar.f200316f = loadLocalVehicleNotifications;
            mVar.f200317g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$n;", "action", "Lk10/c0;", "Lur1/b$a$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ur1.a.SetRegisterNo, k10.c0<ur1.b.a.Screen>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200320g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Screen O(ur1.a.SetRegisterNo setRegisterNo, ur1.b.a.Screen screen) {
            return screen.b(StateData.b(screen.getData(), null, null, null, null, null, null, null, null, null, setRegisterNo.getRegisterNo(), null, null, 3583, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ur1.a.SetRegisterNo setRegisterNo = (ur1.a.SetRegisterNo) this.f200319f;
            k10.c0 c0Var = (k10.c0) this.f200320g;
            uq.b.e();
            if (this.f200318e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur1.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.n.O(setRegisterNo, (b.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.SetRegisterNo setRegisterNo, k10.c0<ur1.b.a.Screen> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            n nVar = new n(eVar);
            nVar.f200319f = setRegisterNo;
            nVar.f200320g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$q;", "action", "Lk10/c0;", "Lur1/b$a$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ur1.a.ShowDocumentDialog, k10.c0<ur1.b.a.Screen>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200322f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200323g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f200325e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f200326f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ur1.a.ShowDocumentDialog f200327g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, ur1.a.ShowDocumentDialog showDocumentDialog, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f200326f = p0Var;
                this.f200327g = showDocumentDialog;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f200325e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    s54.o oVar = this.f200326f.showDocumentLocalNotificationUseCase;
                    s54.o.Params params = new s54.o.Params(this.f200327g.getNotification());
                    this.f200325e = 1;
                    if (oVar.c(params, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                this.f200326f.d9(ur1.a.d.f200147a);
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f200326f, this.f200327g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Dialog O(k10.c0 c0Var, p0 p0Var, ur1.a.ShowDocumentDialog showDocumentDialog, ur1.b.a.Screen screen) {
            return new ur1.b.a.Dialog(((ur1.b.a.Screen) c0Var.a()).getData(), p0Var.N9(showDocumentDialog.getNotification().getDocumentType(), showDocumentDialog.getNotification().getNotificationDate(), new a(p0Var, showDocumentDialog, null), p0Var.b9(ur1.a.d.f200147a)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ur1.a.ShowDocumentDialog showDocumentDialog = (ur1.a.ShowDocumentDialog) this.f200322f;
            final k10.c0 c0Var = (k10.c0) this.f200323g;
            uq.b.e();
            if (this.f200321e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: ur1.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.o.O(c0Var, p0Var, showDocumentDialog, (b.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.ShowDocumentDialog showDocumentDialog, k10.c0<ur1.b.a.Screen> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            o oVar = p0.this.new o(eVar);
            oVar.f200322f = showDocumentDialog;
            oVar.f200323g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$r;", "action", "Lk10/c0;", "Lur1/b$a$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<ur1.a.ShowVehicleDialog, k10.c0<ur1.b.a.Screen>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200330g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f200332e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f200333f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ur1.a.ShowVehicleDialog f200334g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, ur1.a.ShowVehicleDialog showVehicleDialog, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f200333f = p0Var;
                this.f200334g = showVehicleDialog;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f200332e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    s54.p pVar = this.f200333f.showVehicleLocalNotificationUseCase;
                    s54.p.Params params = new s54.p.Params(this.f200334g.getNotification());
                    this.f200332e = 1;
                    if (pVar.c(params, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                this.f200333f.d9(ur1.a.d.f200147a);
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f200333f, this.f200334g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Dialog O(k10.c0 c0Var, p0 p0Var, ur1.a.ShowVehicleDialog showVehicleDialog, ur1.b.a.Screen screen) {
            return new ur1.b.a.Dialog(((ur1.b.a.Screen) c0Var.a()).getData(), p0Var.N9(showVehicleDialog.getNotification().getRegisterNo(), showVehicleDialog.getNotification().getNotificationDate(), new a(p0Var, showVehicleDialog, null), p0Var.b9(ur1.a.d.f200147a)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ur1.a.ShowVehicleDialog showVehicleDialog = (ur1.a.ShowVehicleDialog) this.f200329f;
            final k10.c0 c0Var = (k10.c0) this.f200330g;
            uq.b.e();
            if (this.f200328e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: ur1.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.p.O(c0Var, p0Var, showVehicleDialog, (b.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.ShowVehicleDialog showVehicleDialog, k10.c0<ur1.b.a.Screen> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            p pVar = p0.this.new p(eVar);
            pVar.f200329f = showVehicleDialog;
            pVar.f200330g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lur1/a$k;", "<unused var>", "Lur1/b$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lur1/a$k;Lur1/b$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<ur1.a.k, ur1.b.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f200335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f200336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f200337g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f200338h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f200340a;

            static {
                int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
                try {
                    iArr[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f200340a = iArr;
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
        
            if (r2.ga(r4, r5, r7, r9) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
        
            if (r2.fa(r3, r7, r5, r9) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f200338h
                ur1.b$a$b r0 = (ur1.b.a.Screen) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r9.f200337g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L12
                if (r2 != r3) goto L1b
            L12:
                java.lang.Object r0 = r9.f200335e
                ur1.c r0 = (ur1.StateData) r0
                oq.u.b(r10)
                goto L98
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                oq.u.b(r10)
                ur1.c r10 = r0.getData()
                ur1.p0 r2 = ur1.p0.this
                y30.n$b$b r5 = r10.getSelectedItemSwitch()
                int[] r6 = ur1.p0.q.a.f200340a
                int r5 = r5.ordinal()
                r5 = r6[r5]
                r6 = 0
                if (r5 == r4) goto L66
                if (r5 != r3) goto L60
                java.lang.String r4 = r10.getRegisterNo()
                java.time.LocalDate r5 = r10.getInsuranceDate()
                java.time.LocalDate r7 = r10.getTechnicalExaminationDate()
                java.lang.Object r0 = vq.j.a(r0)
                r9.f200338h = r0
                java.lang.Object r10 = vq.j.a(r10)
                r9.f200335e = r10
                r9.f200336f = r6
                r9.f200337g = r3
                java.lang.Object r10 = ur1.p0.M9(r2, r4, r5, r7, r9)
                if (r10 != r1) goto L98
                goto L97
            L60:
                oq.p r10 = new oq.p
                r10.<init>()
                throw r10
            L66:
                vr1.b r3 = r10.getSelectedItem()
                r5 = 0
                if (r3 == 0) goto L72
                rq0.b r3 = r3.getDocumentType()
                goto L73
            L72:
                r3 = r5
            L73:
                java.time.LocalDate r7 = r10.getDocumentFormattedDate()
                vr1.b r8 = r10.getSelectedItem()
                if (r8 == 0) goto L81
                r54.b r5 = r8.getDocumentNotificationSubType()
            L81:
                java.lang.Object r0 = vq.j.a(r0)
                r9.f200338h = r0
                java.lang.Object r10 = vq.j.a(r10)
                r9.f200335e = r10
                r9.f200336f = r6
                r9.f200337g = r4
                java.lang.Object r10 = ur1.p0.L9(r2, r3, r7, r5, r9)
                if (r10 != r1) goto L98
            L97:
                return r1
            L98:
                oq.i0 r10 = oq.i0.f148189a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ur1.p0.q.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.k kVar, ur1.b.a.Screen screen, tq.e<? super oq.i0> eVar) {
            q qVar = p0.this.new q(eVar);
            qVar.f200338h = screen;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lur1/a$i;", "<unused var>", "Lur1/b$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lur1/a$i;Lur1/b$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<ur1.a.i, ur1.b.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f200341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f200342f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f200343g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f200344h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f200346a;

            static {
                int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
                try {
                    iArr[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f200346a = iArr;
            }
        }

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        
            if (r2.ea(r4, r8) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        
            if (r2.da(r3, r5, r8) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f200344h
                ur1.b$a$b r0 = (ur1.b.a.Screen) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r8.f200343g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L12
                if (r2 != r3) goto L1b
            L12:
                java.lang.Object r0 = r8.f200341e
                ur1.c r0 = (ur1.StateData) r0
                oq.u.b(r9)
                goto L8c
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                oq.u.b(r9)
                ur1.c r9 = r0.getData()
                ur1.p0 r2 = ur1.p0.this
                y30.n$b$b r5 = r9.getSelectedItemSwitch()
                int[] r6 = ur1.p0.r.a.f200346a
                int r5 = r5.ordinal()
                r5 = r6[r5]
                r6 = 0
                if (r5 == r4) goto L5e
                if (r5 != r3) goto L58
                java.lang.String r4 = r9.getRegisterNo()
                java.lang.Object r0 = vq.j.a(r0)
                r8.f200344h = r0
                java.lang.Object r9 = vq.j.a(r9)
                r8.f200341e = r9
                r8.f200342f = r6
                r8.f200343g = r3
                java.lang.Object r9 = ur1.p0.K9(r2, r4, r8)
                if (r9 != r1) goto L8c
                goto L8b
            L58:
                oq.p r9 = new oq.p
                r9.<init>()
                throw r9
            L5e:
                vr1.b r3 = r9.getSelectedItem()
                r5 = 0
                if (r3 == 0) goto L6a
                rq0.b r3 = r3.getDocumentType()
                goto L6b
            L6a:
                r3 = r5
            L6b:
                vr1.b r7 = r9.getSelectedItem()
                if (r7 == 0) goto L75
                r54.b r5 = r7.getDocumentNotificationSubType()
            L75:
                java.lang.Object r0 = vq.j.a(r0)
                r8.f200344h = r0
                java.lang.Object r9 = vq.j.a(r9)
                r8.f200341e = r9
                r8.f200342f = r6
                r8.f200343g = r4
                java.lang.Object r9 = ur1.p0.J9(r2, r3, r5, r8)
                if (r9 != r1) goto L8c
            L8b:
                return r1
            L8c:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ur1.p0.r.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.i iVar, ur1.b.a.Screen screen, tq.e<? super oq.i0> eVar) {
            r rVar = p0.this.new r(eVar);
            rVar.f200344h = screen;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lur1/a$h;", "action", "Lur1/b$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lur1/a$h;Lur1/b$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<ur1.a.OpenDatePickerDialog, ur1.b.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200348f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ur1.a.OpenDatePickerDialog openDatePickerDialog = (ur1.a.OpenDatePickerDialog) this.f200348f;
            Object objE = uq.b.e();
            int i15 = this.f200347e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ur1.a.g> bVarY1 = p0.this.Y1();
                ur1.a.g.OpenDatePickerDialog openDatePickerDialog2 = new ur1.a.g.OpenDatePickerDialog(p0.this.currentTimeProvider.c(), openDatePickerDialog.getDateField());
                this.f200348f = vq.j.a(openDatePickerDialog);
                this.f200347e = 1;
                if (bVarY1.F(openDatePickerDialog2, this) == objE) {
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
        public final Object w(ur1.a.OpenDatePickerDialog openDatePickerDialog, ur1.b.a.Screen screen, tq.e<? super oq.i0> eVar) {
            s sVar = p0.this.new s(eVar);
            sVar.f200348f = openDatePickerDialog;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lur1/b$a$b;", "it", "Loq/i0;", "<anonymous>", "(Lur1/b$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.p<ur1.b.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200350e;

        t(tq.e<? super t> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f200350e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0.this.Q9();
            p0.this.R9();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ur1.b.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return ((t) v(screen, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return p0.this.new t(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$a;", "action", "Lk10/c0;", "Lur1/b$a$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<ur1.a.ChangeSwitchItem, k10.c0<ur1.b.a.Screen>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200352e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200353f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200354g;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Screen O(ur1.a.ChangeSwitchItem changeSwitchItem, ur1.b.a.Screen screen) {
            return screen.b(StateData.b(screen.getData(), null, null, null, null, null, null, null, null, null, null, changeSwitchItem.getNewItem(), null, 3071, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ur1.a.ChangeSwitchItem changeSwitchItem = (ur1.a.ChangeSwitchItem) this.f200353f;
            k10.c0 c0Var = (k10.c0) this.f200354g;
            uq.b.e();
            if (this.f200352e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur1.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.u.O(changeSwitchItem, (b.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.ChangeSwitchItem changeSwitchItem, k10.c0<ur1.b.a.Screen> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            u uVar = new u(eVar);
            uVar.f200353f = changeSwitchItem;
            uVar.f200354g = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$l;", "action", "Lk10/c0;", "Lur1/b$a$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<ur1.a.SetDocumentDate, k10.c0<ur1.b.a.Screen>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200357g;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Screen O(ur1.a.SetDocumentDate setDocumentDate, ur1.b.a.Screen screen) {
            return screen.b(StateData.b(screen.getData(), hz.b.C2039b.f86846c, null, null, null, null, null, setDocumentDate.getDate(), null, null, null, null, null, 4030, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ur1.a.SetDocumentDate setDocumentDate = (ur1.a.SetDocumentDate) this.f200356f;
            k10.c0 c0Var = (k10.c0) this.f200357g;
            uq.b.e();
            if (this.f200355e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur1.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.v.O(setDocumentDate, (b.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.SetDocumentDate setDocumentDate, k10.c0<ur1.b.a.Screen> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            v vVar = new v(eVar);
            vVar.f200356f = setDocumentDate;
            vVar.f200357g = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$m;", "action", "Lk10/c0;", "Lur1/b$a$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<ur1.a.SetInsuranceDate, k10.c0<ur1.b.a.Screen>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200359f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200360g;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Screen O(ur1.a.SetInsuranceDate setInsuranceDate, ur1.b.a.Screen screen) {
            return screen.b(StateData.b(screen.getData(), hz.b.C2039b.f86846c, null, null, null, null, null, null, setInsuranceDate.getDate(), null, null, null, null, 3966, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ur1.a.SetInsuranceDate setInsuranceDate = (ur1.a.SetInsuranceDate) this.f200359f;
            k10.c0 c0Var = (k10.c0) this.f200360g;
            uq.b.e();
            if (this.f200358e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur1.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.w.O(setInsuranceDate, (b.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.SetInsuranceDate setInsuranceDate, k10.c0<ur1.b.a.Screen> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            w wVar = new w(eVar);
            wVar.f200359f = setInsuranceDate;
            wVar.f200360g = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$o;", "action", "Lk10/c0;", "Lur1/b$a$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<ur1.a.SetTechnicalExaminationDate, k10.c0<ur1.b.a.Screen>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200363g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Screen O(ur1.a.SetTechnicalExaminationDate setTechnicalExaminationDate, ur1.b.a.Screen screen) {
            return screen.b(StateData.b(screen.getData(), hz.b.C2039b.f86846c, null, null, null, null, null, null, null, setTechnicalExaminationDate.getDate(), null, null, null, 3838, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ur1.a.SetTechnicalExaminationDate setTechnicalExaminationDate = (ur1.a.SetTechnicalExaminationDate) this.f200362f;
            k10.c0 c0Var = (k10.c0) this.f200363g;
            uq.b.e();
            if (this.f200361e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur1.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.x.O(setTechnicalExaminationDate, (b.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.SetTechnicalExaminationDate setTechnicalExaminationDate, k10.c0<ur1.b.a.Screen> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            x xVar = new x(eVar);
            xVar.f200362f = setTechnicalExaminationDate;
            xVar.f200363g = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$p;", "action", "Lk10/c0;", "Lur1/b$a$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<ur1.a.SheetValueChange, k10.c0<ur1.b.a.Screen>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200365f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200366g;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Screen O(ur1.a.SheetValueChange sheetValueChange, ur1.b.a.Screen screen) {
            return screen.b(StateData.b(screen.getData(), null, sheetValueChange.getModalSheetValue(), null, null, null, null, null, null, null, null, null, null, 4093, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ur1.a.SheetValueChange sheetValueChange = (ur1.a.SheetValueChange) this.f200365f;
            k10.c0 c0Var = (k10.c0) this.f200366g;
            uq.b.e();
            if (this.f200364e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur1.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.y.O(sheetValueChange, (b.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.SheetValueChange sheetValueChange, k10.c0<ur1.b.a.Screen> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            y yVar = new y(eVar);
            yVar.f200365f = sheetValueChange;
            yVar.f200366g = c0Var;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur1/a$c;", "action", "Lk10/c0;", "Lur1/b$a$b;", "state", "Lk10/l;", "Lur1/b;", "<anonymous>", "(Lur1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<ur1.a.DataParser, k10.c0<ur1.b.a.Screen>, tq.e<? super k10.l<? extends ur1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200368f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200369g;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur1.b.a.Screen O(ur1.a.DataParser dataParser, ur1.b.a.Screen screen) {
            return screen.b(StateData.b(screen.getData(), dataParser.getValidation(), null, null, null, null, null, null, null, null, null, null, null, 4094, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ur1.a.DataParser dataParser = (ur1.a.DataParser) this.f200368f;
            k10.c0 c0Var = (k10.c0) this.f200369g;
            uq.b.e();
            if (this.f200367e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur1.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.z.O(dataParser, (b.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur1.a.DataParser dataParser, k10.c0<ur1.b.a.Screen> c0Var, tq.e<? super k10.l<? extends ur1.b>> eVar) {
            z zVar = new z(eVar);
            zVar.f200368f = dataParser;
            zVar.f200369g = c0Var;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public p0(yy.a aVar, wr1.h hVar, ez.a aVar2, cb4.j jVar, s54.m mVar, s54.g gVar, s54.h hVar2, s54.i iVar, s54.n nVar, s54.b bVar, s54.c cVar, q54.a aVar3, s54.o oVar, s54.p pVar) {
        this.localNotificationsMapper = hVar;
        this.currentTimeProvider = aVar2;
        this.dialogVMSFactory = jVar;
        this.setNotificationsForDocumentUseCase = mVar;
        this.removeNotificationsForDocumentUseCase = gVar;
        this.removeNotificationsForSubDocumentUseCase = hVar2;
        this.removeNotificationsForVehicleUseCase = iVar;
        this.setNotificationsForVehiclesUseCase = nVar;
        this.getLocalDocumentNotificationsUseCase = bVar;
        this.getLocalVehicleNotificationsUseCase = cVar;
        this.localNotificationManager = aVar3;
        this.showDocumentLocalNotificationUseCase = oVar;
        this.showVehicleLocalNotificationUseCase = pVar;
        this.stateMachine = aVar.a(ur1.b.C5211b.f200170a, new er.l() { // from class: ur1.z
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ja(this.f200403a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cb4.i N9(String description, LocalDate date, final er.l<? super tq.e<? super oq.i0>, ? extends Object> onSendClick, er.a<oq.i0> onDismiss) {
        return this.dialogVMSFactory.a(new DialogData(cb4.h.b.f24985a, mx.b.b("Powiadomienie", ""), mx.b.b(description + " z dnia: " + date, ""), new DialogButtonTextData(mx.b.b("Wyślij", ""), null, new er.a() { // from class: ur1.f0
            @Override // er.a
            public final Object a() {
                return p0.O9(this.f200210a, onSendClick);
            }
        }, 2, null), new DialogButtonTextData(mx.b.b("Anuluj", ""), null, onDismiss, 2, null), null, onDismiss, 32, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(p0 p0Var, er.l lVar) {
        i00.a.a(p0Var, new a(lVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<rq0.b> P9() {
        return pq.v.q(rq0.b.d.ID_CARD, rq0.b.d.DRIVING_LICENCE, rq0.b.d.FAMILY_CARD, rq0.b.d.RAILWAY_CARD, rq0.b.d.STUDENT_CARD, rq0.b.EnumC4479b.SOLIDARITY_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q9() {
        i00.a.a(this, new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R9() {
        i00.a.a(this, new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ur1.d.a S9(ur1.b state) {
        return this.localNotificationsMapper.b(new wr1.h.Params(state, new er.a() { // from class: ur1.g0
            @Override // er.a
            public final Object a() {
                return p0.T9(this.f200214a);
            }
        }, new er.a() { // from class: ur1.h0
            @Override // er.a
            public final Object a() {
                return p0.U9(this.f200217a);
            }
        }, new er.a() { // from class: ur1.i0
            @Override // er.a
            public final Object a() {
                return p0.V9(this.f200219a);
            }
        }, new er.l() { // from class: ur1.j0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.W9(this.f200221a, (g30.v) obj);
            }
        }, new er.l() { // from class: ur1.k0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.X9(this.f200223a, (DocumentListItem) obj);
            }
        }, new er.l() { // from class: ur1.l0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Y9(this.f200225a, (vr1.a) obj);
            }
        }, new er.l() { // from class: ur1.m0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Z9(this.f200226a, (String) obj);
            }
        }, new er.l() { // from class: ur1.n0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.aa(this.f200232a, (LocalDocumentNotification) obj);
            }
        }, new er.l() { // from class: ur1.o0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ba(this.f200235a, (LocalVehicleNotification) obj);
            }
        }, new er.l() { // from class: ur1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ca(this.f200164a, (y30.n.Switch.EnumC5973b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(p0 p0Var) {
        p0Var.d9(ur1.a.b.f200144a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(p0 p0Var) {
        p0Var.d9(ur1.a.k.f200156a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(p0 p0Var) {
        p0Var.d9(ur1.a.i.f200154a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(p0 p0Var, g30.v vVar) {
        p0Var.d9(new ur1.a.SheetValueChange(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(p0 p0Var, DocumentListItem documentListItem) {
        p0Var.d9(new ur1.a.SelectedItem(documentListItem));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(p0 p0Var, vr1.a aVar) {
        p0Var.d9(new ur1.a.OpenDatePickerDialog(aVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(p0 p0Var, String str) {
        p0Var.d9(new ur1.a.SetRegisterNo(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(p0 p0Var, LocalDocumentNotification localDocumentNotification) {
        p0Var.d9(new ur1.a.ShowDocumentDialog(localDocumentNotification));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(p0 p0Var, LocalVehicleNotification localVehicleNotification) {
        p0Var.d9(new ur1.a.ShowVehicleDialog(localVehicleNotification));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(p0 p0Var, y30.n.Switch.EnumC5973b enumC5973b) {
        p0Var.d9(new ur1.a.ChangeSwitchItem(enumC5973b));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r8.c(r2, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object da(rq0.b r6, r54.b r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ur1.p0.d
            if (r0 == 0) goto L13
            r0 = r8
            ur1.p0$d r0 = (ur1.p0.d) r0
            int r1 = r0.f200273k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200273k = r1
            goto L18
        L13:
            ur1.p0$d r0 = new ur1.p0$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f200271h
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f200273k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
        L28:
            java.lang.Object r6 = r0.f200268e
            r54.b r6 = (r54.b) r6
            java.lang.Object r6 = r0.f200267d
            rq0.b r6 = (rq0.b) r6
            oq.u.b(r8)     // Catch: java.lang.Exception -> L34
            goto L8f
        L34:
            r6 = move-exception
            goto La2
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r6 = r0.f200269f
            r54.b r6 = (r54.b) r6
            goto L28
        L43:
            oq.u.b(r8)
            if (r7 == 0) goto L69
            s54.h r8 = r5.removeNotificationsForSubDocumentUseCase     // Catch: java.lang.Exception -> L34
            s54.h$a r2 = new s54.h$a     // Catch: java.lang.Exception -> L34
            r2.<init>(r7)     // Catch: java.lang.Exception -> L34
            r0.f200267d = r6     // Catch: java.lang.Exception -> L34
            java.lang.Object r6 = vq.j.a(r7)     // Catch: java.lang.Exception -> L34
            r0.f200268e = r6     // Catch: java.lang.Exception -> L34
            java.lang.Object r6 = vq.j.a(r7)     // Catch: java.lang.Exception -> L34
            r0.f200269f = r6     // Catch: java.lang.Exception -> L34
            r6 = 0
            r0.f200270g = r6     // Catch: java.lang.Exception -> L34
            r0.f200273k = r4     // Catch: java.lang.Exception -> L34
            java.lang.Object r6 = r8.c(r2, r0)     // Catch: java.lang.Exception -> L34
            if (r6 != r1) goto L8f
            goto L8e
        L69:
            s54.g r8 = r5.removeNotificationsForDocumentUseCase     // Catch: java.lang.Exception -> L34
            s54.g$a r2 = new s54.g$a     // Catch: java.lang.Exception -> L34
            s54.g$b$b r4 = new s54.g$b$b     // Catch: java.lang.Exception -> L34
            if (r6 == 0) goto L9a
            r4.<init>(r6)     // Catch: java.lang.Exception -> L34
            r2.<init>(r4)     // Catch: java.lang.Exception -> L34
            java.lang.Object r6 = vq.j.a(r6)     // Catch: java.lang.Exception -> L34
            r0.f200267d = r6     // Catch: java.lang.Exception -> L34
            java.lang.Object r6 = vq.j.a(r7)     // Catch: java.lang.Exception -> L34
            r0.f200268e = r6     // Catch: java.lang.Exception -> L34
            r6 = 0
            r0.f200269f = r6     // Catch: java.lang.Exception -> L34
            r0.f200273k = r3     // Catch: java.lang.Exception -> L34
            java.lang.Object r6 = r8.c(r2, r0)     // Catch: java.lang.Exception -> L34
            if (r6 != r1) goto L8f
        L8e:
            return r1
        L8f:
            ur1.a$c r6 = new ur1.a$c     // Catch: java.lang.Exception -> L34
            hz.b$d r7 = hz.b.d.f86848c     // Catch: java.lang.Exception -> L34
            r6.<init>(r7)     // Catch: java.lang.Exception -> L34
            r5.d9(r6)     // Catch: java.lang.Exception -> L34
            goto Lb9
        L9a:
            java.lang.Exception r6 = new java.lang.Exception     // Catch: java.lang.Exception -> L34
            java.lang.String r7 = "Nie wybrano dokumentu"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L34
            throw r6     // Catch: java.lang.Exception -> L34
        La2:
            ur1.a$c r7 = new ur1.a$c
            hz.b$c r8 = new hz.b$c
            java.lang.String r6 = r6.getMessage()
            java.lang.String r0 = "removeNotificationExceptionMessage"
            mx.a r6 = mx.b.d(r6, r0)
            r8.<init>(r6)
            r7.<init>(r8)
            r5.d9(r7)
        Lb9:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ur1.p0.da(rq0.b, r54.b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ea(String str, tq.e<? super oq.i0> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f200277g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f200277g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f200275e;
        Object objE = uq.b.e();
        int i16 = eVar2.f200277g;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                s54.i iVar = this.removeNotificationsForVehicleUseCase;
                String str2 = str.length() > 0 ? str : null;
                if (str2 == null) {
                    throw new Exception("Brak numeru rejestracyjnego");
                }
                s54.i.Params params = new s54.i.Params(str2);
                eVar2.f200274d = vq.j.a(str);
                eVar2.f200277g = 1;
                if (iVar.c(params, eVar2) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            d9(new ur1.a.DataParser(hz.b.d.f86848c));
        } catch (Exception e15) {
            d9(new ur1.a.DataParser(new hz.b.Invalid(mx.b.d(e15.getMessage(), "removeVehicleNotificationExceptionMessage"))));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fa(rq0.b bVar, LocalDate localDate, r54.b bVar2, tq.e<? super oq.i0> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f200283j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f200283j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f200281g;
        Object objE = uq.b.e();
        int i16 = fVar.f200283j;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                s54.m mVar = this.setNotificationsForDocumentUseCase;
                if (bVar == null) {
                    throw new Exception("Nie wybrano dokumentu");
                }
                if (localDate == null) {
                    throw new Exception("Niepoprawna data");
                }
                s54.m.Params params = new s54.m.Params(bVar, bVar2, localDate);
                fVar.f200278d = vq.j.a(bVar);
                fVar.f200279e = vq.j.a(localDate);
                fVar.f200280f = vq.j.a(bVar2);
                fVar.f200283j = 1;
                if (mVar.c(params, fVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            d9(new ur1.a.DataParser(hz.b.d.f86848c));
        } catch (Exception e15) {
            d9(new ur1.a.DataParser(new hz.b.Invalid(mx.b.d(e15.getMessage(), "scheduleDocumentNotificationsExceptionMessage"))));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ga(String str, LocalDate localDate, LocalDate localDate2, tq.e<? super oq.i0> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f200290k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f200290k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f200288h;
        Object objE = uq.b.e();
        int i16 = gVar.f200290k;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                if (localDate == null) {
                    throw new Exception("Niepoprawna data");
                }
                r54.f fVar = r54.f.CAR_INSURANCE;
                String str2 = str.length() > 0 ? str : null;
                if (str2 == null) {
                    throw new Exception("Brak numeru rejestracyjnego");
                }
                VehicleReminderNotification vehicleReminderNotification = new VehicleReminderNotification(localDate, fVar, str2);
                if (localDate2 == null) {
                    throw new Exception("Niepoprawna data");
                }
                r54.f fVar2 = r54.f.TECHNICAL_EXAMINATION;
                String str3 = str.length() > 0 ? str : null;
                if (str3 == null) {
                    throw new Exception("Brak numeru rejestracyjnego");
                }
                List listS = pq.v.s(vehicleReminderNotification, new VehicleReminderNotification(localDate2, fVar2, str3));
                s54.n nVar = this.setNotificationsForVehiclesUseCase;
                List list = listS.isEmpty() ? null : listS;
                if (list == null) {
                    throw new Exception("Nie ustawiono daty Ubezpieczenia lub badania technicznego");
                }
                s54.n.Params params = new s54.n.Params(list);
                gVar.f200284d = vq.j.a(str);
                gVar.f200285e = vq.j.a(localDate);
                gVar.f200286f = vq.j.a(localDate2);
                gVar.f200287g = vq.j.a(listS);
                gVar.f200290k = 1;
                if (nVar.c(params, gVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            d9(new ur1.a.DataParser(hz.b.d.f86848c));
        } catch (Exception e15) {
            d9(new ur1.a.DataParser(new hz.b.Invalid(mx.b.d(e15.getMessage(), "scheduleVehicleNotificationsExceptionMessage"))));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(final p0 p0Var, k10.v vVar) {
        vVar.c(fr.q0.c(ur1.b.class), new er.l() { // from class: ur1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ka(this.f200171a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ur1.b.C5211b.class), new er.l() { // from class: ur1.c0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.la(this.f200185a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ur1.b.a.Dialog.class), new er.l() { // from class: ur1.d0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ma((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ur1.b.a.Screen.class), new er.l() { // from class: ur1.e0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.na(this.f200205a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ka(p0 p0Var, k10.z zVar) {
        j jVar = p0Var.new j(null);
        zVar.x(fr.q0.c(ur1.a.b.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 la(p0 p0Var, k10.z zVar) {
        zVar.A(p0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ma(k10.z zVar) {
        l lVar = new l(null);
        zVar.v(fr.q0.c(ur1.a.d.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 na(p0 p0Var, k10.z zVar) {
        zVar.C(p0Var.new t(null));
        u uVar = new u(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ur1.a.ChangeSwitchItem.class), oVar, uVar);
        zVar.v(fr.q0.c(ur1.a.SetDocumentDate.class), oVar, new v(null));
        zVar.v(fr.q0.c(ur1.a.SetInsuranceDate.class), oVar, new w(null));
        zVar.v(fr.q0.c(ur1.a.SetTechnicalExaminationDate.class), oVar, new x(null));
        zVar.v(fr.q0.c(ur1.a.SheetValueChange.class), oVar, new y(null));
        zVar.v(fr.q0.c(ur1.a.DataParser.class), oVar, new z(null));
        zVar.v(fr.q0.c(ur1.a.SelectedItem.class), oVar, new a0(null));
        zVar.v(fr.q0.c(ur1.a.LoadLocalNotifications.class), oVar, new b0(null));
        zVar.v(fr.q0.c(ur1.a.LoadLocalVehicleNotifications.class), oVar, new m(null));
        zVar.v(fr.q0.c(ur1.a.SetRegisterNo.class), oVar, new n(null));
        zVar.v(fr.q0.c(ur1.a.ShowDocumentDialog.class), oVar, p0Var.new o(null));
        zVar.v(fr.q0.c(ur1.a.ShowVehicleDialog.class), oVar, p0Var.new p(null));
        zVar.x(fr.q0.c(ur1.a.k.class), oVar, p0Var.new q(null));
        zVar.x(fr.q0.c(ur1.a.i.class), oVar, p0Var.new r(null));
        zVar.x(fr.q0.c(ur1.a.OpenDatePickerDialog.class), oVar, p0Var.new s(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ur1.a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ur1.b, ur1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ur1.d.a> getState() {
        return this.state;
    }

    public void ha(LocalDate value, vr1.a dateField) {
        i00.a.a(this, new h(dateField, this, value, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: ia, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }
}
