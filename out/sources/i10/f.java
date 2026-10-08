package i10;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import lu.w;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Li10/f;", "T", "", "Landroid/content/Context;", "context", "", "sensorType", "<init>", "(Landroid/content/Context;I)V", "", "values", "h", "([F)Ljava/lang/Object;", "Lmu/g;", "f", "()Lmu/g;", "a", "Landroid/content/Context;", "b", "I", "Landroid/hardware/SensorManager;", "c", "Loq/k;", "g", "()Landroid/hardware/SensorManager;", "sensorManager", "sensor_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int sensorType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k sensorManager = oq.l.a(new er.a() { // from class: i10.d
        @Override // er.a
        public final Object a() {
            return f.i(this.f88121a);
        }
    });

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Llu/w;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<w<? super T>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f88127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f88128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f88129g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f<T> f88130h;

        /* JADX INFO: renamed from: i10.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"i10/f$a$a", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", "event", "Loq/i0;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "sensor_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C2072a implements SensorEventListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f<T> f88131a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w<T> f88132b;

            /* JADX WARN: Multi-variable type inference failed */
            C2072a(f<T> fVar, w<? super T> wVar) {
                this.f88131a = fVar;
                this.f88132b = wVar;
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent event) {
                Sensor sensor;
                if (event == null || (sensor = event.sensor) == null || sensor.getType() != ((f) this.f88131a).sensorType) {
                    return;
                }
                this.f88132b.d(this.f88131a.h(event.values));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<T> fVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f88130h = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(f fVar, C2072a c2072a) {
            fVar.g().unregisterListener(c2072a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            w wVar = (w) this.f88129g;
            Object objE = uq.b.e();
            int i15 = this.f88128f;
            if (i15 == 0) {
                u.b(obj);
                final C2072a c2072a = new C2072a(this.f88130h, wVar);
                this.f88130h.g().registerListener(c2072a, this.f88130h.g().getDefaultSensor(((f) this.f88130h).sensorType), 2);
                final f<T> fVar = this.f88130h;
                er.a aVar = new er.a() { // from class: i10.e
                    @Override // er.a
                    public final Object a() {
                        return f.a.O(fVar, c2072a);
                    }
                };
                this.f88129g = vq.j.a(wVar);
                this.f88127e = vq.j.a(c2072a);
                this.f88128f = 1;
                if (lu.u.b(wVar, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(w<? super T> wVar, tq.e<? super i0> eVar) {
            return ((a) v(wVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f88130h, eVar);
            aVar.f88129g = obj;
            return aVar;
        }
    }

    public f(Context context, int i15) {
        this.context = context;
        this.sensorType = i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SensorManager g() {
        return (SensorManager) this.sensorManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SensorManager i(f fVar) {
        return (SensorManager) fVar.context.getSystemService("sensor");
    }

    protected final mu.g<T> f() {
        return mu.i.e(new a(this, null));
    }

    protected abstract T h(float[] values);
}
