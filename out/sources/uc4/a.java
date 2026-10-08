package uc4;

import d72.HydroWarning;
import d72.HydroWarningArea;
import dx.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import tq.e;
import vq.d;
import xk0.BEHydroWarning;
import xk0.BEHydroWarningArea;
import zk0.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\bH\u0096@¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Luc4/a;", "Lc72/a;", "Lzk0/c;", "getHydroWarningsUC", "Lzk0/a;", "getHydroWarningAreasUC", "<init>", "(Lzk0/c;Lzk0/a;)V", "Ldx/i;", "Ldx/b;", "", "Ld72/c;", "b", "(Ltq/e;)Ljava/lang/Object;", "Ld72/b;", "a", "Lzk0/c;", "Lzk0/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements c72.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c getHydroWarningsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zk0.a getHydroWarningAreasUC;

    /* JADX INFO: renamed from: uc4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5132a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f197569d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f197571f;

        C5132a(e<? super C5132a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f197569d = obj;
            this.f197571f |= PKIFailureInfo.systemUnavail;
            return a.this.b(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f197572d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f197574f;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f197572d = obj;
            this.f197574f |= PKIFailureInfo.systemUnavail;
            return a.this.a(this);
        }
    }

    public a(c cVar, zk0.a aVar) {
        this.getHydroWarningsUC = cVar;
        this.getHydroWarningAreasUC = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // c72.a
    public Object a(e<? super i<? extends dx.b, ? extends List<HydroWarning>>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f197574f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f197574f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f197572d;
        Object objE = uq.b.e();
        int i16 = bVar.f197574f;
        if (i16 == 0) {
            u.b(objC);
            c cVar = this.getHydroWarningsUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            bVar.f197574f = 1;
            objC = cVar.c(c1792a, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List list = (List) ((i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(uc4.b.c((BEHydroWarning) it.next()));
        }
        return new i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // c72.a
    public Object b(e<? super i<? extends dx.b, ? extends List<HydroWarningArea>>> eVar) throws Throwable {
        C5132a c5132a;
        if (eVar instanceof C5132a) {
            c5132a = (C5132a) eVar;
            int i15 = c5132a.f197571f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5132a.f197571f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c5132a = new C5132a(eVar);
            }
        } else {
            c5132a = new C5132a(eVar);
        }
        Object objC = c5132a.f197569d;
        Object objE = uq.b.e();
        int i16 = c5132a.f197571f;
        if (i16 == 0) {
            u.b(objC);
            zk0.a aVar = this.getHydroWarningAreasUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            c5132a.f197571f = 1;
            objC = aVar.c(c1792a, c5132a);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List list = (List) ((i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(uc4.b.d((BEHydroWarningArea) it.next()));
        }
        return new i.Right(arrayList);
    }
}
