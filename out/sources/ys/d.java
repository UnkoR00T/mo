package ys;

import fr.k;
import fr.t;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f229094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f229095b;

        public a(String str, String str2) {
            super(null);
            this.f229094a = str;
            this.f229095b = str2;
        }

        @Override // ys.d
        public String a() {
            return e() + ':' + d();
        }

        public final String b() {
            return this.f229094a;
        }

        public final String c() {
            return this.f229095b;
        }

        public String d() {
            return this.f229095b;
        }

        public String e() {
            return this.f229094a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.c(this.f229094a, aVar.f229094a) && t.c(this.f229095b, aVar.f229095b);
        }

        public int hashCode() {
            return (this.f229094a.hashCode() * 31) + this.f229095b.hashCode();
        }
    }

    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f229096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f229097b;

        public b(String str, String str2) {
            super(null);
            this.f229096a = str;
            this.f229097b = str2;
        }

        public static /* synthetic */ b c(b bVar, String str, String str2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = bVar.f229096a;
            }
            if ((i15 & 2) != 0) {
                str2 = bVar.f229097b;
            }
            return bVar.b(str, str2);
        }

        @Override // ys.d
        public String a() {
            return e() + d();
        }

        public final b b(String str, String str2) {
            return new b(str, str2);
        }

        public String d() {
            return this.f229097b;
        }

        public String e() {
            return this.f229096a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.c(this.f229096a, bVar.f229096a) && t.c(this.f229097b, bVar.f229097b);
        }

        public int hashCode() {
            return (this.f229096a.hashCode() * 31) + this.f229097b.hashCode();
        }
    }

    public /* synthetic */ d(k kVar) {
        this();
    }

    public abstract String a();

    public final String toString() {
        return a();
    }

    private d() {
    }
}
