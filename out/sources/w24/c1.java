package w24;

import f24.Document;
import i24.DynamicMultiDocumentFullData;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw24/c1;", "Lw24/b1;", "Lv24/b;", "documentsContainerRepository", "<init>", "(Lv24/b;)V", "Lw24/b1$a;", "params", "Ldx/i;", "Ldx/b;", "Li24/q;", "d", "(Lw24/b1$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/b;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209537h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209538j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f209539k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f209540l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209541m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209542n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f209543p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f209544q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f209546s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209544q = obj;
            this.f209546s |= PKIFailureInfo.systemUnavail;
            return c1.this.c(null, this);
        }
    }

    public c1(v24.b bVar) {
        this.documentsContainerRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(b1.Params params, tq.e<? super dx.i<? extends dx.b, DynamicMultiDocumentFullData>> eVar) throws Throwable {
        a aVar;
        Object objB;
        int i15;
        int i16;
        b1.Params params2;
        int i17;
        dx.j<dx.b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b aVar2;
        int i18;
        int i19;
        ex.b bVar3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f209546s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209546s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objI = aVar.f209544q;
        Object objE = uq.b.e();
        ?? r15 = aVar.f209546s;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objI);
                    jVarA = xw.c.f221622a.a();
                    aVar2 = new ex.a();
                    v24.b bVar4 = this.documentsContainerRepository;
                    aVar.f209533d = params;
                    aVar.f209534e = jVarA;
                    aVar.f209535f = vq.j.a(aVar2);
                    aVar.f209536g = aVar2;
                    aVar.f209537h = aVar2;
                    i17 = 0;
                    aVar.f209539k = 0;
                    aVar.f209540l = 0;
                    aVar.f209541m = 0;
                    aVar.f209542n = 0;
                    aVar.f209543p = 0;
                    aVar.f209546s = 1;
                    objI = bVar4.a(aVar);
                    if (objI != objE) {
                        params2 = params;
                        i15 = 0;
                        i16 = 0;
                        i19 = 0;
                        i18 = 0;
                        bVar2 = aVar2;
                        bVar = bVar2;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = aVar.f209543p;
                        i15 = aVar.f209542n;
                        i16 = aVar.f209541m;
                        int i27 = aVar.f209540l;
                        int i28 = aVar.f209539k;
                        ex.b bVar5 = (ex.b) aVar.f209537h;
                        ex.b bVar6 = (ex.b) aVar.f209536g;
                        ex.b bVar7 = (ex.b) aVar.f209535f;
                        dx.j<dx.b> jVar = (dx.j) aVar.f209534e;
                        params2 = (b1.Params) aVar.f209533d;
                        try {
                            oq.u.b(objI);
                            i17 = i26;
                            jVarA = jVar;
                            bVar = bVar7;
                            bVar2 = bVar5;
                            aVar2 = bVar6;
                            i18 = i28;
                            i19 = i27;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            dx.i iVarA = r15.a(e);
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
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar3 = (ex.b) aVar.f209537h;
                        oq.u.b(objI);
                    }
                    return new dx.i.Right((DynamicMultiDocumentFullData) bVar3.a((dx.i) objI));
                } catch (CancellationException e18) {
                    throw e18;
                }
                Iterator it = ((Iterable) bVar2.a((dx.i) objI)).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Document document = (Document) next;
                    Iterator it4 = it;
                    if (document.getDocumentType() == params2.getDocumentType() && !document.getIsChild()) {
                        String documentId = ((Document) next).getDocumentId();
                        v24.b bVar8 = this.documentsContainerRepository;
                        aVar.f209533d = vq.j.a(params2);
                        aVar.f209534e = jVarA;
                        aVar.f209535f = vq.j.a(bVar);
                        aVar.f209536g = vq.j.a(aVar2);
                        aVar.f209537h = aVar2;
                        aVar.f209538j = vq.j.a(documentId);
                        aVar.f209539k = i18;
                        aVar.f209540l = i19;
                        aVar.f209541m = i16;
                        aVar.f209542n = i15;
                        aVar.f209543p = i17;
                        aVar.f209546s = 2;
                        objI = bVar8.I(documentId, aVar);
                        if (objI != objE) {
                            bVar3 = aVar2;
                            return new dx.i.Right((DynamicMultiDocumentFullData) bVar3.a((dx.i) objI));
                        }
                        return objE;
                    }
                    it = it4;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
