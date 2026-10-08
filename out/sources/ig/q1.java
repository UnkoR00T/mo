package ig;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f92263a = Collections.synchronizedMap(new r0.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f92264b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f92265c;

    q1() {
    }

    final h a(String str, Class cls) {
        return (h) cls.cast(this.f92263a.get(str));
    }

    final void b(String str, h hVar) {
        Map map = this.f92263a;
        if (map.containsKey(str)) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 59);
            sb5.append("LifecycleCallback with tag ");
            sb5.append(str);
            sb5.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb5.toString());
        }
        map.put(str, hVar);
        if (this.f92264b > 0) {
            new xg.p(Looper.getMainLooper()).post(new p1(this, hVar, str));
        }
    }

    final void c(Bundle bundle) {
        this.f92264b = 1;
        this.f92265c = bundle;
        for (Map.Entry entry : this.f92263a.entrySet()) {
            ((h) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void d() {
        this.f92264b = 2;
        Iterator it = this.f92263a.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).j();
        }
    }

    final void e() {
        this.f92264b = 3;
        Iterator it = this.f92263a.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).h();
        }
    }

    final void f(int i15, int i16, Intent intent) {
        Iterator it = this.f92263a.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).e(i15, i16, intent);
        }
    }

    final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f92263a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((h) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void h() {
        this.f92264b = 4;
        Iterator it = this.f92263a.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).k();
        }
    }

    final void i() {
        this.f92264b = 5;
        Iterator it = this.f92263a.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).g();
        }
    }

    final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f92263a.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    final /* synthetic */ int k() {
        return this.f92264b;
    }

    final /* synthetic */ Bundle l() {
        return this.f92265c;
    }
}
