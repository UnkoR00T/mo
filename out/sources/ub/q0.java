package ub;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0010\b&\u0018\u0000 \u00102\u00020\u0001:\u0002\u000b\u000eB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068G¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Lub/q0;", "", "Ljava/util/UUID;", "id", "Lcc/i0;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Lcc/i0;Ljava/util/Set;)V", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "b", "Lcc/i0;", "d", "()Lcc/i0;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "()Ljava/lang/String;", "stringId", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class q0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cc.i0 workSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<String> tags;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00028\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00028\u0001H ¢\u0006\u0004\b\u001e\u0010\u001dR\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010(\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00104\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0012058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lub/q0$a;", "B", "Lub/q0;", "W", "", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", "id", "j", "(Ljava/util/UUID;)Lub/q0$a;", "Lub/d;", CryptoServicesPermission.CONSTRAINTS, "i", "(Lub/d;)Lub/q0$a;", "", "tag", "a", "(Ljava/lang/String;)Lub/q0$a;", "", "duration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "k", "(JLjava/util/concurrent/TimeUnit;)Lub/q0$a;", "b", "()Lub/q0;", "c", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "Z", "d", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "backoffCriteriaSet", "Ljava/util/UUID;", "e", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Lcc/i0;", "Lcc/i0;", "h", "()Lcc/i0;", "setWorkSpec$work_runtime_release", "(Lcc/i0;)V", "workSpec", "", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "tags", "g", "()Lub/q0$a;", "thisObject", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a<B extends a<B, ?>, W extends q0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Class<? extends androidx.work.c> workerClass;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean backoffCriteriaSet;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private UUID id = UUID.randomUUID();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private cc.i0 workSpec;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Set<String> tags;

        public a(Class<? extends androidx.work.c> cls) {
            this.workerClass = cls;
            this.workSpec = new cc.i0(this.id.toString(), cls.getName());
            this.tags = e1.g(cls.getName());
        }

        public final B a(String tag) {
            this.tags.add(tag);
            return (B) g();
        }

        public final W b() {
            W w15 = (W) c();
            d dVar = this.workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String;
            boolean z15 = dVar.g() || dVar.getRequiresBatteryNotLow() || dVar.getRequiresCharging() || dVar.getRequiresDeviceIdle();
            cc.i0 i0Var = this.workSpec;
            if (i0Var.expedited) {
                if (z15) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (i0Var.initialDelay > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            String traceTag = i0Var.getTraceTag();
            if (traceTag == null) {
                cc.i0 i0Var2 = this.workSpec;
                i0Var2.t(q0.INSTANCE.b(i0Var2.workerClassName));
            } else if (traceTag.length() > 127) {
                this.workSpec.t(fu.r.H1(traceTag, CertificateBody.profileType));
            }
            j(UUID.randomUUID());
            return w15;
        }

        public abstract W c();

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getBackoffCriteriaSet() {
            return this.backoffCriteriaSet;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final Set<String> f() {
            return this.tags;
        }

        public abstract B g();

        /* JADX INFO: renamed from: h, reason: from getter */
        public final cc.i0 getWorkSpec() {
            return this.workSpec;
        }

        public final B i(d constraints) {
            this.workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String = constraints;
            return (B) g();
        }

        public final B j(UUID id5) {
            this.id = id5;
            this.workSpec = new cc.i0(id5.toString(), this.workSpec);
            return (B) g();
        }

        public B k(long duration, TimeUnit timeUnit) {
            this.workSpec.initialDelay = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return (B) g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    /* JADX INFO: renamed from: ub.q0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lub/q0$b;", "", "<init>", "()V", "", "workerClassName", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "MIN_BACKOFF_MILLIS", "", "MAX_TRACE_SPAN_LENGTH", "I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String workerClassName) {
            List listV0 = fu.r.V0(workerClassName, new String[]{"."}, false, 0, 6, null);
            String str = listV0.size() == 1 ? (String) listV0.get(0) : (String) pq.v.x0(listV0);
            return str.length() <= 127 ? str : fu.r.H1(str, CertificateBody.profileType);
        }

        private Companion() {
        }
    }

    public q0(UUID uuid, cc.i0 i0Var, Set<String> set) {
        this.id = uuid;
        this.workSpec = i0Var;
        this.tags = set;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public UUID getId() {
        return this.id;
    }

    public final String b() {
        return getId().toString();
    }

    public final Set<String> c() {
        return this.tags;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final cc.i0 getWorkSpec() {
        return this.workSpec;
    }
}
