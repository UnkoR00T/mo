package pc4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import uq2.PassportVisualization;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpc4/p6;", "", "<init>", "()V", "Lwc3/c;", "getPassportByNumberUC", "Lml0/c;", "fetchPassportsVisualizationUC", "Ltq2/a;", "a", "(Lwc3/c;Lml0/c;)Ltq2/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p6 f155462a = new p6();

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pc4/p6$a", "Ltq2/a;", "Liy/b0;", "passportNumber", "Ldx/i;", "Ldx/b;", "Luq2/g;", "b", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements tq2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wc3.c f155463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ml0.c f155464b;

        /* JADX INFO: renamed from: pc4.p6$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3855a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155465d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155467f;

            C3855a(tq.e<? super C3855a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155465d = obj;
                this.f155467f |= PKIFailureInfo.systemUnavail;
                return a.this.a(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155468d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f155469e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155471g;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155469e = obj;
                this.f155471g |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, this);
            }
        }

        a(wc3.c cVar, ml0.c cVar2) {
            this.f155463a = cVar;
            this.f155464b = cVar2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // tq2.a
        public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<PassportVisualization>>> eVar) throws Throwable {
            C3855a c3855a;
            if (eVar instanceof C3855a) {
                c3855a = (C3855a) eVar;
                int i15 = c3855a.f155467f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3855a.f155467f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3855a = new C3855a(eVar);
                }
            } else {
                c3855a = new C3855a(eVar);
            }
            Object objC = c3855a.f155465d;
            Object objE = uq.b.e();
            int i16 = c3855a.f155467f;
            if (i16 == 0) {
                oq.u.b(objC);
                ml0.c cVar = this.f155464b;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                c3855a.f155467f = 1;
                objC = cVar.c(c1792a, c3855a);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            List list = (List) ((dx.i.Right) iVar).b();
            ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q6.k((al0.PassportVisualization) it.next()));
            }
            return new dx.i.Right(arrayList);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // tq2.a
        public Object b(iy.b0 b0Var, tq.e<? super dx.i<? extends dx.b, PassportVisualization>> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f155471g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f155471g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f155469e;
            Object objE = uq.b.e();
            int i16 = bVar.f155471g;
            if (i16 == 0) {
                oq.u.b(objC);
                wc3.c cVar = this.f155463a;
                wc3.c.Params params = new wc3.c.Params(b0Var);
                bVar.f155468d = vq.j.a(b0Var);
                bVar.f155471g = 1;
                objC = cVar.c(params, bVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(q6.l((uc3.PassportVisualization) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
        }
    }

    private p6() {
    }

    public final tq2.a a(wc3.c getPassportByNumberUC, ml0.c fetchPassportsVisualizationUC) {
        return new a(getPassportByNumberUC, fetchPassportsVisualizationUC);
    }
}
