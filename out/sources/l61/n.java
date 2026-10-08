package l61;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll61/n;", "Lgz/b;", "Lgz/b$a$a;", "", "Le61/b;", "repository", "Lez/b;", "dateCalculator", "<init>", "(Le61/b;Lez/b;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Le61/b;", "b", "Lez/b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements gz.b<gz.b.a.C1792a, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e61.b repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.b dateCalculator;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f116450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f116451e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f116453g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f116451e = obj;
            this.f116453g |= PKIFailureInfo.systemUnavail;
            return n.this.a(null, this);
        }
    }

    public n(e61.b bVar, ez.b bVar2) {
        this.repository = bVar;
        this.dateCalculator = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        boolean z15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f116453g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f116453g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objZ = aVar.f116451e;
        Object objE = uq.b.e();
        int i16 = aVar.f116453g;
        if (i16 == 0) {
            oq.u.b(objZ);
            mu.g<String> gVarB = this.repository.b();
            aVar.f116450d = vq.j.a(c1792a);
            aVar.f116453g = 1;
            objZ = mu.i.z(gVarB, aVar);
            if (objZ == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objZ);
        }
        if (((String) objZ).length() <= 0) {
            objZ = null;
        }
        String str = (String) objZ;
        if (str != null) {
            ez.b bVar = this.dateCalculator;
            long j15 = Long.parseLong(str);
            gu.b.Companion companion = gu.b.INSTANCE;
            z15 = !bVar.d(j15, gu.d.q(1, gu.e.DAYS));
        } else {
            z15 = false;
        }
        return vq.b.a(z15);
    }
}
