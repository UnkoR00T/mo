package uh;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.m;
import hh.h;
import hh.i;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f198175r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f198176s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f198177t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static volatile e f198178u = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f198179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f198180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f198181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future<?> f198182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f198183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<f> f198184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f198185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f198186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    hh.b f198187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.common.util.d f198188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WorkSource f198189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f198190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f198191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f198192n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map<String, d> f198193o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AtomicInteger f198194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f198195q;

    public a(Context context, int i15, String str) {
        String packageName = context.getPackageName();
        this.f198179a = new Object();
        this.f198181c = 0;
        this.f198184f = new HashSet();
        this.f198185g = true;
        this.f198188j = com.google.android.gms.common.util.f.c();
        this.f198193o = new HashMap();
        this.f198194p = new AtomicInteger(0);
        s.m(context, "WakeLock: context must not be null");
        s.g(str, "WakeLock: wakeLockName must not be empty");
        this.f198192n = context.getApplicationContext();
        this.f198191m = str;
        this.f198187i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f198190l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f198190l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb5 = new StringBuilder(29);
            sb5.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb5.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i15, str);
        this.f198180b = wakeLockNewWakeLock;
        if (m.c(context)) {
            WorkSource workSourceB = m.b(context, l.a(packageName) ? context.getPackageName() : packageName);
            this.f198189k = workSourceB;
            if (workSourceB != null) {
                i(wakeLockNewWakeLock, workSourceB);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f198176s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f198177t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f198176s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        h.a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f198176s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        this.f198195q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f198179a) {
            try {
                if (aVar.b()) {
                    c2.e("WakeLock", String.valueOf(aVar.f198190l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f198181c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private final String f(String str) {
        if (this.f198185g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f198184f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f198184f);
        this.f198184f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void h(int i15) {
        synchronized (this.f198179a) {
            try {
                if (b()) {
                    if (this.f198185g) {
                        int i16 = this.f198181c - 1;
                        this.f198181c = i16;
                        if (i16 > 0) {
                            return;
                        }
                    } else {
                        this.f198181c = 0;
                    }
                    g();
                    Iterator<d> it = this.f198193o.values().iterator();
                    while (it.hasNext()) {
                        it.next().f198197a = 0;
                    }
                    this.f198193o.clear();
                    Future<?> future = this.f198182d;
                    if (future != null) {
                        future.cancel(false);
                        this.f198182d = null;
                        this.f198183e = 0L;
                    }
                    this.f198186h = 0;
                    if (this.f198180b.isHeld()) {
                        try {
                            try {
                                this.f198180b.release();
                                if (this.f198187i != null) {
                                    this.f198187i = null;
                                }
                            } catch (RuntimeException e15) {
                                if (!e15.getClass().equals(RuntimeException.class)) {
                                    throw e15;
                                }
                                c2.f("WakeLock", String.valueOf(this.f198190l).concat(" failed to release!"), e15);
                                if (this.f198187i != null) {
                                    this.f198187i = null;
                                }
                            }
                        } catch (Throwable th4) {
                            if (this.f198187i != null) {
                                this.f198187i = null;
                            }
                            throw th4;
                        }
                    } else {
                        c2.e("WakeLock", String.valueOf(this.f198190l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e15) {
            c2.j("WakeLock", e15.toString());
        }
    }

    public void a(long j15) {
        this.f198194p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f198175r), 1L);
        if (j15 > 0) {
            jMax = Math.min(j15, jMax);
        }
        synchronized (this.f198179a) {
            try {
                if (!b()) {
                    this.f198187i = hh.b.b(false, null);
                    this.f198180b.acquire();
                    this.f198188j.b();
                }
                this.f198181c++;
                this.f198186h++;
                f(null);
                d dVar = this.f198193o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f198193o.put(null, dVar);
                }
                dVar.f198197a++;
                long jB = this.f198188j.b();
                long j16 = Long.MAX_VALUE - jB > jMax ? jB + jMax : Long.MAX_VALUE;
                if (j16 > this.f198183e) {
                    this.f198183e = j16;
                    Future<?> future = this.f198182d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f198182d = this.f198195q.schedule(new Runnable() { // from class: uh.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e(this.f198196a);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public boolean b() {
        boolean z15;
        synchronized (this.f198179a) {
            z15 = this.f198181c > 0;
        }
        return z15;
    }

    public void c() {
        if (this.f198194p.decrementAndGet() < 0) {
            c2.e("WakeLock", String.valueOf(this.f198190l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f198179a) {
            try {
                f(null);
                if (this.f198193o.containsKey(null)) {
                    d dVar = this.f198193o.get(null);
                    if (dVar != null) {
                        int i15 = dVar.f198197a - 1;
                        dVar.f198197a = i15;
                        if (i15 == 0) {
                            this.f198193o.remove(null);
                        }
                    }
                } else {
                    c2.g("WakeLock", String.valueOf(this.f198190l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void d(boolean z15) {
        synchronized (this.f198179a) {
            this.f198185g = z15;
        }
    }
}
