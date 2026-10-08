package id;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j extends g<PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f90984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f90985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f90986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PathMeasure f90987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private i f90988m;

    public j(List<? extends ud.a<PointF>> list) {
        super(list);
        this.f90984i = new PointF();
        this.f90985j = new float[2];
        this.f90986k = new float[2];
        this.f90987l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // id.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(ud.a<PointF> aVar, float f15) {
        float f16;
        i iVar = (i) aVar;
        Path pathK = iVar.k();
        ud.c<A> cVar = this.f90958e;
        if (cVar == 0 || aVar.f197582h == null) {
            f16 = f15;
        } else {
            f16 = f15;
            PointF pointF = (PointF) cVar.b(iVar.f197581g, iVar.f197582h.floatValue(), (PointF) iVar.f197576b, (PointF) iVar.f197577c, e(), f16, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (pathK == null) {
            return aVar.f197576b;
        }
        if (this.f90988m != iVar) {
            this.f90987l.setPath(pathK, false);
            this.f90988m = iVar;
        }
        float length = this.f90987l.getLength();
        float f17 = f16 * length;
        this.f90987l.getPosTan(f17, this.f90985j, this.f90986k);
        PointF pointF2 = this.f90984i;
        float[] fArr = this.f90985j;
        pointF2.set(fArr[0], fArr[1]);
        if (f17 < 0.0f) {
            PointF pointF3 = this.f90984i;
            float[] fArr2 = this.f90986k;
            pointF3.offset(fArr2[0] * f17, fArr2[1] * f17);
        } else if (f17 > length) {
            PointF pointF4 = this.f90984i;
            float[] fArr3 = this.f90986k;
            float f18 = f17 - length;
            pointF4.offset(fArr3[0] * f18, fArr3[1] * f18);
        }
        return this.f90984i;
    }
}
