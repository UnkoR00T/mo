package qc;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ed.g0;
import kc.s;
import kc.v;
import p071kotlin.Metadata;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqc/h;", "Lqc/j;", "Landroid/graphics/drawable/Drawable;", "data", "Lzc/n;", "options", "<init>", "(Landroid/graphics/drawable/Drawable;Lzc/n;)V", "Lqc/i;", "a", "(Ltq/e;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "b", "Lzc/n;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Drawable data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqc/h$a;", "Lqc/j$a;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "data", "Lzc/n;", "options", "Lkc/s;", "imageLoader", "Lqc/j;", "b", "(Landroid/graphics/drawable/Drawable;Lzc/n;Lkc/s;)Lqc/j;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<Drawable> {
        @Override // qc.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(Drawable data, Options options, s imageLoader) {
            return new h(data, options);
        }
    }

    public h(Drawable drawable, Options options) {
        this.data = drawable;
        this.options = options;
    }

    @Override // qc.j
    public Object a(tq.e<? super i> eVar) {
        Drawable bitmapDrawable;
        boolean zJ = g0.j(this.data);
        if (zJ) {
            bitmapDrawable = new BitmapDrawable(this.options.getContext().getResources(), ed.h.f49463a.a(this.data, zc.h.f(this.options), this.options.getSize(), this.options.getScale(), zc.g.d(this.options), this.options.getPrecision() == ad.c.INEXACT));
        } else {
            bitmapDrawable = this.data;
        }
        return new ImageFetchResult(v.c(bitmapDrawable), zJ, oc.f.MEMORY);
    }
}
