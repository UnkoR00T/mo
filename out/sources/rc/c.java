package rc;

import android.graphics.Bitmap;
import ed.g0;
import ed.h;
import ed.t;
import fr.q0;
import java.util.List;
import kc.BitmapImage;
import kc.n;
import kc.v;
import p071kotlin.Metadata;
import zc.Options;
import zc.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkc/n;", "image", "Lzc/n;", "options", "", "Lcd/a;", "transformations", "Led/t;", "logger", "Landroid/graphics/Bitmap;", "a", "(Lkc/n;Lzc/n;Ljava/util/List;Led/t;)Landroid/graphics/Bitmap;", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final Bitmap a(n nVar, Options options, List<? extends cd.a> list, t tVar) {
        if (nVar instanceof BitmapImage) {
            Bitmap bitmap = ((BitmapImage) nVar).getBitmap();
            Bitmap.Config configC = ed.b.c(bitmap);
            if (pq.n.f0(g0.f(), configC)) {
                return bitmap;
            }
            if (tVar != null) {
                t.a aVar = t.a.Info;
                if (tVar.a().compareTo(aVar) <= 0) {
                    tVar.b("EngineInterceptor", aVar, "Converting bitmap with config " + configC + " to apply transformations: " + list + ".", null);
                }
            }
        } else if (tVar != null) {
            t.a aVar2 = t.a.Info;
            if (tVar.a().compareTo(aVar2) <= 0) {
                tVar.b("EngineInterceptor", aVar2, "Converting image of type " + q0.c(nVar.getClass()).C() + " to apply transformations: " + list + ".", null);
            }
        }
        return h.f49463a.a(v.a(nVar, options.getContext().getResources()), zc.h.f(options), options.getSize(), options.getScale(), g.d(options), options.getPrecision() == ad.c.INEXACT);
    }
}
