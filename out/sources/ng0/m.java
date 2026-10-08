package ng0;

import cg0.SchoolCardDocument;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vf0.MainDocumentPhotoData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lng0/m;", "Leg0/j;", "Leg0/i;", "getOldestSchoolCardUC", "<init>", "(Leg0/i;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Lvf0/e;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Leg0/i;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements eg0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final eg0.i getOldestSchoolCardUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f136063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f136064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f136065f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f136066g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f136067h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f136068j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f136069k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f136070l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f136071m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f136072n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f136073p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f136075r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f136073p = obj;
            this.f136075r |= PKIFailureInfo.systemUnavail;
            return m.this.c(null, this);
        }
    }

    public m(eg0.i iVar) {
        this.getOldestSchoolCardUC = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[Catch: Exception -> 0x003d, c -> 0x0040, CancellationException -> 0x0043, TryCatch #1 {Exception -> 0x003d, blocks: (B:12:0x0039, B:27:0x008d, B:33:0x00be, B:30:0x0094, B:32:0x0098, B:34:0x00ca, B:35:0x00cf, B:42:0x00d9, B:45:0x00e7), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0098 A[Catch: Exception -> 0x003d, c -> 0x0040, CancellationException -> 0x0043, TryCatch #1 {Exception -> 0x003d, blocks: (B:12:0x0039, B:27:0x008d, B:33:0x00be, B:30:0x0094, B:32:0x0098, B:34:0x00ca, B:35:0x00cf, B:42:0x00d9, B:45:0x00e7), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca A[Catch: Exception -> 0x003d, c -> 0x0040, CancellationException -> 0x0043, TryCatch #1 {Exception -> 0x003d, blocks: (B:12:0x0039, B:27:0x008d, B:33:0x00be, B:30:0x0094, B:32:0x0098, B:34:0x00ca, B:35:0x00cf, B:42:0x00d9, B:45:0x00e7), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, MainDocumentPhotoData>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.b bVar;
        Object right;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f136075r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f136075r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f136073p;
        ?? E = uq.b.e();
        int i16 = aVar.f136075r;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar.f136067h;
                    try {
                        oq.u.b(obj);
                        right = (dx.i) obj;
                        if (!(right instanceof dx.i.Left)) {
                            if (right instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            SchoolCardDocument schoolCardDocument = (SchoolCardDocument) ((dx.i.Right) right).b();
                            right = new dx.i.Right(new MainDocumentPhotoData(schoolCardDocument.getScopeData().getContainer().getPicture(), schoolCardDocument.getDocumentId(), schoolCardDocument.getScopeName()));
                        }
                        return new dx.i.Right((MainDocumentPhotoData) bVar.a(right));
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                oq.u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar2 = new ex.a();
                    eg0.i iVar = this.getOldestSchoolCardUC;
                    gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                    aVar.f136063d = vq.j.a(c1792a);
                    aVar.f136064e = jVarA;
                    aVar.f136065f = vq.j.a(aVar2);
                    aVar.f136066g = vq.j.a(aVar2);
                    aVar.f136067h = aVar2;
                    aVar.f136068j = 0;
                    aVar.f136069k = 0;
                    aVar.f136070l = 0;
                    aVar.f136071m = 0;
                    aVar.f136072n = 0;
                    aVar.f136075r = 1;
                    Object objC = iVar.c(c1792a2, aVar);
                    if (objC == E) {
                        return E;
                    }
                    obj = objC;
                    bVar = aVar2;
                    right = (dx.i) obj;
                    if (!(right instanceof dx.i.Left)) {
                        if (right instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        SchoolCardDocument schoolCardDocument2 = (SchoolCardDocument) ((dx.i.Right) right).b();
                        right = new dx.i.Right(new MainDocumentPhotoData(schoolCardDocument2.getScopeData().getContainer().getPicture(), schoolCardDocument2.getDocumentId(), schoolCardDocument2.getScopeName()));
                    }
                    return new dx.i.Right((MainDocumentPhotoData) bVar.a(right));
                } catch (ex.c e17) {
                    e = e17;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    e = e19;
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
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
