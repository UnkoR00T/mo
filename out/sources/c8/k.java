package c8;

import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface k {

    public static final class b extends Exception {
        public b(String str) {
            super((String) zj.p.q(str));
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t7.p f24250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t7.b f24251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AudioDeviceInfo f24252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f24253d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f24254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f24255f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f24256g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f24257h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f24258i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f24259j;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final t7.p f24260a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private AudioDeviceInfo f24262c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f24263d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f24264e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f24265f;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f24268i;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private t7.b f24261b = t7.b.f188093i;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f24266g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f24267h = -1;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f24269j = -1;

            public a(t7.p pVar) {
                this.f24260a = pVar;
            }

            public c k() {
                return new c(this);
            }

            public a l(t7.b bVar) {
                this.f24261b = bVar;
                return this;
            }

            public a m(int i15) {
                this.f24266g = i15;
                return this;
            }

            public a n(boolean z15) {
                this.f24263d = z15;
                return this;
            }

            public a o(boolean z15) {
                this.f24265f = z15;
                return this;
            }

            public a p(boolean z15) {
                this.f24264e = z15;
                return this;
            }

            public a q(boolean z15) {
                this.f24268i = z15;
                return this;
            }

            public a r(int i15) {
                this.f24269j = i15;
                return this;
            }

            public a s(AudioDeviceInfo audioDeviceInfo) {
                this.f24262c = audioDeviceInfo;
                return this;
            }

            public a t(int i15) {
                this.f24267h = i15;
                return this;
            }
        }

        private c(a aVar) {
            this.f24250a = aVar.f24260a;
            this.f24251b = aVar.f24261b;
            this.f24252c = aVar.f24262c;
            this.f24253d = aVar.f24263d;
            this.f24254e = aVar.f24264e;
            this.f24255f = aVar.f24265f;
            this.f24256g = aVar.f24266g;
            this.f24257h = aVar.f24267h;
            this.f24258i = aVar.f24268i;
            this.f24259j = aVar.f24269j;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f24270e = new a().e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f24271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f24272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f24273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f24274d;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f24275a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f24276b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f24277c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f24278d = 0;

            public d e() {
                if (this.f24275a || !(this.f24276b || this.f24277c)) {
                    return new d(this);
                }
                throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            }

            public a f(int i15) {
                this.f24278d = i15;
                return this;
            }

            public a g(boolean z15) {
                this.f24275a = z15;
                return this;
            }

            public a h(boolean z15) {
                this.f24276b = z15;
                return this;
            }

            public a i(boolean z15) {
                this.f24277c = z15;
                return this;
            }
        }

        private d(a aVar) {
            this.f24271a = aVar.f24275a;
            this.f24272b = aVar.f24276b;
            this.f24273c = aVar.f24277c;
            this.f24274d = aVar.f24278d;
        }
    }

    public static final class e extends Exception {
        public e() {
        }

        public e(Throwable th4) {
            super(th4);
        }
    }

    public interface f {
        void a();
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f24282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f24283e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f24284f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final t7.b f24285g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f24286h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f24287i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f24288j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f24289k;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f24290a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f24291b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f24292c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f24293d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f24294e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f24295f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private t7.b f24296g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f24297h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f24298i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f24299j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f24300k;

            public g l() {
                return new g(this);
            }

            public a m(t7.b bVar) {
                this.f24296g = bVar;
                return this;
            }

            public a n(int i15) {
                this.f24297h = i15;
                return this;
            }

            public a o(int i15) {
                this.f24295f = i15;
                return this;
            }

            public a p(int i15) {
                this.f24292c = i15;
                return this;
            }

            public a q(int i15) {
                this.f24290a = i15;
                return this;
            }

            public a r(boolean z15) {
                this.f24294e = z15;
                return this;
            }

            public a s(boolean z15) {
                this.f24293d = z15;
                return this;
            }

            public a t(int i15) {
                this.f24291b = i15;
                return this;
            }

            public a u(boolean z15) {
                this.f24300k = z15;
                return this;
            }

            public a v(boolean z15) {
                this.f24299j = z15;
                return this;
            }

            public a w(int i15) {
                this.f24298i = i15;
                return this;
            }

            public a() {
                this.f24296g = t7.b.f188093i;
                this.f24297h = 0;
                this.f24298i = -1;
            }

            private a(g gVar) {
                this.f24290a = gVar.f24279a;
                this.f24291b = gVar.f24280b;
                this.f24292c = gVar.f24281c;
                this.f24293d = gVar.f24282d;
                this.f24294e = gVar.f24283e;
                this.f24295f = gVar.f24284f;
                this.f24296g = gVar.f24285g;
                this.f24297h = gVar.f24286h;
                this.f24298i = gVar.f24287i;
                this.f24299j = gVar.f24288j;
                this.f24300k = gVar.f24289k;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                if (this.f24279a == gVar.f24279a && this.f24280b == gVar.f24280b && this.f24281c == gVar.f24281c && this.f24282d == gVar.f24282d && this.f24283e == gVar.f24283e && this.f24284f == gVar.f24284f && this.f24286h == gVar.f24286h && this.f24287i == gVar.f24287i && this.f24288j == gVar.f24288j && this.f24289k == gVar.f24289k && this.f24285g.equals(gVar.f24285g)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f24279a), Integer.valueOf(this.f24280b), Integer.valueOf(this.f24281c), Boolean.valueOf(this.f24282d), Boolean.valueOf(this.f24283e), Integer.valueOf(this.f24284f), this.f24285g, Integer.valueOf(this.f24286h), Integer.valueOf(this.f24287i), Boolean.valueOf(this.f24289k), Boolean.valueOf(this.f24288j));
        }

        private g(a aVar) {
            this.f24279a = aVar.f24290a;
            this.f24280b = aVar.f24291b;
            this.f24281c = aVar.f24292c;
            this.f24282d = aVar.f24293d;
            this.f24283e = aVar.f24294e;
            this.f24284f = aVar.f24295f;
            this.f24285g = aVar.f24296g;
            this.f24286h = aVar.f24297h;
            this.f24287i = aVar.f24298i;
            this.f24288j = aVar.f24299j;
            this.f24289k = aVar.f24300k;
        }
    }

    void b();

    default void c(w7.h hVar) {
    }

    void d(f fVar);

    d e(c cVar);

    g f(c cVar);

    j g(g gVar);
}
