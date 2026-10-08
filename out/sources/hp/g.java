package hp;

import android.graphics.Path;
import bp.k;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class g implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f86147b = new g(612.0f, 792.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f86148c = new g(612.0f, 1008.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f86149d = new g(2383.937f, 3370.3938f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f86150e = new g(1683.7795f, 2383.937f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f86151f = new g(1190.5513f, 1683.7795f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f86152g = new g(841.8898f, 1190.5513f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f86153h = new g(595.27563f, 841.8898f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f86154j = new g(419.52756f, 595.27563f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f86155k = new g(297.63782f, 419.52756f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.a f86156a;

    public g() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // hp.c
    public bp.b D1() {
        return this.f86156a;
    }

    public g a() {
        g gVar = new g();
        gVar.k(h());
        gVar.l(c());
        return gVar;
    }

    public bp.a b() {
        return this.f86156a;
    }

    public float c() {
        return g() - e();
    }

    public float d() {
        return ((k) this.f86156a.g4(0)).i3();
    }

    public float e() {
        return ((k) this.f86156a.g4(1)).i3();
    }

    public float f() {
        return ((k) this.f86156a.g4(2)).i3();
    }

    public float g() {
        return ((k) this.f86156a.g4(3)).i3();
    }

    public float h() {
        return f() - d();
    }

    public void i(float f15) {
        this.f86156a.p4(0, new bp.f(f15));
    }

    public void j(float f15) {
        this.f86156a.p4(1, new bp.f(f15));
    }

    public void k(float f15) {
        this.f86156a.p4(2, new bp.f(f15));
    }

    public void l(float f15) {
        this.f86156a.p4(3, new bp.f(f15));
    }

    public Path m() {
        float fD = d();
        float fE = e();
        float f15 = f();
        float fG = g();
        Path path = new Path();
        path.moveTo(fD, fE);
        path.lineTo(f15, fE);
        path.lineTo(f15, fG);
        path.lineTo(fD, fG);
        path.close();
        return path;
    }

    public String toString() {
        return "[" + d() + "," + e() + "," + f() + "," + g() + "]";
    }

    public g(float f15, float f16) {
        this(0.0f, 0.0f, f15, f16);
    }

    public g(float f15, float f16, float f17, float f18) {
        bp.a aVar = new bp.a();
        this.f86156a = aVar;
        aVar.A3(new bp.f(f15));
        aVar.A3(new bp.f(f16));
        aVar.A3(new bp.f(f15 + f17));
        aVar.A3(new bp.f(f16 + f18));
    }

    public g(uo.a aVar) {
        bp.a aVar2 = new bp.a();
        this.f86156a = aVar2;
        aVar2.A3(new bp.f(aVar.b()));
        aVar2.A3(new bp.f(aVar.c()));
        aVar2.A3(new bp.f(aVar.d()));
        aVar2.A3(new bp.f(aVar.e()));
    }

    public g(bp.a aVar) {
        float[] fArrCopyOf = Arrays.copyOf(aVar.s4(), 4);
        bp.a aVar2 = new bp.a();
        this.f86156a = aVar2;
        aVar2.A3(new bp.f(Math.min(fArrCopyOf[0], fArrCopyOf[2])));
        aVar2.A3(new bp.f(Math.min(fArrCopyOf[1], fArrCopyOf[3])));
        aVar2.A3(new bp.f(Math.max(fArrCopyOf[0], fArrCopyOf[2])));
        aVar2.A3(new bp.f(Math.max(fArrCopyOf[1], fArrCopyOf[3])));
    }
}
