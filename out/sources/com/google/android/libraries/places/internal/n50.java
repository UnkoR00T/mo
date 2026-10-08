package com.google.android.libraries.places.internal;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class n50 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final zj.i f33035c = zj.i.g(',');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final n50 f33036d = new n50(v40.f34024a, false, new n50(new u40(), true, new n50()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f33037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f33038b;

    private n50() {
        this.f33037a = new LinkedHashMap(0);
        this.f33038b = new byte[0];
    }

    public static n50 a() {
        return f33036d;
    }

    final byte[] b() {
        return this.f33038b;
    }

    public final k50 c(String str) {
        m50 m50Var = (m50) this.f33037a.get(str);
        if (m50Var != null) {
            return m50Var.f32919a;
        }
        return null;
    }

    private n50(k50 k50Var, boolean z15, n50 n50Var) {
        String strZza = k50Var.zza();
        zj.p.e(!strZza.contains(","), "Comma is currently not allowed in message encoding");
        int size = n50Var.f33037a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n50Var.f33037a.containsKey(k50Var.zza()) ? size : size + 1);
        for (m50 m50Var : n50Var.f33037a.values()) {
            String strZza2 = m50Var.f32919a.zza();
            if (!strZza2.equals(strZza)) {
                linkedHashMap.put(strZza2, new m50(m50Var.f32919a, m50Var.f32920b));
            }
        }
        linkedHashMap.put(strZza, new m50(k50Var, z15));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f33037a = mapUnmodifiableMap;
        zj.i iVar = f33035c;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((m50) entry.getValue()).f32920b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.f33038b = iVar.e(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
