package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f36862a = new a("DEFAULT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f36863b = new v("STRING", 1) { // from class: com.google.gson.v.b
        {
            a aVar = null;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ v[] f36864c = b();

    final enum a extends v {
        a(String str, int i15) {
            super(str, i15, null);
        }
    }

    private v(String str, int i15) {
        super(str, i15);
    }

    private static /* synthetic */ v[] b() {
        return new v[]{f36862a, f36863b};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f36864c.clone();
    }

    /* synthetic */ v(String str, int i15, a aVar) {
        this(str, i15);
    }
}
