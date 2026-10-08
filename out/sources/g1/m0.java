package g1;

import java.util.List;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J_\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lg1/m0;", "Lh1/e1;", "Lg1/l0;", "Lg1/o;", "itemProvider", "Lh1/z0;", "measureScope", "", "defaultMainAxisSpacing", "<init>", "(Lg1/o;Lh1/z0;I)V", "index", "lane", "span", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "d", "(IIIJ)Lg1/l0;", "mainAxisSpacing", "e", "(IJIII)Lg1/l0;", "", "key", CMSAttributeTableGenerator.CONTENT_TYPE, "crossAxisSize", "", "Le4/a2;", "placeables", "c", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)Lg1/l0;", "b", "Lg1/o;", "Lh1/z0;", "I", "Lh1/r0;", "g", "()Lh1/r0;", "keyIndexMap", "Lr0/o;", "f", "()Lr0/o;", "headerIndices", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m0 extends p056h1.e1<l0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o itemProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p056h1.z0 measureScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int defaultMainAxisSpacing;

    public m0(o oVar, p056h1.z0 z0Var, int i15) {
        this.itemProvider = oVar;
        this.measureScope = z0Var;
        this.defaultMainAxisSpacing = i15;
    }

    public abstract l0 c(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends a2> placeables, long constraints, int lane, int span);

    @Override // p056h1.e1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public l0 a(int index, int lane, int span, long constraints) {
        return e(index, constraints, lane, span, this.defaultMainAxisSpacing);
    }

    public final l0 e(int index, long constraints, int lane, int span, int mainAxisSpacing) {
        int iM;
        Object objD = this.itemProvider.d(index);
        Object objF = this.itemProvider.f(index);
        List<a2> listB = b(this.measureScope, index, constraints);
        if (c5.b.j(constraints)) {
            iM = c5.b.n(constraints);
        } else {
            if (!c5.b.i(constraints)) {
                c1.e.a("does not have fixed height");
            }
            iM = c5.b.m(constraints);
        }
        return c(index, objD, objF, iM, mainAxisSpacing, listB, constraints, lane, span);
    }

    public final r0.o f() {
        return this.itemProvider.e();
    }

    public final p056h1.r0 g() {
        return this.itemProvider.b();
    }
}
