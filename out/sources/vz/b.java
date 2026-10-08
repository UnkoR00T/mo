package vz;

import android.util.Size;
import androidx.camera.core.g;
import androidx.camera.view.m;
import fr.t;
import o.m1;
import o.s;
import o.t0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import sx.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvz/b;", "", "Ltz/a;", "analyzerFactory", "<init>", "(Ltz/a;)V", "T", "Landroidx/camera/view/m;", "previewView", "Lsx/b$a;", "mode", "Lvz/d;", "b", "(Landroidx/camera/view/m;Lsx/b$a;)Lvz/d;", "Lsx/d;", "lensSide", "Lo/s;", "a", "(Lsx/d;)Lo/s;", "Lsx/b;", "Lvz/a;", "c", "(Landroidx/camera/view/m;Lsx/b;)Lvz/a;", "Ltz/a;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tz.a analyzerFactory;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f208713a;

        static {
            int[] iArr = new int[sx.d.values().length];
            try {
                iArr[sx.d.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sx.d.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f208713a = iArr;
        }
    }

    public b(tz.a aVar) {
        this.analyzerFactory = aVar;
    }

    private final <T> d<T> b(m previewView, sx.b.Analyzer mode) {
        j0.c cVarA = new j0.c.a().f(new j0.d(new Size(previewView.getWidth(), previewView.getHeight()), 1)).a();
        g gVarE = new g.c().h(0).l(cVarA).e();
        t0 t0VarE = new t0.b().h(1).l(cVarA).e();
        m1 m1VarE = new m1.a().e();
        m1VarE.t0(previewView.getSurfaceProvider());
        i0 i0Var = i0.f148189a;
        return new d<>(mode, gVarE, t0VarE, m1VarE, this.analyzerFactory.a(mode));
    }

    public final s a(sx.d lensSide) {
        int i15 = a.f208713a[lensSide.ordinal()];
        int i16 = 1;
        if (i15 == 1) {
            i16 = 0;
        } else if (i15 != 2) {
            throw new p();
        }
        return new s.a().d(i16).b();
    }

    public final vz.a c(m previewView, sx.b mode) {
        if (!(mode instanceof sx.b.Analyzer)) {
            throw new p();
        }
        sx.b.Analyzer analyzer = (sx.b.Analyzer) mode;
        e scannerType = analyzer.getScannerType();
        if ((scannerType instanceof e.QrScanner) || t.c(scannerType, e.c.f185178a) || (scannerType instanceof e.SingleQrScanner)) {
            return b(previewView, analyzer);
        }
        if (t.c(scannerType, e.b.f185177a)) {
            return b(previewView, analyzer);
        }
        throw new p();
    }
}
