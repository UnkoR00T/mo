package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d91 f32776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f32777b = 0;

    static {
        g91 g91VarA = h91.a();
        g91VarA.a('\"', "&quot;");
        g91VarA.a('\'', "&#39;");
        g91VarA.a('&', "&amp;");
        g91VarA.a('<', "&lt;");
        g91VarA.a('>', "&gt;");
        f32776a = g91VarA.b();
    }

    static String a(String str) {
        return f32776a.a(str);
    }
}
