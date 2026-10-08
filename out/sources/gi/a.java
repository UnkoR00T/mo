package gi;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.b41;
import com.google.android.libraries.places.internal.l41;
import com.google.android.libraries.places.internal.n41;
import com.google.android.libraries.places.internal.p31;
import com.google.android.libraries.places.internal.y31;
import java.util.Locale;
import ji.n;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b41 f73224a = new b41();

    @Deprecated
    public static void a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            c(context, str, null, false);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    public static synchronized boolean b() {
        try {
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
        return f73224a.b();
    }

    public static synchronized void c(@RecentlyNonNull Context context, @RecentlyNonNull String str, Locale locale, boolean z15) {
        try {
            p.r(context, "Application context must not be null.");
            p.r(str, "API Key must not be null.");
            p.e(!str.isEmpty(), "API Key must not be empty.");
            n41.a(context.getApplicationContext());
            f73224a.a(str, locale, z15);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    public static synchronized n d(Context context, l41 l41Var) {
        y31 y31VarA;
        try {
            p.r(context, "Context must not be null.");
            p.r(l41Var, "ClientProfile must not be null.");
            p.x(b(), "Places must be initialized first.");
            y31VarA = p31.a();
            y31VarA.c(context);
            y31VarA.a(f73224a);
            y31VarA.b(l41Var);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
        return y31VarA.zza().a();
    }

    public static synchronized b41 e() {
        return f73224a;
    }
}
