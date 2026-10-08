package a14;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"La14/j;", "", "La14/j$a;", "Ljavax/crypto/SecretKey;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends gz.b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"La14/j$a;", "Lgz/b$a;", "<init>", "()V", "b", "a", "La14/j$a$a;", "La14/j$a$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements gz.b.a {

        /* JADX INFO: renamed from: a14.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"La14/j$a$a;", "La14/j$a;", "Liy/b0;", "password", "Liy/a0;", "salt", "<init>", "(Liy/b0;Liy/a0;)V", "a", "Liy/b0;", "()Liy/b0;", "b", "Liy/a0;", "()Liy/a0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0018a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final iy.b0 password;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final iy.a0 salt;

            public C0018a(iy.b0 b0Var, iy.a0 a0Var) {
                super(null);
                this.password = b0Var;
                this.salt = a0Var;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final iy.b0 getPassword() {
                return this.password;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final iy.a0 getSalt() {
                return this.salt;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"La14/j$a$b;", "La14/j$a;", "Liy/b0;", "password", "Liy/a0;", "seed", "", "saltLength", "<init>", "(Liy/b0;Liy/a0;I)V", "a", "Liy/b0;", "()Liy/b0;", "b", "Liy/a0;", "c", "()Liy/a0;", "I", "()I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final iy.b0 password;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final iy.a0 seed;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final int saltLength;

            public b(iy.b0 b0Var, iy.a0 a0Var, int i15) {
                super(null);
                this.password = b0Var;
                this.seed = a0Var;
                this.saltLength = i15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final iy.b0 getPassword() {
                return this.password;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getSaltLength() {
                return this.saltLength;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final iy.a0 getSeed() {
                return this.seed;
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }
}
