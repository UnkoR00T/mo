package z60;

import dx.k;
import er.l;
import eu.h;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lz60/b;", "PREVIEW_VALUE", "", "Lhy/a;", "<init>", "()V", "Leu/h;", "e", "()Leu/h;", "values", "Lz60/c;", "d", "screenShotTestValues", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b<PREVIEW_VALUE> implements hy.a {
    public b() {
        xw.c.f221622a.c(new k(v.n()), new qz.a());
        c70.a.f23835a.b(false, new yw.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(DSScreenShotTestData dSScreenShotTestData) {
        return dSScreenShotTestData.a();
    }

    @Override // hy.a
    public /* bridge */ Label a(String str) {
        return super.a(str);
    }

    public abstract h<DSScreenShotTestData<PREVIEW_VALUE>> d();

    public h<PREVIEW_VALUE> e() {
        return eu.k.H(d(), new l() { // from class: z60.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.c((DSScreenShotTestData) obj);
            }
        });
    }
}
