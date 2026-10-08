package com.google.android.gms.internal.clearcut;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.UserManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f29300h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f29301i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f29302j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile Boolean f29303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile Boolean f29304l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f29305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f29306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T f29308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private T f29309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile c f29310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile SharedPreferences f29311g;

    private f(p pVar, String str, T t15) {
        this.f29309e = null;
        this.f29310f = null;
        this.f29311g = null;
        if (pVar.f29490a == null && pVar.f29491b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (pVar.f29490a != null && pVar.f29491b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f29305a = pVar;
        String strValueOf = String.valueOf(pVar.f29492c);
        String strValueOf2 = String.valueOf(str);
        this.f29307c = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        String strValueOf3 = String.valueOf(pVar.f29493d);
        String strValueOf4 = String.valueOf(str);
        this.f29306b = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
        this.f29308d = t15;
    }

    public static void b(Context context) {
        Context applicationContext;
        if (f29301i == null) {
            synchronized (f29300h) {
                try {
                    if (!context.isDeviceProtectedStorage() && (applicationContext = context.getApplicationContext()) != null) {
                        context = applicationContext;
                    }
                    if (f29301i != context) {
                        f29303k = null;
                    }
                    f29301i = context;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            f29302j = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> f<T> c(p pVar, String str, T t15, o<T> oVar) {
        return new m(pVar, str, t15, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f<String> d(p pVar, String str, String str2) {
        return new l(pVar, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f<Boolean> e(p pVar, String str, boolean z15) {
        return new k(pVar, str, Boolean.valueOf(z15));
    }

    private static <V> V g(n<V> nVar) {
        try {
            return nVar.b();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return nVar.b();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    static boolean h(final String str, boolean z15) {
        final boolean z16 = false;
        if (p()) {
            return ((Boolean) g(new n(str, z16) { // from class: com.google.android.gms.internal.clearcut.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f29358a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final boolean f29359b = false;

                {
                    this.f29358a = str;
                }

                @Override // com.google.android.gms.internal.clearcut.n
                public final Object b() {
                    return Boolean.valueOf(z5.h(f.f29301i.getContentResolver(), this.f29358a, this.f29359b));
                }
            })).booleanValue();
        }
        return false;
    }

    @TargetApi(24)
    private final T n() {
        boolean zBooleanValue;
        if (h("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String strValueOf = String.valueOf(this.f29306b);
            io.sentry.android.core.c2.g("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new String("Bypass reading Phenotype values for flag: "));
        } else if (this.f29305a.f29491b != null) {
            if (this.f29310f == null) {
                this.f29310f = c.a(f29301i.getContentResolver(), this.f29305a.f29491b);
            }
            final c cVar = this.f29310f;
            String str = (String) g(new n(this, cVar) { // from class: com.google.android.gms.internal.clearcut.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final f f29343a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final c f29344b;

                {
                    this.f29343a = this;
                    this.f29344b = cVar;
                }

                @Override // com.google.android.gms.internal.clearcut.n
                public final Object b() {
                    return this.f29344b.c().get(this.f29343a.f29306b);
                }
            });
            if (str != null) {
                return m(str);
            }
        } else if (this.f29305a.f29490a != null) {
            if (f29301i.isDeviceProtectedStorage()) {
                zBooleanValue = true;
            } else {
                if (f29304l == null || !f29304l.booleanValue()) {
                    f29304l = Boolean.valueOf(((UserManager) f29301i.getSystemService(UserManager.class)).isUserUnlocked());
                }
                zBooleanValue = f29304l.booleanValue();
            }
            if (!zBooleanValue) {
                return null;
            }
            if (this.f29311g == null) {
                this.f29311g = f29301i.getSharedPreferences(this.f29305a.f29490a, 0);
            }
            SharedPreferences sharedPreferences = this.f29311g;
            if (sharedPreferences.contains(this.f29306b)) {
                return f(sharedPreferences);
            }
        }
        return null;
    }

    private final T o() {
        String str;
        if (this.f29305a.f29494e || !p() || (str = (String) g(new n(this) { // from class: com.google.android.gms.internal.clearcut.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f f29348a;

            {
                this.f29348a = this;
            }

            @Override // com.google.android.gms.internal.clearcut.n
            public final Object b() {
                return this.f29348a.q();
            }
        })) == null) {
            return null;
        }
        return m(str);
    }

    private static boolean p() {
        if (f29303k == null) {
            Context context = f29301i;
            if (context == null) {
                return false;
            }
            f29303k = Boolean.valueOf(u5.d.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f29303k.booleanValue();
    }

    public final T a() {
        if (f29301i == null) {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        if (this.f29305a.f29495f) {
            T tO = o();
            if (tO != null) {
                return tO;
            }
            T tN = n();
            if (tN != null) {
                return tN;
            }
        } else {
            T tN2 = n();
            if (tN2 != null) {
                return tN2;
            }
            T tO2 = o();
            if (tO2 != null) {
                return tO2;
            }
        }
        return this.f29308d;
    }

    protected abstract T f(SharedPreferences sharedPreferences);

    protected abstract T m(String str);

    final /* synthetic */ String q() {
        return z5.c(f29301i.getContentResolver(), this.f29307c, null);
    }

    /* synthetic */ f(p pVar, String str, Object obj, j jVar) {
        this(pVar, str, obj);
    }
}
