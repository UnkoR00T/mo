package zt;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zs.f f237217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fu.o f237218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection<zs.f> f237219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final er.l<vr.z, String> f237220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f[] f237221e;

    static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f237222a = new a();

        a() {
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(vr.z zVar) {
            return null;
        }
    }

    static final class b implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f237223a = new b();

        b() {
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(vr.z zVar) {
            return null;
        }
    }

    static final class c implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f237224a = new c();

        c() {
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(vr.z zVar) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(zs.f fVar, fu.o oVar, Collection<zs.f> collection, er.l<? super vr.z, String> lVar, f... fVarArr) {
        this.f237217a = fVar;
        this.f237218b = oVar;
        this.f237219c = collection;
        this.f237220d = lVar;
        this.f237221e = fVarArr;
    }

    public final g a(vr.z zVar) {
        for (f fVar : this.f237221e) {
            String strB = fVar.b(zVar);
            if (strB != null) {
                return new g.b(strB);
            }
        }
        String strB2 = this.f237220d.b(zVar);
        return strB2 != null ? new g.b(strB2) : g.c.f237216b;
    }

    public final boolean b(vr.z zVar) {
        if (this.f237217a != null && !fr.t.c(zVar.getName(), this.f237217a)) {
            return false;
        }
        if (this.f237218b != null) {
            if (!this.f237218b.f(zVar.getName().e())) {
                return false;
            }
        }
        Collection<zs.f> collection = this.f237219c;
        return collection == null || collection.contains(zVar.getName());
    }

    public /* synthetic */ h(zs.f fVar, f[] fVarArr, er.l lVar, int i15, fr.k kVar) {
        this(fVar, fVarArr, (er.l<? super vr.z, String>) ((i15 & 4) != 0 ? a.f237222a : lVar));
    }

    public h(zs.f fVar, f[] fVarArr, er.l<? super vr.z, String> lVar) {
        this(fVar, (fu.o) null, (Collection<zs.f>) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public /* synthetic */ h(fu.o oVar, f[] fVarArr, er.l lVar, int i15, fr.k kVar) {
        this(oVar, fVarArr, (er.l<? super vr.z, String>) ((i15 & 4) != 0 ? b.f237223a : lVar));
    }

    public h(fu.o oVar, f[] fVarArr, er.l<? super vr.z, String> lVar) {
        this((zs.f) null, oVar, (Collection<zs.f>) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, er.l lVar, int i15, fr.k kVar) {
        this((Collection<zs.f>) collection, fVarArr, (er.l<? super vr.z, String>) ((i15 & 4) != 0 ? c.f237224a : lVar));
    }

    public h(Collection<zs.f> collection, f[] fVarArr, er.l<? super vr.z, String> lVar) {
        this((zs.f) null, (fu.o) null, collection, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
