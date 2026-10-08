package y;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rational f222435a = new Rational(4, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rational f222436b = new Rational(3, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rational f222437c = new Rational(16, 9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Rational f222438d = new Rational(9, 16);

    /* JADX INFO: renamed from: y.a$a, reason: collision with other inner class name */
    public static final class C5950a implements Comparator<Rational> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rational f222439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RectF f222440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rational f222441c;

        public C5950a(Rational rational, Rational rational2) {
            this.f222439a = rational;
            this.f222441c = rational2 == null ? new Rational(4, 3) : rational2;
            this.f222440b = d(rational);
        }

        private float b(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        private float c(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        private RectF d(Rational rational) {
            if (rational.floatValue() == this.f222441c.floatValue()) {
                return new RectF(0.0f, 0.0f, this.f222441c.getNumerator(), this.f222441c.getDenominator());
            }
            return rational.floatValue() > this.f222441c.floatValue() ? new RectF(0.0f, 0.0f, this.f222441c.getNumerator(), (rational.getDenominator() * this.f222441c.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * this.f222441c.getDenominator()) / rational.getDenominator(), this.f222441c.getDenominator());
        }

        private boolean e(RectF rectF, RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF rectFD = d(rational);
            RectF rectFD2 = d(rational2);
            boolean zE = e(rectFD, this.f222440b);
            boolean zE2 = e(rectFD2, this.f222440b);
            if (zE && zE2) {
                return (int) Math.signum(b(rectFD) - b(rectFD2));
            }
            if (zE) {
                return -1;
            }
            if (zE2) {
                return 1;
            }
            return -((int) Math.signum(c(rectFD, this.f222440b) - c(rectFD2, this.f222440b)));
        }
    }

    public static boolean a(Size size, Rational rational) {
        return b(size, rational, f0.d.f54494c);
    }

    public static boolean b(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (f0.d.b(size) >= f0.d.b(size2)) {
            return c(size, rational);
        }
        return false;
    }

    private static boolean c(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i15 = width % 16;
        if (i15 == 0 && height % 16 == 0) {
            return d(Math.max(0, height + (-16)), width, rational) || d(Math.max(0, width + (-16)), height, rational2);
        }
        if (i15 == 0) {
            return d(height, width, rational);
        }
        if (height % 16 == 0) {
            return d(width, height, rational2);
        }
        return false;
    }

    private static boolean d(int i15, int i16, Rational rational) {
        i6.i.a(i16 % 16 == 0);
        double numerator = ((double) (i15 * rational.getNumerator())) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i16 + (-16))) && numerator < ((double) (i16 + 16));
    }
}
