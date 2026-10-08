package xm;

import eh.xe;
import eh.ye;
import java.util.concurrent.Executor;
import jg.r;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f219693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f219694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f219695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f219696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f219697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f219698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f219699g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f219700a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f219701b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f219702c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f219703d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f219704e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f219705f = 0.1f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Executor f219706g;

        public e a() {
            return new e(this.f219700a, this.f219701b, this.f219702c, this.f219703d, this.f219704e, this.f219705f, this.f219706g, null);
        }

        public a b(int i15) {
            this.f219702c = i15;
            return this;
        }

        public a c(int i15) {
            this.f219701b = i15;
            return this;
        }

        public a d(int i15) {
            this.f219700a = i15;
            return this;
        }

        public a e(float f15) {
            this.f219705f = f15;
            return this;
        }

        public a f(int i15) {
            this.f219703d = i15;
            return this;
        }
    }

    /* synthetic */ e(int i15, int i16, int i17, int i18, boolean z15, float f15, Executor executor, g gVar) {
        this.f219693a = i15;
        this.f219694b = i16;
        this.f219695c = i17;
        this.f219696d = i18;
        this.f219697e = z15;
        this.f219698f = f15;
        this.f219699g = executor;
    }

    public final float a() {
        return this.f219698f;
    }

    public final int b() {
        return this.f219695c;
    }

    public final int c() {
        return this.f219694b;
    }

    public final int d() {
        return this.f219693a;
    }

    public final int e() {
        return this.f219696d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.floatToIntBits(this.f219698f) == Float.floatToIntBits(eVar.f219698f) && r.a(Integer.valueOf(this.f219693a), Integer.valueOf(eVar.f219693a)) && r.a(Integer.valueOf(this.f219694b), Integer.valueOf(eVar.f219694b)) && r.a(Integer.valueOf(this.f219696d), Integer.valueOf(eVar.f219696d)) && r.a(Boolean.valueOf(this.f219697e), Boolean.valueOf(eVar.f219697e)) && r.a(Integer.valueOf(this.f219695c), Integer.valueOf(eVar.f219695c)) && r.a(this.f219699g, eVar.f219699g);
    }

    public final Executor f() {
        return this.f219699g;
    }

    public final boolean g() {
        return this.f219697e;
    }

    public int hashCode() {
        return r.b(Integer.valueOf(Float.floatToIntBits(this.f219698f)), Integer.valueOf(this.f219693a), Integer.valueOf(this.f219694b), Integer.valueOf(this.f219696d), Boolean.valueOf(this.f219697e), Integer.valueOf(this.f219695c), this.f219699g);
    }

    public String toString() {
        xe xeVarA = ye.a("FaceDetectorOptions");
        xeVarA.b("landmarkMode", this.f219693a);
        xeVarA.b("contourMode", this.f219694b);
        xeVarA.b("classificationMode", this.f219695c);
        xeVarA.b("performanceMode", this.f219696d);
        xeVarA.d("trackingEnabled", this.f219697e);
        xeVarA.a("minFaceSize", this.f219698f);
        return xeVarA.toString();
    }
}
