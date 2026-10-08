package pl.gov.coi.mobywatel.technical.localnotifications.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ez.a;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import ju.d2;
import ju.p0;
import ju.q0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import s54.o;
import s54.p;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010BE\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lpl/gov/coi/mobywatel/technical/localnotifications/worker/LocalNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Le64/b;", "localNotificationsRepository", "Lez/a;", "currentTimeProvider", "Lpx/d;", "remoteLogger", "Ls54/o;", "showDocumentLocalNotificationUseCase", "Ls54/p;", "showVehicleLocalNotificationUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Le64/b;Lez/a;Lpx/d;Ls54/o;Ls54/p;)V", "Ljava/time/LocalDate;", "currentDateTime", "Lju/d2;", "s", "(Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "t", "", "r", "()Z", "Landroidx/work/c$a;", "k", "(Ltq/e;)Ljava/lang/Object;", "g", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "h", "Landroidx/work/WorkerParameters;", "getWorkerParameters", "()Landroidx/work/WorkerParameters;", "i", "Le64/b;", "j", "Lez/a;", "Lpx/d;", "l", "Ls54/o;", "m", "Ls54/p;", "n", "a", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LocalNotificationWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters workerParameters;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final e64.b localNotificationsRepository;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a currentTimeProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final o showDocumentLocalNotificationUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p showVehicleLocalNotificationUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f159238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f159239e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f159241g;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f159239e = obj;
            this.f159241g |= PKIFailureInfo.systemUnavail;
            return LocalNotificationWorker.this.k(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lju/d2;", "<anonymous>", "(Lju/p0;)Lju/d2;"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements er.p<p0, e<? super d2>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f159242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f159243f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalDate f159245h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends k implements er.p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f159246e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f159247f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f159248g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f159249h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f159250j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f159251k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f159252l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f159253m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f159254n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ LocalNotificationWorker f159255p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ LocalDate f159256q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LocalNotificationWorker localNotificationWorker, LocalDate localDate, e<? super a> eVar) {
                super(2, eVar);
                this.f159255p = localNotificationWorker;
                this.f159256q = localDate;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0060  */
            /* JADX WARN: Code duplicated, block: B:21:0x0098 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x005a->B:24:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
            
                if (r13 == r0) goto L18;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    r12 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r12.f159254n
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L35
                    if (r1 == r4) goto L31
                    if (r1 != r3) goto L29
                    int r1 = r12.f159252l
                    java.lang.Object r4 = r12.f159251k
                    r54.a r4 = (r54.LocalDocumentNotification) r4
                    java.lang.Object r4 = r12.f159249h
                    java.util.Iterator r4 = (java.util.Iterator) r4
                    java.lang.Object r5 = r12.f159248g
                    pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker r5 = (pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker) r5
                    java.lang.Object r6 = r12.f159247f
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.lang.Object r7 = r12.f159246e
                    java.util.List r7 = (java.util.List) r7
                    oq.u.b(r13)
                    goto L5a
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L31:
                    oq.u.b(r13)
                    goto L49
                L35:
                    oq.u.b(r13)
                    pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker r13 = r12.f159255p
                    e64.b r13 = pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker.o(r13)
                    java.time.LocalDate r1 = r12.f159256q
                    r12.f159254n = r4
                    java.lang.Object r13 = r13.a(r1, r12)
                    if (r13 != r0) goto L49
                    goto L98
                L49:
                    java.util.List r13 = (java.util.List) r13
                    r1 = r13
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker r4 = r12.f159255p
                    java.util.Iterator r5 = r1.iterator()
                    r6 = r5
                    r5 = r4
                    r4 = r6
                    r7 = r13
                    r6 = r1
                    r1 = r2
                L5a:
                    boolean r13 = r4.hasNext()
                    if (r13 == 0) goto L99
                    java.lang.Object r13 = r4.next()
                    r8 = r13
                    r54.a r8 = (r54.LocalDocumentNotification) r8
                    s54.o r9 = pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker.p(r5)
                    s54.o$a r10 = new s54.o$a
                    r10.<init>(r8)
                    java.lang.Object r11 = vq.j.a(r7)
                    r12.f159246e = r11
                    java.lang.Object r11 = vq.j.a(r6)
                    r12.f159247f = r11
                    r12.f159248g = r5
                    r12.f159249h = r4
                    java.lang.Object r13 = vq.j.a(r13)
                    r12.f159250j = r13
                    java.lang.Object r13 = vq.j.a(r8)
                    r12.f159251k = r13
                    r12.f159252l = r1
                    r12.f159253m = r2
                    r12.f159254n = r3
                    java.lang.Object r13 = r9.c(r10, r12)
                    if (r13 != r0) goto L5a
                L98:
                    return r0
                L99:
                    oq.i0 r13 = oq.i0.f148189a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker.c.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new a(this.f159255p, this.f159256q, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(LocalDate localDate, e<? super c> eVar) {
            super(2, eVar);
            this.f159245h = localDate;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f159243f;
            uq.b.e();
            if (this.f159242e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return ju.k.d(p0Var, null, null, new a(LocalNotificationWorker.this, this.f159245h, null), 3, null);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super d2> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            c cVar = LocalNotificationWorker.this.new c(this.f159245h, eVar);
            cVar.f159243f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lju/d2;", "<anonymous>", "(Lju/p0;)Lju/d2;"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements er.p<p0, e<? super d2>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f159257e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f159258f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalDate f159260h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends k implements er.p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f159261e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f159262f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f159263g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f159264h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f159265j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f159266k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f159267l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f159268m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f159269n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ LocalNotificationWorker f159270p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ LocalDate f159271q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LocalNotificationWorker localNotificationWorker, LocalDate localDate, e<? super a> eVar) {
                super(2, eVar);
                this.f159270p = localNotificationWorker;
                this.f159271q = localDate;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0060  */
            /* JADX WARN: Code duplicated, block: B:21:0x0098 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x005a->B:24:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
            
                if (r13 == r0) goto L18;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    r12 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r12.f159269n
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L35
                    if (r1 == r4) goto L31
                    if (r1 != r3) goto L29
                    int r1 = r12.f159267l
                    java.lang.Object r4 = r12.f159266k
                    r54.d r4 = (r54.LocalVehicleNotification) r4
                    java.lang.Object r4 = r12.f159264h
                    java.util.Iterator r4 = (java.util.Iterator) r4
                    java.lang.Object r5 = r12.f159263g
                    pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker r5 = (pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker) r5
                    java.lang.Object r6 = r12.f159262f
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.lang.Object r7 = r12.f159261e
                    java.util.List r7 = (java.util.List) r7
                    oq.u.b(r13)
                    goto L5a
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L31:
                    oq.u.b(r13)
                    goto L49
                L35:
                    oq.u.b(r13)
                    pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker r13 = r12.f159270p
                    e64.b r13 = pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker.o(r13)
                    java.time.LocalDate r1 = r12.f159271q
                    r12.f159269n = r4
                    java.lang.Object r13 = r13.e(r1, r12)
                    if (r13 != r0) goto L49
                    goto L98
                L49:
                    java.util.List r13 = (java.util.List) r13
                    r1 = r13
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker r4 = r12.f159270p
                    java.util.Iterator r5 = r1.iterator()
                    r6 = r5
                    r5 = r4
                    r4 = r6
                    r7 = r13
                    r6 = r1
                    r1 = r2
                L5a:
                    boolean r13 = r4.hasNext()
                    if (r13 == 0) goto L99
                    java.lang.Object r13 = r4.next()
                    r8 = r13
                    r54.d r8 = (r54.LocalVehicleNotification) r8
                    s54.p r9 = pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker.q(r5)
                    s54.p$a r10 = new s54.p$a
                    r10.<init>(r8)
                    java.lang.Object r11 = vq.j.a(r7)
                    r12.f159261e = r11
                    java.lang.Object r11 = vq.j.a(r6)
                    r12.f159262f = r11
                    r12.f159263g = r5
                    r12.f159264h = r4
                    java.lang.Object r13 = vq.j.a(r13)
                    r12.f159265j = r13
                    java.lang.Object r13 = vq.j.a(r8)
                    r12.f159266k = r13
                    r12.f159267l = r1
                    r12.f159268m = r2
                    r12.f159269n = r3
                    java.lang.Object r13 = r9.c(r10, r12)
                    if (r13 != r0) goto L5a
                L98:
                    return r0
                L99:
                    oq.i0 r13 = oq.i0.f148189a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker.d.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new a(this.f159270p, this.f159271q, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(LocalDate localDate, e<? super d> eVar) {
            super(2, eVar);
            this.f159260h = localDate;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f159258f;
            uq.b.e();
            if (this.f159257e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return ju.k.d(p0Var, null, null, new a(LocalNotificationWorker.this, this.f159260h, null), 3, null);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super d2> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            d dVar = LocalNotificationWorker.this.new d(this.f159260h, eVar);
            dVar.f159258f = obj;
            return dVar;
        }
    }

    public LocalNotificationWorker(Context context, WorkerParameters workerParameters, e64.b bVar, a aVar, px.d dVar, o oVar, p pVar) {
        super(context, workerParameters);
        this.context = context;
        this.workerParameters = workerParameters;
        this.localNotificationsRepository = bVar;
        this.currentTimeProvider = aVar;
        this.remoteLogger = dVar;
        this.showDocumentLocalNotificationUseCase = oVar;
        this.showVehicleLocalNotificationUseCase = pVar;
    }

    private final boolean r() {
        OffsetDateTime offsetDateTimeF = this.currentTimeProvider.f();
        return offsetDateTimeF.isAfter(offsetDateTimeF.withHour(6).withMinute(0)) && offsetDateTimeF.isBefore(offsetDateTimeF.withHour(20).withMinute(0));
    }

    private final Object s(LocalDate localDate, e<? super d2> eVar) {
        return q0.e(new c(localDate, null), eVar);
    }

    private final Object t(LocalDate localDate, e<? super d2> eVar) {
        return q0.e(new d(localDate, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (t(r2, r0) == r1) goto L32;
     */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(tq.e<? super androidx.work.c.a> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.localnotifications.worker.LocalNotificationWorker.k(tq.e):java.lang.Object");
    }
}
