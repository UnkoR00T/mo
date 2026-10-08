package kv0;

import dx.i;
import er.l;
import fv.e0;
import fv0.BEDiplomasToDownload;
import fv0.BEFile;
import ge4.x;
import jv0.GetDiplomaDocumentsToDownloadResponse;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import tq.e;
import vq.j;
import wx.FileContent;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkv0/b;", "Lmv0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Lfv0/c;", "diplomaType", "", "diplomaUuid", "Ldx/i;", "Ldx/b;", "Lfv0/e;", "b", "(Lfv0/c;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lfv0/b;", "diplomaSubtype", "Lfv0/f;", "a", "(Lfv0/c;Lfv0/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lhv0/a;", "Loq/k;", "f", "()Lhv0/a;", "electronicDiplomaApi", "universityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements mv0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k electronicDiplomaApi;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f112821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f112822g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f112824j;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112822g = obj;
            this.f112824j |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: kv0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C2728b extends vq.k implements l<e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112825e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fv0.c f112827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ fv0.b f112828h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f112829j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2728b(fv0.c cVar, fv0.b bVar, String str, e<? super C2728b> eVar) {
            super(1, eVar);
            this.f112827g = cVar;
            this.f112828h = bVar;
            this.f112829j = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112825e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hv0.a aVarF = b.this.f();
            jv0.c cVarH = iv0.a.h(this.f112827g);
            jv0.b bVarG = iv0.a.g(this.f112828h);
            String str = this.f112829j;
            this.f112825e = 1;
            Object objB = aVarF.b(str, cVarH, bVarG, this);
            return objB == objE ? objE : objB;
        }

        public final e<i0> M(e<?> eVar) {
            return b.this.new C2728b(this.f112827g, this.f112828h, this.f112829j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super x<e0>> eVar) {
            return ((C2728b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112832f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f112834h;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112832f = obj;
            this.f112834h |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljv0/d;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<e<? super x<GetDiplomaDocumentsToDownloadResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112835e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fv0.c f112837g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f112838h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(fv0.c cVar, String str, e<? super d> eVar) {
            super(1, eVar);
            this.f112837g = cVar;
            this.f112838h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112835e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hv0.a aVarF = b.this.f();
            jv0.c cVarH = iv0.a.h(this.f112837g);
            String str = this.f112838h;
            this.f112835e = 1;
            Object objA = aVarF.a(str, cVarH, this);
            return objA == objE ? objE : objA;
        }

        public final e<i0> M(e<?> eVar) {
            return b.this.new d(this.f112837g, this.f112838h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super x<GetDiplomaDocumentsToDownloadResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.electronicDiplomaApi = oq.l.a(new er.a() { // from class: kv0.a
            @Override // er.a
            public final Object a() {
                return b.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hv0.a e(w wVar) {
        return (hv0.a) w.b(wVar, null, hv0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hv0.a f() {
        return (hv0.a) this.electronicDiplomaApi.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mv0.a
    public Object a(fv0.c cVar, fv0.b bVar, String str, e<? super i<? extends dx.b, BEFile>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f112824j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f112824j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f112822g;
        Object objE = uq.b.e();
        int i16 = aVar.f112824j;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C2728b c2728b = new C2728b(cVar, bVar, str, null);
            aVar.f112819d = j.a(cVar);
            aVar.f112820e = j.a(bVar);
            aVar.f112821f = j.a(str);
            aVar.f112824j = 1;
            objB = g0Var.b(c2728b, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(new BEFile(new FileContent(((e0) ((i.Right) iVar).b()).h())));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mv0.a
    public Object b(fv0.c cVar, String str, e<? super i<? extends dx.b, BEDiplomasToDownload>> eVar) throws Throwable {
        c cVar2;
        if (eVar instanceof c) {
            cVar2 = (c) eVar;
            int i15 = cVar2.f112834h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f112834h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar2 = new c(eVar);
            }
        } else {
            cVar2 = new c(eVar);
        }
        Object objB = cVar2.f112832f;
        Object objE = uq.b.e();
        int i16 = cVar2.f112834h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(cVar, str, null);
            cVar2.f112830d = j.a(cVar);
            cVar2.f112831e = j.a(str);
            cVar2.f112834h = 1;
            objB = g0Var.b(dVar, cVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return iv0.a.c((GetDiplomaDocumentsToDownloadResponse) ((i.Right) iVar).b());
        }
        throw new p();
    }
}
