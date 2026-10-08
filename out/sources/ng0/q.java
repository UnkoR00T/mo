package ng0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vf0.Document;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lng0/q;", "Leg0/n;", "Lmg0/b;", "documentsRepository", "<init>", "(Lmg0/b;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lmg0/b;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements eg0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mg0.b documentsRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f136080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f136081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f136082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f136083g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f136084h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f136085j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f136086k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f136087l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f136088m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f136089n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f136090p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f136092r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f136090p = obj;
            this.f136092r |= PKIFailureInfo.systemUnavail;
            return q.this.c(null, this);
        }
    }

    public q(mg0.b bVar) {
        this.documentsRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        int i15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i16 = aVar.f136092r;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f136092r = i16 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f136090p;
        ?? E = uq.b.e();
        int i17 = aVar.f136092r;
        boolean z15 = true;
        try {
            try {
                if (i17 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        mg0.b bVar2 = this.documentsRepository;
                        aVar.f136080d = vq.j.a(c1792a);
                        aVar.f136081e = jVarA;
                        aVar.f136082f = vq.j.a(aVar2);
                        aVar.f136083g = vq.j.a(aVar2);
                        aVar.f136084h = aVar2;
                        aVar.f136085j = 0;
                        aVar.f136086k = 0;
                        aVar.f136087l = 0;
                        aVar.f136088m = 0;
                        aVar.f136089n = 0;
                        aVar.f136092r = 1;
                        Object objA = bVar2.a(aVar);
                        if (objA == E) {
                            return E;
                        }
                        obj = objA;
                        bVar = aVar2;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar.f136084h;
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                List list = (List) bVar.a((dx.i) obj);
                if ((list instanceof Collection) && list.isEmpty()) {
                    i15 = 0;
                } else {
                    Iterator it = list.iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        if (((Document) it.next()).getDocumentType() == vf0.d.SCHOOL_CARD && (i15 = i15 + 1) < 0) {
                            pq.v.w();
                        }
                    }
                }
                if (i15 <= 1) {
                    z15 = false;
                }
                return new dx.i.Right(vq.b.a(z15));
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
