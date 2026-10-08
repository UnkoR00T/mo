package mk;

import android.content.Context;
import android.preference.PreferenceManager;
import fk.l;
import fk.n;
import fk.o;
import fk.q;
import io.sentry.android.core.c2;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import tk.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f126937d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f126938e = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f126939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fk.a f126940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o f126941c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f126942a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f126943b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f126944c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f126945d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private fk.a f126946e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f126947f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private l f126948g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private o f126949h;

        private o g() throws GeneralSecurityException {
            if (this.f126948g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            o oVarA = o.i().a(this.f126948g);
            o oVarH = oVarA.h(oVarA.d().i().a0(0).a0());
            d dVar = new d(this.f126942a, this.f126943b, this.f126944c);
            if (this.f126946e != null) {
                oVarH.d().r(dVar, this.f126946e);
                return oVarH;
            }
            fk.c.b(oVarH.d(), dVar);
            return oVarH;
        }

        private static byte[] h(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return k.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        private o i(byte[] bArr) {
            return o.j(fk.c.a(fk.b.b(bArr)));
        }

        private o j(byte[] bArr) {
            try {
                this.f126946e = new c().b(this.f126945d);
                try {
                    return o.j(n.n(fk.b.b(bArr), this.f126946e));
                } catch (IOException | GeneralSecurityException e15) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e15;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e16) {
                try {
                    o oVarI = i(bArr);
                    c2.h(a.f126938e, "cannot use Android Keystore, it'll be disabled", e16);
                    return oVarI;
                } catch (IOException unused2) {
                    throw e16;
                }
            }
        }

        private fk.a k() throws KeyStoreException {
            if (!a.e()) {
                c2.g(a.f126938e, "Android Keystore requires at least Android M");
                return null;
            }
            c cVar = new c();
            try {
                boolean zD = c.d(this.f126945d);
                try {
                    return cVar.b(this.f126945d);
                } catch (GeneralSecurityException | ProviderException e15) {
                    if (!zD) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f126945d), e15);
                    }
                    c2.h(a.f126938e, "cannot use Android Keystore, it'll be disabled", e15);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e16) {
                c2.h(a.f126938e, "cannot use Android Keystore, it'll be disabled", e16);
                return null;
            }
        }

        public synchronized a f() {
            a aVar;
            try {
                if (this.f126943b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (a.f126937d) {
                    try {
                        byte[] bArrH = h(this.f126942a, this.f126943b, this.f126944c);
                        if (bArrH == null) {
                            if (this.f126945d != null) {
                                this.f126946e = k();
                            }
                            this.f126949h = g();
                        } else if (this.f126945d == null || !a.e()) {
                            this.f126949h = i(bArrH);
                        } else {
                            this.f126949h = j(bArrH);
                        }
                        aVar = new a(this);
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
            return aVar;
        }

        public b l(l lVar) {
            this.f126948g = lVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f126947f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f126945d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f126942a = context;
            this.f126943b = str;
            this.f126944c = str2;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e() {
        return true;
    }

    public synchronized n d() {
        return this.f126941c.d();
    }

    private a(b bVar) {
        this.f126939a = new d(bVar.f126942a, bVar.f126943b, bVar.f126944c);
        this.f126940b = bVar.f126946e;
        this.f126941c = bVar.f126949h;
    }
}
