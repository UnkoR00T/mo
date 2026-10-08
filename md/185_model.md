# Paczka 185 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `rj/s.java`

## rj/s.java

```java
package rj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import sj.a0;
import sj.c0;

/* JADX INFO: loaded from: classes4.dex */
final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final sj.p f174600e = new sj.p("AppUpdateService");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Intent f174601f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a0 f174602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f174603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f174604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f174605d;

    s(Context context, u uVar) {
        this.f174603b = context.getPackageName();
        this.f174604c = context;
        this.f174605d = uVar;
        if (sj.c.a(context)) {
            this.f174602a = new a0(c0.a(context), f174600e, "AppUpdateService", f174601f, o.f174591a, null);
        }
    }

    static /* bridge */ /* synthetic */ Bundle b(s sVar, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        bundle.putAll(g());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(sVar.f174604c.getPackageManager().getPackageInfo(sVar.f174604c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f174600e.a("The current version of the app could not be retrieved", new Object[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    static /* bridge */ /* synthetic */ a d(s sVar, Bundle bundle, String str) {
        int i15 = bundle.getInt("version.code", -1);
        int i16 = bundle.getInt("update.availability");
        int i17 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        int i18 = bundle.getInt("in.app.update.priority", 0);
        long j15 = bundle.getLong("bytes.downloaded");
        long j16 = bundle.getLong("total.bytes.to.download");
        long j17 = bundle.getLong("additional.size.required");
        long jA = sVar.f174605d.a();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        map.put("blocking.destructive.intent", i(bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        map.put("nonblocking.destructive.intent", i(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        map.put("blocking.intent", i(bundle.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        map.put("nonblocking.intent", i(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return a.c(str, i15, i16, i17, numValueOf, i18, j15, j16, j17, jA, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private static Bundle g() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map mapA = sj.n.a("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
        if (mapA.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
        }
        if (mapA.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    private static vh.l h() {
        f174600e.a("onError(%d)", -9);
        return vh.o.e(new tj.a(-9));
    }

    private static HashSet i(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    public final vh.l c(String str) {
        if (this.f174602a == null) {
            return h();
        }
        f174600e.c("requestUpdateInfo(%s)", str);
        vh.m mVar = new vh.m();
        this.f174602a.s(new p(this, mVar, str, mVar), mVar);
        return mVar.a();
    }
}

```
