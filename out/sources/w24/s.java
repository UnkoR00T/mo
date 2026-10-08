package w24;

import f24.Document;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw24/s;", "Lw24/r;", "Lv24/b;", "documentsContainerRepository", "<init>", "(Lv24/b;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "Lf24/i;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lv24/b;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209916g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209917h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f209918j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f209919k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f209920l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209921m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209922n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f209923p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f209925r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209923p = obj;
            this.f209925r |= PKIFailureInfo.systemUnavail;
            return s.this.c(null, this);
        }
    }

    public s(v24.b bVar) {
        this.documentsContainerRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [dx.j, int, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends f24.i>>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        ex.b bVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f209925r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209925r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f209923p;
        Object objE = uq.b.e();
        ?? r15 = aVar.f209925r;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar2 = new ex.a();
                    v24.b bVar3 = this.documentsContainerRepository;
                    aVar.f209913d = vq.j.a(c1792a);
                    aVar.f209914e = jVarA;
                    aVar.f209915f = vq.j.a(aVar2);
                    aVar.f209916g = aVar2;
                    aVar.f209917h = aVar2;
                    aVar.f209918j = 0;
                    aVar.f209919k = 0;
                    aVar.f209920l = 0;
                    aVar.f209921m = 0;
                    aVar.f209922n = 0;
                    aVar.f209925r = 1;
                    Object objA = bVar3.a(aVar);
                    if (objA == objE) {
                        return objE;
                    }
                    bVar = aVar2;
                    obj = objA;
                    bVar2 = bVar;
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) aVar.f209917h;
                    bVar = (ex.b) aVar.f209916g;
                    try {
                        oq.u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                dx.i right = (dx.i) obj;
                if (!(right instanceof dx.i.Left)) {
                    if (!(right instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    List list = (List) ((dx.i.Right) right).b();
                    ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Document) it.next()).getDocumentType());
                    }
                    List listE0 = pq.v.e0(arrayList);
                    if (listE0.isEmpty()) {
                        bVar.b(new dx.b.Generic(new NullPointerException("No added document types found")));
                        throw new oq.g();
                    }
                    right = new dx.i.Right(listE0);
                }
                return new dx.i.Right((List) bVar2.a(right));
            } catch (Exception e16) {
                px.f fVar = px.f.f163100a;
                String message = e16.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e16, px.c.a(r15));
                dx.i iVarA = r15.a(e16);
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
        } catch (ex.c e17) {
            return new dx.i.Left((dx.b) ex.d.a(e17));
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
