package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import cc.WorkGenerationalId;
import cc.i0;
import cc.r1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import ju.d2;
import ub.k;
import ub.w;
import vb.e;
import vb.e1;
import yb.i;
import yb.l;
import yb.m;

/* JADX INFO: loaded from: classes3.dex */
public class a implements i, e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f13856l = w.i("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e1 f13858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ec.b f13859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f13860d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    WorkGenerationalId f13861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map<WorkGenerationalId, k> f13862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<WorkGenerationalId, i0> f13863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<WorkGenerationalId, d2> f13864h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final l f13865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f13866k;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC0297a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13867a;

        RunnableC0297a(String str) {
            this.f13867a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            i0 i0VarG = a.this.f13858b.r().g(this.f13867a);
            if (i0VarG == null || !i0VarG.m()) {
                return;
            }
            synchronized (a.this.f13860d) {
                a.this.f13863g.put(r1.a(i0VarG), i0VarG);
                a aVar = a.this;
                a.this.f13864h.put(r1.a(i0VarG), m.e(aVar.f13865j, i0VarG, aVar.f13859c.b(), a.this));
            }
        }
    }

    interface b {
        void b(int i15, Notification notification);

        void c(int i15);

        void d(int i15, int i16, Notification notification);

        void e(int i15);
    }

    a(Context context) {
        this.f13857a = context;
        e1 e1VarP = e1.p(context);
        this.f13858b = e1VarP;
        this.f13859c = e1VarP.v();
        this.f13861e = null;
        this.f13862f = new LinkedHashMap();
        this.f13864h = new HashMap();
        this.f13863g = new HashMap();
        this.f13865j = new l(this.f13858b.t());
        this.f13858b.r().e(this);
    }

    public static Intent e(Context context, WorkGenerationalId workGenerationalId, k kVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", kVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", kVar.a());
        intent.putExtra("KEY_NOTIFICATION", kVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    public static Intent f(Context context, WorkGenerationalId workGenerationalId, k kVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        intent.putExtra("KEY_NOTIFICATION_ID", kVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", kVar.a());
        intent.putExtra("KEY_NOTIFICATION", kVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        w.e().f(f13856l, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f13858b.a(UUID.fromString(stringExtra));
    }

    private void i(Intent intent) {
        if (this.f13866k == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        w.e().a(f13856l, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        k kVar = new k(intExtra, notification, intExtra2);
        this.f13862f.put(workGenerationalId, kVar);
        k kVar2 = this.f13862f.get(this.f13861e);
        if (kVar2 == null) {
            this.f13861e = workGenerationalId;
        } else {
            this.f13866k.b(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<WorkGenerationalId, k>> it = this.f13862f.entrySet().iterator();
                while (it.hasNext()) {
                    iA |= it.next().getValue().a();
                }
                kVar = new k(kVar2.c(), kVar2.b(), iA);
            } else {
                kVar = kVar2;
            }
        }
        this.f13866k.d(kVar.c(), kVar.a(), kVar.b());
    }

    private void j(Intent intent) {
        w.e().f(f13856l, "Started foreground service " + intent);
        this.f13859c.d(new RunnableC0297a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // yb.i
    public void a(i0 i0Var, yb.b bVar) {
        if (bVar instanceof yb.b.ConstraintsNotMet) {
            String str = i0Var.id;
            w.e().a(f13856l, "Constraints unmet for WorkSpec " + str);
            this.f13858b.z(r1.a(i0Var), ((yb.b.ConstraintsNotMet) bVar).getReason());
        }
    }

    @Override // vb.e
    public void d(WorkGenerationalId workGenerationalId, boolean z15) {
        Map.Entry<WorkGenerationalId, k> entry;
        synchronized (this.f13860d) {
            try {
                d2 d2VarRemove = this.f13863g.remove(workGenerationalId) != null ? this.f13864h.remove(workGenerationalId) : null;
                if (d2VarRemove != null) {
                    d2VarRemove.u(null);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        k kVarRemove = this.f13862f.remove(workGenerationalId);
        if (workGenerationalId.equals(this.f13861e)) {
            if (this.f13862f.size() > 0) {
                Iterator<Map.Entry<WorkGenerationalId, k>> it = this.f13862f.entrySet().iterator();
                Map.Entry<WorkGenerationalId, k> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f13861e = entry.getKey();
                if (this.f13866k != null) {
                    k value = entry.getValue();
                    this.f13866k.d(value.c(), value.a(), value.b());
                    this.f13866k.e(value.c());
                }
            } else {
                this.f13861e = null;
            }
        }
        b bVar = this.f13866k;
        if (kVarRemove == null || bVar == null) {
            return;
        }
        w.e().a(f13856l, "Removing Notification (id: " + kVarRemove.c() + ", workSpecId: " + workGenerationalId + ", notificationType: " + kVarRemove.a());
        bVar.e(kVarRemove.c());
    }

    void k(Intent intent, int i15) {
        w.e().f(f13856l, "Stopping foreground service");
        b bVar = this.f13866k;
        if (bVar != null) {
            bVar.c(i15);
        }
    }

    void l() {
        this.f13866k = null;
        synchronized (this.f13860d) {
            try {
                Iterator<d2> it = this.f13864h.values().iterator();
                while (it.hasNext()) {
                    it.next().u(null);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f13858b.r().m(this);
    }

    void m(Intent intent, int i15) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent, i15);
        }
    }

    void n(int i15, int i16) {
        w.e().f(f13856l, "Foreground service timed out, FGS type: " + i16);
        for (Map.Entry<WorkGenerationalId, k> entry : this.f13862f.entrySet()) {
            if (entry.getValue().a() == i16) {
                this.f13858b.z(entry.getKey(), -128);
            }
        }
        b bVar = this.f13866k;
        if (bVar != null) {
            bVar.c(i15);
        }
    }

    void o(b bVar) {
        if (this.f13866k != null) {
            w.e().c(f13856l, "A callback already exists.");
        } else {
            this.f13866k = bVar;
        }
    }
}
