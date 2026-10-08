package hg;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import hg.a.d;
import java.util.Set;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a<O extends d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1948a f84295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f84296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f84297c;

    /* JADX INFO: renamed from: hg.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1948a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, jg.e eVar, O o15, hg.f.a aVar, hg.f.b bVar) {
            return (T) b(context, looper, eVar, o15, aVar, bVar);
        }

        public T b(Context context, Looper looper, jg.e eVar, O o15, ig.d dVar, ig.m mVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f84298a = new c(null);

        /* JADX INFO: renamed from: hg.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC1949a extends d {
            Account b();
        }

        public interface b extends d {
            GoogleSignInAccount a();
        }

        public static final class c implements d {
            private c() {
                throw null;
            }

            /* synthetic */ c(byte[] bArr) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void a(jg.c.e eVar);

        void b(String str);

        boolean c();

        String d();

        void disconnect();

        void e(jg.c.InterfaceC2422c interfaceC2422c);

        boolean g();

        boolean i();

        boolean isConnected();

        void j(jg.l lVar, Set<Scope> set);

        Set<Scope> k();

        int l();

        gg.c[] m();

        String n();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, AbstractC1948a<C, O> abstractC1948a, g<C> gVar) {
        s.m(abstractC1948a, "Cannot construct an Api with a null ClientBuilder");
        s.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f84297c = str;
        this.f84295a = abstractC1948a;
        this.f84296b = gVar;
    }

    public final AbstractC1948a a() {
        return this.f84295a;
    }

    public final c b() {
        return this.f84296b;
    }

    public final String c() {
        return this.f84297c;
    }
}
