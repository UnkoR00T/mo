# Paczka 118 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `fg/c.java (część 2/2)`

## fg/c.java (część 2/2)

```java
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
```
