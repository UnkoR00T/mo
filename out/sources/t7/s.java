package t7;

import ak.n0;
import ak.p0;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s f188425i = new c().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f188426j = o0.u0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f188427k = o0.u0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f188428l = o0.u0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f188429m = o0.u0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f188430n = o0.u0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f188431o = o0.u0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f188433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final h f188434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f188435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f188436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f188437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public final e f188438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f188439h;

    public static final class b {
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f188440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f188441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f188442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d.a f188443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f.a f188444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<Object> f188445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f188446g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private n0<k> f188447h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Object f188448i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f188449j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private u f188450k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g.a f188451l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private i f188452m;

        public s a() {
            h hVar;
            zj.p.w(this.f188444e.f188497b == null || this.f188444e.f188496a != null);
            Uri uri = this.f188441b;
            if (uri != null) {
                hVar = new h(uri, this.f188442c, this.f188444e.f188496a != null ? this.f188444e.i() : null, null, this.f188445f, this.f188446g, this.f188447h, this.f188448i, this.f188449j);
            } else {
                hVar = null;
            }
            String str = this.f188440a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarH = this.f188443d.h();
            g gVarF = this.f188451l.f();
            u uVar = this.f188450k;
            if (uVar == null) {
                uVar = u.J;
            }
            return new s(str2, eVarH, hVar, gVarF, uVar, this.f188452m);
        }

        public c b(g gVar) {
            this.f188451l = gVar.a();
            return this;
        }

        public c c(String str) {
            this.f188440a = (String) zj.p.q(str);
            return this;
        }

        public c d(List<k> list) {
            this.f188447h = n0.v(list);
            return this;
        }

        public c e(Object obj) {
            this.f188448i = obj;
            return this;
        }

        public c f(Uri uri) {
            this.f188441b = uri;
            return this;
        }

        public c g(String str) {
            return f(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f188443d = new d.a();
            this.f188444e = new f.a();
            this.f188445f = Collections.EMPTY_LIST;
            this.f188447h = n0.C();
            this.f188451l = new g.a();
            this.f188452m = i.f188537d;
            this.f188449j = -9223372036854775807L;
        }

        private c(s sVar) {
            f.a aVar;
            this();
            this.f188443d = sVar.f188437f.a();
            this.f188440a = sVar.f188432a;
            this.f188450k = sVar.f188436e;
            this.f188451l = sVar.f188435d.a();
            this.f188452m = sVar.f188439h;
            h hVar = sVar.f188433b;
            if (hVar != null) {
                this.f188446g = hVar.f188532e;
                this.f188442c = hVar.f188529b;
                this.f188441b = hVar.f188528a;
                this.f188445f = hVar.f188531d;
                this.f188447h = hVar.f188533f;
                this.f188448i = hVar.f188535h;
                f fVar = hVar.f188530c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f188444e = aVar;
                this.f188449j = hVar.f188536i;
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f188453i = new a().g();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f188454j = o0.u0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f188455k = o0.u0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f188456l = o0.u0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f188457m = o0.u0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f188458n = o0.u0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f188459o = o0.u0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final String f188460p = o0.u0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f188461q = o0.u0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f188462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f188463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f188464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f188465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f188466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f188467f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f188468g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f188469h;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f188470a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f188471b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f188472c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f188473d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f188474e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f188475f;

            public d g() {
                return new d(this);
            }

            @Deprecated
            public e h() {
                return new e(this);
            }

            public a() {
                this.f188471b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f188470a = dVar.f188463b;
                this.f188471b = dVar.f188465d;
                this.f188472c = dVar.f188466e;
                this.f188473d = dVar.f188467f;
                this.f188474e = dVar.f188468g;
                this.f188475f = dVar.f188469h;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f188463b == dVar.f188463b && this.f188465d == dVar.f188465d && this.f188466e == dVar.f188466e && this.f188467f == dVar.f188467f && this.f188468g == dVar.f188468g && this.f188469h == dVar.f188469h;
        }

        public int hashCode() {
            long j15 = this.f188463b;
            int i15 = ((int) (j15 ^ (j15 >>> 32))) * 31;
            long j16 = this.f188465d;
            return ((((((((i15 + ((int) ((j16 >>> 32) ^ j16))) * 31) + (this.f188466e ? 1 : 0)) * 31) + (this.f188467f ? 1 : 0)) * 31) + (this.f188468g ? 1 : 0)) * 31) + (this.f188469h ? 1 : 0);
        }

        private d(a aVar) {
            this.f188462a = o0.g1(aVar.f188470a);
            this.f188464c = o0.g1(aVar.f188471b);
            this.f188463b = aVar.f188470a;
            this.f188465d = aVar.f188471b;
            this.f188466e = aVar.f188472c;
            this.f188467f = aVar.f188473d;
            this.f188468g = aVar.f188474e;
            this.f188469h = aVar.f188475f;
        }
    }

    @Deprecated
    public static final class e extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f188476r = new d.a().h();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f188477l = o0.u0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f188478m = o0.u0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f188479n = o0.u0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f188480o = o0.u0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final String f188481p = o0.u0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f188482q = o0.u0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f188483r = o0.u0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f188484s = o0.u0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f188485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public final UUID f188486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f188487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public final p0<String, String> f188488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final p0<String, String> f188489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f188490f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f188491g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f188492h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public final n0<Integer> f188493i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final n0<Integer> f188494j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final byte[] f188495k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f188495k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f188485a.equals(fVar.f188485a) && Objects.equals(this.f188487c, fVar.f188487c) && Objects.equals(this.f188489e, fVar.f188489e) && this.f188490f == fVar.f188490f && this.f188492h == fVar.f188492h && this.f188491g == fVar.f188491g && this.f188494j.equals(fVar.f188494j) && Arrays.equals(this.f188495k, fVar.f188495k);
        }

        public int hashCode() {
            int iHashCode = this.f188485a.hashCode() * 31;
            Uri uri = this.f188487c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f188489e.hashCode()) * 31) + (this.f188490f ? 1 : 0)) * 31) + (this.f188492h ? 1 : 0)) * 31) + (this.f188491g ? 1 : 0)) * 31) + this.f188494j.hashCode()) * 31) + Arrays.hashCode(this.f188495k);
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private UUID f188496a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Uri f188497b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private p0<String, String> f188498c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f188499d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f188500e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f188501f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private n0<Integer> f188502g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte[] f188503h;

            public f i() {
                return new f(this);
            }

            @Deprecated
            private a() {
                this.f188498c = p0.m();
                this.f188500e = true;
                this.f188502g = n0.C();
            }

            private a(f fVar) {
                this.f188496a = fVar.f188485a;
                this.f188497b = fVar.f188487c;
                this.f188498c = fVar.f188489e;
                this.f188499d = fVar.f188490f;
                this.f188500e = fVar.f188491g;
                this.f188501f = fVar.f188492h;
                this.f188502g = fVar.f188494j;
                this.f188503h = fVar.f188495k;
            }
        }

        private f(a aVar) {
            zj.p.w((aVar.f188501f && aVar.f188497b == null) ? false : true);
            UUID uuid = (UUID) zj.p.q(aVar.f188496a);
            this.f188485a = uuid;
            this.f188486b = uuid;
            this.f188487c = aVar.f188497b;
            this.f188488d = aVar.f188498c;
            this.f188489e = aVar.f188498c;
            this.f188490f = aVar.f188499d;
            this.f188492h = aVar.f188501f;
            this.f188491g = aVar.f188500e;
            this.f188493i = aVar.f188502g;
            this.f188494j = aVar.f188502g;
            this.f188495k = aVar.f188503h != null ? Arrays.copyOf(aVar.f188503h, aVar.f188503h.length) : null;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f188504f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f188505g = o0.u0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f188506h = o0.u0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f188507i = o0.u0(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f188508j = o0.u0(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f188509k = o0.u0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f188510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f188511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f188512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f188513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f188514e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f188515a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f188516b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f188517c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f188518d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f188519e;

            public g f() {
                return new g(this);
            }

            public a g(long j15) {
                this.f188517c = j15;
                return this;
            }

            public a h(float f15) {
                this.f188519e = f15;
                return this;
            }

            public a i(long j15) {
                this.f188516b = j15;
                return this;
            }

            public a j(float f15) {
                this.f188518d = f15;
                return this;
            }

            public a k(long j15) {
                this.f188515a = j15;
                return this;
            }

            public a() {
                this.f188515a = -9223372036854775807L;
                this.f188516b = -9223372036854775807L;
                this.f188517c = -9223372036854775807L;
                this.f188518d = -3.4028235E38f;
                this.f188519e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f188515a = gVar.f188510a;
                this.f188516b = gVar.f188511b;
                this.f188517c = gVar.f188512c;
                this.f188518d = gVar.f188513d;
                this.f188519e = gVar.f188514e;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f188510a == gVar.f188510a && this.f188511b == gVar.f188511b && this.f188512c == gVar.f188512c && this.f188513d == gVar.f188513d && this.f188514e == gVar.f188514e;
        }

        public int hashCode() {
            long j15 = this.f188510a;
            long j16 = this.f188511b;
            int i15 = ((((int) (j15 ^ (j15 >>> 32))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31;
            long j17 = this.f188512c;
            int i16 = (i15 + ((int) ((j17 >>> 32) ^ j17))) * 31;
            float f15 = this.f188513d;
            int iFloatToIntBits = (i16 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
            float f16 = this.f188514e;
            return iFloatToIntBits + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0);
        }

        private g(a aVar) {
            this(aVar.f188515a, aVar.f188516b, aVar.f188517c, aVar.f188518d, aVar.f188519e);
        }

        @Deprecated
        public g(long j15, long j16, long j17, float f15, float f16) {
            this.f188510a = j15;
            this.f188511b = j16;
            this.f188512c = j17;
            this.f188513d = f15;
            this.f188514e = f16;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f188520j = o0.u0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f188521k = o0.u0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f188522l = o0.u0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f188523m = o0.u0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f188524n = o0.u0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f188525o = o0.u0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f188526p = o0.u0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f188527q = o0.u0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f188528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f188529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f188530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<Object> f188531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f188532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final n0<k> f188533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public final List<j> f188534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f188535h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f188536i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f188528a.equals(hVar.f188528a) && Objects.equals(this.f188529b, hVar.f188529b) && Objects.equals(this.f188530c, hVar.f188530c) && this.f188531d.equals(hVar.f188531d) && Objects.equals(this.f188532e, hVar.f188532e) && this.f188533f.equals(hVar.f188533f) && Objects.equals(this.f188535h, hVar.f188535h) && this.f188536i == hVar.f188536i;
        }

        public int hashCode() {
            int iHashCode = this.f188528a.hashCode() * 31;
            String str = this.f188529b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f188530c;
            int iHashCode3 = (((iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 961) + this.f188531d.hashCode()) * 31;
            String str2 = this.f188532e;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f188533f.hashCode()) * 31;
            Object obj = this.f188535h;
            return (int) ((((long) (iHashCode4 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f188536i);
        }

        private h(Uri uri, String str, f fVar, b bVar, List<Object> list, String str2, n0<k> n0Var, Object obj, long j15) {
            this.f188528a = uri;
            this.f188529b = w.l(str);
            this.f188530c = fVar;
            this.f188531d = list;
            this.f188532e = str2;
            this.f188533f = n0Var;
            n0.a aVarS = n0.s();
            for (int i15 = 0; i15 < n0Var.size(); i15++) {
                aVarS.a(n0Var.get(i15).a().i());
            }
            this.f188534g = aVarS.k();
            this.f188535h = obj;
            this.f188536i = j15;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f188537d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f188538e = o0.u0(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f188539f = o0.u0(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f188540g = o0.u0(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f188541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f188542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f188543c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f188544a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f188545b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Bundle f188546c;

            public i d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f188541a, iVar.f188541a) && Objects.equals(this.f188542b, iVar.f188542b)) {
                if ((this.f188543c == null) == (iVar.f188543c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f188541a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f188542b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f188543c != null ? 1 : 0);
        }

        private i(a aVar) {
            this.f188541a = aVar.f188544a;
            this.f188542b = aVar.f188545b;
            this.f188543c = aVar.f188546c;
        }
    }

    @Deprecated
    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    public static class k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f188547h = o0.u0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f188548i = o0.u0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f188549j = o0.u0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f188550k = o0.u0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f188551l = o0.u0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f188552m = o0.u0(5);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f188553n = o0.u0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f188554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f188555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f188556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f188557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f188558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f188559f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f188560g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f188561a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f188562b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f188563c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f188564d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f188565e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f188566f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f188567g;

            /* JADX INFO: Access modifiers changed from: private */
            public j i() {
                return new j(this);
            }

            private a(k kVar) {
                this.f188561a = kVar.f188554a;
                this.f188562b = kVar.f188555b;
                this.f188563c = kVar.f188556c;
                this.f188564d = kVar.f188557d;
                this.f188565e = kVar.f188558e;
                this.f188566f = kVar.f188559f;
                this.f188567g = kVar.f188560g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f188554a.equals(kVar.f188554a) && Objects.equals(this.f188555b, kVar.f188555b) && Objects.equals(this.f188556c, kVar.f188556c) && this.f188557d == kVar.f188557d && this.f188558e == kVar.f188558e && Objects.equals(this.f188559f, kVar.f188559f) && Objects.equals(this.f188560g, kVar.f188560g);
        }

        public int hashCode() {
            int iHashCode = this.f188554a.hashCode() * 31;
            String str = this.f188555b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f188556c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f188557d) * 31) + this.f188558e) * 31;
            String str3 = this.f188559f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f188560g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private k(a aVar) {
            this.f188554a = aVar.f188561a;
            this.f188555b = aVar.f188562b;
            this.f188556c = aVar.f188563c;
            this.f188557d = aVar.f188564d;
            this.f188558e = aVar.f188565e;
            this.f188559f = aVar.f188566f;
            this.f188560g = aVar.f188567g;
        }
    }

    public static s b(String str) {
        return new c().g(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Objects.equals(this.f188432a, sVar.f188432a) && this.f188437f.equals(sVar.f188437f) && Objects.equals(this.f188433b, sVar.f188433b) && Objects.equals(this.f188435d, sVar.f188435d) && Objects.equals(this.f188436e, sVar.f188436e) && Objects.equals(this.f188439h, sVar.f188439h);
    }

    public int hashCode() {
        int iHashCode = this.f188432a.hashCode() * 31;
        h hVar = this.f188433b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f188435d.hashCode()) * 31) + this.f188437f.hashCode()) * 31) + this.f188436e.hashCode()) * 31) + this.f188439h.hashCode();
    }

    private s(String str, e eVar, h hVar, g gVar, u uVar, i iVar) {
        this.f188432a = str;
        this.f188433b = hVar;
        this.f188434c = hVar;
        this.f188435d = gVar;
        this.f188436e = uVar;
        this.f188437f = eVar;
        this.f188438g = eVar;
        this.f188439h = iVar;
    }
}
