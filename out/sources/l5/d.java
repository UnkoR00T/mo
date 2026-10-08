package l5;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d extends k5.e {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    protected float f116032q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Deprecated
    protected HashMap<String, Float> f116033r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Deprecated
    protected HashMap<String, Float> f116034s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Deprecated
    protected HashMap<String, Float> f116035t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private HashMap<String, Float> f116036u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private HashMap<String, Float> f116037v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    protected k5.g.a f116038w0;

    public d(k5.g gVar, k5.g.d dVar) {
        super(gVar, dVar);
        this.f116032q0 = 0.5f;
        this.f116033r0 = new HashMap<>();
        this.f116034s0 = new HashMap<>();
        this.f116035t0 = new HashMap<>();
        this.f116038w0 = k5.g.a.SPREAD;
    }

    float A0(String str) {
        HashMap<String, Float> map = this.f116036u0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.f116036u0.get(str).floatValue();
    }

    protected float B0(String str) {
        if (this.f116034s0.containsKey(str)) {
            return this.f116034s0.get(str).floatValue();
        }
        return 0.0f;
    }

    protected float C0(String str) {
        if (this.f116033r0.containsKey(str)) {
            return this.f116033r0.get(str).floatValue();
        }
        return -1.0f;
    }

    public d D0(k5.g.a aVar) {
        this.f116038w0 = aVar;
        return this;
    }

    public void w0(Object obj, float f15, float f16, float f17, float f18, float f19) {
        super.s0(obj);
        String string = obj.toString();
        if (!Float.isNaN(f15)) {
            this.f116033r0.put(string, Float.valueOf(f15));
        }
        if (!Float.isNaN(f16)) {
            this.f116034s0.put(string, Float.valueOf(f16));
        }
        if (!Float.isNaN(f17)) {
            this.f116035t0.put(string, Float.valueOf(f17));
        }
        if (!Float.isNaN(f18)) {
            if (this.f116036u0 == null) {
                this.f116036u0 = new HashMap<>();
            }
            this.f116036u0.put(string, Float.valueOf(f18));
        }
        if (Float.isNaN(f19)) {
            return;
        }
        if (this.f116037v0 == null) {
            this.f116037v0 = new HashMap<>();
        }
        this.f116037v0.put(string, Float.valueOf(f19));
    }

    public d x0(float f15) {
        this.f116032q0 = f15;
        return this;
    }

    float y0(String str) {
        HashMap<String, Float> map = this.f116037v0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.f116037v0.get(str).floatValue();
    }

    protected float z0(String str) {
        if (this.f116035t0.containsKey(str)) {
            return this.f116035t0.get(str).floatValue();
        }
        return 0.0f;
    }
}
