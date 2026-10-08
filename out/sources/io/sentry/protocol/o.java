package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f95474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f95475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f95476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f95477e;

    public static final class a implements t1<o> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a(k3 k3Var, v0 v0Var) {
            o oVar = new o();
            k3Var.Y();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "sdk_name":
                        oVar.f95473a = k3Var.O2();
                        break;
                    case "version_patchlevel":
                        oVar.f95476d = k3Var.z2();
                        break;
                    case "version_major":
                        oVar.f95474b = k3Var.z2();
                        break;
                    case "version_minor":
                        oVar.f95475c = k3Var.z2();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        k3Var.U2(v0Var, map, strH1);
                        break;
                }
            }
            k3Var.h0();
            oVar.e(map);
            return oVar;
        }
    }

    public void e(Map<String, Object> map) {
        this.f95477e = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95473a != null) {
            l3Var.f("sdk_name").h(this.f95473a);
        }
        if (this.f95474b != null) {
            l3Var.f("version_major").k(this.f95474b);
        }
        if (this.f95475c != null) {
            l3Var.f("version_minor").k(this.f95475c);
        }
        if (this.f95476d != null) {
            l3Var.f("version_patchlevel").k(this.f95476d);
        }
        Map<String, Object> map = this.f95477e;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95477e.get(str));
            }
        }
        l3Var.h0();
    }
}
