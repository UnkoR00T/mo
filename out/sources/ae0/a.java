package ae0;

import android.content.Context;
import p071kotlin.Metadata;
import t10.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lae0/a;", "", "<init>", "()V", "Lt10/k;", "sharedPreferencesFactory", "Landroid/content/Context;", "context", "Lbe0/b;", "e", "(Lt10/k;Landroid/content/Context;)Lbe0/b;", "themeChangerRepository", "Lyg0/c;", "d", "(Lbe0/b;)Lyg0/c;", "Lyg0/b;", "b", "(Lbe0/b;)Lyg0/b;", "Lbe0/a;", "forceConfigChangeRepository", "Lyg0/d;", "c", "(Lbe0/a;)Lyg0/d;", "Lyg0/a;", "a", "(Lbe0/a;)Lyg0/a;", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final yg0.a a(be0.a forceConfigChangeRepository) {
        return new ce0.a(forceConfigChangeRepository);
    }

    public final yg0.b b(be0.b themeChangerRepository) {
        return new ce0.b(themeChangerRepository);
    }

    public final yg0.d c(be0.a forceConfigChangeRepository) {
        return new ce0.d(forceConfigChangeRepository);
    }

    public final yg0.c d(be0.b themeChangerRepository) {
        return new ce0.c(themeChangerRepository);
    }

    public final be0.b e(k sharedPreferencesFactory, Context context) {
        return new zd0.a(sharedPreferencesFactory, context);
    }
}
