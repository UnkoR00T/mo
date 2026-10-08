package id;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f extends g<Integer> {
    public f(List<ud.a<Integer>> list) {
        super(list);
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
    int r(ud.a<Integer> aVar, float f15) {
        float f16;
        if (aVar.f197576b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iH = aVar.f197577c == null ? aVar.h() : aVar.e();
        ud.c<A> cVar = this.f90958e;
        if (cVar != 0) {
            f16 = f15;
            Integer num = (Integer) cVar.b(aVar.f197581g, aVar.f197582h.floatValue(), aVar.f197576b, Integer.valueOf(iH), f16, e(), f());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f16 = f15;
        }
        return td.j.j(aVar.h(), iH, f16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // id.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(ud.a<Integer> aVar, float f15) {
        return Integer.valueOf(r(aVar, f15));
    }
}
