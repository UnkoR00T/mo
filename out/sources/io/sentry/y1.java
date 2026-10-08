package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<c> f95971a = new ArrayList<>();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f95972a;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
            f95972a = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95972a[io.sentry.vendor.gson.stream.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95972a[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95972a[io.sentry.vendor.gson.stream.b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f95972a[io.sentry.vendor.gson.stream.b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f95972a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f95972a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f95972a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f95972a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f95972a[io.sentry.vendor.gson.stream.b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
        Object a();
    }

    private interface c {
        Object getValue();
    }

    private static final class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f95975a;

        f(String str) {
            this.f95975a = str;
        }

        @Override // io.sentry.y1.c
        public Object getValue() {
            return this.f95975a;
        }
    }

    private static final class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f95976a;

        g(Object obj) {
            this.f95976a = obj;
        }

        @Override // io.sentry.y1.c
        public Object getValue() {
            return this.f95976a;
        }
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    private c f() {
        if (this.f95971a.isEmpty()) {
            return null;
        }
        ArrayList<c> arrayList = this.f95971a;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean g() {
        if (i()) {
            return true;
        }
        c cVarF = f();
        l();
        if (!(f() instanceof f)) {
            if (!(f() instanceof d)) {
                return false;
            }
            d dVar = (d) f();
            if (cVarF == null || dVar == null) {
                return false;
            }
            dVar.f95973a.add(cVarF.getValue());
            return false;
        }
        f fVar = (f) f();
        l();
        e eVar = (e) f();
        if (fVar == null || cVarF == null || eVar == null) {
            return false;
        }
        eVar.f95974a.put(fVar.f95975a, cVarF.getValue());
        return false;
    }

    private boolean h(b bVar) {
        Object objA = bVar.a();
        if (f() == null && objA != null) {
            m(new g(objA));
            return true;
        }
        if (f() instanceof f) {
            f fVar = (f) f();
            l();
            ((e) f()).f95974a.put(fVar.f95975a, objA);
            return false;
        }
        if (!(f() instanceof d)) {
            return false;
        }
        ((d) f()).f95973a.add(objA);
        return false;
    }

    private boolean i() {
        return this.f95971a.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object j(z1 z1Var) {
        try {
            try {
                return Integer.valueOf(z1Var.nextInt());
            } catch (Exception unused) {
                return Double.valueOf(z1Var.nextDouble());
            }
        } catch (Exception unused2) {
            return Long.valueOf(z1Var.nextLong());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void k(final z1 z1Var) {
        boolean zG;
        a aVar = null;
        switch (a.f95972a[z1Var.peek().ordinal()]) {
            case 1:
                z1Var.b();
                m(new d(aVar));
                zG = false;
                break;
            case 2:
                z1Var.h();
                zG = g();
                break;
            case 3:
                z1Var.Y();
                m(new e(aVar));
                zG = false;
                break;
            case 4:
                z1Var.h0();
                zG = g();
                break;
            case 5:
                m(new f(z1Var.h1()));
                zG = false;
                break;
            case 6:
                zG = h(new b() { // from class: io.sentry.u1
                    @Override // io.sentry.y1.b
                    public final Object a() {
                        return z1Var.q2();
                    }
                });
                break;
            case 7:
                zG = h(new b() { // from class: io.sentry.v1
                    @Override // io.sentry.y1.b
                    public final Object a() {
                        return this.f95845a.j(z1Var);
                    }
                });
                break;
            case 8:
                zG = h(new b() { // from class: io.sentry.w1
                    @Override // io.sentry.y1.b
                    public final Object a() {
                        return Boolean.valueOf(z1Var.m());
                    }
                });
                break;
            case 9:
                z1Var.p();
                zG = h(new b() { // from class: io.sentry.x1
                    @Override // io.sentry.y1.b
                    public final Object a() {
                        return y1.a();
                    }
                });
                break;
            case 10:
                zG = true;
                break;
            default:
                zG = false;
                break;
        }
        if (zG) {
            return;
        }
        k(z1Var);
    }

    private void l() {
        if (this.f95971a.isEmpty()) {
            return;
        }
        ArrayList<c> arrayList = this.f95971a;
        arrayList.remove(arrayList.size() - 1);
    }

    private void m(c cVar) {
        this.f95971a.add(cVar);
    }

    public Object e(z1 z1Var) {
        k(z1Var);
        c cVarF = f();
        if (cVarF != null) {
            return cVarF.getValue();
        }
        return null;
    }

    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList<Object> f95973a;

        private d() {
            this.f95973a = new ArrayList<>();
        }

        @Override // io.sentry.y1.c
        public Object getValue() {
            return this.f95973a;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final HashMap<String, Object> f95974a;

        private e() {
            this.f95974a = new HashMap<>();
        }

        @Override // io.sentry.y1.c
        public Object getValue() {
            return this.f95974a;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
