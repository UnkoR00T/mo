package b44;

import dx.i;
import fr0.BEDocumentConfigLabel;
import fr0.DocumentConfig;
import java.util.List;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb44/e;", "Lr34/e;", "Lr34/c;", "getSavedDocumentConfigUseCase", "Lr34/a;", "getDocumentConfigLabelUC", "<init>", "(Lr34/c;Lr34/a;)V", "Lr34/e$b;", "params", "", "d", "(Lr34/e$b;Ltq/e;)Ljava/lang/Object;", "a", "Lr34/c;", "b", "Lr34/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements r34.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r34.c getSavedDocumentConfigUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r34.a getDocumentConfigLabelUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16543a;

        static {
            int[] iArr = new int[r34.e.a.values().length];
            try {
                iArr[r34.e.a.ShortName.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r34.e.a.LongName.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16543a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f16544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f16545e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f16547g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f16545e = obj;
            this.f16547g |= PKIFailureInfo.systemUnavail;
            return e.this.c(null, this);
        }
    }

    public e(r34.c cVar, r34.a aVar) {
        this.getSavedDocumentConfigUseCase = cVar;
        this.getDocumentConfigLabelUC = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(r34.e.Params params, tq.e<? super String> eVar) throws Throwable {
        b bVar;
        List<BEDocumentConfigLabel> listJ;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f16547g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f16547g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f16545e;
        Object objE = uq.b.e();
        int i16 = bVar.f16547g;
        if (i16 == 0) {
            u.b(objC);
            r34.c cVar = this.getSavedDocumentConfigUseCase;
            r34.c.Params params2 = new r34.c.Params(params.getDocumentType());
            bVar.f16544d = params;
            bVar.f16547g = 1;
            objC = cVar.c(params2, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (r34.e.Params) bVar.f16544d;
            u.b(objC);
        }
        DocumentConfig documentConfig = (DocumentConfig) ((i) objC).a();
        if (documentConfig == null) {
            return null;
        }
        r34.a aVar = this.getDocumentConfigLabelUC;
        int i17 = a.f16543a[params.getField().ordinal()];
        if (i17 == 1) {
            listJ = documentConfig.j();
        } else {
            if (i17 != 2) {
                throw new p();
            }
            listJ = documentConfig.g();
        }
        return aVar.a(new r34.a.Params(listJ));
    }
}
