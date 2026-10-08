package vp;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vp.b f207817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f207818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f207819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final gp.f f207820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f207821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f207822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f207823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f207824h;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f207825a;

        static {
            int[] iArr = new int[c.values().length];
            f207825a = iArr;
            try {
                iArr[c.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f207825a[c.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f207825a[c.JUSTIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private gp.f f207826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private vp.b f207827b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private u f207830e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f207828c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f207829d = 0.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f207831f = c.LEFT;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f207832g = 0.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f207833h = 0.0f;

        b(gp.f fVar) {
            this.f207826a = fVar;
        }

        v i() {
            return new v(this, null);
        }

        b j(float f15, float f16) {
            this.f207832g = f15;
            this.f207833h = f16;
            return this;
        }

        b k(vp.b bVar) {
            this.f207827b = bVar;
            return this;
        }

        b l(u uVar) {
            this.f207830e = uVar;
            return this;
        }

        b m(int i15) {
            this.f207831f = c.e(i15);
            return this;
        }

        b n(float f15) {
            this.f207829d = f15;
            return this;
        }

        b o(boolean z15) {
            this.f207828c = z15;
            return this;
        }
    }

    enum c {
        LEFT(0),
        CENTER(1),
        RIGHT(2),
        JUSTIFY(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f207839a;

        c(int i15) {
            this.f207839a = i15;
        }

        public static c e(int i15) {
            for (c cVar : values()) {
                if (cVar.b() == i15) {
                    return cVar;
                }
            }
            return LEFT;
        }

        int b() {
            return this.f207839a;
        }
    }

    /* synthetic */ v(b bVar, a aVar) {
        this(bVar);
    }

    private void b(List<u.a> list, boolean z15) {
        float f15 = 0.0f;
        float fD = 0.0f;
        float fC = 0.0f;
        for (u.a aVar : list) {
            int i15 = a.f207825a[this.f207822f.ordinal()];
            if (i15 == 1) {
                fD = (this.f207819c - aVar.d()) / 2.0f;
            } else if (i15 == 2) {
                fD = this.f207819c - aVar.d();
            } else if (i15 != 3) {
                fD = 0.0f;
            } else if (list.indexOf(aVar) != list.size() - 1) {
                fC = aVar.c(this.f207819c);
            }
            float f16 = (-f15) + fD + this.f207823g;
            if (list.indexOf(aVar) == 0 && z15) {
                this.f207820d.I(f16, this.f207824h);
            } else {
                this.f207824h -= this.f207817a.c();
                this.f207820d.I(f16, -this.f207817a.c());
            }
            f15 += f16;
            List<u.d> listE = aVar.e();
            int i16 = 0;
            for (u.d dVar : listE) {
                this.f207820d.d0(dVar.b());
                float fFloatValue = ((Float) dVar.a().getIterator().getAttribute(u.c.f207814a)).floatValue();
                if (i16 != listE.size() - 1) {
                    this.f207820d.I(fFloatValue + fC, 0.0f);
                    f15 = f15 + fFloatValue + fC;
                }
                i16++;
            }
        }
        this.f207823g -= f15;
    }

    public void a() {
        u uVar = this.f207821e;
        if (uVar == null || uVar.a().isEmpty()) {
            return;
        }
        boolean z15 = true;
        for (u.b bVar : this.f207821e.a()) {
            if (this.f207818b) {
                b(bVar.a(this.f207817a.a(), this.f207817a.b(), this.f207819c), z15);
                z15 = false;
            } else {
                float fM = (this.f207817a.a().m(bVar.b()) * this.f207817a.b()) / 1000.0f;
                float f15 = 0.0f;
                if (fM < this.f207819c) {
                    int i15 = a.f207825a[this.f207822f.ordinal()];
                    if (i15 == 1) {
                        f15 = (this.f207819c - fM) / 2.0f;
                    } else if (i15 == 2) {
                        f15 = this.f207819c - fM;
                    }
                }
                this.f207820d.I(this.f207823g + f15, this.f207824h);
                this.f207820d.d0(bVar.b());
            }
        }
    }

    private v(b bVar) {
        this.f207817a = bVar.f207827b;
        this.f207818b = bVar.f207828c;
        this.f207819c = bVar.f207829d;
        this.f207820d = bVar.f207826a;
        this.f207821e = bVar.f207830e;
        this.f207822f = bVar.f207831f;
        this.f207823g = bVar.f207832g;
        this.f207824h = bVar.f207833h;
    }
}
