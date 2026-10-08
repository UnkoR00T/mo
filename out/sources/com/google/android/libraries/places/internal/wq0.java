package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wq0 extends i70 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Logger f34193k = Logger.getLogger(wq0.class.getName());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f34194l = new Random().nextInt();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z60 f34196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f34197h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b50 f34199j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f34195f = new ArrayList(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final k70 f34198i = new nj0();

    protected wq0(z60 z60Var) {
        this.f34196g = (z60) zj.p.r(z60Var, "helper");
        f34193k.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final l90 a(e70 e70Var) {
        l90 l90VarE;
        f34193k.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddresses", "Received resolution result: {0}", e70Var);
        try {
            this.f34197h = true;
            LinkedHashMap linkedHashMapL = ak.b1.l(e70Var.c().size());
            for (p50 p50Var : e70Var.c()) {
                d70 d70VarB = e70Var.b();
                d70VarB.a(Collections.singletonList(p50Var));
                z30 z30VarB = b40.b();
                z30VarB.a(i70.f32534e, Boolean.TRUE);
                d70VarB.b(z30VarB.c());
                d70VarB.c(null);
                linkedHashMapL.put(new vq0(p50Var), d70VarB.d());
            }
            if (linkedHashMapL.isEmpty()) {
                l90 l90Var = l90.f32815m;
                String string = e70Var.toString();
                StringBuilder sb5 = new StringBuilder(string.length() + 41);
                sb5.append("NameResolver returned no usable address. ");
                sb5.append(string);
                l90VarE = l90Var.e(sb5.toString());
                b(l90VarE);
            } else {
                LinkedHashMap linkedHashMapL2 = ak.b1.l(this.f34195f.size());
                for (uq0 uq0Var : this.f34195f) {
                    linkedHashMapL2.put(uq0Var.c(), uq0Var);
                }
                l90 l90Var2 = l90.f32807e;
                ArrayList arrayList = new ArrayList(linkedHashMapL.size());
                for (Map.Entry entry : linkedHashMapL.entrySet()) {
                    uq0 uq0VarF = (uq0) linkedHashMapL2.remove(entry.getKey());
                    if (uq0VarF == null) {
                        uq0VarF = f(entry.getKey());
                    }
                    arrayList.add(uq0VarF);
                }
                int iB = arrayList.isEmpty() ? 0 : ek.k.b(f34194l, arrayList.size());
                for (uq0 uq0Var2 : ak.x0.c(ak.x0.l(arrayList, iB), ak.x0.i(arrayList, iB))) {
                    e70 e70Var2 = (e70) linkedHashMapL.get(uq0Var2.c());
                    if (e70Var2 != null) {
                        l90 l90VarA = uq0Var2.g().a(e70Var2);
                        if (!l90VarA.j()) {
                            l90Var2 = l90VarA;
                        }
                    }
                }
                this.f34195f = arrayList;
                e();
                Iterator it = linkedHashMapL2.values().iterator();
                while (it.hasNext()) {
                    ((uq0) it.next()).b();
                }
                l90VarE = l90Var2;
            }
            this.f34197h = false;
            return l90VarE;
        } catch (Throwable th4) {
            this.f34197h = false;
            throw th4;
        }
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void b(l90 l90Var) {
        if (this.f34199j != b50.READY) {
            this.f34196g.b(b50.TRANSIENT_FAILURE, new y60(b70.b(l90Var)));
        }
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void c() {
        f34193k.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.f34195f.iterator();
        while (it.hasNext()) {
            ((uq0) it.next()).b();
        }
        this.f34195f.clear();
    }

    protected abstract void e();

    protected uq0 f(Object obj) {
        throw null;
    }

    protected final z60 g() {
        return this.f34196g;
    }

    public final Collection h() {
        return this.f34195f;
    }

    protected final List i() {
        ArrayList arrayList = new ArrayList();
        for (uq0 uq0Var : this.f34195f) {
            if (uq0Var.f() == b50.READY) {
                arrayList.add(uq0Var);
            }
        }
        return arrayList;
    }

    final /* synthetic */ z60 k() {
        return this.f34196g;
    }
}
