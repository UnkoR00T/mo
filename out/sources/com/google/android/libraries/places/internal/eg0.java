package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class eg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f32201a = Logger.getLogger(eg0.class.getName());

    private eg0() {
    }

    public static Object a(String str) {
        zl.a aVar = new zl.a(new StringReader(str));
        try {
            Object objB = b(aVar);
            try {
                return objB;
            } catch (IOException e15) {
                return objB;
            }
        } finally {
            try {
                aVar.close();
            } catch (IOException e16) {
                f32201a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e16);
            }
        }
    }

    private static Object b(zl.a aVar) throws IOException {
        zj.p.x(aVar.I(), "unexpected end of JSON");
        switch (dg0.f32035a[aVar.a0().ordinal()]) {
            case 1:
                aVar.h();
                ArrayList arrayList = new ArrayList();
                while (aVar.I()) {
                    arrayList.add(b(aVar));
                }
                zj.p.x(aVar.a0() == zl.b.END_ARRAY, "Bad token: ".concat(String.valueOf(aVar.W())));
                aVar.u();
                return Collections.unmodifiableList(arrayList);
            case 2:
                aVar.Y();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (aVar.I()) {
                    String strH1 = aVar.h1();
                    zj.p.l(!linkedHashMap.containsKey(strH1), "Duplicate key found: %s", strH1);
                    linkedHashMap.put(strH1, b(aVar));
                }
                zj.p.x(aVar.a0() == zl.b.END_OBJECT, "Bad token: ".concat(String.valueOf(aVar.W())));
                aVar.h0();
                return Collections.unmodifiableMap(linkedHashMap);
            case 3:
                return aVar.q2();
            case 4:
                return Double.valueOf(aVar.nextDouble());
            case 5:
                return Boolean.valueOf(aVar.M());
            case 6:
                aVar.O();
                return null;
            default:
                throw new IllegalStateException("Bad token: ".concat(String.valueOf(aVar.W())));
        }
    }
}
