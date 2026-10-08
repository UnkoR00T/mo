package id;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d extends g<Float> {
    public d(List<ud.a<Float>> list) {
        super(list);
    }

    public float r() {
        return s(b(), d());
    }

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
    float s(ud.a<Float> aVar, float f15) {
        float f16;
        if (aVar.f197576b == null || aVar.f197577c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ud.c<A> cVar = this.f90958e;
        if (cVar != 0) {
            f16 = f15;
            Float f17 = (Float) cVar.b(aVar.f197581g, aVar.f197582h.floatValue(), aVar.f197576b, aVar.f197577c, f16, e(), f());
            if (f17 != null) {
                return f17.floatValue();
            }
        } else {
            f16 = f15;
        }
        return td.j.i(aVar.g(), aVar.d(), f16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // id.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float i(ud.a<Float> aVar, float f15) {
        return Float.valueOf(s(aVar, f15));
    }
}
