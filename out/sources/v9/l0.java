package v9;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public interface l0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f205059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f205060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f205061c;

        public a(String str, int i15, byte[] bArr) {
            this.f205059a = str;
            this.f205060b = i15;
            this.f205061c = bArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f205062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f205063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f205064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<a> f205065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f205066e;

        public b(int i15, String str, int i16, List<a> list, byte[] bArr) {
            this.f205062a = i15;
            this.f205063b = str;
            this.f205064c = i16;
            this.f205065d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f205066e = bArr;
        }

        public int a() {
            int i15 = this.f205064c;
            if (i15 != 2) {
                return i15 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    public interface c {
        SparseArray<l0> a();

        l0 b(int i15, b bVar);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f205067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f205068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f205069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f205070d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f205071e;

        public d(int i15, int i16) {
            this(PKIFailureInfo.systemUnavail, i15, i16);
        }

        private void d() {
            if (this.f205070d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i15 = this.f205070d;
            this.f205070d = i15 == Integer.MIN_VALUE ? this.f205068b : i15 + this.f205069c;
            this.f205071e = this.f205067a + this.f205070d;
        }

        public String b() {
            d();
            return this.f205071e;
        }

        public int c() {
            d();
            return this.f205070d;
        }

        public d(int i15, int i16, int i17) {
            String str;
            if (i15 != Integer.MIN_VALUE) {
                str = i15 + "/";
            } else {
                str = "";
            }
            this.f205067a = str;
            this.f205068b = i16;
            this.f205069c = i17;
            this.f205070d = PKIFailureInfo.systemUnavail;
            this.f205071e = "";
        }
    }

    void a(w7.k0 k0Var, o8.r rVar, d dVar);

    void b(w7.c0 c0Var, int i15);

    void c();
}
