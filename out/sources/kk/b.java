package kk;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f111283a = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f111284b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: kk.b$b, reason: collision with other inner class name */
    public static abstract class EnumC2684b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC2684b f111285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC2684b f111286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC2684b[] f111287c;

        /* JADX INFO: renamed from: kk.b$b$a */
        final enum a extends EnumC2684b {
            a(String str, int i15) {
                super(str, i15);
            }

            @Override // kk.b.EnumC2684b
            public boolean b() {
                return !b.c();
            }
        }

        /* JADX INFO: renamed from: kk.b$b$b, reason: collision with other inner class name */
        final enum C2685b extends EnumC2684b {
            C2685b(String str, int i15) {
                super(str, i15);
            }

            @Override // kk.b.EnumC2684b
            public boolean b() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f111285a = aVar;
            C2685b c2685b = new C2685b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f111286b = c2685b;
            f111287c = new EnumC2684b[]{aVar, c2685b};
        }

        private EnumC2684b(String str, int i15) {
            super(str, i15);
        }

        public static EnumC2684b valueOf(String str) {
            return (EnumC2684b) Enum.valueOf(EnumC2684b.class, str);
        }

        public static EnumC2684b[] values() {
            return (EnumC2684b[]) f111287c.clone();
        }

        public abstract boolean b();
    }

    private b() {
    }

    static Boolean a() {
        try {
            int i15 = Conscrypt.f149621a;
            return (Boolean) Conscrypt.class.getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f111283a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return kk.a.a() || f111284b.get();
    }
}
