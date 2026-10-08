package x20;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class a implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f216508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Sensor f216509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o[] f216510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f216511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o f216512e;

    public a(Context context) {
        o[] oVarArr = new o[20];
        this.f216510c = oVarArr;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f216508a = sensorManager;
        if (sensorManager != null) {
            this.f216509b = sensorManager.getDefaultSensor(1);
            Arrays.fill(oVarArr, o.f216568d);
        }
    }

    public o a() {
        return this.f216512e == null ? o.f216568d : this.f216512e;
    }

    public void b() {
        this.f216508a.registerListener(this, this.f216509b, 1);
    }

    public void c() {
        this.f216508a.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i15) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int i15 = this.f216511d % 20;
        o[] oVarArr = this.f216510c;
        this.f216511d = i15 + 1;
        float[] fArr = sensorEvent.values;
        oVarArr[i15] = new o(fArr[0], fArr[1], fArr[2]);
        this.f216512e = o.b(this.f216510c);
    }
}
