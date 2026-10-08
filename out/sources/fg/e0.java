package fg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import io.sentry.android.core.c2;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62282c = 0;

    public e0(Context context) {
        this.f62280a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoE;
        if (this.f62281b == 0) {
            try {
                packageInfoE = qg.d.a(this.f62280a).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e15) {
                c2.g("Metadata", "Failed to find package ".concat(e15.toString()));
                packageInfoE = null;
            }
            if (packageInfoE != null) {
                this.f62281b = packageInfoE.versionCode;
            }
        }
        return this.f62281b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x001d, B:14:0x0028, B:16:0x002f, B:18:0x0041, B:26:0x0062, B:21:0x0048, B:23:0x005b, B:29:0x0066, B:33:0x0075), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    public final synchronized int b() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        int i15 = this.f62282c;
        if (i15 != 0) {
            return i15;
        }
        Context context = this.f62280a;
        PackageManager packageManager = context.getPackageManager();
        if (qg.d.a(context).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            c2.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i16 = 1;
        if (com.google.android.gms.common.util.j.d()) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null) {
            }
            c2.g("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true != com.google.android.gms.common.util.j.d()) {
                i16 = 2;
            }
            this.f62282c = i16;
            return i16;
        }
        Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent3.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
            if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                c2.g("Metadata", "Failed to resolve IID implementation package, falling back");
                if (true != com.google.android.gms.common.util.j.d()) {
                    i16 = 2;
                }
                this.f62282c = i16;
                return i16;
            }
            i16 = 2;
        }
        this.f62282c = i16;
        return i16;
    }
}
