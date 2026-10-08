package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.q7;
import io.sentry.t1;
import io.sentry.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f95355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DebugImage> f95356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f95357c;

    public static final class a implements t1<d> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(k3 k3Var, v0 v0Var) {
            d dVar = new d();
            k3Var.Y();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("images")) {
                    dVar.f95356b = k3Var.T3(v0Var, new DebugImage.a());
                } else if (strH1.equals("sdk_info")) {
                    dVar.f95355a = (o) k3Var.M1(v0Var, new o.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            k3Var.h0();
            dVar.f(map);
            return dVar;
        }
    }

    public static d c(d dVar, q7 q7Var) {
        ArrayList arrayList = new ArrayList();
        if (q7Var.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(q7Var.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : q7Var.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (dVar == null) {
            dVar = new d();
        }
        if (dVar.d() == null) {
            dVar.e(arrayList);
            return dVar;
        }
        dVar.d().addAll(arrayList);
        return dVar;
    }

    public List<DebugImage> d() {
        return this.f95356b;
    }

    public void e(List<DebugImage> list) {
        this.f95356b = list != null ? new ArrayList(list) : null;
    }

    public void f(Map<String, Object> map) {
        this.f95357c = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95355a != null) {
            l3Var.f("sdk_info").l(v0Var, this.f95355a);
        }
        if (this.f95356b != null) {
            l3Var.f("images").l(v0Var, this.f95356b);
        }
        Map<String, Object> map = this.f95357c;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95357c.get(str));
            }
        }
        l3Var.h0();
    }
}
