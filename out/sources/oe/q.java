package oe;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<re.d> f145002a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<re.d> f145003b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f145004c;

    public boolean a(re.d dVar) {
        boolean z15 = true;
        if (dVar == null) {
            return true;
        }
        boolean zRemove = this.f145002a.remove(dVar);
        if (!this.f145003b.remove(dVar) && !zRemove) {
            z15 = false;
        }
        if (z15) {
            dVar.clear();
        }
        return z15;
    }

    public void b() {
        Iterator it = ve.l.j(this.f145002a).iterator();
        while (it.hasNext()) {
            a((re.d) it.next());
        }
        this.f145003b.clear();
    }

    public void c() {
        this.f145004c = true;
        for (re.d dVar : ve.l.j(this.f145002a)) {
            if (dVar.isRunning() || dVar.a()) {
                dVar.clear();
                this.f145003b.add(dVar);
            }
        }
    }

    public void d() {
        this.f145004c = true;
        for (re.d dVar : ve.l.j(this.f145002a)) {
            if (dVar.isRunning()) {
                dVar.g();
                this.f145003b.add(dVar);
            }
        }
    }

    public void e() {
        for (re.d dVar : ve.l.j(this.f145002a)) {
            if (!dVar.a() && !dVar.f()) {
                dVar.clear();
                if (this.f145004c) {
                    this.f145003b.add(dVar);
                } else {
                    dVar.j();
                }
            }
        }
    }

    public void f() {
        this.f145004c = false;
        for (re.d dVar : ve.l.j(this.f145002a)) {
            if (!dVar.a() && !dVar.isRunning()) {
                dVar.j();
            }
        }
        this.f145003b.clear();
    }

    public void g(re.d dVar) {
        this.f145002a.add(dVar);
        if (!this.f145004c) {
            dVar.j();
        } else {
            dVar.clear();
            this.f145003b.add(dVar);
        }
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f145002a.size() + ", isPaused=" + this.f145004c + "}";
    }
}
