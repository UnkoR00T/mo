package com.google.mlkit.vision.common.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jg.s;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f36885a = new HashMap();

    /* JADX INFO: renamed from: com.google.mlkit.vision.common.internal.a$a, reason: collision with other inner class name */
    public static class C0768a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f36886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kl.b f36887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f36888c;

        final int a() {
            return this.f36888c;
        }

        final kl.b b() {
            return this.f36887b;
        }

        final Class c() {
            return this.f36886a;
        }
    }

    a(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0768a c0768a = (C0768a) it.next();
            Class clsC = c0768a.c();
            if (!this.f36885a.containsKey(clsC) || c0768a.a() >= ((Integer) s.l((Integer) map.get(clsC))).intValue()) {
                this.f36885a.put(clsC, c0768a.b());
                map.put(clsC, Integer.valueOf(c0768a.a()));
            }
        }
    }
}
