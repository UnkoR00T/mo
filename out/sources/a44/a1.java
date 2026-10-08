package a44;

import jr0.NipipScope;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"La44/a1;", "Lq34/a1;", "Lp34/a;", "repository", "<init>", "(Lp34/a;)V", "Lq34/a1$a;", "params", "Ldx/i;", "Ldx/b;", "Ljr0/j;", "d", "(Lq34/a1$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp34/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a1 implements q34.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p34.a repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2978a;

        static {
            int[] iArr = new int[q34.a1.a.values().length];
            try {
                iArr[q34.a1.a.NURSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q34.a1.a.MIDWIFE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2978a = iArr;
        }
    }

    public a1(p34.a aVar) {
        this.repository = aVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.a1.a aVar, tq.e<? super dx.i<? extends dx.b, NipipScope>> eVar) {
        int i15 = a.f2978a[aVar.ordinal()];
        if (i15 == 1) {
            return this.repository.y(eVar);
        }
        if (i15 == 2) {
            return this.repository.U(eVar);
        }
        throw new oq.p();
    }
}
