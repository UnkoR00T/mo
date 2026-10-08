package f6;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import i6.i;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.k0;
import x5.p;

/* JADX INFO: loaded from: classes.dex */
public class g {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f59396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f59397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f59398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f59399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f59400e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f59401f;

        @Deprecated
        public b(Uri uri, int i15, int i16, boolean z15, int i17) {
            this(uri, i15, i16, z15, null, i17);
        }

        static b a(Uri uri, int i15, int i16, boolean z15, int i17) {
            return new b(uri, i15, i16, z15, i17);
        }

        public int b() {
            return this.f59401f;
        }

        public String c() {
            if (i()) {
                return this.f59396a.getAuthority();
            }
            return null;
        }

        public int d() {
            return this.f59397b;
        }

        public Uri e() {
            return this.f59396a;
        }

        public String f() {
            return this.f59400e;
        }

        public int g() {
            return this.f59398c;
        }

        public boolean h() {
            return this.f59399d;
        }

        public boolean i() {
            return Objects.equals(this.f59396a.getScheme(), "systemfont");
        }

        public b(Uri uri, int i15, int i16, boolean z15, String str, int i17) {
            this.f59396a = (Uri) i.g(uri);
            this.f59397b = i15;
            this.f59398c = i16;
            this.f59399d = z15;
            this.f59400e = str;
            this.f59401f = i17;
        }

        public b(String str, String str2) {
            this.f59396a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.f59397b = 0;
            this.f59398c = 400;
            this.f59399d = false;
            this.f59400e = str2;
            this.f59401f = 0;
        }
    }

    public static class c {
        public void a(int i15) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return p.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, k0.a(new Object[]{eVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List<e> list, int i15, boolean z15, int i16, Handler handler, c cVar) {
        f6.a aVar = new f6.a(cVar, h.b(handler));
        if (!z15) {
            return f.d(context, list, i15, null, aVar);
        }
        if (list.size() <= 1) {
            return f.e(context, list.get(0), aVar, i15, i16);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f59394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<b[]> f59395b;

        @Deprecated
        public a(int i15, b[] bVarArr) {
            this.f59394a = i15;
            this.f59395b = Collections.singletonList(bVarArr);
        }

        static a a(int i15, List<b[]> list) {
            return new a(i15, list);
        }

        static a b(int i15, b[] bVarArr) {
            return new a(i15, bVarArr);
        }

        public b[] c() {
            return this.f59395b.get(0);
        }

        public List<b[]> d() {
            return this.f59395b;
        }

        public int e() {
            return this.f59394a;
        }

        boolean f() {
            return this.f59395b.size() > 1;
        }

        a(int i15, List<b[]> list) {
            this.f59394a = i15;
            this.f59395b = list;
        }
    }
}
