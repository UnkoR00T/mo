package io.sentry.transport;

import io.sentry.b7;
import io.sentry.g1;
import io.sentry.j0;
import io.sentry.p5;
import io.sentry.p6;
import io.sentry.q7;
import io.sentry.util.d0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f95731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f95732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<io.sentry.l, Date> f95733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b> f95734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f95735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.util.a f95736f;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a0.this.K();
        }
    }

    public interface b {
        void y(a0 a0Var);
    }

    public a0(p pVar, q7 q7Var) {
        this.f95733c = new ConcurrentHashMap();
        this.f95734d = new CopyOnWriteArrayList();
        this.f95735e = null;
        this.f95736f = new io.sentry.util.a();
        this.f95731a = pVar;
        this.f95732b = q7Var;
    }

    private io.sentry.l C(String str) {
        str.getClass();
        switch (str) {
            case "attachment":
                return io.sentry.l.Attachment;
            case "replay_video":
                return io.sentry.l.Replay;
            case "profile_chunk":
                return io.sentry.l.ProfileChunkUi;
            case "profile":
                return io.sentry.l.Profile;
            case "feedback":
                return io.sentry.l.Feedback;
            case "log":
                return io.sentry.l.LogItem;
            case "event":
                return io.sentry.l.Error;
            case "check_in":
                return io.sentry.l.Monitor;
            case "session":
                return io.sentry.l.Session;
            case "transaction":
                return io.sentry.l.Transaction;
            default:
                return io.sentry.l.Unknown;
        }
    }

    private boolean I(String str) {
        return E(C(str));
    }

    private void J(j0 j0Var, final boolean z15) {
        io.sentry.util.m.k(j0Var, io.sentry.hints.p.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.x
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                ((io.sentry.hints.p) obj).c(false);
            }
        });
        io.sentry.util.m.k(j0Var, io.sentry.hints.k.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.y
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                ((io.sentry.hints.k) obj).d(z15);
            }
        });
        io.sentry.util.m.k(j0Var, io.sentry.hints.f.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.z
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                a0.m(this.f95785a, (io.sentry.hints.f) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        Iterator<b> it = this.f95734d.iterator();
        while (it.hasNext()) {
            it.next().y(this);
        }
    }

    private long L(String str) {
        if (str == null) {
            return 60000L;
        }
        try {
            return (long) (Double.parseDouble(str) * 1000.0d);
        } catch (NumberFormatException unused) {
            return 60000L;
        }
    }

    public static /* synthetic */ void m(a0 a0Var, io.sentry.hints.f fVar) {
        a0Var.getClass();
        fVar.d();
        a0Var.f95732b.getLogger().c(b7.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
    }

    private void u(io.sentry.l lVar, Date date) {
        Date date2 = this.f95733c.get(lVar);
        if (date2 == null || date.after(date2)) {
            this.f95733c.put(lVar, date);
            K();
            g1 g1VarA = this.f95736f.a();
            try {
                if (this.f95735e == null) {
                    this.f95735e = new Timer(true);
                }
                this.f95735e.schedule(new a(), date);
                if (g1VarA != null) {
                    g1VarA.close();
                }
            } catch (Throwable th4) {
                if (g1VarA != null) {
                    try {
                        g1VarA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    public boolean E(io.sentry.l lVar) {
        Date date;
        Date date2 = new Date(this.f95731a.a());
        Date date3 = this.f95733c.get(io.sentry.l.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (io.sentry.l.Unknown.equals(lVar) || (date = this.f95733c.get(lVar)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public boolean H() {
        Date date = new Date(this.f95731a.a());
        Iterator<io.sentry.l> it = this.f95733c.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = this.f95733c.get(it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    public void M(b bVar) {
        this.f95734d.remove(bVar);
    }

    public void N(String str, String str2, int i15) {
        if (str == null) {
            if (i15 == 429) {
                u(io.sentry.l.All, new Date(this.f95731a.a() + L(str2)));
                return;
            }
            return;
        }
        for (String str3 : str.split(",", -1)) {
            String[] strArrSplit = str3.replace(" ", "").split(":", -1);
            if (strArrSplit.length > 0) {
                long jL = L(strArrSplit[0]);
                if (strArrSplit.length > 1) {
                    String str4 = strArrSplit[1];
                    Date date = new Date(this.f95731a.a() + jL);
                    if (str4 == null || str4.isEmpty()) {
                        u(io.sentry.l.All, date);
                    } else {
                        for (String str5 : str4.split(";", -1)) {
                            io.sentry.l lVarValueOf = io.sentry.l.Unknown;
                            try {
                                String strC = d0.c(str5);
                                if (strC != null) {
                                    lVarValueOf = io.sentry.l.valueOf(strC);
                                } else {
                                    this.f95732b.getLogger().c(b7.ERROR, "Couldn't capitalize: %s", str5);
                                }
                            } catch (IllegalArgumentException e15) {
                                this.f95732b.getLogger().a(b7.INFO, e15, "Unknown category: %s", str5);
                            }
                            if (!io.sentry.l.Unknown.equals(lVarValueOf)) {
                                u(lVarValueOf, date);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g1 g1VarA = this.f95736f.a();
        try {
            Timer timer = this.f95735e;
            if (timer != null) {
                timer.cancel();
                this.f95735e = null;
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
            this.f95734d.clear();
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public void r(b bVar) {
        this.f95734d.add(bVar);
    }

    public p5 y(p5 p5Var, j0 j0Var) {
        ArrayList arrayList = null;
        for (p6 p6Var : p5Var.c()) {
            if (I(p6Var.J().b().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(p6Var);
                this.f95732b.getClientReportRecorder().d(io.sentry.clientreport.f.RATELIMIT_BACKOFF, p6Var);
            }
        }
        if (arrayList == null) {
            return p5Var;
        }
        this.f95732b.getLogger().c(b7.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (p6 p6Var2 : p5Var.c()) {
            if (!arrayList.contains(p6Var2)) {
                arrayList2.add(p6Var2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new p5(p5Var.b(), arrayList2);
        }
        this.f95732b.getLogger().c(b7.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
        J(j0Var, false);
        return null;
    }

    public a0(q7 q7Var) {
        this(n.b(), q7Var);
    }
}
