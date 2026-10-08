package ng0;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lng0/g;", "", "Lng0/g$a;", "", "Luf0/a;", "documentDownloadInteractor", "Lmg0/b;", "documentsRepository", "<init>", "(Luf0/a;Lmg0/b;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lng0/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Luf0/a;", "b", "Lmg0/b;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uf0.a documentDownloadInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mg0.b documentsRepository;

    /* JADX INFO: renamed from: ng0.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lng0/g$a;", "Lgz/b$a;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        public Params(String str) {
            this.documentId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.documentId, ((Params) other).documentId);
        }

        public int hashCode() {
            return this.documentId.hashCode();
        }

        public String toString() {
            return "Params(documentId=" + this.documentId + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f136035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f136036e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f136037f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f136038g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f136039h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f136040j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f136041k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f136042l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f136043m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f136044n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f136045p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f136047r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f136045p = obj;
            this.f136047r |= PKIFailureInfo.systemUnavail;
            return g.this.d(null, this);
        }
    }

    public g(uf0.a aVar, mg0.b bVar) {
        this.documentDownloadInteractor = aVar;
        this.documentsRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x010d A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #4 {Exception -> 0x0049, blocks: (B:13:0x0044, B:44:0x0107, B:46:0x010d, B:47:0x0114, B:48:0x0169, B:49:0x016a, B:52:0x0179, B:33:0x0099), top: B:67:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0114 A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #4 {Exception -> 0x0049, blocks: (B:13:0x0044, B:44:0x0107, B:46:0x010d, B:47:0x0114, B:48:0x0169, B:49:0x016a, B:52:0x0179, B:33:0x0099), top: B:67:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0114, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        b bVar;
        Object objB;
        int i15;
        int i16;
        ex.b bVar2;
        dx.j<dx.b> jVar;
        Params params2;
        int i17;
        ex.b bVar3;
        ex.b bVar4;
        int i18;
        int i19;
        String str;
        Params params3;
        dx.i iVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f136047r;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f136047r = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objM = bVar.f136045p;
        Object objE = uq.b.e();
        int i26 = bVar.f136047r;
        ?? r15 = 2;
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(objM);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    mg0.b bVar5 = this.documentsRepository;
                    String documentId = params.getDocumentId();
                    bVar.f136035d = params;
                    bVar.f136036e = jVarA;
                    bVar.f136037f = vq.j.a(aVar);
                    bVar.f136038g = aVar;
                    bVar.f136039h = aVar;
                    i17 = 0;
                    bVar.f136040j = 0;
                    bVar.f136041k = 0;
                    bVar.f136042l = 0;
                    bVar.f136043m = 0;
                    bVar.f136044n = 0;
                    bVar.f136047r = 1;
                    objM = bVar5.m(documentId, bVar);
                    if (objM != objE) {
                        jVar = jVarA;
                        params2 = params;
                        i15 = 0;
                        i16 = 0;
                        i19 = 0;
                        bVar3 = aVar;
                        bVar4 = bVar3;
                        bVar2 = bVar4;
                        i18 = 0;
                    }
                    return objE;
                }
                try {
                    if (i26 == 1) {
                        int i27 = bVar.f136044n;
                        i15 = bVar.f136043m;
                        i16 = bVar.f136042l;
                        int i28 = bVar.f136041k;
                        int i29 = bVar.f136040j;
                        ex.b bVar6 = (ex.b) bVar.f136039h;
                        ex.b bVar7 = (ex.b) bVar.f136038g;
                        bVar2 = (ex.b) bVar.f136037f;
                        jVar = (dx.j) bVar.f136036e;
                        params2 = (Params) bVar.f136035d;
                        try {
                            oq.u.b(objM);
                            i17 = i27;
                            bVar3 = bVar7;
                            bVar4 = bVar6;
                            i18 = i29;
                            i19 = i28;
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
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) bVar.f136039h;
                        bVar3 = (ex.b) bVar.f136038g;
                        params3 = (Params) bVar.f136035d;
                        oq.u.b(objM);
                    }
                    iVar = (dx.i) objM;
                    if (!(iVar instanceof dx.i.Right)) {
                        return new dx.i.Right(str);
                    }
                    String str2 = (String) ((dx.i.Right) iVar).b();
                    px.f.f163100a.g("Document: " + params3.getDocumentId() + " is already updating by task: " + str2, px.c.a(this));
                    bVar3.b(new dx.b.Generic(new IllegalStateException("Document: " + params3.getDocumentId() + " is already updating by task: " + str2)));
                    throw new oq.g();
                } catch (CancellationException e18) {
                    throw e18;
                }
                String documentId2 = (String) bVar4.a((dx.i) objM);
                if (documentId2 == null) {
                    documentId2 = params2.getDocumentId();
                }
                uf0.a aVar2 = this.documentDownloadInteractor;
                bVar.f136035d = params2;
                bVar.f136036e = jVar;
                bVar.f136037f = vq.j.a(bVar2);
                bVar.f136038g = bVar3;
                bVar.f136039h = documentId2;
                bVar.f136040j = i18;
                bVar.f136041k = i19;
                bVar.f136042l = i16;
                bVar.f136043m = i15;
                bVar.f136044n = i17;
                bVar.f136047r = 2;
                Object objA = aVar2.a(documentId2, bVar);
                if (objA != objE) {
                    str = documentId2;
                    objM = objA;
                    params3 = params2;
                    iVar = (dx.i) objM;
                    if (!(iVar instanceof dx.i.Right)) {
                        return new dx.i.Right(str);
                    }
                    String str3 = (String) ((dx.i.Right) iVar).b();
                    px.f.f163100a.g("Document: " + params3.getDocumentId() + " is already updating by task: " + str3, px.c.a(this));
                    bVar3.b(new dx.b.Generic(new IllegalStateException("Document: " + params3.getDocumentId() + " is already updating by task: " + str3)));
                    throw new oq.g();
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
