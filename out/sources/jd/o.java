package jd;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import fd.a0;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR$\u0010\u001a\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u000bR \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000b¨\u0006'"}, d2 = {"Ljd/o;", "", "Lfd/a0;", "drawable", "Loq/i0;", "a", "(Lfd/a0;)V", "b", "", "Ljd/q;", "", "Ljava/util/List;", "intProperties", "Landroid/graphics/PointF;", "pointFProperties", "", "c", "floatProperties", "Lud/d;", "d", "scaleProperties", "Landroid/graphics/ColorFilter;", "e", "colorFilterProperties", "", "f", "intArrayProperties", "Landroid/graphics/Typeface;", "g", "typefaceProperties", "Landroid/graphics/Bitmap;", "h", "bitmapProperties", "", "i", "charSequenceProperties", "Landroid/graphics/Path;", "j", "pathProperties", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<q<Integer>> intProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<q<PointF>> pointFProperties;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<q<Float>> floatProperties;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<q<ud.d>> scaleProperties;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<q<ColorFilter>> colorFilterProperties;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<q<Object[]>> intArrayProperties;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<q<Typeface>> typefaceProperties;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<q<Bitmap>> bitmapProperties;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<q<CharSequence>> charSequenceProperties;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<q<Path>> pathProperties;

    public final void a(a0 drawable) {
        Iterator<T> it = this.intProperties.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            drawable.i(qVar.getKeyPath(), qVar.c(), p.b(qVar.a()));
        }
        Iterator<T> it4 = this.pointFProperties.iterator();
        while (it4.hasNext()) {
            q qVar2 = (q) it4.next();
            drawable.i(qVar2.getKeyPath(), qVar2.c(), p.b(qVar2.a()));
        }
        Iterator<T> it5 = this.floatProperties.iterator();
        while (it5.hasNext()) {
            q qVar3 = (q) it5.next();
            drawable.i(qVar3.getKeyPath(), qVar3.c(), p.b(qVar3.a()));
        }
        Iterator<T> it6 = this.scaleProperties.iterator();
        while (it6.hasNext()) {
            q qVar4 = (q) it6.next();
            drawable.i(qVar4.getKeyPath(), qVar4.c(), p.b(qVar4.a()));
        }
        Iterator<T> it7 = this.colorFilterProperties.iterator();
        while (it7.hasNext()) {
            q qVar5 = (q) it7.next();
            drawable.i(qVar5.getKeyPath(), qVar5.c(), p.b(qVar5.a()));
        }
        Iterator<T> it8 = this.intArrayProperties.iterator();
        while (it8.hasNext()) {
            q qVar6 = (q) it8.next();
            drawable.i(qVar6.getKeyPath(), qVar6.c(), p.b(qVar6.a()));
        }
        Iterator<T> it9 = this.typefaceProperties.iterator();
        while (it9.hasNext()) {
            q qVar7 = (q) it9.next();
            drawable.i(qVar7.getKeyPath(), qVar7.c(), p.b(qVar7.a()));
        }
        Iterator<T> it10 = this.bitmapProperties.iterator();
        while (it10.hasNext()) {
            q qVar8 = (q) it10.next();
            drawable.i(qVar8.getKeyPath(), qVar8.c(), p.b(qVar8.a()));
        }
        Iterator<T> it11 = this.charSequenceProperties.iterator();
        while (it11.hasNext()) {
            q qVar9 = (q) it11.next();
            drawable.i(qVar9.getKeyPath(), qVar9.c(), p.b(qVar9.a()));
        }
        Iterator<T> it12 = this.pathProperties.iterator();
        while (it12.hasNext()) {
            q qVar10 = (q) it12.next();
            drawable.i(qVar10.getKeyPath(), qVar10.c(), p.b(qVar10.a()));
        }
    }

    public final void b(a0 drawable) {
        Iterator<T> it = this.intProperties.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            drawable.i(qVar.getKeyPath(), qVar.c(), null);
        }
        Iterator<T> it4 = this.pointFProperties.iterator();
        while (it4.hasNext()) {
            q qVar2 = (q) it4.next();
            drawable.i(qVar2.getKeyPath(), qVar2.c(), null);
        }
        Iterator<T> it5 = this.floatProperties.iterator();
        while (it5.hasNext()) {
            q qVar3 = (q) it5.next();
            drawable.i(qVar3.getKeyPath(), qVar3.c(), null);
        }
        Iterator<T> it6 = this.scaleProperties.iterator();
        while (it6.hasNext()) {
            q qVar4 = (q) it6.next();
            drawable.i(qVar4.getKeyPath(), qVar4.c(), null);
        }
        Iterator<T> it7 = this.colorFilterProperties.iterator();
        while (it7.hasNext()) {
            q qVar5 = (q) it7.next();
            drawable.i(qVar5.getKeyPath(), qVar5.c(), null);
        }
        Iterator<T> it8 = this.intArrayProperties.iterator();
        while (it8.hasNext()) {
            q qVar6 = (q) it8.next();
            drawable.i(qVar6.getKeyPath(), qVar6.c(), null);
        }
        Iterator<T> it9 = this.typefaceProperties.iterator();
        while (it9.hasNext()) {
            q qVar7 = (q) it9.next();
            drawable.i(qVar7.getKeyPath(), qVar7.c(), null);
        }
        Iterator<T> it10 = this.bitmapProperties.iterator();
        while (it10.hasNext()) {
            q qVar8 = (q) it10.next();
            drawable.i(qVar8.getKeyPath(), qVar8.c(), null);
        }
        Iterator<T> it11 = this.charSequenceProperties.iterator();
        while (it11.hasNext()) {
            q qVar9 = (q) it11.next();
            drawable.i(qVar9.getKeyPath(), qVar9.c(), null);
        }
        Iterator<T> it12 = this.pathProperties.iterator();
        while (it12.hasNext()) {
            q qVar10 = (q) it12.next();
            drawable.i(qVar10.getKeyPath(), qVar10.c(), null);
        }
    }
}
