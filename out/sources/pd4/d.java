package pd4;

import java.util.Iterator;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import q34.w1;
import t10.m;
import vq.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lpd4/d;", "Lv64/h;", "Lt10/m;", "sharedPreferencesRegistry", "Lq34/w1;", "removeSchoolCardIfExistUC", "Lc54/b;", "isFeatureEnabledUseCase", "<init>", "(Lt10/m;Lq34/w1;Lc54/b;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lt10/m;", "b", "Lq34/w1;", "c", "Lc54/b;", "d", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements v64.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f157049e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m sharedPreferencesRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w1 removeSchoolCardIfExistUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f157053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f157054e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f157056g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f157054e = obj;
            this.f157056g |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(m mVar, w1 w1Var, c54.b bVar) {
        this.sharedPreferencesRegistry = mVar;
        this.removeSchoolCardIfExistUC = w1Var;
        this.isFeatureEnabledUseCase = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f157056g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f157056g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f157054e;
        Object objE = uq.b.e();
        int i16 = bVar.f157056g;
        if (i16 == 0) {
            u.b(obj);
            Iterator it = v.q("shared_prefs_dvocatecard", "shared_prefs_familycard", "shared_prefs_pensionercard", "shared_prefs_uutcard", "shared_prefs_elections_keys", "shared_prefs_wru", "air_quality_widget").iterator();
            while (it.hasNext()) {
                this.sharedPreferencesRegistry.b((String) it.next());
            }
            if (this.isFeatureEnabledUseCase.a(b54.c.MOB_DB_CONTAINERS).booleanValue()) {
                return i0.f148189a;
            }
            w1 w1Var = this.removeSchoolCardIfExistUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            bVar.f157053d = j.a(c1792a);
            bVar.f157056g = 1;
            if (w1Var.c(c1792a2, bVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return i0.f148189a;
    }
}
