package pc4;

import f43.ChildStudent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import rn0.BEChildStudent;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpc4/q7;", "", "<init>", "()V", "Ltn0/f;", "getChildrenStudentsUC", "Le43/a;", "a", "(Ltn0/f;)Le43/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q7 f155643a = new q7();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"pc4/q7$a", "Le43/a;", "Ldx/i;", "Ldx/b;", "", "Lf43/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements e43.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tn0.f f155644a;

        /* JADX INFO: renamed from: pc4.q7$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3859a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155645d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155647f;

            C3859a(tq.e<? super C3859a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155645d = obj;
                this.f155647f |= PKIFailureInfo.systemUnavail;
                return a.this.a(this);
            }
        }

        a(tn0.f fVar) {
            this.f155644a = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // e43.a
        public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<ChildStudent>>> eVar) throws Throwable {
            C3859a c3859a;
            if (eVar instanceof C3859a) {
                c3859a = (C3859a) eVar;
                int i15 = c3859a.f155647f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3859a.f155647f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3859a = new C3859a(eVar);
                }
            } else {
                c3859a = new C3859a(eVar);
            }
            Object objC = c3859a.f155645d;
            Object objE = uq.b.e();
            int i16 = c3859a.f155647f;
            if (i16 == 0) {
                oq.u.b(objC);
                tn0.f fVar = this.f155644a;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                c3859a.f155647f = 1;
                objC = fVar.c(c1792a, c3859a);
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
                arrayList.add(p7.a((BEChildStudent) it.next()));
            }
            return new dx.i.Right(arrayList);
        }
    }

    private q7() {
    }

    public final e43.a a(tn0.f getChildrenStudentsUC) {
        return new a(getChildrenStudentsUC);
    }
}
