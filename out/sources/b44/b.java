package b44;

import dx.i;
import fr0.DocumentConfig;
import fr0.DocumentMaintenanceBreak;
import i34.DocumentMaintenanceBreakError;
import mx.Label;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb44/b;", "Lr34/b;", "Lr34/c;", "getSavedDocumentConfigUseCase", "Lj34/a;", "documentMaintenanceBreakMapper", "<init>", "(Lr34/c;Lj34/a;)V", "Lr34/b$a;", "params", "Lr34/b$b;", "d", "(Lr34/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lr34/c;", "b", "Lj34/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements r34.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r34.c getSavedDocumentConfigUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j34.a documentMaintenanceBreakMapper;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f16531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f16532e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f16534g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f16532e = obj;
            this.f16534g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(r34.c cVar, j34.a aVar) {
        this.getSavedDocumentConfigUseCase = cVar;
        this.documentMaintenanceBreakMapper = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(r34.b.Params params, tq.e<? super r34.b.Result> eVar) throws Throwable {
        a aVar;
        DocumentMaintenanceBreak maintenanceBreak;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f16534g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f16534g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f16532e;
        Object objE = uq.b.e();
        int i16 = aVar.f16534g;
        if (i16 == 0) {
            u.b(objC);
            r34.c cVar = this.getSavedDocumentConfigUseCase;
            r34.c.Params params2 = new r34.c.Params(params.getDocumentType());
            aVar.f16531d = params;
            aVar.f16534g = 1;
            objC = cVar.c(params2, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (r34.b.Params) aVar.f16531d;
            u.b(objC);
        }
        DocumentConfig documentConfig = (DocumentConfig) ((i) objC).a();
        if (documentConfig == null || (maintenanceBreak = documentConfig.getMaintenanceBreak()) == null) {
            return null;
        }
        DocumentMaintenanceBreakError documentMaintenanceBreakError = new DocumentMaintenanceBreakError(this.documentMaintenanceBreakMapper.b(new j34.a.Params(maintenanceBreak, params.a())));
        Label.Companion companion = Label.INSTANCE;
        return new r34.b.Result(new dx.b.Business(documentMaintenanceBreakError, dx.b.f.INFO, companion.c(), null, null, companion.c(), null, 88, null));
    }
}
