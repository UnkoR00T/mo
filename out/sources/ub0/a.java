package ub0;

import bc0.DocumentPhotoData;
import bg0.FamilyCardDocument;
import bg0.FamilyCardScope;
import bg0.FamilyDataContainer;
import df0.n;
import dx.i;
import eg0.h;
import eg0.j;
import java.util.ArrayList;
import java.util.List;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import tq.e;
import vf0.MainDocumentPhotoData;
import vf0.MnemonicHeaderContainer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130\u000eH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0017\u0010\u0012J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0018\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0019\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lub0/a;", "Lwb0/a;", "Leg0/h;", "getFamilyCardUC", "Leg0/d;", "deleteDocumentByIDUC", "Leg0/j;", "getPhotoFromMainDocumentUC", "Ldf0/n;", "requestDocumentUpdateUC", "<init>", "(Leg0/h;Leg0/d;Leg0/j;Ldf0/n;)V", "", "documentId", "Ldx/i;", "Ldx/b;", "Lvb0/c;", "f", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lbc0/b;", "a", "(Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "b", "updatedParentDocumentId", "c", "Leg0/h;", "Leg0/d;", "Leg0/j;", "d", "Ldf0/n;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements wb0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h getFamilyCardUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final eg0.d deleteDocumentByIDUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j getPhotoFromMainDocumentUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n requestDocumentUpdateUC;

    /* JADX INFO: renamed from: ub0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5129a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f197211a;

        static {
            int[] iArr = new int[vf0.c.values().length];
            try {
                iArr[vf0.c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vf0.c.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vf0.c.TO_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f197211a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f197212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f197213e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f197215g;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f197213e = obj;
            this.f197215g |= PKIFailureInfo.systemUnavail;
            return a.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f197216d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f197218f;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f197216d = obj;
            this.f197218f |= PKIFailureInfo.systemUnavail;
            return a.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f197219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f197220e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f197222g;

        d(e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f197220e = obj;
            this.f197222g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(h hVar, eg0.d dVar, j jVar, n nVar) {
        this.getFamilyCardUC = hVar;
        this.deleteDocumentByIDUC = dVar;
        this.getPhotoFromMainDocumentUC = jVar;
        this.requestDocumentUpdateUC = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // wb0.a
    public Object a(e<? super i<? extends dx.b, DocumentPhotoData>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f197218f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f197218f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f197216d;
        Object objE = uq.b.e();
        int i16 = cVar.f197218f;
        if (i16 == 0) {
            u.b(objC);
            j jVar = this.getPhotoFromMainDocumentUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            cVar.f197218f = 1;
            objC = jVar.c(c1792a, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        MainDocumentPhotoData mainDocumentPhotoData = (MainDocumentPhotoData) ((i.Right) iVar).b();
        return new i.Right(new DocumentPhotoData(mainDocumentPhotoData.getPhoto(), mainDocumentPhotoData.getDocumentId(), mainDocumentPhotoData.getScopeName()));
    }

    @Override // wb0.a
    public Object b(String str, e<? super i<? extends dx.b, i0>> eVar) {
        return this.deleteDocumentByIDUC.c(new eg0.d.Params(str), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // wb0.a
    public Object c(String str, e<? super i<? extends dx.b, String>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f197222g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f197222g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f197220e;
        Object objE = uq.b.e();
        int i16 = dVar.f197222g;
        if (i16 == 0) {
            u.b(objC);
            n nVar = this.requestDocumentUpdateUC;
            n.Params params = new n.Params(cf0.c.FAMILY_CARD, str);
            dVar.f197219d = vq.j.a(str);
            dVar.f197222g = 1;
            objC = nVar.c(params, dVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(((n.Response) ((i.Right) iVar).b()).getDocumentToGenerateId());
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // wb0.a
    public Object f(String str, e<? super i<? extends dx.b, vb0.c>> eVar) throws Throwable {
        b bVar;
        vb0.a aVar;
        String str2 = str;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f197215g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f197215g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f197213e;
        Object objE = uq.b.e();
        int i16 = bVar.f197215g;
        if (i16 == 0) {
            u.b(objC);
            h hVar = this.getFamilyCardUC;
            h.Params params = new h.Params(str2);
            bVar.f197212d = str2;
            bVar.f197215g = 1;
            objC = hVar.c(params, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) bVar.f197212d;
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return new i.Left((dx.b) ((i.Left) iVar).b());
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List<FamilyCardDocument> listA = ((bg0.b) ((i.Right) iVar).b()).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (FamilyCardDocument familyCardDocument : listA) {
            String documentId = familyCardDocument.getDocumentId();
            int i17 = C5129a.f197211a[familyCardDocument.getDocumentStatus().ordinal()];
            if (i17 == 1) {
                aVar = vb0.a.ACTIVE;
            } else if (i17 == 2) {
                aVar = vb0.a.INACTIVE;
            } else {
                if (i17 != 3) {
                    throw new p();
                }
                aVar = vb0.a.TO_UPDATE;
            }
            String scopeName = familyCardDocument.getScopeName();
            FamilyCardScope scopeData = familyCardDocument.getScopeData();
            MnemonicHeaderContainer header = scopeData.getHeader();
            vb0.MnemonicHeaderContainer mnemonicHeaderContainer = new vb0.MnemonicHeaderContainer(header.getTp(), header.getVer(), header.getDn(), header.getSn(), header.getIsr(), header.getTs(), header.getIid(), header.getPe(), header.getStp(), header.getRId(), header.getIn(), header.getId());
            FamilyDataContainer data = scopeData.getData();
            arrayList.add(new vb0.FamilyCardDocument(documentId, aVar, scopeName, new vb0.FamilyCardScope(mnemonicHeaderContainer, new vb0.FamilyDataContainer(data.getOt(), data.getCh(), data.getN(), data.getS(), data.getSu(), data.getP(), data.getIcn(), data.getNo(), data.getED()))));
        }
        return new i.Right(new vb0.c(str2, arrayList));
    }
}
