package h;

import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R \u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006+À\u0006\u0003"}, d2 = {"Lh/e;", "", "", "Lh/v;", "h", "()Ljava/util/List;", "", "d", "()Ljava/util/Set;", "cameraId", "Lh/x;", "a", "(Ljava/lang/String;)Lh/x;", "Lju/w0;", "Loq/i0;", "j", "()Lju/w0;", "Lh/m;", "cameraContext", "Lh/u;", "graphId", "Lh/s$b;", "graphConfig", "Ll/i;", "graphListener", "Lh/p1;", "streamGraph", "Lh/s1;", "surfaceTracker", "Lh/n;", "i", "(Lh/m;Lh/u;Lh/s$b;Ll/i;Lh/p1;Lh/s1;)Lh/n;", "Lh/k0;", "c", "(Lh/s$b;Ltq/e;)Ljava/lang/Object;", "Lh/g;", "f", "()Ljava/lang/String;", "id", "Lmu/g;", "g", "()Lmu/g;", "cameraIds", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {
    static /* synthetic */ Object e(e eVar, s.b bVar, tq.e<? super k0> eVar2) {
        return k0.c(k0.INSTANCE.b());
    }

    x a(String cameraId);

    default Object c(s.b bVar, tq.e<? super k0> eVar) {
        return e(this, bVar, eVar);
    }

    Set<Set<v>> d();

    String f();

    default mu.g<List<v>> g() {
        List<v> listH = h();
        if (listH == null) {
            listH = pq.v.n();
        }
        return mu.i.K(listH);
    }

    List<v> h();

    n i(m cameraContext, u graphId, s.b graphConfig, l.i graphListener, p1 streamGraph, s1 surfaceTracker);

    ju.w0<oq.i0> j();
}
