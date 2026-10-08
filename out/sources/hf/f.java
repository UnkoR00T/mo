package hf;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private lf.a f84082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<ye.e, b> f84083b = new HashMap();

        public a a(ye.e eVar, b bVar) {
            this.f84083b.put(eVar, bVar);
            return this;
        }

        public f b() {
            if (this.f84082a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f84083b.keySet().size() < ye.e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<ye.e, b> map = this.f84083b;
            this.f84083b = new HashMap();
            return f.d(this.f84082a, map);
        }

        public a c(lf.a aVar) {
            this.f84082a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j15);

            public abstract a c(Set<c> set);

            public abstract a d(long j15);
        }

        public static a a() {
            return new hf.c.b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i15, long j15) {
        int i16 = i15 - 1;
        return (long) (Math.pow(3.0d, i16) * j15 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j15 > 1 ? j15 : 2L) * ((long) i16))));
    }

    public static a b() {
        return new a();
    }

    static f d(lf.a aVar, Map<ye.e, b> map) {
        return new hf.b(aVar, map);
    }

    public static f f(lf.a aVar) {
        return b().a(ye.e.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(ye.e.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(ye.e.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, ye.e eVar, long j15, int i15) {
        builder.setMinimumLatency(g(eVar, j15, i15));
        j(builder, h().get(eVar).c());
        return builder;
    }

    abstract lf.a e();

    public long g(ye.e eVar, long j15, int i15) {
        long jA = j15 - e().a();
        b bVar = h().get(eVar);
        return Math.min(Math.max(a(i15, bVar.b()), jA), bVar.d());
    }

    abstract Map<ye.e, b> h();
}
