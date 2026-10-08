package af;

import android.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(ye.e eVar);
    }

    public static a a() {
        return new d.b().d(ye.e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract ye.e d();

    public boolean e() {
        return c() != null;
    }

    public o f(ye.e eVar) {
        return a().b(b()).d(eVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
