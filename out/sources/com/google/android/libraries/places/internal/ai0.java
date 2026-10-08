package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class ai0 extends s70 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Logger f31632p = Logger.getLogger(ai0.class.getName());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final long f31633q = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final long f31634r = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final si0 f31635s = gm0.a(ze0.f34508p);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final n50 f31636t = n50.a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final y40 f31637u = y40.a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final Pattern f31638v = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Method f31639w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final si0 f31640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final si0 f31641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f31642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final y80 f31643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List f31644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f31645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f31646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f31647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final n50 f31648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final y40 f31649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final long f31650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final d60 f31651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final List f31652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final xh0 f31653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final vh0 f31654o;

    static {
        Method declaredMethod = null;
        try {
            int i15 = z90.f34477a;
            Class cls = Boolean.TYPE;
            declaredMethod = z90.class.getDeclaredMethod("getClientInterceptor", cls, cls, cls, cls);
        } catch (ClassNotFoundException e15) {
            f31632p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e15);
        } catch (NoSuchMethodException e16) {
            f31632p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e16);
        }
        f31639w = declaredMethod;
    }

    public ai0(String str, h40 h40Var, c40 c40Var, xh0 xh0Var, vh0 vh0Var) {
        si0 si0Var = f31635s;
        this.f31640a = si0Var;
        this.f31641b = si0Var;
        this.f31642c = new ArrayList();
        this.f31643d = y80.c();
        this.f31644e = new ArrayList();
        this.f31647h = "pick_first";
        this.f31648i = f31636t;
        this.f31649j = f31637u;
        this.f31650k = f31633q;
        this.f31651l = d60.a();
        this.f31652m = new ArrayList();
        this.f31645f = (String) zj.p.r(str, "target");
        this.f31653n = (xh0) zj.p.r(xh0Var, "clientTransportFactoryBuilder");
        this.f31654o = vh0Var;
        h60.a(this);
    }

    static zh0 e(String str, y80 y80Var) {
        URI uri;
        StringBuilder sb5 = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e15) {
            sb5.append(e15.getMessage());
            uri = null;
        }
        u80 u80VarB = uri != null ? y80Var.b(uri.getScheme()) : null;
        String string = "";
        if (u80VarB == null && !f31638v.matcher(str).matches()) {
            try {
                String strA = y80Var.a();
                StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 1);
                sb6.append("/");
                sb6.append(str);
                uri = new URI(strA, "", sb6.toString(), null);
                u80VarB = y80Var.b(uri.getScheme());
            } catch (URISyntaxException e16) {
                throw new IllegalArgumentException(e16);
            }
        }
        if (u80VarB != null) {
            return new zh0(new um0(uri, null), u80VarB);
        }
        if (sb5.length() > 0) {
            String string2 = sb5.toString();
            StringBuilder sb7 = new StringBuilder(string2.length() + 3);
            sb7.append(" (");
            sb7.append(string2);
            sb7.append(")");
            string = sb7.toString();
        }
        throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, string));
    }

    static zh0 f(String str, y80 y80Var) {
        y90 y90VarK;
        StringBuilder sb5 = new StringBuilder();
        try {
            try {
                y90VarK = y90.a(str);
            } catch (IllegalArgumentException e15) {
                throw new URISyntaxException(str, e15.getMessage());
            }
        } catch (URISyntaxException e16) {
            sb5.append(e16.getMessage());
            y90VarK = null;
        }
        u80 u80VarB = y90VarK != null ? y80Var.b(y90VarK.b()) : null;
        String string = "";
        if (u80VarB == null && !f31638v.matcher(str).matches()) {
            x90 x90VarE = y90.e();
            x90VarE.a(y80Var.a());
            x90VarE.h("");
            x90VarE.c("/".concat(String.valueOf(str)));
            y90VarK = x90VarE.k();
            u80VarB = y80Var.b(y90VarK.b());
        }
        if (u80VarB != null) {
            return new zh0(new tm0(y90VarK, null), u80VarB);
        }
        if (sb5.length() > 0) {
            String string2 = sb5.toString();
            StringBuilder sb6 = new StringBuilder(string2.length() + 3);
            sb6.append(" (");
            sb6.append(string2);
            sb6.append(")");
            string = sb6.toString();
        }
        throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, string));
    }

    @Override // com.google.android.libraries.places.internal.s70
    public final r70 a() {
        m40 m40Var;
        lb0 lb0VarZza = this.f31653n.zza();
        zh0 zh0VarF = k60.a() ? f(this.f31645f, this.f31643d) : e(this.f31645f, this.f31643d);
        to0 to0Var = on0.f33195i;
        Set setSingleton = Collections.singleton(InetSocketAddress.class);
        if (setSingleton != null && !setSingleton.containsAll(zh0VarF.f34515b.f())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", zh0VarF.f34515b.c(), zh0VarF.f34514a));
        }
        vm0 vm0Var = zh0VarF.f34514a;
        u80 u80Var = zh0VarF.f34515b;
        ce0 ce0Var = new ce0();
        gm0 gm0VarA = gm0.a(ze0.f34508p);
        zj.w wVar = ze0.f34510r;
        vm0Var.toString();
        List list = this.f31642c;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            m40 m40Var2 = null;
            if (!it.hasNext()) {
                h60.b();
                Method method = f31639w;
                if (method != null) {
                    try {
                        Boolean bool = Boolean.TRUE;
                        m40Var = (m40) method.invoke(null, bool, bool, Boolean.FALSE, bool);
                    } catch (IllegalAccessException e15) {
                        f31632p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e15);
                        m40Var = null;
                    } catch (InvocationTargetException e16) {
                        f31632p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e16);
                        m40Var = null;
                    }
                } else {
                    m40Var = null;
                }
                if (m40Var != null) {
                    arrayList.add(0, m40Var);
                }
                try {
                    m40Var2 = (m40) aa0.class.getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                } catch (ClassNotFoundException e17) {
                    f31632p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e17);
                } catch (IllegalAccessException e18) {
                    f31632p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e18);
                } catch (NoSuchMethodException e19) {
                    f31632p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e19);
                } catch (InvocationTargetException e25) {
                    f31632p.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e25);
                }
                if (m40Var2 != null) {
                    arrayList.add(0, m40Var2);
                }
                return new ci0(new uh0(this, lb0VarZza, vm0Var, u80Var, ce0Var, gm0VarA, wVar, arrayList, nm0.f33069a));
            }
            m40 m40Var3 = (m40) it.next();
            if (m40Var3 instanceof yh0) {
                throw null;
            }
            arrayList.add(m40Var3);
        }
    }

    public final ai0 b(List list) {
        this.f31642c.addAll(list);
        return this;
    }

    public final ai0 c(String str) {
        this.f31646g = str;
        return this;
    }

    final int d() {
        this.f31654o.zza();
        return 443;
    }
}
