package cc;

import dc.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 T2\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\n0\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001a2\u0006\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u001dJ#\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0$2\u0006\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u001dJ\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u001dJ\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020)0$H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aH\u0016¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\u0006\u00102\u001a\u00020,H\u0016¢\u0006\u0004\b3\u0010/J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aH\u0016¢\u0006\u0004\b4\u00101J\u0015\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aH\u0016¢\u0006\u0004\b5\u00101J\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020,H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020,2\u0006\u0010>\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\bC\u0010=J\u001f\u0010E\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010H\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010G\u001a\u000206H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\bJ\u0010BJ\u0017\u0010K\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\bK\u0010BJ\u001f\u0010M\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010L\u001a\u00020,H\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010O\u001a\u000206H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020,H\u0016¢\u0006\u0004\bR\u0010;J\u001f\u0010T\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010S\u001a\u00020,H\u0016¢\u0006\u0004\bT\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010UR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00110V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00110Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010Z¨\u0006\\"}, d2 = {"Lcc/q1;", "Lcc/j0;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lya/b;", "_connection", "Lr0/a;", "", "", "_map", "Loq/i0;", "k0", "(Lya/b;Lr0/a;)V", "Landroidx/work/b;", "i0", "Lcc/i0;", "workSpec", "e", "(Lcc/i0;)V", "z", "id", "i", "(Ljava/lang/String;)Lcc/i0;", "name", "", "Lcc/i0$b;", "p", "(Ljava/lang/String;)Ljava/util/List;", "Lub/o0$c;", "h", "(Ljava/lang/String;)Lub/o0$c;", "tag", "Lcc/i0$c;", "y", "Lmu/g;", "n", "(Ljava/lang/String;)Lmu/g;", "k", "g", "", "q", "()Lmu/g;", "", "schedulerLimit", "r", "(I)Ljava/util/List;", "v", "()Ljava/util/List;", "maxLimit", "l", "f", "u", "", "startingAt", "c", "(J)Ljava/util/List;", "B", "()I", "a", "(Ljava/lang/String;)V", "state", "w", "(Lub/o0$c;Ljava/lang/String;)I", "j", "(Ljava/lang/String;)I", "b", "output", "s", "(Ljava/lang/String;Landroidx/work/b;)V", "enqueueTime", "t", "(Ljava/lang/String;J)V", "A", "x", "overrideGeneration", "C", "(Ljava/lang/String;I)V", "startTime", "o", "(Ljava/lang/String;J)I", "m", "stopReason", "d", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfWorkSpec", "Loa/e;", "Loa/e;", "__updateAdapterOfWorkSpec", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q1 implements j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oa.u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<i0> __insertAdapterOfWorkSpec = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oa.e<i0> __updateAdapterOfWorkSpec = new b();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"cc/q1$a", "Loa/f;", "Lcc/i0;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lcc/i0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends oa.f<i0> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, i0 entity) {
            statement.S0(1, entity.id);
            statement.f0(2, y1.k(entity.state));
            statement.S0(3, entity.workerClassName);
            statement.S0(4, entity.inputMergerClassName);
            androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
            statement.g0(5, companion.e(entity.input));
            statement.g0(6, companion.e(entity.output));
            statement.f0(7, entity.initialDelay);
            statement.f0(8, entity.intervalDuration);
            statement.f0(9, entity.flexDuration);
            statement.f0(10, entity.runAttemptCount);
            statement.f0(11, y1.a(entity.backoffPolicy));
            statement.f0(12, entity.backoffDelayDuration);
            statement.f0(13, entity.lastEnqueueTime);
            statement.f0(14, entity.minimumRetentionDuration);
            statement.f0(15, entity.scheduleRequestedAt);
            statement.f0(16, entity.expedited ? 1L : 0L);
            statement.f0(17, y1.i(entity.outOfQuotaPolicy));
            statement.f0(18, entity.getPeriodCount());
            statement.f0(19, entity.getGeneration());
            statement.f0(20, entity.getNextScheduleTimeOverride());
            statement.f0(21, entity.getNextScheduleTimeOverrideGeneration());
            statement.f0(22, entity.getStopReason());
            String traceTag = entity.getTraceTag();
            if (traceTag == null) {
                statement.i0(23);
            } else {
                statement.S0(23, traceTag);
            }
            Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
            Integer numValueOf = backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                statement.i0(24);
            } else {
                statement.f0(24, numValueOf.intValue());
            }
            ub.d dVar = entity.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String;
            statement.f0(25, y1.h(dVar.getRequiredNetworkType()));
            statement.g0(26, y1.c(dVar.getRequiredNetworkRequestCompat()));
            statement.f0(27, dVar.getRequiresCharging() ? 1L : 0L);
            statement.f0(28, dVar.getRequiresDeviceIdle() ? 1L : 0L);
            statement.f0(29, dVar.getRequiresBatteryNotLow() ? 1L : 0L);
            statement.f0(30, dVar.getRequiresStorageNotLow() ? 1L : 0L);
            statement.f0(31, dVar.getContentTriggerUpdateDelayMillis());
            statement.f0(32, dVar.getContentTriggerMaxDelayMillis());
            statement.g0(33, y1.j(dVar.c()));
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"cc/q1$b", "Loa/e;", "Lcc/i0;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "d", "(Lya/d;Lcc/i0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends oa.e<i0> {
        b() {
        }

        @Override // oa.e
        protected String b() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, i0 entity) {
            statement.S0(1, entity.id);
            statement.f0(2, y1.k(entity.state));
            statement.S0(3, entity.workerClassName);
            statement.S0(4, entity.inputMergerClassName);
            androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
            statement.g0(5, companion.e(entity.input));
            statement.g0(6, companion.e(entity.output));
            statement.f0(7, entity.initialDelay);
            statement.f0(8, entity.intervalDuration);
            statement.f0(9, entity.flexDuration);
            statement.f0(10, entity.runAttemptCount);
            statement.f0(11, y1.a(entity.backoffPolicy));
            statement.f0(12, entity.backoffDelayDuration);
            statement.f0(13, entity.lastEnqueueTime);
            statement.f0(14, entity.minimumRetentionDuration);
            statement.f0(15, entity.scheduleRequestedAt);
            statement.f0(16, entity.expedited ? 1L : 0L);
            statement.f0(17, y1.i(entity.outOfQuotaPolicy));
            statement.f0(18, entity.getPeriodCount());
            statement.f0(19, entity.getGeneration());
            statement.f0(20, entity.getNextScheduleTimeOverride());
            statement.f0(21, entity.getNextScheduleTimeOverrideGeneration());
            statement.f0(22, entity.getStopReason());
            String traceTag = entity.getTraceTag();
            if (traceTag == null) {
                statement.i0(23);
            } else {
                statement.S0(23, traceTag);
            }
            Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
            Integer numValueOf = backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                statement.i0(24);
            } else {
                statement.f0(24, numValueOf.intValue());
            }
            ub.d dVar = entity.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String;
            statement.f0(25, y1.h(dVar.getRequiredNetworkType()));
            statement.g0(26, y1.c(dVar.getRequiredNetworkRequestCompat()));
            statement.f0(27, dVar.getRequiresCharging() ? 1L : 0L);
            statement.f0(28, dVar.getRequiresDeviceIdle() ? 1L : 0L);
            statement.f0(29, dVar.getRequiresBatteryNotLow() ? 1L : 0L);
            statement.f0(30, dVar.getRequiresStorageNotLow() ? 1L : 0L);
            statement.f0(31, dVar.getContentTriggerUpdateDelayMillis());
            statement.f0(32, dVar.getContentTriggerMaxDelayMillis());
            statement.g0(33, y1.j(dVar.c()));
            statement.S0(34, entity.id);
        }
    }

    /* JADX INFO: renamed from: cc.q1$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcc/q1$c;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final List<mr.c<?>> a() {
            return pq.v.n();
        }

        private Companion() {
        }
    }

    public q1(oa.u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List A0(String str, String str2, q1 q1Var, ya.b bVar) {
        int i15;
        ya.d dVarE4 = bVar.e4(str);
        int i16 = 1;
        try {
            dVarE4.S0(1, str2);
            r0.a<String, List<String>> aVar = new r0.a<>();
            r0.a<String, List<androidx.work.b>> aVar2 = new r0.a<>();
            while (true) {
                i15 = 0;
                if (!dVarE4.Y3()) {
                    break;
                }
                String strU3 = dVarE4.u3(0);
                if (!aVar.containsKey(strU3)) {
                    aVar.put(strU3, new ArrayList());
                }
                String strU4 = dVarE4.u3(0);
                if (!aVar2.containsKey(strU4)) {
                    aVar2.put(strU4, new ArrayList());
                }
            }
            dVarE4.reset();
            q1Var.k0(bVar, aVar);
            q1Var.i0(bVar, aVar2);
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                r0.a<String, List<String>> aVar3 = aVar;
                arrayList.add(new i0.WorkInfoPojo(dVarE4.u3(i15), y1.g((int) dVarE4.getLong(i16)), androidx.work.b.INSTANCE.a(dVarE4.getBlob(2)), dVarE4.getLong(14), dVarE4.getLong(15), dVarE4.getLong(16), new ub.d(y1.l(dVarE4.getBlob(6)), y1.e((int) dVarE4.getLong(5)), ((int) dVarE4.getLong(7)) != 0, ((int) dVarE4.getLong(8)) != 0, ((int) dVarE4.getLong(9)) != 0, ((int) dVarE4.getLong(10)) != 0, dVarE4.getLong(11), dVarE4.getLong(12), y1.b(dVarE4.getBlob(13))), (int) dVarE4.getLong(3), y1.d((int) dVarE4.getLong(17)), dVarE4.getLong(18), dVarE4.getLong(19), (int) dVarE4.getLong(20), (int) dVarE4.getLong(4), dVarE4.getLong(21), (int) dVarE4.getLong(22), (List) pq.v0.j(aVar3, dVarE4.u3(0)), (List) pq.v0.j(aVar2, dVarE4.u3(0))));
                aVar = aVar3;
                i15 = 0;
                i16 = 1;
            }
            return arrayList;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B0(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            boolean z15 = false;
            if (dVarE4.Y3() && ((int) dVarE4.getLong(0)) != 0) {
                z15 = true;
            }
            return z15;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return oq.i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return ta.l.b(bVar);
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E0(q1 q1Var, i0 i0Var, ya.b bVar) throws Exception {
        q1Var.__insertAdapterOfWorkSpec.d(bVar, i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F0(String str, long j15, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, j15);
            dVarE4.S0(2, str2);
            dVarE4.Y3();
            return ta.l.b(bVar);
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int G0(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return ta.l.b(bVar);
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H0(String str, String str2, int i15, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.f0(2, i15);
            dVarE4.Y3();
            return oq.i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int I0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return ta.l.b(bVar);
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return ta.l.b(bVar);
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K0(String str, long j15, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, j15);
            dVarE4.S0(2, str2);
            dVarE4.Y3();
            return oq.i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L0(String str, androidx.work.b bVar, String str2, ya.b bVar2) {
        ya.d dVarE4 = bVar2.e4(str);
        try {
            dVarE4.g0(1, androidx.work.b.INSTANCE.e(bVar));
            dVarE4.S0(2, str2);
            dVarE4.Y3();
            return oq.i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M0(String str, ub.o0.c cVar, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, y1.k(cVar));
            dVarE4.S0(2, str2);
            dVarE4.Y3();
            return ta.l.b(bVar);
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N0(String str, int i15, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, i15);
            dVarE4.S0(2, str2);
            dVarE4.Y3();
            return oq.i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O0(q1 q1Var, i0 i0Var, ya.b bVar) throws Exception {
        q1Var.__updateAdapterOfWorkSpec.c(bVar, i0Var);
        return oq.i0.f148189a;
    }

    private final void i0(final ya.b _connection, r0.a<String, List<androidx.work.b>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            ta.i.a(_map, true, new er.l() { // from class: cc.c1
                @Override // er.l
                public final Object b(Object obj) {
                    return q1.j0(this.f25001a, _connection, (r0.a) obj);
                }
            });
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        ta.q.a(sb5, setKeySet.size());
        sb5.append(")");
        ya.d dVarE4 = _connection.e4(sb5.toString());
        Iterator<String> it = setKeySet.iterator();
        int i15 = 1;
        while (it.hasNext()) {
            dVarE4.S0(i15, it.next());
            i15++;
        }
        try {
            int iC = ta.m.c(dVarE4, "work_spec_id");
            if (iC == -1) {
                dVarE4.close();
                return;
            }
            while (dVarE4.Y3()) {
                List<androidx.work.b> list = _map.get(dVarE4.u3(iC));
                if (list != null) {
                    list.add(androidx.work.b.INSTANCE.a(dVarE4.getBlob(0)));
                }
            }
            dVarE4.close();
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(q1 q1Var, ya.b bVar, r0.a aVar) {
        q1Var.i0(bVar, aVar);
        return oq.i0.f148189a;
    }

    private final void k0(final ya.b _connection, r0.a<String, List<String>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            ta.i.a(_map, true, new er.l() { // from class: cc.d1
                @Override // er.l
                public final Object b(Object obj) {
                    return q1.l0(this.f25005a, _connection, (r0.a) obj);
                }
            });
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        ta.q.a(sb5, setKeySet.size());
        sb5.append(")");
        ya.d dVarE4 = _connection.e4(sb5.toString());
        Iterator<String> it = setKeySet.iterator();
        int i15 = 1;
        while (it.hasNext()) {
            dVarE4.S0(i15, it.next());
            i15++;
        }
        try {
            int iC = ta.m.c(dVarE4, "work_spec_id");
            if (iC == -1) {
                dVarE4.close();
                return;
            }
            while (dVarE4.Y3()) {
                List<String> list = _map.get(dVarE4.u3(iC));
                if (list != null) {
                    list.add(dVarE4.u3(0));
                }
            }
            dVarE4.close();
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(q1 q1Var, ya.b bVar, r0.a aVar) {
        q1Var.k0(bVar, aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m0(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            return dVarE4.Y3() ? (int) dVarE4.getLong(0) : 0;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return oq.i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o0(String str, int i15, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, i15);
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "state");
            int iD3 = ta.m.d(dVarE4, "worker_class_name");
            int iD4 = ta.m.d(dVarE4, "input_merger_class_name");
            int iD5 = ta.m.d(dVarE4, "input");
            int iD6 = ta.m.d(dVarE4, "output");
            int iD7 = ta.m.d(dVarE4, "initial_delay");
            int iD8 = ta.m.d(dVarE4, "interval_duration");
            int iD9 = ta.m.d(dVarE4, "flex_duration");
            int iD10 = ta.m.d(dVarE4, "run_attempt_count");
            int iD11 = ta.m.d(dVarE4, "backoff_policy");
            int iD12 = ta.m.d(dVarE4, "backoff_delay_duration");
            int iD13 = ta.m.d(dVarE4, "last_enqueue_time");
            int iD14 = ta.m.d(dVarE4, "minimum_retention_duration");
            int iD15 = ta.m.d(dVarE4, "schedule_requested_at");
            int iD16 = ta.m.d(dVarE4, "run_in_foreground");
            int iD17 = ta.m.d(dVarE4, "out_of_quota_policy");
            int iD18 = ta.m.d(dVarE4, "period_count");
            int iD19 = ta.m.d(dVarE4, "generation");
            int iD20 = ta.m.d(dVarE4, "next_schedule_time_override");
            int iD21 = ta.m.d(dVarE4, "next_schedule_time_override_generation");
            int iD22 = ta.m.d(dVarE4, "stop_reason");
            int iD23 = ta.m.d(dVarE4, "trace_tag");
            int iD24 = ta.m.d(dVarE4, "backoff_on_system_interruptions");
            int iD25 = ta.m.d(dVarE4, "required_network_type");
            int iD26 = ta.m.d(dVarE4, "required_network_request");
            int iD27 = ta.m.d(dVarE4, "requires_charging");
            int iD28 = ta.m.d(dVarE4, "requires_device_idle");
            int iD29 = ta.m.d(dVarE4, "requires_battery_not_low");
            int iD30 = ta.m.d(dVarE4, "requires_storage_not_low");
            int iD31 = ta.m.d(dVarE4, "trigger_content_update_delay");
            int iD32 = ta.m.d(dVarE4, "trigger_max_content_delay");
            int iD33 = ta.m.d(dVarE4, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD);
                int i16 = iD13;
                int i17 = iD14;
                ub.o0.c cVarG = y1.g((int) dVarE4.getLong(iD2));
                String strU4 = dVarE4.u3(iD3);
                String strU5 = dVarE4.u3(iD4);
                byte[] blob = dVarE4.getBlob(iD5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarE4.getBlob(iD6));
                long j15 = dVarE4.getLong(iD7);
                long j16 = dVarE4.getLong(iD8);
                long j17 = dVarE4.getLong(iD9);
                int i18 = (int) dVarE4.getLong(iD10);
                int i19 = iD;
                int i25 = iD2;
                ub.a aVarD = y1.d((int) dVarE4.getLong(iD11));
                long j18 = dVarE4.getLong(iD12);
                long j19 = dVarE4.getLong(i16);
                long j25 = dVarE4.getLong(i17);
                int i26 = iD15;
                long j26 = dVarE4.getLong(i26);
                iD15 = i26;
                int i27 = iD16;
                int i28 = iD3;
                boolean z15 = ((int) dVarE4.getLong(i27)) != 0;
                int i29 = iD17;
                int i35 = iD4;
                ub.f0 f0VarF = y1.f((int) dVarE4.getLong(i29));
                int i36 = iD18;
                int i37 = (int) dVarE4.getLong(i36);
                int i38 = iD19;
                int i39 = (int) dVarE4.getLong(i38);
                int i45 = iD20;
                long j27 = dVarE4.getLong(i45);
                int i46 = iD21;
                int i47 = (int) dVarE4.getLong(i46);
                iD21 = i46;
                iD22 = iD22;
                int i48 = (int) dVarE4.getLong(iD22);
                int i49 = iD23;
                Boolean boolValueOf = null;
                String strU6 = dVarE4.isNull(i49) ? null : dVarE4.u3(i49);
                int i55 = iD24;
                Integer numValueOf = dVarE4.isNull(i55) ? null : Integer.valueOf((int) dVarE4.getLong(i55));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i56 = iD25;
                ub.x xVarE = y1.e((int) dVarE4.getLong(i56));
                int i57 = iD26;
                NetworkRequestCompat networkRequestCompatL = y1.l(dVarE4.getBlob(i57));
                int i58 = iD27;
                boolean z16 = ((int) dVarE4.getLong(i58)) != 0;
                int i59 = iD28;
                boolean z17 = ((int) dVarE4.getLong(i59)) != 0;
                int i65 = iD29;
                boolean z18 = ((int) dVarE4.getLong(i65)) != 0;
                iD29 = i65;
                int i66 = iD30;
                int i67 = iD31;
                int i68 = iD32;
                iD31 = i67;
                int i69 = iD33;
                arrayList.add(new i0(strU3, cVarG, strU4, strU5, bVarA, bVarA2, j15, j16, j17, new ub.d(networkRequestCompatL, xVarE, z16, z17, z18, ((int) dVarE4.getLong(i66)) != 0, dVarE4.getLong(i67), dVarE4.getLong(i68), y1.b(dVarE4.getBlob(i69))), i18, aVarD, j18, j19, j25, j26, z15, f0VarF, i37, i39, j27, i47, i48, strU6, bool));
                iD28 = i59;
                iD4 = i35;
                iD17 = i29;
                iD18 = i36;
                iD19 = i38;
                iD20 = i45;
                iD23 = i49;
                iD24 = i55;
                iD25 = i56;
                iD26 = i57;
                iD27 = i58;
                iD33 = i69;
                iD32 = i68;
                iD30 = i66;
                iD = i19;
                iD13 = i16;
                iD14 = i17;
                iD2 = i25;
                iD3 = i28;
                iD16 = i27;
            }
            return arrayList;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p0(String str, int i15, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, i15);
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "state");
            int iD3 = ta.m.d(dVarE4, "worker_class_name");
            int iD4 = ta.m.d(dVarE4, "input_merger_class_name");
            int iD5 = ta.m.d(dVarE4, "input");
            int iD6 = ta.m.d(dVarE4, "output");
            int iD7 = ta.m.d(dVarE4, "initial_delay");
            int iD8 = ta.m.d(dVarE4, "interval_duration");
            int iD9 = ta.m.d(dVarE4, "flex_duration");
            int iD10 = ta.m.d(dVarE4, "run_attempt_count");
            int iD11 = ta.m.d(dVarE4, "backoff_policy");
            int iD12 = ta.m.d(dVarE4, "backoff_delay_duration");
            int iD13 = ta.m.d(dVarE4, "last_enqueue_time");
            int iD14 = ta.m.d(dVarE4, "minimum_retention_duration");
            int iD15 = ta.m.d(dVarE4, "schedule_requested_at");
            int iD16 = ta.m.d(dVarE4, "run_in_foreground");
            int iD17 = ta.m.d(dVarE4, "out_of_quota_policy");
            int iD18 = ta.m.d(dVarE4, "period_count");
            int iD19 = ta.m.d(dVarE4, "generation");
            int iD20 = ta.m.d(dVarE4, "next_schedule_time_override");
            int iD21 = ta.m.d(dVarE4, "next_schedule_time_override_generation");
            int iD22 = ta.m.d(dVarE4, "stop_reason");
            int iD23 = ta.m.d(dVarE4, "trace_tag");
            int iD24 = ta.m.d(dVarE4, "backoff_on_system_interruptions");
            int iD25 = ta.m.d(dVarE4, "required_network_type");
            int iD26 = ta.m.d(dVarE4, "required_network_request");
            int iD27 = ta.m.d(dVarE4, "requires_charging");
            int iD28 = ta.m.d(dVarE4, "requires_device_idle");
            int iD29 = ta.m.d(dVarE4, "requires_battery_not_low");
            int iD30 = ta.m.d(dVarE4, "requires_storage_not_low");
            int iD31 = ta.m.d(dVarE4, "trigger_content_update_delay");
            int iD32 = ta.m.d(dVarE4, "trigger_max_content_delay");
            int iD33 = ta.m.d(dVarE4, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD);
                int i16 = iD13;
                int i17 = iD14;
                ub.o0.c cVarG = y1.g((int) dVarE4.getLong(iD2));
                String strU4 = dVarE4.u3(iD3);
                String strU5 = dVarE4.u3(iD4);
                byte[] blob = dVarE4.getBlob(iD5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarE4.getBlob(iD6));
                long j15 = dVarE4.getLong(iD7);
                long j16 = dVarE4.getLong(iD8);
                long j17 = dVarE4.getLong(iD9);
                int i18 = (int) dVarE4.getLong(iD10);
                int i19 = iD;
                int i25 = iD2;
                ub.a aVarD = y1.d((int) dVarE4.getLong(iD11));
                long j18 = dVarE4.getLong(iD12);
                long j19 = dVarE4.getLong(i16);
                long j25 = dVarE4.getLong(i17);
                int i26 = iD15;
                long j26 = dVarE4.getLong(i26);
                iD15 = i26;
                int i27 = iD16;
                int i28 = iD3;
                boolean z15 = ((int) dVarE4.getLong(i27)) != 0;
                int i29 = iD17;
                int i35 = iD4;
                ub.f0 f0VarF = y1.f((int) dVarE4.getLong(i29));
                int i36 = iD18;
                int i37 = (int) dVarE4.getLong(i36);
                int i38 = iD19;
                int i39 = (int) dVarE4.getLong(i38);
                int i45 = iD20;
                long j27 = dVarE4.getLong(i45);
                int i46 = iD21;
                int i47 = (int) dVarE4.getLong(i46);
                iD21 = i46;
                iD22 = iD22;
                int i48 = (int) dVarE4.getLong(iD22);
                int i49 = iD23;
                Boolean boolValueOf = null;
                String strU6 = dVarE4.isNull(i49) ? null : dVarE4.u3(i49);
                int i55 = iD24;
                Integer numValueOf = dVarE4.isNull(i55) ? null : Integer.valueOf((int) dVarE4.getLong(i55));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i56 = iD25;
                ub.x xVarE = y1.e((int) dVarE4.getLong(i56));
                int i57 = iD26;
                NetworkRequestCompat networkRequestCompatL = y1.l(dVarE4.getBlob(i57));
                int i58 = iD27;
                boolean z16 = ((int) dVarE4.getLong(i58)) != 0;
                int i59 = iD28;
                boolean z17 = ((int) dVarE4.getLong(i59)) != 0;
                int i65 = iD29;
                boolean z18 = ((int) dVarE4.getLong(i65)) != 0;
                iD29 = i65;
                int i66 = iD30;
                int i67 = iD31;
                int i68 = iD32;
                iD31 = i67;
                int i69 = iD33;
                arrayList.add(new i0(strU3, cVarG, strU4, strU5, bVarA, bVarA2, j15, j16, j17, new ub.d(networkRequestCompatL, xVarE, z16, z17, z18, ((int) dVarE4.getLong(i66)) != 0, dVarE4.getLong(i67), dVarE4.getLong(i68), y1.b(dVarE4.getBlob(i69))), i18, aVarD, j18, j19, j25, j26, z15, f0VarF, i37, i39, j27, i47, i48, strU6, bool));
                iD28 = i59;
                iD4 = i35;
                iD17 = i29;
                iD18 = i36;
                iD19 = i38;
                iD20 = i45;
                iD23 = i49;
                iD24 = i55;
                iD25 = i56;
                iD26 = i57;
                iD27 = i58;
                iD33 = i69;
                iD32 = i68;
                iD30 = i66;
                iD = i19;
                iD13 = i16;
                iD14 = i17;
                iD2 = i25;
                iD3 = i28;
                iD16 = i27;
            }
            return arrayList;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q0(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "state");
            int iD3 = ta.m.d(dVarE4, "worker_class_name");
            int iD4 = ta.m.d(dVarE4, "input_merger_class_name");
            int iD5 = ta.m.d(dVarE4, "input");
            int iD6 = ta.m.d(dVarE4, "output");
            int iD7 = ta.m.d(dVarE4, "initial_delay");
            int iD8 = ta.m.d(dVarE4, "interval_duration");
            int iD9 = ta.m.d(dVarE4, "flex_duration");
            int iD10 = ta.m.d(dVarE4, "run_attempt_count");
            int iD11 = ta.m.d(dVarE4, "backoff_policy");
            int iD12 = ta.m.d(dVarE4, "backoff_delay_duration");
            int iD13 = ta.m.d(dVarE4, "last_enqueue_time");
            int iD14 = ta.m.d(dVarE4, "minimum_retention_duration");
            int iD15 = ta.m.d(dVarE4, "schedule_requested_at");
            int iD16 = ta.m.d(dVarE4, "run_in_foreground");
            int iD17 = ta.m.d(dVarE4, "out_of_quota_policy");
            int iD18 = ta.m.d(dVarE4, "period_count");
            int iD19 = ta.m.d(dVarE4, "generation");
            int iD20 = ta.m.d(dVarE4, "next_schedule_time_override");
            int iD21 = ta.m.d(dVarE4, "next_schedule_time_override_generation");
            int iD22 = ta.m.d(dVarE4, "stop_reason");
            int iD23 = ta.m.d(dVarE4, "trace_tag");
            int iD24 = ta.m.d(dVarE4, "backoff_on_system_interruptions");
            int iD25 = ta.m.d(dVarE4, "required_network_type");
            int iD26 = ta.m.d(dVarE4, "required_network_request");
            int iD27 = ta.m.d(dVarE4, "requires_charging");
            int iD28 = ta.m.d(dVarE4, "requires_device_idle");
            int iD29 = ta.m.d(dVarE4, "requires_battery_not_low");
            int iD30 = ta.m.d(dVarE4, "requires_storage_not_low");
            int iD31 = ta.m.d(dVarE4, "trigger_content_update_delay");
            int iD32 = ta.m.d(dVarE4, "trigger_max_content_delay");
            int iD33 = ta.m.d(dVarE4, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD);
                int i15 = iD14;
                ArrayList arrayList2 = arrayList;
                ub.o0.c cVarG = y1.g((int) dVarE4.getLong(iD2));
                String strU4 = dVarE4.u3(iD3);
                String strU5 = dVarE4.u3(iD4);
                byte[] blob = dVarE4.getBlob(iD5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarE4.getBlob(iD6));
                long j15 = dVarE4.getLong(iD7);
                long j16 = dVarE4.getLong(iD8);
                long j17 = dVarE4.getLong(iD9);
                int i16 = (int) dVarE4.getLong(iD10);
                int i17 = iD2;
                int i18 = iD3;
                ub.a aVarD = y1.d((int) dVarE4.getLong(iD11));
                long j18 = dVarE4.getLong(iD12);
                long j19 = dVarE4.getLong(iD13);
                long j25 = dVarE4.getLong(i15);
                int i19 = iD15;
                long j26 = dVarE4.getLong(i19);
                int i25 = iD;
                int i26 = iD16;
                boolean z15 = ((int) dVarE4.getLong(i26)) != 0;
                int i27 = iD17;
                int i28 = iD4;
                ub.f0 f0VarF = y1.f((int) dVarE4.getLong(i27));
                int i29 = iD18;
                int i35 = iD5;
                int i36 = (int) dVarE4.getLong(i29);
                int i37 = iD19;
                int i38 = (int) dVarE4.getLong(i37);
                int i39 = iD20;
                long j27 = dVarE4.getLong(i39);
                int i45 = iD21;
                int i46 = (int) dVarE4.getLong(i45);
                int i47 = iD22;
                int i48 = (int) dVarE4.getLong(i47);
                int i49 = iD23;
                Boolean boolValueOf = null;
                String strU6 = dVarE4.isNull(i49) ? null : dVarE4.u3(i49);
                int i55 = iD24;
                Integer numValueOf = dVarE4.isNull(i55) ? null : Integer.valueOf((int) dVarE4.getLong(i55));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i56 = iD25;
                Boolean bool = boolValueOf;
                ub.x xVarE = y1.e((int) dVarE4.getLong(i56));
                int i57 = iD26;
                NetworkRequestCompat networkRequestCompatL = y1.l(dVarE4.getBlob(i57));
                iD25 = i56;
                iD26 = i57;
                int i58 = iD27;
                boolean z16 = ((int) dVarE4.getLong(i58)) != 0;
                iD27 = i58;
                int i59 = iD28;
                boolean z17 = ((int) dVarE4.getLong(i59)) != 0;
                int i65 = iD29;
                boolean z18 = ((int) dVarE4.getLong(i65)) != 0;
                iD29 = i65;
                int i66 = iD30;
                int i67 = iD31;
                int i68 = iD32;
                int i69 = iD33;
                iD33 = i69;
                arrayList2.add(new i0(strU3, cVarG, strU4, strU5, bVarA, bVarA2, j15, j16, j17, new ub.d(networkRequestCompatL, xVarE, z16, z17, z18, ((int) dVarE4.getLong(i66)) != 0, dVarE4.getLong(i67), dVarE4.getLong(i68), y1.b(dVarE4.getBlob(i69))), i16, aVarD, j18, j19, j25, j26, z15, f0VarF, i36, i38, j27, i46, i48, strU6, bool));
                iD30 = i66;
                iD4 = i28;
                iD17 = i27;
                iD19 = i37;
                iD22 = i47;
                iD24 = i55;
                iD31 = i67;
                iD32 = i68;
                iD2 = i17;
                iD14 = i15;
                iD3 = i18;
                arrayList = arrayList2;
                iD = i25;
                iD15 = i19;
                iD16 = i26;
                iD20 = i39;
                iD21 = i45;
                iD23 = i49;
                iD28 = i59;
                iD5 = i35;
                iD18 = i29;
            }
            return arrayList;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                arrayList.add(androidx.work.b.INSTANCE.a(dVarE4.getBlob(0)));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List s0(String str, long j15, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, j15);
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "state");
            int iD3 = ta.m.d(dVarE4, "worker_class_name");
            int iD4 = ta.m.d(dVarE4, "input_merger_class_name");
            int iD5 = ta.m.d(dVarE4, "input");
            int iD6 = ta.m.d(dVarE4, "output");
            int iD7 = ta.m.d(dVarE4, "initial_delay");
            int iD8 = ta.m.d(dVarE4, "interval_duration");
            int iD9 = ta.m.d(dVarE4, "flex_duration");
            int iD10 = ta.m.d(dVarE4, "run_attempt_count");
            int iD11 = ta.m.d(dVarE4, "backoff_policy");
            int iD12 = ta.m.d(dVarE4, "backoff_delay_duration");
            int iD13 = ta.m.d(dVarE4, "last_enqueue_time");
            int iD14 = ta.m.d(dVarE4, "minimum_retention_duration");
            int iD15 = ta.m.d(dVarE4, "schedule_requested_at");
            int iD16 = ta.m.d(dVarE4, "run_in_foreground");
            int iD17 = ta.m.d(dVarE4, "out_of_quota_policy");
            int iD18 = ta.m.d(dVarE4, "period_count");
            int iD19 = ta.m.d(dVarE4, "generation");
            int iD20 = ta.m.d(dVarE4, "next_schedule_time_override");
            int iD21 = ta.m.d(dVarE4, "next_schedule_time_override_generation");
            int iD22 = ta.m.d(dVarE4, "stop_reason");
            int iD23 = ta.m.d(dVarE4, "trace_tag");
            int iD24 = ta.m.d(dVarE4, "backoff_on_system_interruptions");
            int iD25 = ta.m.d(dVarE4, "required_network_type");
            int iD26 = ta.m.d(dVarE4, "required_network_request");
            int iD27 = ta.m.d(dVarE4, "requires_charging");
            int iD28 = ta.m.d(dVarE4, "requires_device_idle");
            int iD29 = ta.m.d(dVarE4, "requires_battery_not_low");
            int iD30 = ta.m.d(dVarE4, "requires_storage_not_low");
            int iD31 = ta.m.d(dVarE4, "trigger_content_update_delay");
            int iD32 = ta.m.d(dVarE4, "trigger_max_content_delay");
            int iD33 = ta.m.d(dVarE4, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD);
                int i15 = iD13;
                int i16 = iD14;
                ub.o0.c cVarG = y1.g((int) dVarE4.getLong(iD2));
                String strU4 = dVarE4.u3(iD3);
                String strU5 = dVarE4.u3(iD4);
                byte[] blob = dVarE4.getBlob(iD5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarE4.getBlob(iD6));
                long j16 = dVarE4.getLong(iD7);
                long j17 = dVarE4.getLong(iD8);
                long j18 = dVarE4.getLong(iD9);
                int i17 = (int) dVarE4.getLong(iD10);
                int i18 = iD;
                int i19 = iD2;
                ub.a aVarD = y1.d((int) dVarE4.getLong(iD11));
                long j19 = dVarE4.getLong(iD12);
                long j25 = dVarE4.getLong(i15);
                long j26 = dVarE4.getLong(i16);
                int i25 = iD15;
                long j27 = dVarE4.getLong(i25);
                iD15 = i25;
                int i26 = iD16;
                int i27 = iD3;
                boolean z15 = ((int) dVarE4.getLong(i26)) != 0;
                int i28 = iD17;
                int i29 = iD4;
                ub.f0 f0VarF = y1.f((int) dVarE4.getLong(i28));
                int i35 = iD18;
                int i36 = (int) dVarE4.getLong(i35);
                int i37 = iD19;
                int i38 = (int) dVarE4.getLong(i37);
                int i39 = iD20;
                long j28 = dVarE4.getLong(i39);
                int i45 = iD21;
                int i46 = (int) dVarE4.getLong(i45);
                iD21 = i45;
                iD22 = iD22;
                int i47 = (int) dVarE4.getLong(iD22);
                int i48 = iD23;
                Boolean boolValueOf = null;
                String strU6 = dVarE4.isNull(i48) ? null : dVarE4.u3(i48);
                int i49 = iD24;
                Integer numValueOf = dVarE4.isNull(i49) ? null : Integer.valueOf((int) dVarE4.getLong(i49));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i55 = iD25;
                ub.x xVarE = y1.e((int) dVarE4.getLong(i55));
                int i56 = iD26;
                NetworkRequestCompat networkRequestCompatL = y1.l(dVarE4.getBlob(i56));
                int i57 = iD27;
                boolean z16 = ((int) dVarE4.getLong(i57)) != 0;
                int i58 = iD28;
                boolean z17 = ((int) dVarE4.getLong(i58)) != 0;
                int i59 = iD29;
                boolean z18 = ((int) dVarE4.getLong(i59)) != 0;
                iD29 = i59;
                int i65 = iD30;
                int i66 = iD31;
                int i67 = iD32;
                iD31 = i66;
                int i68 = iD33;
                arrayList.add(new i0(strU3, cVarG, strU4, strU5, bVarA, bVarA2, j16, j17, j18, new ub.d(networkRequestCompatL, xVarE, z16, z17, z18, ((int) dVarE4.getLong(i65)) != 0, dVarE4.getLong(i66), dVarE4.getLong(i67), y1.b(dVarE4.getBlob(i68))), i17, aVarD, j19, j25, j26, j27, z15, f0VarF, i36, i38, j28, i46, i47, strU6, bool));
                iD4 = i29;
                iD17 = i28;
                iD18 = i35;
                iD19 = i37;
                iD20 = i39;
                iD23 = i48;
                iD24 = i49;
                iD25 = i55;
                iD26 = i56;
                iD27 = i57;
                iD28 = i58;
                iD33 = i68;
                iD32 = i67;
                iD30 = i65;
                iD = i18;
                iD13 = i15;
                iD14 = i16;
                iD2 = i19;
                iD3 = i27;
                iD16 = i26;
            }
            return arrayList;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List t0(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "state");
            int iD3 = ta.m.d(dVarE4, "worker_class_name");
            int iD4 = ta.m.d(dVarE4, "input_merger_class_name");
            int iD5 = ta.m.d(dVarE4, "input");
            int iD6 = ta.m.d(dVarE4, "output");
            int iD7 = ta.m.d(dVarE4, "initial_delay");
            int iD8 = ta.m.d(dVarE4, "interval_duration");
            int iD9 = ta.m.d(dVarE4, "flex_duration");
            int iD10 = ta.m.d(dVarE4, "run_attempt_count");
            int iD11 = ta.m.d(dVarE4, "backoff_policy");
            int iD12 = ta.m.d(dVarE4, "backoff_delay_duration");
            int iD13 = ta.m.d(dVarE4, "last_enqueue_time");
            int iD14 = ta.m.d(dVarE4, "minimum_retention_duration");
            int iD15 = ta.m.d(dVarE4, "schedule_requested_at");
            int iD16 = ta.m.d(dVarE4, "run_in_foreground");
            int iD17 = ta.m.d(dVarE4, "out_of_quota_policy");
            int iD18 = ta.m.d(dVarE4, "period_count");
            int iD19 = ta.m.d(dVarE4, "generation");
            int iD20 = ta.m.d(dVarE4, "next_schedule_time_override");
            int iD21 = ta.m.d(dVarE4, "next_schedule_time_override_generation");
            int iD22 = ta.m.d(dVarE4, "stop_reason");
            int iD23 = ta.m.d(dVarE4, "trace_tag");
            int iD24 = ta.m.d(dVarE4, "backoff_on_system_interruptions");
            int iD25 = ta.m.d(dVarE4, "required_network_type");
            int iD26 = ta.m.d(dVarE4, "required_network_request");
            int iD27 = ta.m.d(dVarE4, "requires_charging");
            int iD28 = ta.m.d(dVarE4, "requires_device_idle");
            int iD29 = ta.m.d(dVarE4, "requires_battery_not_low");
            int iD30 = ta.m.d(dVarE4, "requires_storage_not_low");
            int iD31 = ta.m.d(dVarE4, "trigger_content_update_delay");
            int iD32 = ta.m.d(dVarE4, "trigger_max_content_delay");
            int iD33 = ta.m.d(dVarE4, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD);
                int i15 = iD14;
                ArrayList arrayList2 = arrayList;
                ub.o0.c cVarG = y1.g((int) dVarE4.getLong(iD2));
                String strU4 = dVarE4.u3(iD3);
                String strU5 = dVarE4.u3(iD4);
                byte[] blob = dVarE4.getBlob(iD5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarE4.getBlob(iD6));
                long j15 = dVarE4.getLong(iD7);
                long j16 = dVarE4.getLong(iD8);
                long j17 = dVarE4.getLong(iD9);
                int i16 = (int) dVarE4.getLong(iD10);
                int i17 = iD2;
                int i18 = iD3;
                ub.a aVarD = y1.d((int) dVarE4.getLong(iD11));
                long j18 = dVarE4.getLong(iD12);
                long j19 = dVarE4.getLong(iD13);
                long j25 = dVarE4.getLong(i15);
                int i19 = iD15;
                long j26 = dVarE4.getLong(i19);
                int i25 = iD;
                int i26 = iD16;
                boolean z15 = ((int) dVarE4.getLong(i26)) != 0;
                int i27 = iD17;
                int i28 = iD4;
                ub.f0 f0VarF = y1.f((int) dVarE4.getLong(i27));
                int i29 = iD18;
                int i35 = iD5;
                int i36 = (int) dVarE4.getLong(i29);
                int i37 = iD19;
                int i38 = (int) dVarE4.getLong(i37);
                int i39 = iD20;
                long j27 = dVarE4.getLong(i39);
                int i45 = iD21;
                int i46 = (int) dVarE4.getLong(i45);
                int i47 = iD22;
                int i48 = (int) dVarE4.getLong(i47);
                int i49 = iD23;
                Boolean boolValueOf = null;
                String strU6 = dVarE4.isNull(i49) ? null : dVarE4.u3(i49);
                int i55 = iD24;
                Integer numValueOf = dVarE4.isNull(i55) ? null : Integer.valueOf((int) dVarE4.getLong(i55));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i56 = iD25;
                Boolean bool = boolValueOf;
                ub.x xVarE = y1.e((int) dVarE4.getLong(i56));
                int i57 = iD26;
                NetworkRequestCompat networkRequestCompatL = y1.l(dVarE4.getBlob(i57));
                iD25 = i56;
                iD26 = i57;
                int i58 = iD27;
                boolean z16 = ((int) dVarE4.getLong(i58)) != 0;
                iD27 = i58;
                int i59 = iD28;
                boolean z17 = ((int) dVarE4.getLong(i59)) != 0;
                int i65 = iD29;
                boolean z18 = ((int) dVarE4.getLong(i65)) != 0;
                iD29 = i65;
                int i66 = iD30;
                int i67 = iD31;
                int i68 = iD32;
                int i69 = iD33;
                iD33 = i69;
                arrayList2.add(new i0(strU3, cVarG, strU4, strU5, bVarA, bVarA2, j15, j16, j17, new ub.d(networkRequestCompatL, xVarE, z16, z17, z18, ((int) dVarE4.getLong(i66)) != 0, dVarE4.getLong(i67), dVarE4.getLong(i68), y1.b(dVarE4.getBlob(i69))), i16, aVarD, j18, j19, j25, j26, z15, f0VarF, i36, i38, j27, i46, i48, strU6, bool));
                iD30 = i66;
                iD4 = i28;
                iD17 = i27;
                iD19 = i37;
                iD22 = i47;
                iD24 = i55;
                iD31 = i67;
                iD32 = i68;
                iD2 = i17;
                iD14 = i15;
                iD3 = i18;
                arrayList = arrayList2;
                iD = i25;
                iD15 = i19;
                iD16 = i26;
                iD20 = i39;
                iD21 = i45;
                iD23 = i49;
                iD28 = i59;
                iD5 = i35;
                iD18 = i29;
            }
            return arrayList;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List u0(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "state");
            int iD3 = ta.m.d(dVarE4, "worker_class_name");
            int iD4 = ta.m.d(dVarE4, "input_merger_class_name");
            int iD5 = ta.m.d(dVarE4, "input");
            int iD6 = ta.m.d(dVarE4, "output");
            int iD7 = ta.m.d(dVarE4, "initial_delay");
            int iD8 = ta.m.d(dVarE4, "interval_duration");
            int iD9 = ta.m.d(dVarE4, "flex_duration");
            int iD10 = ta.m.d(dVarE4, "run_attempt_count");
            int iD11 = ta.m.d(dVarE4, "backoff_policy");
            int iD12 = ta.m.d(dVarE4, "backoff_delay_duration");
            int iD13 = ta.m.d(dVarE4, "last_enqueue_time");
            int iD14 = ta.m.d(dVarE4, "minimum_retention_duration");
            int iD15 = ta.m.d(dVarE4, "schedule_requested_at");
            int iD16 = ta.m.d(dVarE4, "run_in_foreground");
            int iD17 = ta.m.d(dVarE4, "out_of_quota_policy");
            int iD18 = ta.m.d(dVarE4, "period_count");
            int iD19 = ta.m.d(dVarE4, "generation");
            int iD20 = ta.m.d(dVarE4, "next_schedule_time_override");
            int iD21 = ta.m.d(dVarE4, "next_schedule_time_override_generation");
            int iD22 = ta.m.d(dVarE4, "stop_reason");
            int iD23 = ta.m.d(dVarE4, "trace_tag");
            int iD24 = ta.m.d(dVarE4, "backoff_on_system_interruptions");
            int iD25 = ta.m.d(dVarE4, "required_network_type");
            int iD26 = ta.m.d(dVarE4, "required_network_request");
            int iD27 = ta.m.d(dVarE4, "requires_charging");
            int iD28 = ta.m.d(dVarE4, "requires_device_idle");
            int iD29 = ta.m.d(dVarE4, "requires_battery_not_low");
            int iD30 = ta.m.d(dVarE4, "requires_storage_not_low");
            int iD31 = ta.m.d(dVarE4, "trigger_content_update_delay");
            int iD32 = ta.m.d(dVarE4, "trigger_max_content_delay");
            int iD33 = ta.m.d(dVarE4, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD);
                int i15 = iD14;
                ArrayList arrayList2 = arrayList;
                ub.o0.c cVarG = y1.g((int) dVarE4.getLong(iD2));
                String strU4 = dVarE4.u3(iD3);
                String strU5 = dVarE4.u3(iD4);
                byte[] blob = dVarE4.getBlob(iD5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarE4.getBlob(iD6));
                long j15 = dVarE4.getLong(iD7);
                long j16 = dVarE4.getLong(iD8);
                long j17 = dVarE4.getLong(iD9);
                int i16 = (int) dVarE4.getLong(iD10);
                int i17 = iD2;
                int i18 = iD3;
                ub.a aVarD = y1.d((int) dVarE4.getLong(iD11));
                long j18 = dVarE4.getLong(iD12);
                long j19 = dVarE4.getLong(iD13);
                long j25 = dVarE4.getLong(i15);
                int i19 = iD15;
                long j26 = dVarE4.getLong(i19);
                int i25 = iD;
                int i26 = iD16;
                boolean z15 = ((int) dVarE4.getLong(i26)) != 0;
                int i27 = iD17;
                int i28 = iD4;
                ub.f0 f0VarF = y1.f((int) dVarE4.getLong(i27));
                int i29 = iD18;
                int i35 = iD5;
                int i36 = (int) dVarE4.getLong(i29);
                int i37 = iD19;
                int i38 = (int) dVarE4.getLong(i37);
                int i39 = iD20;
                long j27 = dVarE4.getLong(i39);
                int i45 = iD21;
                int i46 = (int) dVarE4.getLong(i45);
                int i47 = iD22;
                int i48 = (int) dVarE4.getLong(i47);
                int i49 = iD23;
                Boolean boolValueOf = null;
                String strU6 = dVarE4.isNull(i49) ? null : dVarE4.u3(i49);
                int i55 = iD24;
                Integer numValueOf = dVarE4.isNull(i55) ? null : Integer.valueOf((int) dVarE4.getLong(i55));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i56 = iD25;
                Boolean bool = boolValueOf;
                ub.x xVarE = y1.e((int) dVarE4.getLong(i56));
                int i57 = iD26;
                NetworkRequestCompat networkRequestCompatL = y1.l(dVarE4.getBlob(i57));
                iD25 = i56;
                iD26 = i57;
                int i58 = iD27;
                boolean z16 = ((int) dVarE4.getLong(i58)) != 0;
                iD27 = i58;
                int i59 = iD28;
                boolean z17 = ((int) dVarE4.getLong(i59)) != 0;
                int i65 = iD29;
                boolean z18 = ((int) dVarE4.getLong(i65)) != 0;
                iD29 = i65;
                int i66 = iD30;
                int i67 = iD31;
                int i68 = iD32;
                int i69 = iD33;
                iD33 = i69;
                arrayList2.add(new i0(strU3, cVarG, strU4, strU5, bVarA, bVarA2, j15, j16, j17, new ub.d(networkRequestCompatL, xVarE, z16, z17, z18, ((int) dVarE4.getLong(i66)) != 0, dVarE4.getLong(i67), dVarE4.getLong(i68), y1.b(dVarE4.getBlob(i69))), i16, aVarD, j18, j19, j25, j26, z15, f0VarF, i36, i38, j27, i46, i48, strU6, bool));
                iD30 = i66;
                iD4 = i28;
                iD17 = i27;
                iD19 = i37;
                iD22 = i47;
                iD24 = i55;
                iD31 = i67;
                iD32 = i68;
                iD2 = i17;
                iD14 = i15;
                iD3 = i18;
                arrayList = arrayList2;
                iD = i25;
                iD15 = i19;
                iD16 = i26;
                iD20 = i39;
                iD21 = i45;
                iD23 = i49;
                iD28 = i59;
                iD5 = i35;
                iD18 = i29;
            }
            return arrayList;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ub.o0.c v0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            ub.o0.c cVarG = null;
            if (dVarE4.Y3()) {
                Integer numValueOf = dVarE4.isNull(0) ? null : Integer.valueOf((int) dVarE4.getLong(0));
                if (numValueOf != null) {
                    cVarG = y1.g(numValueOf.intValue());
                }
            }
            return cVarG;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List w0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                arrayList.add(dVarE4.u3(0));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "state");
            int iD3 = ta.m.d(dVarE4, "worker_class_name");
            int iD4 = ta.m.d(dVarE4, "input_merger_class_name");
            int iD5 = ta.m.d(dVarE4, "input");
            int iD6 = ta.m.d(dVarE4, "output");
            int iD7 = ta.m.d(dVarE4, "initial_delay");
            int iD8 = ta.m.d(dVarE4, "interval_duration");
            int iD9 = ta.m.d(dVarE4, "flex_duration");
            int iD10 = ta.m.d(dVarE4, "run_attempt_count");
            int iD11 = ta.m.d(dVarE4, "backoff_policy");
            int iD12 = ta.m.d(dVarE4, "backoff_delay_duration");
            int iD13 = ta.m.d(dVarE4, "last_enqueue_time");
            int iD14 = ta.m.d(dVarE4, "minimum_retention_duration");
            int iD15 = ta.m.d(dVarE4, "schedule_requested_at");
            int iD16 = ta.m.d(dVarE4, "run_in_foreground");
            int iD17 = ta.m.d(dVarE4, "out_of_quota_policy");
            int iD18 = ta.m.d(dVarE4, "period_count");
            int iD19 = ta.m.d(dVarE4, "generation");
            int iD20 = ta.m.d(dVarE4, "next_schedule_time_override");
            int iD21 = ta.m.d(dVarE4, "next_schedule_time_override_generation");
            int iD22 = ta.m.d(dVarE4, "stop_reason");
            int iD23 = ta.m.d(dVarE4, "trace_tag");
            int iD24 = ta.m.d(dVarE4, "backoff_on_system_interruptions");
            int iD25 = ta.m.d(dVarE4, "required_network_type");
            int iD26 = ta.m.d(dVarE4, "required_network_request");
            int iD27 = ta.m.d(dVarE4, "requires_charging");
            int iD28 = ta.m.d(dVarE4, "requires_device_idle");
            int iD29 = ta.m.d(dVarE4, "requires_battery_not_low");
            int iD30 = ta.m.d(dVarE4, "requires_storage_not_low");
            int iD31 = ta.m.d(dVarE4, "trigger_content_update_delay");
            int iD32 = ta.m.d(dVarE4, "trigger_max_content_delay");
            int iD33 = ta.m.d(dVarE4, "content_uri_triggers");
            i0 i0Var = null;
            Boolean boolValueOf = null;
            if (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD);
                ub.o0.c cVarG = y1.g((int) dVarE4.getLong(iD2));
                String strU4 = dVarE4.u3(iD3);
                String strU5 = dVarE4.u3(iD4);
                byte[] blob = dVarE4.getBlob(iD5);
                androidx.work.b.Companion companion = androidx.work.b.INSTANCE;
                androidx.work.b bVarA = companion.a(blob);
                androidx.work.b bVarA2 = companion.a(dVarE4.getBlob(iD6));
                long j15 = dVarE4.getLong(iD7);
                long j16 = dVarE4.getLong(iD8);
                long j17 = dVarE4.getLong(iD9);
                int i15 = (int) dVarE4.getLong(iD10);
                ub.a aVarD = y1.d((int) dVarE4.getLong(iD11));
                long j18 = dVarE4.getLong(iD12);
                long j19 = dVarE4.getLong(iD13);
                long j25 = dVarE4.getLong(iD14);
                long j26 = dVarE4.getLong(iD15);
                boolean z15 = ((int) dVarE4.getLong(iD16)) != 0;
                ub.f0 f0VarF = y1.f((int) dVarE4.getLong(iD17));
                int i16 = (int) dVarE4.getLong(iD18);
                int i17 = (int) dVarE4.getLong(iD19);
                long j27 = dVarE4.getLong(iD20);
                int i18 = (int) dVarE4.getLong(iD21);
                int i19 = (int) dVarE4.getLong(iD22);
                String strU6 = dVarE4.isNull(iD23) ? null : dVarE4.u3(iD23);
                Integer numValueOf = dVarE4.isNull(iD24) ? null : Integer.valueOf((int) dVarE4.getLong(iD24));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                i0Var = new i0(strU3, cVarG, strU4, strU5, bVarA, bVarA2, j15, j16, j17, new ub.d(y1.l(dVarE4.getBlob(iD26)), y1.e((int) dVarE4.getLong(iD25)), ((int) dVarE4.getLong(iD27)) != 0, ((int) dVarE4.getLong(iD28)) != 0, ((int) dVarE4.getLong(iD29)) != 0, ((int) dVarE4.getLong(iD30)) != 0, dVarE4.getLong(iD31), dVarE4.getLong(iD32), y1.b(dVarE4.getBlob(iD33))), i15, aVarD, j18, j19, j25, j26, z15, f0VarF, i16, i17, j27, i18, i19, strU6, boolValueOf);
            }
            return i0Var;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List y0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                arrayList.add(new i0.IdAndState(dVarE4.u3(0), y1.g((int) dVarE4.getLong(1))));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List z0(String str, String str2, q1 q1Var, ya.b bVar) {
        int i15;
        ya.d dVarE4 = bVar.e4(str);
        int i16 = 1;
        try {
            dVarE4.S0(1, str2);
            r0.a<String, List<String>> aVar = new r0.a<>();
            r0.a<String, List<androidx.work.b>> aVar2 = new r0.a<>();
            while (true) {
                i15 = 0;
                if (!dVarE4.Y3()) {
                    break;
                }
                String strU3 = dVarE4.u3(0);
                if (!aVar.containsKey(strU3)) {
                    aVar.put(strU3, new ArrayList());
                }
                String strU4 = dVarE4.u3(0);
                if (!aVar2.containsKey(strU4)) {
                    aVar2.put(strU4, new ArrayList());
                }
            }
            dVarE4.reset();
            q1Var.k0(bVar, aVar);
            q1Var.i0(bVar, aVar2);
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                r0.a<String, List<String>> aVar3 = aVar;
                arrayList.add(new i0.WorkInfoPojo(dVarE4.u3(i15), y1.g((int) dVarE4.getLong(i16)), androidx.work.b.INSTANCE.a(dVarE4.getBlob(2)), dVarE4.getLong(14), dVarE4.getLong(15), dVarE4.getLong(16), new ub.d(y1.l(dVarE4.getBlob(6)), y1.e((int) dVarE4.getLong(5)), ((int) dVarE4.getLong(7)) != 0, ((int) dVarE4.getLong(8)) != 0, ((int) dVarE4.getLong(9)) != 0, ((int) dVarE4.getLong(10)) != 0, dVarE4.getLong(11), dVarE4.getLong(12), y1.b(dVarE4.getBlob(13))), (int) dVarE4.getLong(3), y1.d((int) dVarE4.getLong(17)), dVarE4.getLong(18), dVarE4.getLong(19), (int) dVarE4.getLong(20), (int) dVarE4.getLong(4), dVarE4.getLong(21), (int) dVarE4.getLong(22), (List) pq.v0.j(aVar3, dVarE4.u3(0)), (List) pq.v0.j(aVar2, dVarE4.u3(0))));
                aVar = aVar3;
                i15 = 0;
                i16 = 1;
            }
            return arrayList;
        } finally {
            dVarE4.close();
        }
    }

    @Override // cc.j0
    public int A(final String id5) {
        final String str = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        return ((Number) ta.a.c(this.__db, false, true, new er.l() { // from class: cc.g1
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(q1.D0(str, id5, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // cc.j0
    public int B() {
        final String str = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
        return ((Number) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.k1
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(q1.m0(str, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // cc.j0
    public void C(final String id5, final int overrideGeneration) {
        final String str = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.x0
            @Override // er.l
            public final Object b(Object obj) {
                return q1.H0(str, id5, overrideGeneration, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public void a(final String id5) {
        final String str = "DELETE FROM workspec WHERE id=?";
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.l1
            @Override // er.l
            public final Object b(Object obj) {
                return q1.n0(str, id5, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public void b(final String id5) {
        final String str = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.a1
            @Override // er.l
            public final Object b(Object obj) {
                return q1.C0(str, id5, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public List<i0> c(final long startingAt) {
        final String str = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";
        return (List) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.f1
            @Override // er.l
            public final Object b(Object obj) {
                return q1.s0(str, startingAt, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public void d(final String id5, final int stopReason) {
        final String str = "UPDATE workspec SET stop_reason=? WHERE id=?";
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.j1
            @Override // er.l
            public final Object b(Object obj) {
                return q1.N0(str, stopReason, id5, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public void e(final i0 workSpec) {
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.w0
            @Override // er.l
            public final Object b(Object obj) {
                return q1.E0(this.f25153a, workSpec, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public List<i0> f() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
        return (List) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.m0
            @Override // er.l
            public final Object b(Object obj) {
                return q1.u0(str, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public List<String> g(final String name) {
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.s0
            @Override // er.l
            public final Object b(Object obj) {
                return q1.w0(str, name, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public ub.o0.c h(final String id5) {
        final String str = "SELECT state FROM workspec WHERE id=?";
        return (ub.o0.c) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.r0
            @Override // er.l
            public final Object b(Object obj) {
                return q1.v0(str, id5, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public i0 i(final String id5) {
        final String str = "SELECT * FROM workspec WHERE id=?";
        return (i0) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.l0
            @Override // er.l
            public final Object b(Object obj) {
                return q1.x0(str, id5, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public int j(final String id5) {
        final String str = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        return ((Number) ta.a.c(this.__db, false, true, new er.l() { // from class: cc.t0
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(q1.J0(str, id5, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // cc.j0
    public List<androidx.work.b> k(final String id5) {
        final String str = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        return (List) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.b1
            @Override // er.l
            public final Object b(Object obj) {
                return q1.r0(str, id5, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public List<i0> l(final int maxLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";
        return (List) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.n1
            @Override // er.l
            public final Object b(Object obj) {
                return q1.o0(str, maxLimit, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public int m() {
        final String str = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        return ((Number) ta.a.c(this.__db, false, true, new er.l() { // from class: cc.o1
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(q1.G0(str, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // cc.j0
    public mu.g<List<i0.WorkInfoPojo>> n(final String tag) {
        final String str = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return qa.k.a(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new er.l() { // from class: cc.i1
            @Override // er.l
            public final Object b(Object obj) {
                return q1.z0(str, tag, this, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public int o(final String id5, final long startTime) {
        final String str = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        return ((Number) ta.a.c(this.__db, false, true, new er.l() { // from class: cc.o0
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(q1.F0(str, startTime, id5, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // cc.j0
    public List<i0.IdAndState> p(final String name) {
        final String str = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.p1
            @Override // er.l
            public final Object b(Object obj) {
                return q1.y0(str, name, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public mu.g<Boolean> q() {
        final String str = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
        return qa.k.a(this.__db, false, new String[]{"workspec"}, new er.l() { // from class: cc.m1
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(q1.B0(str, (ya.b) obj));
            }
        });
    }

    @Override // cc.j0
    public List<i0> r(final int schedulerLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";
        return (List) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.n0
            @Override // er.l
            public final Object b(Object obj) {
                return q1.p0(str, schedulerLimit, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public void s(final String id5, final androidx.work.b output) {
        final String str = "UPDATE workspec SET output=? WHERE id=?";
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.u0
            @Override // er.l
            public final Object b(Object obj) {
                return q1.L0(str, output, id5, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public void t(final String id5, final long enqueueTime) {
        final String str = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.v0
            @Override // er.l
            public final Object b(Object obj) {
                return q1.K0(str, enqueueTime, id5, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public List<i0> u() {
        final String str = "SELECT * FROM workspec WHERE state=1";
        return (List) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.p0
            @Override // er.l
            public final Object b(Object obj) {
                return q1.t0(str, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public List<i0> v() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
        return (List) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.h1
            @Override // er.l
            public final Object b(Object obj) {
                return q1.q0(str, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public int w(final ub.o0.c state, final String id5) {
        final String str = "UPDATE workspec SET state=? WHERE id=?";
        return ((Number) ta.a.c(this.__db, false, true, new er.l() { // from class: cc.q0
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(q1.M0(str, state, id5, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // cc.j0
    public int x(final String id5) {
        final String str = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        return ((Number) ta.a.c(this.__db, false, true, new er.l() { // from class: cc.z0
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(q1.I0(str, id5, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // cc.j0
    public List<i0.WorkInfoPojo> y(final String tag) {
        final String str = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) ta.a.c(this.__db, true, true, new er.l() { // from class: cc.y0
            @Override // er.l
            public final Object b(Object obj) {
                return q1.A0(str, tag, this, (ya.b) obj);
            }
        });
    }

    @Override // cc.j0
    public void z(final i0 workSpec) {
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.e1
            @Override // er.l
            public final Object b(Object obj) {
                return q1.O0(this.f25010a, workSpec, (ya.b) obj);
            }
        });
    }
}
