# Paczka 116 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `fg/b.java`

## fg/b.java

```java
package fg;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.sentry.android.core.c2;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SoftReference f62261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SoftReference f62262b;

    private final int e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                c2.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            c(context, extras);
            return -1;
        }
        c2.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    protected Executor a() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (b.class) {
            try {
                SoftReference softReference = f62261a;
                executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    wg.e.a();
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new pg.b("firebase-iid-executor")));
                    f62261a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    protected abstract int b(Context context, a aVar);

    protected void c(Context context, Bundle bundle) {
    }

    final /* synthetic */ void d(Intent intent, final Context context, boolean z15, BroadcastReceiver.PendingResult pendingResult) {
        Executor executorUnconfigurableExecutorService;
        int iE;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iE = e(context, intent2);
            } else if (intent.getExtras() == null) {
                iE = 500;
            } else {
                final a aVar = new a(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (b.class) {
                    try {
                        SoftReference softReference = f62262b;
                        executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                        if (executorUnconfigurableExecutorService == null) {
                            wg.e.a();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new pg.b("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            f62262b = new SoftReference(executorUnconfigurableExecutorService);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                executorUnconfigurableExecutorService.execute(new Runnable() { // from class: fg.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        vh.l lVarC;
                        a aVar2 = aVar;
                        if (TextUtils.isEmpty(aVar2.m())) {
                            lVarC = vh.o.f(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("google.message_id", aVar2.m());
                            Integer numP = aVar2.p();
                            if (numP != null) {
                                bundle.putInt("google.product_id", numP.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            lVarC = d0.b(context2).c(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        lVarC.b(new Executor() { // from class: fg.m
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new vh.f() { // from class: fg.n
                            @Override // vh.f
                            public final void a(vh.l lVar) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int iB = b(context, aVar);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        c2.g("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e15) {
                    c2.g("CloudMessagingReceiver", "Message ack failed: ".concat(e15.toString()));
                }
                iE = iB;
            }
            if (z15 && pendingResult != null) {
                pendingResult.setResultCode(iE);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th5) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th5;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        a().execute(new Runnable() { // from class: fg.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f62299a.d(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }
}

```
