package w24;

import f24.Document;
import java.time.LocalDate;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lw24/l0;", "Lw24/k0;", "Lv24/b;", "documentsContainerRepository", "Ls24/d;", "containersMobileInteractor", "<init>", "(Lv24/b;Ls24/d;)V", "Lw24/k0$a;", "params", "Ldx/i;", "Ldx/b;", "Lf24/h;", "d", "(Lw24/k0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/b;", "b", "Ls24/d;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s24.d containersMobileInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209759f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209760g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209761h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209762j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f209763k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f209764l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209765m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209766n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f209767p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f209768q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f209770s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209768q = obj;
            this.f209770s |= PKIFailureInfo.systemUnavail;
            return l0.this.c(null, this);
        }
    }

    public l0(v24.b bVar, s24.d dVar) {
        this.documentsContainerRepository = bVar;
        this.containersMobileInteractor = dVar;
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
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(k0.Params params, tq.e<? super dx.i<? extends dx.b, ? extends f24.h>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        fz.b.OffsetDateTime offsetDateTime;
        LocalDate date;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f209770s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209770s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f209768q;
        Object objE = uq.b.e();
        ?? r15 = aVar.f209770s;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar2 = new ex.a();
                    fz.b.OffsetDateTime offsetDateTimeA = this.containersMobileInteractor.a();
                    v24.b bVar2 = this.documentsContainerRepository;
                    String documentId = params.getDocumentId();
                    aVar.f209757d = vq.j.a(params);
                    aVar.f209758e = jVarA;
                    aVar.f209759f = vq.j.a(aVar2);
                    aVar.f209760g = vq.j.a(aVar2);
                    aVar.f209761h = offsetDateTimeA;
                    aVar.f209762j = aVar2;
                    aVar.f209763k = 0;
                    aVar.f209764l = 0;
                    aVar.f209765m = 0;
                    aVar.f209766n = 0;
                    aVar.f209767p = 0;
                    aVar.f209770s = 1;
                    Object objC = bVar2.c(documentId, aVar);
                    if (objC == objE) {
                        return objE;
                    }
                    obj = objC;
                    bVar = aVar2;
                    offsetDateTime = offsetDateTimeA;
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar.f209762j;
                    offsetDateTime = (fz.b.OffsetDateTime) aVar.f209761h;
                    try {
                        oq.u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                Document document = (Document) bVar.a((dx.i) obj);
                fz.b.LocalDate expirationDate = document.getExpirationDate();
                return new dx.i.Right((expirationDate == null || (date = expirationDate.getDate()) == null || !date.isBefore(offsetDateTime.getDate().toLocalDate())) ? document.getDocumentStatus() : f24.h.EXPIRED);
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
