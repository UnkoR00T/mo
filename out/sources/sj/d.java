package sj;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f181973c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile f f181974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f181975b = f181973c;

    private d(f fVar) {
        this.f181974a = fVar;
    }

    public static f a(f fVar) {
        fVar.getClass();
        return fVar instanceof d ? fVar : new d(fVar);
    }

    @Override // sj.f
    public final Object zza() {
        Object objZza;
        Object obj = this.f181975b;
        Object obj2 = f181973c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.f181975b;
                if (objZza == obj2) {
                    objZza = this.f181974a.zza();
                    Object obj3 = this.f181975b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f181975b = objZza;
                    this.f181974a = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return objZza;
    }
}
