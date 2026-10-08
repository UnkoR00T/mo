package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class qa0 extends k70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o70 f33402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k70 f33403c;

    qa0(o70 o70Var, String str) {
        this.f33402b = (o70) zj.p.r(o70Var, "registry");
        k70 k70VarB = o70Var.b((String) zj.p.r("pick_first", "defaultPolicy"));
        if (k70VarB == null) {
            l90 l90Var = l90.f32814l;
            StringBuilder sb5 = new StringBuilder(192);
            sb5.append("Could not find policy '");
            sb5.append("pick_first");
            sb5.append("'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
            l90 l90VarE = l90Var.e(sb5.toString());
            k70VarB = new ie0(b50.TRANSIENT_FAILURE, new y60(b70.b(l90VarE)), l90VarE);
        }
        this.f33403c = k70VarB;
    }

    @Override // com.google.android.libraries.places.internal.x60
    public final /* synthetic */ i70 a(z60 z60Var) {
        return new pa0(this, z60Var);
    }

    @Override // com.google.android.libraries.places.internal.k70
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.k70
    public final int c() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.k70
    public final String d() {
        return "auto_configured_internal";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    @Override // com.google.android.libraries.places.internal.k70
    public final m80 e(Map map) {
        List<xl0> listUnmodifiableList;
        String strG;
        if (map != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (map.containsKey("loadBalancingConfig")) {
                    arrayList.addAll(fg0.b(map, "loadBalancingConfig"));
                }
                if (arrayList.isEmpty() && (strG = fg0.g(map, "loadBalancingPolicy")) != null) {
                    arrayList.add(Collections.singletonMap(strG.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
                }
                List<Map> listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
                if (listUnmodifiableList2 == null) {
                    listUnmodifiableList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map map2 : listUnmodifiableList2) {
                        if (map2.size() != 1) {
                            int size = map2.size();
                            String strValueOf = String.valueOf(map2);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(size).length() + 83 + strValueOf.length());
                            sb5.append("There are ");
                            sb5.append(size);
                            sb5.append(" fields in a LoadBalancingConfig object. Exactly one is expected. Config=");
                            sb5.append(strValueOf);
                            throw new RuntimeException(sb5.toString());
                        }
                        String str = (String) ((Map.Entry) map2.entrySet().iterator().next()).getKey();
                        arrayList2.add(new xl0(str, fg0.d(map2, str)));
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                }
            } catch (RuntimeException e15) {
                return m80.b(l90.f32809g.e("can't parse load balancer configuration").d(e15));
            }
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null || listUnmodifiableList.isEmpty()) {
            return null;
        }
        o70 o70Var = this.f33402b;
        ArrayList arrayList3 = new ArrayList();
        for (xl0 xl0Var : listUnmodifiableList) {
            String strA = xl0Var.a();
            k70 k70VarB = o70Var.b(strA);
            if (k70VarB != null) {
                if (!arrayList3.isEmpty()) {
                    Logger.getLogger(zl0.class.getName()).logp(Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList3);
                }
                m80 m80VarE = k70VarB.e(xl0Var.b());
                return m80VarE.d() == null ? m80.a(new yl0(k70VarB, m80VarE.c())) : m80VarE;
            }
            arrayList3.add(strA);
        }
        l90 l90Var = l90.f32809g;
        String string = arrayList3.toString();
        StringBuilder sb6 = new StringBuilder(string.length() + 51);
        sb6.append("None of ");
        sb6.append(string);
        sb6.append(" specified by Service Config are available.");
        return m80.b(l90Var.e(sb6.toString()));
    }

    final /* synthetic */ k70 f() {
        return this.f33403c;
    }
}
