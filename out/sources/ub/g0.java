package ub;

import java.util.concurrent.TimeUnit;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lub/g0;", "Lub/q0;", "Lub/g0$a;", "builder", "<init>", "(Lub/g0$a;)V", "e", "a", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 extends q0 {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lub/g0$a;", "Lub/q0$a;", "Lub/g0;", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "<init>", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V", "l", "()Lub/g0;", "m", "()Lub/g0$a;", "thisObject", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends q0.a<a, g0> {
        public a(Class<? extends androidx.work.c> cls, long j15, TimeUnit timeUnit) {
            super(cls);
            getWorkSpec().r(timeUnit.toMillis(j15));
        }

        @Override // ub.q0.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public g0 c() {
            if (getBackoffCriteriaSet() && getWorkSpec().org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.getRequiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (getWorkSpec().expedited) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new g0(this);
        }

        @Override // ub.q0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }

    public g0(a aVar) {
        super(aVar.getId(), aVar.getWorkSpec(), aVar.f());
    }
}
