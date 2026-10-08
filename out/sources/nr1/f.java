package nr1;

import fy.Page;
import java.util.List;
import ju.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lnr1/f;", "Lv00/a;", "Lnr1/a;", "Lnr1/e;", "Lju/p0;", "scope", "Lnr1/b;", "dataSource", "<init>", "(Lju/p0;Lnr1/b;)V", "Lfy/b;", "pageIndex", "Ldx/i;", "Ldx/b;", "Lfy/a;", "e", "(Lfy/b;Ltq/e;)Ljava/lang/Object;", "b", "Lju/p0;", "f", "()Lju/p0;", "c", "Lnr1/b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends v00.a<Cheese> implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b dataSource;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f137890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f137891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f137892f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f137894h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f137892f = obj;
            this.f137894h |= PKIFailureInfo.systemUnavail;
            return f.this.e(null, this);
        }
    }

    public f(p0 p0Var, b bVar) {
        this.scope = p0Var;
        this.dataSource = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v00.a
    public Object e(fy.b bVar, tq.e<? super dx.i<? extends dx.b, Page<Cheese>>> eVar) throws Throwable {
        a aVar;
        String pageId;
        fy.b nextPage;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f137894h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f137894h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f137892f;
        Object objE = uq.b.e();
        int i16 = aVar.f137894h;
        if (i16 == 0) {
            oq.u.b(objA);
            if (fr.t.c(bVar, fy.b.a.f68798a)) {
                pageId = "1";
            } else if (bVar instanceof fy.b.NextPage) {
                pageId = ((fy.b.NextPage) bVar).getPageId();
            } else {
                if (!fr.t.c(bVar, fy.b.c.f68800a)) {
                    throw new oq.p();
                }
                pageId = com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1;
            }
            b bVar2 = this.dataSource;
            aVar.f137890d = vq.j.a(bVar);
            aVar.f137891e = vq.j.a(pageId);
            aVar.f137894h = 1;
            objA = bVar2.a(pageId, aVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objA);
        }
        dx.i iVar = (dx.i) objA;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        b.MockPage mockPage = (b.MockPage) ((dx.i.Right) iVar).b();
        List<Cheese> listA = mockPage.a();
        String nextPageId = mockPage.getNextPageId();
        if (fr.t.c(nextPageId, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1)) {
            nextPage = fy.b.c.f68800a;
        } else {
            nextPage = fr.t.c(nextPageId, "1") ? fy.b.a.f68798a : new fy.b.NextPage(mockPage.getNextPageId());
        }
        return new dx.i.Right(new Page(listA, nextPage));
    }

    @Override // v00.a
    /* JADX INFO: renamed from: f, reason: from getter */
    public p0 getScope() {
        return this.scope;
    }
}
