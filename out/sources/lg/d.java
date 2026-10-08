package lg;

import android.content.Context;
import ig.p;
import ig.s;
import jg.w;
import jg.y;
import jg.z;
import vh.l;
import vh.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends hg.e implements y {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final hg.a.g f118185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final hg.a.AbstractC1948a f118186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final hg.a f118187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f118188o = 0;

    static {
        hg.a.g gVar = new hg.a.g();
        f118185l = gVar;
        b bVar = new b();
        f118186m = bVar;
        f118187n = new hg.a("ClientTelemetry.API", bVar, gVar);
    }

    public d(Context context, z zVar) {
        super(context, (hg.a<z>) f118187n, zVar, hg.e.a.f84312c);
    }

    @Override // jg.y
    public final l<Void> g(final w wVar) {
        s.a aVarA = s.a();
        aVarA.d(vg.d.f206695a);
        aVarA.c(false);
        aVarA.b(new p() { // from class: lg.c
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ig.p
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i15 = d.f118188o;
                ((a) ((e) obj).A()).o3(wVar);
                ((m) obj2).c(null);
            }
        });
        return o(aVarA.a());
    }
}
