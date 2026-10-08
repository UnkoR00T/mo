package w24;

import f24.Document;
import i24.DynamicDocumentData;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw24/p0;", "Lw24/o0;", "Lv24/b;", "documentsContainerRepository", "<init>", "(Lv24/b;)V", "Lw24/o0$a;", "params", "Ldx/i;", "Ldx/b;", "Li24/o;", "d", "(Lw24/o0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/b;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209886g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209887h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209888j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f209889k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f209890l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209891m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209892n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f209893p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f209894q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f209896s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209894q = obj;
            this.f209896s |= PKIFailureInfo.systemUnavail;
            return p0.this.c(null, this);
        }
    }

    public p0(v24.b bVar) {
        this.documentsContainerRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(o0.Params params, tq.e<? super dx.i<? extends dx.b, DynamicDocumentData>> eVar) throws Throwable {
        a aVar;
        Object objB;
        int i15;
        int i16;
        o0.Params params2;
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
            int i25 = aVar.f209896s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209896s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f209894q;
        Object objE = uq.b.e();
        ?? r15 = aVar.f209896s;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objD);
                    jVarA = xw.c.f221622a.a();
                    aVar2 = new ex.a();
                    v24.b bVar4 = this.documentsContainerRepository;
                    aVar.f209883d = params;
                    aVar.f209884e = jVarA;
                    aVar.f209885f = vq.j.a(aVar2);
                    aVar.f209886g = aVar2;
                    aVar.f209887h = aVar2;
                    i17 = 0;
                    aVar.f209889k = 0;
                    aVar.f209890l = 0;
                    aVar.f209891m = 0;
                    aVar.f209892n = 0;
                    aVar.f209893p = 0;
                    aVar.f209896s = 1;
                    objD = bVar4.a(aVar);
                    if (objD != objE) {
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
                        int i26 = aVar.f209893p;
                        i15 = aVar.f209892n;
                        i16 = aVar.f209891m;
                        int i27 = aVar.f209890l;
                        int i28 = aVar.f209889k;
                        ex.b bVar5 = (ex.b) aVar.f209887h;
                        ex.b bVar6 = (ex.b) aVar.f209886g;
                        ex.b bVar7 = (ex.b) aVar.f209885f;
                        dx.j<dx.b> jVar = (dx.j) aVar.f209884e;
                        params2 = (o0.Params) aVar.f209883d;
                        try {
                            oq.u.b(objD);
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
                        bVar3 = (ex.b) aVar.f209887h;
                        oq.u.b(objD);
                    }
                    return new dx.i.Right((DynamicDocumentData) bVar3.a((dx.i) objD));
                } catch (CancellationException e18) {
                    throw e18;
                }
                for (Object obj : (Iterable) bVar2.a((dx.i) objD)) {
                    if (((Document) obj).getDocumentType() == params2.getDocumentType()) {
                        String documentId = ((Document) obj).getDocumentId();
                        v24.b bVar8 = this.documentsContainerRepository;
                        aVar.f209883d = vq.j.a(params2);
                        aVar.f209884e = jVarA;
                        aVar.f209885f = vq.j.a(bVar);
                        aVar.f209886g = vq.j.a(aVar2);
                        aVar.f209887h = aVar2;
                        aVar.f209888j = vq.j.a(documentId);
                        aVar.f209889k = i18;
                        aVar.f209890l = i19;
                        aVar.f209891m = i16;
                        aVar.f209892n = i15;
                        aVar.f209893p = i17;
                        aVar.f209896s = 2;
                        objD = bVar8.d(documentId, aVar);
                        if (objD != objE) {
                            bVar3 = aVar2;
                            return new dx.i.Right((DynamicDocumentData) bVar3.a((dx.i) objD));
                        }
                        return objE;
                    }
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
