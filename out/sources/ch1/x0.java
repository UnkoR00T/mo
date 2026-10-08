package ch1;

import ah1.DocumentsSequenceOrder;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lch1/x0;", "Lch1/w0;", "Lbh1/b;", "repository", "<init>", "(Lbh1/b;)V", "Lch1/w0$a;", "params", "Loq/i0;", "d", "(Lch1/w0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbh1/b;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bh1.b repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f27098e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f27100g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f27098e = obj;
            this.f27100g |= PKIFailureInfo.systemUnavail;
            return x0.this.c(null, this);
        }
    }

    public x0(bh1.b bVar) {
        this.repository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(w0.Params params, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f27100g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f27100g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f27098e;
        Object objE = uq.b.e();
        int i16 = aVar.f27100g;
        if (i16 == 0) {
            oq.u.b(obj);
            bh1.b bVar = this.repository;
            DocumentsSequenceOrder documentsSequenceOrder = params.getDocumentsSequenceOrder();
            aVar.f27097d = vq.j.a(params);
            aVar.f27100g = 1;
            if (bVar.c(documentsSequenceOrder, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return oq.i0.f148189a;
    }
}
