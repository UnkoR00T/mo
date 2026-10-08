package id;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b extends g<Integer> {
    public b(List<ud.a<Integer>> list) {
        super(list);
    }

    public int r() {
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
    public int s(ud.a<Integer> aVar, float f15) {
        float f16;
        Float f17;
        if (aVar.f197576b == null || aVar.f197577c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ud.c<A> cVar = this.f90958e;
        if (cVar == 0 || (f17 = aVar.f197582h) == null) {
            f16 = f15;
        } else {
            f16 = f15;
            Integer num = (Integer) cVar.b(aVar.f197581g, f17.floatValue(), aVar.f197576b, aVar.f197577c, f16, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return td.c.c(td.j.b(f16, 0.0f, 1.0f), aVar.f197576b.intValue(), aVar.f197577c.intValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // id.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer i(ud.a<Integer> aVar, float f15) {
        return Integer.valueOf(s(aVar, f15));
    }
}
