package lt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f120088a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f120089b;

        static {
            d.a aVar = d.f120091c;
            f120089b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        @Override // lt.c
        public int a() {
            return f120089b;
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f120090a = new b();

        private b() {
        }

        @Override // lt.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
