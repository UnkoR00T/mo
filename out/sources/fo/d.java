package fo;

import java.sql.Timestamp;
import java.util.Date;
import yn.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f65539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bo.c.b<? extends Date> f65540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bo.c.b<? extends Date> f65541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f65542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f65543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f65544f;

    class a extends bo.c.b<java.sql.Date> {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // bo.c.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    class b extends bo.c.b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // bo.c.b
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
        f65539a = z15;
        if (z15) {
            f65540b = new a(java.sql.Date.class);
            f65541c = new b(Timestamp.class);
            f65542d = fo.a.f65533b;
            f65543e = fo.b.f65535b;
            f65544f = c.f65537b;
            return;
        }
        f65540b = null;
        f65541c = null;
        f65542d = null;
        f65543e = null;
        f65544f = null;
    }
}
