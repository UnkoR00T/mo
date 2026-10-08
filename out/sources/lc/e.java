package lc;

import ad.Size;
import fr.p0;
import fr.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.p;
import mc.m;
import oq.i0;
import oq.t;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.k0;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Llc/e;", "Lad/i;", "Le4/k0;", "<init>", "()V", "Lad/g;", "a", "(Ltq/e;)Ljava/lang/Object;", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "Loq/i0;", "F", "(J)V", "d", "J", "latestConstraints", "", "Ltq/e;", "e", "Ljava/util/List;", "continuations", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements ad.i, k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long latestConstraints = m.g();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<tq.e<i0>> continuations = new ArrayList();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f117744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f117745e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f117747g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f117745e = obj;
            this.f117747g |= PKIFailureInfo.systemUnavail;
            return e.this.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(a2 a2Var, a2.a aVar) {
        a2.a.E(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    public final void F(long constraints) {
        this.latestConstraints = constraints;
        if (c5.b.p(constraints)) {
            return;
        }
        List<tq.e<i0>> list = this.continuations;
        if (list.isEmpty()) {
            return;
        }
        this.continuations = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            tq.e eVar = (tq.e) it.next();
            t.Companion companion = t.INSTANCE;
            eVar.i(t.b(i0.f148189a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, ju.p] */
    @Override // ad.i
    public Object a(tq.e<? super Size> eVar) throws Throwable {
        a aVar;
        p0 p0Var;
        Throwable th4;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f117747g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f117747g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f117745e;
        Object objE = uq.b.e();
        int i16 = aVar.f117747g;
        if (i16 == 0) {
            u.b(obj);
            if (c5.b.p(this.latestConstraints)) {
                p0 p0Var2 = new p0();
                try {
                    aVar.f117744d = p0Var2;
                    aVar.f117747g = 1;
                    ?? pVar = new p(uq.b.c(aVar), 1);
                    pVar.D();
                    p0Var2.f66410a = pVar;
                    this.continuations.add(pVar);
                    Object objX = pVar.x();
                    if (objX == uq.b.e()) {
                        vq.g.c(aVar);
                    }
                    if (objX == objE) {
                        return objE;
                    }
                    p0Var = p0Var2;
                    List<tq.e<i0>> list = this.continuations;
                    w0.a(list).remove(p0Var.f66410a);
                } catch (Throwable th5) {
                    p0Var = p0Var2;
                    th4 = th5;
                    List<tq.e<i0>> list2 = this.continuations;
                    w0.a(list2).remove(p0Var.f66410a);
                    throw th4;
                }
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var = (p0) aVar.f117744d;
            try {
                u.b(obj);
                List<tq.e<i0>> list3 = this.continuations;
                w0.a(list3).remove(p0Var.f66410a);
            } catch (Throwable th6) {
                th4 = th6;
                List<tq.e<i0>> list4 = this.continuations;
                w0.a(list4).remove(p0Var.f66410a);
                throw th4;
            }
        }
        return m.p(this.latestConstraints);
    }

    @Override // p036e4.k0
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        F(j15);
        final a2 a2VarO0 = v0Var.o0(j15);
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: lc.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.D(a2VarO0, (a2.a) obj);
            }
        }, 4, null);
    }
}
