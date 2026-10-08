package qc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import ed.g0;
import fr.t;
import fu.r;
import kc.h0;
import kc.i0;
import kc.s;
import oc.u;
import p071kotlin.Metadata;
import pq.v;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqc/n;", "Lqc/j;", "Lkc/h0;", "data", "Lzc/n;", "options", "<init>", "(Lkc/h0;Lzc/n;)V", "", "b", "(Lkc/h0;)Ljava/lang/Void;", "Lqc/i;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lkc/h0;", "Lzc/n;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0 data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqc/n$a;", "Lqc/j$a;", "Lkc/h0;", "<init>", "()V", "data", "", "c", "(Lkc/h0;)Z", "Lzc/n;", "options", "Lkc/s;", "imageLoader", "Lqc/j;", "b", "(Lkc/h0;Lzc/n;Lkc/s;)Lqc/j;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<h0> {
        private final boolean c(h0 data) {
            return t.c(data.getScheme(), "android.resource");
        }

        @Override // qc.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(h0 data, Options options, s imageLoader) {
            if (c(data)) {
                return new n(data, options);
            }
            return null;
        }
    }

    public n(h0 h0Var, Options options) {
        this.data = h0Var;
        this.options = options;
    }

    private final Void b(h0 data) {
        throw new IllegalStateException("Invalid android.resource URI: " + data);
    }

    @Override // qc.j
    public Object a(tq.e<? super i> eVar) {
        Integer numU;
        String authority = this.data.getAuthority();
        if (authority != null) {
            if (r.t0(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) v.z0(i0.f(this.data));
                if (str == null || (numU = r.u(str)) == null) {
                    b(this.data);
                    throw new oq.g();
                }
                int iIntValue = numU.intValue();
                Context context = this.options.getContext();
                Resources resources = t.c(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                String strB = ed.v.f49487a.b(typedValue.string.toString());
                if (!t.c(strB, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new SourceFetchResult(oc.t.a(vv.v.c(vv.v.j(resources.openRawResource(iIntValue, typedValue2))), this.options.getFileSystem(), new u(authority, iIntValue, typedValue2.density)), strB, oc.f.DISK);
                }
                Drawable drawableC = t.c(authority, context.getPackageName()) ? ed.d.c(context, iIntValue) : ed.d.f(context, resources, iIntValue);
                boolean zJ = g0.j(drawableC);
                if (zJ) {
                    drawableC = new BitmapDrawable(context.getResources(), ed.h.f49463a.a(drawableC, zc.h.f(this.options), this.options.getSize(), this.options.getScale(), zc.g.d(this.options), this.options.getPrecision() == ad.c.INEXACT));
                }
                return new ImageFetchResult(kc.v.c(drawableC), zJ, oc.f.DISK);
            }
        }
        b(this.data);
        throw new oq.g();
    }
}
