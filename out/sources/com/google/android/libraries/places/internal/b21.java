package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class b21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.gson.f f31727a = new com.google.gson.g().i(com.google.gson.c.f36639e).b();

    public final Object a(String str, Class cls) throws a21 {
        try {
            return this.f31727a.i(str, cls);
        } catch (com.google.gson.u unused) {
            String name = cls.getName();
            StringBuilder sb5 = new StringBuilder(name.length() + 55);
            sb5.append("Could not convert JSON string to ");
            sb5.append(name);
            sb5.append(" due to syntax errors.");
            throw new a21(sb5.toString());
        }
    }
}
