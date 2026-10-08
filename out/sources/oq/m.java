package oq;

import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "Loq/k;", "a", "(Ler/a;)Loq/k;", "Loq/o;", "mode", "b", "(Loq/o;Ler/a;)Loq/k;", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/LazyKt")
public class m {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148193a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f148193a = iArr;
        }
    }

    public static <T> k<T> a(er.a<? extends T> aVar) {
        fr.k kVar = null;
        return new w(aVar, kVar, 2, kVar);
    }

    public static <T> k<T> b(o oVar, er.a<? extends T> aVar) {
        int i15 = a.f148193a[oVar.ordinal()];
        int i16 = 2;
        if (i15 == 1) {
            fr.k kVar = null;
            return new w(aVar, kVar, i16, kVar);
        }
        if (i15 == 2) {
            return new v(aVar);
        }
        if (i15 == 3) {
            return new j0(aVar);
        }
        throw new p();
    }
}
