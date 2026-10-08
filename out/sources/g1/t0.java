package g1;

import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u007f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u0006H&¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lg1/t0;", "", "", "count", "Lkotlin/Function1;", "key", "Lkotlin/Function2;", "Lg1/x;", "Lg1/c;", "span", CMSAttributeTableGenerator.CONTENT_TYPE, "Lg1/v;", "Loq/i0;", "itemContent", "g", "(ILer/l;Ler/p;Ler/l;Ler/r;)V", "Lg1/l;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface t0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f69437a = new a();

        a() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Object obj) {
            return c(((Number) obj).intValue());
        }

        public final Void c(int i15) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void d(t0 t0Var, int i15, er.l lVar, er.p pVar, er.l lVar2, er.r rVar, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i16 & 2) != 0) {
            lVar = null;
        }
        if ((i16 & 4) != 0) {
            pVar = null;
        }
        if ((i16 & 8) != 0) {
            lVar2 = a.f69437a;
        }
        t0Var.g(i15, lVar, pVar, lVar2, rVar);
    }

    void g(int count, er.l<? super Integer, ? extends Object> key, er.p<? super x, ? super Integer, c> span, er.l<? super Integer, ? extends Object> contentType, er.r<? super v, ? super Integer, ? super p076m2.r, ? super Integer, oq.i0> itemContent);
}
