package wc3;

import fr.t;
import iy.c0;
import java.util.Iterator;
import java.util.List;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import uc3.GroupedPassports;
import uc3.PassportVisualization;
import uc3.PassportsData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwc3/d;", "Lwc3/c;", "Lwc3/e;", "getPassportUC", "<init>", "(Lwc3/e;)V", "Lwc3/c$a;", "params", "Ldx/i;", "Ldx/b;", "Luc3/h;", "d", "(Lwc3/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lwc3/e;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e getPassportUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f212091e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f212093g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212091e = obj;
            this.f212093g |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(e eVar) {
        this.getPassportUC = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(c.Params params, tq.e<? super dx.i<? extends dx.b, PassportVisualization>> eVar) throws Throwable {
        a aVar;
        GroupedPassports groupedPassports;
        List<PassportVisualization> listA;
        Object next;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f212093g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f212093g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f212091e;
        Object objE = uq.b.e();
        int i16 = aVar.f212093g;
        if (i16 == 0) {
            u.b(objA);
            e eVar2 = this.getPassportUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f212090d = params;
            aVar.f212093g = 1;
            objA = eVar2.a(c1792a, aVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (c.Params) aVar.f212090d;
            u.b(objA);
        }
        dx.i iVar = (dx.i) objA;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        PassportsData passportsData = (PassportsData) ((dx.i.Right) iVar).b();
        if (passportsData != null && (groupedPassports = passportsData.getGroupedPassports()) != null && (listA = groupedPassports.a()) != null) {
            Iterator<T> it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!t.c(c0.e(((PassportVisualization) next).getNumber()), c0.e(params.getPassportNumber())));
            PassportVisualization passportVisualization = (PassportVisualization) next;
            if (passportVisualization != null) {
                return new dx.i.Right(passportVisualization);
            }
        }
        return new dx.i.Left(new dx.b.Generic(new IllegalStateException("There is no saved passport with this number")));
    }
}
