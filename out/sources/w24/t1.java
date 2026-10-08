package w24;

import f24.Document;
import i24.WruDocumentData;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw24/t1;", "Lw24/s1;", "Lv24/b;", "documentsContainerRepository", "<init>", "(Lv24/b;)V", "Lw24/s1$a;", "params", "Ldx/i;", "Ldx/b;", "Li24/b1;", "d", "(Lw24/s1$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/b;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t1 implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209938g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209939h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209940j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f209941k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f209942l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209943m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209944n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f209945p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f209946q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f209947r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f209949t;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209947r = obj;
            this.f209949t |= PKIFailureInfo.systemUnavail;
            return t1.this.c(null, this);
        }
    }

    public t1(v24.b bVar) {
        this.documentsContainerRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(s1.Params params, tq.e<? super dx.i<? extends dx.b, WruDocumentData>> eVar) throws Throwable {
        a aVar;
        Object objB;
        int i15;
        int i16;
        s1.Params params2;
        int i17;
        dx.j<dx.b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b aVar2;
        int i18;
        int i19;
        ex.b bVar3;
        List list;
        Object next;
        String documentId;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f209949t;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209949t = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objX = aVar.f209947r;
        Object objE = uq.b.e();
        ?? r15 = aVar.f209949t;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objX);
                    jVarA = xw.c.f221622a.a();
                    aVar2 = new ex.a();
                    v24.b bVar4 = this.documentsContainerRepository;
                    aVar.f209935d = params;
                    aVar.f209936e = jVarA;
                    aVar.f209937f = vq.j.a(aVar2);
                    aVar.f209938g = aVar2;
                    aVar.f209939h = aVar2;
                    i17 = 0;
                    aVar.f209942l = 0;
                    aVar.f209943m = 0;
                    aVar.f209944n = 0;
                    aVar.f209945p = 0;
                    aVar.f209946q = 0;
                    aVar.f209949t = 1;
                    objX = bVar4.a(aVar);
                    if (objX != objE) {
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
                        int i26 = aVar.f209946q;
                        i15 = aVar.f209945p;
                        i16 = aVar.f209944n;
                        int i27 = aVar.f209943m;
                        int i28 = aVar.f209942l;
                        ex.b bVar5 = (ex.b) aVar.f209939h;
                        ex.b bVar6 = (ex.b) aVar.f209938g;
                        ex.b bVar7 = (ex.b) aVar.f209937f;
                        dx.j<dx.b> jVar = (dx.j) aVar.f209936e;
                        params2 = (s1.Params) aVar.f209935d;
                        try {
                            oq.u.b(objX);
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
                        bVar3 = (ex.b) aVar.f209939h;
                        oq.u.b(objX);
                    }
                    return new dx.i.Right((WruDocumentData) bVar3.a((dx.i) objX));
                } catch (CancellationException e18) {
                    throw e18;
                }
                List list2 = (List) bVar2.a((dx.i) objX);
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list = list2;
                        next = null;
                        break;
                    }
                    next = it.next();
                    list = list2;
                    if (((Document) next).getDocumentType() == params2.getDocumentType()) {
                        break;
                    }
                    list2 = list;
                }
                Document document = (Document) next;
                if (document == null || (documentId = document.getDocumentId()) == null) {
                    aVar2.b(new dx.b.Generic(new IllegalStateException("Document with type " + params2.getDocumentType() + " not found")));
                    throw new oq.g();
                }
                v24.b bVar8 = this.documentsContainerRepository;
                aVar.f209935d = vq.j.a(params2);
                aVar.f209936e = jVarA;
                aVar.f209937f = vq.j.a(bVar);
                aVar.f209938g = vq.j.a(aVar2);
                aVar.f209939h = aVar2;
                aVar.f209940j = vq.j.a(list);
                aVar.f209941k = vq.j.a(documentId);
                aVar.f209942l = i18;
                aVar.f209943m = i19;
                aVar.f209944n = i16;
                aVar.f209945p = i15;
                aVar.f209946q = i17;
                aVar.f209949t = 2;
                objX = bVar8.x(documentId, aVar);
                if (objX != objE) {
                    bVar3 = aVar2;
                    return new dx.i.Right((WruDocumentData) bVar3.a((dx.i) objX));
                }
                return objE;
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
