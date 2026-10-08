package e82;

import iy.b0;
import iy.c0;
import mx.Label;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import z72.UserDocumentData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Le82/l;", "Lgz/b;", "Lgz/b$a$a;", "Lz72/c;", "Ly72/a;", "giosContainersInteractor", "<init>", "(Ly72/a;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ly72/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements gz.b<gz.b.a.C1792a, UserDocumentData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y72.a giosContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f48488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f48489e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f48491g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f48489e = obj;
            this.f48491g |= PKIFailureInfo.systemUnavail;
            return l.this.a(null, this);
        }
    }

    public l(y72.a aVar) {
        this.giosContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super UserDocumentData> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f48491g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f48491g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f48489e;
        Object objE = uq.b.e();
        int i16 = aVar.f48491g;
        if (i16 == 0) {
            u.b(objA);
            y72.a aVar2 = this.giosContainersInteractor;
            aVar.f48488d = vq.j.a(c1792a);
            aVar.f48491g = 1;
            objA = aVar2.a(aVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        dx.i iVar = (dx.i) objA;
        if (iVar instanceof dx.i.Left) {
            Label.Companion companion = Label.INSTANCE;
            return new UserDocumentData(c0.g(companion.b().getText()), b0.INSTANCE.a(), c0.g(companion.b().getText()));
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        UserDocumentData userDocumentData = (UserDocumentData) ((dx.i.Right) iVar).b();
        return new UserDocumentData(userDocumentData.getFirstName(), userDocumentData.getSecondName(), userDocumentData.getLastName());
    }
}
