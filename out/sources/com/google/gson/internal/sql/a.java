package com.google.gson.internal.sql;

import com.google.gson.b0;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f36850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a<? extends Date> f36851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a<? extends Date> f36852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f36853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f36854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f36855f;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    class C0767a extends DefaultDateTypeAdapter.a<java.sql.Date> {
        C0767a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    class b extends DefaultDateTypeAdapter.a<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z15;
        try {
            Class.forName("java.sql.Date");
            z15 = true;
        } catch (ClassNotFoundException unused) {
            z15 = false;
        }
        f36850a = z15;
        if (z15) {
            f36851b = new C0767a(java.sql.Date.class);
            f36852c = new b(Timestamp.class);
            f36853d = SqlDateTypeAdapter.f36844b;
            f36854e = SqlTimeTypeAdapter.f36846b;
            f36855f = SqlTimestampTypeAdapter.f36848b;
            return;
        }
        f36851b = null;
        f36852c = null;
        f36853d = null;
        f36854e = null;
        f36855f = null;
    }
}
