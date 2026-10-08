package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import jg.s;
import vh.l;
import vh.m;
import vh.o;
import yk.w;

/* JADX INFO: loaded from: classes4.dex */
public class c implements ll.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f36406m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f36407n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vk.e f36408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ol.c f36409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nl.c f36410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f36411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w<nl.b> f36412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ll.g f36413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f36414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f36415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f36416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f36417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set<ml.a> f36418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<h> f36419l;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f36420a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f36420a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f36422b;

        static {
            int[] iArr = new int[ol.f.b.values().length];
            f36422b = iArr;
            try {
                iArr[ol.f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36422b[ol.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36422b[ol.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ol.d.b.values().length];
            f36421a = iArr2;
            try {
                iArr2[ol.d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36421a[ol.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(final vk.e eVar, kl.b<il.i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, eVar, new ol.c(eVar.j(), bVar), new nl.c(eVar), i.c(), new w(new kl.b() { // from class: ll.a
            @Override // kl.b
            public final Object get() {
                return com.google.firebase.installations.c.e(eVar);
            }
        }), new ll.g());
    }

    private synchronized void A(nl.d dVar, nl.d dVar2) {
        if (this.f36418k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<ml.a> it = this.f36418k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    public static /* synthetic */ nl.b e(vk.e eVar) {
        return new nl.b(eVar);
    }

    private l<g> f() {
        m mVar = new m();
        h(new e(this.f36411d, mVar));
        return mVar.a();
    }

    private l<String> g() {
        m mVar = new m();
        h(new f(mVar));
        return mVar.a();
    }

    private void h(h hVar) {
        synchronized (this.f36414g) {
            this.f36419l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z15) {
        nl.d dVarW;
        nl.d dVarQ = q();
        try {
            if (dVarQ.i() || dVarQ.l()) {
                dVarW = w(dVarQ);
            } else {
                if (!z15 && !this.f36411d.f(dVarQ)) {
                    return;
                }
                dVarW = k(dVarQ);
            }
            t(dVarW);
            A(dVarQ, dVarW);
            if (dVarW.k()) {
                z(dVarW.d());
            }
            if (dVarW.i()) {
                x(new d(d.a.BAD_CONFIG));
            } else if (dVarW.j()) {
                x(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                y(dVarW);
            }
        } catch (d e15) {
            x(e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(final boolean z15) {
        nl.d dVarR = r();
        if (z15) {
            dVarR = dVarR.p();
        }
        y(dVarR);
        this.f36416i.execute(new Runnable() { // from class: ll.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f118751a.i(z15);
            }
        });
    }

    private nl.d k(nl.d dVar) throws d {
        ol.f fVarE = this.f36409b.e(l(), dVar.d(), s(), dVar.f());
        int i15 = b.f36422b[fVarE.b().ordinal()];
        if (i15 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f36411d.b());
        }
        if (i15 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i15 != 3) {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        z(null);
        return dVar.r();
    }

    private synchronized String n() {
        return this.f36417j;
    }

    private nl.b o() {
        return this.f36412e.get();
    }

    public static c p(vk.e eVar) {
        s.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) eVar.i(ll.e.class);
    }

    private nl.d q() {
        nl.d dVarD;
        synchronized (f36406m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f36408a.j(), "generatefid.lock");
                try {
                    dVarD = this.f36410c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th4) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th4;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return dVarD;
    }

    private nl.d r() {
        nl.d dVarD;
        synchronized (f36406m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f36408a.j(), "generatefid.lock");
                try {
                    dVarD = this.f36410c.d();
                    if (dVarD.j()) {
                        dVarD = this.f36410c.b(dVarD.t(v(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th4) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th4;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return dVarD;
    }

    private void t(nl.d dVar) {
        synchronized (f36406m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f36408a.j(), "generatefid.lock");
                try {
                    this.f36410c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th4) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th4;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    private void u() {
        s.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.g(s(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.b(i.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.b(i.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String v(nl.d dVar) {
        if ((!this.f36408a.l().equals("CHIME_ANDROID_SDK") && !this.f36408a.t()) || !dVar.m()) {
            return this.f36413f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f36413f.a() : strF;
    }

    private nl.d w(nl.d dVar) throws d {
        ol.d dVarD = this.f36409b.d(l(), dVar.d(), s(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i15 = b.f36421a[dVarD.e().ordinal()];
        if (i15 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f36411d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i15 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    private void x(Exception exc) {
        synchronized (this.f36414g) {
            try {
                Iterator<h> it = this.f36419l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void y(nl.d dVar) {
        synchronized (this.f36414g) {
            try {
                Iterator<h> it = this.f36419l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private synchronized void z(String str) {
        this.f36417j = str;
    }

    @Override // ll.e
    public l<g> a(final boolean z15) {
        u();
        l<g> lVarF = f();
        this.f36415h.execute(new Runnable() { // from class: ll.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f118749a.j(z15);
            }
        });
        return lVarF;
    }

    @Override // ll.e
    public l<String> getId() {
        u();
        String strN = n();
        if (strN != null) {
            return o.f(strN);
        }
        l<String> lVarG = g();
        this.f36415h.execute(new Runnable() { // from class: ll.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f118748a.j(false);
            }
        });
        return lVarG;
    }

    String l() {
        return this.f36408a.m().b();
    }

    String m() {
        return this.f36408a.m().c();
    }

    String s() {
        return this.f36408a.m().e();
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(ExecutorService executorService, Executor executor, vk.e eVar, ol.c cVar, nl.c cVar2, i iVar, w<nl.b> wVar, ll.g gVar) {
        this.f36414g = new Object();
        this.f36418k = new HashSet();
        this.f36419l = new ArrayList();
        this.f36408a = eVar;
        this.f36409b = cVar;
        this.f36410c = cVar2;
        this.f36411d = iVar;
        this.f36412e = wVar;
        this.f36413f = gVar;
        this.f36415h = executorService;
        this.f36416i = executor;
    }
}
