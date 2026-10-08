package e14;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H¦B¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Le14/a;", "Lgz/b;", "Lgz/b$a$a;", "Le14/a$a;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends gz.b<gz.b.a.C1792a, InterfaceC1068a> {

    /* JADX INFO: renamed from: e14.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Le14/a$a;", "", "b", "a", "Le14/a$a$a;", "Le14/a$a$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC1068a {

        /* JADX INFO: renamed from: e14.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Le14/a$a$a;", "Le14/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC1069a implements InterfaceC1068a {
            NO_PERMISSIONS,
            NO_GPS_ENABLED;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ wq.a f46875d = wq.b.a(b());
        }

        /* JADX INFO: renamed from: e14.a$a$b */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Le14/a$a$b;", "Le14/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements InterfaceC1068a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f46876a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1914243363;
            }

            public String toString() {
                return "OK";
            }
        }
    }

    Object a(gz.b.a.C1792a c1792a, tq.e<? super InterfaceC1068a> eVar);
}
