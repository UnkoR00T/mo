package fg;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r0.l1;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f62263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static PendingIntent f62264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f62265j = new Executor() { // from class: fg.g0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f62266k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f62268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f62269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f62270d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Messenger f62272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l f62273g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1 f62267a = new l1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Messenger f62271e = new Messenger(new i(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f62268b = context;
        this.f62269c = new e0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f62270d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ vh.l e(Bundle bundle) {
        return m(bundle) ? vh.o.f(null) : vh.o.f(bundle);
    }

    static /* bridge */ /* synthetic */ void g(c cVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        cVar.f62273g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f62272f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f62266k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        cVar.l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    c2.g("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (cVar.f62267a) {
                        for (int i15 = 0; i15 < cVar.f62267a.getSize(); i15++) {
                            try {
                                cVar.l((String) cVar.f62267a.f(i15), intent2.getExtras());
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    c2.g("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                cVar.l(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        c2.g("Rpc", "Dropping invalid message");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    private final vh.l i(Bundle bundle) {
        final String strJ = j();
        final vh.m mVar = new vh.m();
        synchronized (this.f62267a) {
            this.f62267a.put(strJ, mVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f62269c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f62268b, intent);
        intent.putExtra("kid", "|ID|" + strJ + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f62271e);
        if (this.f62272f != null || this.f62273g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f62272f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f62273g.b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (this.f62269c.b() == 2) {
                    this.f62268b.sendBroadcast(intent);
                } else {
                    this.f62268b.startService(intent);
                }
            }
        } else if (this.f62269c.b() == 2) {
            this.f62268b.sendBroadcast(intent);
        } else {
            this.f62268b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f62270d.schedule(new Runnable() { // from class: fg.g
            @Override // java.lang.Runnable
            public final void run() {
                if (mVar.d(new IOException("TIMEOUT"))) {
                    c2.g("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        mVar.a().b(f62265j, new vh.f() { // from class: fg.h
            @Override // vh.f
            public final void a(vh.l lVar) {
                this.f62287a.h(strJ, scheduledFutureSchedule, lVar);
            }
        });
        return mVar.a();
    }

    private static synchronized String j() {
        int i15;
        i15 = f62263h;
        f62263h = i15 + 1;
        return Integer.toString(i15);
    }

    private static synchronized void k(Context context, Intent intent) {
        try {
            if (f62264i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f62264i = PendingIntent.getBroadcast(context, 0, intent2, wg.a.f212993a);
            }
            intent.putExtra("app", f62264i);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f62267a) {
            try {
                vh.m mVar = (vh.m) this.f62267a.remove(str);
                if (mVar != null) {
                    mVar.c(bundle);
                    return;
                }
                c2.g("Rpc", "Missing callback for " + str);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public vh.l<a> a() {
        return this.f62269c.a() >= 241100000 ? d0.b(this.f62268b).d(5, Bundle.EMPTY).h(f62265j, new vh.c() { // from class: fg.f
            @Override // vh.c
            public final Object a(vh.l lVar) {
                Intent intent = (Intent) ((Bundle) lVar.m()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
            }
        }) : vh.o.e(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public vh.l<Void> b(a aVar) {
        if (this.f62269c.a() < 233700000) {
            return vh.o.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", aVar.m());
        Integer numP = aVar.p();
        if (numP != null) {
            bundle.putInt("google.product_id", numP.intValue());
        }
        return d0.b(this.f62268b).c(3, bundle);
    }

    public vh.l<Bundle> c(final Bundle bundle) {
        if (this.f62269c.a() < 12000000) {
            return this.f62269c.b() != 0 ? i(bundle).j(f62265j, new vh.c() { // from class: fg.h0
                @Override // vh.c
                public final Object a(vh.l lVar) {
                    return this.f62290a.f(bundle, lVar);
                }
            }) : vh.o.e(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return d0.b(this.f62268b).d(1, bundle).h(f62265j, new vh.c() { // from class: fg.e
            @Override // vh.c
            public final Object a(vh.l lVar) throws IOException {
                if (lVar.q()) {
                    return (Bundle) lVar.m();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(lVar.l()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", lVar.l());
            }
        });
    }

    public vh.l<Void> d(boolean z15) {
        if (this.f62269c.a() < 241100000) {
            return vh.o.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z15);
        return d0.b(this.f62268b).c(4, bundle);
    }

    final /* synthetic */ vh.l f(Bundle bundle, vh.l lVar) {
        return (lVar.q() && m((Bundle) lVar.m())) ? i(bundle).r(f62265j, new vh.k() { // from class: fg.f0
            @Override // vh.k
            public final vh.l a(Object obj) {
                return c.e((Bundle) obj);
            }
        }) : lVar;
    }

    final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, vh.l lVar) {
        synchronized (this.f62267a) {
            this.f62267a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
