package a44;

import fr0.DocumentConfig;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La44/m1;", "Lq34/l1;", "Lr34/c;", "getSavedDocumentConfigUseCase", "<init>", "(Lr34/c;)V", "Lq34/l1$a;", "params", "", "d", "(Lq34/l1$a;Ltq/e;)Ljava/lang/Object;", "a", "Lr34/c;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m1 implements q34.l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r34.c getSavedDocumentConfigUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3137a;

        static {
            int[] iArr = new int[fr0.i.values().length];
            try {
                iArr[fr0.i.BY_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3137a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3139e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3141g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3139e = obj;
            this.f3141g |= PKIFailureInfo.systemUnavail;
            return m1.this.c(null, this);
        }
    }

    public m1(r34.c cVar) {
        this.getSavedDocumentConfigUseCase = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.l1.Params params, tq.e<? super Boolean> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f3141g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f3141g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f3139e;
        Object objE = uq.b.e();
        int i16 = bVar.f3141g;
        if (i16 == 0) {
            oq.u.b(objC);
            r34.c cVar = this.getSavedDocumentConfigUseCase;
            r34.c.Params params2 = new r34.c.Params(params.getDocumentType());
            bVar.f3138d = vq.j.a(params);
            bVar.f3141g = 1;
            objC = cVar.c(params2, bVar);
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
            return vq.b.a(false);
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        DocumentConfig documentConfig = (DocumentConfig) ((dx.i.Right) iVar).b();
        fr0.i documentStoringMode = documentConfig != null ? documentConfig.getDocumentStoringMode() : null;
        return vq.b.a((documentStoringMode == null ? -1 : a.f3137a[documentStoringMode.ordinal()]) == 1);
    }
}
