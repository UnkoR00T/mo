package tk;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import tk.j;

/* JADX INFO: loaded from: classes4.dex */
public final class i<T_WRAPPER extends j<JcePrimitiveT>, JcePrimitiveT> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i<j.a, Cipher> f190574b = new i<>(new j.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i<j.e, Mac> f190575c = new i<>(new j.e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i<j.g, Signature> f190576d = new i<>(new j.g());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i<j.f, MessageDigest> f190577e = new i<>(new j.f());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i<j.b, KeyAgreement> f190578f = new i<>(new j.b());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i<j.d, KeyPairGenerator> f190579g = new i<>(new j.d());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i<j.c, KeyFactory> f190580h = new i<>(new j.c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e<JcePrimitiveT> f190581a;

    private static class b<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f190582a;

        @Override // tk.i.e
        public JcePrimitiveT a(String str) {
            Iterator<Provider> it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f190582a.a(str, it.next());
                } catch (Exception e15) {
                    if (exc == null) {
                        exc = e15;
                    }
                }
            }
            return this.f190582a.a(str, null);
        }

        private b(j<JcePrimitiveT> jVar) {
            this.f190582a = jVar;
        }
    }

    private static class c<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f190583a;

        @Override // tk.i.e
        public JcePrimitiveT a(String str) {
            return this.f190583a.a(str, null);
        }

        private c(j<JcePrimitiveT> jVar) {
            this.f190583a = jVar;
        }
    }

    private static class d<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f190584a;

        @Override // tk.i.e
        public JcePrimitiveT a(String str) throws GeneralSecurityException {
            Iterator<Provider> it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f190584a.a(str, it.next());
                } catch (Exception e15) {
                    if (exc == null) {
                        exc = e15;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        private d(j<JcePrimitiveT> jVar) {
            this.f190584a = jVar;
        }
    }

    private interface e<JcePrimitiveT> {
        JcePrimitiveT a(String str);
    }

    public i(T_WRAPPER t_wrapper) {
        if (kk.b.c()) {
            this.f190581a = new d(t_wrapper);
        } else if (q.b()) {
            this.f190581a = new b(t_wrapper);
        } else {
            this.f190581a = new c(t_wrapper);
        }
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public JcePrimitiveT a(String str) {
        return this.f190581a.a(str);
    }
}
