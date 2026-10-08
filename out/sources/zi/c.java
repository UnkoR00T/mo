package zi;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: loaded from: classes4.dex */
public interface c {

    public static class b implements TypeEvaluator<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f235317b = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f235318a = new e();

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f15, e eVar, e eVar2) {
            this.f235318a.a(fj.a.d(eVar.f235321a, eVar2.f235321a, f15), fj.a.d(eVar.f235322b, eVar2.f235322b, f15), fj.a.d(eVar.f235323c, eVar2.f235323c, f15));
            return this.f235318a;
        }
    }

    /* JADX INFO: renamed from: zi.c$c, reason: collision with other inner class name */
    public static class C6348c extends Property<c, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<c, e> f235319a = new C6348c("circularReveal");

        private C6348c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c cVar, e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    public static class d extends Property<c, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<c, Integer> f235320a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f235321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f235322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f235323c;

        public void a(float f15, float f16, float f17) {
            this.f235321a = f15;
            this.f235322b = f16;
            this.f235323c = f17;
        }

        private e() {
        }

        public e(float f15, float f16, float f17) {
            this.f235321a = f15;
            this.f235322b = f16;
            this.f235323c = f17;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i15);

    void setRevealInfo(e eVar);
}
