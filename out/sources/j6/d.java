package j6;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f99623a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f99624a;

        public a(ClipData clipData, int i15) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f99624a = new b(clipData, i15);
            } else {
                this.f99624a = new C2341d(clipData, i15);
            }
        }

        public d a() {
            return this.f99624a.build();
        }

        public a b(Bundle bundle) {
            this.f99624a.setExtras(bundle);
            return this;
        }

        public a c(int i15) {
            this.f99624a.b(i15);
            return this;
        }

        public a d(Uri uri) {
            this.f99624a.a(uri);
            return this;
        }
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f99625a;

        b(ClipData clipData, int i15) {
            this.f99625a = j6.e.a(clipData, i15);
        }

        @Override // j6.d.c
        public void a(Uri uri) {
            this.f99625a.setLinkUri(uri);
        }

        @Override // j6.d.c
        public void b(int i15) {
            this.f99625a.setFlags(i15);
        }

        @Override // j6.d.c
        public d build() {
            return new d(new e(this.f99625a.build()));
        }

        @Override // j6.d.c
        public void setExtras(Bundle bundle) {
            this.f99625a.setExtras(bundle);
        }
    }

    private interface c {
        void a(Uri uri);

        void b(int i15);

        d build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: j6.d$d, reason: collision with other inner class name */
    private static final class C2341d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ClipData f99626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f99627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f99628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f99629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f99630e;

        C2341d(ClipData clipData, int i15) {
            this.f99626a = clipData;
            this.f99627b = i15;
        }

        @Override // j6.d.c
        public void a(Uri uri) {
            this.f99629d = uri;
        }

        @Override // j6.d.c
        public void b(int i15) {
            this.f99628c = i15;
        }

        @Override // j6.d.c
        public d build() {
            return new d(new g(this));
        }

        @Override // j6.d.c
        public void setExtras(Bundle bundle) {
            this.f99630e = bundle;
        }
    }

    private static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo f99631a;

        e(ContentInfo contentInfo) {
            this.f99631a = j6.c.a(i6.i.g(contentInfo));
        }

        @Override // j6.d.f
        public int m() {
            return this.f99631a.getSource();
        }

        @Override // j6.d.f
        public ContentInfo n() {
            return this.f99631a;
        }

        @Override // j6.d.f
        public ClipData o() {
            return this.f99631a.getClip();
        }

        @Override // j6.d.f
        public int p() {
            return this.f99631a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f99631a + "}";
        }
    }

    private interface f {
        int m();

        ContentInfo n();

        ClipData o();

        int p();
    }

    private static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClipData f99632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f99633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f99634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f99635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f99636e;

        g(C2341d c2341d) {
            this.f99632a = (ClipData) i6.i.g(c2341d.f99626a);
            this.f99633b = i6.i.c(c2341d.f99627b, 0, 5, "source");
            this.f99634c = i6.i.f(c2341d.f99628c, 1);
            this.f99635d = c2341d.f99629d;
            this.f99636e = c2341d.f99630e;
        }

        @Override // j6.d.f
        public int m() {
            return this.f99633b;
        }

        @Override // j6.d.f
        public ContentInfo n() {
            return null;
        }

        @Override // j6.d.f
        public ClipData o() {
            return this.f99632a;
        }

        @Override // j6.d.f
        public int p() {
            return this.f99634c;
        }

        public String toString() {
            String str;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("ContentInfoCompat{clip=");
            sb5.append(this.f99632a.getDescription());
            sb5.append(", source=");
            sb5.append(d.e(this.f99633b));
            sb5.append(", flags=");
            sb5.append(d.a(this.f99634c));
            if (this.f99635d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f99635d.toString().length() + ")";
            }
            sb5.append(str);
            sb5.append(this.f99636e != null ? ", hasExtras" : "");
            sb5.append("}");
            return sb5.toString();
        }
    }

    d(f fVar) {
        this.f99623a = fVar;
    }

    static String a(int i15) {
        return (i15 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i15);
    }

    static String e(int i15) {
        if (i15 == 0) {
            return "SOURCE_APP";
        }
        if (i15 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i15 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i15 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i15 != 4) {
            return i15 != 5 ? String.valueOf(i15) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f99623a.o();
    }

    public int c() {
        return this.f99623a.p();
    }

    public int d() {
        return this.f99623a.m();
    }

    public ContentInfo f() {
        ContentInfo contentInfoN = this.f99623a.n();
        Objects.requireNonNull(contentInfoN);
        j6.c.a(contentInfoN);
        return contentInfoN;
    }

    public String toString() {
        return this.f99623a.toString();
    }
}
