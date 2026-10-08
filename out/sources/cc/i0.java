package cc;

import androidx.work.OverwritingInputMerger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import p105prN.o2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b8\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0003>0<B\u0081\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b$\u0010%B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b$\u0010'B\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b$\u0010*J\u0015\u0010,\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020+2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0019¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b4\u00105J\u008e\u0002\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010:\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010=R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u0010=R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u0010DR\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bM\u0010DR\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010DR\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bO\u0010DR\u0016\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010RR\"\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010J\u001a\u0004\bG\u00109\"\u0004\bS\u0010TR\u001a\u0010\u001e\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010J\u001a\u0004\bC\u00109R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010D\u001a\u0004\bE\u00101\"\u0004\bO\u0010-R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010J\u001a\u0004\bF\u00109\"\u0004\bP\u0010TR\u001a\u0010!\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010J\u001a\u0004\bI\u00109R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010=\u001a\u0004\bK\u00105\"\u0004\bU\u0010ZR$\u0010#\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\bB\u0010]\"\u0004\b^\u0010_R\u0011\u0010`\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bN\u00103R\u0011\u0010a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bM\u00103¨\u0006c"}, d2 = {"Lcc/i0;", "", "", "id", "Lub/o0$c;", "state", "workerClassName", "inputMergerClassName", "Landroidx/work/b;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Lub/d;", CryptoServicesPermission.CONSTRAINTS, "", "runAttemptCount", "Lub/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "Lub/f0;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "backOffOnSystemInterruptions", "<init>", "(Ljava/lang/String;Lub/o0$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLub/d;ILub/a;JJJJZLub/f0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Lcc/i0;)V", "Loq/i0;", "r", "(J)V", "s", "(JJ)V", "c", "()J", "m", "()Z", "toString", "()Ljava/lang/String;", "d", "(Ljava/lang/String;Lub/o0$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLub/d;ILub/a;JJJJZLub/f0;IIJIILjava/lang/String;Ljava/lang/Boolean;)Lcc/i0;", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lub/o0$c;", "e", "Landroidx/work/b;", "f", "g", "J", "h", "i", "j", "Lub/d;", "k", "I", "l", "Lub/a;", "n", "o", "p", "q", "Z", "Lub/f0;", "setPeriodCount", "(I)V", "t", "u", "v", "w", "x", "(Ljava/lang/String;)V", "y", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setBackOffOnSystemInterruptions", "(Ljava/lang/Boolean;)V", "isPeriodic", "isBackedOff", "z", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public ub.o0.c state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String workerClassName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String inputMergerClassName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public androidx.work.b input;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public androidx.work.b output;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public long initialDelay;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public long intervalDuration;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public long flexDuration;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public ub.d constraints;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int runAttemptCount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public ub.a backoffPolicy;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public long backoffDelayDuration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long lastEnqueueTime;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public long minimumRetentionDuration;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public long scheduleRequestedAt;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean expedited;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public ub.f0 outOfQuotaPolicy;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int periodCount;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int generation;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long nextScheduleTimeOverride;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int nextScheduleTimeOverrideGeneration;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final int stopReason;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private String traceTag;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private Boolean backOffOnSystemInterruptions;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String A = ub.w.i("WorkSpec");
    public static final o2<List<WorkInfoPojo>, List<ub.o0>> B = new o2() { // from class: cc.h0
        @Override // p105prN.o2
        public final Object apply(Object obj) {
            return i0.b((List) obj);
        }
    };

    /* JADX INFO: renamed from: cc.i0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcc/i0$a;", "", "<init>", "()V", "", "isBackedOff", "", "runAttemptCount", "Lub/a;", "backoffPolicy", "", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "isPeriodic", "initialDelay", "flexDuration", "intervalDuration", "nextScheduleTimeOverride", "a", "(ZILub/a;JJIZJJJJ)J", "", "TAG", "Ljava/lang/String;", "SCHEDULE_NOT_REQUESTED_YET", "J", "LprN/o2;", "", "Lcc/i0$c;", "Lub/o0;", "WORK_INFO_MAPPER", "LprN/o2;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final long a(boolean isBackedOff, int runAttemptCount, ub.a backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, int periodCount, boolean isPeriodic, long initialDelay, long flexDuration, long intervalDuration, long nextScheduleTimeOverride) {
            long jK;
            if (nextScheduleTimeOverride != Long.MAX_VALUE && isPeriodic) {
                return periodCount == 0 ? nextScheduleTimeOverride : lr.m.f(nextScheduleTimeOverride, lastEnqueueTime + 900000);
            }
            if (isBackedOff) {
                jK = lr.m.k(backoffPolicy == ub.a.LINEAR ? backoffDelayDuration * ((long) runAttemptCount) : (long) Math.scalb(backoffDelayDuration, runAttemptCount - 1), 18000000L);
            } else {
                if (!isPeriodic) {
                    if (lastEnqueueTime == -1) {
                        return Long.MAX_VALUE;
                    }
                    return lastEnqueueTime + initialDelay;
                }
                lastEnqueueTime = periodCount == 0 ? lastEnqueueTime + initialDelay : lastEnqueueTime + intervalDuration;
                if (flexDuration == intervalDuration || periodCount != 0) {
                    return lastEnqueueTime;
                }
                jK = intervalDuration - flexDuration;
            }
            return lastEnqueueTime + jK;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: cc.i0$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcc/i0$b;", "", "", "id", "Lub/o0$c;", "state", "<init>", "(Ljava/lang/String;Lub/o0$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lub/o0$c;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IdAndState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public ub.o0.c state;

        public IdAndState(String str, ub.o0.c cVar) {
            this.id = str;
            this.state = cVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) other;
            return fr.t.c(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }
    }

    /* JADX INFO: renamed from: cc.i0$c, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b.\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010!R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00107\u001a\u0004\b9\u0010!R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u0010!R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010(R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u00107\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010LR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u00107\u001a\u0004\bN\u0010!\"\u0004\bO\u0010LR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010A\u001a\u0004\bQ\u0010(\"\u0004\bR\u0010SR\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010A\u001a\u0004\bU\u0010(R\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u00107\u001a\u0004\bW\u0010!R\u001a\u0010\u0017\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010A\u001a\u0004\bY\u0010(R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010[\u001a\u0004\b_\u0010]R\u0011\u0010a\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b6\u0010`R\u0011\u0010b\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b2\u0010`¨\u0006c"}, d2 = {"Lcc/i0$c;", "", "", "id", "Lub/o0$c;", "state", "Landroidx/work/b;", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Lub/d;", CryptoServicesPermission.CONSTRAINTS, "", "runAttemptCount", "Lub/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "generation", "nextScheduleTimeOverride", "stopReason", "", "tags", "progress", "<init>", "(Ljava/lang/String;Lub/o0$c;Landroidx/work/b;JJJLub/d;ILub/a;JJIIJILjava/util/List;Ljava/util/List;)V", "Lub/o0$b;", "b", "()Lub/o0$b;", "a", "()J", "Lub/o0;", "e", "()Lub/o0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lub/o0$c;", "getState", "()Lub/o0$c;", "c", "Landroidx/work/b;", "getOutput", "()Landroidx/work/b;", "d", "J", "getInitialDelay", "getIntervalDuration", "f", "getFlexDuration", "g", "Lub/d;", "getConstraints", "()Lub/d;", "h", "I", "getRunAttemptCount", "i", "Lub/a;", "getBackoffPolicy", "()Lub/a;", "setBackoffPolicy", "(Lub/a;)V", "j", "getBackoffDelayDuration", "setBackoffDelayDuration", "(J)V", "k", "getLastEnqueueTime", "setLastEnqueueTime", "l", "getPeriodCount", "setPeriodCount", "(I)V", "m", "getGeneration", "n", "getNextScheduleTimeOverride", "o", "getStopReason", "p", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "q", "getProgress", "()Z", "isPeriodic", "isBackedOff", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WorkInfoPojo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ub.o0.c state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final androidx.work.b output;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final long initialDelay;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final long intervalDuration;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final long flexDuration;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final ub.d constraints;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int runAttemptCount;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private ub.a backoffPolicy;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private long backoffDelayDuration;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private long lastEnqueueTime;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private int periodCount;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final int generation;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final long nextScheduleTimeOverride;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final int stopReason;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> tags;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<androidx.work.b> progress;

        public WorkInfoPojo(String str, ub.o0.c cVar, androidx.work.b bVar, long j15, long j16, long j17, ub.d dVar, int i15, ub.a aVar, long j18, long j19, int i16, int i17, long j25, int i18, List<String> list, List<androidx.work.b> list2) {
            this.id = str;
            this.state = cVar;
            this.output = bVar;
            this.initialDelay = j15;
            this.intervalDuration = j16;
            this.flexDuration = j17;
            this.constraints = dVar;
            this.runAttemptCount = i15;
            this.backoffPolicy = aVar;
            this.backoffDelayDuration = j18;
            this.lastEnqueueTime = j19;
            this.periodCount = i16;
            this.generation = i17;
            this.nextScheduleTimeOverride = j25;
            this.stopReason = i18;
            this.tags = list;
            this.progress = list2;
        }

        private final long a() {
            if (this.state == ub.o0.c.ENQUEUED) {
                return i0.INSTANCE.a(c(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, d(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
            }
            return Long.MAX_VALUE;
        }

        private final ub.o0.b b() {
            long j15 = this.intervalDuration;
            if (j15 != 0) {
                return new ub.o0.b(j15, this.flexDuration);
            }
            return null;
        }

        public final boolean c() {
            return this.state == ub.o0.c.ENQUEUED && this.runAttemptCount > 0;
        }

        public final boolean d() {
            return this.intervalDuration != 0;
        }

        public final ub.o0 e() {
            return new ub.o0(UUID.fromString(this.id), this.state, new HashSet(this.tags), this.output, !this.progress.isEmpty() ? this.progress.get(0) : androidx.work.b.f13823c, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, b(), a(), this.stopReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) other;
            return fr.t.c(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && fr.t.c(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && fr.t.c(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && fr.t.c(this.tags, workInfoPojo.tags) && fr.t.c(this.progress, workInfoPojo.progress);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.stopReason)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", initialDelay=" + this.initialDelay + ", intervalDuration=" + this.intervalDuration + ", flexDuration=" + this.flexDuration + ", constraints=" + this.constraints + ", runAttemptCount=" + this.runAttemptCount + ", backoffPolicy=" + this.backoffPolicy + ", backoffDelayDuration=" + this.backoffDelayDuration + ", lastEnqueueTime=" + this.lastEnqueueTime + ", periodCount=" + this.periodCount + ", generation=" + this.generation + ", nextScheduleTimeOverride=" + this.nextScheduleTimeOverride + ", stopReason=" + this.stopReason + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }
    }

    public i0(String str, ub.o0.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j15, long j16, long j17, ub.d dVar, int i15, ub.a aVar, long j18, long j19, long j25, long j26, boolean z15, ub.f0 f0Var, int i16, int i17, long j27, int i18, int i19, String str4, Boolean bool) {
        this.id = str;
        this.state = cVar;
        this.workerClassName = str2;
        this.inputMergerClassName = str3;
        this.input = bVar;
        this.output = bVar2;
        this.initialDelay = j15;
        this.intervalDuration = j16;
        this.flexDuration = j17;
        this.constraints = dVar;
        this.runAttemptCount = i15;
        this.backoffPolicy = aVar;
        this.backoffDelayDuration = j18;
        this.lastEnqueueTime = j19;
        this.minimumRetentionDuration = j25;
        this.scheduleRequestedAt = j26;
        this.expedited = z15;
        this.outOfQuotaPolicy = f0Var;
        this.periodCount = i16;
        this.generation = i17;
        this.nextScheduleTimeOverride = j27;
        this.nextScheduleTimeOverrideGeneration = i18;
        this.stopReason = i19;
        this.traceTag = str4;
        this.backOffOnSystemInterruptions = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).e());
        }
        return arrayList;
    }

    public static /* synthetic */ i0 e(i0 i0Var, String str, ub.o0.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j15, long j16, long j17, ub.d dVar, int i15, ub.a aVar, long j18, long j19, long j25, long j26, boolean z15, ub.f0 f0Var, int i16, int i17, long j27, int i18, int i19, String str4, Boolean bool, int i25, Object obj) {
        Boolean bool2;
        String str5;
        String str6 = (i25 & 1) != 0 ? i0Var.id : str;
        ub.o0.c cVar2 = (i25 & 2) != 0 ? i0Var.state : cVar;
        String str7 = (i25 & 4) != 0 ? i0Var.workerClassName : str2;
        String str8 = (i25 & 8) != 0 ? i0Var.inputMergerClassName : str3;
        androidx.work.b bVar3 = (i25 & 16) != 0 ? i0Var.input : bVar;
        androidx.work.b bVar4 = (i25 & 32) != 0 ? i0Var.output : bVar2;
        long j28 = (i25 & 64) != 0 ? i0Var.initialDelay : j15;
        long j29 = (i25 & 128) != 0 ? i0Var.intervalDuration : j16;
        long j35 = (i25 & 256) != 0 ? i0Var.flexDuration : j17;
        ub.d dVar2 = (i25 & 512) != 0 ? i0Var.constraints : dVar;
        int i26 = (i25 & 1024) != 0 ? i0Var.runAttemptCount : i15;
        String str9 = str6;
        ub.a aVar2 = (i25 & 2048) != 0 ? i0Var.backoffPolicy : aVar;
        ub.o0.c cVar3 = cVar2;
        long j36 = (i25 & PKIFailureInfo.certConfirmed) != 0 ? i0Var.backoffDelayDuration : j18;
        long j37 = (i25 & PKIFailureInfo.certRevoked) != 0 ? i0Var.lastEnqueueTime : j19;
        long j38 = (i25 & 16384) != 0 ? i0Var.minimumRetentionDuration : j25;
        long j39 = (i25 & 32768) != 0 ? i0Var.scheduleRequestedAt : j26;
        boolean z16 = (i25 & PKIFailureInfo.notAuthorized) != 0 ? i0Var.expedited : z15;
        long j45 = j39;
        ub.f0 f0Var2 = (i25 & PKIFailureInfo.unsupportedVersion) != 0 ? i0Var.outOfQuotaPolicy : f0Var;
        int i27 = (i25 & PKIFailureInfo.transactionIdInUse) != 0 ? i0Var.periodCount : i16;
        ub.f0 f0Var3 = f0Var2;
        int i28 = (i25 & PKIFailureInfo.signerNotTrusted) != 0 ? i0Var.generation : i17;
        int i29 = i27;
        long j46 = (i25 & PKIFailureInfo.badCertTemplate) != 0 ? i0Var.nextScheduleTimeOverride : j27;
        int i35 = (i25 & PKIFailureInfo.badSenderNonce) != 0 ? i0Var.nextScheduleTimeOverrideGeneration : i18;
        int i36 = (i25 & 4194304) != 0 ? i0Var.stopReason : i19;
        int i37 = i35;
        String str10 = (i25 & 8388608) != 0 ? i0Var.traceTag : str4;
        if ((i25 & 16777216) != 0) {
            str5 = str10;
            bool2 = i0Var.backOffOnSystemInterruptions;
        } else {
            bool2 = bool;
            str5 = str10;
        }
        return i0Var.d(str9, cVar3, str7, str8, bVar3, bVar4, j28, j29, j35, dVar2, i26, aVar2, j36, j37, j38, j45, z16, f0Var3, i29, i28, j46, i37, i36, str5, bool2);
    }

    public final long c() {
        return INSTANCE.a(n(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, o(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    public final i0 d(String id5, ub.o0.c state, String workerClassName, String inputMergerClassName, androidx.work.b input, androidx.work.b output, long initialDelay, long intervalDuration, long flexDuration, ub.d constraints, int runAttemptCount, ub.a backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, ub.f0 outOfQuotaPolicy, int periodCount, int generation, long nextScheduleTimeOverride, int nextScheduleTimeOverrideGeneration, int stopReason, String traceTag, Boolean backOffOnSystemInterruptions) {
        return new i0(id5, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation, nextScheduleTimeOverride, nextScheduleTimeOverrideGeneration, stopReason, traceTag, backOffOnSystemInterruptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) other;
        return fr.t.c(this.id, i0Var.id) && this.state == i0Var.state && fr.t.c(this.workerClassName, i0Var.workerClassName) && fr.t.c(this.inputMergerClassName, i0Var.inputMergerClassName) && fr.t.c(this.input, i0Var.input) && fr.t.c(this.output, i0Var.output) && this.initialDelay == i0Var.initialDelay && this.intervalDuration == i0Var.intervalDuration && this.flexDuration == i0Var.flexDuration && fr.t.c(this.constraints, i0Var.constraints) && this.runAttemptCount == i0Var.runAttemptCount && this.backoffPolicy == i0Var.backoffPolicy && this.backoffDelayDuration == i0Var.backoffDelayDuration && this.lastEnqueueTime == i0Var.lastEnqueueTime && this.minimumRetentionDuration == i0Var.minimumRetentionDuration && this.scheduleRequestedAt == i0Var.scheduleRequestedAt && this.expedited == i0Var.expedited && this.outOfQuotaPolicy == i0Var.outOfQuotaPolicy && this.periodCount == i0Var.periodCount && this.generation == i0Var.generation && this.nextScheduleTimeOverride == i0Var.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == i0Var.nextScheduleTimeOverrideGeneration && this.stopReason == i0Var.stopReason && fr.t.c(this.traceTag, i0Var.traceTag) && fr.t.c(this.backOffOnSystemInterruptions, i0Var.backOffOnSystemInterruptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getBackOffOnSystemInterruptions() {
        return this.backOffOnSystemInterruptions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31) + this.inputMergerClassName.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Long.hashCode(this.minimumRetentionDuration)) * 31) + Long.hashCode(this.scheduleRequestedAt)) * 31) + Boolean.hashCode(this.expedited)) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.nextScheduleTimeOverrideGeneration)) * 31) + Integer.hashCode(this.stopReason)) * 31;
        String str = this.traceTag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.backOffOnSystemInterruptions;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getStopReason() {
        return this.stopReason;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTraceTag() {
        return this.traceTag;
    }

    public final boolean m() {
        return !fr.t.c(ub.d.f197075k, this.constraints);
    }

    public final boolean n() {
        return this.state == ub.o0.c.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean o() {
        return this.intervalDuration != 0;
    }

    public final void p(long j15) {
        this.nextScheduleTimeOverride = j15;
    }

    public final void q(int i15) {
        this.nextScheduleTimeOverrideGeneration = i15;
    }

    public final void r(long intervalDuration) {
        if (intervalDuration < 900000) {
            ub.w.e().k(A, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        s(lr.m.f(intervalDuration, 900000L), lr.m.f(intervalDuration, 900000L));
    }

    public final void s(long intervalDuration, long flexDuration) {
        if (intervalDuration < 900000) {
            ub.w.e().k(A, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = lr.m.f(intervalDuration, 900000L);
        if (flexDuration < 300000) {
            ub.w.e().k(A, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (flexDuration > this.intervalDuration) {
            ub.w.e().k(A, "Flex duration greater than interval duration; Changed to " + intervalDuration);
        }
        this.flexDuration = lr.m.o(flexDuration, 300000L, this.intervalDuration);
    }

    public final void t(String str) {
        this.traceTag = str;
    }

    public String toString() {
        return "{WorkSpec: " + this.id + '}';
    }

    public /* synthetic */ i0(String str, ub.o0.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j15, long j16, long j17, ub.d dVar, int i15, ub.a aVar, long j18, long j19, long j25, long j26, boolean z15, ub.f0 f0Var, int i16, int i17, long j27, int i18, int i19, String str4, Boolean bool, int i25, fr.k kVar) {
        this(str, (i25 & 2) != 0 ? ub.o0.c.ENQUEUED : cVar, str2, (i25 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i25 & 16) != 0 ? androidx.work.b.f13823c : bVar, (i25 & 32) != 0 ? androidx.work.b.f13823c : bVar2, (i25 & 64) != 0 ? 0L : j15, (i25 & 128) != 0 ? 0L : j16, (i25 & 256) != 0 ? 0L : j17, (i25 & 512) != 0 ? ub.d.f197075k : dVar, (i25 & 1024) != 0 ? 0 : i15, (i25 & 2048) != 0 ? ub.a.EXPONENTIAL : aVar, (i25 & PKIFailureInfo.certConfirmed) != 0 ? 30000L : j18, (i25 & PKIFailureInfo.certRevoked) != 0 ? -1L : j19, (i25 & 16384) == 0 ? j25 : 0L, (32768 & i25) != 0 ? -1L : j26, (65536 & i25) != 0 ? false : z15, (131072 & i25) != 0 ? ub.f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST : f0Var, (262144 & i25) != 0 ? 0 : i16, (524288 & i25) != 0 ? 0 : i17, (1048576 & i25) != 0 ? Long.MAX_VALUE : j27, (2097152 & i25) != 0 ? 0 : i18, (4194304 & i25) != 0 ? -256 : i19, (8388608 & i25) != 0 ? null : str4, (i25 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public i0(String str, String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554426, null);
    }

    public i0(String str, i0 i0Var) {
        this(str, i0Var.state, i0Var.workerClassName, i0Var.inputMergerClassName, new androidx.work.b(i0Var.input), new androidx.work.b(i0Var.output), i0Var.initialDelay, i0Var.intervalDuration, i0Var.flexDuration, new ub.d(i0Var.constraints), i0Var.runAttemptCount, i0Var.backoffPolicy, i0Var.backoffDelayDuration, i0Var.lastEnqueueTime, i0Var.minimumRetentionDuration, i0Var.scheduleRequestedAt, i0Var.expedited, i0Var.outOfQuotaPolicy, i0Var.periodCount, 0, i0Var.nextScheduleTimeOverride, i0Var.nextScheduleTimeOverrideGeneration, i0Var.stopReason, i0Var.traceTag, i0Var.backOffOnSystemInterruptions, PKIFailureInfo.signerNotTrusted, null);
    }
}
