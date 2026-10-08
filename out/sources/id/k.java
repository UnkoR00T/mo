package id;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class k extends g<PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f90989i;

    public k(List<ud.a<PointF>> list) {
        super(list);
        this.f90989i = new PointF();
    }

    @Override // id.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(ud.a<PointF> aVar, float f15) {
        return j(aVar, f15, f15, f15);
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF j(ud.a<PointF> aVar, float f15, float f16, float f17) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f197576b;
        if (pointF3 == null || (pointF = aVar.f197577c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        ud.c<A> cVar = this.f90958e;
        if (cVar != 0 && (pointF2 = (PointF) cVar.b(aVar.f197581g, aVar.f197582h.floatValue(), pointF4, pointF5, f15, e(), f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f90989i;
        float f18 = pointF4.x;
        float f19 = f18 + (f16 * (pointF5.x - f18));
        float f25 = pointF4.y;
        pointF6.set(f19, f25 + (f17 * (pointF5.y - f25)));
        return this.f90989i;
    }
}
