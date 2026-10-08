package qz;

import android.content.Context;
import android.os.Build;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.z1;
import io.sentry.b7;
import io.sentry.d5;
import io.sentry.f;
import io.sentry.q7;
import java.util.List;
import java.util.Map;
import jx.g;
import oq.k;
import oq.l;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ/\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u0010\u0006\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/¨\u00060"}, d2 = {"Lqz/d;", "Lpx/d;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Ljx/g;", "systemInfo", "Ljx/a;", "appInfo", "Lpx/b;", "localLogger", "<init>", "(Landroid/content/Context;Ler/a;Ljx/a;Lpx/b;)V", "Loq/i0;", "f", "()V", "", "host", "environment", "g7", "(Ljava/lang/String;Ljava/lang/String;)V", "message", "", "Lpx/a;", "tags", "n7", "(Ljava/lang/String;Ljava/util/List;)V", "u6", "", "throwable", "T6", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/List;)V", "Lpx/d$a;", "category", "F8", "(Ljava/lang/String;Lpx/d$a;)V", "key", "value", "p", "a", "Landroid/content/Context;", "b", "Ljx/a;", "c", "Lpx/b;", "d", "Loq/k;", "()Ljx/g;", "logging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements px.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jx.a appInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.b localLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k systemInfo;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f169601a;

        static {
            int[] iArr = new int[px.d.a.values().length];
            try {
                iArr[px.d.a.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[px.d.a.UI_INTERACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[px.d.a.NAVIGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[px.d.a.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[px.d.a.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f169601a = iArr;
        }
    }

    public d(Context context, final er.a<? extends g> aVar, jx.a aVar2, px.b bVar) {
        this.context = context;
        this.appInfo = aVar2;
        this.localLogger = bVar;
        this.systemInfo = l.a(new er.a() { // from class: qz.c
            @Override // er.a
            public final Object a() {
                return d.e(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, String str2, d dVar, q7 q7Var) {
        q7Var.setDsn(str);
        q7Var.setDebug(false);
        q7Var.setEnableUserInteractionTracing(true);
        if (str2 != null) {
            q7Var.setEnvironment(str2);
        }
        q7Var.setTag("GOOGLE_PLAY_SERVICES_VERSION", String.valueOf(dVar.d().f()));
        q7Var.setTag("SECURITY_PATCH", Build.VERSION.SECURITY_PATCH);
        q7Var.setTag("OPEN_GL_VERSION", String.valueOf(dVar.d().o()));
        q7Var.setTag("VULKAN_VERSION", String.valueOf(dVar.d().g()));
        q7Var.setTag("APP_LANGUAGE", dVar.appInfo.e().getIsoCode());
        q7Var.setTag("FONT_SIZE", dVar.d().q());
        q7Var.setTag("TALKBACK_ON", String.valueOf(dVar.d().s()));
        q7Var.setTag("TALKBACK_TOUCH_EXPLORATION_ON", String.valueOf(dVar.d().h()));
        q7Var.setTag("ANIMATIONS_ON", String.valueOf(dVar.d().r()));
        q7Var.setTag("LAUNCHER", dVar.d().b());
        q7Var.setTag("MOBILE_NETWORK_ON", String.valueOf(dVar.d().m()));
        q7Var.setTag("WIFI_ON", String.valueOf(dVar.d().i()));
        q7Var.setTag("GPS_ON", String.valueOf(dVar.d().p()));
        q7Var.setTag("NFC_ON", String.valueOf(dVar.d().l()));
        q7Var.setTag("SYSTEM_BIOMETRICS_STATUS", dVar.d().e());
        q7Var.setTag("THREAT_DETECTED", "null");
        q7Var.setTag("CPU_LOAD", "null");
        q7Var.setTag("X_SESSION_ID", dVar.appInfo.b());
        q7Var.setTag("STRONG_BOX", String.valueOf(dVar.d().u()));
        for (Map.Entry<String, String> entry : dVar.appInfo.d().entrySet()) {
            q7Var.setTag(entry.getKey(), entry.getValue());
        }
    }

    private final g d() {
        return (g) this.systemInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g e(er.a aVar) {
        return (g) aVar.a();
    }

    private final void f() {
        d5.I("FONT_SIZE", d().q());
        d5.I("TALKBACK_ON", String.valueOf(d().s()));
        d5.I("TALKBACK_TOUCH_EXPLORATION_ON", String.valueOf(d().h()));
        d5.I("ANIMATIONS_ON", String.valueOf(d().r()));
        d5.I("MOBILE_NETWORK_ON", String.valueOf(d().m()));
        d5.I("WIFI_ON", String.valueOf(d().i()));
        d5.I("GPS_ON", String.valueOf(d().p()));
        d5.I("NFC_ON", String.valueOf(d().l()));
        d5.I("SYSTEM_BIOMETRICS_STATUS", d().e());
        d5.I("CPU_LOAD", "null");
        for (Map.Entry<String, String> entry : this.appInfo.d().entrySet()) {
            d5.I(entry.getKey(), entry.getValue());
        }
    }

    @Override // px.d
    public void F8(String message, px.d.a category) {
        String str;
        this.localLogger.n7(message, v.e(new px.a.Custom("breadcrumb", category.toString())));
        f fVar = new f();
        fVar.D(message);
        int[] iArr = a.f169601a;
        int i15 = iArr[category.ordinal()];
        String str2 = "navigation";
        if (i15 == 1) {
            str = "log";
        } else if (i15 == 2) {
            str = "click";
        } else if (i15 == 3) {
            str = "navigation";
        } else if (i15 == 4) {
            str = "http";
        } else {
            if (i15 != 5) {
                throw new p();
            }
            str = "error";
        }
        fVar.z(str);
        int i16 = iArr[category.ordinal()];
        if (i16 == 1) {
            str2 = "default";
        } else if (i16 == 2) {
            str2 = "ui";
        } else if (i16 != 3) {
            if (i16 == 4) {
                str2 = "http";
            } else {
                if (i16 != 5) {
                    throw new p();
                }
                str2 = "error";
            }
        }
        fVar.F(str2);
        d5.e(fVar);
    }

    @Override // px.b
    public void T6(String message, Throwable throwable, List<? extends px.a> tags) {
        this.localLogger.T6(message, throwable, tags);
        f();
        for (px.a aVar : tags) {
            d5.I(aVar.getKey(), aVar.getValue());
        }
        if (throwable == null) {
            d5.k(message, b7.ERROR);
        } else {
            d5.i(new Exception(message, throwable));
        }
    }

    @Override // px.d
    public void g7(final String host, final String environment) {
        if (host.equals("null")) {
            this.localLogger.n7("Host is null", v.e(new px.a.Class(this)));
            return;
        }
        try {
            z1.g(this.context, new d5.a() { // from class: qz.b
                @Override // io.sentry.d5.a
                public final void a(q7 q7Var) {
                    d.c(host, environment, this, (SentryAndroidOptions) q7Var);
                }
            });
        } catch (Exception e15) {
            this.localLogger.T6("Sentry not initialized for host " + host, e15, v.e(new px.a.Class(this)));
        }
    }

    @Override // px.b
    public void n7(String message, List<? extends px.a> tags) {
        this.localLogger.n7(message, tags);
        f();
        for (px.a aVar : tags) {
            d5.I(aVar.getKey(), aVar.getValue());
        }
        d5.k(message, b7.DEBUG);
    }

    @Override // px.d
    public void p(String key, String value) {
        d5.I(key, value);
    }

    @Override // px.b
    public void u6(String message, List<? extends px.a> tags) {
        this.localLogger.u6(message, tags);
        f();
        for (px.a aVar : tags) {
            d5.I(aVar.getKey(), aVar.getValue());
        }
        d5.k(message, b7.INFO);
    }
}
