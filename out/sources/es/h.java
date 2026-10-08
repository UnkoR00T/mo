package es;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f53141a;

        public a(String str) {
            super(null);
            this.f53141a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && fr.t.c(this.f53141a, ((a) obj).f53141a);
        }

        public int hashCode() {
            return this.f53141a.hashCode();
        }

        public String toString() {
            return "Class(name=" + this.f53141a + ')';
        }
    }

    public static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f53142a;

        public b(String str) {
            super(null);
            this.f53142a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && fr.t.c(this.f53142a, ((b) obj).f53142a);
        }

        public int hashCode() {
            return this.f53142a.hashCode();
        }

        public String toString() {
            return "TypeAlias(name=" + this.f53142a + ')';
        }
    }

    public static final class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f53143a;

        public c(int i15) {
            super(null);
            this.f53143a = i15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f53143a == ((c) obj).f53143a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f53143a);
        }

        public String toString() {
            return "TypeParameter(id=" + this.f53143a + ')';
        }
    }

    public /* synthetic */ h(fr.k kVar) {
        this();
    }

    private h() {
    }
}
