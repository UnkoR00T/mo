package gy0;

import android.content.Context;
import fy0.MeasurementPointEntity;
import kh0.BEExtendedMeasurementPoint;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.airquality.data.db.MeasurementPointsDatabase;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0097@¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lgy0/a;", "Lky0/a;", "Ldy0/a;", "dao", "Landroid/content/Context;", "context", "<init>", "(Ldy0/a;Landroid/content/Context;)V", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "b", "()V", "Lkh0/e;", "c", "Ldy0/a;", "Landroid/content/Context;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ky0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dy0.a dao;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: gy0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1775a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f78250d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f78252f;

        C1775a(e<? super C1775a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f78250d = obj;
            this.f78252f |= PKIFailureInfo.systemUnavail;
            return a.this.c(this);
        }
    }

    public a(dy0.a aVar, Context context) {
        this.dao = aVar;
        this.context = context;
    }

    @Override // ky0.a
    public Object a(e<? super i0> eVar) {
        Object objA = this.dao.a(eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    @Override // ky0.a
    @oq.a
    public void b() {
        MeasurementPointsDatabase.INSTANCE.a(this.context);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ky0.a
    @oq.a
    public Object c(e<? super BEExtendedMeasurementPoint> eVar) throws Throwable {
        C1775a c1775a;
        if (eVar instanceof C1775a) {
            c1775a = (C1775a) eVar;
            int i15 = c1775a.f78252f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1775a.f78252f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c1775a = new C1775a(eVar);
            }
        } else {
            c1775a = new C1775a(eVar);
        }
        Object objB = c1775a.f78250d;
        Object objE = uq.b.e();
        int i16 = c1775a.f78252f;
        if (i16 == 0) {
            u.b(objB);
            dy0.a aVar = this.dao;
            c1775a.f78252f = 1;
            objB = aVar.b(c1775a);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        MeasurementPointEntity measurementPointEntity = (MeasurementPointEntity) objB;
        if (measurementPointEntity != null) {
            return cy0.a.a(measurementPointEntity);
        }
        return null;
    }
}
