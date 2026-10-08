package js;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface u {
    Set<String> a(zs.c cVar);

    qs.g b(a aVar);

    qs.u c(zs.c cVar, boolean z15);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zs.b f104733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f104734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final qs.g f104735c;

        public a(zs.b bVar, byte[] bArr, qs.g gVar) {
            this.f104733a = bVar;
            this.f104734b = bArr;
            this.f104735c = gVar;
        }

        public final zs.b a() {
            return this.f104733a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return fr.t.c(this.f104733a, aVar.f104733a) && fr.t.c(this.f104734b, aVar.f104734b) && fr.t.c(this.f104735c, aVar.f104735c);
        }

        public int hashCode() {
            int iHashCode = this.f104733a.hashCode() * 31;
            byte[] bArr = this.f104734b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            qs.g gVar = this.f104735c;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f104733a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f104734b) + ", outerClass=" + this.f104735c + ')';
        }

        public /* synthetic */ a(zs.b bVar, byte[] bArr, qs.g gVar, int i15, fr.k kVar) {
            this(bVar, (i15 & 2) != 0 ? null : bArr, (i15 & 4) != 0 ? null : gVar);
        }
    }
}
