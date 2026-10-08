package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class rl0 extends s80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k70 f33519b;

    public rl0(boolean z15, int i15, int i16, k70 k70Var) {
        this.f33518a = z15;
        this.f33519b = (k70) zj.p.r(k70Var, "parser");
    }

    @Override // com.google.android.libraries.places.internal.s80
    public final m80 a(Map map) {
        Object objC;
        kl0 kl0Var;
        fi0 fi0Var;
        Map mapD;
        try {
            m80 m80VarE = this.f33519b.e(map);
            di0 di0Var = null;
            if (m80VarE == null) {
                objC = null;
            } else {
                if (m80VarE.d() != null) {
                    return m80.b(m80VarE.d());
                }
                objC = m80VarE.c();
            }
            boolean z15 = this.f33518a;
            if (!z15 || map == null || (mapD = fg0.d(map, "retryThrottling")) == null) {
                kl0Var = null;
            } else {
                float fFloatValue = fg0.e(mapD, "maxTokens").floatValue();
                float fFloatValue2 = fg0.e(mapD, "tokenRatio").floatValue();
                zj.p.x(fFloatValue > 0.0f, "maxToken should be greater than zero");
                zj.p.x(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
                kl0Var = new kl0(fFloatValue, fFloatValue2);
            }
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Map mapD2 = map == null ? null : fg0.d(map, "healthCheckConfig");
            List<Map> listB = fg0.b(map, "methodConfig");
            if (listB == null) {
                fi0Var = new fi0(null, map2, map3, kl0Var, objC, mapD2);
            } else {
                for (Map map4 : listB) {
                    di0 di0Var2 = new di0(map4, z15, 5, 5);
                    List<Map> listB2 = fg0.b(map4, "name");
                    if (listB2 != null && !listB2.isEmpty()) {
                        for (Map map5 : listB2) {
                            String strG = fg0.g(map5, "service");
                            String strG2 = fg0.g(map5, "method");
                            if (zj.v.b(strG)) {
                                zj.p.l(zj.v.b(strG2), "missing service name for method %s", strG2);
                                zj.p.l(di0Var == null, "Duplicate default method config in service config %s", map);
                                di0Var = di0Var2;
                            } else if (zj.v.b(strG2)) {
                                zj.p.l(!map3.containsKey(strG), "Duplicate service %s", strG);
                                map3.put(strG, di0Var2);
                            } else {
                                String strH = f80.h(strG, strG2);
                                zj.p.l(!map2.containsKey(strH), "Duplicate method name %s", strH);
                                map2.put(strH, di0Var2);
                            }
                        }
                    }
                }
                fi0Var = new fi0(di0Var, map2, map3, kl0Var, objC, mapD2);
            }
            return m80.a(fi0Var);
        } catch (RuntimeException e15) {
            return m80.b(l90.f32809g.e("failed to parse service config").d(e15));
        } catch (Throwable th4) {
            return m80.b(l90.f32814l.e("Unexpected error parsing service config").d(th4));
        }
    }
}
