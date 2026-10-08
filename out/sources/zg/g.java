package zg;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends hg.e implements kh.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final hg.a.g f235073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final hg.a f235074m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f235075n;

    static {
        hg.a.g gVar = new hg.a.g();
        f235073l = gVar;
        f235074m = new hg.a("LocationServices.API", new d(), gVar);
        f235075n = new Object();
    }

    public g(Context context) {
        super(context, (hg.a<hg.a.d.c>) f235074m, hg.a.d.f84298a, hg.e.a.f84312c);
    }

    private final vh.l D(final LocationRequest locationRequest, ig.j jVar) {
        final f fVar = new f(this, jVar, m.f235095a);
        return q(ig.o.a().b(new ig.p() { // from class: zg.k
            @Override // ig.p
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                hg.a aVar = g.f235074m;
                ((e0) obj).m0(fVar, locationRequest, (vh.m) obj2);
            }
        }).f(fVar).g(jVar).e(2436).a());
    }

    @Override // kh.c
    public final vh.l<Location> a(kh.a aVar, vh.a aVar2) {
        if (aVar2 != null) {
            jg.s.b(!aVar2.a(), "cancellationToken may not be already canceled");
        }
        vh.l<Location> lVarP = p(ig.s.a().b(new h(aVar, aVar2)).e(2415).a());
        if (aVar2 == null) {
            return lVarP;
        }
        vh.m mVar = new vh.m(aVar2);
        lVarP.i(new i(mVar));
        return mVar.a();
    }

    @Override // kh.c
    public final vh.l<Location> c(int i15, vh.a aVar) {
        kh.a.C2669a c2669a = new kh.a.C2669a();
        c2669a.c(i15);
        kh.a aVarA = c2669a.a();
        if (aVar != null) {
            jg.s.b(!aVar.a(), "cancellationToken may not be already canceled");
        }
        vh.l<Location> lVarP = p(ig.s.a().b(new h(aVarA, aVar)).e(2415).a());
        if (aVar == null) {
            return lVarP;
        }
        vh.m mVar = new vh.m(aVar);
        lVarP.i(new i(mVar));
        return mVar.a();
    }

    @Override // kh.c
    public final vh.l<Void> h(kh.e eVar) {
        return r(ig.k.c(eVar, kh.e.class.getSimpleName()), 2418).h(o.f235098a, l.f235094a);
    }

    @Override // kh.c
    public final vh.l<Void> j(LocationRequest locationRequest, kh.e eVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            jg.s.m(looper, "invalid null looper");
        }
        return D(locationRequest, ig.k.a(eVar, looper, kh.e.class.getSimpleName()));
    }

    @Override // kh.c
    public final vh.l<LocationAvailability> k() {
        return p(ig.s.a().b(j.f235085a).e(2416).a());
    }

    @Override // hg.e
    protected final String t(Context context) {
        return null;
    }
}
