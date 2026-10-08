package h6;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f81215a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f81216b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f81217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f81218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f81219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f81220f;

    private static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f81221b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f81222a;

        private a(boolean z15) {
            this.f81222a = z15;
        }

        @Override // h6.h.c
        public int a(CharSequence charSequence, int i15, int i16) {
            int i17 = i16 + i15;
            boolean z15 = false;
            while (i15 < i17) {
                int iA = h.a(Character.getDirectionality(charSequence.charAt(i15)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                    } else if (!this.f81222a) {
                        return 1;
                    }
                    i15++;
                    z15 = z15;
                } else if (this.f81222a) {
                    return 0;
                }
                z15 = true;
                i15++;
                z15 = z15;
            }
            if (z15) {
                return this.f81222a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f81223a = new b();

        private b() {
        }

        @Override // h6.h.c
        public int a(CharSequence charSequence, int i15, int i16) {
            int i17 = i16 + i15;
            int iB = 2;
            while (i15 < i17 && iB == 2) {
                iB = h.b(Character.getDirectionality(charSequence.charAt(i15)));
                i15++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i15, int i16);
    }

    private static abstract class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f81224a;

        d(c cVar) {
            this.f81224a = cVar;
        }

        private boolean b(CharSequence charSequence, int i15, int i16) {
            int iA = this.f81224a.a(charSequence, i15, i16);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // h6.g
        public boolean isRtl(CharSequence charSequence, int i15, int i16) {
            if (charSequence == null || i15 < 0 || i16 < 0 || charSequence.length() - i16 < i15) {
                throw new IllegalArgumentException();
            }
            return this.f81224a == null ? a() : b(charSequence, i15, i16);
        }
    }

    private static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f81225b;

        e(c cVar, boolean z15) {
            super(cVar);
            this.f81225b = z15;
        }

        @Override // h6.h.d
        protected boolean a() {
            return this.f81225b;
        }
    }

    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f81226b = new f();

        f() {
            super(null);
        }

        @Override // h6.h.d
        protected boolean a() {
            return i.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f81223a;
        f81217c = new e(bVar, false);
        f81218d = new e(bVar, true);
        f81219e = new e(a.f81221b, false);
        f81220f = f.f81226b;
    }

    static int a(int i15) {
        if (i15 != 0) {
            return (i15 == 1 || i15 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i15) {
        if (i15 != 0) {
            if (i15 == 1 || i15 == 2) {
                return 0;
            }
            switch (i15) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
