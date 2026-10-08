package od;

import android.graphics.PointF;
import fd.a0;

/* JADX INFO: loaded from: classes3.dex */
public class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f144737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f144738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd.b f144739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nd.o<PointF, PointF> f144740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nd.b f144741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nd.b f144742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final nd.b f144743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nd.b f144744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final nd.b f144745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f144746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f144747k;

    public enum a {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f144751a;

        a(int i15) {
            this.f144751a = i15;
        }

        public static a e(int i15) {
            for (a aVar : values()) {
                if (aVar.f144751a == i15) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, nd.b bVar, nd.o<PointF, PointF> oVar, nd.b bVar2, nd.b bVar3, nd.b bVar4, nd.b bVar5, nd.b bVar6, boolean z15, boolean z16) {
        this.f144737a = str;
        this.f144738b = aVar;
        this.f144739c = bVar;
        this.f144740d = oVar;
        this.f144741e = bVar2;
        this.f144742f = bVar3;
        this.f144743g = bVar4;
        this.f144744h = bVar5;
        this.f144745i = bVar6;
        this.f144746j = z15;
        this.f144747k = z16;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return new hd.n(a0Var, bVar, this);
    }

    public nd.b b() {
        return this.f144742f;
    }

    public nd.b c() {
        return this.f144744h;
    }

    public String d() {
        return this.f144737a;
    }

    public nd.b e() {
        return this.f144743g;
    }

    public nd.b f() {
        return this.f144745i;
    }

    public nd.b g() {
        return this.f144739c;
    }

    public nd.o<PointF, PointF> h() {
        return this.f144740d;
    }

    public nd.b i() {
        return this.f144741e;
    }

    public a j() {
        return this.f144738b;
    }

    public boolean k() {
        return this.f144746j;
    }

    public boolean l() {
        return this.f144747k;
    }
}
