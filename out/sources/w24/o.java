package w24;

import f24.Document;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lw24/o;", "Lw24/n;", "Lv24/b;", "documentsContainerRepository", "Lk24/a;", "deleteDocumentByIdUC", "<init>", "(Lv24/b;Lk24/a;)V", "Lw24/n$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lw24/n$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/b;", "b", "Lk24/a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k24.a deleteDocumentByIdUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209865f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209866g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209867h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209868j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f209869k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f209870l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209871m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209872n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f209873p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f209874q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f209875r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f209876s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f209878v;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209876s = obj;
            this.f209878v |= PKIFailureInfo.systemUnavail;
            return o.this.c(null, this);
        }
    }

    public o(v24.b bVar, k24.a aVar) {
        this.documentsContainerRepository = bVar;
        this.deleteDocumentByIdUC = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(n.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        a aVar;
        Object objB;
        int i15;
        int i16;
        n.Params params2;
        int i17;
        dx.j<dx.b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b aVar2;
        int i18;
        int i19;
        ex.b bVar3;
        Document document;
        String documentId;
        Object next;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f209878v;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209878v = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f209876s;
        Object objE = uq.b.e();
        ?? r15 = aVar.f209878v;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objC);
                    jVarA = xw.c.f221622a.a();
                    aVar2 = new ex.a();
                    v24.b bVar4 = this.documentsContainerRepository;
                    aVar.f209863d = params;
                    aVar.f209864e = jVarA;
                    aVar.f209865f = vq.j.a(aVar2);
                    aVar.f209866g = aVar2;
                    aVar.f209867h = aVar2;
                    i17 = 0;
                    aVar.f209871m = 0;
                    aVar.f209872n = 0;
                    aVar.f209873p = 0;
                    aVar.f209874q = 0;
                    aVar.f209875r = 0;
                    aVar.f209878v = 1;
                    objC = bVar4.a(aVar);
                    if (objC != objE) {
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
                        int i26 = aVar.f209875r;
                        i15 = aVar.f209874q;
                        i16 = aVar.f209873p;
                        int i27 = aVar.f209872n;
                        int i28 = aVar.f209871m;
                        ex.b bVar5 = (ex.b) aVar.f209867h;
                        ex.b bVar6 = (ex.b) aVar.f209866g;
                        ex.b bVar7 = (ex.b) aVar.f209865f;
                        dx.j<dx.b> jVar = (dx.j) aVar.f209864e;
                        params2 = (n.Params) aVar.f209863d;
                        try {
                            oq.u.b(objC);
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
                        bVar3 = (ex.b) aVar.f209867h;
                        oq.u.b(objC);
                    }
                    bVar3.a((dx.i) objC);
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e18) {
                    throw e18;
                }
                Iterable iterable = (Iterable) bVar2.a((dx.i) objC);
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    Iterator it4 = it;
                    if (((Document) next2).getDocumentType() == params2.getDocumentType()) {
                        arrayList.add(next2);
                    }
                    it = it4;
                }
                Document document2 = (Document) pq.v.n0(arrayList);
                if (document2 != null) {
                    if (document2.getIsChild()) {
                        Iterator it5 = arrayList.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                document = document2;
                                next = null;
                                break;
                            }
                            next = it5.next();
                            Document document3 = (Document) next;
                            if (document3.getIsChild()) {
                                document = document2;
                            } else {
                                document = document2;
                                if (document3.getParentCertificateId() == document.getParentCertificateId()) {
                                    break;
                                }
                            }
                            document2 = document;
                            it5 = it5;
                        }
                        Document document4 = (Document) next;
                        if (document4 == null || (documentId = document4.getDocumentId()) == null) {
                            documentId = document.getDocumentId();
                        }
                    } else {
                        document = document2;
                        documentId = document.getDocumentId();
                    }
                    k24.a aVar3 = this.deleteDocumentByIdUC;
                    k24.a.Params params3 = new k24.a.Params(documentId);
                    aVar.f209863d = vq.j.a(params2);
                    aVar.f209864e = jVarA;
                    aVar.f209865f = vq.j.a(bVar);
                    aVar.f209866g = vq.j.a(aVar2);
                    aVar.f209867h = aVar2;
                    aVar.f209868j = vq.j.a(document);
                    aVar.f209869k = vq.j.a(documentId);
                    aVar.f209870l = vq.j.a(arrayList);
                    aVar.f209871m = i18;
                    aVar.f209872n = i19;
                    aVar.f209873p = i16;
                    aVar.f209874q = i15;
                    aVar.f209875r = i17;
                    aVar.f209878v = 2;
                    objC = aVar3.c(params3, aVar);
                    if (objC != objE) {
                        bVar3 = aVar2;
                        bVar3.a((dx.i) objC);
                    }
                    return objE;
                }
                px.f.f163100a.g("No document with type " + params2.getDocumentType() + " found", px.c.a(this));
                return new dx.i.Right(oq.i0.f148189a);
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
