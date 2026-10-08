package e;

import android.hardware.camera2.CaptureRequest;
import h.Result3A;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u0017JA\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJA\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\fJ1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0002H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\tH'¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\u0006\u0010#\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\tH'¢\u0006\u0004\b&\u0010!JC\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010-0\t0\u000e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H'¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0012H¦@¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\nH&¢\u0006\u0004\b2\u00103ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00064À\u0006\u0003"}, d2 = {"Le/f2;", "", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "values", "Le/f2$a;", "type", "Lv/p1$c;", "optionPriority", "Lju/w0;", "Loq/i0;", "g", "(Ljava/util/Map;Le/f2$a;Lv/p1$c;)Lju/w0;", "l", "", "keys", "f", "(Ljava/util/List;Le/f2$a;)Lju/w0;", "", "isPrimary", "", "Lo/j2;", "runningUseCases", "a", "(ZLjava/util/Collection;)Lju/w0;", "Lv/p1;", "config", "", "tags", "m", "(Lv/p1;Ljava/util/Map;)Lju/w0;", "Lh/m1;", "i", "()Lju/w0;", "Lh/a;", "aeMode", "k", "(I)Lju/w0;", "e", "Lv/n1;", "captureSequence", "", "captureMode", "flashType", "flashMode", "Ljava/lang/Void;", "d", "(Ljava/util/List;III)Ljava/util/List;", "c", "(Ltq/e;)Ljava/lang/Object;", "close", "()V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Le/f2$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        SESSION_CONFIG,
        DEFAULT,
        CAMERA2_CAMERA_CONTROL;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f45797e = wq.b.a(b());

        public static wq.a<a> e() {
            return f45797e;
        }
    }

    static /* synthetic */ ju.w0 b(f2 f2Var, List list, a aVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeParametersAsync");
        }
        if ((i15 & 2) != 0) {
            aVar = a.DEFAULT;
        }
        return f2Var.f(list, aVar);
    }

    static /* synthetic */ ju.w0 h(f2 f2Var, Map map, a aVar, v.p1.c cVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setParametersAsync");
        }
        if ((i15 & 2) != 0) {
            aVar = a.DEFAULT;
        }
        if ((i15 & 4) != 0) {
            cVar = e2.a();
        }
        return f2Var.g(map, aVar, cVar);
    }

    static /* synthetic */ ju.w0 j(f2 f2Var, Map map, a aVar, v.p1.c cVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitParameters");
        }
        if ((i15 & 2) != 0) {
            aVar = a.DEFAULT;
        }
        if ((i15 & 4) != 0) {
            cVar = e2.a();
        }
        return f2Var.l(map, aVar, cVar);
    }

    ju.w0<oq.i0> a(boolean isPrimary, Collection<? extends o.j2> runningUseCases);

    Object c(tq.e<? super Boolean> eVar);

    void close();

    List<ju.w0<Void>> d(List<v.n1> captureSequence, int captureMode, int flashType, int flashMode);

    ju.w0<Result3A> e();

    ju.w0<oq.i0> f(List<? extends CaptureRequest.Key<?>> keys, a type);

    ju.w0<oq.i0> g(Map<CaptureRequest.Key<?>, ? extends Object> values, a type, v.p1.c optionPriority);

    ju.w0<Result3A> i();

    ju.w0<Result3A> k(int aeMode);

    ju.w0<oq.i0> l(Map<CaptureRequest.Key<?>, ? extends Object> values, a type, v.p1.c optionPriority);

    ju.w0<oq.i0> m(v.p1 config, Map<String, ? extends Object> tags);
}
