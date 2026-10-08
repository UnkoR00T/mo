package o90;

import ie0.UutCardParentDocument;
import me0.DocumentPhotoData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vf0.MainDocumentPhotoData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo90/z0;", "", "<init>", "()V", "Leg0/m;", "getUutCardUC", "Leg0/d;", "deleteDocumentByIDUC", "Leg0/j;", "getPhotoFromMainDocumentUC", "Ldf0/n;", "requestDocumentUpdateUC", "Lhe0/a;", "a", "(Leg0/m;Leg0/d;Leg0/j;Ldf0/n;)Lhe0/a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f143515a = new z0();

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\r\u0010\bJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"o90/z0$a", "Lhe0/a;", "", "documentId", "Ldx/i;", "Ldx/b;", "Lie0/e;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lme0/b;", "a", "(Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "b", "d", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements he0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ eg0.m f143516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ eg0.j f143517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ eg0.d f143518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ df0.n f143519d;

        /* JADX INFO: renamed from: o90.z0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3561a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f143520d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f143522f;

            C3561a(tq.e<? super C3561a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143520d = obj;
                this.f143522f |= PKIFailureInfo.systemUnavail;
                return a.this.a(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143523d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f143524e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f143526g;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143524e = obj;
                this.f143526g |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143527d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f143528e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f143530g;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143528e = obj;
                this.f143530g |= PKIFailureInfo.systemUnavail;
                return a.this.d(null, this);
            }
        }

        a(eg0.m mVar, eg0.j jVar, eg0.d dVar, df0.n nVar) {
            this.f143516a = mVar;
            this.f143517b = jVar;
            this.f143518c = dVar;
            this.f143519d = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // he0.a
        public Object a(tq.e<? super dx.i<? extends dx.b, DocumentPhotoData>> eVar) throws Throwable {
            C3561a c3561a;
            if (eVar instanceof C3561a) {
                c3561a = (C3561a) eVar;
                int i15 = c3561a.f143522f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3561a.f143522f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3561a = new C3561a(eVar);
                }
            } else {
                c3561a = new C3561a(eVar);
            }
            Object objC = c3561a.f143520d;
            Object objE = uq.b.e();
            int i16 = c3561a.f143522f;
            if (i16 == 0) {
                oq.u.b(objC);
                eg0.j jVar = this.f143517b;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                c3561a.f143522f = 1;
                objC = jVar.c(c1792a, c3561a);
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
            MainDocumentPhotoData mainDocumentPhotoData = (MainDocumentPhotoData) ((dx.i.Right) iVar).b();
            return new dx.i.Right(new DocumentPhotoData(mainDocumentPhotoData.getPhoto(), mainDocumentPhotoData.getDocumentId(), mainDocumentPhotoData.getScopeName()));
        }

        @Override // he0.a
        public Object b(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return this.f143518c.c(new eg0.d.Params(str), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // he0.a
        public Object c(String str, tq.e<? super dx.i<? extends dx.b, UutCardParentDocument>> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f143526g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f143526g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f143524e;
            Object objE = uq.b.e();
            int i16 = bVar.f143526g;
            if (i16 == 0) {
                oq.u.b(objC);
                eg0.m mVar = this.f143516a;
                eg0.m.Params params = new eg0.m.Params(str);
                bVar.f143523d = vq.j.a(str);
                bVar.f143526g = 1;
                objC = mVar.c(params, bVar);
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
                return new dx.i.Right(bf0.b.d((dg0.UutCardParentDocument) ((dx.i.Right) iVar).b()));
            }
            throw new oq.p();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // he0.a
        public Object d(String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            c cVar;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f143530g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f143530g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f143528e;
            Object objE = uq.b.e();
            int i16 = cVar.f143530g;
            if (i16 == 0) {
                oq.u.b(objC);
                df0.n nVar = this.f143519d;
                df0.n.Params params = new df0.n.Params(cf0.c.UUT_CARD, str);
                cVar.f143527d = vq.j.a(str);
                cVar.f143530g = 1;
                objC = nVar.c(params, cVar);
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
                return new dx.i.Right(((df0.n.Response) ((dx.i.Right) iVar).b()).getDocumentToGenerateId());
            }
            throw new oq.p();
        }
    }

    private z0() {
    }

    public final he0.a a(eg0.m getUutCardUC, eg0.d deleteDocumentByIDUC, eg0.j getPhotoFromMainDocumentUC, df0.n requestDocumentUpdateUC) {
        return new a(getUutCardUC, getPhotoFromMainDocumentUC, deleteDocumentByIDUC, requestDocumentUpdateUC);
    }
}
