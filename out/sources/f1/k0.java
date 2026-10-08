package f1;

import java.util.List;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0017\u0010&\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lf1/k0;", "Lh1/e1;", "Lf1/j0;", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "", "isVertical", "Lf1/r;", "itemProvider", "Lh1/z0;", "measureScope", "<init>", "(JZLf1/r;Lh1/z0;Lfr/k;)V", "", "index", "lane", "span", "d", "(IIIJ)Lf1/j0;", "e", "(IJ)Lf1/j0;", "Loq/i0;", "j", "(I)V", "", "key", CMSAttributeTableGenerator.CONTENT_TYPE, "", "Le4/a2;", "placeables", "c", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Lf1/j0;", "b", "Lf1/r;", "Lh1/z0;", "J", "g", "()J", "childConstraints", "Lh1/r0;", "i", "()Lh1/r0;", "keyIndexMap", "Lr0/o;", "h", "()Lr0/o;", "headerIndexes", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class k0 extends p056h1.e1<j0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r itemProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p056h1.z0 measureScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long childConstraints;

    public /* synthetic */ k0(long j15, boolean z15, r rVar, p056h1.z0 z0Var, fr.k kVar) {
        this(j15, z15, rVar, z0Var);
    }

    public static /* synthetic */ j0 f(k0 k0Var, int i15, long j15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i16 & 2) != 0) {
            j15 = k0Var.childConstraints;
        }
        return k0Var.e(i15, j15);
    }

    public abstract j0 c(int index, Object key, Object contentType, List<? extends a2> placeables, long constraints);

    @Override // p056h1.e1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public j0 a(int index, int lane, int span, long constraints) {
        return e(index, constraints);
    }

    public final j0 e(int index, long constraints) {
        return c(index, this.itemProvider.d(index), this.itemProvider.f(index), b(this.measureScope, index, constraints), constraints);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    public final r0.o h() {
        return this.itemProvider.e();
    }

    public final p056h1.r0 i() {
        return this.itemProvider.b();
    }

    public final void j(int index) {
        if (index < 0 || index >= this.itemProvider.a()) {
            return;
        }
        this.measureScope.u2(index);
    }

    private k0(long j15, boolean z15, r rVar, p056h1.z0 z0Var) {
        this.itemProvider = rVar;
        this.measureScope = z0Var;
        this.childConstraints = c5.c.b(0, z15 ? c5.b.l(j15) : Integer.MAX_VALUE, 0, z15 ? Integer.MAX_VALUE : c5.b.k(j15), 5, null);
    }
}
