package pc4;

import android.content.Context;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpc4/b3;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lp10/b;", "databaseKeyProvider", "Lo10/c;", "c", "(Landroid/content/Context;Lp10/b;)Lo10/c;", "databaseFactory", "Lq10/a;", "databaseRegistry", "Lp10/f;", "d", "(Landroid/content/Context;Lo10/c;Lq10/a;)Lp10/f;", "b", "(Landroid/content/Context;)Lq10/a;", "Lwy/a;", "masterKeyProvider", "a", "(Lwy/a;)Lp10/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b3 f154393a = new b3();

    private b3() {
    }

    public final p10.b a(wy.a masterKeyProvider) {
        return new p10.d(masterKeyProvider);
    }

    public final q10.a b(Context applicationContext) {
        return new q10.c(applicationContext, "mob_database_registry");
    }

    public final o10.c c(Context applicationContext, p10.b databaseKeyProvider) {
        return new o10.c(applicationContext, databaseKeyProvider);
    }

    public final p10.f d(Context applicationContext, o10.c databaseFactory, q10.a databaseRegistry) {
        return new p10.f(applicationContext, databaseFactory, databaseRegistry);
    }
}
