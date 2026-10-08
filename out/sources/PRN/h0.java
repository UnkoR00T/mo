package PRN;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import v.SurfaceConfig;
import v.o3;
import v.p3;
import v.r3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0007J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0007J\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0007J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0007J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0007J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0007J\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b \u0010\u0007J%\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b&\u0010\u0007J%\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,R!\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0007R!\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u0010\u0007¨\u00064"}, d2 = {"LPRN/h0;", "", "<init>", "()V", "", "Lv/p3;", "n", "()Ljava/util/List;", "p", "m", "u", "k", "o", "x", "w", "l", "", "hardwareLevel", "", "isRawSupported", "isBurstCaptureSupported", "h", "(IZZ)Ljava/util/List;", "j", "q", "Landroid/util/Size;", "maxSupportedSize", "Lv/r3;", "surfaceSizeDefinition", "g", "(Landroid/util/Size;Lv/r3;)Ljava/util/List;", "i", "f", "Lv/q3$b;", "privSize", "jpegXSize", "e", "(Lv/q3$b;Lv/q3$b;)Ljava/util/List;", "v", "Lh/x;", "cameraMetadata", "Lx/a;", "videoStabilization", "t", "(Lh/x;Lx/a;)Ljava/util/List;", "b", "Loq/k;", "s", "QUERYABLE_VIC_FCQ_COMBINATIONS", "c", "r", "QUERYABLE_BAKLAVA_FCQ_COMBINATIONS", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f662a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final oq.k QUERYABLE_VIC_FCQ_COMBINATIONS = oq.l.a(new er.a() { // from class: PRN.f0
        @Override // er.a
        public final Object a() {
            return h0.d();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final oq.k QUERYABLE_BAKLAVA_FCQ_COMBINATIONS = oq.l.a(new er.a() { // from class: PRN.g0
        @Override // er.a
        public final Object a() {
            return h0.c();
        }
    });

    private h0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c() {
        return f662a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d() {
        return f662a.i();
    }

    private final List<p3> e(SurfaceConfig.b privSize, SurfaceConfig.b jpegXSize) {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, privSize, null, 4, null));
        p3Var.a(SurfaceConfig.Companion.b(companion, SurfaceConfig.d.JPEG, jpegXSize, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar, privSize, null, 4, null));
        p3Var2.a(SurfaceConfig.Companion.b(companion, SurfaceConfig.d.JPEG_R, jpegXSize, null, 4, null));
        arrayList.add(p3Var2);
        return arrayList;
    }

    private final List<p3> f() {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202797h;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar, SurfaceConfig.b.f202799k, null, 4, null));
        arrayList.add(p3Var2);
        p3 p3Var3 = new p3();
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar, SurfaceConfig.b.f202800l, null, 4, null));
        arrayList.add(p3Var3);
        p3 p3Var4 = new p3();
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var4.a(SurfaceConfig.Companion.b(companion, SurfaceConfig.d.YUV, bVar, null, 4, null));
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var4);
        return arrayList;
    }

    public static final List<p3> g(Size maxSupportedSize, r3 surfaceSizeDefinition) {
        ArrayList arrayList = new ArrayList();
        SurfaceConfig surfaceConfigE = SurfaceConfig.Companion.e(SurfaceConfig.INSTANCE, 34, maxSupportedSize, surfaceSizeDefinition, 0, null, null, 56, null);
        p3 p3Var = new p3();
        p3Var.a(surfaceConfigE);
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        p3Var2.a(surfaceConfigE);
        p3Var2.a(surfaceConfigE);
        arrayList.add(p3Var2);
        return arrayList;
    }

    public static final List<p3> h(int hardwareLevel, boolean isRawSupported, boolean isBurstCaptureSupported) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(n());
        if (hardwareLevel == 0 || hardwareLevel == 1 || hardwareLevel == 3 || hardwareLevel == 4) {
            arrayList.addAll(p());
        }
        if (hardwareLevel == 1 || hardwareLevel == 3) {
            arrayList.addAll(m());
        }
        if (isRawSupported) {
            arrayList.addAll(u());
        }
        if (isBurstCaptureSupported && hardwareLevel == 0) {
            arrayList.addAll(k());
        }
        if (hardwareLevel == 3) {
            arrayList.addAll(o());
        }
        return arrayList;
    }

    private final List<p3> i() {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202797h;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f202794e;
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        arrayList.add(p3Var2);
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f202804q;
        arrayList.addAll(e(bVar, bVar3));
        SurfaceConfig.b bVar4 = SurfaceConfig.b.f202800l;
        arrayList.addAll(e(bVar, bVar4));
        arrayList.addAll(e(bVar, SurfaceConfig.b.f202799k));
        arrayList.addAll(e(bVar, bVar));
        arrayList.addAll(e(bVar2, bVar3));
        arrayList.addAll(e(bVar2, bVar4));
        arrayList.addAll(e(bVar2, bVar));
        SurfaceConfig.b bVar5 = SurfaceConfig.b.f202793d;
        SurfaceConfig.b bVar6 = SurfaceConfig.b.f202803p;
        arrayList.addAll(e(bVar5, bVar6));
        arrayList.addAll(e(SurfaceConfig.b.f202796g, bVar6));
        return arrayList;
    }

    public static final List<p3> j() {
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202802n;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        oq.i0 i0Var = oq.i0.f148189a;
        p3 p3Var2 = new p3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        p3 p3Var3 = new p3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f202795f;
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar3, bVar, null, 4, null));
        p3 p3Var4 = new p3();
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        p3 p3Var5 = new p3();
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        p3 p3Var6 = new p3();
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f202801m;
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar, bVar3, null, 4, null));
        p3 p3Var7 = new p3();
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar, bVar3, null, 4, null));
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar2, bVar3, null, 4, null));
        p3 p3Var8 = new p3();
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar, bVar3, null, 4, null));
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar3, bVar3, null, 4, null));
        return pq.v.q(p3Var, p3Var2, p3Var3, p3Var4, p3Var5, p3Var6, p3Var7, p3Var8);
    }

    public static final List<p3> k() {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202795f;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f202802n;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        arrayList.add(p3Var2);
        p3 p3Var3 = new p3();
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        arrayList.add(p3Var3);
        return arrayList;
    }

    public static final List<p3> l() {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.YUV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202798j;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.PRIV;
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        arrayList.add(p3Var2);
        p3 p3Var3 = new p3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar3, bVar, null, 4, null));
        arrayList.add(p3Var3);
        p3 p3Var4 = new p3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f202794e;
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar3, bVar, null, 4, null));
        arrayList.add(p3Var4);
        p3 p3Var5 = new p3();
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar3, bVar, null, 4, null));
        arrayList.add(p3Var5);
        p3 p3Var6 = new p3();
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var6);
        p3 p3Var7 = new p3();
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        arrayList.add(p3Var7);
        p3 p3Var8 = new p3();
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var8);
        p3 p3Var9 = new p3();
        p3Var9.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var9.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        arrayList.add(p3Var9);
        return arrayList;
    }

    public static final List<p3> m() {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202795f;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f202802n;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        arrayList.add(p3Var2);
        p3 p3Var3 = new p3();
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        arrayList.add(p3Var3);
        p3 p3Var4 = new p3();
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var4.a(SurfaceConfig.Companion.b(companion, SurfaceConfig.d.JPEG, bVar2, null, 4, null));
        arrayList.add(p3Var4);
        p3 p3Var5 = new p3();
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f202792c;
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar2, bVar3, null, 4, null));
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        arrayList.add(p3Var5);
        p3 p3Var6 = new p3();
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar2, bVar3, null, 4, null));
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        arrayList.add(p3Var6);
        return arrayList;
    }

    public static final List<p3> n() {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202802n;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.JPEG;
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        arrayList.add(p3Var2);
        p3 p3Var3 = new p3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.YUV;
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar3, bVar, null, 4, null));
        arrayList.add(p3Var3);
        p3 p3Var4 = new p3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f202795f;
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        arrayList.add(p3Var4);
        p3 p3Var5 = new p3();
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar3, bVar2, null, 4, null));
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        arrayList.add(p3Var5);
        p3 p3Var6 = new p3();
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        arrayList.add(p3Var6);
        p3 p3Var7 = new p3();
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar3, bVar2, null, 4, null));
        arrayList.add(p3Var7);
        p3 p3Var8 = new p3();
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar3, bVar2, null, 4, null));
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        arrayList.add(p3Var8);
        return arrayList;
    }

    public static final List<p3> o() {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202795f;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f202792c;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f202802n;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar2, bVar3, null, 4, null));
        SurfaceConfig.d dVar3 = SurfaceConfig.d.RAW;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar3, bVar3, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        p3Var2.a(SurfaceConfig.Companion.b(companion, SurfaceConfig.d.JPEG, bVar3, null, 4, null));
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar3, bVar3, null, 4, null));
        arrayList.add(p3Var2);
        return arrayList;
    }

    public static final List<p3> p() {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202795f;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f202801m;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        arrayList.add(p3Var2);
        p3 p3Var3 = new p3();
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        arrayList.add(p3Var3);
        p3 p3Var4 = new p3();
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar, bVar2, null, 4, null));
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar3, bVar2, null, 4, null));
        arrayList.add(p3Var4);
        p3 p3Var5 = new p3();
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar3, bVar2, null, 4, null));
        arrayList.add(p3Var5);
        p3 p3Var6 = new p3();
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar3, SurfaceConfig.b.f202802n, null, 4, null));
        arrayList.add(p3Var6);
        return arrayList;
    }

    public static final List<p3> q() {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202798j;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        arrayList.add(p3Var2);
        p3 p3Var3 = new p3();
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f202802n;
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar3, bVar2, null, 4, null));
        arrayList.add(p3Var3);
        p3 p3Var4 = new p3();
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar3, bVar2, null, 4, null));
        arrayList.add(p3Var4);
        p3 p3Var5 = new p3();
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        arrayList.add(p3Var5);
        p3 p3Var6 = new p3();
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        arrayList.add(p3Var6);
        p3 p3Var7 = new p3();
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f202795f;
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar, bVar3, null, 4, null));
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var7);
        p3 p3Var8 = new p3();
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar2, bVar3, null, 4, null));
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var8);
        p3 p3Var9 = new p3();
        p3Var9.a(SurfaceConfig.Companion.b(companion, dVar, bVar3, null, 4, null));
        p3Var9.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        arrayList.add(p3Var9);
        p3 p3Var10 = new p3();
        p3Var10.a(SurfaceConfig.Companion.b(companion, dVar2, bVar3, null, 4, null));
        p3Var10.a(SurfaceConfig.Companion.b(companion, dVar2, bVar, null, 4, null));
        arrayList.add(p3Var10);
        return arrayList;
    }

    public static final List<p3> u() {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.RAW;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202802n;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f202795f;
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var2);
        p3 p3Var3 = new p3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.YUV;
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar3, bVar2, null, 4, null));
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var3);
        p3 p3Var4 = new p3();
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var4);
        p3 p3Var5 = new p3();
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar3, bVar2, null, 4, null));
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var5);
        p3 p3Var6 = new p3();
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar3, bVar2, null, 4, null));
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar3, bVar2, null, 4, null));
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var6);
        p3 p3Var7 = new p3();
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        SurfaceConfig.d dVar4 = SurfaceConfig.d.JPEG;
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar4, bVar, null, 4, null));
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var7);
        p3 p3Var8 = new p3();
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar3, bVar2, null, 4, null));
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar4, bVar, null, 4, null));
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var8);
        return arrayList;
    }

    public static final List<p3> w() {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.JPEG_R;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202802n;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        p3Var2.a(SurfaceConfig.Companion.b(companion, SurfaceConfig.d.PRIV, SurfaceConfig.b.f202795f, null, 4, null));
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        arrayList.add(p3Var2);
        return arrayList;
    }

    public static final List<p3> x() {
        ArrayList arrayList = new ArrayList();
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.YUV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202805r;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        SurfaceConfig.d dVar2 = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f202795f;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f202801m;
        p3Var.a(SurfaceConfig.Companion.b(companion, dVar2, bVar3, null, 4, null));
        arrayList.add(p3Var);
        p3 p3Var2 = new p3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar3, bVar, null, 4, null));
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var2.a(SurfaceConfig.Companion.b(companion, dVar2, bVar3, null, 4, null));
        arrayList.add(p3Var2);
        p3 p3Var3 = new p3();
        SurfaceConfig.d dVar4 = SurfaceConfig.d.RAW;
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar4, bVar, null, 4, null));
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var3.a(SurfaceConfig.Companion.b(companion, dVar2, bVar3, null, 4, null));
        arrayList.add(p3Var3);
        p3 p3Var4 = new p3();
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        SurfaceConfig.b bVar4 = SurfaceConfig.b.f202802n;
        p3Var4.a(SurfaceConfig.Companion.b(companion, dVar3, bVar4, null, 4, null));
        arrayList.add(p3Var4);
        p3 p3Var5 = new p3();
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar3, bVar, null, 4, null));
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var5.a(SurfaceConfig.Companion.b(companion, dVar3, bVar4, null, 4, null));
        arrayList.add(p3Var5);
        p3 p3Var6 = new p3();
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar4, bVar, null, 4, null));
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var6.a(SurfaceConfig.Companion.b(companion, dVar3, bVar4, null, 4, null));
        arrayList.add(p3Var6);
        p3 p3Var7 = new p3();
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var7.a(SurfaceConfig.Companion.b(companion, dVar, bVar4, null, 4, null));
        arrayList.add(p3Var7);
        p3 p3Var8 = new p3();
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar3, bVar, null, 4, null));
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var8.a(SurfaceConfig.Companion.b(companion, dVar, bVar4, null, 4, null));
        arrayList.add(p3Var8);
        p3 p3Var9 = new p3();
        p3Var9.a(SurfaceConfig.Companion.b(companion, dVar4, bVar, null, 4, null));
        p3Var9.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var9.a(SurfaceConfig.Companion.b(companion, dVar, bVar4, null, 4, null));
        arrayList.add(p3Var9);
        p3 p3Var10 = new p3();
        p3Var10.a(SurfaceConfig.Companion.b(companion, dVar, bVar, null, 4, null));
        p3Var10.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var10.a(SurfaceConfig.Companion.b(companion, dVar4, bVar4, null, 4, null));
        arrayList.add(p3Var10);
        p3 p3Var11 = new p3();
        p3Var11.a(SurfaceConfig.Companion.b(companion, dVar3, bVar, null, 4, null));
        p3Var11.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var11.a(SurfaceConfig.Companion.b(companion, dVar4, bVar4, null, 4, null));
        arrayList.add(p3Var11);
        p3 p3Var12 = new p3();
        p3Var12.a(SurfaceConfig.Companion.b(companion, dVar4, bVar, null, 4, null));
        p3Var12.a(SurfaceConfig.Companion.b(companion, dVar2, bVar2, null, 4, null));
        p3Var12.a(SurfaceConfig.Companion.b(companion, dVar4, bVar4, null, 4, null));
        arrayList.add(p3Var12);
        return arrayList;
    }

    public final List<p3> r() {
        return (List) QUERYABLE_BAKLAVA_FCQ_COMBINATIONS.getValue();
    }

    public final List<p3> s() {
        return (List) QUERYABLE_VIC_FCQ_COMBINATIONS.getValue();
    }

    public final List<p3> t(h.x cameraMetadata, x.a videoStabilization) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 35) {
            Object objJ = cameraMetadata.J(CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION);
            if (objJ == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iIntValue = ((Number) objJ).intValue();
            if (iIntValue >= 35 && videoStabilization != x.a.ON) {
                arrayList.addAll(s());
            }
            if (iIntValue >= 36 && videoStabilization != x.a.PREVIEW) {
                arrayList.addAll(r());
                return arrayList;
            }
        }
        return arrayList;
    }

    public final List<p3> v() {
        p3 p3Var = new p3();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
        SurfaceConfig.b bVar = SurfaceConfig.b.f202798j;
        o3 o3Var = o3.PREVIEW_VIDEO_STILL;
        p3Var.a(companion.a(dVar, bVar, o3Var));
        oq.i0 i0Var = oq.i0.f148189a;
        p3 p3Var2 = new p3();
        SurfaceConfig.d dVar2 = SurfaceConfig.d.YUV;
        p3Var2.a(companion.a(dVar2, bVar, o3Var));
        p3 p3Var3 = new p3();
        SurfaceConfig.b bVar2 = SurfaceConfig.b.f202801m;
        o3 o3Var2 = o3.VIDEO_RECORD;
        p3Var3.a(companion.a(dVar, bVar2, o3Var2));
        p3 p3Var4 = new p3();
        p3Var4.a(companion.a(dVar2, bVar2, o3Var2));
        p3 p3Var5 = new p3();
        SurfaceConfig.d dVar3 = SurfaceConfig.d.JPEG;
        SurfaceConfig.b bVar3 = SurfaceConfig.b.f202802n;
        o3 o3Var3 = o3.STILL_CAPTURE;
        p3Var5.a(companion.a(dVar3, bVar3, o3Var3));
        p3 p3Var6 = new p3();
        p3Var6.a(companion.a(dVar2, bVar3, o3Var3));
        p3 p3Var7 = new p3();
        SurfaceConfig.b bVar4 = SurfaceConfig.b.f202795f;
        o3 o3Var4 = o3.PREVIEW;
        p3Var7.a(companion.a(dVar, bVar4, o3Var4));
        p3Var7.a(companion.a(dVar3, bVar3, o3Var3));
        p3 p3Var8 = new p3();
        p3Var8.a(companion.a(dVar, bVar4, o3Var4));
        p3Var8.a(companion.a(dVar2, bVar3, o3Var3));
        p3 p3Var9 = new p3();
        p3Var9.a(companion.a(dVar, bVar4, o3Var4));
        p3Var9.a(companion.a(dVar, bVar2, o3Var2));
        p3 p3Var10 = new p3();
        p3Var10.a(companion.a(dVar, bVar4, o3Var4));
        p3Var10.a(companion.a(dVar2, bVar2, o3Var2));
        p3 p3Var11 = new p3();
        p3Var11.a(companion.a(dVar, bVar4, o3Var4));
        p3Var11.a(companion.a(dVar2, bVar4, o3Var4));
        p3 p3Var12 = new p3();
        p3Var12.a(companion.a(dVar, bVar4, o3Var4));
        p3Var12.a(companion.a(dVar, bVar2, o3Var2));
        p3Var12.a(companion.a(dVar3, bVar2, o3Var3));
        p3 p3Var13 = new p3();
        p3Var13.a(companion.a(dVar, bVar4, o3Var4));
        p3Var13.a(companion.a(dVar2, bVar2, o3Var2));
        p3Var13.a(companion.a(dVar3, bVar2, o3Var3));
        p3 p3Var14 = new p3();
        p3Var14.a(companion.a(dVar, bVar4, o3Var4));
        p3Var14.a(companion.a(dVar2, bVar4, o3Var4));
        p3Var14.a(companion.a(dVar3, bVar3, o3Var3));
        return pq.v.q(p3Var, p3Var2, p3Var3, p3Var4, p3Var5, p3Var6, p3Var7, p3Var8, p3Var9, p3Var10, p3Var11, p3Var12, p3Var13, p3Var14);
    }
}
