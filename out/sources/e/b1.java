package e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import v.j3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Le/b1;", "Lr/a;", "Lh/x;", "cameraMetadata", "Lh/z;", "cameraPipe", "Landroidx/camera/camera2/compat/quirk/a;", "cameraQuirks", "<init>", "(Lh/x;Lh/z;Landroidx/camera/camera2/compat/quirk/a;)V", "Lv/j3;", "sessionConfig", "", "a", "(Lv/j3;)Z", "c", "Lh/x;", "d", "Lh/z;", "e", "Landroidx/camera/camera2/compat/quirk/a;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b1 implements r.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h.x cameraMetadata;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h.z cameraPipe;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.a cameraQuirks;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45715e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ x.CameraGraphCreationResult f45717g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x.CameraGraphCreationResult cameraGraphCreationResult, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f45717g = cameraGraphCreationResult;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f45715e;
            if (i15 == 0) {
                oq.u.b(obj);
                h.z zVar = b1.this.cameraPipe;
                h.s.b config = this.f45717g.getConfig();
                this.f45715e = 1;
                obj = zVar.c(config, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            x.CameraGraphCreationResult cameraGraphCreationResult = this.f45717g;
            h.k0 k0Var = (h.k0) obj;
            int value = k0Var.getValue();
            c cVar = c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = c.TRUNCATED_TAG;
                List<h.c0.a> listR = cameraGraphCreationResult.getConfig().r();
                ArrayList arrayList = new ArrayList(pq.v.y(listR, 10));
                Iterator<T> it = listR.iterator();
                while (it.hasNext()) {
                    List<h.e1.a> listB = ((h.c0.a) it.next()).b();
                    ArrayList arrayList2 = new ArrayList(pq.v.y(listB, 10));
                    for (h.e1.a aVar : listB) {
                        arrayList2.add("size=" + aVar.getSize() + ", format=" + ((Object) h.o1.i(aVar.getFormat())) + ", dynamicRangeProfile" + aVar.getDynamicRangeProfile());
                    }
                    arrayList.add(arrayList2);
                }
                h.k0.h(value);
                Objects.toString(cameraGraphCreationResult.getConfig().p());
                arrayList.toString();
            }
            return vq.b.a(h.k0.f(k0Var.getValue(), h.k0.INSTANCE.a()));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b1.this.new a(this.f45717g, eVar);
        }
    }

    public b1(h.x xVar, h.z zVar, androidx.camera.camera2.compat.quirk.a aVar) {
        this.cameraMetadata = xVar;
        this.cameraPipe = zVar;
        this.cameraQuirks = aVar;
    }

    @Override // r.a
    public boolean a(j3 sessionConfig) {
        return ((Boolean) ju.j.b(null, new a(x.b(new x(new v(), new u0(), new d.m(this.cameraMetadata.getCamera(), null), this.cameraQuirks, new PRN.e1(), new c.i0(this.cameraQuirks.b()), this.cameraMetadata, null, null, MLKEMEngine.KyberPolyBytes, null), h.s.e.INSTANCE.d(), sessionConfig, true, null, null, null, null, 120, null), null), 1, null)).booleanValue();
    }
}
