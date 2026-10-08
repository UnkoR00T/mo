package yh;

import android.accounts.Account;
import android.content.Context;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hg.a.g<di.c> f226897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hg.a<a> f226898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final hg.a.AbstractC1948a f226899c;

    public static final class a implements hg.a.d.InterfaceC1949a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f226900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f226901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Account f226902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f226903e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f226904f;

        /* JADX INFO: renamed from: yh.r$a$a, reason: collision with other inner class name */
        public static final class C6086a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f226905a = 3;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f226906b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f226907c = true;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f226908d = UUID.randomUUID().toString();

            public a a() {
                return new a(this, null);
            }

            public C6086a b(int i15) {
                if (i15 != 0) {
                    if (i15 == 0) {
                        i15 = 0;
                    } else if (i15 != 2 && i15 != 1 && i15 != 23 && i15 != 3) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i15)));
                    }
                }
                this.f226905a = i15;
                return this;
            }

            final /* synthetic */ int c() {
                return this.f226905a;
            }

            final /* synthetic */ int d() {
                return this.f226906b;
            }

            final /* synthetic */ boolean e() {
                return this.f226907c;
            }

            final /* synthetic */ String f() {
                return this.f226908d;
            }
        }

        private a(C6086a c6086a) {
            this.f226900b = c6086a.c();
            this.f226901c = c6086a.d();
            this.f226904f = c6086a.e();
            this.f226902d = null;
            this.f226903e = c6086a.f();
        }

        @Override // hg.a.d.InterfaceC1949a
        public Account b() {
            return null;
        }

        public final String c() {
            return this.f226903e;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (jg.r.a(Integer.valueOf(this.f226900b), Integer.valueOf(aVar.f226900b)) && jg.r.a(Integer.valueOf(this.f226901c), Integer.valueOf(aVar.f226901c)) && jg.r.a(null, null) && jg.r.a(Boolean.valueOf(this.f226904f), Boolean.valueOf(aVar.f226904f))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return jg.r.b(Integer.valueOf(this.f226900b), Integer.valueOf(this.f226901c), null, Boolean.valueOf(this.f226904f));
        }

        /* synthetic */ a(C6086a c6086a, byte[] bArr) {
            this(c6086a);
        }

        private a() {
            this(new C6086a());
        }

        /* synthetic */ a(byte[] bArr) {
            this(new C6086a());
        }
    }

    static {
        hg.a.g<di.c> gVar = new hg.a.g<>();
        f226897a = gVar;
        d0 d0Var = new d0();
        f226899c = d0Var;
        f226898b = new hg.a<>("Wallet.API", d0Var, gVar);
    }

    public static n a(Context context, a aVar) {
        return new n(context, aVar);
    }
}
